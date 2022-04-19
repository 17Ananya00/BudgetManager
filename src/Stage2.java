import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Stage2 {
    public static boolean Continue = true;
    public static double sum; // Sum up all the prices
    public static double income; //User's income input
    public static double balance; // Income - sum(prices total)
    public static List<String> list = new ArrayList<String>();
   public static double price;

    public static void main(String[] args) {


        while (Continue) {
            System.out.println();
            System.out.println("Choose your action:\n" +
                    "1) Add income\n" +
                    "2) Add purchase\n" +
                    "3) Show list of purchases\n" +
                    "4) Balance\n" +
                    "0) Exit\n");
            Scanner scanner = new Scanner(System.in);
            String action = scanner.nextLine();
            System.out.println();
            if (Objects.equals(action, "0")) {
                System.out.println("Bye!");

                Continue = false;
                break;
            } else if (Objects.equals(action, "1")) {
                System.out.println("Enter income:");
                income = scanner.nextDouble();
                System.out.println("Income was added!");
                balance = income;
            } else if (Objects.equals(action, "2")) {


                System.out.println("Enter purchase name:");
                String item = scanner.nextLine();

                System.out.println("Enter its price:");
                price = scanner.nextDouble();


                // System.out.println("Purchase was added!");

                sum = sum + price;
                System.out.println(sum);
               // double totalSum = 0;
               // totalSum += price;
                balance = balance - price;
                System.out.println(balance);

                String wholeItem = item + " " + "$" + price;
                System.out.println("Purchase was added!");
                //System.out.println(wholeItem);
                list.add(wholeItem);

            } else if (Objects.equals(action, "3")) {
                if (list.isEmpty()) {
                    System.out.println("The purchase list is empty");
                } else {
                    for (String element : list) {
                        System.out.println(element);
                    }
                    System.out.println("Total sum: " + "$" + sum);
                }


            } else if (Objects.equals(action, "4")) {
                System.out.println("Balance: $" + balance);
            }

        }
    }
}
