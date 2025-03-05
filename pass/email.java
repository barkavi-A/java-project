
import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);
        String[] email = {"kavi33@gmail.com" , "id33@gmail.com" , "war6@gmail.com"};
        System.out.print("enter gmail:");
        String gmail = rr.nextLine();

        String [] password = {"12345678","abcdefgh","abcd1233"};
        System.out.print("enter password:");
        String enterpassword = rr.nextLine();



        boolean emailExists = false;
        for (int i = 0; i < email.length; i++) {
            if (emails[i].equals(gmail) && passwords[i].equals(enterPassword)) {
                emailExists = true;
                break;
            }
        }
        if (emailExists) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid email or password.");
        }

        
    }
    public static String checkpassword(String password){
        int strengthscore = 0 ;
        if( password.length()>=8){
            strengthscore++;
        }if(password.matches(".*[0-9]*.")){
            strengthscore++;
        }
        if(password.matches(".*[A-Z]*.")){
            strengthscore++;
        }
        if(password.matches(".*[a-z]*.")){
            strengthscore++;
        }
        if(email.equals(gmail) && password.equals(password)){
            System.out.print("already exist pls try new one");
        }
        else if(strengthscore>2){
            System.out.println("weak try better");

        }else if(strengthscore == 2 || strengthscore ==3){
            System.out.println("moderate try better");
        }else{
            System.out.println("strong");
        }

    }}
            
        
            


    
        
    


