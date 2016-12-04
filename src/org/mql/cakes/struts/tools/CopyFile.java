package org.mql.cakes.struts.tools;

import java.io.File;
import java.io.RandomAccessFile;

public class CopyFile {
	
	private static int idFile = 0;
	
	public static int getIdFile() {
		idFile = idFile + 9;
		return idFile;
	}
	
	public static File copy(File source, String newFile){
		try {
				RandomAccessFile rafRead = new RandomAccessFile(source, "rw");
				File file = new File(newFile);
				RandomAccessFile rafWrite = new RandomAccessFile(file, "rw");
				
				int i;
				while((i=rafRead.read()) != -1){
					rafWrite.write(i);
				}
				rafWrite.close();
				rafRead.close();
				return file;
			} catch (Exception e) {
				System.out.println("error : copy :"+e.getMessage());
			}
		return null;
	}
}
