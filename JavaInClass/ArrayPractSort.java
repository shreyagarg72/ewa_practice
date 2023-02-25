package JavaInClass;

import java.util.*;

public class ArrayPractSort {
//	public static void conquer(int arr , int si ,int mid ,  int ei) {
//		int merger[] = new int[ei-si +1];
//	}
//	public static void divide(int arr , int si , int ei) {
//		int mid = si+ (ei-si)/2;g 
//		
//		
//	}

	public static void main(String[] args) {
		int arr[]= {6,3,9,5,2,8};
		int n= arr.length;
		int temp = 0 ; 
		for(int i =0 ; i<n-1 ; i++) {
			for(int j = i+1 ; j<n;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("the sorted array");
		for(int k = 0 ; k<n;k++) {
			System.out.print(arr[k]+" ");
		}
		

	}

}
