class Solution {
    public int repeatedStringMatch(String a, String b) {
 StringBuilder sb = new StringBuilder();
        int count = 0;

       
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        
        if (sb.indexOf(b) != -1) {
            return count;
        }


        sb.append(a);
        count++;
        if (sb.indexOf(b) != -1) {
            return count;
        }

        return -1;

        
    }
}