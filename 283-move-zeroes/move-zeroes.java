class Solution {
    public void moveZeroes(int[] nums) {
         int k = 0;  // position to place next non-zero

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap nums[i] and nums[k]
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;

                k++;
            }
        }
    }
}