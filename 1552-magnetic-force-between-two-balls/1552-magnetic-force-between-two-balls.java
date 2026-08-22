class Solution {
    public static boolean ballsplace(int[] position, int m, int force){
        int count=1;
        int lastp = position[0];
        for(int i =0; i<position.length; i++){
            if(position[i] - lastp >= force){
                count++;
                lastp = position[i];
            }
            if(count>=m) return true;
        }

        return count>= m;
    }
    public int maxDistance(int[] position, int m) {
        int n  = position.length;
        Arrays.sort(position);
        int low=1;
        int high  = position[n-1] -position[0];
        int ans =1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(ballsplace(position,m,mid)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}