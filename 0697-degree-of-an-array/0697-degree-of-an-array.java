class Solution {//Two-pass
    public int findShortestSubArray(int[] nums) {
        // Map: Key = number, Value = [count, firstIndex, lastIndex]
        Map<Integer, int[]> map = new HashMap<>();
        int degree = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                // Initialize: count=1, firstIndex=i, lastIndex=i
                map.put(nums[i], new int[]{1, i, i});
            } else {
                int[] data = map.get(nums[i]);
                data[0]++;    // Increment count
                data[2] = i;  // Update lastIndex
            }
            // Update the maximum frequency (degree) found so far
            degree = Math.max(degree, map.get(nums[i])[0]);
        }

        int minLength = nums.length;
        for (int[] data : map.values()) {
            if (data[0] == degree) {
                // Calculate span: lastIndex - firstIndex + 1
                int currentLength = data[2] - data[1] + 1;
                minLength = Math.min(minLength, currentLength);
            }
        }

        return minLength;
    }
}