import java.util.Scanner;

public class marksprocessor { 
   public int Mark(){ int marks;
     do{
    Scanner input=new Scanner(System.in);
    marks=input.nextInt();
    } while(marks!=-1);
    return marks;
    }
    int count=0;
 boolean isValidMark(int marks){
if(marks>0 && marks<100){
    count++;
    return true;
}
return false;

}
int sum=0;
public int sum(int marks){
    for(int i=0;i<count;i++){
 sum+=marks;
} return sum;
}
public int average(int sum, int count){
    int avg=sum/count;
    return avg;
}
int max=0;
public int highest (int marks){
if(marks>max){
    max=marks;
} return max;
}
public String pass(int marks){
    if(marks>=50){
return "pass";
    }
   
        return "fail";
    
}
}
