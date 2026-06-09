class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;

        // Step 1:
        // Sort the array to apply two pointers
        Arrays.sort(nums);

        // Step 2:
        // Fix the first element
        for (int i = 0; i < n; i++) {

            // Skip duplicates for first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Step 3:
            // Fix the second element
            for (int j = i + 1; j < n; j++) {

                // Skip duplicates for second element
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // Step 4:
                // Apply two pointers on remaining array
                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[i]
                             + nums[j]
                             + nums[left]
                             + nums[right];

                    // Quadruplet found
                    if (sum == target) {

                        ans.add(Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[left],
                                nums[right]
                        ));

                        left++;
                        right--;

                        // Skip duplicate third element
                        while (left < right &&
                               nums[left] == nums[left - 1]) {
                            left++;
                        }

                        // Skip duplicate fourth element
                        while (left < right &&
                               nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }

                    // Need larger sum
                    else if (sum < target) {
                        left++;
                    }

                    // Need smaller sum
                    else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }
}