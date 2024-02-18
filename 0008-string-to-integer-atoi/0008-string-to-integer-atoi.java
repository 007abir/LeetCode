class Solution {
    public int myAtoi(String s) {
        int n=s.length(),i=0,result=0,sign=1;
        while(i<n && s.charAt(i)==' ')
            i++;
        if(i<n && s.charAt(i)=='+'){
            sign=1;
            i++;
        }
        else if(i<n && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        while(i<n && 0<=(int)s.charAt(i)-'0' && (int)s.charAt(i)-'0'<=9){
            int digit=s.charAt(i)-'0';
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10)){
                return result=(sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE);
            } 
            result*=10;
            result+=digit;
            i++;
        }
        return result*sign;
    }
}