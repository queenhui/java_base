package com.diliuzhang;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class E6_17 {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("1","Jack");
		map.put("2","Rose");
		map.put("3","Lucy");
		System.out.println(map);
		Collection value=map.values();
		value.forEach(v->System.out.println(v));

	}

}
