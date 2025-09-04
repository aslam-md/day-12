package com.codegnan.Arrays;

import java.util.Scanner;

public class AverageElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size: ");
		int n=sc.nextInt();
		int sum=0;
		int[] arr=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];	
		}
		int avg=sum/n;
		System.out.println("the average of elements is :"+avg);

	}

}
