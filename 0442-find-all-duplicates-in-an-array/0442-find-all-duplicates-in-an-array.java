import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;

        // Cycle sort to place numbers in the correct positions
        while (i < nums.length) {
            int correct = nums[i] - 1; // The correct index for nums[i]
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct); // Swap the current number with the number at its correct position
            } else {
                i++;
            }
        }

        // Find duplicates
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]); // If the number is not in its correct position, it's a duplicate
            }
        }

        return ans;
    }

    // Helper function to swap two elements in an array
    private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
