class Solution {
    public int findMaxLength(int[] nums) {     
    int res = 0;
    int one = 0;
    int zero = 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    for( int i = 0; i< nums.length;i++){
        if(nums[i] == 0){
            zero++;
        }else{
            one++;
        }

        int diff = zero - one;

        if(diff == 0){
            res = Math.max(res,i+1);
            continue;
        }
        //if difference seen before

        if(map.containsKey(diff)){
            int idx = map.get(diff);
            int len = i-idx;
            res = Math.max(res,len);
        }else{
            //store the deiffernce
            map.put(diff,i);
        }
    }
    return res;
    }
}