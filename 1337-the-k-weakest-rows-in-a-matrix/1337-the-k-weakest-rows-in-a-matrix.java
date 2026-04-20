class Solution {
    static class Row implements Comparable<Row> {
        int soldiers ;
        int idx;
        Row( int soldiers, int idx){
            this.soldiers = soldiers;
            this.idx = idx;

        }
        @Override
        public int compareTo(Row r2){
            if(this.soldiers == r2.soldiers){
                return this.idx-r2.idx; //samaller index first
            }else{
                return this.soldiers-r2.soldiers; //fewer soldiers first
            }
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue <Row> pq = new PriorityQueue<>();
        //step 1 Count Soldier

        for(int i = 0; i< mat.length; i++){
            int count = 0;
            for( int j = 0; j<mat[0].length; j++){
                count = count + mat[i][j];

            }
            pq.add(new Row(count,i));
        }

        //step 2 Get KthWeakest

        int[] res = new int[k];
        for ( int i = 0; i<k; i++){
            res[i] = pq.poll().idx;
        }


        return res;

    }
}