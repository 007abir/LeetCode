class Solution {
    public int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++)
        System.out.println(words[i]);
        return words[words.length-1].length();
    }
}