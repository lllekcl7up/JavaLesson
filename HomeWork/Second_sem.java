package JavaLesson.HomeWork;

// // Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
// // Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга 
// (вхождение в обратном порядке).
// // *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
// // Дано два числа, например 3 и 56, необходимо составить следующие строки: 
// 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// // Замените символ “=” на слово “равно”. Используйте методы 
// StringBuilder.insert(),StringBuilder.deleteCharAt().
// // Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// // *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" 
// средствами String и StringBuilder.

public class Second_sem {
    
    public static void main(String[] args) {
        
    String str_one = "Vita brevis, ars longa";
    String str_two = "Vita brevis";
    String str_three = "siverb atiV";
    
    System.out.println(str_one.toLowerCase().contains(str_two.toLowerCase()));
    
    StringBuilder builder = new StringBuilder();
    builder.append(str_three);
    System.out.println(str_two.equals(builder.reverse().toString()));
    
    
    // Дано два числа, например 3 и 56
    System.out.println(builder(3,56));

    // Замените символ “=” на слово “равно”. Используйте методы 
    // StringBuilder.insert(),StringBuilder.deleteCharAt().
    System.out.println(
        builder(3,56).
        deleteCharAt(7).insert(7,"равно").
        deleteCharAt(23).insert(23,"равно").
        deleteCharAt(40).insert(40,"равно"));

        System.out.println(builder(3,56));
        // Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        System.out.println(
            builder(3,56).replace(7, 8, "равно").
            replace(23, 24, "равно" ).replace(40, 41, "равно"));


    }
// Дано два числа, например 3 и 56
    static StringBuilder builder(int numberA, int numberB) {
        StringBuilder result = new StringBuilder();
        result.append(
          numberA + " + " + numberB + " = " + (numberA + numberB) + "\n"
        + numberA + " - " + numberB + " = " + (numberA - numberB) + "\n"
        + numberA + " * " + numberB + " = " + (numberA * numberB) + "\n");
        return result;
    }






}
