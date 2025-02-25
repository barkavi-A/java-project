import java.util.Scanner;

public class exp1 {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);
        System.out.println("enter ur age:");
        int age =rr.nextInt();
        System.out.print("salary:+$");
        int salary=rr.nextInt();
        System.out.print("score:");
        int score=rr.nextInt();
        if(age>=21 && salary >=25000 && score >= 700){
            System.out.print("loan qualifies");

        }else{
            System.out.print("not available");
        }
    }

}
