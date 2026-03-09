class Solution {
    public int rob(int[] nums) {
        int a1 = 0, a2 = 0;
        for (int num : nums) {
            int temp = a1;
            a1 = Math.max(a1, a2 + num);
            a2 = temp;
        }
        return a1;
    }
}
