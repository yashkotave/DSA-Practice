class Solution {
    public String reverseWords(String s) {
        String[] words =s.split(" ");
        StringBuilder s1 = new StringBuilder();
        for(int i = 0; i<words.length; i++){
            String s2 = new StringBuilder(words[i]).reverse().toString();
            s1.append(s2);
            if(words.length-1>i) s1.append(" "); 
        }
        //stringbuilder se string
        return s1.toString();
    }
}