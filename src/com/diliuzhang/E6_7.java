package com.diliuzhang;

import java.util.ArrayList;

public class E6_7 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		System.out.println(list);
		list.forEach(obj->System.out.println("迭代集合元素:"+obj));

	}

}
