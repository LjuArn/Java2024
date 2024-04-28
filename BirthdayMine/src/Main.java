import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputBirthday = scanner.nextLine();
        String inputTodayDate = scanner.nextLine();

        String[] birthday = inputBirthday.split(" ");
        int dateOfMonth = Integer.parseInt(birthday[0]);
        int month = Integer.parseInt(birthday[1]);

        String[] today = inputTodayDate.split(" ");
        int dateToday = Integer.parseInt(today[0]);
        int monthToday = Integer.parseInt(today[1]);
        int yearToday = Integer.parseInt(today[2]);

        LocalDate dateNow = LocalDate.of(yearToday, monthToday, dateToday);
        LocalDate dateNowForCheck = LocalDate.of(yearToday, monthToday, dateToday);

        int tempYear=yearToday;

        if(inputBirthday.equals("29 2")){
            while (!dateNowForCheck.isLeapYear()){
                tempYear++;
                dateNowForCheck = LocalDate.of(tempYear, monthToday, dateToday);
            }
        }

        LocalDate brDay = LocalDate.of(tempYear, month, dateOfMonth);


        if(dateNow.isBefore(brDay) ){

            Duration diff = Duration.between(dateNow.atStartOfDay(), brDay.atStartOfDay());

            System.out.println(diff.toDays());
        }else if(dateNow.isAfter(brDay) ){

            brDay = LocalDate.of(yearToday + 1, month, dateOfMonth);
            Duration diff = Duration.between(dateNow.atStartOfDay(), brDay.atStartOfDay());

            System.out.println(diff.toDays());
        }else{
            System.out.println("0");
        }
    }
}