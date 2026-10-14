class Solution {
    static boolean isPrime(int n) {
        // code here
        
        for(int i=2;i<n-1;i++)
        {
            if(n%i==0)return false;
        }
        if(n==1){return false;}
        
        return true;
    }
}
