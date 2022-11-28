package com.example;

import java.util.HashSet;
import java.util.Set;

public class DS4_6 {
	public <T> T[] removeDupes(T[] arr) {
		Set<T> s = new HashSet<T>();
		
		for(int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}
		
		return (T[]) s.toArray();
	}
}
