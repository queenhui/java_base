package com.diqizhang;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class E7_02 {
	public static void main(String[] args) throws Exception {
		FileOutputStream out=new FileOutputStream("d:\\out.txt");
			String str="hello";
			out.write(str.getBytes());
			out.close();
	}
}