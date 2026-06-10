class Solution {
    public long beautifulSubarrays(int[] nums) {
        HashMap<Long,Long> map = new HashMap<>();
        long xor =0;
        long count =0;
        map.put(0L,1L);
        for(int num : nums){
            xor ^= num;
            count+= map.getOrDefault(xor,0L);
            map.put(xor,map.getOrDefault(xor,0L)+1);
        }
        return count;
    }
}