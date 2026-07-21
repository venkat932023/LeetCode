class Solution {
    public boolean hasAlternatingBits(int n) {
        String bin = Integer.toBinaryString(n);
        for (int ch = 1; ch<bin.length(); ch++){
            char a = bin.charAt(ch-1);
            char b = bin.charAt(ch);
            if (a == b)
                return false;
        }
        return true;
    }
}