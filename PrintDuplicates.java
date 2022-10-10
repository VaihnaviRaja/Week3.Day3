package Week3.Day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		// get the length of the array
		int l=arr.length;
		// declare an int variable named count
		Set<Integer> s= new LinkedHashSet();
		Set<Integer> dup=new LinkedHashSet();
		// iterate from 0 to the array length-1 (outer loop starts here)
		for(int i=0;i<l;i++)
		{
			System.out.println(arr[i]);
			boolean add = s.add(arr[i]);
			if(!add)
			{
				dup.add(arr[i]);
			}
		}
		System.out.println("The Duplicates are: "+dup);
		System.out.println("After removing the duplicates"+s);
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// increase the count if both the arrays are equal
					
			// Out of the inner loop, check and print the first arr

	}

}
