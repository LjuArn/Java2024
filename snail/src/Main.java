import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int upDirection;
        int downDirection;
        int wellMeters;
        int daysClimb = 0;
        Scanner scanner = new Scanner(System.in);

        String countInputData = scanner.nextLine();
        int number = Integer.parseInt(countInputData);

        for (int i = 0; i < number; i++) {
            String data = scanner.nextLine();
            String[] inputData = data.split(" ");
            upDirection = Integer.parseInt(inputData[0]);
            downDirection = Integer.parseInt(inputData[1]);
            wellMeters = Integer.parseInt(inputData[2]);

            int metersForDay =0;

            while (true){
                if(upDirection >= wellMeters){
                    break;
                };

                metersForDay = metersForDay + upDirection;
                daysClimb++;
                if (metersForDay >= wellMeters){
                    break;
                }
                metersForDay = metersForDay - downDirection;

            }
            System.out.println(daysClimb);

            daysClimb = 0;
        }

        System.out.println("Well done!");
    }
}