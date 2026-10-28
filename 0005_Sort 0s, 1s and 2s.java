class Solution {
    public void sort012(int[] arr) {
        // code here
        int zero=0;
        int one=0;
        int two=0;
        //read
        for(int i=0;i<arr.length;i++)
        {
            switch(arr[i])
            {
            case 0:zero++;break;
            case 1:one++;break;
            case 2:two++;break;
            }
        }
        
        int n=0;
            while(zero!=0)
            {
                arr[n++]=0;
                zero--;
            }
            while(one!=0)
            {
                arr[n++]=1;
                one--;
            }
            while(two!=0)
            {
                arr[n++]=2;
                two--;
            }
            
        
        
    }
}
