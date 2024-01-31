import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        int pagenumberbyAge = 100-age;
        System.out.println("You should read at least "+ pagenumberbyAge + " pages of a book.");

    }
}
