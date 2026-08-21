class Solution {
    public static boolean canShip(int[] weights, int days , int capacity){
        int reqD = 1;
        int currL =0;
        for(int w : weights){
            if(currL + w > capacity){
                reqD++;
                currL =0;
            }
            currL += w;
        }
        return reqD<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
       int low=0;
       int high =0;
        for(int w : weights){
            if(w>low){
                low =w;
            }
            high += w;
        }

        while(low<high){
            int mid = low+(high-low)/2;
            if(canShip(weights,days,mid)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}