package androidx.compose.runtime;

import androidx.navigation.compose.ComposeNavigator;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000D\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u001a,\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0081\b¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0002\b\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0000H\u0000\u001a\b\u0010\u0017\u001a\u00020\u0016H\u0000\u001a\b\u0010\u0019\u001a\u00020\u0018H\u0000*\u001e\b\u0000\u0010\u001c\u001a\u0004\b\u0000\u0010\u001a\"\b\u0012\u0004\u0012\u00028\u00000\u001b2\b\u0012\u0004\u0012\u00028\u00000\u001b*\f\b\u0000\u0010\u001e\"\u00020\u001d2\u00020\u001d¨\u0006\u001f"}, d2 = {"", "instance", "", "identityHashCode", "R", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lv3/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/Composer;", "composer", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", ComposeNavigator.NAME, "invokeComposable", "(Landroidx/compose/runtime/Composer;Lv3/p;)V", "T", "invokeComposableForResult", "(Landroidx/compose/runtime/Composer;Lv3/p;)Ljava/lang/Object;", "it", "ensureMutable", "", "currentThreadId", "", "currentThreadName", "V", "Ljava/util/concurrent/atomic/AtomicReference;", "AtomicReference", "Lp4/p;", "TestOnly", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ActualJvm_jvmKt {
    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }

    @l
    public static final String currentThreadName() {
        return Thread.currentThread().getName();
    }

    public static final void ensureMutable(@l Object obj) {
    }

    public static final int identityHashCode(@m Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void invokeComposable(@l Composer composer, @l p<? super Composer, ? super Integer, r2> pVar) {
        l0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((p) u1.q(pVar, 2)).invoke(composer, 1);
    }

    public static final <T> T invokeComposableForResult(@l Composer composer, @l p<? super Composer, ? super Integer, ? extends T> pVar) {
        l0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, T of androidx.compose.runtime.ActualJvm_jvmKt.invokeComposableForResult>");
        return (T) ((p) u1.q(pVar, 2)).invoke(composer, 1);
    }

    @a1
    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m3238synchronized(@l Object obj, @l v3.a<? extends R> aVar) {
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
