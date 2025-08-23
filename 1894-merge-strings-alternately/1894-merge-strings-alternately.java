class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder res=new StringBuilder("");

        int len1=word1.length(),len2=word2.length(),a=0,b=0;

        while(a<len1&&b<len2){
            res.append(word1.charAt(a++));
            res.append(word2.charAt(b++));
        }

        if(a<len1){
            res.append(word1.substring(a));
        }else{
            res.append(word2.substring(b));
        }

        return res.toString();
    }
}