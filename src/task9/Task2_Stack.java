package task9;

public class Task2_Stack {
    private int mSize;
    private int [] stackArray;
    private int num;

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
    }
