class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int h = 0;
        Arrays.sort(citations);
        for(int i=0; i<n; i++){
            if(citations[i] >= n-i){
               h = n-i;
               break;
            }
        }
        return h;
    }
}