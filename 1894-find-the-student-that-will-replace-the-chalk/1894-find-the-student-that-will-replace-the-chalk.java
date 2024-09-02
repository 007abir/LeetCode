class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long chalkSum=0;
        for(int i=0;i<chalk.length;i++)
            chalkSum+=chalk[i];
        int remainingChalk=(int)(k%chalkSum);
        for(int i=0;i<chalk.length;i++){
            if(remainingChalk<chalk[i])
                return i;
            remainingChalk-=chalk[i];
        }
        return 0;
    }
}