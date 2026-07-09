class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n]; // 1. Create an array to store the results
        Stack<Integer> st = new Stack<>();
        
        // Iterate backwards
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack that are colder or equal to the current day
            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }
            
            // 2. If stack is empty, there's no warmer day ahead (defaults to 0)
            if (st.isEmpty()) {
                ans[i] = 0;
            } else {
                // 3. The distance to the next warmer day is the index difference
                ans[i] = st.peek() - i;
            }
            
            // Push the current day's index onto the stack
            st.push(i);
        }
        
        return ans;
    }
}