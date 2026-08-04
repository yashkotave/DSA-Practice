class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Step 1: Track min, max, and store elements in HashSet
        for (int num : nums) {
            seen.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        List<Integer> result = new ArrayList<>();

        // Step 2 & 3: Find elements missing in [min, max]
        for (int i = min; i <= max; i++) {
            if (!seen.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}