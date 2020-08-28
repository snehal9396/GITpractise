package com.springboot.rest.FileOperations.service;

import static org.apache.commons.io.comparator.LastModifiedFileComparator.LASTMODIFIED_REVERSE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springboot.rest.FileOperations.model.FileDetails;

@Component
public class FileService {

	@Autowired
	FileDetails filedetails;
	// = new FileDetails();

	@Value("${file.errorMessage}")
	String errorMessage;

	@Value("${file.successMessage}")
	String successMessage;

	@Value("${file.emptyMessage}")
	String emptyMessage;

	public String fetchModifiedFilesDesc(int number) throws IOException {

		System.out.println("SourceLocation:" + filedetails.getSrcLocation());
		System.out.println("DestinationLocation:" + filedetails.getDstLocation());

		if ((!filedetails.getSrcLocation().equals("")) && (!filedetails.getDstLocation().equals(""))) {
			if (!filedetails.getSrcLocation().equalsIgnoreCase(filedetails.getDstLocation())) {
				File dir = new File(filedetails.getSrcLocation());
				File[] files = dir.listFiles();

				if ((files != null) && (files.length != 0)) {
					System.out.println("\nSort files in descending order base on last modification date");
					Arrays.sort(files, LASTMODIFIED_REVERSE);

					// Creating Destination directory if not present
					File directory = new File(filedetails.getDstLocation());
					if (!directory.exists()) {
						directory.mkdir();
					}

					for (int i = 0; i < number; i++) {
						System.out.println("files[i]:" + files[i]);
						File file = files[i];
						File fTarget = new File(new File(filedetails.getDstLocation()), file.getName());
						copyFileUsingStream(file, fTarget);

						// fTarget.setReadOnly();
					}

				} else {
					return emptyMessage;
				}

			}
			return successMessage;
		} else {
			return errorMessage;
		}

	}

	private static void copyFileUsingStream(File source, File dest) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} catch (Exception ex) {
			System.out.println("Unable to copy file:" + ex.getMessage());
		} finally {
			try {
				is.close();
				os.close();
			} catch (Exception ex) {
			}
		}
	}

}
