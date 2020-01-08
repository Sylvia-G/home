package day02;


import org.junit.Test;

/**
 * 作业6: 使用数组实现一个栈,元素整型即可
 *
 * 要求:
 *
 * - 实现入栈,enqueue
 *
 * - 实现出栈,dequeue
 *
 * - 实现获取栈顶元素值,getFront
 *
 * - 实现获取栈的大小
 *
 * - 实现判断栈是否为空
 *
 * @author haoc
 */
public class Topic6 {

  /**
   * 入栈, 不超过栈初始定义大小
   */
  @Test
  public void test1(){
    IntStackBak intstack = new IntStackBak();
    intstack.enqueue(10);
    intstack.enqueue(1000);
    System.out.println("入栈, 不超过栈初始定义大小");
    intstack.toString();
  }

  /**
   * 入栈, 刚好等于栈初始定义大小
   */
  @Test
  public void test2(){
    IntStackBak intstack = new IntStackBak();
    intstack.enqueue(10);
    intstack.enqueue(1000);
    intstack.enqueue(20);
    intstack.enqueue(1000);
    intstack.enqueue(30);
    System.out.println("入栈, 刚好等于栈初始定义大小");
    intstack.toString();
  }

  /**
   * 入栈, 超过栈初始定义的大小
   */
  @Test
  public void test3(){
    IntStackBak intstack = new IntStackBak();
    intstack.enqueue(10);
    intstack.enqueue(1000);
    intstack.enqueue(20);
    intstack.enqueue(1000);
    intstack.enqueue(30);
    intstack.enqueue(1000);
    System.out.println("入栈, 超过栈初始定义的大小");
    intstack.toString();
  }

  /**
   * 连续多次出栈arr[0], 栈中只有1个元素
   */
  @Test
  public void test4(){
    IntStackBak intstack = new IntStackBak();
    intstack.enqueue(10);
    System.out.println("出栈前: " );
    intstack.toString();
    intstack.dequeue();
    System.out.println("出栈后: " );
    intstack.toString();
    intstack.dequeue();
    System.out.println("再次出栈: " );
    intstack.toString();

  }

  /**
   * 连续多次出栈arr[0], 栈中只有多个元素
   */
  @Test
  public void test5(){
    IntStackBak intstack = new IntStackBak();
    intstack.enqueue(10);
    intstack.enqueue(1000);
    System.out.println("出栈前: " );
    intstack.toString();
    intstack.dequeue();
    System.out.println("出栈后: " );
    intstack.toString();
    intstack.dequeue();
    System.out.println("再次出栈: " );
    intstack.toString();
  }

  /**
   * 连续多次出栈再入栈
   */
  @Test
  public void test6(){
    IntStackBak intstack = new IntStackBak();
    intstack.enqueue(10);
    intstack.enqueue(1000);
    intstack.enqueue(20);
    intstack.enqueue(1000);
    intstack.enqueue(30);
    System.out.println("出栈前: " );
    intstack.toString();

    intstack.dequeue();
    intstack.dequeue();
    System.out.println("2次出栈后: " );
    intstack.toString();

    intstack.enqueue(999);
    System.out.println("1次入栈后: ");
    intstack.toString();

  }

  /**
   * 获取栈顶元素
   */
  @Test
  public void test7(){
    IntStackBak intstack = new IntStackBak();
    intstack.enqueue(10);
    intstack.enqueue(1000);
    System.out.println(intstack.getFront());
  }

  /**
   * 实现获取栈的大小
   */
  @Test
  public void test8(){
    IntStackBak intstack = new IntStackBak();
    intstack.enqueue(10);
    intstack.enqueue(1000);
    System.out.println(intstack.getLength());
  }

  /**
   * 判断栈是否为空
   */
  @Test
  public void test9(){
    IntStackBak stackNotNull = new IntStackBak();
    stackNotNull.enqueue(10);
    stackNotNull.enqueue(1000);
    System.out.println(stackNotNull.isEmpty());

    IntStackBak stackNull = new IntStackBak();
    System.out.println(stackNull.isEmpty());
  }

  static class IntStackBak {
//  int headIndex = 0;
  private int tailIndex = 0;
  int defaultSize = 5;
  public int[] stackarr;

  public IntStackBak() {
    this.stackarr = new int[this.defaultSize];
  }

  void enqueue(int element) {
    // 栈大小为空
    if (this.tailIndex == 0){
      this.stackarr = new int[this.defaultSize];
      this.stackarr[tailIndex] = element;
      this.tailIndex += 1;
    }
    else if (0 <=  this.tailIndex && this.tailIndex <= this.stackarr.length-1){
      this.stackarr[tailIndex] = element;
      this.tailIndex += 1;
    }
    else if(this.tailIndex == this.stackarr.length){
      int copyarr[] = new int[this.stackarr.length + defaultSize];
      for (int i=0; i< this.stackarr.length; i++){
        copyarr[i] = this.stackarr[i];
      }
      this.stackarr = copyarr;
      this.stackarr[tailIndex] = element;
      this.tailIndex += 1;
    }
  }

  /**
   * 这个是取出栈顶元素,栈中就没有这个元素了
   */
  void dequeue() {
    if (this.tailIndex==0){
      System.out.println("栈已空，不能再出栈");
    }else {
      this.stackarr[this.tailIndex-1]=0;
      this.tailIndex--;
    }


  }


  /**
   * 获取栈顶元素,意味着只是读取,这个元素还还会存储在栈中
   */
  int getFront() {
    return this.stackarr[0];
  }

  int getLength() {
    return this.tailIndex;
  }

  boolean isEmpty() {
    if(this.tailIndex==0){
      return true;
    }else {
      return false;
    }
  }


  @Override
  public String toString() {
    for (int arr : this.stackarr) {
      System.out.println(arr);
    }
    return null;
  }
}
}
