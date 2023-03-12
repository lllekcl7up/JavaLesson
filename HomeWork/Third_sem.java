// 1. Реализовать алгоритм сортировки списков слиянием
// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
// 4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
// 5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
// 6. Повторить пятый пункт но с LinkedList.
// 7. Сравнить время работы пятого и шестого пунктов.

// Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.

package JavaLesson.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

public class Third_sem {

    public static void main(String[] args) {
        // Создаем неотсортированный массив
        int size = 10;
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrList.add(random.nextInt(20));
        }
        System.out.println("Неотсортированный список: " + arrList);
// сортировка коллекцией там тоже используется метод слияния
        Collections.sort(arrList);
        System.out.println("Отсортированный список: " + arrList);
        System.out.println();
//сортировка методом ниже 
        System.out.println("Неотсортированный список: " + Arrays.toString(array));
        merge_sort(array);
        System.out.println("Отсортированный список: " + Arrays.toString(array));
        System.out.println();
// 2.
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println("Произвольный список:  " + list);
        list.removeIf(n -> (n % 2 == 0));
        System.out.println("Чётные числа удалены: " + list);
        System.out.println();
// 3.
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(random.nextInt(20));
        }
        System.out.println(list2);
        System.out.println("Минимальное число списка = " + Collections.min(list2));
        System.out.println("Максимальное число списка = " + Collections.max(list2));
        double average = getAverage(list2);
        System.out.println("Среднее арифмитическое = " + average);
        System.out.println();
// 4.
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list3.add(random.nextInt(100));
        }
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list4.add(random.nextInt(100));
        }
        ArrayList<Integer> newList = new ArrayList<>();
        System.out.println("Первый список = " + list3);
        System.out.println("Второй список = " + list4);
        newList.addAll(list3);
        newList.addAll(list4);
        System.out.println("Объеденённый список = " + newList);
        Set<Integer> unicList = new HashSet<Integer>(newList);
        System.out.println("Не повроряющиеся отсортированные значения" + unicList);
        System.out.println();
// 5.
        long begin = System.currentTimeMillis();
        int initialSize = 10000;
        ArrayList<Integer> list5 = new ArrayList<Integer>(initialSize);
        for (int i = 0; i < initialSize; i++) {
            list5.add(0, 0);
        }
        // System.out.println(list5);
        long arrayListTime = System.currentTimeMillis() - begin;
        // System.out.println(list5);
        System.out.println("Время заполнения ArrayList = " + arrayListTime);
// 6.
        begin = System.currentTimeMillis();
        LinkedList<Integer> list6 = new LinkedList<Integer>();
        for (int i = 0; i < initialSize; i++) {
            list6.addFirst(0);
        }
        long linkedListTime = System.currentTimeMillis() - begin;
        // System.out.println(list6);
        System.out.println("Время заполнения LinkedList = " + linkedListTime);
    }

// 3.
    private static double getAverage(ArrayList<Integer> list2) {
        double sum = 0;
        for (int i : list2) {
            sum += i;
        }
        return sum / list2.size();
    }

     // Реализовать алгоритм сортировки списков слиянием
    public static void merge_sort(int[] array) {
        if (array.length < 2)
            return; // не нужно сортировать
        int mid = array.length / 2;
        int left[] = new int[mid];
        int right[] = new int[array.length - mid];
        for (int i = 0; i < mid; i++) { // заполняем левый
            left[i] = array[i];
        }
        for (int i = 0; i < array.length - mid; i++) { // заполняем правый
            right[i] = array[mid + i];
        }
        merge_sort(left);
        merge_sort(right);
        merge(left, right, array);

    }

    static void merge(int[] a, int[] b, int[] all) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                all[k] = a[i];
                i++;
            } else {
                all[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            all[k++] = a[i++];
        }
        while (j < b.length) {
            all[k++] = b[j++];
        }
    }
}




