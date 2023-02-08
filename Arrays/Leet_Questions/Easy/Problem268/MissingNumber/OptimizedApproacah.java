class Solution {
    public int missingNumber(int[] nums) 
    {
      int n = nums.length;
      int arr_sum = 0;
      int natural_sum = (n*(n+1))/2;
      for(int i=0 ;i< nums.length; i++)
      {
         arr_sum += nums[i];
      }
      int result = natural_sum - arr_sum;
      return result;
    }
}

--> Time Complexity : O(N)
--> Auxiliary Space : O(1)
