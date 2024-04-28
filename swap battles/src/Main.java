import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int countTests = 0;
        int price;
        int numberBottlesForNewDrink;
        int moneyMy;
        int numberOfDrinks = 0;
        int numberOfBottles = 0;


        Scanner scanner = new Scanner(System.in);

        String inputCountTests = scanner.nextLine();
        countTests = Integer.parseInt(inputCountTests);


        for (int i = 0; i < countTests; i++) {
            String data = scanner.nextLine();
            String[] inputData = data.split(" ");
            price = Integer.parseInt(inputData[0]);
            numberBottlesForNewDrink = Integer.parseInt(inputData[1]);
            moneyMy = Integer.parseInt(inputData[2]);

            while (moneyMy >= price) {

                 moneyMy = moneyMy - price;

                 numberOfDrinks++;
                 numberOfBottles++;

                 if(numberOfBottles == numberBottlesForNewDrink){
                     numberOfDrinks++;
                     numberOfBottles -= numberBottlesForNewDrink;
                     numberOfBottles++;
                }

            }
            System.out.println(numberOfDrinks);
            numberOfDrinks = 0;
            numberOfBottles = 0;

        }


        System.out.println("Hello world! We win!!!");
    }
}