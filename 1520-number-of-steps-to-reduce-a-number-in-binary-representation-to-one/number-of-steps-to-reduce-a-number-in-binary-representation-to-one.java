class Solution {
    public int numSteps(String s) {
        int countSteps=0;
        int carry=0;
        for(int i=s.length()-1;i>=1;i--){
            int rightMostBit=s.charAt(i)-'0';
            if((rightMostBit+carry)==1){
                carry=1;
                countSteps+=2;
            }
            else
                countSteps++;
        }
        return countSteps+carry;
    }
}