package com.diqizhang;

import java.io.File;
import java.io.FileDescriptor;

public class E7_15 {

	public static void main(String[] args) {
		File file=new File("E:\\java代码\\java_base\\src\\com");
		fileDir(file);

	}
	public static void fileDir(File file) {
		File[] listFiles=file.listFiles();
		for(File files:listFiles) {
			if(files.isDirectory()) {
				fileDir(files);
			}
			System.out.println(files);
		}
	}
}
