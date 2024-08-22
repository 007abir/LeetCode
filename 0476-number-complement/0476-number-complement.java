class Solution {
    public int findComplement(int num) {
        int i=0,sum=0;
        while(num!=0){
            int rem=num%2;
            if(rem==0){
                sum=sum+(int)Math.pow(2,i);
            }
            num=num/2;
            i++;
        }
        return sum;
    }
}