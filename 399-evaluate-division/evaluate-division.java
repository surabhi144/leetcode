class Solution {
    public double dfs(String a, String b, Map<String, Map<String, Double>> mp, Set<String> visited, double temp){
        if(!mp.containsKey(a))
         return -1;
        if(a.equals(b))
         return temp;
        visited.add(a); 
        for(Map.Entry<String, Double> entry : mp.get(a).entrySet()){
            if(visited.contains(entry.getKey()))
             continue;
            double ans = dfs(entry.getKey(), b, mp, visited, temp*entry.getValue());
            if(ans != -1)
             return ans;
        } 
        return -1;
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> mp = new HashMap<>();
        for(int i = 0; i < equations.size(); i++){
            String varA = equations.get(i).get(0);
            String varB = equations.get(i).get(1);
            double quo = values[i];
            mp.putIfAbsent(varA, new HashMap<>());
            mp.putIfAbsent(varB, new HashMap<>());
            mp.get(varA).put(varB, quo);
            mp.get(varB).put(varA, 1/quo);
        }

        double[] answer = new double[queries.size()];

        for(int i = 0; i < queries.size(); i++){
            String varA = queries.get(i).get(0);
            String varB = queries.get(i).get(1);
            answer[i] = dfs(varA, varB, mp, new HashSet<>(), 1);
        }
        return answer;
    }
}