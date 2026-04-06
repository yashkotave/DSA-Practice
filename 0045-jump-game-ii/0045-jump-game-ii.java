class Solution {
    public int jump(int[] nums) {
        int totalJumps = 0;

       //destinaion is last Index
       int destination = nums.length-1;
       int coverage = 0;
       int lastJumpIndex = 0;
    
    //base case
       if(nums.length ==1) return 0;


        //grreedy startegy extend coverage as long as possible
       for( int i = 0; i<nums.length; i++){

        coverage = Math.max(coverage,i+nums[i]);

        if( i == lastJumpIndex) {
            lastJumpIndex = coverage;
            totalJumps++;


            //check if we reached destination already
        if(coverage>=destination){
            return totalJumps;
        }
        }
        
       }

       return totalJumps;

    }
}