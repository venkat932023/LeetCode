class Solution {
    public boolean hasAlternatingBits(int n) {
        String bin = Integer.toBinaryString(n);
        for (int ch = 1; ch<bin.length(); ch++){
            if (bin.charAt(ch-1) == bin.charAt(ch))
                return false;
        }
        return true;
    }
}