package javaFSD;

import java.util.Scanner;

public class ArraySubset {

	
	static boolean checkSubset(int[] a, int[] b) {
		int i,j=0;
		for(i=0;i<b.length;i++) {
			for( j=0;j<a.length;j++) {
				if(b[i]==a[j])
					break;
			}
			if(j==a.length)
				return false;
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		
    	Scanner sc=new Scanner(System.in);
    	int n;
		System.out.println("Enter the size array 1 ");
		int[] a=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++) {
		System.out.println("Enter element no."+(i+1));
		a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of sub-array to be searched ");
		do {
			System.out.println("Note: Size should be less than the Array 1");
			n=sc.nextInt();
		}while(n>a.length);
		
		int[] b=new int[n];
		for(int i=0;i<b.length;i++) {
		System.out.println("Enter element no."+(i+1));
		b[i]=sc.nextInt();
		}
		
		System.out.println("\nMain Array entered:");
    	for(int ele:a)
    		System.out.print(ele+" ");
    	
    	System.out.println("\n\nSub array entered:");
    	for(int ele:b)
    		System.out.print(ele+" ");
    	
    	System.out.println();
    	
		String result= checkSubset(a, b)?"\nThe array 2 is subset of Array 1":
			            "\nThe array 2 is not subset of Array 1";
		System.out.println(result);

		sc.close();
		
	}

}
