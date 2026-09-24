class Solution {
    public int smallestIndex(int[] nums) {
        int  n = nums.length;
        for (int i = 0; i<nums.length; i++){
            int n1 = nums[i];
            int sum =0;
            while(n1>0){
                int digit = n1%10;
                sum+=digit;
                n1=n1/10;
            }
            if(sum==i) return i;
        }
        return -1;
    }
}