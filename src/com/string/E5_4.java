package com.string;

public class E5_4 {

	public static void main(String[] args) {
		String s="   http :// localhost : 8080    ";
		System.out.println(s);
		System.out.println("去除字符串两端空格后的结果:"+s.trim());
		System.out.println("去除字符串中所有空格后的结果:"+s.replace(" ",""));
		System.out.println("去除字符串中所有空格后的结果:"+s.replaceAll("\\s+",""));
	}

}
