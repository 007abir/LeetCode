class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(Character.toString(ch)))
            return word;
        ArrayList<Character> al = new ArrayList<>();
        int count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                al.add(word.charAt(i));
                count++;
                break;
            }
            else{
                al.add(word.charAt(i));
                count++;
            }
        }
        Collections.reverse(al);
        StringBuilder sb =new StringBuilder("");
        for(int i=0;i<count;i++){
            sb.append(al.get(i));
        }
        for(int i=count;i<word.length();i++)
            sb.append(word.charAt(i));
        return sb.toString();
    }
}