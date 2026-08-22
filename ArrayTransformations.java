public class ArrayTransformations {
    public int [] reverseInPlace(int[] values){
        int reverse;
        for(int i=0;i<(values.length)/2;i++){
            reverse=values[i];
values[i]=values[(values.length-1)-i];
values[(values.length-1)-i]=reverse;
        }  
        return values;
    }

    public int[] reversedCopy(int[] values){
        int reverses[]=new int[values.length];
for(int i=0;i<values.length;i++){
     reverses[i]=values[(values.length-1)-i];
} return reverses;
    }


    static int[] removeValues(int[] values, int target)
       { int count =0;
            for(int i=0;i<values.length;i++)
            {
                if(values[i]!=target){
                    count++;
 
                }
            }
           int []result =new int [count];int j=0;
for(int i=0;i<values.length;i++){
    if(values[i]!=target){
    result[j]=values[i];
 j++;
}
   
}  return result;
       }

int[] runningSum(int[] values){
    int [] sum=new int [values.length];
    sum[0]=values[0];
     for(int i=1;i<values.length;i++){

sum[i]=sum[i-1]+values[i];
     } return sum;
}

}
