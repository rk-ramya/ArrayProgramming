package javaFSD;

import java.util.Scanner;

public class ArrayDuplicates {
	public static void main(String args[])
	{
		int flag=0,arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n=sc.nextInt();
		arr=new int[n];
		for(int i=0;i<arr.length;i++) {
		System.out.println("Enter element no."+(i+1));
		arr[i]=sc.nextInt();
		}
				
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {	
				System.out.println("Duplicated element found : "+arr[i]);
					flag=1;
				}
			
		}
		
	}
		if(flag==0)
			System.out.println("No Duplicates Found!");
		sc.close();
	}
}
