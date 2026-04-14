class Solution {
    public int totalFruit(int[] fruits) {
    int n  = fruits.length;
    int low = 0;
    int maxLen = 0;
    HashMap<Integer,Integer> freq = new HashMap<>();

    for( int high = 0;high<n; high++){
        //add current fruits;
       
         freq.put(fruits[high],freq.getOrDefault(fruits[high],0)+1);
        //shrink window more than 2 fruits typesl

        while(freq.size()>2){
            int leftFruit = fruits[low];
            freq.put(leftFruit,freq.get(leftFruit)-1);

            if(freq.get(leftFruit ) == 0){
                freq.remove(leftFruit);

            }
            low++;
        }

        int len = high-low+1;
        maxLen = Math.max(maxLen,len);

    }

    return maxLen;
    }
}