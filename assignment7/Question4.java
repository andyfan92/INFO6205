package assignment7;

import java.util.Arrays;

public class Question4 {
    public boolean isAnagram(String s, String t) {
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
}
