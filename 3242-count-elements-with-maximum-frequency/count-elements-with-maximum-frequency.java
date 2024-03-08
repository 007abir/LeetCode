class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        ArrayList<Integer> al = new ArrayList<>(hm.values());;
        Collections.sort(al);
        int res=0;
        int max=al.get(al.size()-1);
        for(int i=0;i<al.size();i++){
            if(al.get(i)==max)
                res+=max;
        }
        return res;
    }
}