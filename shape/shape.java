import java.util.Scanner;
public class shape {
  public static void main(String[] args) {
    Scanner uu=new Scanner(System.in);
    System.out.print("enter your choice");
    System.out.print("\n 1.square");
    System.out.print("\n 2.circle");
    System.out.print("\n 3. triangle");
    System.out.print("\n enter shape(1/2/3/4):");
    int choice=uu.nextInt();
    double result=0;


    switch(choice){
      case 1:
        square();
       /*System.out.println(square());
       double result1= square();
       System.out.println("area of square:"+result1+"sq.units");
       /*by using void method directly called square method.....by using double method we use return type
        */


      break;

      case 2:
        circle();
      break;

      case 3:
        triangle();
      break;
  }

  }
  
  public static void square(){
    Scanner uu=new Scanner(System.in);
    System.out.print("enter a:");
    int a =uu.nextInt();
    System.out.print("square="+a*a+"sq.units");


  }
  /*
    public static double square(){
      Scanner uu=new Scanner(System.in);
      System.out.print("enter a:");
      int a=uu.nextInt();
      return a*a ;
     withou using void method ....by using double method
    }
    */
  public static void circle(){
    Scanner vv = new Scanner(System.in);
    System.out.println("r:");
    double r= vv.nextDouble();
    System.out.println("circle="+3.14*r+"sq.units");
  }
  public static void triangle(){
    Scanner ee=new Scanner(System.in);
    System.out.print("l");
    int l = ee.nextInt();
    System.out.println("h:");
    int h = ee.nextInt();
    System.out.print("triangle:"+0.5*l*h);


  }

}
