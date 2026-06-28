package p4;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes4.dex */
public @interface e {
    @k
    String mutates() default "";

    boolean pure() default false;

    @k
    String value() default "";
}
