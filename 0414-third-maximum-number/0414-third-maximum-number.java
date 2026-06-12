class Solution {
    public int thirdMax(int[] nums) {

       long max = Long.MIN_VALUE;
       long secmax = Long.MIN_VALUE;
       long thirdmax = Long.MIN_VALUE;

       for(int n : nums){
        if(n>max){
            thirdmax = secmax;
            secmax = max;
            max = n;
        }
        else if(n>secmax && n<max){
            thirdmax = secmax;
            secmax = n;
        }
        else if(n>thirdmax && n<secmax){
            thirdmax = n;
        }
       }
       // if no 3 distinct value it means thirdmax is still 0;
       if(thirdmax == Long.MIN_VALUE){
        return (int) max;
       }
       else{
        return (int) thirdmax;
       }
    }
}