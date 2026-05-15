class Solution {
    public int minMoves(int[] nums) {
      int minNum = nums[0];
      //first calculate the minimum number
      for(int num : nums){
        minNum = Math.min(num,minNum);
      } 
     // then subtract the num from minimum numbeer to get the
      int minMoves= 0;
      for(int num  :  nums){
        minMoves = minMoves + (num-minNum);
      }
      return minMoves;
    }
}