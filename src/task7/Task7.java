package task7;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task7 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
        boolean isPalendrom = true;
        while (backword > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backword--);
            if (forwardChar != backwardChar) {
                isPalendrom = true;
            } else {
                isPalendrom = false;
            }
        }
        if(isPalendrom){
            System.out.println("Не является палиндромом");
        }else {
            System.out.println("Является палиндромом");
        }
    }

    public static void task3() {
        String str = "Текст со словом test - это текст, в котором присутствует слово test. Это может быть любой текст, " +
                " в котором данное слово используется в качестве названия, описания, ключевого термина или просто " +
                "упоминается в контексте какого-либо события или явления. Слово test имеет множество значений и " +
                "может быть использовано в различных областях, таких как технологии, наука, спорт, образование и т.д. " +
                "В тексте со словом test можно найти информацию о его происхождении, истории использования, " +
                "примеры его применения, а также различные тесты и эксперименты, связанные с этим словом. " +
                "Такой текст может быть полезен для тех, кто интересуется этим словом или хочет узнать больше о нем. " +
                "В целом, текст со словом test может быть очень разнообразным и содержать много полезной информации";
        Pattern pattern = Pattern.compile("test");
        Matcher matcher = pattern.matcher(str);
        int countTest = 0;
        for (int i = 0; i < str.length(); i++) {
            if (matcher.find()) {
                countTest++;
            }
        }
        System.out.println("Количество слова test в тексте составляет: " + countTest);

    }

    public static void task4() {
        String str = "1975 1976 1977 1978 1979 1980 1981 1982 1983 1984";
        Pattern pattern = Pattern.compile("19.7\\s+..+2");
        Matcher matcher = pattern.matcher(str);
        for (int i = 0; i < str.length(); i++) {
            if (matcher.find()) {
                System.out.println("Найденные года: " + matcher.group() + " ");
            }
        }

    }

    public static void task5() {
        String str = " 127.0.0.1  255.255.255.253   100.99.44.2   ";

        Pattern pattern = Pattern.compile("((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.)" +
                "{3}\\b(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
        Matcher matcher = pattern.matcher(str);
        for (int i = 0; i < str.length(); i++) {
            if (matcher.find()) {
                System.out.print("Найдены следующие ip: " + matcher.group() + " ");
            }
        }
    }


    public static String enterStr() {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

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
