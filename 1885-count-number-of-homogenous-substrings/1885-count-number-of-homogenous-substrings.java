class Solution {
    public int countHomogenous(String s) {
        
        int len=0;
        int mod=1000000007;
        int res=0;
        for(int i=0; i<s.length();i++){

            if(i>0&&(s.charAt(i)==s.charAt(i-1))){
                len++;
            } else {
                len=1;
            }

            res=(res+len)%mod;
        }

        return res;
    }
}