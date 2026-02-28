class Solution {
    public int firstMissingPositive(int[] nums) {
         int i = 0;

        // Cycle sort to place numbers in the correct positions
        while (i < nums.length) {
            int correct = nums[i] - 1; // The correct index for nums[i]
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                Swap(nums, i, correct); // Swap the current number with the number at its correct position
            } else {
                i++;
            }
        } 
            for(int index = 0; index<nums.length;index++){
            if(nums[index]!= index+1){
                return index + 1;
            }
        }
        return nums.length +1;
    }
    void Swap (int[]arr ,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
    