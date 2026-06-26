class Solution {
    public int minMoves(int[] nums) {
      int min = Integer.MAX_VALUE;
      for(int x: nums){
        min = Math.min(min,x);
      }
      int moves = 0;
      for(int i =0; i<nums.length; i++){
        moves += nums[i] -min;
      }

      return moves;
    }
}