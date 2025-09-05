package com.codegnan.Arrays;

import java.util.Scanner;

public class TwoDuserinput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int r=sc.nextInt();
		System.out.println("enter the number of columns: ");
		int c=sc.nextInt();
		
		int[][] arr=new int[r][c];
		System.out.println("enter the elements: ");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("entert the element at row "+i+" columm "+j+" : ");
			arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("entered elements are : ");
		for(int[] row:arr) {
			for(int num:row) {
		
		System.out.println(num);
			}
			}
	}

}
