class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        //start backtracking from the bvegining
        backTrack(resultList,new ArrayList<>(),nums,0);
        return resultList;
    }
    public void backTrack(List<List<Integer>> resultSets,List<Integer> tempSet,int[] nums, int start){
        //add the empty set to the result set

        resultSets.add(new ArrayList<>(tempSet));
        for(int i = start; i<nums.length; i++){

            //case of including the number
            tempSet.add(nums[i]);

            //backtrack the new subset
            backTrack(resultSets,tempSet,nums,i+1);

            //case of not including the number
            tempSet.remove(tempSet.size()-1);
        }
    }
}