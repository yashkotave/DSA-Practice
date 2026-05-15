import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        //sort the array
        Arrays.sort(nums);
        //fir median nikalo 
        int n = nums.length;
        int median = nums[n / 2];
        int moves = 0;
        //fir median tk jane ke liye kitne steps lgege count krlo
        for (int num : nums) {
            moves += Math.abs(num - median);
        }

        return moves;
    }
}