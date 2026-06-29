package LeetCode;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0, prefix.length()-1);
                if(prefix.length()==0) return "";
            }
        }
        return prefix;
    }
}

//or
/*
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length ==0) return "";
        int minLen = Integer.MAX_VALUE;
        for(String s: strs){
            minLen = Math.min(minLen, s.length());
        }
        int i=0;
        while(i<minLen){
            for(String s: strs)
                if(s.charAt(i)!=strs[0].charAt(i)) return strs[0].substring(0, i);
            i++;
        }
        return strs[0].substring(0, i);
    }
}


*/
