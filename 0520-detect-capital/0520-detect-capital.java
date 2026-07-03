class Solution {
    public boolean detectCapitalUse(String word) {
        int uc = 0;
        for(int i=0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))) uc++;
        }
        if(uc == word.length()) return true;
        if(uc== 0) return true;
        if(uc ==1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}