class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int n = nums.length;
        int i=0; 
        while(i<n){
            int idx = nums[i]-1;
            if (i+1==nums[i] || nums[i] == nums[idx]) i++;
            else swap(nums, i, idx);
        }
        for (i=0; i<nums.length; i++){
            if (i+1 != nums[i]) l.add(i+1);
        }
        return l;
    }
    public static void swap(int nums[], int i, int idx){
        int t = nums[i];
        nums[i] = nums[idx];
        nums[idx] = t;
    }
}