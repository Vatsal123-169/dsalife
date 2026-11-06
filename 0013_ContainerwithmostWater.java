class Solution {
    public int maxArea(int[] arr) {
        int head =0;
        int tail =arr.length-1;
        int maxA=0;
        while(head!=tail)
        {
            maxA=Math.max(maxA,(Math.min(arr[head],arr[tail]))*(tail-head));
            if(arr[head]>=arr[tail])tail--;
            else head++;
        }
        return maxA;
    }
}