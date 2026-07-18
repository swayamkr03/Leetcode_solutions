class Solution {
    public int compress(char[] chars) { 
        int index=0;
        int i=0;
        while(i<chars.length){
            char c=chars[i];
            int count=0;

            while(i<chars.length && c==chars[i]){
                count++;
                i++;
            }

            chars[index++]=c;
            if(count>1){
                String cnt=String.valueOf(count);
                for(char ch:cnt.toCharArray()){
                chars[index++]=ch;
                }
            }
        }   
        return index;
    }
}