import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger number = new BigInteger(scanner.nextLine());
        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(number) == -1 || i.compareTo(number) == 0; i=i.add(BigInteger.valueOf(1))) {

            if ( number.remainder(i).compareTo(BigInteger.valueOf(0))==0) {
                System.out.println(i);
                break;
            }
        }
        System.out.println("This is solution when \"number\" is BigInteger!");
    }
}