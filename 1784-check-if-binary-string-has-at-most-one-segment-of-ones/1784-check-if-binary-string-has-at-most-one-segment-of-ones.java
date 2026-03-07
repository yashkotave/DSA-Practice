class Solution {
    public boolean checkOnesSegment(String s) {
        boolean flag = true;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1)=='0' && s.charAt(i)=='1'){
                flag = false;
            }
        }
        return flag;

    }
}