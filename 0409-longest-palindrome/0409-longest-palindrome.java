class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap <>();
        //step 1 Count frequency

        for (int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int length =0;
        boolean oddFound = false;

        //step 2 calculate maximum palindrome length
        for(int freq  : map.values()){
            if(freq%2 ==0 ){
                length = length+freq;
            }else{
                length = length + freq -1;
                oddFound = true;
            }
        }

        //Step 3 ONE odd character can be placed in the ceentre

        if(oddFound){
            length= length+1;   
        }
        return length;
    }
}