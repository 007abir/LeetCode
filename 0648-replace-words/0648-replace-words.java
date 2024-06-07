class Solution {
    public String replaceWords(List<String> roots, String sentence) {
        Set<String> set = new HashSet();
        for (String root: roots) 
            set.add(root);
        StringBuilder ans = new StringBuilder();
        String word[] = sentence.split(" ");
        for (int j=0;j<word.length;j++) {
            String prefix = "";
            for (int i=1; i<=word[j].length();++i) {
                prefix = word[j].substring(0, i);
                if (set.contains(prefix)) 
                    break;
            }
            if(ans.length()>0) 
                ans.append(" ");
            ans.append(prefix);
        }
        return ans.toString();
    }
}