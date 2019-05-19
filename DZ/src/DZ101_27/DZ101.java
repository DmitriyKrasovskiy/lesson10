package DZ101_27;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class DZ101 {
    public static void main(String[] args) {
        System.out.println("Enter the Array size");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> arrList = new ArrayList<>(size);


        for (int i = 0; i < size; i++) {
            arrList.add((int) (Math.random() * 9));
        }

        System.out.println(arrList);

//      отсеиваем дублирующие значения при помощи LinkedHashSet
        arrList = new ArrayList<Integer>(new LinkedHashSet<Integer>(arrList));
        System.out.println(arrList);

      }
}
