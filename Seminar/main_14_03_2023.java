

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;



public class main_14_03_2023 {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        LinkedList<String> surname = new LinkedList<>();
        LinkedList<String> name = new LinkedList<>();
        LinkedList<String> middlename = new LinkedList<>();
        LinkedList<Boolean> gender = new LinkedList<>();
        LinkedList<Integer> age = new LinkedList<>();
        LinkedList<Integer> id = new LinkedList<>();
        surname.add(surname());
        name.add(name());
        middlename.add(middlename());
        gender.add(gender());
        age.add(age());
        id.add(id(id,))


















        // System.out.println(human("Ivaanov", "Ivan", "Ivanovish", true, 40));





    }



    public static String surname() {
        System.out.println("Input surname: ");
        String surname = scanner.nextLine();
        return surname;
    }

    public static String name() {
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        return name;
    }

    public static String middlename() {
        System.out.println("Input middlename: ");
         String middlename = scanner.nextLine();
        return middlename;
    }

    public static Boolean gender(){
                    System.out.println("Input gender: ");
                    Boolean gender = scanner.nextBoolean();
                    if (gender.equals("male")){
                       return gender = true;
                    }   else
                       return gender = false;
                }

    public static int age() {
        System.out.println("Input gender: ");
        int age = Integer.parseInt(scanner.nextLine());
        return age;
    }

    public static int id(ArrayList<Integer> id){
        return id.size()-1;

    }


    public static ArrayList<Object> human(String surname, String name, String middlename, Boolean gender,int age){
        ArrayList<Object> newHuman = new ArrayList<>();
        System.out.println("Input surname: ");
        surname = scanner.nextLine();
        newHuman.add(surname);

        System.out.println("Input name: ");
        name = scanner.nextLine();
        newHuman.add(name);

        System.out.println("Input surname: ");
        name = scanner.nextLine();
        newHuman.add(surname);
        System.out.println("Input surname: ");
        name = scanner.nextLine();
        newHuman.add(surname);
        System.out.println("Input surname: ");
        name = scanner.nextLine();
        newHuman.add(surname);
        name = scanner.nextLine();
        name = scanner.nextLine();
                newHuman.add(surname);
        newHuman.add(name);
        newHuman.add(middlename);
        newHuman.add(gender);
        gender = scanner.nextBoolean();
        if (gender.equals("male")){

        }
        newHuman.add(age);
        return newHuman;
        
    }
    // ArrayList<ArrayList<Object>> listOfLists = new ArrayList<>();


}

// package src.main.java;

// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Scanner;

// public class Seminar4 {
//     static  Scanner scanner = new Scanner(System.in);
//     public static String surname() {
//         System.out.println("Input surname: ");
//         String surname = scanner.nextLine();
//         return surname;
//     }
//     public static String name() {
//         System.out.println("Input name: ");
//         String name = scanner.nextLine();
//         return name;
//     }

//     public static String middleName() {
//         System.out.println("Input middle name: ");
//         String middleName = scanner.nextLine();
//         return middleName;
//     }

//     public static Boolean gender() {
//         System.out.println("Input gender: ");
//         Boolean gender = scanner.nextBoolean();
//         if (gender.equals("male")) {
//             gender = true;
//         } else {
//             gender = false;
//         }
//         return gender;
//     }

//     public static int age() {
//         System.out.println("Input age: ");
//         int age = Integer.parseInt(scanner.nextLine());
//         return age;
//     }

//     public static int id(ArrayList<Integer> id) {
//         return id.size()-1;
//     }

// public static ArrayList<Object> human(String surname, String name, String middleName, Boolean gender, int age) {
//     ArrayList<Object> newHuman = new ArrayList<>();
//     System.out.println("Input surname: ");
//     surname = scanner.nextLine();
//     newHuman.add(surname);
//     System.out.println("Input name: ");
//     name = scanner.nextLine();
//     newHuman.add(name);
//     System.out.println("Input middle name: ");
//     middleName = scanner.nextLine();
//     newHuman.add(middleName);
//     System.out.println("Input gender: ");
//     gender = scanner.nextBoolean();
//     if (gender.equals("male")) {
//         newHuman.add(true);
//     }
//     else
//         newHuman.add(false);

//     System.out.println("Input age: ");
//     age = Integer.parseInt(scanner.nextLine());
//     newHuman.add(age);
//     return newHuman;
// }
//     public static void main(String[] args) {
//         LinkedList<String> surname = new LinkedList<>();
//         LinkedList<String> name = new LinkedList<>();
//         LinkedList<String> middleName = new LinkedList<>();
//         LinkedList<Boolean> gender = new LinkedList<>();
//         LinkedList<Integer> age = new LinkedList<>();
//         LinkedList<Integer> id = new LinkedList<>();
//         surname.add(surname());
//         name.add(name());
//         middleName.add(middleName());
//         gender.add(gender());
//         age.add(age());
//         id.add(id(id,))

//     }
// }
