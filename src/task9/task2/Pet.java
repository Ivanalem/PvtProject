package task9.task2;

public class Pet {
    String name;
    String nickName;

    public Pet(String name, String nickName) {
        this.nickName = nickName;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", nickName=" + nickName +
                '}';
    }
}
