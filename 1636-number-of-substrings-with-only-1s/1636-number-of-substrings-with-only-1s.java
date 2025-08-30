class Solution {
    public int numSub(String s) {
        long count = 0;    
        long length = 0; 
        long MOD = 1_000_000_007;  

        for (char c : s.toCharArray()) {
            if (c == '1') {
                length++;
                count = (count + length) % MOD;
            } else {
                length = 0;
            }
        }
        return (int) count;
    }
}
