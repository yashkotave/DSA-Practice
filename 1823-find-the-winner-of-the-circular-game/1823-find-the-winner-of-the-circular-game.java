class Solution {
    public int findTheWinner(int n, int k) {
        //recursive base case
        if(n==1) return 1;

        // josephus formula 
        
        return (findTheWinner(n-1,k) + k-1)%n+1;
    }
}