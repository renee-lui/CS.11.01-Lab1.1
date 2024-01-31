import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        int dateableAge = age/2 +7;
        System.out.println("You should date someone "+ dateableAge);

    }
}