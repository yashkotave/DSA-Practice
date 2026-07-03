class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCase = 0;
        for(int i=0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))) upperCase++;
        }
        if(upperCase == word.length()) return true;
        if(upperCase == 0) return true;
        if(upperCase ==1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}