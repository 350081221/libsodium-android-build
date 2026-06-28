package kotlinx.coroutines.android;

import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlin.r2;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.n1;
import kotlinx.coroutines.x2;
import p4.l;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/android/e;", "Lkotlinx/coroutines/x2;", "Lkotlinx/coroutines/c1;", "E0", "()Lkotlinx/coroutines/android/e;", "immediate", "<init>", "()V", "Lkotlinx/coroutines/android/d;", "kotlinx-coroutines-android"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class e extends x2 implements c1 {
    private e() {
    }

    public /* synthetic */ e(w wVar) {
        this();
    }

    @l
    public abstract e E0();

    @l
    public n1 I(long j5, @l Runnable runnable, @l kotlin.coroutines.g gVar) {
        return c1.a.b(this, j5, runnable, gVar);
    }

    @Override // kotlinx.coroutines.c1
    @k(level = m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @p4.m
    public Object p0(long j5, @l kotlin.coroutines.d<? super r2> dVar) {
        return c1.a.a(this, j5, dVar);
    }
}
