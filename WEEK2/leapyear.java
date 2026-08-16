public class leapyear {
    public boolean isleap(int year){
        if(year%400==0 ||(year%4==0 &&year%100!=0)){
            return true;

        }
        return false;
    }
}
