class Solution {
    int missingNum(int arr[]) {
        // code here
       int sum=0;
        for(int i=1;i<arr.length+2;i++)
        {
            sum+=i;
        }
        for(int j=0;j<arr.length;j++)
        {
            sum-=arr[j];
        }
        return sum;
    }
}
