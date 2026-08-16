public class gradingsy {
public String system(int mark){
    if(mark>0){
    if (mark<=100 && mark>=80){
        return "Distinction";
    }
    else if(mark<=79 && mark >=70){
        return "merit";
    }
    else if(mark>=50 && mark<69){
        return "Pass" ;
    }
   else if(mark<50&& mark>0) {
    return "fail";
   }
   else{
    return "out of range";
   }

} 
else{
    return "negative";
}
  }
}