class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] need = new int[256];   // t ke characters
        int[] have = new int[256];   // current window ke characters

        // fill need array
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int low = 0;
        int count = 0;              // kitne chars match ho chuke
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);
            have[ch]++;

            // agar ye char required hai aur limit ke andar hai
            if (need[ch] > 0 && have[ch] <= need[ch]) {
                count++;
            }

            // jab saare chars mil gaye
            while (count == t.length()) {

                // answer update
                int len = high - low + 1;
                if (len < minLen) {
                    minLen = len;
                    start = low;
                }

                // window shrink
                char leftChar = s.charAt(low);
                have[leftChar]--;

                if (need[leftChar] > 0 && have[leftChar] < need[leftChar]) {
                    count--;
                }
                low++;
            }
        }

        return (minLen == Integer.MAX_VALUE) 
                ? "" 
                : s.substring(start, start + minLen);
    }
}
