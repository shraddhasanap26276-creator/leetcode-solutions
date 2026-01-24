class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        int length = groupSizes.length;
        for(int i = 0; i< length; i++){
            int size = groupSizes[i];
            List<Integer> temp = map.getOrDefault(size,new ArrayList<>());
            temp.add(i);
            map.put(size,temp);

            if(temp.size() == size){
                result.add(temp);
                map.remove(size);
            }
        }
        return result;
    }
}