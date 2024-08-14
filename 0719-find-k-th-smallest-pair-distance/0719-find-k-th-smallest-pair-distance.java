class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int low=0;
        int high=nums[n-1]-nums[0];
        
        while(low<high){
            int mid=low+(high-low)/2;
            if(condition(nums,mid)>=k)
                high=mid;
            else
                low=mid+1;
        }
        return low;
    }
    
    
    private int condition(int[] nums ,int mid){
        int count=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            while(nums[right]-nums[left]>mid)
                left++;
            count+=right-left;
        }
        return count;
    }
}