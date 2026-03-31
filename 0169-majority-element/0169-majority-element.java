class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
// Ek candidate aur count maintain karo.
// Same element mile → count++
// Different mile → count--
// Count 0 → new candidate
        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}