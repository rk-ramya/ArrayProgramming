package javaFSD;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
		System.out.println("Enter element no."+(i+1));
		arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) 
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		
		System.out.println("Sorted Array: ");
		for(int item:arr)
			System.out.print(item+"\t");
		sc.close();	

	}

}
