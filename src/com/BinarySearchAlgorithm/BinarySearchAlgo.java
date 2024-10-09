package com.BinarySearchAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

class BinarySearch {
	int arr[];
	int size;
	Scanner sc = new Scanner(System.in);
	
	void createArray() {
		System.out.println("Enter the array size");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Array is created");
		System.out.println("==========================");
	}
	
	void collectData() {
		System.out.println("collecting Array data");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Aray is created");
		Arrays.sort(arr);
		System.out.println("Array is sored");
		System.out.println("=================================");
	}
	
	void binarySearch() {
		int first = 0;
		int last = size - 1;
		int flag = 0;
		System.out.println("Enter the element to be searched : ");
		int key = sc.nextInt();
		while (first <= last) {
			int mid = (first+last)/2;
			if(arr[mid] == key) {
				System.out.println("Element found in position : " + (mid + 1));
				flag++;
				break;
			}
			else if(arr[mid] < key) {
				last = mid - 1;
			}
		}
		if(flag <= 0) {
			System.out.println("Element not found");
		}
	}
	
}

public class BinarySearchAlgo {
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		bs.createArray();
		bs.collectData();
		bs.binarySearch();
	}
}
