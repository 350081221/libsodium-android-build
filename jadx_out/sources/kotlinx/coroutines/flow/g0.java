package kotlinx.coroutines.flow;

import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlinx.coroutines.l2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096Aø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00028\u00008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/flow/g0;", "T", "Lkotlinx/coroutines/flow/t0;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/r;", "Lkotlinx/coroutines/flow/j;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "Lkotlinx/coroutines/flow/i;", bi.ay, "Lkotlinx/coroutines/l2;", "Lkotlinx/coroutines/l2;", ServiceManagerNative.JOB, "", "d", "()Ljava/util/List;", "replayCache", "getValue", "()Ljava/lang/Object;", t0.b.f22420d, "flow", "<init>", "(Lkotlinx/coroutines/flow/t0;Lkotlinx/coroutines/l2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class g0<T> implements t0<T>, c<T>, kotlinx.coroutines.flow.internal.r<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private final l2 f20098a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t0<T> f20099b;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(@p4.l t0<? extends T> t0Var, @p4.m l2 l2Var) {
        this.f20098a = l2Var;
        this.f20099b = t0Var;
    }

    @Override // kotlinx.coroutines.flow.internal.r
    @p4.l
    public i<T> a(@p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        return v0.d(this, gVar, i5, iVar);
    }

    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @p4.m
    public Object collect(@p4.l j<? super T> jVar, @p4.l kotlin.coroutines.d<?> dVar) {
        return this.f20099b.collect(jVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.i0
    @p4.l
    public List<T> d() {
        return this.f20099b.d();
    }

    @Override // kotlinx.coroutines.flow.t0
    public T getValue() {
        return this.f20099b.getValue();
    }
}
