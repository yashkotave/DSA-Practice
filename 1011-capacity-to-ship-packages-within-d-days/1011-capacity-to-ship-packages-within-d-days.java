class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minCap =0;
        int maxCap =0;

        for(int w : weights){ 
             //find range
            minCap = Math.max(minCap,w);
            //max element sum
            maxCap += w;
        }
        //apply binary search
         
        while(minCap<maxCap){
            int mid = minCap+(maxCap-minCap)/2;
            int requiredDays =1;
            int currLoad = 0;
            for(int w: weights){
                if(currLoad+w>mid){
                    requiredDays++;
                    currLoad = 0;
                }
                currLoad += w;
            }
            if(requiredDays>days){
                minCap = mid+1;
            }else{
                maxCap= mid;
            }
        }
        return minCap;
    }
}