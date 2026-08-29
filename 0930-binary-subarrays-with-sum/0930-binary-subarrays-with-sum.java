class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int pref = 0; 
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            pref = pref+nums[i];
            int req = pref - goal;
            if(map.containsKey(req)){
                ans += map.get(req);
            }
            map.put(pref , map.getOrDefault(pref , 0)+1);
        }
        return ans;
    }
}