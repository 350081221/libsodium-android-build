package androidx.compose.runtime.snapshots;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.i0;
import n3.e;
import n3.f;

@Target({ElementType.METHOD})
@e(n3.a.BINARY)
@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/AutoboxingStateValueProperty;", "", "preferredPropertyName", "", "()Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f(allowedTargets = {n3.b.PROPERTY_SETTER, n3.b.PROPERTY_GETTER})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface AutoboxingStateValueProperty {
    String preferredPropertyName();
}
