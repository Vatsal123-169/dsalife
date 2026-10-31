class Solution {
    public int singleNumber(int[] arr) {
       int r=0;
       for(int x:arr)r=r^x;
       return r;
    }
}