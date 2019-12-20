package com.diqizhang;

import java.io.File;
import java.util.Arrays;

public class E7_13 {

	public static void main(String[] args) {
		File file=new File("E:\\java代码\\java_base\\src\\com");
		if(file.isDirectory()){
			String[] fileNames=file.list((die,name)->name.endsWith(".txt"));
			Arrays.stream(fileNames).forEach(f->System.out.println(f));
		}

	}

}
