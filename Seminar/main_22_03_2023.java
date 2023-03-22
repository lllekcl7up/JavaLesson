import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class main_22_03_2023 {

    public static void main(String[] args) {
        MySet ms = new MySet();
        ms.add(1);
        ms.add(2);
        ms.add(3);
        ms.add(3);
        ms.add(10);
        ms.add(12);
        ms.add(13);
        ms.add(4);
        ms.delete(2);
        ms.print();
        MySet ms1 = new MySet();
        ms1.add(4);
        ms1.add(7);
        ms1.add(9);
        ms1.add(4);
        ms1.print();
        ms.unite(ms1);
        ms.print();
        System.out.println(ms.toListupToElement(3));
        System.out.println(ms.toList() );
    }
}

class MySet {
    private HashMap<Integer, Object> mySet;
    private static final Object OOO = new Object();

    public MySet() {
        this.mySet = new HashMap<>();
    }

    public void add(Integer number) {
        this.mySet.putIfAbsent(number, OOO);

    }

    public void delete(Integer number) {
        this.mySet.remove(number);
    }

    public void print() {
        mySet.forEach((k, v) -> System.out.print(k + " "));
        System.out.println();
    }

    public void unite(MySet otherSet) {
        otherSet.mySet.forEach((k, v) -> this.add(k));

    }

    public int size() {
        return this.mySet.size();
    }

    public int get(int index) {
        return (int) this.mySet.keySet().toArray()[index];
    }

    public ArrayList<Integer> toList() {
        return new ArrayList<>(this.mySet.keySet());
        // ArrayList<Integer> output = new ArrayList<>();
        // this.mySet.keySet().forEach(k->output.add(k));
        // return output;
    }

    public ArrayList<Integer> toListupToElement(int element) {
        if (!mySet.containsKey(element))
            return null;
        ArrayList<Integer> output = new ArrayList<>();
        for (int k : mySet.keySet()) {
            output.add(k);
            if (k == element)
                break;
        }
        return output;
    }

}



