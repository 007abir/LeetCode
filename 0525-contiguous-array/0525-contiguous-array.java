class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) nums[i]=-1;
        }
        
        //find the largest subarray with sum 0
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0; int maxLength = 0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(sum==0){
                maxLength = Math.max(i+1, maxLength);
            }
            if(map.containsKey(sum)){
                maxLength = Math.max(maxLength, i-map.get(sum));
            }
            else map.put(sum, i);
        }
        return maxLength;
    }
}