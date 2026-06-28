package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;
import kotlin.b1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.channels.h0;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.m2;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.t2;

@kotlin.i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B%\u0012\u0006\u00104\u001a\u000203\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u00105\u001a\u00020\u000e¢\u0006\u0004\b6\u00107J.\u0010\f\u001a\u00020\u00032#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0006H\u0096\u0001J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0001J\u001b\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u0016\u0010\u001b\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u000eH\u0014J\u0012\u0010\u0001\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016R \u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+0*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010(R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Lkotlinx/coroutines/channels/g;", "E", "Lkotlinx/coroutines/a;", "Lkotlin/r2;", "Lkotlinx/coroutines/channels/e0;", "Lkotlinx/coroutines/channels/d;", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "cause", "handler", "I", "element", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/g0;", "n", "F", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p;", bi.aA, "(Ljava/lang/Object;)Ljava/lang/Object;", bi.ay, "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancel", "d0", t0.b.f22420d, "y1", "(Lkotlin/r2;)V", "handled", "u1", "d", "Lkotlinx/coroutines/channels/d;", "x1", "()Lkotlinx/coroutines/channels/d;", "_channel", "G", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/i;", "Lkotlinx/coroutines/channels/h0;", "l", "()Lkotlinx/coroutines/selects/i;", "onSend", "isActive", "getChannel", "()Lkotlinx/coroutines/channels/h0;", "channel", "Lkotlin/coroutines/g;", "parentContext", "active", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/d;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,202:1\n705#2,2:203\n705#2,2:205\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n*L\n152#1:203,2\n157#1:205,2\n*E\n"})
/* loaded from: classes4.dex */
class g<E> extends kotlinx.coroutines.a<r2> implements e0<E>, d<E> {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final d<E> f19879d;

    public g(@p4.l kotlin.coroutines.g gVar, @p4.l d<E> dVar, boolean z4) {
        super(gVar, false, z4);
        this.f19879d = dVar;
        H0((l2) gVar.get(l2.U));
    }

    @Override // kotlinx.coroutines.channels.h0
    public boolean E(@p4.m Throwable th) {
        boolean E = this.f19879d.E(th);
        start();
        return E;
    }

    @Override // kotlinx.coroutines.channels.h0
    @p4.m
    public Object F(E e5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return this.f19879d.F(e5, dVar);
    }

    @Override // kotlinx.coroutines.channels.h0
    public boolean G() {
        return this.f19879d.G();
    }

    @Override // kotlinx.coroutines.channels.h0
    public void I(@p4.l v3.l<? super Throwable, r2> lVar) {
        this.f19879d.I(lVar);
    }

    @Override // kotlinx.coroutines.t2, kotlinx.coroutines.l2, kotlinx.coroutines.channels.d
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean a(Throwable th) {
        if (th == null) {
            th = new m2(g0(), null, this);
        }
        d0(th);
        return true;
    }

    @Override // kotlinx.coroutines.t2, kotlinx.coroutines.l2, kotlinx.coroutines.channels.d
    public final void cancel(@p4.m CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new m2(g0(), null, this);
        }
        d0(cancellationException);
    }

    @Override // kotlinx.coroutines.t2
    public void d0(@p4.l Throwable th) {
        CancellationException l12 = t2.l1(this, th, null, 1, null);
        this.f19879d.cancel(l12);
        Z(l12);
    }

    @Override // kotlinx.coroutines.channels.e0
    @p4.l
    public h0<E> getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.t2, kotlinx.coroutines.l2
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.channels.h0
    @p4.l
    public kotlinx.coroutines.selects.i<E, h0<E>> l() {
        return this.f19879d.l();
    }

    @p4.l
    public g0<E> n() {
        return this.f19879d.n();
    }

    @Override // kotlinx.coroutines.channels.h0
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e5) {
        return this.f19879d.offer(e5);
    }

    @Override // kotlinx.coroutines.channels.h0
    @p4.l
    public Object p(E e5) {
        return this.f19879d.p(e5);
    }

    @Override // kotlinx.coroutines.a
    protected void u1(@p4.l Throwable th, boolean z4) {
        if (!this.f19879d.E(th) && !z4) {
            p0.b(getContext(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.l
    public final d<E> x1() {
        return this.f19879d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public void v1(@p4.l r2 r2Var) {
        h0.a.a(this.f19879d, null, 1, null);
    }
}
