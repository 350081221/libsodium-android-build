package androidx.compose.ui.platform;

import java.util.Arrays;

@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a,\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0081\b¢\u0006\u0004\b\n\u0010\u000b*\f\b\u0000\u0010\r\"\u00020\f2\u00020\f¨\u0006\u000e"}, d2 = {"", "obj", "", "name", "simpleIdentityToString", "nativeClass", "R", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lv3/a;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicInteger;", "AtomicInt", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class JvmActuals_jvmKt {
    @p4.l
    public static final Object nativeClass(@p4.l Object obj) {
        return obj.getClass();
    }

    @p4.l
    public static final String simpleIdentityToString(@p4.l Object obj, @p4.m String str) {
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        kotlin.jvm.internal.t1 t1Var = kotlin.jvm.internal.t1.f19457a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        kotlin.jvm.internal.l0.o(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }

    @kotlin.a1
    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m5323synchronized(@p4.l Object obj, @p4.l v3.a<? extends R> aVar) {
        R invoke;
        synchronized (obj) {
            try {
                invoke = aVar.invoke();
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.i0.c(1);
        return invoke;
    }
}
