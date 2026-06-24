class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> students = new ArrayList<>();
        for(int i=1; i<=n; i++){
            students.add(i);
        }
        int idx =0;
        while(students.size() > 1){
            idx = (idx + k - 1) % students.size();
            students.remove(idx);
        }
        return students.getFirst();
    }
}