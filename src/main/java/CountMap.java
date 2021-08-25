import java.util.Map;

public interface CountMap <K>{
    // добавляет элемент в этот контейнер.
    void add(K object);

    int getCount(K object);

    //Удаляет элемент и контейнера и возвращает количество его добавлений(до удаления)
    int remove(K object);

    //количество разных элементов
    int size();

    //Добавить все элементы из source в текущий контейнер,
    // при совпадении ключей,     суммировать значения
    void addAll(CountMap source);

    //Вернуть java.util.Map. ключ - добавленный элемент,
    // значение - количество его добавлений
    Map toMap();

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    void toMap(Map destination);

}
