class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        
        int minIdx = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[minIdx].length() > strs[i].length()) {
                minIdx = i;
            }
        }
        
        for (int i = 0; i < strs[minIdx].length(); i++) {
            char ch = strs[minIdx].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (ch != strs[j].charAt(i)) {
                    return strs[minIdx].substring(0, i);
                }
            }
        }
        
        return strs[minIdx];
    }
}