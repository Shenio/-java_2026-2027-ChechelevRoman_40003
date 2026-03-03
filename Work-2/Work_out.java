import java.util.Scanner;
public class Work_output {
    public static void main() {
        System.out.println("please,write your name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " +name+ ", nice to meet you!");
    }
}