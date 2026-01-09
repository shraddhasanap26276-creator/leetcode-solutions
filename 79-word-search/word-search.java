class Solution {
    public boolean exists( char[][] board, int i , int j, int idx, char[] word_arr){
        //if the char if out of board then it returns false 
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == '*' || board[i][j] != word_arr[idx])      
         return false;
        if(idx == word_arr.length-1) return true;
        //If we are finding anychar then in the next step we alredy search all four char arounfd that specific char so now if we search again the anychar among that four then it becomes double search to that specific char to avoid that here we are doing the those char who are already search we put there '*' .
        char ch = board[i][j];
        board[i][j] = '*';
         //to find all four char arounf the one specific character
        boolean result  = exists(board,i+1,j,idx+1,word_arr) ||
                          exists(board,i-1,j,idx+1,word_arr) ||
                          exists(board,i,j+1,idx+1,word_arr) ||
                          exists(board,i,j-1,idx+1,word_arr);
                          board[i][j] = ch;
                          return result;
    }
    public boolean exist(char[][] board, String word) {
      char[] word_arr = word.toCharArray();
        for(int i =0 ; i < board.length; i++){
            for(int j =0 ;j < board[0].length; j++){
                if(board[i][j] == word_arr[0] && exists(board,i,j,0,word_arr)){
                    return true;
                }
            }
        }
        return false;
    }
}