class Solution {
    public int findDuplicate(int[] nums) {
       int n = nums.length;
       int i=0; 
       while(i<n){
        if (i+1 == nums[i]) i++;
        else {
            int idx = nums[i] - 1;
            if (nums[idx] == nums[i]) return nums[i];
            swap(nums, idx, i);
        }
       }
       
       return -1;
    }
    public static void swap(int[] nums, int idx, int i){
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
}