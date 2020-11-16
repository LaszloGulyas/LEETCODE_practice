public class Solution {

    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0) {
            return "";
        }

        int limit = strs[0].length();
        int wordCount = strs.length;

        String prefix = "";

        for(int i=1; i<strs.length; i++) {

            if(strs[i].length() == 0) {
                return "";
            }

            if(strs[i].length() < limit ) {
                limit = strs[i].length();
            }
        }

        for(int i=0; i<limit; i++) {

            for(int j=0; j<wordCount-1; j++) {

                if(strs[j].charAt(i) != strs[j+1].charAt(i)) {
                    return prefix;
                }
            }
            prefix += strs[0].charAt(i);
        }
        return prefix;
    }
}
