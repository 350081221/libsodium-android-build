package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J!\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0094@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R>\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/flow/f;", "T", "Lkotlinx/coroutines/flow/internal/e;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "i", "Lkotlinx/coroutines/channels/e0;", "scope", "Lkotlin/r2;", bi.aJ, "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "toString", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "d", "Lv3/p;", "block", "<init>", "(Lv3/p;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class f<T> extends kotlinx.coroutines.flow.internal.e<T> {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final v3.p<kotlinx.coroutines.channels.e0<? super T>, kotlin.coroutines.d<? super r2>, Object> f20089d;

    public /* synthetic */ f(v3.p pVar, kotlin.coroutines.g gVar, int i5, kotlinx.coroutines.channels.i iVar, int i6, kotlin.jvm.internal.w wVar) {
        this(pVar, (i6 & 2) != 0 ? kotlin.coroutines.i.INSTANCE : gVar, (i6 & 4) != 0 ? -2 : i5, (i6 & 8) != 0 ? kotlinx.coroutines.channels.i.SUSPEND : iVar);
    }

    static /* synthetic */ <T> Object n(f<T> fVar, kotlinx.coroutines.channels.e0<? super T> e0Var, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object invoke = ((f) fVar).f20089d.invoke(e0Var, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return invoke == l5 ? invoke : r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.e
    @p4.m
    public Object h(@p4.l kotlinx.coroutines.channels.e0<? super T> e0Var, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return n(this, e0Var, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    protected kotlinx.coroutines.flow.internal.e<T> i(@p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        return new f(this.f20089d, gVar, i5, iVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    public String toString() {
        return "block[" + this.f20089d + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@p4.l v3.p<? super kotlinx.coroutines.channels.e0<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, @p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        super(gVar, i5, iVar);
        this.f20089d = pVar;
    }
}
