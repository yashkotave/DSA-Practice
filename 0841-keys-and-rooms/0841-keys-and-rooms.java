class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited =  new boolean[n];
        bfs(rooms,0,visited);
        for(boolean room : visited){
            if(!room) return false;
        }
        return true;
    }
    public void bfs(List<List<Integer>> graph, int start, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int room = q.poll();
            for(int key : graph.get(room)){
                if(!visited[key]){
                    visited[key] = true;
                    q.offer(key);
                }
            }
        }
    }
}