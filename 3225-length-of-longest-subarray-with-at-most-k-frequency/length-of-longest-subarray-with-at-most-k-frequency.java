class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int res=0,i=0;
        for (int j=0;j<nums.length;++j) {
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            while (hm.get(nums[j])>k)
                hm.put(nums[i],hm.get(nums[i++])-1);
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}