class Solution {
    public boolean canJump(int[] nums) {
      int maxReach = 0;
      for( int i =0 ;i<nums.length; i++){
        if(i>maxReach){
            return false;
        }
                    //agar zeero ko crosss kr liya toh apn raeach kr jayega
                
        maxReach = Math.max(maxReach,i+nums[i]);
      }
      return true;
    }
}