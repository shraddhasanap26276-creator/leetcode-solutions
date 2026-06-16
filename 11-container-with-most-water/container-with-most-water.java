class Solution {
    public int maxArea(int[] height) {
        int maxwater = 0;
        int begin  = 0;
        int end = height.length - 1;
        while(begin < end){
            maxwater = Math.max(maxwater,((Math.min(height[begin],height[end]) * (end - begin))));

            if(height[begin] < height[end]){
                begin++;
            }
            else {
                end --;
            }
        }
        return maxwater;
    }
}