import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        
        backtrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }

    private void backtrack(List<List<Integer>> resultList, List<Integer> tempList, int[] nums) {

        if (tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for(int num: nums){
            if(tempList.contains(num)) continue;

            tempList.add(num); //add the new element

            //go back and try other elemnt
            backtrack (resultList,tempList,nums);

            //remove the element
            tempList.remove(tempList.size()-1);
        }
    }
}