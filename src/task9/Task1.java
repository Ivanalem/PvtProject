package task9;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> randomListNum = new ArrayList<>(RandomNum());
        findDuplicates(randomListNum);

    }

    private static <T> List<T> findDuplicates(List<T> randomListNum) {
        List<Integer> newNumList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < randomListNum.size(); i++) {
            if (Collections.frequency(randomListNum, i) > 1) {
                newNumList.add(i);
                count = Collections.frequency(randomListNum, i);
            }
            System.out.println("Колличество вхождений " + count + " числа " + i);
        }
        return (List<T>) newNumList;
    }

    private static List<Integer> RandomNum() {
        Random random = new Random();
        List<Integer> randomListNum2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomListNum2.add(random.nextInt(0, 10));
        }
        System.out.println(randomListNum2);

        return randomListNum2;
    }

}
