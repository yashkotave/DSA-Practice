class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum= 0;
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        //base case
        map.put(0,1);

        for( int i = 0; i<nums.length; i++){
            sum = sum+ nums[i];
           // remainder nikal lo
            int rem = sum%k;

            //handle negative 

            if( rem <0){
                rem +=k;
            }
            if(map.containsKey(rem)){ // count previous same remainder
                res+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1); // store remainder
        }
        return res;
    }
}