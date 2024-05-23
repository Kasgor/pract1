import java.util.HashMap;
import java.util.Objects;
public class IncorrectCorrectExample {
    public static void main(String[] args) {
            HashMap<CorrectClass, String> correctMap = new HashMap<>();
            correctMap.put(new CorrectClass(1, "Alice"), "Value1");
            correctMap.put(new CorrectClass(2, "Bob"), "Value2");
            correctMap.put(new CorrectClass(1, "Alice"), "Value3");

            System.out.println(correctMap);

            HashMap<IncorrectClass, String> incorrectMap = new HashMap<>();
            incorrectMap.put(new IncorrectClass(1, "Alice"), "Value1");
            incorrectMap.put(new IncorrectClass(2, "Bob"), "Value2");
            incorrectMap.put(new IncorrectClass(1, "Alice"), "Value3");

            System.out.println(incorrectMap);
    }
}

class CorrectClass {
    private int id;
    private String name;

    public CorrectClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CorrectClass that = (CorrectClass) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'';
    }
}

class IncorrectClass {
    private int id;
    private String name;

    public IncorrectClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 32;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'';
    }
}