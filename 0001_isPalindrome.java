class Solution {
    int c=0;
    public boolean isPalindrome(int x) {
    String s = "" + x;
    
    if (c >= s.length() / 2) {
        return true;                                   
    }
    if (s.charAt(c) != s.charAt(s.length() - 1 - c)) {
        return false;                                  
    }
    c++;
    return isPalindrome(x);                             
}
}
