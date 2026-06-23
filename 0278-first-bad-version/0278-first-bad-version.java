/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //brute force appraoch o(n)
    //    for(int i=0 ; i<=n ; i++){
    //         if(isBadVersion(i)){
    //             return i;
    //         }
    //     }
    //     return -1;

        //we will try in o(log n) 
        //since pattern is G G G B B sorted then use binary search

        int low = 1;
        int high= n;
        int mid ;
        int result = 1;

        while(low<= high){
            mid = low+(high-low)/2;
            if(isBadVersion(mid)){
                result = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return result;
    }
}