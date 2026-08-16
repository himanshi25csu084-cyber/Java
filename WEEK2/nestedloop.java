public class nestedloop {
    public void patternA(int a){
  for(int i=0;i<a;i++){
    for (int j=0;j<a ;j++){
        System.out.print("*");
    }
        System.out.println();
    }}
 public void patternB(int b){
    for(int i=0;i<b;i++){
         for (int j=0;j<=i ;j++){
             System.out.print("*");
            }
        System.out.println();
    }
}
public void patternC(int c){
    for(int i=1;i<=c;i++){
        for(int j=1;j<=i;j++) {
              System.out.print(j);
        }  System.out.println();
     }
}
public void patternD(int d){
    for(int i=1;i<=d;i++){
        for(int j=1;j<=i;j++) {
              System.out.print(i);
        }  System.out.println();
     }
}
public void patternE(int e){
  for(int i=e;i>0;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    } System.out.println();
  }
}

}
