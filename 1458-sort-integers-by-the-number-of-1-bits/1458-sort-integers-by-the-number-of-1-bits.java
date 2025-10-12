class Solution {
    public int[] sortByBits(int[] arr) {
        int i=0,bits;
        for(i=0;i<arr.length;i++){
            bits=0;
           int  n=arr[i];
            while(n!=0){
                bits+=n&1;
                n=n>>1;
            }
            arr[i]=bits*100000+arr[i];
        }
        Arrays.sort(arr);
        for(i=0;i<arr.length;i++){
            arr[i]=arr[i]%100000;
        }
        return arr;
    }
}