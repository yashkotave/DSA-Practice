class Solution {
    public int trap(int[] height) {
       int n = height.length;;
       int leftmax =0;
       int rightmax = 0;
       int left = 0;
       int right= n-1;
       int ans =0;
       while(left<right){
            if(height[left]>leftmax){
                leftmax = Math.max(leftmax,height[left]);
            }   
            if(height[right]>rightmax){
                rightmax = Math.max(rightmax,height[right]);
            }
            if(leftmax<rightmax){
                ans = ans+ leftmax-height[left];
                left++;
            }else{
                ans = ans + rightmax-height[right];
                right--;
            }
        }
        return ans;
    }
}