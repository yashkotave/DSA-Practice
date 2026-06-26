class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        //limit  
        n = n*n;

        //2*2 =4
        //4*3 = 12<15 
        int weight = n*w;

        if(weight <= maxWeight ) return n;
       //return n;

        //2nd test 
        // n = 3*3;
        //overflow 9*5 >20
        //so divide by 20/5

       else return  maxWeight/w;
    }  
}