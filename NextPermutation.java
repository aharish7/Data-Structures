class Solution {
    public void nextPermutation(int[] nums) {
        
        int end=nums.length-1;
        int r=end;
        
        while(r>0){
            
            int l=r-1;          
            if(nums[r]>nums[l]){
                
                if(r==end){
                   swap(nums,l,r);
                   break;
                }
              
                int i=end;                 
                while(nums[i]<=nums[l])
                   i--;
                       
                swap(nums,l,i);
                if(nums[r]>nums[end])              
                  reverse(nums,r,end);
                break;
            }
            r--;
        }        
        if(r==0 && nums[0]>nums[end])
           reverse(nums,0,end);       
    }
    
    public static void reverse( int[] arr,int l, int r){
        
        while(l<r){           
          int temp=arr[l];
          arr[l]= arr[r];
          arr[r]=temp;
          l++;
          r--;         
        }
    
    }
     public static void swap( int[] arr,int m, int n){

        int temp=arr[m];
        arr[m]= arr[n];
        arr[n]=temp;
        
     }
}
