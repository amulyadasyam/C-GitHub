package com.Ass2;

import java.util.Arrays;

public class ArrayOperations {

	public int[] arrcpy(int[] arr)
	{
		int[] arr2 = new int[arr.length];
		for(int i=0;i <= arr.length-2; i++)
		{
			arr2[i+1] = arr[i];
		}
		arr2[0] = arr[arr.length-1];
		//{8,10,13,14}
		return arr2;
	}
	
	public double find_median(int[] arr2)
	{
		Arrays.sort(arr2);
		int le = arr2.length;
		int index,index1;
		float median;
		if(le%2 == 1)
		{
			index = (le+1)/2;
			median = arr2[index-1];
			return median;
		}
		else 
		{
			index = le/2;
			index1 = (le/2)+1;
			median = (arr2[index-1]+arr2[index1-1])/2;
			return median;
		}
	}
	public static void main(String[] args) {
		
		ArrayOperations ao = new ArrayOperations();
		int len = args.length;
		int[] arr = new int[len];
		for(int i=0;i<len;i++)
		{
		arr[i]= Integer.parseInt(args[i]);
		}
		int[] arr2 = new int[len];
		arr2 = ao.arrcpy(arr);
		System.out.println("The median is :"+ao.find_median(arr2));
	}

}
