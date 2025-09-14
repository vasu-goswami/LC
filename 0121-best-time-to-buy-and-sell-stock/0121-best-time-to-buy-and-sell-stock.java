class Solution {
    public int maxProfit(int[] arr) {
      int temp=Integer.MAX_VALUE;
      int result=0;
        for(int i=0;i<arr.length;i++){
            
            temp = Math.min(temp, arr[i]);
        result = Math.max(result, arr[i] - temp);
        }

        return result;

       
    }
}