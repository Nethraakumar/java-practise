package Day4;

import java.util.Scanner;
public class day4 {
	public static int minOfArray(int[]arr){
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static int indexOfArray(int[]arr){
		int max=arr[0];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
			   index =i;
				}
		}
		return index;
		
	}
	
	
	
	
	
	
	
	
	public static int maximumOfArray(int[]arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	
	
	
	
	

	public static int sumOfArray(int[]arr) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
	return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int res=indexOfArray(arr);
		System.out.println(res);
	}

}
