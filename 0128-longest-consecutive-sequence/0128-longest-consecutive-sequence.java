class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1:
        // Store all elements in HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2:
        // Start sequence only if num-1 doesn't exist
        for (int num : set) {

            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // Step 3:
                // Count consecutive elements
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}