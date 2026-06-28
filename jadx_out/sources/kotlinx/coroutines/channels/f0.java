package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.z3;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001e\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\tø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001R#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/channels/f0;", "E", "Lkotlinx/coroutines/z3;", "Lkotlinx/coroutines/internal/q0;", "segment", "", "index", "Lkotlin/r2;", "b", "Lkotlinx/coroutines/q;", "Lkotlinx/coroutines/channels/p;", bi.ay, "Lkotlinx/coroutines/q;", "cont", "<init>", "(Lkotlinx/coroutines/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class f0<E> implements z3 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    @u3.e
    public final kotlinx.coroutines.q<p<? extends E>> f19878a;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(@p4.l kotlinx.coroutines.q<? super p<? extends E>> qVar) {
        this.f19878a = qVar;
    }

    @Override // kotlinx.coroutines.z3
    public void b(@p4.l q0<?> q0Var, int i5) {
        this.f19878a.b(q0Var, i5);
    }
}
