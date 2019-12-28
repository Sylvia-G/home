package day02;


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
  public static void main(String[] args) {
//    test1();
//    test2();
//    test3();
//    test4();
//    test5();
    test6();
  }

  // 入栈, 不超过栈初始定义大小
  public static void test1(){
    IntStack intstack = new IntStack();
    intstack.enqueue(10);
    intstack.enqueue(1000);
    System.out.println("入栈, 不超过栈初始定义大小");
    intstack.toString();
  }

  // 入栈, 刚好等于栈初始定义大小
  public static void test2(){
    IntStack intstack = new IntStack();
    intstack.enqueue(10);
    intstack.enqueue(1000);
    intstack.enqueue(20);
    intstack.enqueue(1000);
    intstack.enqueue(30);
    System.out.println("入栈, 刚好等于栈初始定义大小");
    intstack.toString();
  }

  // 入栈, 超过栈初始定义的大小
  public static void test3(){
    IntStack intstack = new IntStack();
    intstack.enqueue(10);
    intstack.enqueue(1000);
    intstack.enqueue(20);
    intstack.enqueue(1000);
    intstack.enqueue(30);
    intstack.enqueue(1000);
    System.out.println("入栈, 超过栈初始定义的大小");
    intstack.toString();
  }

  // 连续多次出栈arr[0], 栈中只有1个元素
  public static void test4(){
    IntStack intstack = new IntStack();
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

  // 连续多次出栈arr[0], 栈中只有多个元素
  public static void test5(){
    IntStack intstack = new IntStack();
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
  // 连续多次出栈再入栈, 栈尾index<栈头index, 入栈栈容量不满(测试结果:下标1:999 下标2: 20 下标3: 1000 下标4: 30)
  public static void test6(){
    IntStack intstack = new IntStack();
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


}

/**
 * 例如
 */
class IntStack {
  int headIndex = 0;
  int tailIndex = 0;
  int defaultSize = 5;
  int[] stackarr;


  void enqueue(int element) {
    // 栈大小为空
    if (this.headIndex == 0 && this.tailIndex == 0){
      this.stackarr = new int[this.defaultSize];
      this.stackarr[headIndex] = element;
      this.tailIndex += 1;
    }
    else if (0 <= this.headIndex && this.headIndex < this.tailIndex && this.tailIndex <= this.stackarr.length-1){
      this.stackarr[tailIndex] = element;
      this.tailIndex += 1;
    }
    else if(this.tailIndex == this.stackarr.length-1){
      int copyarr1[] = new int[this.stackarr.length + defaultSize];
      for (int i=0; i< this.stackarr.length; i++){
        copyarr1[i] = this.stackarr[i];
      }
      this.stackarr = copyarr1;
      this.stackarr[tailIndex] = element;
      this.tailIndex += 1;
    }

    else if (0 < this.tailIndex  && this.tailIndex < this.headIndex && this.headIndex <= this.stackarr.length-1){
      if (this.tailIndex > 0 && this.tailIndex < this.headIndex){
        this.stackarr[this.tailIndex] = element;
        this.tailIndex += 1;
      }
    }
    // 需要防止tailIndex = headIndex
    else if (this.tailIndex > 0 && this.tailIndex == this.headIndex){
      int copyarr2[] = new int[this.stackarr.length + defaultSize];
      int indexflag = 0;
      for (int i = this.headIndex; i < this.stackarr.length-1; i++){
        copyarr2[indexflag] = this.stackarr[i];
        indexflag += 1;
      }
      for (int j = 0; j < this.tailIndex; j++){
        copyarr2[indexflag] = this.stackarr[j];
        indexflag += 1;
      }

    }
  }

  /**
   * 这个是取出栈顶元素,栈中就没有这个元素了
   */
  void dequeue() {
    this.headIndex += 1;
  }

  /**
   * 获取栈顶元素,意味着只是读取,这个元素还还会存储在栈中
   */
  int getFront() {
    return -1;
  }

  int length() {
    return -1;
  }

  boolean isEmpty() {
    boolean isempty = true;
    if (this.tailIndex != 0){
      isempty = false;
    }
    return isempty;
  }


  @Override
  public String toString() {
    //要判断栈头栈尾位置，区别打印
    for (int i = this.headIndex; i<this.stackarr.length-1; i++){
      System.out.print("下标" + i + ": " + this.stackarr[i] + " " );
    }
    for (int j = 0; j < this.tailIndex-1; j++) {
      System.out.print("下标" + j + ": " + this.stackarr[j] + " " );
    }
    System.out.println();
    return null;
  }
}
