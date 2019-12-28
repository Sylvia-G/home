package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 不能为空
 *
 * @author haoc
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {

  String value() default "不要传Null哈";
}
