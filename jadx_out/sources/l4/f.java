package l4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes4.dex */
public @interface f {
    Class<?> entity();

    String sourceProperty();

    String targetProperty();
}
