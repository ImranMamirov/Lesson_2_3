public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        if (name.length() > 20) {
            throw new IllegalNameLengthException("Имя слишком длинное. Максимальное количество символов 20");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 100) {
            throw new IllegalAgeException("Возраст должен быть в диапазоне от 1 до 100.");
        }
        this.age = age;
    }
}
