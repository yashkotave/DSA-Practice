class Solution {
    public long beautifulSubarrays(int[] nums) {

        HashMap<Long, Long> map = new HashMap<>();

        long xor = 0;
        long count = 0;

        // Step 1:
        // XOR = 0 occurs once before starting
        map.put(0L, 1L);

        // Step 2:
        // Traverse array
        for (int num : nums) {

            // Step 3:
            // Calculate prefix XOR
            xor ^= num;

            // Step 4:
            // If same XOR occurred before,
            // then subarray XOR = 0
            count += map.getOrDefault(xor, 0L);

            // Step 5:
            // Store current XOR frequency
            map.put(xor, map.getOrDefault(xor, 0L) + 1);
        }

        // Step 6:
        // Return total beautiful subarrays
        return count;
    }
}