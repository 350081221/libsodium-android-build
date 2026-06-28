package androidx.annotation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@c
@e(a.BINARY)
@f(allowedTargets = {b.FUNCTION, b.PROPERTY_GETTER, b.PROPERTY_SETTER, b.VALUE_PARAMETER, b.FIELD, b.LOCAL_VARIABLE, b.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B(\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\bR\u000f\u0010\u0005\u001a\u00020\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\tR\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\bR\u000f\u0010\u0007\u001a\u00020\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Landroidx/annotation/FloatRange;", "", TypedValues.TransitionType.S_FROM, "", TypedValues.TransitionType.S_TO, "fromInclusive", "", "toInclusive", "()D", "()Z", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@Documented
/* loaded from: classes.dex */
public @interface FloatRange {
    double from() default Double.NEGATIVE_INFINITY;

    boolean fromInclusive() default true;

    double to() default Double.POSITIVE_INFINITY;

    boolean toInclusive() default true;
}
