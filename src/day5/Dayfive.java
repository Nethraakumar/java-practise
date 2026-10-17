package day5;

import java.util.Scanner;

public class Dayfive {
	public static void reArrangeArray(int []arr){
		int i=arr.length-1;;
		int j= arr.length-1;;
		while(i>0) {
			if(arr[i]==-1) {
				i--;
			}
			else {
				arr[j]=arr[i];
				i--;
				j--;
				
			}
		}
		while(j>=0) {
			arr[j]=-1;
			j++;
		}
   }
	
	public static void reArrange(int []arr){
		int i=0;
		int j= 0;
		while(i<arr.length) {
			if(arr[i]==0) {
				i++;
			}
			else {
				arr[j]=arr[i];
				i++;
				j++;
				
			}
		}
		while(j<arr.length) {
			arr[j]=0;
			j++;
		}
   }
	public static void consecutiveSubArray(int[]arr){
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]==1) {
				System.out.print(arr[i]+" ");
			}
			else {
				System.out.print(arr[i]+" ");
				System.out.println();
			}
		}
		System.out.print(arr[arr.length-1]+" ");
	}
	
	public static void consecutiveSubArrayCount(int[]arr){
		int count=1;
		for(int i=0;i<arr.length-1;i++) {
			 count=1;
			if(arr[i+1]-arr[i]==1) {
				count++;
			}
			else {
				System.out.println(count);
			}
		}
		System.out.println(count);
	}
	public static void largestconsecutiveSubArrayCount(int[]arr){
		int max=0;
		int count=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]==1) {
				count++;
			}
			else {
				if(count>max) {
					max=count;
				}
				count=1;
			}
		}
		if(count>max) {
			max=count;
		}
		System.out.println(max);
	}
	public static void largestconsecutiveSubArrayElement(int[]arr){
		int max=0;
		int count=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]==1) {
				count++;
			}
			else {
				if(count>max) {
					max=count;
				}
				count=1;
			}
		}
		if(count>max) {
			max=count;
		}
		System.out.println(max);
	}
		
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		largestconsecutiveSubArrayCount(arr);
		}
}
