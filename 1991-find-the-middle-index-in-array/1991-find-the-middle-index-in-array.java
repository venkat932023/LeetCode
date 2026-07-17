class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        int left = 0;
        for (int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        for (int i=0; i<nums.length; i++){
            if ((sum-left-nums[i]) == left){
                return i;
            }
            left = left + nums[i];

        }
        
        return -1;
    }
}