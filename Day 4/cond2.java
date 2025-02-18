
import java.util.Scanner;
public class cond2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("num 1");
        int num1=sc.nextInt();
        System.out.println("num 2");
        int num2=sc.nextInt();
        if (num1>num2) {
            System.out.println("num 1:"+num1);

        }else{
            System.out.print("num 2:"+num2);
        }

    }

}
