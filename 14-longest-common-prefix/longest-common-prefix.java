class Solution {
    public String longestCommonPrefix(String[] strs) {
        //sort the arrya
        //alphabetical
        //frist string and last string is compare one by one 
        //correct aphabetical order:- bat,band,bank,bag
        ///cpmpere bat and bag
        //result :- ba
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        int n = strs.length;
        //first string extract 
        char[] first = strs[0].toCharArray();
        //last string 
        char[] last = strs[n-1].toCharArray();

        for(int i = 0 ;i< first.length; i++){
            if(first[i] != last[i])
            break;

            result.append(first[i]) ;
        }
        return result.toString();
    }
}