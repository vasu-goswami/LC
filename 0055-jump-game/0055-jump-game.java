class Solution {
    public boolean canJump(int[] nums) {
        int maxindx=0;
        for(int i=0;i<nums.length;i++){
            if(maxindx>=nums.length-1) return true;
            if(i>maxindx) return false;
            if(i+nums[i]>maxindx){
                maxindx=i+nums[i];
            }
        }
         return true;
    }
}