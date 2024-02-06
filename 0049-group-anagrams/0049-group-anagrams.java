class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String i:strs){
            int c=0;
            char[] m=i.toCharArray();
            Arrays.sort(m);
            String temp=String.valueOf(m);
            if (map.containsKey(temp))
                map.get(temp).add(i);
            else{
                map.put(temp,new ArrayList<String>());
                map.get(temp).add(i);
            }
        }
        List<List<String>> res=new ArrayList<List<String>>();

        for(Map.Entry<String,List<String>> i:map.entrySet()){
            res.add(i.getValue());
        }
        return res;
    }
}