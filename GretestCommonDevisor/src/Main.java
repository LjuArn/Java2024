import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < inputCount; i++) {

            String inputTwoNumber = scanner.nextLine();
            String[] numbers = inputTwoNumber.split(" ");
            int firstNumber = Integer.parseInt(numbers[0]);
            int secondNumber = Integer.parseInt(numbers[1]);
            if (firstNumber > secondNumber) {
                for (int j = secondNumber; j >= 1; j--) {
                    if (firstNumber % j == 0 && secondNumber % j ==0 ){
                        System.out.println(j);
                        break;
                    }
                }
            } else {
                for (int j = firstNumber; j >= 1; j--) {
                    if (firstNumber % j == 0 && secondNumber % j ==0 ){
                        System.out.println(j);
                        break;
                    }
                }

            }
        }
    }
}