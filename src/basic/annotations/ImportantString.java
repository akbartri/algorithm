package basic.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //define scope
@Target(ElementType.FIELD)   //define target (ElementType.TYPE = class, ElementType.METHOD = method, ElementType.FIELD = variabel)
public @interface ImportantString {
    int times() default 1;
}
