class Solution {
    public int hammingDistance(int x, int y) {
        int t=x^y;
        int c=0;
        while(t>0){
            t=t&(t-1);
            c++;
        }

        return c;
    }
}