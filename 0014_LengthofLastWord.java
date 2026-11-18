
class Solution {
    public int lengthOfLastWord(String s) {
        int n = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                n++;
            if (n != 0 && s.charAt(i) == ' ')
                break;
        }

        return n;
    }
}