import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyCountMap<Integer> stringMyCountMap = new MyCountMap<>();

        stringMyCountMap.add(10);
        stringMyCountMap.add(10);
        stringMyCountMap.add(5);
        stringMyCountMap.add(6);
        stringMyCountMap.add(5);
        stringMyCountMap.add(10);

        System.out.println(stringMyCountMap.getCount(10));
        System.out.println(stringMyCountMap.getCount(5));
        System.out.println(stringMyCountMap.getCount(6));

        System.out.println("Всего элементов = " + stringMyCountMap.size());

        //HashMap<Integer,Integer> hashMap = new HashMap<>(stringMyCountMap.toMap());

        stringMyCountMap.add(15);
        stringMyCountMap.add(25);
        stringMyCountMap.add(35);
        stringMyCountMap.add(40);
        stringMyCountMap.add(40);

        System.out.println("==========================");

        Set<Map.Entry<Integer,Integer>> set = stringMyCountMap.toMap().entrySet();

        for (Map.Entry<Integer,Integer> entry:
             set ) {
            System.out.print( "Ключ = " + entry.getKey() + ": ");
            System.out.println( "Згачение = " + entry.getValue());
        }

        System.out.println("==========================");

        System.out.println("Удаляем 10 из своеги списка : "+stringMyCountMap.remove(10));
    }
}
