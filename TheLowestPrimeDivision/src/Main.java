import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Long number = Long.parseLong(scanner.nextLine());
        for (Long i = Long.valueOf(2); i <= number; i++) {
            if(number % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}