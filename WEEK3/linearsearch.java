public class linearsearch {
    public boolean contains(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return true;
        }
        return false;
    }

    public int firstIndexOf(int[] arr, int target){
       for(int i=0;i<arr.length;i++){
        if(arr[i]==target)
             return i;
       }
      return 0;
    }
    
    public int lastIndexOf(int[] arr, int target){
       for(int i=arr.length-1;i>0;i--){
        if(arr[i]==target)
             return i;
       }
      return 0;
    }
    public int count(int[] arr, int target){
        int count=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==target)
            count++;
       }
      return count;
    }
}