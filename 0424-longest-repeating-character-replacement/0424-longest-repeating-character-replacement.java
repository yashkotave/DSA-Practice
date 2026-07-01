class Solution {
    public int characterReplacement(String s, int k) {
      //slding window
      int n = s.length();
      int[] freq = new int[26];
      int left = 0;
      int maxfreq = 0;
      int maxWindow= 0;

      for(int right =0; right<n; right++){
        //update the freq of curr charcter

        freq[s.charAt(right)-'A']++;
        //updathe the max Freq;
        maxfreq = Math.max(maxfreq,freq[s.charAt(right)-'A']);

        int windowLength  = right-left+1;

        //if the window length-maxfreq>k
        //than we need to shrink the window

        if(windowLength - maxfreq >k){
            freq[s.charAt(left)-'A']--;
            left++;
        }

        //after shrinking calculate length
        windowLength= right-left+1;
        maxWindow = Math.max(windowLength,maxWindow);
      }
      return maxWindow;
    }
}