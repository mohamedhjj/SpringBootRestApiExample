package com.websystique.springboot;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class MapTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {
		LinkedHashMap<String, Object> a = new LinkedHashMap<String, Object>();
		LinkedHashMap<String, Object> b = new LinkedHashMap<String, Object>();
		LinkedHashMap<String, Object> c = new LinkedHashMap<String, Object>();
		a.put("v1", "A1");
		a.put("v2", "A2");
		a.put("v3", "A3");
		
		b.put("v1", "B1");
		b.put("v2", "B2");
		b.put("v3", "B3");
		
		c.put("v1", "C1");
		c.put("v2", "C2");
		c.put("v3", "C3");
		
		List<LinkedHashMap<String, Object>> allMap=new ArrayList<LinkedHashMap<String,Object>>();
		allMap.add(a);
		allMap.add(b);
		allMap.add(c);
		System.out.println(allMap);

	}

}
