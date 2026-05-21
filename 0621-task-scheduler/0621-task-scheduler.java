class Solution {
    public int leastInterval(char[] tasks, int n) {
        int count[] = new int [26];
        //store  freq of task in count 
        for(int i=0 ; i<tasks.length ; i++){
            count[tasks[i] - 'A']++;
        }
        //now find maxfreq
        int maxfrq =0 ;
        for(int f : count){
            maxfrq = Math.max(maxfrq , f);
        }
        //find maxcount of maxfreq
        int maxcount = 0;
        for(int f : count){
            if(f == maxfrq){
                maxcount++;
            }
        }
        //apply formula
      int  ans = (maxfrq -1)*(n+1) + maxcount;

        return Math.max(tasks.length , ans);//sometimes no ideal time required
    }
}