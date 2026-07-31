class Solution {
    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        int[] visited=new int[n];

        int dest=-1;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                dest=i;
                break;
            }
        }
        if(start>=n || dest==-1)return false;

        Queue<Integer> q=new LinkedList<>();

        q.offer(start);
        visited[start]=1;

        while(!q.isEmpty()){
            int p=q.poll();

            if(arr[p]==0)return true;

            int left=p-arr[p];
            if(left>=0 && visited[left]==0){
                
                q.offer(left);
                visited[left]=1;
            }

            int right=p+arr[p];

            if(right<n && visited[right]==0){
                
                q.offer(right);
                visited[right]=1;
            }

        }
        return false;
    }
}