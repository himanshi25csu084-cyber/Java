import java.util.Scanner;
public class calculator {
     Scanner input=new Scanner(System.in);
    public void cal(int no){
        do{
            System.out.println("calculator with these menu choices:" );
             System.out.println("1.Add");
              System.out.println("2.Subtract");
               System.out.println("3.Multiply");
                System.out.println("4.Divide");
                 System.out.println("5.exit");
                 
                 System.out.println("enter choice ");
        int choice=input.nextInt();
        if (choice == 5) {
                System.out.println("Exit");
                break;}
        System.out.println("enter n1 ");
      int n1=input.nextInt();  
       System.out.println("enter n2");
       int n2=input.nextInt();

    switch(choice){
        case 1: System.out.println("add" + (n1+n2));
                break;
        case 2:   if(n1>n2) {
                 System.out.println("subtract"+ (n1-n2));
                break;}
                 else System.out.println("subtract"+(n2-n1));
                 break;
        case 3: System.out.println(" Multiply" +(n2*n1));
        break;   
        case 4: System.out.println("Divide"+(n1/n2));
        break;
        case 0: System.out.println("exit");
        break;
    
    }
 no--;
        }
while(no>0);
    }
}
