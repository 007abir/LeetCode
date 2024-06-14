class Solution {
    public int minIncrementForUnique(int[] A) {
        if(A.length == 0)
            return 0;
        int result = 0;
        Arrays.sort(A);
        int highestTillNow = A[0];
        
        for(int i = 1; i<A.length; i++){
            if(A[i] <= highestTillNow){
                result += (highestTillNow-A[i]+1);
                highestTillNow++; 
            }
            else
                highestTillNow = A[i];
        }
        return result;
    }
}