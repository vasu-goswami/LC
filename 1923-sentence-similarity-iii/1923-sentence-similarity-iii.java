class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        
        if(sentence2.length()>sentence1.length()){
            return areSentencesSimilar(sentence2,sentence1);
            
        }

        String[] bigger=sentence1.split(" ");
        String[] smaller=sentence2.split(" ");

        int l=0,r=bigger.length-1,sr=smaller.length-1;

        while(l<=sr&&smaller[l].equals(bigger[l])){
            l++;

        }

        while(l<=sr&&smaller[sr].equals(bigger[r])){
            r--;
            sr--;

        }

        return (l>sr);
        

        
    }
   
}