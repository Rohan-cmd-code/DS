//Problem Statement: Given an array, we have to find the largest element in the array.

/*Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. */

/*Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array. */

// Time Complexity : O(n^2)
// Auxiliary Space : O(1)

import java.util.*;
public class Approach1 
{
	public static int largestElement(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			boolean flag = true;
			for(int j = 0; j<arr.length; j++)
			{
				if(arr[j] > arr[i])
				{
					flag = false;
					break;
				}
			}
			if (flag == true)
			{
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of an array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println(largestElement(arr) + " is the largest element in the array");
	}
}
