class Solution {
    public int maximum69Number (int n) {
        // String s=String.valueOf(num);
        // int flag=-1;
        // int l=s.length();
        // for(int i=0;i<l;i++){
        //     if(s.charAt(i)=='6'){
        //         flag=i;
        //         break;
        //     }
        // }
        // if(flag!=-1){
        //     s=s.replaceFirst("6","9");
        //     return Integer.parseInt(s);

        // }
        // return num;
        //  String s = String.valueOf(num);
        // s = s.replaceFirst("6", "9");   
        // return Integer.parseInt(s);

         int o = n, i = -1, p = 0;
        while (n > 0) {
            if (n % 10 == 6) i = p;
            n /= 10;
            p++;
        }
        return i == -1 ? o : o + 3 * (int)Math.pow(10, i);
    }
}