package com.codegnan.Arrays;

import java.util.Scanner;

public class Columnwisesum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows :");
		int rows=sc.nextInt();
		System.out.println("enter the number of cols: ");
		int col=sc.nextInt();
		int[][] arr=new int[rows][col];
		System.out.println("entrer the elements: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int j=0;j<col;j++) {
			int sum=0;
			for(int i=0;i<rows;i++) {
				sum+=arr[i][j];
			}
			System.out.println("Sum of "+j+" column is: "+sum);
		}
		
		
		
		

	}

}
