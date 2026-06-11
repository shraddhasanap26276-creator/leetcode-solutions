class Solution {
    public void moveZeroes(int[] nums) {
         int k = 0 ; // position to place next non-zero

        for (int i = 0 ; i< nums.length; i++) {
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
// initially k = 0 

//i=1 → swap(1,0) → [1,0,0,3,12]

//i=3 → swap(3,0) → [1,3,0,0,12]

//i=4 → swap(12,0) → [1,3,12,0,0]

//k works here here like a counter when it finds first zero it swap  and incese k to +1 i.e posititon of k incrememnt 
//second time when zero  when it finds the  it swap with non zero elelment and increent k +1 like wise it works 