package by.pvt.iterator.example;

public class MyFirst {

    public static void main (String[] args) {
        MyArray ar1 = new MyArray(10);
        for (int i=0; i<ar1.size(); i++) {
            ar1.set(i, 50-i);
        }
        MyIterator mi = ar1.iterator();
        while (mi.hasNaxt()) {

            System.out.println(mi.next());
        }

    }

}
