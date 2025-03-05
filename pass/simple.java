 import java.util.Scanner;
 public class simple
 {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        System.out.print("num1=");
        double num1=cal.nextDouble();
        System.out.print("num2=");
        double num2=cal.nextDouble();
        System.out.print("choice menu:");
        System.out.print("1.addition");
        System.out.print("2.subtraction");
        System.out.print("3.multiplication");
        System.out.print("4.division");
        System.out.print("enter yr choice(1/2/3/4):");
        int choice=cal.nextInt(); 
        double result=0;

        switch (choice) {
            case 1:
            result=num1 + num2;
            System.out.print("add="+result);
            break;
            case 2:
            result=num1 - num2;
            System.out.print("sub="+result);
            break;
            case 3:
            result= num1*num2;
            System.out.print("multiply="+result);
            break;
            case 4:
            if (num2 != 0){
            result=num1/num2;
            System.out.print("divide="+result);
            }else{
            
                System.out.print("error");
            }
            break;
        
            default:
            System.out.print("choice not occur");
                break;
        }




        
    }

}
