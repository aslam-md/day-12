package com.codegnan.Arrays;

public class Twodimarray {

	public static void main(String[] args) {
		int[][] arr= { {1,2,3}, {4,5,6} , {7,8} };
		System.out.println("enter the elemnets of 2d array : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
		}
		System.out.println("");
		System.out.println("print using enhanced for loop: ");
		for(int[] row:arr) {
			for(int num:row) {
				System.out.print(num+" ");
			}
		}

	}

}
