
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

            // Move to the next character only after
            // checking all the strings
            pt++;
        }

        return ref;
    }
}


//