package com.test;

public class SumArray {

	public static void main(String[] args) {
		
		int arr[]=new int[] {1,3,5,7,9};
		/*
		 * int[] arrNew=new int[arr.length]; int sum=0; for (int i = 0; i < arr.length;
		 * i++) {
		 * 
		 * sum=sum+arr[i]; arrNew[i]=sum; System.out.print(arrNew[i]+",");
		 */
		sumArraayinta(arr);
	}
	
	private static int[] sumArraayinta(int arr[]) {
		
		int[] arrNew=new int[arr.length];
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			arrNew[i]=sum;
			System.out.print(arrNew[i]+",");
		}
		return arrNew;
	}
}
