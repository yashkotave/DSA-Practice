class Solution {
    public String removeStars(String s) {
       StringBuilder sb = new StringBuilder();
       for(char ch :s.toCharArray()){
        if(ch == '*'){
            //last meka hatane ke liye
            if(sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
            }
        }else{
            sb.append(ch);
        }
       }
       return sb.toString();
    }
}