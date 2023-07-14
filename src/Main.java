import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ФИО: ");
        boolean correctName = false;
        Scanner sc = new Scanner(System.in);

        while (!correctName) {
            int spaceCount = 0;

            String name = sc.nextLine();

            spaceCount = checkName(name, spaceCount);


            if (spaceCount != 2) {
                System.out.println("Введите корректное имя: ");
            } else {
                correctName = true;
                registerUp(name);

            }
        }
    }
    // В строке ФИО, проверяем что человек вбил 3 слова, соответственно должно быть 2 пробела:
    public static int checkName(String name, int spaceCount) {

        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(name);

        while (matcher.find()) {
            spaceCount++;

            int start = matcher.start();
            int end = matcher.end();


        }
        return spaceCount;


    }

    public static void registerUp(String name) {

        // Ищем символы (самый первый в строке и следующие за пробелми)

        Pattern p = Pattern.compile("(^.|\\s[а-я])");
        Matcher matcher = p.matcher(name);

        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        System.out.println(sb.toString());


    }

}