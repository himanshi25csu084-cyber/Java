public class gcd {
    int gcd;
    public int greatestcommondivisor(int first,int second){
    for(int i=Math.min(first,second);i>0;i--){
        if(first%i==0 && second%i==0){
           gcd=i;
           break;
        }
    }

        return gcd; 

    }
}
