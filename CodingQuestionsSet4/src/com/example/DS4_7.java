package com.example;

import java.util.ArrayList;
import java.util.List;

public class DS4_7 {
	public <T> T[] merge(T[] a, T[] b) {
		List<T> c = new ArrayList<T>(a.length+b.length);
		for(int i = 0; i < a.length; i++) {
			c.add(a[i]);
		}
		for(int i = 0; i < b.length; i++) {
			c.add(b[i]);
		}
		
		return (T[]) c.toArray();
	}
}
