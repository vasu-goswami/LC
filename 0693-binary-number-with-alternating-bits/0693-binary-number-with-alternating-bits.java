class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1); //xor would return a all 1111 if no is alternate
        return (x & (x + 1)) == 0;//here we check that 1111 and no+1 that is 10000 & gives us 0

    }
}