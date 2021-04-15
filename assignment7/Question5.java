package assignment7;

public class Question5 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String res = strs[0];
        for (String str : strs) {
            if (str.indexOf(res) == 0) {
                continue;
            }
            int j = res.length() - 1;
            for (; j > 0; j--) {
                if (str.indexOf(res.substring(0, j)) == 0) {
                    res = res.substring(0, j);
                    break;
                }
            }
            if (j == 0) {
                return "";
            }
        }
        return res;
    }
}
