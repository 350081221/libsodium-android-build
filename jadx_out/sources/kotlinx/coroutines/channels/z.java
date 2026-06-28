package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.internal.g1;
import kotlinx.coroutines.z3;

@kotlin.i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\"\b\u0002\u0010#\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010!j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\"¢\u0006\u0004\b$\u0010%J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\tJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00028\u0000H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0090@ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u001e\u0010\u0014\u001a\u00020\u00072\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013H\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lkotlinx/coroutines/channels/z;", "E", "Lkotlinx/coroutines/channels/j;", "element", "", "isSendOp", "Lkotlinx/coroutines/channels/p;", "Lkotlin/r2;", "K1", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "I1", "J1", "(Ljava/lang/Object;)Ljava/lang/Object;", "F", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "l1", bi.aA, "Lkotlinx/coroutines/selects/m;", "select", "", "f1", "s1", "()Z", "", "m", "I", "capacity", "Lkotlinx/coroutines/channels/i;", "n", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "y0", "isConflatedDropOldest", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/i;Lv3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 5 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n*L\n1#1,119:1\n548#2,5:120\n514#2,6:125\n514#2,6:212\n548#2,5:218\n244#3:131\n269#3,10:132\n280#3,68:143\n3038#4:142\n269#5:211\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n41#1:120,5\n53#1:125,6\n106#1:212,6\n109#1:218,5\n80#1:131\n80#1:132,10\n80#1:143,68\n80#1:142\n80#1:211\n*E\n"})
/* loaded from: classes4.dex */
public class z<E> extends j<E> {

    /* renamed from: m, reason: collision with root package name */
    private final int f19947m;

    /* renamed from: n, reason: collision with root package name */
    @p4.l
    private final i f19948n;

    public /* synthetic */ z(int i5, i iVar, v3.l lVar, int i6, kotlin.jvm.internal.w wVar) {
        this(i5, iVar, (i6 & 4) != 0 ? null : lVar);
    }

    static /* synthetic */ <E> Object G1(z<E> zVar, E e5, kotlin.coroutines.d<? super r2> dVar) {
        g1 d5;
        Object K1 = zVar.K1(e5, true);
        if (K1 instanceof p.a) {
            p.f(K1);
            v3.l<E, r2> lVar = zVar.f19891b;
            if (lVar != null && (d5 = kotlinx.coroutines.internal.k0.d(lVar, e5, null, 2, null)) != null) {
                kotlin.p.a(d5, zVar.m0());
                throw d5;
            }
            throw zVar.m0();
        }
        return r2.f19517a;
    }

    static /* synthetic */ <E> Object H1(z<E> zVar, E e5, kotlin.coroutines.d<? super Boolean> dVar) {
        Object K1 = zVar.K1(e5, true);
        if (!(K1 instanceof p.c)) {
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
        return kotlin.coroutines.jvm.internal.b.a(false);
    }

    private final Object I1(E e5, boolean z4) {
        v3.l<E, r2> lVar;
        g1 d5;
        Object p5 = super.p(e5);
        if (!p.m(p5) && !p.k(p5)) {
            if (z4 && (lVar = this.f19891b) != null && (d5 = kotlinx.coroutines.internal.k0.d(lVar, e5, null, 2, null)) != null) {
                throw d5;
            }
            return p.f19939b.c(r2.f19517a);
        }
        return p5;
    }

    private final Object J1(E e5) {
        r rVar;
        z3 z3Var;
        Object obj = k.f19903f;
        r rVar2 = (r) j.f19885h.get(this);
        while (true) {
            long andIncrement = j.f19881d.getAndIncrement(this);
            long j5 = andIncrement & 1152921504606846975L;
            boolean x02 = x0(andIncrement);
            int i5 = k.f19899b;
            long j6 = j5 / i5;
            int i6 = (int) (j5 % i5);
            if (rVar2.f20383c != j6) {
                r b02 = b0(j6, rVar2);
                if (b02 == null) {
                    if (x02) {
                        return p.f19939b.a(m0());
                    }
                } else {
                    rVar = b02;
                }
            } else {
                rVar = rVar2;
            }
            int B1 = B1(rVar, i6, e5, j5, obj, x02);
            if (B1 != 0) {
                if (B1 != 1) {
                    if (B1 != 2) {
                        if (B1 != 3) {
                            if (B1 != 4) {
                                if (B1 == 5) {
                                    rVar.b();
                                }
                                rVar2 = rVar;
                            } else {
                                if (j5 < l0()) {
                                    rVar.b();
                                }
                                return p.f19939b.a(m0());
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    } else {
                        if (x02) {
                            rVar.r();
                            return p.f19939b.a(m0());
                        }
                        if (obj instanceof z3) {
                            z3Var = (z3) obj;
                        } else {
                            z3Var = null;
                        }
                        if (z3Var != null) {
                            S0(z3Var, rVar, i6);
                        }
                        X((rVar.f20383c * i5) + i6);
                        return p.f19939b.c(r2.f19517a);
                    }
                } else {
                    return p.f19939b.c(r2.f19517a);
                }
            } else {
                rVar.b();
                return p.f19939b.c(r2.f19517a);
            }
        }
    }

    private final Object K1(E e5, boolean z4) {
        if (this.f19948n == i.DROP_LATEST) {
            return I1(e5, z4);
        }
        return J1(e5);
    }

    @Override // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.h0
    @p4.m
    public Object F(E e5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return G1(this, e5, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.j
    protected void f1(@p4.l kotlinx.coroutines.selects.m<?> mVar, @p4.m Object obj) {
        Object p5 = p(obj);
        if (!(p5 instanceof p.c)) {
            mVar.e(r2.f19517a);
        } else {
            if (p5 instanceof p.a) {
                p.f(p5);
                mVar.e(k.z());
                return;
            }
            throw new IllegalStateException("unreachable".toString());
        }
    }

    @Override // kotlinx.coroutines.channels.j
    @p4.m
    public Object l1(E e5, @p4.l kotlin.coroutines.d<? super Boolean> dVar) {
        return H1(this, e5, dVar);
    }

    @Override // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.h0
    @p4.l
    public Object p(E e5) {
        return K1(e5, false);
    }

    @Override // kotlinx.coroutines.channels.j
    public boolean s1() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.j
    protected boolean y0() {
        return this.f19948n == i.DROP_OLDEST;
    }

    public z(int i5, @p4.l i iVar, @p4.m v3.l<? super E, r2> lVar) {
        super(i5, lVar);
        this.f19947m = i5;
        this.f19948n = iVar;
        if (!(iVar != i.SUSPEND)) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + l1.d(j.class).t() + " instead").toString());
        }
        if (i5 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i5 + " was specified").toString());
    }
}
