package JavaLesson.HomeWork;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. 
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;

public class Fifth_sem {

    public static Map<String, List<String>> phbook = new HashMap<>();

    public static void main(String[] args) {
        addContact();
        Scanner sc = new Scanner(System.in);
        System.out.print("Имя: ");
        String str = sc.nextLine();
        sc.close();
        findPerson(str);
    }

    public static void addContact() {
        phbook.put("Екатерина", List.of("8-926-818-88-78", "8-167-789-45-66"));
        phbook.put("Дима", List.of("8-999-888-77-44", "8-495-666-33-22"));
        phbook.put("Виктор", List.of("8-777-777-77-77"));
        phbook.put("Маша", List.of("8-666-444-44-44", "8-777-777-44-11"));
        phbook.put("Александр", List.of("8-888-999-777-11-00", "8-999-333-22-11"));

    }

    public static void findPerson(String name) {
        System.out.printf("%s: %s", name, phbook.get(name));
    }
}
    