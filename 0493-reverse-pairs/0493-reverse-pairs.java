class Solution {

    public int reversePairs(int[] nums) {

        // Step 1:
        // Apply Merge Sort
        // Count reverse pairs in left half
        // Count reverse pairs in right half
        // Count reverse pairs across both halves
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int low, int high) {

        // Base Case:
        // Single element => no reverse pair
        if (low >= high) return 0;

        int mid = low + (high - low) / 2;

        int count = 0;

        // Step 2:
        // Count reverse pairs in left half
        count += mergeSort(nums, low, mid);

        // Step 3:
        // Count reverse pairs in right half
        count += mergeSort(nums, mid + 1, high);

        // Step 4:
        // Count reverse pairs where:
        // i belongs to left half
        // j belongs to right half
        count += countPairs(nums, low, mid, high);

        // Step 5:
        // Merge both sorted halves
        merge(nums, low, mid, high);

        return count;
    }

    private int countPairs(int[] nums, int low, int mid, int high) {

        int right = mid + 1;
        int count = 0;

        // Step 6:
        // For every element in left half
        // find how many elements in right half satisfy:
        // nums[i] > 2 * nums[j]
        for (int i = low; i <= mid; i++) {

            while (right <= high &&
                    nums[i] > 2L * nums[right]) {
                right++;
            }

            // All elements from (mid+1) to (right-1)
            // form reverse pairs with nums[i]
            count += right - (mid + 1);
        }

        return count;
    }

    private void merge(int[] nums, int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        // Step 7:
        // Normal Merge Sort merge process
        while (left <= mid && right <= high) {

            if (nums[left] <= nums[right]) {
                temp.add(nums[left++]);
            } else {
                temp.add(nums[right++]);
            }
        }

        while (left <= mid) {
            temp.add(nums[left++]);
        }

        while (right <= high) {
            temp.add(nums[right++]);
        }

        // Step 8:
        // Copy sorted elements back to original array
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }
}