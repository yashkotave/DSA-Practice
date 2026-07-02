class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left =0;
        int ans =0;
        //sliding window
        //jab tk info sahi h tb tk ki window banao
        for(int right =0; right<nums.length ; right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            //yaha information gakata hogyi
            //shrink kri window

            while(map.get(nums[right])>k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            //last me length calculate kro
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}