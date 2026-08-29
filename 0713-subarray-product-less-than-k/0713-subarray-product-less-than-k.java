class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
       // if(nums.length==1 && nums[0]<k) return 1;
        // if(nums.length==1 && nums[0]>=k) return 0;
        int ans = 0;
        int i = 0;
        long pro =1;
        for(int j=0; j<nums.length; j++){
            pro = pro*nums[j];
            while(pro>=k){
                pro = pro/nums[i];
                i++;
            }
            ans = ans + j-i+1;
        }
       
        return ans;
    }
}