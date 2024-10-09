package com.string;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word-1");
		String s1 = sc.next();
		System.out.println("Enter the word-2");
		String s2 = sc.next();
		
		if(s1.length() == s2.length()) {
			char arr1[] = new char[s1.length()];
			char arr2[] = new char[s2.length()];
			
			for(int i = 0; i < arr1.length; i++) {
				arr1[i] = s1.charAt(i);
				arr2[i] = s2.charAt(i);
			}
			
			arr1 = sortArray(arr1);
			arr2 = sortArray(arr2);
			
			for(int i = 0; i < arr1.length; i++) {
				if(arr1[i] != arr2[i]) {
					System.out.println("The given string are not anagram");
					System.exit(0);
				}
			}
			System.out.println("The given string are anagram");
		}
		
		else {
			System.out.println("The given string are not anagram");
		}
		sc.close();
	
	}

	private static char[] sortArray(char[] arr) {
		
		char temp;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
