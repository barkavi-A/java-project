
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner yr = new Scanner(System.in);
        System.out.println("enter year=");
        int year = yr.nextInt();
        boolean leap_yr = false;


        if (year % 400 == 0) {
            System.out.println("leap year");
        }
        else if(year % 4==0 && year % 100 !=0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
