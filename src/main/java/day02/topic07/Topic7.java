package day02.topic07;

/**
 * 作业7: 老师在黑板画圆
 *
 * 要求: 按照面向对象的思想设计
 *
 * - 老师不一定只会画圆,还可能会画正方形
 *
 * - 老师也可能会画大脸猫
 *
 * - 老师不见得只会在黑板上画,也可以在纸上画
 *
 * - 黑板只能用来画圆吗? 黑板还可以做题的
 *
 * - 圆形,也不是随便画的, 它还有圆心,有半径
 *
 * ----- 思考以上问题,在来设计, 看不懂的就多想想,让自己想5遍以上,如果还是想不明白,再来问老师
 *
 * --ob1: 圆: 构造方法(参数:圆心, 参数:半径){}, 方法{返回周长}
 * --ob1：方: 构造方法(参数:边长){}, 方法{返回周长}
 * --ob1: 大脸猫: 构造方法(参数:xxx){}, 方法{返回xxx}
 *
 * --ob2: 老师, 方法画(参数: 对象(圆/方/大脸猫)): {}
 *
 * --ob3: 黑板, 方法显示(参数: ob1.画()的返回值):{显示}
 * --
 *
 * @author haoc
 */
public class Topic7 {
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();
        BlackBoard blackBoard = new BlackBoard();

        Circular circular = new Circular(2, 5);
        blackBoard.show(mathTeacher.drawOnBlackboard(circular.generateImage()));

    }
}

