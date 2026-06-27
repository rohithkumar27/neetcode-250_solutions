class Solution {

    public void swap(char[] s,int first,int last){
        char temp=s[first];
            s[first]=s[last];
            s[last]=temp;

    }
    
    public void reverseString(char[] s) {
         int first=0;
         int last=s.length-1;
         while(first<last){
            swap(s,first,last);
            first++;
            last--;
    
         }
        
    }
}