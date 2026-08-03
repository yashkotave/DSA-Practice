class Solution {
    public int sumOfUnique(int[] nums) {
        Set<Integer> uni = new HashSet<>();
        Set<Integer> dup = new HashSet<>();
        int sum = 0;
        for (int i : nums) {
            if (dup.contains(i))
                continue;
            else if (uni.contains(i)) {
                sum -= i;
                uni.remove(i);
                dup.add(i);
            } else {
                sum += i;
                uni.add(i);
            }
        }
        return sum;
    }
}