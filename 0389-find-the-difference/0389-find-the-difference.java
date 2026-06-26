class Solution {
    public char findTheDifference(String s, String t) {
        char ans= 0;
        for(char ch :s.toCharArray()){
           ans = (char)(ans^ch);
           // ans^=ch;
        }
        for(char ch : t.toCharArray()){
           // ans^=ch;
             ans = (char)(ans^ch);
        }
        return ans;
    }
}