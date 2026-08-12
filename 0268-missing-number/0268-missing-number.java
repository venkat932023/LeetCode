class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
       int m = n*(n+1)/2;
       int sum  = 0;
       for (int i:nums){

        sum = sum + i;
       }
       return m-sum;
    }
}      
    
    
