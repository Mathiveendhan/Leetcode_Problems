public class Solution {
    void dfs(int source, List<List<Integer>> rooms, boolean[] visited) {
        visited[source] = true;
        for (int neighbour : rooms.get(source)) {
            if (!visited[neighbour]) {
                dfs(neighbour, rooms, visited);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(0, rooms, visited);
        for (int i = 0; i < rooms.size(); i++) {
            if (!visited[i]) {
                return false; 
            }
        }
        return true; 
    }
}