package com.example;

public class DS4_8 {
	public <T> boolean equals(T[] a, T[] b) {
		if(a.length != b.length) {
			return false;
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
}
