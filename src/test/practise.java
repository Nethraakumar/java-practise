package test;
import java.util.*;
public class practise {
	public static int reverseNumber(int n){
		int rev=0;
		while(n!=0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		return rev;
	}
	
	public static void plaindromeNumber(int n){
		int rev=0;
		int origi=n;
		while(n!=0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(rev==origi) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
public static void armstrong(int n){
	int cube=0;
	int origi=n;
	while(n!=0) {
		cube=cube+(n%10)*(n%10)*(n%10);
		n=n/10;
	}
	if(cube==origi) {
		System.out.println("Armstrong");
	}
	else {
		System.out.println("Not an armstrong");
	}
}
public static void sumAndProduct(int n){
	int sum=0;
	int prod=1;
	while(n!=0) {
		int digit=n%10;
		sum=sum+digit;
		prod=prod*digit;
		n=n/10;
	}
	System.out.println(sum);
	System.out.println(prod);
}
public static void sumOfevenAndProdOfOdd(int n){
	int sum=0;
	int prod=1;
	for(int i=0;i<=n;i++) {
		int digit=n%10;
		n=n/10;
		if(i%2==0) {
			sum=sum+digit;
		}
		else {
			prod=prod*digit;
		}
	}
	System.out.println(sum);
	System.out.println(prod);
}

public static String primeNum(int n){
	for(int i=2;i*i<=n;i++){
		if(n%i==0) {
			return "Not prime";
		}
	}
	return "prime";
}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String res = primeNum(n);
		System.out.println(res);
		
	}

}