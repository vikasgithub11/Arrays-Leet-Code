package com.test;

import java.util.Arrays;

public class ArrayTestSum {

	public static void main(String[] args) {
        int[] num = new int[]{3, 2, 4,6};
        int target = 6;
        int[] out = getSumArray(num, target);
     //   System.out.println(Arrays.toString(out));
    }

    private static int[] getSumArray(int[] nums, int target) {
     
    
    	int[] newNum = new int[2];
        for(int i = 0; i < nums.length; i++) {
          
        	if (i>=1 ) {
            	if(target==nums[i]+nums[i-1]) {
            		newNum[0]= i-1;
            		newNum[1]= i;
            		System.out.println(Arrays.toString(newNum));
            		break;
            	}
            	
            	
            
            }
        }
     
        return newNum;
    }

}
