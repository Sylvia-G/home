package day04.Topic2;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

public class MapList<K,V> {
    private K k;
    private List<V> elementData;

    public static void main(String[] args) {
        MapList<String,List<String>> maplist = MapList.of();

    }

    private MapList(){
        this.elementData = new ArrayList<>();
    }

    /**
     * 用of()方法对MapList<>()对象进行new
     * of()是一个泛型方法
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K,V> MapList<K,V> of(K k, V v){
        return new MapList<>();
    }
    public static <A,B> MapList<A,B> of(){
        return new MapList<>();
    }




    public void put(K k, V v){
        this.elementData.add(v);

        if (null != this.k){
            return;
        }

        this.k = k;
    }

    public boolean contains(V v){
        return this.elementData.contains(v);
    }

    public List<V> getElements(){
        return this.elementData;
    }

}
