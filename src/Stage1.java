import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stage1 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        //while(scanner.hasNextLine()) {

        String[] strings = new String[0];
        List<String> list = new ArrayList<String>();
       while(scanner.hasNextLine()) {
            String str = scanner.nextLine();
            list.add(str);


            strings = str.split("\\$");
            //System.out.println(strings[1]);
            double numbers = Double.parseDouble(strings[1]);
            sum += numbers;

        }
        for (String element : list) {
            System.out.println(element);
        }

        System.out.println("Total:" + " $" + sum);
    }
}
