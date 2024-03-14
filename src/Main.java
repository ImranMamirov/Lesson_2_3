import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        while (true) {
            try {
                System.out.println("Введите имя пользователя: ");
                String name = scanner.nextLine();
                user.setName(name);

                System.out.println("Введите возраст пользователя: ");
                int age = scanner.nextInt();
                user.setAge(age);

                break;
            } catch (IllegalNameLengthException inle) {
                System.out.println("Ошибка " + inle.getMessage());
            } catch (IllegalAgeException iax) {
                System.out.println("Ошибка " + iax.getMessage());
                scanner.nextLine();
            }
        }

        System.out.println("Пользователь успешно создан" + "\nИмя пользователя: " + user.getName()
                + "\nВозраст пользователя: " + user.getAge());
    }
}