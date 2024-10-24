package task7;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Task7 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        String str = enterStr();
        char symbol = str.charAt(str.length() - 1);
        Pattern pattern = Pattern.compile(String.valueOf(symbol));
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            if ((matcher.start() + 1) == str.length()) {
                break;
            }
        }
        System.out.println("Последний символ строки: " + symbol);
        System.out.format("Символ %s совпадает с символом на позиции %d%n", symbol, (matcher.start() + 1));
    }

    public static void task2() {
        String str = enterStr();
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backword = length - 1;
        while (backword > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backword--);
            if (forwardChar != backwardChar) {
                System.out.println("Не является палиндромом");
            } else {
                System.out.println("Является палиндромом");
            }
        }
    }

    public static void task3() {

    }


    public static String enterStr() {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
