class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=0 ; i<nums.length ; i++){
            if(i==0){
                nums[0] = 0 + nums[0];
            }
            else{
            nums[i] = nums[i-1] + nums[i]; }
        }
         return nums;
    }
}