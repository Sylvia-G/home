package day02.topic07;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Sylvia-G
 * @Date: 2020/1/5 17:53
 */
public class Circular implements Sharp {
    private Integer center;
    private float radius;

    public Circular(Integer center, float radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public Map generateImage() {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>(1);

        BigDecimal bigDecimal1 = new BigDecimal(this.radius);
        BigDecimal bigDecimal2 = new BigDecimal(2 * 3.14);
        String res = bigDecimal1.multiply(bigDecimal2).toString();

        integerStringHashMap.put(this.center, res);

        return integerStringHashMap;
    }
}
