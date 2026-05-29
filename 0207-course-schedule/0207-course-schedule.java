class Solution {
    public boolean canFinish(int course, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<course; i++){
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[course];
        for(int[] pre : prerequisites){
            int cur = pre[0];
            int preCourse = pre[1];
            adj.get(preCourse).add(cur);
            indegree[cur]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<course; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        int com = 0;
        while(!q.isEmpty()){
            int temp = q.poll();
            com++;
            for(int neigh : adj.get(temp)){
                indegree[neigh]--;
                if(indegree[neigh] == 0){
                    q.offer(neigh);
                }
            }
        }

        return com == course;
    }
}
