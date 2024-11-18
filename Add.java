import java.util.Scanner;

public class Add {
    public  static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st number");
    int a=sc.nextInt();
    System.out.println("Enter 2nd number");
    int b=sc.nextInt();
    System.out.println("Enter 3rd number");
    int c=sc.nextInt();
    int sum=a+b+c;
    System.out.println("The sum of the three number is:-"+sum);
    }

}
