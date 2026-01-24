class Solution {
public:
void dfs(vector<vector<int>>& image,int i ,int j , int newColour, int orgColour){
    if(i<0 || j<0 || i>= image.size() || j>= image[0].size() ||
    image[i][j] ==  newColour || image[i][j] != orgColour )
    {
        return ;
    }
    image[i][j] = newColour;

    dfs(image, i-1, j,newColour,orgColour);//top
    dfs(image,i+1, j, newColour,orgColour);//bottom
    dfs(image,i,j+1,newColour,orgColour);//right
    dfs(image,i,j-1,newColour,orgColour);//left

}
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) 
    { 
      dfs(image, sr, sc, color , image[sr][sc]);  

      return image;      
    }
};