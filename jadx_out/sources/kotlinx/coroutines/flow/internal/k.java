package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.bi;
import java.util.Iterator;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.channels.c0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.s0;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0012\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/flow/internal/k;", "T", "Lkotlinx/coroutines/flow/internal/e;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "i", "Lkotlinx/coroutines/s0;", "scope", "Lkotlinx/coroutines/channels/g0;", "m", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", bi.aJ, "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/flow/i;", "d", "Ljava/lang/Iterable;", "flows", "<init>", "(Ljava/lang/Iterable;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1855#2,2:101\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n*L\n95#1:101,2\n*E\n"})
/* loaded from: classes4.dex */
public final class k<T> extends e<T> {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final Iterable<kotlinx.coroutines.flow.i<T>> f20125d;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ y<T> $collector;
        final /* synthetic */ kotlinx.coroutines.flow.i<T> $flow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.i<? extends T> iVar, y<T> yVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$flow = iVar;
            this.$collector = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new a(this.$flow, this.$collector, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                kotlinx.coroutines.flow.i<T> iVar = this.$flow;
                y<T> yVar = this.$collector;
                this.label = 1;
                if (iVar.collect(yVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    public /* synthetic */ k(Iterable iterable, kotlin.coroutines.g gVar, int i5, kotlinx.coroutines.channels.i iVar, int i6, kotlin.jvm.internal.w wVar) {
        this(iterable, (i6 & 2) != 0 ? kotlin.coroutines.i.INSTANCE : gVar, (i6 & 4) != 0 ? -2 : i5, (i6 & 8) != 0 ? kotlinx.coroutines.channels.i.SUSPEND : iVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.m
    protected Object h(@p4.l e0<? super T> e0Var, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        y yVar = new y(e0Var);
        Iterator<kotlinx.coroutines.flow.i<T>> it = this.f20125d.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.k.f(e0Var, null, null, new a(it.next(), yVar, null), 3, null);
        }
        return r2.f19517a;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    protected e<T> i(@p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        return new k(this.f20125d, gVar, i5, iVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    public g0<T> m(@p4.l s0 s0Var) {
        return c0.e(s0Var, this.f20110a, this.f20111b, k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@p4.l Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, @p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        super(gVar, i5, iVar);
        this.f20125d = iterable;
    }
}
