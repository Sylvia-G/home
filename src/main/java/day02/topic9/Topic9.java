package day02.topic9;

/**
 * 作业9: 请用面向对象的思路设计: 马路上跑汽车
 *
 * - 马路: 可能是高速, 也可能是辅路,还可能是乡村公路
 *
 * - 汽车: 可能是宝马, 可能是奔驰, 还可能是奥拓
 *
 * - 请用多态来进行设计
 *
 * @author haoc
 */
public class Topic9 {
    public static void main(String[] args) {
        Cars carsBmw  = new BMW();
        Cars carsMercedes = new Mercedes();

        Road<Cars> road1 = new Highway<>();
        road1.transport(carsBmw);

        Road<Cars> road2 = new CountryRoad<>();
        road2.transport(carsMercedes);
    }
}
