class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        dfs(rooms, visited, 0);
        for(boolean room: visited){
            if(room == false)
             return false;
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms, boolean[] visited, int i){
        if(visited[i] == true || i >= rooms.size())
         return;

        visited[i] = true; 
        for(int j = 0; j<rooms.get(i).size(); j++){
            dfs(rooms, visited, rooms.get(i).get(j));
        } 
        return;
    }
}