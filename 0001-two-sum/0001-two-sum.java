class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int i,j;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(target==(nums[i]+nums[j])){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}