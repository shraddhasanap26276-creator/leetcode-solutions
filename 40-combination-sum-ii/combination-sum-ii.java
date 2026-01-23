class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);   // sort to handle duplicates

        findComb(0, candidates, target, ans, new ArrayList<>());

        return ans;
    }

    private void findComb(int ind, int[] arr, int target,
                          List<List<Integer>> ans, List<Integer> ds) {

        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {

            // skip duplicates
            if (i > ind && arr[i] == arr[i - 1]) continue;

            // no need to continue if number exceeds target
            if (arr[i] > target) break;

            ds.add(arr[i]);   // pick
            findComb(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);  // backtrack
        }
    }
}
