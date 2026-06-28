package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.i0;
import n3.a;
import n3.e;
import n3.f;
import t0.b;

@Target({ElementType.FIELD, ElementType.METHOD})
@e(a.BINARY)
@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/annotation/GuardedBy;", "", b.f22420d, "", "()Ljava/lang/String;", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@f(allowedTargets = {n3.b.FIELD, n3.b.FUNCTION, n3.b.PROPERTY_GETTER, n3.b.PROPERTY_SETTER})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface GuardedBy {
    String value();
}
