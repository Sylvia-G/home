package day01;

import java.math.BigDecimal;

/**
 * 作业1: 使用BigDecimal写一个计算器,实现加减乘除,考虑可能很大的数值计算场景
 *
 * @author haoc
 */
public class mumuTopic1 {

  public static void main(String[] args) {
//     testBigNumber1();
//     testBigNumber2();
//     testBigNumber3();
//     testFloatNumber();
//     testLtZero1();
//     testLtZero2();
//     testZero();
//     testNotNumber1();
//     testNotNumber2();
//     testInvalideParams1();
//     testInvalideParams2();
//     testInvalideParams3();
//     testInvalideParams4();
//     testInvalideParams5();
//     testInvalideParams6();
//     testStrictInvalidParams1();
//     testStrictInvalidParams2();
//     testStrictInvalidParams3();
//     testStrictInvalidParams4();
//     testStrictInvalidParams5();
//     testStrictInvalidParams6();

    // by 网络-北京-王彦娜
    testAppend1();
    testAppend2();
  }

  /**
   * case 追加,
   */
  public static void testAppend1() {
    String response = add(
        "123",
        "-123");
    System.out.println(response);
  }

  /**
   * case 追加,
   */
  public static void testAppend2() {
    String response = add(
        "123",
        "1-23");
    System.out.println(response);
  }

  /**
   * case 1, 大数测试,64边界
   */
  public static void testBigNumber1() {
    String response = add(
        "1111111111111111111111111111111111111111111111111111111111111111",
        "1111111111111111111111111111111111111111111111111111111111111111");
    System.out.println(response);
  }

  /**
   * case 2, 大数测试,65长度
   */
  public static void testBigNumber2() {
    String response = add(
        "11111111111111111111111111111111111111111111111111111111111111119",
        "11111111111111111111111111111111111111111111111111111111111111119");
    System.out.println(response);
  }

  /**
   * case 3, 大数测试,63长度
   */
  public static void testBigNumber3() {
    String response = add(
        "1111111111111111111111111111111111111111111111111111111111111119",
        "1111111111111111111111111111111111111111111111111111111111111119");
    System.out.println(response);
  }

  /**
   * case 4, 浮点数,超长测试
   */
  public static void testFloatNumber() {
    String response = add(
        "1.00000000000000000000000000000000000000000000000000000000000001",
        "1.00000000000000000000000000000000000000000000000000000000000001");
    System.out.println(response);
  }

  /**
   * case 5, 浮点数大数测试,小于0
   */
  public static void testLtZero1() {
    String response = add(
        "0.10000000000000000000000000000000000000000000000000000000000001",
        "0.10000000000000000000000000000000000000000000000000000000000001");
    System.out.println(response);
  }

  /**
   * case 6, 浮点数大数测试,小于0
   *
   * TODO 结果为 2E-62,貌似也对
   */
  public static void testLtZero2() {
    String response = add(
        "0.00000000000000000000000000000000000000000000000000000000000001",
        "0.00000000000000000000000000000000000000000000000000000000000001");
    System.out.println(response);
  }

  /**
   * case 7, 0
   */
  public static void testZero() {
    String response = add("0", "0");
    System.out.println(response);
  }

  /**
   * case 8, not number,num1
   */
  public static void testNotNumber1() {
    String response = add("a", "1234");
    System.out.println(response);
  }

  /**
   * case 9, not number,num2
   */
  public static void testNotNumber2() {
    String response = add("1234", "abc");
    System.out.println(response);
  }

  /**
   * case 10, 异常参数,num1异常,为空串
   */
  public static void testInvalideParams1() {
    String response = add("", "1234");
    System.out.println(response);
  }

  /**
   * case 11, 异常参数,num1异常,为null
   */
  public static void testInvalideParams2() {
    String response = add(null, "1234");
    System.out.println(response);
  }

  /**
   * case 12, 异常参数,num2异常,为空串
   */
  public static void testInvalideParams3() {
    String response = add("1234", "");
    System.out.println(response);
  }

  /**
   * case 13, 异常参数,num2异常,为null
   */
  public static void testInvalideParams4() {
    String response = add("1234", null);
    System.out.println(response);
  }

  /**
   * case 14, 异常参数,num1异常
   */
  public static void testInvalideParams5() {
    String response = add("12 34", "1234");
    System.out.println(response);
  }

