import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toUpperCase();
        int number = Integer.parseInt(scanner.nextLine());

        int index = word.length() - number;
        String beginWord = word.substring(index);
        String endWorld = word.substring(0, index);

        String wholeWorld = beginWord + endWorld;
        System.out.println(wholeWorld);


        for (int i = 0; i < wholeWorld.length(); i++) {
            char letter = wholeWorld.charAt(i);
            int letterAssci = (int) letter + number;


            if (letterAssci > 90) {
                letterAssci = letterAssci - 26;
            }
            char newLetter = (char) letterAssci;
            System.out.print(newLetter);
        }


        //System.out.println("Hello world!");
    }
}