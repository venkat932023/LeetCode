class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr=new int[nums.length];
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        ArrayList<Integer> c=new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            if (nums[i] < pivot)
                a.add(nums[i]);
            else if (nums[i] == pivot)
                c.add(nums[i]);
            else 
                b.add(nums[i]);
        }
        a.addAll(c);
        a.addAll(b);
        for (int i=0; i<a.size(); i++){
            arr[i] = a.get(i);
        }
        return arr;
    }
}