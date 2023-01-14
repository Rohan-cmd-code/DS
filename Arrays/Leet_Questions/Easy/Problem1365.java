Question: Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's 
such that j != i and nums[j] < nums[i]. Return the answer in an array. 

Solution1: 
------------------------------------------------------------------------------********************---------------------------------------------------------------------------------
--> Brute Force Approach

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    { 
        //--> Time Complexity: O(n^2)
        //--> Space Complexity: o(n)
        // Creating an array of size equal to nums.length
        int[] ans = new int[nums.length];    
        for(int i=0; i<nums.length; i++)
        {
            int count=0;
            for(int j=0; j<nums.length; j++)
            {
                if(nums[j] < nums[i])
                {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}

--> Time Complexity: O(n^2)
--> Auxiliary Space: O(n)
------------------------------------------------------------------------------********************---------------------------------------------------------------------------------


