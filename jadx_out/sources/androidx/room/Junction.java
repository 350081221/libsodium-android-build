package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.i0;

@Target({})
@n3.e(n3.a.BINARY)
@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B \u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/room/Junction;", "", "Lkotlin/reflect/d;", t0.b.f22420d, "()Ljava/lang/Class;", "", "parentColumn", "()Ljava/lang/String;", "entityColumn", "room-common"}, k = 1, mv = {1, 8, 0})
@n3.f(allowedTargets = {})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface Junction {
    String entityColumn() default "";

    String parentColumn() default "";

    Class<?> value();
}
