class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> al=new ArrayList<>();
        for (int i=left; i<=right; i++){
            if (prime(i) == 1){
                al.add(i);
            }
        }
        int len = al.size();
        if (len>=2){
        int min = Integer.MAX_VALUE;
        int a=-1,b=-2;
        for (int i=1;i<len; i++){
             if ((al.get(i)-al.get(i-1)) < min ){
                min = al.get(i)-al.get(i-1);
                a = al.get(i-1);
                b = al.get(i);
             }
        }
        return new int[]{a,b};
        }
        
        
        return new int[]{-1,-1};
    }
    
    public static int prime(int n){
        int cnt = 0;
        if (n<2){
            return 0;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i == 0){
                return 0;
            }
        }
        return 1;
        
    }
}