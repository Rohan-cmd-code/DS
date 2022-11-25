//Given an array, rotate the array to the right by k steps, where k is non-negative.

/*
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/

/*
Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/

// Approach1: 

import java.util.*;
class RotateArrayRight
{
  public static void rotatearray(int nums[], int k)
  {
    int temp = nums[nums.length-1];
    for(int i=nums.length-1; i>0 ;i++)
    {
      nums[i] = nums[i-1];
    }
    nums[0] = temp;
  }
  public void rightrotate(int nums[], int k)
  {
    for(int i=0; i<k; i++)
    {
      roatearray(nums,k);
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array: ");
    int size = sc.nextInt();
    
    //Intiliazing and declaring the size of an array
    int nums[] = new int[size];
    
    //Reading the elements of an array
    for(int i=0; i<nums.length;i++)
    {
      nums[i] = sc.nextInt();
    }
    
    //Printing the elements of an array
    for(int i=0; i<nums.length;i++)
    {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
    
    System.out.println("Enter the number of position to rotate an array: ");
    int k =sc.nextInt();
    
    rotate(arr,k);
		System.out.println("New Array After rotating by K places: ");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
 }
    
    
    
    
