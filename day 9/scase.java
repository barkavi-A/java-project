

import java.util.Scanner;
public class scase {
    public static void main(String[] args) {
        Scanner od=new Scanner(System.in);
        String num=od.nextLine();
        switch(num){
            case "A":
            
            System.out.println("ant");
            break;
            case "B":
           
                System.out.println("ball");
            
            break;
            case "C":

                System.out.println("cat");
            
            break;
            default:
            System.out.println("invalid");





        }
        
    }

}
