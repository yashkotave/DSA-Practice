class Solution {
    public int minSteps(String s, String t) {
          int[] freq = new int[26];
          //count char of s
          for(char ch : s.toCharArray()){
            freq[ch-'a']++;
          }
          //remove charcter of t
          for(char ch : t.toCharArray()){
            freq[ch-'a']--;
          }
          int steps = 0;
          //count remaining positive frequencices
          for(int count : freq){
            if(count>0) steps += count;
          }
          return steps;
    }
}