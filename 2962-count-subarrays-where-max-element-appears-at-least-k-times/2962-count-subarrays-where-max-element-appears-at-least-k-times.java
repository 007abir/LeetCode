class Solution {
    public long countSubarrays(int[] nums, int k) {
        int a=Arrays.stream(nums).max().getAsInt();
        int n=nums.length,cur=0,i=0;
        long res=0;
        for (int j=0;j<n;++j){
            cur+=nums[j]==a?1:0;
            while(cur>=k)
                cur-=nums[i++]==a?1:0;
            res+=i;
        }
        return res;
    }
}