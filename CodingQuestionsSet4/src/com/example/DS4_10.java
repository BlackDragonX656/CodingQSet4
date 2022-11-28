package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DS4_10 {
	public <T> T[] findCommonElements(T[] a, T[] b) {
		Set<T> s = new HashSet<T>();
		List<T> l = new ArrayList<T>();
		for(T t: a) {
			s.add(t);
		}
		
		for(T t: b) {
			if(s.contains(t)) {
				l.add(t);
			}
		}
		
		return (T[]) l.toArray();
	}
}
