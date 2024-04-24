class Solution {
    public int tribonacci(int n) {
        int i3=0,i2=1,i1=1;
        while(n>0){
            int i4=i3+i2+i1;
            i3=i2;
            i2=i1;
            i1=i4;
            n--;
        }
        return i3;
    }
}