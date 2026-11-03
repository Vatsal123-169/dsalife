class Solution {
    public int[] plusOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }

            arr[i] = 0;

        }
        if (arr[0] == 0) {
            int nr[] = new int[arr.length + 1];
            nr[0] = 1;
            return nr;
        }
        return arr;
    }
}