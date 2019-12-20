package com.diliuzhang;

import java.util.HashMap;
import java.util.Map;

public class E6_16 {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("1","Jack");
		map.put("2","Rose");
		map.put("3","Lucy");
		System.out.println(map);
		map.forEach((key,value)->System.out.println(key+":"+value));

	}

}
