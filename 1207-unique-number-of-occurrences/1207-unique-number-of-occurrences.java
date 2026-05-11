class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numOccurrences = new HashMap<>();

        // Step 1: Count frequency of each number
        for (int num : arr) {
            numOccurrences.put(num, numOccurrences.getOrDefault(num, 0) + 1);
        }

        // Step 2: Store all frequencies in HashSet
        Set<Integer> uniqueVals = new HashSet<>(numOccurrences.values());

        // Step 3: Compare sizes
        return uniqueVals.size() == numOccurrences.values().size();
    }
}