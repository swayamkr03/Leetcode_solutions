class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int[] visited=new int[n];
        Queue<Integer> q=new LinkedList<>();
        int count=0;

        for(int i=0;i<n;i++){
            if(visited[i]==0){
                count++;
                q.offer(i);
                visited[i]=1;
                while(!q.isEmpty()){
                    int p=q.poll();
                    for(int j=0;j<isConnected.length;j++){
                        if(isConnected[p][j]==1 && visited[j]==0){
                            visited[j]=1;
                            q.offer(j);
                        }
                    }

                }

            }
        }
        return count;
    }
}