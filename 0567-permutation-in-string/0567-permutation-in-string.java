class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length()>s2.length()) return false;

       int[] count = new int[26];
       //frequecy of s1 

       for(char c: s1.toCharArray()){
        count[c-'a']++;
       }

       int left = 0;
       for( int right = 0; right<s2.length();right++){
        //include current char
        count[s2.charAt(right) - 'a']--;
        //if negative->shrink window

        while(count[s2.charAt(right)-'a']<0){
            count[s2.charAt(left)-'a']++;
            left++;
        }
        //check window size
        if(right-left+1 == s1.length()){
            return true;
        
        }
       }
       return false;
    }
}