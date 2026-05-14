class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            // Check if double exists
            if (set.contains(2 * num) || 
               (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }

            // Store current number
            set.add(num);
        }

        return false;
    }
}