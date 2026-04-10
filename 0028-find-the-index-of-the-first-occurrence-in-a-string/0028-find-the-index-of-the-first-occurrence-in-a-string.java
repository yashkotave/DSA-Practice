class Solution {
    public int strStr(String haystack, String needle) {
       int n = haystack.length();
       int k = needle.length();

       for( int i = 0; i<=n-k;i++){
        if(haystack.charAt(i) == needle.charAt(0)){
            String subs = haystack.substring(i,i+k);

            if(subs.equals(needle)){
                return i;
            }
        }
       }
       return -1;
    }
}