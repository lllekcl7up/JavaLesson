package JavaLesson.Lessons.Lecture1;

// Операции Java
// ● Присваивание: =
// ● Арифметические: *, /, +, -, %, ++, --
// ● Операции сравнения: <, >, ==, !=, >=, <=
// ● Логические операции: ||, &&, ^, !
// ● Побитовые операции <<, >>, &, |, ^


// public class basics {
//     /**
// * Program так будут комментироваться код
// */
//     public static void main(String[] args) {
//     System.out.println("Hi world");
//     }
//     }

    // Основы: типы данных
public class basics {
    public static void main(String[] args) {
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false
    }
}
