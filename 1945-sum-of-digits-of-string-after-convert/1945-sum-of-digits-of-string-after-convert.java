class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int x=(int)(s.charAt(i)-96);
            while(x!=0){
                int rem=x%10;
                sum+=rem;
                x=x/10;
            }
        }
        k--;
        while(k!=0){
            int x=sum;
            sum=0;
            while(x!=0){
                int rem=x%10;
                sum+=rem;
                x=x/10;
            }
            k--;
        }
        return sum;
    }
}