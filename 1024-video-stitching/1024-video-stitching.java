class Solution {
    public int videoStitching(int[][] clips, int time) {
      if(time ==0)return 0;
      if(clips == null  || clips.length ==0 )return -1;
      // Sort: start ascending; if start is equal, end descending

      Arrays.sort(clips,(a,b)->{
        if(a[0] != b[0] ){
            return Integer.compare(a[0],b[0]);
        }
        return Integer.compare(a[1],b[1]);

      });
      int maxReach =0;
      int totalClips = 0;
      int currEnd = 0;
      int i =0;
      int n = clips.length;
      while(currEnd< time){
        // Explore all clips that can attach to our current covered boundary
        while(i<n && clips[i][0]<= currEnd){
            maxReach = Math.max(maxReach,clips[i][1]);
            i++;
        }
        // If we couldn't extend our boundary forward, a gap exists
        if(maxReach<= currEnd){
            return -1;
        }  
        // Greedily commit to the clip providing maximum reach 
        currEnd = maxReach;
        totalClips++;

      }
      return totalClips;
    }
}