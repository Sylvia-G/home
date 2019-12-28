package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author haoc
 * @Target 注解的作用范围
 * @Retention 注解的作用时机
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface FooAnnotation {

  // 默认的key
  String value();

  // String foo();
  //
  // String name() default "哈哈";
}
