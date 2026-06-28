class Solution {
    public boolean isPalindrome(String s) {
         int first=0;
         int last=s.length()-1;
         while(first<last){
            while (first < last &&
                   !Character.isLetterOrDigit(s.charAt(first))) {
                first++;
            }

            while (first < last &&
                   !Character.isLetterOrDigit(s.charAt(last))) {
                last--;
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
