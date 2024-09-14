class Solution {
    public int longestSubarray(int[] nums) {
        int result=0,length=0,max=0;
        for(int i:nums)
            max=Math.max(max,i);
        for (int i:nums){
            if(i==max)
                result=Math.max(result,++length);
            else
                length = 0;
        }
        return result;
    }
}