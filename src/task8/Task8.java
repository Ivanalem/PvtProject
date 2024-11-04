package task8;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        HashMap<Integer, String> keyMap = new HashMap<>();
        keyMap.put(121, "Valentin");
        keyMap.put(123, "Danil");
        keyMap.put(1239, "Danil");
        keyMap.put(1234, "Alexander");
        keyMap.put(12345, "Zora");
        keyMap.put(123456, "Vanya");
        keyMap.put(1234567, "Sergey");
        keyMap.put(12345678, "Sergey");
        task1(keyMap);
        HashMap<String, ArrayList<Integer>> keyMapTask2 = new HashMap<>();
        task2(keyMapTask2);
    }

    public static void task1(HashMap<Integer, String> keyMap) {
        System.out.println("Начало работы task1: ");
        HashMap<String, Integer> mapTask1 = new HashMap<>();
        for (Map.Entry<Integer, String> entryMap : keyMap.entrySet()) {
            mapTask1.put(entryMap.getValue(), entryMap.getKey());
        }
        System.out.println(keyMap);
        System.out.println(mapTask1);
        System.out.println("Конец работы task1!");
    }

    public static void task2(Map<String, ArrayList<Integer>> keyMapTask2) {
        System.out.println("Начало работы task2: ");
        addNumber(12, "Valentin",keyMapTask2);
        addNumber(1234, "Valentin",keyMapTask2);
        addNumber(12345, "Zora",keyMapTask2);
        addNumber(12345, "Zora",keyMapTask2);
        addNumber(1234567, "Sergey",keyMapTask2);
        addNumber(123, "Danil",keyMapTask2);
        addNumber(1239, "Danil",keyMapTask2);
        System.out.print(keyMapTask2);
        System.out.println();
        System.out.println("Конец работы task2!");

    }
    public static void addNumber(int value,String key, Map<String, ArrayList<Integer>> keyMapTask2){
        if (keyMapTask2.containsKey(key)) {
            keyMapTask2.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            keyMapTask2.put(key, list);
        }
    }
}
