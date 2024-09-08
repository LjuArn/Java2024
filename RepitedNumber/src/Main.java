import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countOfInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countOfInputs; i++) {

            int countOfNumbers = Integer.parseInt(scanner.nextLine());

            String inputNumbers = scanner.nextLine();
            String[] numbers = inputNumbers.split(" ");

            HashMap<String, Integer> countedNumbers = new HashMap<String, Integer>();

            for (int j = 0; j < countOfNumbers; j++) {

                if (countedNumbers.containsKey(numbers[j])) {
                    Integer value = countedNumbers.get(numbers[j]) + 1;
                    countedNumbers.put(numbers[j], value);
                } else {
                    countedNumbers.put(numbers[j], 1);
                }
            }

            int maxValue = Collections.max(countedNumbers.values());
            List<String> minKeyList = new ArrayList<>();

            for (String j : countedNumbers.keySet()) {
                if (countedNumbers.get(j) == maxValue) {
                    minKeyList.add(j);
                }
            }
            System.out.println(minKeyList);
            System.out.println(maxValue);
            System.out.println("Answer of test: " + Collections.min(minKeyList));

            for (String j : countedNumbers.keySet()) {
                System.out.println("key: " + j + " value: " + countedNumbers.get(j));
            }
        }
    }
}