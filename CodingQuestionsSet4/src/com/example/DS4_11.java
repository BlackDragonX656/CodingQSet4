package com.example;

import java.util.ArrayList;
import java.util.List;

public class DS4_11 {
	public <T> T[] shallowcopy(T[] arr) {
		return arr.clone();
	}
	
	public <T> T[] deepcopy(T[] arr) {
		List<T> l = new ArrayList<T>();
		for(T t: arr) {
			l.add(t);
		}
		return (T[]) l.toArray();
	}
}
