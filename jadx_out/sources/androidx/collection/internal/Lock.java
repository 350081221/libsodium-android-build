package androidx.collection.internal;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"Landroidx/collection/internal/Lock;", "", "T", "Lkotlin/Function0;", "block", "synchronizedImpl", "(Lv3/a;)Ljava/lang/Object;", "<init>", "()V", "collection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Lock {
    public final <T> T synchronizedImpl(@l a<? extends T> block) {
        T invoke;
        l0.p(block, "block");
        synchronized (this) {
            try {
                invoke = block.invoke();
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
