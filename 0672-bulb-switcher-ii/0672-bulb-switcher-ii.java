class Solution {
    public int flipLights(int n, int m) {
        // Reduce n to a maximum of 3 since the pattern repeats
        n = Math.min(n, 3);
        
        // If no operations are performed, only one configuration exists
        if (m == 0) return 1;
        
        // Cases when n == 1, n == 2, or n == 3
        if (n == 1) return 2; // Two states: all on or all off
        if (n == 2) return m == 1 ? 3 : 4; // Three states for one operation, four states otherwise
        
        // When n == 3:
        if (m == 1) return 4; // Four states with one operation
        if (m == 2) return 7; // Seven states with two operations
        return 8; // Maximum of 8 states for three bulbs
    }
}
