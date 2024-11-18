import java.util.Scanner;
public class ifelse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter password");
        int password=sc.nextInt();
        if(password==1000){
            System.out.println("Welcome");
        }
        else{
            System.out.println("wrong password");
        }
    }
}
