package JavaLesson.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Fourth_sem {
    
    static void PrintArrayList(ArrayList<String[]> base, int[] newIndex) {
        for (int i : newIndex) {
            for (int j = 1; j < base.get(i).length; j++) {
                if (j != 2 && j != 3) {
                    System.out.print(base.get(i)[j] + " ");
                } else
                    System.out.print(base.get(i)[j].charAt(0) + ". ");
            }
            System.out.println();
        }
    }
    static String[][] sortedArray(ArrayList<String[]> base, int column, int[] newIndex, boolean sort) {
        String[][] array = new String[base.size()][2];
        int index = 0;
        for (int i : newIndex) {
            array[index][0] = base.get(i)[0];
            array[index][1] = base.get(i)[column];
            index++;
        }
        if (sort)
            Arrays.sort(array, Comparator.comparing(arr -> arr[1]));
        return array;
    }

    static int[] indexArray(String[][] array) {
        int[] newIndex = new int[array.length];
        for (int i = 0; i < newIndex.length; i++) {
            newIndex[i] = Integer.parseInt(array[i][0]);
        }
        return newIndex;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> base = new ArrayList<>();
        int index = 0;

        System.out.println("Введите ФИО, пол и возраст, или q для выхода: ");
        String[] secondBase;
        String input = sc.nextLine();
        if (!input.equals("q")) {
            input = index++ + " " + input;
            secondBase = input.split(" ");
            base.add(secondBase);
        }

        while (!input.equals("q")) {
            System.out.println("Введите ФИО, пол и возраст, или q для выхода: ");
            input = sc.nextLine();
            if (!input.equals("q")) {
                input = index++ + " " + input;
                secondBase = input.split(" ");
                base.add(secondBase);
            }
        }

        int[] newIndex = new int[base.size()];

        for (int i = 0; i < newIndex.length; i++) {
            newIndex[i] = i;
        }

        PrintArrayList(base, newIndex);
        System.out.println("Вывести сортированный список по возрасту и полу? y - да, n - нет");
        input = sc.nextLine();
        if (input.equals("y")) {
            String[][] array = sortedArray(base, 4, newIndex, true);
            newIndex = indexArray(array);
            array = sortedArray(base, 5, newIndex, true);
            newIndex = indexArray(array);
            PrintArrayList(base, newIndex);
        }
    }
}










