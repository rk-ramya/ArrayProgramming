package javaFSD;

import java.util.Scanner;

public class QuickSort {

	
	int findPartition(int[] a, int low, int high) {
		int pivot= a[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(a[j]<=pivot) {
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		
		return i+1;
	}
	
	
	void performQuickSort(int[] a,int low, int high) {

		if(low<high) {
			int partition= findPartition(a,low,high);
			performQuickSort(a, low, partition-1);
			performQuickSort(a, partition+1,high);
		}
	}
	
	void printArray(int[] a ) {
		for(int ele:a)
			System.out.print(ele+" ");
		System.out.println();
   }
	
	public static void main(String[] args) {
		QuickSort obj=new QuickSort();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
		System.out.println("Enter element no."+(i+1));
		a[i]=sc.nextInt();
		}
		
		System.out.println("Array before Quick sort: ");
		obj.printArray(a);
		
		obj.performQuickSort(a, 0, a.length-1);	
		
		System.out.println("Array after Quick sort: ");
		obj.printArray(a);
		sc.close();
}
}
