class Solution {
    public int subsetXORSum(int[] nums) {
        int totalXor=0;
        for(int ele:nums){
            totalXor|=ele;
        }

        return totalXor* (int)(Math.pow(2,nums.length-1));
    }
    
}