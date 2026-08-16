public class primeno {
    static boolean isPrime(int num){
        if(num<2){
            return false;}
        else{
            for(int i=2;i<num;i++){
              if ((num%i)==0){
             return false;}
        }   }
      return true;
        
   
}}
