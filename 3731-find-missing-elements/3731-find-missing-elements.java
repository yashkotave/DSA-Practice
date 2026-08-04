class Solution {
    public List<Integer> findMissingElements(int[] nums) {
     HashSet<Integer>  seenset = new HashSet<>();
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
    for(int num: nums){
        seenset.add(num);
        min  = Math.min(min,num);
        max = Math.max(max,num);
    }
    List<Integer> ans = new ArrayList<>();
        for(int i = min; i<= max; i++){
        if(!seenset.contains(i)){
            ans.add(i);
        }
        }
        return ans;
    }
}