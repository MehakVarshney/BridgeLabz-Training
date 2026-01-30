package com.junit.practice.junitTesting;

public class StringUtils {
	public String reverse (String str) {
		return new StringBuilder(str).reverse().toString();
	}
	public boolean isPalindrome(String str) {
		return str.equals(reverse(str));
	}
	public String toUpperCase(String str) {
		return str.toUpperCase();
	}
}
