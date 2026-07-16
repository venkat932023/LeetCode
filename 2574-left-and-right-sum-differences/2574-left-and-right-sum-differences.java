class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0;
        int sum = 0;
        for (int i=0; i<nums.length; i++){
            sum = sum+nums[i];
        }
        for (int i=0; i<nums.length; i++){
            arr[i] = Math.abs(left - (sum - left - nums[i]));
            left = left + nums[i];
        }
        return arr;
    }
}