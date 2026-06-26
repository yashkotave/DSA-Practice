class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int totalContainers = n * n;
        int weightAllowed = maxWeight / w;
        return Math.min(totalContainers, weightAllowed);
    }
}