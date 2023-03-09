package JavaLesson.HomeWork;
// Первый семинар.
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
// Пункты реализовать в методе main
// *Пункты реализовать в разных методах
// int i = new Random().nextInt(k); //это кидалка случайных чисел!)

public class First_sem {
    public static void main(String[] args) {
        int i = getRandom();
        System.out.println("Рандомное число = " + i);
        int n = getBit(i);
        System.out.println("Номер старшего значащего бита выпавшего числа = " + n);
// 3.- метод с циклом for
        // int[] m1 = getMyMult(i, n, 2000);
        // System.out.println(Arrays.toString(m1));
        // int[] m2 = getMyNOMult(i, n, 0);
        // System.out.println(Arrays.toString(m2));
// 3.- метод с библиотекой Java заполнение массива( удобный вариант !!!!)
        System.out.println();
        ArrayList<Integer> m1 = getJavaArrayMethodsMult(i, n,2000);
        System.out.println("Все кратные " + n + " в диапазоне от " + i + " до " + 2000 +": "+ m1 );
        System.out.println();
        ArrayList<Integer> m2 = getJavaArrayMethodsNOMult(i, n,0);
        System.out.println("Все не кратные " + n + " в диапазоне от " + i + " до " + 0 +": "+ m2);
    }
    
    public static int getRandom() {
        Random rndm = new Random();
        int i = rndm.nextInt(2000);
        return i;
    }
    
    public static int getBit(int i) {
        int n = Integer.toBinaryString(i).length();
        return n;
    }
// // 3. - Нагуглил очень удобный метод для работы с массивами ArrayList<Integer>
    public static ArrayList<Integer> getJavaArrayMethodsMult(int i, int n, int max) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int j = i + 1; j <= max; j++)
            if (j % n == 0)
                result.add(j);
        return result;
    }
// // 4.Нагуглил очень удобный метод для работы с массивами ArrayList<Integer>
    public static ArrayList<Integer> getJavaArrayMethodsNOMult(int i, int n, int min) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int j = i - 1; j >= min; j--)
            if (j % n != 0)
                result.add(j);
        return result;
    }




// // 3. - решение с циклом for 
//     public static int[] getMyMult(int i, int n, int max) {
//         int size = 0;
//         for (int j = i + 1; j < max; j++) {
//             if (j % n == 0)
//                 size++;
//         }
//         int[] result = new int[size];
//         int index = 0;
//         for (int j = i + 1; j < max; j++) {
//             if (j % n == 0)
//                 result[index++] = j;
//         }
//         return result;
//     }

// // 4. - решение с циклом for 
//     public static int[] getMyNOMult(int i, int n, int min) {
//         int size = 0;
//         for (int j = i-1; j > min; j--) {
//             if (j % n != 0)
//                 size++;
//         }
//         int[] result = new int[size];
//         int index = 0;
//         for (int j = i-1; j > min; j--) {
//             if (j % n != 0)
//                 result[index++] = j;
//         }
//         return result;
//     }



}
