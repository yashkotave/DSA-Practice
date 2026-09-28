class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int max =0;
        int op =0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '('){
                op++;
                max = Math.max(max,op);
            }else if(s.charAt(i) == ')'){
                op--;
            }
        }
        return max;
    }
}