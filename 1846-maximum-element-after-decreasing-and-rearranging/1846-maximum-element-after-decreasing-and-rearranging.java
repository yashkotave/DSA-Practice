class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
      // TC o(NlogN) Brute force
      /* Arrays.sort(arr);
       arr[0] = 1;
       for(int i =1; i<arr.length; i++){
        arr[i] = Math.min(arr[i],arr[i-1]+1);
       } 
       return arr[arr.length-1];*/
       
       //optimzed o(N) but space o(N);

       int n = arr.length;
       int[] count = new int[n+1];

        // Values greater than n can be treated as n
       for(int num : arr){
        count[Math.min(num,n)]++;
       }
       int ans = 0;
       //build the maximum valid sequence

       for(int i =1; i<=n; i++){
        ans = Math.min(ans+count[i],i);
       }
       return ans;
    }
}
