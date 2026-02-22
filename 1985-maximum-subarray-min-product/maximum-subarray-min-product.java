
class Solution {
    public int maxSumMinProduct(int[] nums) {

        int n = nums.length;
        long mod = 1000000007;

        // Step 1: Prefix sum
        long[] prefix = new long[n + 1];
        for(int i = 0; i < n; i++){
            prefix[i + 1] = prefix[i] + nums[i];
        }

        Stack<Integer> stack = new Stack<>();
        long max = 0;

        // Step 2: Monotonic increasing stack
        for(int i = 0; i <= n; i++){

            long current = (i == n) ? 0 : nums[i];

            while(!stack.isEmpty() && nums[stack.peek()] >= current){

                int index = stack.pop();

                int left = stack.isEmpty() ? 0 : stack.peek() + 1;
                int right = i - 1;

                long sum = prefix[right + 1] - prefix[left];
                long product = sum * nums[index];

                max = Math.max(max, product);
            }

            stack.push(i);
        }

        return (int)(max % mod);
    }
}