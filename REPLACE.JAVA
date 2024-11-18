import java.util.*;
public class tolowercase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sttring");
        String word=sc.nextLine();
        word=word.replace('','l');
        System.out.println(word);
   }
}
