class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        // Step 1: Find break point
        int idx = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        // If no breakpoint found
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 2: Find next greater element
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {

                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;

                break;
            }
        }

        // Step 3: Reverse remaining part
        reverse(nums, idx + 1, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}