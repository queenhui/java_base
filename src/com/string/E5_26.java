package com.string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class E5_26 {

	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("Gyyyy年MM月dd日:今天是yyyy年的第D天，E");
		System.out.println(sdf.format(new Date()));
	}

}
