class Solution {
    public boolean isAnagram(String s, String t) {
        int str1= s.length();
        int str2 = t.length(); 
        if(str1 != str2){
            return false;
        }
        else{
            int count [] = new int[26];

            for(int i= 0 ; i< str1; i++){
                count[s.charAt(i) - 'a']++;
            }

            for(int i = 0; i< str2; i++){
                 count[t.charAt(i) - 'a']--;
            }

            for(int i =0;i<count.length;i++){
                if(count[i] != 0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}