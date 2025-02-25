import java.util.Scanner;

public class exp3 {
    public static void main(String[] args) {
        Scanner rr=new Scanner(System.in);
        System.out.println("bill amount:");
        int amount=rr.nextInt();
    if(amount>=500){
        double bill=(amount*20)/100.0;
        double discount=amount-bill;
        System.out.println("totalamount:"+discount);
    }else if(amount>=200&&amount<500){
        double bill=(amount*10)/100.0;
        double discount=amount-bill;
        System.out.println("total amount:"+discount);
    }else{
        System.out.println("no discount");
    }

}
}