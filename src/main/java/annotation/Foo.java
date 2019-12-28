package annotation;

/**
 * @author haoc
 */
// @FooAnnotation(foo = "")
// @FooAnnotation(value = "xxxx")
@FooAnnotation("xxxx")
public class Foo {

  // @FooAnnotation(foo = "")
  @FooAnnotation("xxx")
  // public void foo(@FooAnnotation(foo = "", name = "这是参数") String foo) {
  public void foo(@FooAnnotation("xxxx") String foo) {
  }
}
