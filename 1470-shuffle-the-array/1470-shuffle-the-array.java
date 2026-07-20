class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
         int k =0; 
         int j = n;
        int [] result = new int[nums.length];
         while(i<n){
            result[k] = nums[i];
            i++;
            k++;
            result[k] = nums[j];
            j++;
            k++;
        }
        return result;
    }
}