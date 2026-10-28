class Solution {
    public int getSecondLargest(int[] arr) {
        
       int l=arr[0];
       
        for(int i=1;i<arr.length;i++)
        {
            
            if(arr[i]>l)
            {
                l=arr[i];
            }
        }
      
        int sl=-1;
        for(int j=0;j<arr.length;j++)
        {
          
         if(arr[j]>sl&&arr[j]!=l)   
         sl=arr[j];
        
        }
        return sl;
    }
}
