class Solution {
    public int findComplement(int num) {
        //0(n) space for inbuilt ke liye
        //0(logn) for mask
        // if (num == 0) return 1;
        // int bitLength = Integer.toBinaryString(num).length();
        // int mask = (1 << bitLength) - 1;
        // return num ^ mask;


        //o(1) space time o(logn);
        int mask  = 1;
        while(mask<num){
            mask = (mask<<1)|1;
        }
        return num^mask;
    }
}