class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        // Step 1: Store nums1 elements in HashSet
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();

        // Step 2: Check common elements from nums2
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                list.add(nums2[i]);
                set.remove(nums2[i]); // avoid duplicates
            }
        }

        // Step 3: Convert ArrayList to int[]
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}