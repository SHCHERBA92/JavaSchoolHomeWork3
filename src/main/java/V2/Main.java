package V2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        /**
         *Add
         * */

        System.out.println("=============Add==============");
        JustClass.add(arrayList,200);
        JustClass.add(arrayList,300);
        JustClass.add(arrayList,400);
        JustClass.add(arrayList,500);

        System.out.println(arrayList);


        /**
         * limit
         */
        System.out.println("===========limit================");
        System.out.println(JustClass.limit(arrayList,4));


        /**
         * indexOf
         * */
        System.out.println("============indexOf===============");
        System.out.println(JustClass.indexOF(arrayList,arrayList.size()-1));    // такого обьекта нет
        System.out.println(JustClass.indexOF(arrayList,500));    // последний элемент
        System.out.println("===========removeAll================");

        /**
         * removeAll
         * */
        System.out.println("===========removeAll================");
        JustClass.removeAll(arrayList, Arrays.asList(1,2,3));
        System.out.println(arrayList);

        /**
         *containsAll
         * */
        System.out.println("=============containsAll==============");
        System.out.println(JustClass.containsAll(arrayList,Arrays.asList(200,300)));    // true
        System.out.println(JustClass.containsAll(arrayList,Arrays.asList(2000,3000)));    // false

        /**
         * containsAny
         * */
        System.out.println("=============containsAny==============");
        System.out.println(JustClass.containsAny(arrayList,Arrays.asList(500,600,700)));    // true
        System.out.println(JustClass.containsAny(arrayList,Arrays.asList(100,600,700)));    // false
        System.out.println(JustClass.containsAny(arrayList,Arrays.asList(100,600,4)));    // true

        /**
         * range
         * */
//сделаем как в примере
        System.out.println("===========range==============");
        List list = JustClass.range(new ArrayList<Integer>(Arrays.asList(8,1,3,5,6,4)),3,6);
        System.out.println(list.toString());
        List list2 = JustClass.range(new ArrayList<Integer>(Arrays.asList(8,1,3,5,6,4,12,23,32,55)),8,32);
        System.out.println(list2.toString());
    }
}
