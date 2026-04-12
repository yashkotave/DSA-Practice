class Solution {
    public int subarraySum(int[] nums, int k) {
     HashMap<Integer, Integer> map = new HashMap<>();
     int sum =0;
     int res = 0;
     map.put(0,1); //base case

     for( int i =0; i<nums.length;i++){
        sum+=nums[i];

        int guess = sum-k;

        if(map.containsKey(guess)){ //check if sum-k exists
            res+=map.get(guess);
        }

        map.put(sum,map.getOrDefault(sum,0)+1); //store current sum
     }
        return res;
    }
}