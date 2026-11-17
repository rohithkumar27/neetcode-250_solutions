
class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String ref = strs[0];
        int pt = 0;

        while (pt < ref.length()) {

            for (int i = 1; i < strs.length; i++) {

                if (pt >= strs[i].length() ||
                    strs[i].charAt(pt) != ref.charAt(pt)) {

                    return ref.substring(0, pt);
                }
            }
            
            pt++;
        }

        return ref;
    }
}



/*

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        o(nlogn)
        + o(minszie(val))
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i =0; // pointer to compare
        while(i<first.length() && i<last.length()){
            if(first.charAt(i) == last.charAt(i))
                i++;
            else 
                break;
        }
        return first.substring(0,i);
        
    }
}

*/


//