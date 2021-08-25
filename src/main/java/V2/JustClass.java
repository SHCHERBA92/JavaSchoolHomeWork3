package V2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JustClass {
    public static List newArrayList()
    {
        return new ArrayList<>();
    }

    public static <T> int indexOF(List<? extends T> source, T Object)
    {
        return source.indexOf(Object);
    }

    public static<T> List limit(List<? extends T> source, int size)
    {
        return source.stream().limit(size).toList();
    }

    public static<T> void add(List<? super T> source, T object)
    {
        source.add(object);
    }

    public static<T> void removeAll(List<? extends T> removeFrom, List<?> c2)
    {
        removeFrom.removeAll(c2);
    }

    public static<T> boolean containsAll(List<? extends T> c1, List<? extends T> c2)
    {
        return c1.containsAll(c2);
    }

    public static<T> boolean containsAny(List<? extends T> c1, List<? extends T> c2)
    {
        for (int i =0; i<c2.size();i++)
        {
            if (c1.contains(c2.get(i)))
            {
                return true;
            }
        }
        return false;
    }

    public static<T> List range(List<? super T> list, Object min, Object max)
    {
        List tList = list.stream().sorted().toList();

        int minVal = tList.indexOf(min);
        int maxVal = tList.indexOf(max);
//
//        List list1 = tList.subList(minVal,maxVal);
//        list1.add(tList.indexOf(maxVal));
//        return list1;

        return tList.subList(minVal,maxVal+1);

    }

//    public static List range(List list, Object min, Object max, Comparator comparator) { }


}
