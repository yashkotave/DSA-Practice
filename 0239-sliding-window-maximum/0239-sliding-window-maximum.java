class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
           int n = nums.length;
        if(nums == null || nums.length<0 | k<=0){
            return new int[n];
        }

     
        int[] ans =  new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i =0; i<n; i++){
            // 1. Remove elements outside the current window boundary
            if(!dq.isEmpty() && dq.peekFirst()==i-k){
                dq.pollFirst();
            }
            // 2. Maintain decreasing order: remove all smaller elements from the back
            while(!dq.isEmpty()&& nums[dq.peekLast()]<= nums[i]){
                dq.pollLast();
            }
// 3. Insert current element's index
            dq.offerLast(i);
        // 4. Once we have filled at least the first k elements, record maximum
            if(i>=k-1){
                ans[i-k+1] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}