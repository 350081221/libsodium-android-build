package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.i0;
import n3.a;
import n3.b;
import n3.c;
import n3.e;
import n3.f;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@c
@e(a.BINARY)
@f(allowedTargets = {b.ANNOTATION_CLASS, b.CLASS, b.FUNCTION, b.PROPERTY_GETTER, b.PROPERTY_SETTER, b.CONSTRUCTOR, b.FIELD, b.FILE})
@Retention(RetentionPolicy.CLASS)
@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003R\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/annotation/RequiresApi;", "", t0.b.f22420d, "", "api", "()I", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@Documented
/* loaded from: classes.dex */
public @interface RequiresApi {
    int api() default 1;

    int value() default 1;
}
