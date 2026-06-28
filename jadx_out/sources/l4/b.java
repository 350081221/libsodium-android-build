package l4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes4.dex */
public @interface b {
    boolean active() default false;

    boolean createInDb() default true;

    boolean generateConstructors() default true;

    boolean generateGettersSetters() default true;

    e[] indexes() default {};

    String nameInDb() default "";

    Class protobuf() default void.class;

    String schema() default "default";
}
