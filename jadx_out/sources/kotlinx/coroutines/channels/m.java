package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;
import kotlin.b1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.m2;
import kotlinx.coroutines.t2;

@kotlin.i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010>\u001a\u00020=\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010?\u001a\u00020\u0007\u0012\u0006\u0010@\u001a\u00020\u0007¢\u0006\u0004\bA\u0010BJ\u0013\u0010\u0001\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J.\u0010\f\u001a\u00020\u00032#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\bH\u0096\u0001J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0003J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096Aø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0003H\u0017J\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0016\u0010\u001e\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0014\u0010-\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b-\u0010)R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100R#\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160.8\u0016X\u0096\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b2\u00100R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000.8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b4\u00100R&\u0010:\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000007068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b;\u0010&\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Lkotlinx/coroutines/channels/m;", "E", "Lkotlinx/coroutines/a;", "Lkotlin/r2;", "Lkotlinx/coroutines/channels/l;", "", "cause", "", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "handler", "I", "Lkotlinx/coroutines/channels/n;", "iterator", "element", "offer", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "D", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p;", "x", "w", "F", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "v", bi.aA, "(Ljava/lang/Object;)Ljava/lang/Object;", "cancel", bi.ay, "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "d0", "d", "Lkotlinx/coroutines/channels/l;", "x1", "()Lkotlinx/coroutines/channels/l;", "_channel", "f", "()Z", "isClosedForReceive", "G", "isClosedForSend", "isEmpty", "Lkotlinx/coroutines/selects/g;", "r", "()Lkotlinx/coroutines/selects/g;", "onReceive", bi.aE, "onReceiveCatching", bi.aL, "onReceiveOrNull", "Lkotlinx/coroutines/selects/i;", "Lkotlinx/coroutines/channels/h0;", "l", "()Lkotlinx/coroutines/selects/i;", "onSend", "getChannel", "channel", "Lkotlin/coroutines/g;", "parentContext", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/g;Lkotlinx/coroutines/channels/l;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,41:1\n705#2,2:42\n705#2,2:44\n705#2,2:46\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n21#1:42,2\n26#1:44,2\n32#1:46,2\n*E\n"})
/* loaded from: classes4.dex */
public class m<E> extends kotlinx.coroutines.a<r2> implements l<E> {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final l<E> f19938d;

    public m(@p4.l kotlin.coroutines.g gVar, @p4.l l<E> lVar, boolean z4, boolean z5) {
        super(gVar, z4, z5);
        this.f19938d = lVar;
    }

    @Override // kotlinx.coroutines.channels.g0
    @p4.m
    public Object D(@p4.l kotlin.coroutines.d<? super E> dVar) {
        return this.f19938d.D(dVar);
    }

    public boolean E(@p4.m Throwable th) {
        return this.f19938d.E(th);
    }

    @p4.m
    public Object F(E e5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return this.f19938d.F(e5, dVar);
    }

    @Override // kotlinx.coroutines.channels.h0
    public boolean G() {
        return this.f19938d.G();
    }

    @Override // kotlinx.coroutines.channels.h0
    public void I(@p4.l v3.l<? super Throwable, r2> lVar) {
        this.f19938d.I(lVar);
    }

    @Override // kotlinx.coroutines.t2, kotlinx.coroutines.l2, kotlinx.coroutines.channels.d
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean a(Throwable th) {
        d0(new m2(g0(), null, this));
        return true;
    }

    @Override // kotlinx.coroutines.t2, kotlinx.coroutines.l2, kotlinx.coroutines.channels.d
    public final void cancel(@p4.m CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new m2(g0(), null, this);
        }
        d0(cancellationException);
    }

    @Override // kotlinx.coroutines.t2
    public void d0(@p4.l Throwable th) {
        CancellationException l12 = t2.l1(this, th, null, 1, null);
        this.f19938d.cancel(l12);
        Z(l12);
    }

    @Override // kotlinx.coroutines.channels.g0
    public boolean f() {
        return this.f19938d.f();
    }

    @p4.l
    public final l<E> getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.g0
    public boolean isEmpty() {
        return this.f19938d.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.g0
    @p4.l
    public n<E> iterator() {
        return this.f19938d.iterator();
    }

    @p4.l
    public kotlinx.coroutines.selects.i<E, h0<E>> l() {
        return this.f19938d.l();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e5) {
        return this.f19938d.offer(e5);
    }

    @p4.l
    public Object p(E e5) {
        return this.f19938d.p(e5);
    }

    @Override // kotlinx.coroutines.channels.g0
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
    @p4.m
    public E poll() {
        return this.f19938d.poll();
    }

    @Override // kotlinx.coroutines.channels.g0
    @p4.l
    public kotlinx.coroutines.selects.g<E> r() {
        return this.f19938d.r();
    }

    @Override // kotlinx.coroutines.channels.g0
    @p4.l
    public kotlinx.coroutines.selects.g<p<E>> s() {
        return this.f19938d.s();
    }

    @Override // kotlinx.coroutines.channels.g0
    @p4.l
    public kotlinx.coroutines.selects.g<E> t() {
        return this.f19938d.t();
    }

    @Override // kotlinx.coroutines.channels.g0
    @p4.l
    public Object v() {
        return this.f19938d.v();
    }

    @Override // kotlinx.coroutines.channels.g0
    @kotlin.internal.h
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    @p4.m
    public Object w(@p4.l kotlin.coroutines.d<? super E> dVar) {
        return this.f19938d.w(dVar);
    }

    @Override // kotlinx.coroutines.channels.g0
    @p4.m
    public Object x(@p4.l kotlin.coroutines.d<? super p<? extends E>> dVar) {
        Object x4 = this.f19938d.x(dVar);
        kotlin.coroutines.intrinsics.d.l();
        return x4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.l
    public final l<E> x1() {
        return this.f19938d;
    }

    @Override // kotlinx.coroutines.t2, kotlinx.coroutines.l2, kotlinx.coroutines.channels.g0
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        d0(new m2(g0(), null, this));
    }
}
