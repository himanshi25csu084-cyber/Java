public class ArrayStatistics {
    public static int sum(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int avg(int[] arr)
    {  
        int avg;
        int sum=sum(arr);
        avg=sum/(arr.length);
        return avg;
    }
    public  int min(int[] arr)
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
           if(arr[i]<min)
           {
           min=arr[i];
          
           }
        }
        return min;
    }
     public int max(int[] arr)
    {
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
           if(arr[i]>max)
           {
           max=arr[i];
        
           }
        }
        return max;
    }
    public static int counte(int []arr)
   {
        int even=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
               even++;
            }
        }
        return even;
    
   }
   public static int negative(int []arr)
   {
        int n=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
               n++;
            }
        }
        return n++;
   }

}
 