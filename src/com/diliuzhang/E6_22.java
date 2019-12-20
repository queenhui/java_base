package com.diliuzhang;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import com.tc.Test;

public class E6_22 {

	public static void main(String[] args) throws Exception {
		Properties PPs=new Properties();
		PPs.load(new FileInputStream("E:\\java代码\\java_base\\bin\\com\\diliuzhang\\test.properties"));
		PPs.forEach((k,value)->System.out.println(k+"="+value));
		FileOutputStream out=new FileOutputStream("E:\\java代码\\java_base\\bin\\com\\diliuzhang\\test.properties");
		PPs.setProperty("charset","UTF-8");
		PPs.store(out,"新增charset编码");
	}

}
