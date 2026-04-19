class Solution {
    public int[][] kClosest(int[][] points, int k) {
       Arrays.sort(points,(p1,p2) -> euclideanDist(p1)-euclideanDist(p2));

       return Arrays.copyOfRange(points,0,k); 
    }

    private int euclideanDist( int[]  points){
        return points[0]*points[0] + points[1]*points[1];
    }
}