package com.diliuzhang;

import java.util.ArrayList;
import java.util.Iterator;

import org.omg.CORBA.PUBLIC_MEMBER;

public class E6_3 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
		Object obj=iterator.next();
		System.out.println(obj);
	}
}


}
