class Solution {
    public int hammingWeight(int n) {
        // Time Complexity: O(1)
        // Space Complexity: O(1) -> only one counter
        int cnt = 0;
        while (n != 0) {
            n = n & (n - 1);
            cnt++;
        }
        return cnt;

    }
}