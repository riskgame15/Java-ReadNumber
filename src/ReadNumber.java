import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 1000) {
            System.out.println("out of ability.");
        } else if (number < 12) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
            }
        } else if (number < 20) {
            int units = number % 10;
            switch (units) {
                case 3:
                    System.out.print("thir");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("fif");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eigh");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
            System.out.print("teen");
        } else if (number < 100) {
            int tens = Math.floorDiv(number, 10);
            int units = number - tens * 10;

            switch (tens) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            switch (units) {
                case 0:
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;

            }
        }else {
            int hundreds = Math.floorDiv(number, 100);
            int tens = Math.floorDiv(number -(hundreds * 100), 10);
            int units = number - hundreds * 100 - tens * 10 ;
            switch(hundreds) {
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
            }
            int num = number - hundreds * 100;
            if (num == 0) {
                System.out.print("hundred");
            } else {
                System.out.print("hundred and ");
            }
            if (tens < 2){
                switch (num) {
                    case 1:
                        System.out.print(" one");
                        break;
                    case 2:
                        System.out.print(" two");
                        break;
                    case 3:
                        System.out.print(" three");
                        break;
                    case 4:
                        System.out.print(" four");
                        break;
                    case 5:
                        System.out.print(" five");
                        break;
                    case 6:
                        System.out.print(" six");
                        break;
                    case 7:
                        System.out.print(" seven");
                        break;
                    case 8:
                        System.out.print(" eight");
                        break;
                    case 9:
                        System.out.print(" nine");
                        break;
                    case 10:
                        System.out.print(" ten");
                        break;
                    case 11:
                        System.out.print(" eleven");
                        break;
                    case 12:
                        System.out.print(" twelve");
                        break;
                    case 13:
                        System.out.print(" thirteen");
                        break;
                    case 14:
                        System.out.print("fourteen");
                        break;
                    case 15:
                        System.out.print("fifteen");
                        break;
                    case 16:
                        System.out.print("sixteen");
                        break;
                    case 17:
                        System.out.print("seventeen");
                        break;
                    case 18:
                        System.out.print("eighteen");
                        break;
                    case 19:
                        System.out.print("nineteen");
                        break;
                }
            }
            switch (tens){
                case 2:
                    System.out.print(" twenty");
                    break;
                case 3:
                    System.out.print(" thirty");
                    break;
                case 4:
                    System.out.print(" forty");
                    break;
                case 5:
                    System.out.print(" fifty");
                    break;
                case 6:
                    System.out.print(" sixty");
                    break;
                case 7:
                    System.out.print(" seventy");
                    break;
                case 8:
                    System.out.print(" eighty");
                    break;
                case 9:
                    System.out.print(" ninety");
                    break;
            }
            switch (units) {
                case 0:
                    break;
                case 1:
                    System.out.print(" one");
                    break;
                case 2:
                    System.out.print(" two");
                    break;
                case 3:
                    System.out.print(" three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        }
    }
}


