package task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Integer>> keyMapTask2;

    protected void addNumber(int number, String name, Map<String, List<Integer>> keyMapTask2) {
        if (keyMapTask2.containsKey(name)) {
            keyMapTask2.get(name).add(number);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(number);
            keyMapTask2.put(name, list);
        }
    }

    protected PhoneBook(Map<String, List<Integer>> keyMapTask2) {
        this.keyMapTask2 = keyMapTask2;
    }

    @Override
    public String toString() {
        return "Телефонная книга:  " + getKeyMapTask2();
    }

    public Map<String, List<Integer>> getKeyMapTask2() {
        return keyMapTask2;
    }
}
