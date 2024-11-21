package task9;

import java.util.Arrays;

public class Task2_Stack {
    private int mSize;
    private int [] stackArray;
    private int num;

    public static void main(String[] args) {
        Task2_Stack stack = new Task2_Stack(10);
        stack.isEmpty();
        stack.addElement(30);
        stack.addElement(54);
        stack.addElement(20);
        stack.addElement(50);
        System.out.println("Cтек: " + stack);
        stack.deleteElement();
        stack.readNum();
        System.out.println("Cтек: " + stack);
    }

    public Task2_Stack(int mSize) {
        this.mSize = mSize;
        stackArray = new int[mSize];
        num = -1;
    }

        public void addElement(int element){
            stackArray[++num] = element;
        }
        public int deleteElement(){
            return stackArray[num--];
        }

        public int readNum(){
        return stackArray[num];
        }

        public boolean isEmpty(){
        return (num == -1);
        }

    @Override
    public String toString() {
        return "Task2_Stack{" +
                "stackArray=" + Arrays.toString(stackArray) +
                '}';
    }
}
