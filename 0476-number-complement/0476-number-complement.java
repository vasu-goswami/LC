class Solution {
    public int findComplement(int num) {
        long mask=1l;

        while(mask<=num){
            mask=mask<<1;
        }

        return (int)(num^(mask-1));
        
    }
}