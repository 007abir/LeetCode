class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> inter=new ArrayList<>();
        for(int i:nums2){
            if(map.containsKey(i)&&map.get(i)>0){
                inter.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int index=0;
        int[] result=new int[inter.size()];
        for(int i:inter){
            result[index++]=i;
        }
        return result;
    }
}