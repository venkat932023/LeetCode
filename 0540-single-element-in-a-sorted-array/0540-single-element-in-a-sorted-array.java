class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l=0, h=nums.length-1;
        if (nums.length==1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n-1] != nums[n-2]) return nums[n-1];
        while(l<=h){
            int m = l+(h-l)/2;
            if (nums[m] != nums[m-1] && nums[m] != nums[m+1]) return nums[m];
            int f = m, s = m;
            if (nums[m] == nums[m-1]) f = m-1;
            else s = m+1;
            int lf = f - l;
            int rt = h - s;
            if (lf % 2 == 0) l = s+1;
            else h = f-1;

        }
        return 99999;
    }
}