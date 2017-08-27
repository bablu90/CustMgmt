package com.test.math;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("radhe shyam choudhary");
		// System.out.println(sb);
		// System.out.println(sb.substring(start, end));
		// System.out.println(sb.delete(3, 5));
		// System.out.println(sb);

		NumberToTextConvertor convertor = new NumberToTextConvertor();

		System.out.println("878765456: " + convertor.convert("878765456"));
		System.out.println("87876545: " + convertor.convert("87876545"));
		System.out.println("878765: " + convertor.convert("8787654"));
		System.out.println("878765: " + convertor.convert("878765"));
		System.out.println("87876: " + convertor.convert("87876"));
		System.out.println("8787: " + convertor.convert("8787"));
		System.out.println("878: " + convertor.convert("878"));
		System.out.println("87: " + convertor.convert("87"));
		System.out.println("8: " + convertor.convert("8"));

		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(878765456, convertor.convert("878765456"));
		map.put(87876545, convertor.convert("87876545"));
		map.put(878765, convertor.convert("8787654"));
		map.put(878765, convertor.convert("878765"));
		map.put(87876, convertor.convert("87876"));
		map.put(8787, convertor.convert("8787"));
		map.put(878, convertor.convert("878"));
		map.put(87, convertor.convert("87"));
		map.put(8, convertor.convert("8"));
 		//
		
		map.put(10001, convertor.convert("10001"));
		
		map.put(1254561, convertor.convert("1254561"));
		map.put(101254561, convertor.convert("101254561"));
		map.put(001, convertor.convert("001"));
		
		for (Entry<Integer, String> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}

}
