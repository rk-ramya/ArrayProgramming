package javaFSD;

import java.io.IOException;
import java.util.Scanner;

public class SelectionSort {  
    
    
    void performSelectionSort(int[] a) {
    	int index;
    	for(int i=0;i<a.length;i++) {
    		index=i;
    		for(int j=i+1;j<a.length;j++) {
    			if(a[j]<a[index])
    				index=j;
    		}
    		
    		int temp=a[i];
    		a[i]=a[index];
    		a[index]=temp;
		    		
    	}
   }
 
    
       
    public static void main(String args[])throws IOException{
    
    	SelectionSort obj=new SelectionSort();
    	int[] a;
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n=sc.nextInt();
		a=new int[n];
		for(int i=0;i<a.length;i++) {
		System.out.println("Enter element no."+(i+1));
		a[i]=sc.nextInt();
		}
    	System.out.println("Array before selection sort:");
    	for(int ele:a)
    		System.out.print(ele+" ");
    		
    	obj.performSelectionSort(a);
    	
    	System.out.println("\nArray after selection sort:");
    	for(int ele:a)
    		System.out.print(ele+" ");
    	sc.close();
    }  
}  