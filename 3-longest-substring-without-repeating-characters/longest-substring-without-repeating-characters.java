class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int maxlen = 0;
        HashMap<Character,Integer> map = new HashMap <>(); 
        for(int right=0; right<n;right++){
            char ch = s.charAt(right);
            
            if(map.containsKey(ch)){
                left  = Math.max(left , map.get(ch)+1);
                }//char repeate i.e we get the duplicate at tha time the left works
            
            map.put(ch,right);//current character update.
            
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}