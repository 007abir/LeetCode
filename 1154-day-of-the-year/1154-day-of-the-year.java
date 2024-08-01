class Solution {
    public boolean leapYear(int year){
        boolean leap=false;
        if (year%4==0){
          if(year%100==0){
            if(year%400==0)
              leap=true;
            else
              leap=false;
          }
          else
            leap=true;
        }
        else
          leap = false;
        return leap;
    }
    public int dayOfYear(String date) {
        int dd=Integer.parseInt(date.substring(8,10));
        int mm=Integer.parseInt(date.substring(5,7));
        int yy=Integer.parseInt(date.substring(0,4));
        System.out.println(dd+" "+mm+" "+yy);
        int[] dim={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int sum=0;
        for(int i=0;i<mm;i++)
            sum+=dim[i];
        if(leapYear(yy) && mm>2)
            sum+=1;
        return sum+dd;
    }
}