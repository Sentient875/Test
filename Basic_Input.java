import java.util.Scanner;

public class Basic_Input {
    
public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    System.out.println("What is your name?");

    String userName = myScanner.nextLine();
    int number = myScanner.nextInt();
    System.out.println("Hello" + userName);

    myScanner.close();

}
}
