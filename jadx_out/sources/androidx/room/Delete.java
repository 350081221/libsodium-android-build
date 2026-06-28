package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.i0;

@Target({ElementType.METHOD})
@n3.e(n3.a.BINARY)
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u000e\u0012\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/Delete;", "", "Lkotlin/reflect/d;", "entity", "()Ljava/lang/Class;", "room-common"}, k = 1, mv = {1, 8, 0})
@n3.f(allowedTargets = {n3.b.FUNCTION})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface Delete {
    Class<?> entity() default Object.class;
}
