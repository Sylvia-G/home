package day02.topic07;

import java.util.Map;

/**
 * @Author: Sylvia-G
 * @Date: 2020/1/5 17:50
 */
public interface Sharp {

    /**
     * 该方法实现生成图像, 返回的String用于Teacher.drawOnBlackboard()传参
     * 也就是老师脑海生成什么图像要靠这个方法
     * @return
     */
    Map generateImage();
}
