package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0002J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J!\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000f\u001a\u00020\u0012H\u0016J!\u0010\u0017\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\u0019H\u0014R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u000b\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lkotlinx/coroutines/flow/e;", "T", "Lkotlinx/coroutines/flow/internal/e;", "Lkotlin/r2;", "n", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "i", "Lkotlinx/coroutines/flow/i;", "j", "Lkotlinx/coroutines/channels/e0;", "scope", bi.aJ, "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/channels/g0;", "m", "Lkotlinx/coroutines/flow/j;", "collector", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "e", "d", "Lkotlinx/coroutines/channels/g0;", "channel", "", "Z", "consume", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "<init>", "(Lkotlinx/coroutines/channels/g0;ZLkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/ChannelAsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
/* loaded from: classes4.dex */
public final class e<T> extends kotlinx.coroutines.flow.internal.e<T> {

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20086f = AtomicIntegerFieldUpdater.newUpdater(e.class, "consumed");

    @u3.w
    private volatile int consumed;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final kotlinx.coroutines.channels.g0<T> f20087d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20088e;

    public /* synthetic */ e(kotlinx.coroutines.channels.g0 g0Var, boolean z4, kotlin.coroutines.g gVar, int i5, kotlinx.coroutines.channels.i iVar, int i6, kotlin.jvm.internal.w wVar) {
        this(g0Var, z4, (i6 & 4) != 0 ? kotlin.coroutines.i.INSTANCE : gVar, (i6 & 8) != 0 ? -3 : i5, (i6 & 16) != 0 ? kotlinx.coroutines.channels.i.SUSPEND : iVar);
    }

    private final void n() {
        if (this.f20088e) {
            boolean z4 = true;
            if (f20086f.getAndSet(this, 1) != 0) {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.e, kotlinx.coroutines.flow.i
    @p4.m
    public Object collect(@p4.l j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object l6;
        if (this.f20111b == -3) {
            n();
            Object e5 = m.e(jVar, this.f20087d, this.f20088e, dVar);
            l6 = kotlin.coroutines.intrinsics.d.l();
            if (e5 == l6) {
                return e5;
            }
            return r2.f19517a;
        }
        Object collect = super.collect(jVar, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (collect == l5) {
            return collect;
        }
        return r2.f19517a;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    protected String e() {
        return "channel=" + this.f20087d;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.m
    protected Object h(@p4.l kotlinx.coroutines.channels.e0<? super T> e0Var, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object e5 = m.e(new kotlinx.coroutines.flow.internal.y(e0Var), this.f20087d, this.f20088e, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return e5 == l5 ? e5 : r2.f19517a;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    protected kotlinx.coroutines.flow.internal.e<T> i(@p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        return new e(this.f20087d, this.f20088e, gVar, i5, iVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    public i<T> j() {
        return new e(this.f20087d, this.f20088e, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    public kotlinx.coroutines.channels.g0<T> m(@p4.l kotlinx.coroutines.s0 s0Var) {
        n();
        if (this.f20111b == -3) {
            return this.f20087d;
        }
        return super.m(s0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@p4.l kotlinx.coroutines.channels.g0<? extends T> g0Var, boolean z4, @p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        super(gVar, i5, iVar);
        this.f20087d = g0Var;
        this.f20088e = z4;
        this.consumed = 0;
    }
}
