double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size){
    int i,k=0,j;
    int m=nums1Size;
    int n=nums2Size;
    int nums[m+n];
    for(i=0;i<m;i++){
        nums[k]=nums1[i];
        k++;
    }
    for(i=0;i<n;i++){
        nums[k]=nums2[i];
        k++;
    }
    for(i=0;i<k;i++){
        for(j=0;j<k-i-1;j++){
            if(nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]= temp;
            }
        }
    }
    if((m+n)%2==0){
        int z=(m+n)/2;
        int e=nums[z];
        int q=nums[z-1];
        if(e==0 && q==0){
            return 0.0;
        }
        float ans=((float)e+(float)q)/2;
        return ans;
    }
    else{
        int z=(m+n)/2;
        float ans=((float)nums[z]);
        return ans;
    }
}