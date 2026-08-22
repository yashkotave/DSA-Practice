class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            long spell = spells[i];
            long minPotion = (success + spell - 1) / spell;

            int low = 0, high = m - 1;
            int firstValidIndex = m;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (potions[mid] >= minPotion) {
                    firstValidIndex = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            result[i] = m - firstValidIndex;
        }

        return result;
    }
}