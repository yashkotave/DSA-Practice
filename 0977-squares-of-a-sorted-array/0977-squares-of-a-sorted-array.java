class Solution {
    public int[] sortedSquares(int[] nums) {
       int n = nums.length;
       int[]  ans = new int[n];


        int left = 0;
       int right = n-1;
       int idx = n-1;

       while(left<=right){
            int leftSqr = nums[left]*nums[left];
            int rightSqr = nums[right]*nums[right];

            if(leftSqr>rightSqr){
                ans[idx] = leftSqr;
                left++;

            }else{
                ans[idx] = rightSqr;
                right--;
            }
            idx--;
       }
       return ans ;
    }
}
