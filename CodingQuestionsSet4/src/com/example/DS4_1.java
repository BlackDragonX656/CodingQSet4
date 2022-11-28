package com.example;

public class DS4_1 {
	public <T> int find(T target, T[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
