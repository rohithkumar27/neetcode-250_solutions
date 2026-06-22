class Solution {
    public boolean isValid(String str) {
        Deque<Character> dq= new ArrayDeque<>();
        for(char c:str.toCharArray()){
            if(c =='('|| c =='{'||c =='['){
                dq.push(c);

            }

            else{
                
            if(dq.isEmpty()){
                    return false;
            }

            else{
                    char s = dq.pop();
                    if(c ==')' && s !='(') return false;
                    else if(c =='}'&& s !='{') return false;
                    else if(c ==']'&& s !='[') return false;
                    
            }

            }
     
          
        }

        if(dq.isEmpty()) return true;

        return false;
        
    
}

}
