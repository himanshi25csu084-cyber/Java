public class numberreversal {
    int n=0;
    int reverse;
    public int reverseno(int nor){
       while(nor>0){
      n =nor%10;
      reverse=(reverse*10)+n;
    nor=nor/10; 
        } return reverse;
   }  
    }

