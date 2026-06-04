class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        // Phase 1: Detect cycle
        while (true) {
            slow = nums[slow];               // move 1 step
            fast = nums[nums[fast]];         // move 2 steps

            if (slow == fast) {
                break;
            }
        }

        // Phase 2: Find entry point of cycle
        slow = 0;

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}