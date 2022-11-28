package com.example;

import java.util.ArrayList;
import java.util.List;

public class DS4_12 {
	public <T> T[] rotateRight(T[] arr, int steps) {
		List<T> l = new ArrayList<T>(arr.length);
		T[] newarr = (T[]) l.toArray();
		for(int i = 0; i < arr.length; i++) {
			newarr[(i+steps) % arr.length] = arr[i];
		}
		return newarr;
	}
	
	public <T> T[] rotateLeft(T[] arr, int steps) {
		List<T> l = new ArrayList<T>(arr.length);
		T[] newarr = (T[]) l.toArray();
		for(int i = 0; i < arr.length; i++) {
			newarr[(i-steps) % arr.length] = arr[i];
		}
		return newarr;
	}
}
