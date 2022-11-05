package javaFSD;

import java.util.Scanner;

public class MergeSort {

	void merge(int[] a, int low, int mid, int high) {
		int k=low, n1=mid-low+1,n2=high-mid,i,j;
		int[] left=new int[n1];
		int[] right=new int[n2];
		
		for(i=0;i<n1;i++)
			left[i]=a[low+i];
		for(i=0;i<n2;i++)
			right[i]=a[mid+i+1];
		
		for(i=0,j=0; i<n1&&j<n2;) {
			
			if(left[i]<=right[j]) {
				a[k]=left[i];
				i++;
				k++;
			}
			else {
				a[k]=right[j];
				j++;
				k++;
			}
			
		}
		
		while(i<n1) {
			a[k]=left[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			a[k]=right[j];
			j++;
			k++;
		}
		
	}
	
	
	
	void mergeSort(int[] a, int low, int high) {
		int mid;
		if(low<high) {
			mid=(low+high)/2;
			mergeSort(a, low, mid);
			mergeSort(a, mid+1,high);
			merge(a, low, mid, high);
		}
		
	}
	
	public static void main(String[] args) {
		MergeSort obj=new MergeSort();
		int[] a;
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n=sc.nextInt();
		a=new int[n];
		for(int i=0;i<a.length;i++) {
		System.out.println("Enter element no."+(i+1));
		a[i]=sc.nextInt();
		}
		System.out.println("Array before MERGE sort:");
    	for(int ele:a)
    		System.out.print(ele+" ");
    		
    	obj.mergeSort(a, 0, a.length-1);
    	
    	System.out.println("\nArray after MERGE sort:");
    	for(int ele:a)
    		System.out.print(ele+" ");
    	sc.close();
	}

}
