package com.diliuzhang;

import java.util.ArrayList;
import java.util.Iterator;

public class E6_6 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Jack");
		list.add("Annie");
		list.add("Rose");
		list.add("Tom");
		Iterator it=list.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			if("Annie".equals(obj)) {
				it.remove();
			}
		}
		System.out.println(list);
	}

}
