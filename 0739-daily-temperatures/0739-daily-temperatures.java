class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] pre=new int[t.length];
        int n=t.length;

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && t[i]>t[st.peek()]){
                int prevIndex=st.pop();
                pre[prevIndex]=i-prevIndex;
            }
            st.push(i);
            
        }
        return pre;
    }
}