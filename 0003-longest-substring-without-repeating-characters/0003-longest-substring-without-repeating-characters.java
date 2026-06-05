class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int length = 0;
        
        HashSet<Character> set = new HashSet<>(); 
        for(int i=0; i<s.length(); i++){
            set.clear();
            for(int j=i; j<s.length(); j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                else{
                    set.add(s.charAt(j));
                    length = j-i+1;
                    ans = Math.max(length , ans);
                }
            }
        }

        return ans;
    }
}