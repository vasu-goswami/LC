class Solution {
    public int singleNumber(int[] nums) {
       
        int result=0;
        for(int i=0;i<32;i++){
             int bitsum=0;
            for(int num:nums){
                bitsum+=(num>>i)&1;
            }

            if(bitsum%3!=0){
                result|=(1<<i);
            }
        }
        return result;
    }
}