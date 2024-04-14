// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       int[] arr={-1,5,4,8,3,-3,4,5};
       int target=3;
       int res= getClosest(arr,target);
       System.out.println(res); 
        /*
        8
        n*n+1/2
        6*7= 42/2
        
        6+5+4+3+2+1=21
                    15
                    10
                    6
                    3
                    1
                    56
                
       -4 -3 -1 0 2 3 4 5 6
        
        -1 3 -3 = 1
        -1 3  4 =:6
        -1 3  5 = 7
        -1 -3 4 = 0
        -1 -3 5 = 1
        -1 4. 4 = 7
        ,3 -3 4 = 4
        3 -3 5  = 5
        3 4 5 = 12
        -3 4 5= 6
        0 1 1 4 5 6 6 7 7 12
        0 1 1 2 4 5 6 6 7 7 12
        
        d1=2
        d1=1
        
        1
        */

        
    }
    public static int getClosest(int[] nums, int target){   
        int n=nums.length;
        int n1=n-2;
        int n2=0;

        while(n1>0){
            n2=n2+(n1*(n1+1)/2);
            n1--;
        }

        int[] arr=new int[n2];
        Arrays.sort(nums);
        
        int c=0;
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
               arr[c]=nums[i]+nums[j]+nums[k];

               if(arr[c]==target)
                  return target;

               c++;
            }
          }
        }
 
        Arrays.sort(arr);
        int idx=Arrays.binarySearch(arr,target);

        if(idx>=0)
           return arr[idx];

        int i= (-idx)-1;

        if(i==n2)
           return arr[i-1]; 

        int d1= target-arr[i-1];
        int d2= arr[i] -target;

        return d1>d2?arr[i]:arr[i-1];
    }
    public static void print(int[] arr,int n){
         for(int i=0;i<n;i++)   
           System.out.print(" "+arr[i]);
    }
        
}
