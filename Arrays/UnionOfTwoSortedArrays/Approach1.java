//Given two sorted arrays, find their union

//Example:

   /*
   Input: arr1[] = {1, 3, 4, 5, 7}
            arr2[] = {2, 3, 5, 6} 
    Output: Union : {1, 2, 3, 4, 5, 6, 7} 
             

    Input: arr1[] = {2, 5, 6}
            arr2[] = {4, 6, 8, 10} 
    Output: Union : {2, 4, 5, 6, 8, 10} 
    */
  
  // Time Complexity: O(m+n)
	// Auxiliary Space: O(m+n)

import java.util.*;
public class UnionOfTwoSortedArray 
{
	public static int arrayUnion(int arr1[], int arr2[])
	{
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i] < arr2[j])
			{
				System.out.print(arr1[i++]+ " ");
			}
			else if(arr2[j] < arr1[i])
			{
				System.out.print(arr2[j++] + " ");
			}
			else
			{
				System.out.print(arr1[i++]+" ");
				j++;
			}
		}
		while(i<arr1.length)
		{
			System.out.print(arr1[i++]+ " ");
		}
		while(j<arr2.length)
		{
			System.out.print(arr2[j++] + " ");
		}
		return 0;
	}
	public static void  main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array1: ");
		int size1 = sc.nextInt();
		
		System.out.println("Enter the size of an array2: ");
		int size2 = sc.nextInt();
		
		int arr1[] = new int[size1];
		
		System.out.println("Enter the elements in a array1: ");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Array elements of arr1 are: ");
		for(int i=0 ;i<arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		int arr2[] = new int[size2];
		
		System.out.println("Enter the elements in a array2: ");
		for(int i=0; i<arr2.length; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Array elements of arr2 are: ");
		for(int i=0 ;i<arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		System.out.println("Union of two arrays are: ");
		arrayUnion(arr1, arr2);

	}
}
