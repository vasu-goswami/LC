class Solution {
    public int countPrimeSetBits(int left, int right) {
        int p=0;
        int no=0;
        for(int i=left;i<=right;i++){
            no=bitss(i);
            if(isPrime(no))
            p++;
        }

        return p;  
    }
    public static boolean isPrime(int n){
        if (n <= 1) return false;
        if (n <= 3) return true;
        if(n%2==0||n%3==0) return false;

        int i = 5;
        while (i * i <= n){
            if(n % i == 0 || n % (i + 2) == 0) return false;
            i = i + 6;
        }
        return true;
    }
    public static int bitss(int n){
        int c=0;
        while(n>0){
            n=n&(n-1);
            c++;
        }
            return c;
        }
}
