class Solution {
    public void sortColors(int[] arr) {
        int n=arr.length;
        int mid=0,lo=0,hi=n-1;
        
        
        while(mid<=hi){
            
            if(arr[mid]==0){
                swap(arr,mid,lo);
                
                lo++;
                mid++;
            }
            else if(arr[mid]==2) {
                swap(arr,mid,hi);
                hi--;
            }
            else { 
                mid++;
            }
        
        }
    }
    static void swap(int[] arr, int i, int j){
            int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
    }
}