package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ConactArray {

	public static void main(String[] args) {
	 
		int arr[]=new int[]{1,3,5,7};
		concatArray(arr);
	//	System.out.println(concatArray(arr));

	}
	private static int[] concatArray(int nums[]) {
		
		
		
		List<Integer> listOne =Arrays.stream(nums).boxed().collect(Collectors.toList()); 
	
		List<Integer> listTwo =Arrays.stream(nums).boxed().collect(Collectors.toList());
	
		List<Integer> finalList=new ArrayList<Integer>();
		
		finalList.addAll(listOne);
		finalList.addAll(listTwo);
	
		int[] finalArr=new int[finalList.size()];
		for (int i = 0; i < finalList.size(); i++) {
			finalArr[i]=finalList.get(i);
		}
		
		
		return finalArr;
	}

}
