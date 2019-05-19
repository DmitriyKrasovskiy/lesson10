package by.pvt.list.example;

import java.util.*;
import java.util.Map.*;

/**
 *
 */
public class ForEachExample {

    public static void main(String[] args) {

        List<String> stringList = List.of("test1", "test22", "test333");
        String s1 = stringList.get(0);
        //foreach
        for (String s : stringList) {
            System.out.println(s + " " + s.length());
        }

        String[] strings = {"1", "22", "333"};
        for (String s2 : strings) {
            System.out.println(s2);
        }

        Map<String, Integer> map = new TreeMap<>(Map.of("key2", 22, "key1", 1, "key3", 333));
        for (Entry<String, Integer> s : map.entrySet()) {
            System.out.println(s);
        }

        List<Integer> integerList = new ArrayList<>(); //Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //integerList.add(1);
        //integerList.add(2);
        //integerList.add(3);
        integerList.add(null);
        //integerList.add(Integer.MAX_VALUE);

        calculateAverage(integerList);

        System.out.println(integerList);
        //This code generates Exception:
        /*for (Integer integer : integerList) {
            if (integer % 2 == 0) {
                integerList.remove(integer);
            }
        }*/
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer == null) continue;
            if (integer % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(integerList);

        List<Integer> random = new ArrayList<>(10);
        for(int i = 0; i < 10; i++) {
            int r = (int)(Math.random()*10);
            random.add(i, r);
        }
        System.out.println(random);

    }
    //Ниже пример расчета среднего арифметического

    public static void calculateAverage(List<Integer> integerList) {
        if (integerList == null || integerList.isEmpty()) return;
        Long sum = 0L;
        long count = 0L;
        for (Integer i: integerList) {
            if (i != null) {
                sum += i;
                count++;
            }
        }
        if (count == 0) return;
        System.out.println((double)sum/count);
    }



}