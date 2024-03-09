class Solution {
    public int binarySearch(int arr[],int first,int last,int key){
        int mid=(first+last)/2; 
        while(first<=last){
            if(arr[mid]<key)
                first=mid+1;
            else if(arr[mid]==key)
                return 1;
            else
                last=mid-1;
            mid=(first+last)/2;
        }  
        return -1;
    }
        
    public int getCommon(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){ 
            int check=binarySearch(nums2,0,nums2.length-1,nums1[i]);
            if(check==1)
                al.add(nums1[i]);
        }
        if(al.isEmpty())
            return -1;
        Collections.sort(al);
        return al.get(0);
    }
}