package kotlinx.coroutines.channels;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.internal.q0;

@kotlin.i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B7\u0012\u0006\u0010/\u001a\u00020.\u0012\u000e\u00100\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"\u0012\u0006\u00101\u001a\u00020\u0003¢\u0006\u0004\b2\u00103J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\rJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u000bJ+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0016\u0010!\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0015R\u001c\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\"8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050,8\u0002X\u0082\u0004¨\u00064"}, d2 = {"Lkotlinx/coroutines/channels/r;", "E", "Lkotlinx/coroutines/internal/q0;", "", "index", "", t0.b.f22420d, "Lkotlin/r2;", "B", "element", "D", "(ILjava/lang/Object;)V", "x", "(I)Ljava/lang/Object;", "A", bi.aK, "(I)V", "y", "C", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "", bi.aL, "(ILjava/lang/Object;Ljava/lang/Object;)Z", "update", "v", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "cause", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "q", "receiver", bi.aG, "Lkotlinx/coroutines/channels/j;", "e", "Lkotlinx/coroutines/channels/j;", "_channel", "w", "()Lkotlinx/coroutines/channels/j;", "channel", bi.aA, "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "data", "", "id", "prev", "pointers", "<init>", "(JLkotlinx/coroutines/channels/r;Lkotlinx/coroutines/channels/j;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3055:1\n1#2:3056\n*E\n"})
/* loaded from: classes4.dex */
public final class r<E> extends q0<r<E>> {

    /* renamed from: e, reason: collision with root package name */
    @p4.m
    private final j<E> f19943e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private final AtomicReferenceArray f19944f;

    public r(long j5, @p4.m r<E> rVar, @p4.m j<E> jVar, int i5) {
        super(j5, rVar, i5);
        this.f19943e = jVar;
        this.f19944f = new AtomicReferenceArray(k.f19899b * 2);
    }

    private final void B(int i5, Object obj) {
        this.f19944f.lazySet(i5 * 2, obj);
    }

    public final E A(int i5) {
        E x4 = x(i5);
        u(i5);
        return x4;
    }

    public final void C(int i5, @p4.m Object obj) {
        this.f19944f.set((i5 * 2) + 1, obj);
    }

    public final void D(int i5, E e5) {
        B(i5, e5);
    }

    @Override // kotlinx.coroutines.internal.q0
    public int p() {
        return k.f19899b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:
    
        u(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0068, code lost:
    
        r4 = w().f19891b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:
    
        kotlinx.coroutines.internal.k0.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(int r4, @p4.m java.lang.Throwable r5, @p4.l kotlin.coroutines.g r6) {
        /*
            r3 = this;
            int r5 = kotlinx.coroutines.channels.k.f19899b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.x(r4)
        Le:
            java.lang.Object r1 = r3.y(r4)
            boolean r2 = r1 instanceof kotlinx.coroutines.z3
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.k0
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.channels.k.j()
            if (r1 == r2) goto L63
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.channels.k.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.channels.k.p()
            if (r1 == r2) goto Le
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.channels.k.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            kotlinx.coroutines.internal.t0 r4 = kotlinx.coroutines.channels.k.f()
            if (r1 == r4) goto L62
            kotlinx.coroutines.internal.t0 r4 = kotlinx.coroutines.channels.k.f19903f
            if (r1 != r4) goto L40
            goto L62
        L40:
            kotlinx.coroutines.internal.t0 r4 = kotlinx.coroutines.channels.k.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.u(r4)
            if (r0 == 0) goto L73
            kotlinx.coroutines.channels.j r4 = r3.w()
            v3.l<E, kotlin.r2> r4 = r4.f19891b
            if (r4 == 0) goto L73
            kotlinx.coroutines.internal.k0.b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.channels.k.j()
            goto L7f
        L7b:
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.channels.k.i()
        L7f:
            boolean r1 = r3.t(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.u(r4)
            r1 = r0 ^ 1
            r3.z(r4, r1)
            if (r0 == 0) goto L9a
            kotlinx.coroutines.channels.j r4 = r3.w()
            v3.l<E, kotlin.r2> r4 = r4.f19891b
            if (r4 == 0) goto L9a
            kotlinx.coroutines.internal.k0.b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.r.q(int, java.lang.Throwable, kotlin.coroutines.g):void");
    }

    public final boolean t(int i5, @p4.m Object obj, @p4.m Object obj2) {
        return q.a(this.f19944f, (i5 * 2) + 1, obj, obj2);
    }

    public final void u(int i5) {
        B(i5, null);
    }

    @p4.m
    public final Object v(int i5, @p4.m Object obj) {
        return this.f19944f.getAndSet((i5 * 2) + 1, obj);
    }

    @p4.l
    public final j<E> w() {
        j<E> jVar = this.f19943e;
        l0.m(jVar);
        return jVar;
    }

    public final E x(int i5) {
        return (E) this.f19944f.get(i5 * 2);
    }

    @p4.m
    public final Object y(int i5) {
        return this.f19944f.get((i5 * 2) + 1);
    }

    public final void z(int i5, boolean z4) {
        if (z4) {
            w().F1((this.f20383c * k.f19899b) + i5);
        }
        r();
    }
}
