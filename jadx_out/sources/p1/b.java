package p1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o1.k;
import o1.o;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@k(modifier = {o.FINAL})
/* loaded from: classes2.dex */
public @interface b {
}
