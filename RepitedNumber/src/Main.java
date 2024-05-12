import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int countOfInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countOfInputs; i++) {

            int countOfNumbers = Integer.parseInt(scanner.nextLine());

            String inputNumbers = scanner.nextLine();
            String[] numbers = inputNumbers.split(" ");

            HashMap<Integer, String> countedNumbers = new HashMap<Integer, String>();
            
            for (int j = 0; j < countOfNumbers; j++) {
                countedNumbers.put(j, numbers[j]);
            }
            for (Integer j : countedNumbers.keySet()) {
                System.out.println("key: " + j + " value: " + countedNumbers.get(j));
            }

        }


        System.out.println("Hello world!");
    }
}