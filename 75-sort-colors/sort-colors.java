class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        int middle = 0;

        while(start <= end){
            if(nums[start] == 0)
            {
                swap(nums,start,middle);
                start ++;
                middle ++;
            }
            else if(nums[start] == 2)
            {
                swap(nums,start,end);
                end --;
            }
            else
            {
                start++;
            }
        }
    }
    public void swap (int nums[],int num1,int num2){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}