
import java.util.Scanner;
public class value {
public static void main(String[] args) {
    Scanner oo=new Scanner(System.in);
    int num=0;
    int evennum=0;
    int oddnum=0;
    System.out.print("enter number:");
    while(true){
    int n = oo.nextInt();
    if(n==0){
        break;
    }
    if(n<0){
        num += n;
    }
    else if(n%2==0){
        evennum += n;
    }
    else{
        oddnum += n;
    }
    }
    System.out.print("\nnegative:"+num);
    System.out.print("\npostive even:"+evennum);
    System.out.print("\npositive odd:"+oddnum);
}

}
