class Solution {
    public String convertToTitle(int columnNumber) {
        String result="";char letter;int d;
        while(columnNumber>0){
            d = (columnNumber - 1) % 26;
            letter = (char) ('A' + d);
            result=letter+result;
            columnNumber = (columnNumber - 1) / 26;

        }
        return result;
    }
}