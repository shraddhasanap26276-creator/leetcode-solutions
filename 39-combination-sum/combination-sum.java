class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        generateCombination(candidates,target, 0 , new ArrayList<Integer>());
        return result;
    }
    void generateCombination(int[] candidates, int curTarget, int position ,List<Integer> curCombination){
        if(curTarget == 0){
            result.add(new ArrayList<>(curCombination));
            return;
        }
        if(position == candidates.length){
            return;
        }
        //candidates = [2,3,6,7] cutTarget = 7
        //curcombination = [] geneATEcOMBINATIONS(5,0,[2])
        if(candidates[position]<= curTarget){
          curCombination.add(candidates[position ]);
          generateCombination(candidates,curTarget-candidates[position],position,curCombination);
          curCombination.remove(curCombination.size()-1);
          
        }
        generateCombination(candidates,curTarget,position+1,curCombination);
    }
}