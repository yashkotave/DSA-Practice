class Solution {
    private int revnum(int a) {
        if (a / 10 == 0) return a ;
        //use inbuild function to reverse
        String s = new StringBuilder(Integer.toString(a)).reverse().toString();
        return Integer.parseInt(s) ;
    }

    public int mirrorDistance(int n) {
        return Math.abs(n - revnum(n)) ;
    }
}