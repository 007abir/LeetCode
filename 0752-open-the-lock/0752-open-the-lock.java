class Solution {
    public int openLock(String[] deadends, String target) {
        HashMap<String, Integer> map= new HashMap<>();//deadend -- index
        for(int i= 0; i< deadends.length; i++)
            map.put(deadends[i], i);
        
        HashSet<String> visited= new HashSet<>();//visited set tro keep track of the node visited and to prevent cycle 
        Queue<String> q= new ArrayDeque<>();
    
        int level= 0;
        
        q.offer("0000");//adding the starting node to the queue(starting pattern)
        while(!q.isEmpty())
        {//r m* w a*
            int size= q.size();//polling constraint 
            while(size -- >0)
            {
                String temp= q.poll();
                
                if(temp.equals(target))
                   return level;//when we reached to nour destination node(lock number)
                
                if(map.containsKey(temp) == true)
                    continue;//wrong path(reached deadend)
                
                if(visited.contains(temp) == true)
                    continue;//cycle
                else
                    visited.add(temp);//marking the current node as visited, if not visited 
                
                StringBuilder sb= new StringBuilder(temp);//using StringBuilder to modify the current string, since it is mutable
                for(int i= 0; i< 4; i++)
                {
                    char digit= sb.charAt(i);//extracting the current digit 
                    
                    String str1= temp.substring(0, i)+ (digit == '9' ? 0: (digit-'0'+1))+ temp.substring(i+1);//clockwise
                    
                    String str2= temp.substring(0, i)+ (digit == '0' ? 9: (digit-'0'-1))+ temp.substring(i+1);//anticlockwise
                    
                    //adding the valid adjacent pattern pattern 
                    if(!visited.contains(str1) && !map.containsKey(str1))
                        q.offer(str1);
                    
                    if(!visited.contains(str2) && !map.containsKey(str2))
                        q.offer(str2);
                }
            }
            level+= 1;//increasing the current level 
        }
        return -1;//when we cannot reach our destination node 
    }
}