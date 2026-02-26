class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int mid = 0;
        int low = 0;
        int high = n-1;

        while(mid<=high){
            if(nums[mid] == 0){
             //swap nums[mid] and nums[low]
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                //updation
                mid++ ; low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                //swap nums[mid] and nums[high]
                 int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                //updation
                high--;
            }
        }
    }
}