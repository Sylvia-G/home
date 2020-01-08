package day02.topic07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Sylvia-G
 * @Date: 2020/1/5 17:21
 */
public class BlackBoard implements Medium<Integer, String>{

    @Override
    public void show(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println("落笔位置: " + entry.getKey() + ", 画出的对象: " + entry.getValue());
        }
    }
}
