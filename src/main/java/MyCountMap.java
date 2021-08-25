import java.util.HashMap;
import java.util.Map;

public class MyCountMap<K> implements CountMap<K>{

    private K key;
    private Integer value;
    private HashMap<K,Integer> hashMap = new HashMap<>();

    public MyCountMap(K key) {
        this.key = key;
        //this.value = value;
        this.hashMap.put(this.key, 0);
    }

    public MyCountMap(HashMap<K, Integer> hashMap) {
        this.hashMap.putAll(hashMap);
    }

    public MyCountMap() {
    }

    @Override
    public void add(K object) {
        if (this.hashMap.containsKey(object))
        {
            this.hashMap.put(object,this.hashMap.get(object)+1);
        }
        else {
            this.hashMap.put(object,1);
        }
    }

    @Override
    public int getCount(K object) {
        return this.hashMap.get(object);
    }

    @Override
    public int remove(K object) {
        int res = this.hashMap.get(object);
        this.hashMap.remove(object);
        return res;
    }

    @Override
    public int size() {
        return this.hashMap.size();
    }

    @Override
    public void addAll(CountMap source) {
        for (int i = 0; i < source.size(); i++)
        {
            this.hashMap.putAll(source.toMap());
        }
    }

    @Override
    public Map toMap() {
        HashMap<K,Integer> hashMap = new HashMap<>(this.hashMap);
        return hashMap;
    }

    @Override
    public void toMap(Map destination) {

    }

}