  /**
   * case 15, 异常参数,num2异常
   */
  public static void testInvalideParams6() {
    String response = add("1234", "12 34");
    System.out.println(response);
  }

  /**
   * case 16, 异常数值
   */
  public static void testStrictInvalidParams1() {
    String response = add(".123", "123");
    System.out.println(response);
  }

  /**
   * case 17, 异常数值
   */
  public static void testStrictInvalidParams2() {
    String response = add("1.2.3", "123");
    System.out.println(response);
  }

  /**
   * case 18, 异常数值
   */
  public static void testStrictInvalidParams3() {
    String response = add("123.", "123");
    System.out.println(response);
  }

  /**
   * case 19, 异常数值
   */
  public static void testStrictInvalidParams4() {
    String response = add("123", ".123");
    System.out.println(response);
  }

  /**
   * case 20, 异常数值
   */
  public static void testStrictInvalidParams5() {
    String response = add("123", "1.2.3");
    System.out.println(response);
  }

  /**
   * case 21, 异常数值
   */
  public static void testStrictInvalidParams6() {
    String response = add("123", "123.");
    System.out.println(response);
  }

  /**
   * 加法计算
   *
   * @param num1 加数1
   * @param num2 加数2
   * @return 返回值
   */
  public static String add(String num1, String num2) {
    // 基本参数校验,非空校验
    boolean isValided = requiredNotBlank(num1, num2);
    if (!isValided) {
      System.err.println("参数异常,两个数不可以为空,不可以为null");
      return null;
    }

    /**
     * 长度校验,基于诉求,这个要确定一下大数的边界,最大是多大,难不成还100万个单位的?
     *
     * 所以即使我说了考虑大数, 但是也要问一下范围,假设数值最大长度支持64位
     *
     * 到目前没一个人问过我,长度最大限制是多少!!!
     */
    if (!requiredLength(num1, num2)) {
      System.err.println("参数异常,两个数长度超过了最大限制");
      return null;
    }

    /**
     * 校验数值是否合法
     */
    boolean isNum1Valid = requiredCommonsNumeric(num1);
    if (!isNum1Valid) {
      System.err.println("num1不合法,不信你看看num1是啥:[" + num1 + "]");
      return null;
    }
    boolean isNum2Valid = requiredCommonsNumeric(num2);
    if (!isNum2Valid) {
      System.err.println("num2不合法,不信你看看num2是啥:[" + num2 + "]");
      return null;
    }

    /**
     * 校验数据是否是数值,比如1..1,或者.11
     */
    boolean isNum1StrictValid = requiredStrictNumber(num1);
    if (!isNum1StrictValid) {
      System.err.println("num1不合法,不信你看看num1是啥:[" + num1 + "]");
      return null;
    }
    boolean isNum2StrictValid = requiredStrictNumber(num2);
    if (!isNum2StrictValid) {
      System.err.println("num2不合法,不信你看看num2是啥:[" + num2 + "]");
      return null;
    }

    // 包装数值,做一下trim
    BigDecimal decimal1 = new BigDecimal(num1.trim());
    BigDecimal decimal2 = new BigDecimal(num2.trim());

    return decimal1.add(decimal2).toString();
  }

  private static boolean requiredStrictNumber(String str) {
    int sum = 0;
    char[] chars = str.toCharArray();
    if (chars[0] == '.' || chars[chars.length - 1] == '.') {
      return false;
    }

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == '.') {
        sum++;
      }

      if (chars[i] == '-' && i != 0) {
        return false;
      }
    }

    return sum <= 1;
  }

  private static boolean requiredCommonsNumeric(String str) {
    // 不需要校验非空,入参已处理
    char[] chars = str.toCharArray();
    for (char ch : chars) {
      // 数值表示,一般在0~9之间,以及小数点
      if (('0' < ch && ch < '9') || ch == '.'
          || ch == '-') {
        // 说明数值在0-9之间,或者是.
        continue;
      }

      return false;
    }

    return true;
  }

  private static boolean requiredLength(String str1, String str2) {
    return str1.length() <= 64 && str2.length() <= 64;
  }

  private static boolean requiredNotBlank(String str1, String str2) {
    if (null == str1 || null == str2) {
      return false;
    }

    if (str1.trim().isEmpty() || str2.trim().isEmpty()) {
      return false;
    }

    return true;
  }
}
