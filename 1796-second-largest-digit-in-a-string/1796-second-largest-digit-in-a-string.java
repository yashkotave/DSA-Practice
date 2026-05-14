class Solution {
    public int secondHighest(String s) {
        char[] digits = s.replaceAll("[^0-9]", "").toCharArray();
        int firstMax = -1;
        int secondMax = -1;

        for(int i = 0; i < digits.length; i++){
           
            int currNum = digits[i] - '0';
            if(firstMax < currNum){
                secondMax = firstMax;
                firstMax = currNum;
            } else if (currNum < firstMax && currNum > secondMax) {
                secondMax = currNum;
            }
        }
        return secondMax;
    }
}