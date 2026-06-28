package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;
import kotlin.b1;
import kotlin.r2;
import kotlinx.coroutines.c3;

@kotlin.i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0002\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b*\u0010+B\t\b\u0016¢\u0006\u0004\b*\u0010,B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00028\u0000¢\u0006\u0004\b*\u0010-J\u0015\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0097\u0001J\u001b\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0096\u0001J\u0013\u0010\u0001\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J.\u0010\u000f\u001a\u00020\t2#\u0010\u000e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\t0\u000bH\u0096\u0001J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0001J\u001b\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR&\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!0 8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010)\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b(\u0010&\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Lkotlinx/coroutines/channels/y;", "E", "Lkotlinx/coroutines/channels/d;", "", "cause", "", bi.ay, "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlin/r2;", "cancel", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "handler", "I", "element", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/g0;", "n", "F", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p;", bi.aA, "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/e;", "Lkotlinx/coroutines/channels/e;", "broadcast", "G", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/i;", "Lkotlinx/coroutines/channels/h0;", "l", "()Lkotlinx/coroutines/selects/i;", "onSend", "b", "()Ljava/lang/Object;", t0.b.f22420d, "c", "valueOrNull", "<init>", "(Lkotlinx/coroutines/channels/e;)V", "()V", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.k(level = kotlin.m.WARNING, message = "ConflatedBroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@c3
/* loaded from: classes4.dex */
public final class y<E> implements d<E> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final e<E> f19946a;

    private y(e<E> eVar) {
        this.f19946a = eVar;
    }

    @Override // kotlinx.coroutines.channels.h0
    public boolean E(@p4.m Throwable th) {
        return this.f19946a.E(th);
    }

    @Override // kotlinx.coroutines.channels.h0
    @p4.m
    public Object F(E e5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return this.f19946a.F(e5, dVar);
    }

    @Override // kotlinx.coroutines.channels.h0
    public boolean G() {
        return this.f19946a.G();
    }

    @Override // kotlinx.coroutines.channels.h0
    public void I(@p4.l v3.l<? super Throwable, r2> lVar) {
        this.f19946a.I(lVar);
    }

    @Override // kotlinx.coroutines.channels.d
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility only")
    public /* synthetic */ boolean a(Throwable th) {
        return this.f19946a.a(th);
    }

    public final E b() {
        return this.f19946a.K1();
    }

    @p4.m
    public final E c() {
        return this.f19946a.M1();
    }

    @Override // kotlinx.coroutines.channels.d
    public void cancel(@p4.m CancellationException cancellationException) {
        this.f19946a.cancel(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.h0
    @p4.l
    public kotlinx.coroutines.selects.i<E, h0<E>> l() {
        return this.f19946a.l();
    }

    @Override // kotlinx.coroutines.channels.d
    @p4.l
    public g0<E> n() {
        return this.f19946a.n();
    }

    @Override // kotlinx.coroutines.channels.h0
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e5) {
        return this.f19946a.offer(e5);
    }

    @Override // kotlinx.coroutines.channels.h0
    @p4.l
    public Object p(E e5) {
        return this.f19946a.p(e5);
    }

    public y() {
        this(new e(-1));
    }

    public y(E e5) {
        this();
        p(e5);
    }
}
