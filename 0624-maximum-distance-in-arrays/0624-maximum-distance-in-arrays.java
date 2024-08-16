class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int size=arrays.size();
        int min=arrays.get(0).get(0);
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        int maxDistance=0;
        for(int i=1;i<size;i++){
            List<Integer> list=arrays.get(i);
            int diff1=Math.abs(max-list.get(0));
            int diff2=Math.abs(list.get(list.size()-1) - min);
            maxDistance=Math.max(maxDistance,Math.max(diff1,diff2));
            min=Math.min(min,list.get(0));
            max=Math.max(max,list.get(list.size()-1));
        }
        return maxDistance;
    }
}