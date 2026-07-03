class Solution {
    public int mostWordsFound(String[] sentences) {
       //har ek sentence ke word ke beech space hota h 
       //so word ka count space se count +1 honga
       int count =0;
       for(String s: sentences){
        int words =1;
        for(char ch : s.toCharArray()){
            if( ch == ' '){
                words++;
            }
        }
        count = Math.max(count,words);
       } 
       return count;
    }
}