class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n=arr.length;
        if(n==0)return -1;
        int c=0;
    
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    if(++c>n/2)return arr[i];
                }
            }
            
            c=0;
        }
        return -1;
    }
}