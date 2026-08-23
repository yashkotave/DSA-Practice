class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        // Step 1: Build frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min-Heap based on frequency
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> freqMap.get(a) - freqMap.get(b));

        for (int key : freqMap.keySet()) {
            minHeap.offer(key);
            if (minHeap.size() > k) {
                minHeap.poll(); // Evict the least frequent element
            }
        }

        // Step 3: Build result array of size k
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}