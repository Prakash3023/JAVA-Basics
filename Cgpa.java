import java.util.Scanner;
public class Cgpa {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mark of 1st subject:");
         float a=sc.nextFloat();
        System.out.println("Mark of 2nd subject:");
        float b=sc.nextFloat();
        System.out.println("Mark of 3rd subject:");
        float c=sc.nextFloat();
float sum=a+b+c;
float p=sum/3;
double cgpa=p/9.5;
System.out.println("The cgpa of the student is:-"+cgpa);
 }
}
