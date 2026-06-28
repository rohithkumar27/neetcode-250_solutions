class Solution {
    public boolean isPalindrome(String s) {
         int first=0;
         int last=s.length()-1;
         while(first<last){

            if(!Character.isLetterOrDigit(s.charAt(first))) {
                    first++;
                    continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(last))) {
                    last--;
                    continue;
            }

            if( Character.toUpperCase(s.charAt(first))== Character.toUpperCase(s.charAt(last))){
                first++;
                last--;
            }
            else{
                return false;
            }
         }

         return true;
    }
}
