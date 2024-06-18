class Solution {
    public int maxProfitAssignment(int[] diff, int[] pro, int[] work) {
        int maxProfit=0;
        Map<Integer,Integer> map=new HashMap<>(); 
        for(int i=0;i<pro.length;i++){
            if(map.get(pro[i])!=null && map.get(pro[i])<diff[i]){
                continue;
            }
            map.put(pro[i],diff[i]);
        }
        Arrays.sort(pro);
        Arrays.sort(work);
        int w=work.length-1;
        int p=pro.length-1;
        while(w>=0 && p>=0) {
            if(map.get(pro[p])<=work[w]){
                maxProfit+=pro[p];
                w--;
            } else{
                p--;
            }
        }
        return maxProfit;
    }
}