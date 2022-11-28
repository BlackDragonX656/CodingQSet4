package com.example;

import java.util.ArrayList;
import java.util.List;

public class DS4_9 {
	public <T> T[] removeOccurences(T[] arr, T target) {
		List<T> l = new ArrayList<T>();
		for(T t: arr) {
			if(t != target) {
				l.add(t);
			}
		}
		return (T[]) l.toArray();
	}
}
