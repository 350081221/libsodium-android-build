package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.ThreadMap;
import androidx.compose.runtime.internal.ThreadMap_jvmKt;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bR$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/SnapshotThreadLocal;", "T", "", "get", "()Ljava/lang/Object;", b.f22420d, "Lkotlin/r2;", "set", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/ThreadMap;", "Landroidx/compose/runtime/AtomicReference;", "map", "Ljava/util/concurrent/atomic/AtomicReference;", "writeMutex", "Ljava/lang/Object;", "mainThreadValue", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nActualJvm.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,119:1\n82#2:120\n*S KotlinDebug\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n*L\n67#1:120\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotThreadLocal<T> {
    public static final int $stable = 8;

    @m
    private T mainThreadValue;

    @l
    private final AtomicReference<ThreadMap> map = new AtomicReference<>(ThreadMap_jvmKt.getEmptyThreadMap());

    @l
    private final Object writeMutex = new Object();

    @m
    public final T get() {
        if (Thread.currentThread().getId() == ActualAndroid_androidKt.getMainThreadId()) {
            return this.mainThreadValue;
        }
        return (T) this.map.get().get(Thread.currentThread().getId());
    }

    public final void set(@m T t5) {
        long id = Thread.currentThread().getId();
        if (id == ActualAndroid_androidKt.getMainThreadId()) {
            this.mainThreadValue = t5;
            return;
        }
        synchronized (this.writeMutex) {
            ThreadMap threadMap = this.map.get();
            if (threadMap.trySet(id, t5)) {
                return;
            }
            this.map.set(threadMap.newWith(id, t5));
            r2 r2Var = r2.f19517a;
        }
    }
}
