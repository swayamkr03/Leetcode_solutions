class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        int total=0;
        int assigned=0;

        for(char c:word.toCharArray()){
            freq[c-'a']++;
        }

        Arrays.sort(freq);

        for(int i=25;i>=0;i--){
            if(freq[i]==0)break;

            int cost=assigned/8+1;
            total+=freq[i]*cost;
            assigned++;
        }
        return total;

    }
}