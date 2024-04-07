class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {open.push(i);}
            else if(s.charAt(i) == '*') {star.push(i);}
            else {
                if(!open.isEmpty()) {open.pop();} // found matched '('with')'
                else if (!star.isEmpty()) {star.pop();} // match '*' with ')'
                else return false; // cannot find match
            }
        }

        // checking leftover on 2 stack
        while(!open.isEmpty()) { // we can have '*' leftover, but 'open' must run out 
            if(star.isEmpty()) {return false;} // '(' leftover
            else if (open.peek()<star.peek()){open.pop(); star.pop();} // '*'index > '(' index, matched
            else {return false;} // open>top, corner case
        }
        return true;
    }
}