
class Solution {

    public String format(String s){
    s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    return s;
    }
//o(N) n=>len of string
    public boolean isPalindrome(String s) { //our method signature
    //it is public means we can use it after creating objects 
    //String s -> immutable once it is defined we cant chang eit

        //so we need to ingroe the non alpha numeric
        //if it is empty-> true -> reject
        //if it a single character -> false ;
        //process (s)-> 
        s=format(s);
        int start =0;
        int end =s.length()-1;
        while(start<=end){
           if(s.charAt(start)!=s.charAt(end)){
                    return false;
           }    
        start++;
        end--;
    }

    return true;
        
    }
}
