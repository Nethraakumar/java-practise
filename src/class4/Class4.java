package class4;

import java.util.Scanner;
public class Class4 {
	
	
	public static void differenceOfPair(int []arr, int k){
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]-arr[j]||arr[j]-arr[i]==k) {
					System.out.println(arr[i]+ "" + arr[j]);
				}
			}
		}
	}
	
	public static void printUnique(int[]arr) {
		int count=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				if(count==1) {
					System.out.println(arr[i]);
				}
				count=1;
			}
		}
			if(count == 1) {
				System.out.println(arr[arr.length-1]);
		}
	}
	
	public static void printUniValue(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
			}
	}
		System.out.println(arr[arr.length-1]);
		}
	
	public static void countUniqueValue(int[]arr) {
		int count=0;
		int unicount=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				if(count==1) {
					unicount++;
				}
				count=1;
			}
		}
			if(count == 1) {
				unicount++;
		}
			System.out.println(unicount);
	}
	
	public static int largestReapting(int[] arr) {
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]==arr[i+1]) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void commonElement(int[]arr1, int[]arr2){
		int i=0;
		int j=0;
		int[]res=new int(arr1.length+arr2.length);
		while(i<arr1.length&& j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i]>arr2[j]) {
				j++;
			}
			else {
				i++;
			}
		}
	}
	public static void mergeElement(int[]arr1, int[]arr2) {
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length&&j<arr2.length) {
			if(arr2[j]<arr1[i]) {
				res[k]=arr2[j];
				k++;
				j++;
			}
			else {
				res[k]=arr1[i];
				k++;
				i++;
			}
		}
		while(j<arr2.length) {
			res[k]=arr2[j];
			k++;
			j++;
		}
		while(i<arr1.length) {
			res[k]=arr1[i];
			k++;
			i++;
		}
	}
public static void main(String[]args) { 
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int[]arr1=new int[n1];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		int n2=sc.nextInt();
		int[]arr2=new int[n2];
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}
		int res[]=mergeElement(arr1,arr2);
		for(int i=0;i<arr1.length;i++){
			System.out.println(res[i]);
			}
		}
}
