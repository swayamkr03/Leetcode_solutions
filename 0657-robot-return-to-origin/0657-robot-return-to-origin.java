class Solution {
    public boolean judgeCircle(String moves) {
        int[] ans=new int[2];

        for(char c:moves.toCharArray()){
            if(c=='U'){
                ans[1]++;
            }else if(c=='D'){
                ans[1]--;
            }else if(c=='L'){
                ans[0]--;
            }else{
                ans[0]++;
            }
        }
        if(ans[0]!=0 || ans[1]!=0){
            return false;
        }
        return true;
    }
}