class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al1= new ArrayList<>();
        ArrayList<Integer> al2= new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
            al2.add(nums2[i]);
        for(int i=0;i<nums1.length;i++){
            if(al2.contains(nums1[i]) && !al1.contains(nums1[i]))
                al1.add(nums1[i]);
        }
        int[] arr= new int[al1.size()];
        for(int i=0;i<al1.size();i++)
            arr[i]=al1.get(i);
        return arr;    
    }
}