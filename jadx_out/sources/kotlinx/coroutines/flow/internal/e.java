package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.channels.c0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.x0;

@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¤@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J!\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R9\u0010&\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lkotlinx/coroutines/flow/internal/e;", "T", "Lkotlinx/coroutines/flow/internal/r;", "Lkotlinx/coroutines/flow/i;", "j", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", bi.ay, "i", "Lkotlinx/coroutines/channels/e0;", "scope", "Lkotlin/r2;", bi.aJ, "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/channels/g0;", "m", "Lkotlinx/coroutines/flow/j;", "collector", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "e", "toString", "Lkotlin/coroutines/g;", "b", "I", "c", "Lkotlinx/coroutines/channels/i;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "k", "()Lv3/p;", "collectToFun", "l", "()I", "produceCapacity", "<init>", "(Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@g2
@r1({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
/* loaded from: classes4.dex */
public abstract class e<T> implements r<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    @u3.e
    public final kotlin.coroutines.g f20110a;

    /* renamed from: b, reason: collision with root package name */
    @u3.e
    public final int f20111b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    @u3.e
    public final kotlinx.coroutines.channels.i f20112c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.j<T> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.j<? super T> jVar, e<T> eVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$collector = jVar;
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.$collector, this.this$0, dVar);
            aVar.L$0 = obj;
            return aVar;
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
                s0 s0Var = (s0) this.L$0;
                kotlinx.coroutines.flow.j<T> jVar = this.$collector;
                g0<T> m5 = this.this$0.m(s0Var);
                this.label = 1;
                if (kotlinx.coroutines.flow.k.l0(jVar, m5, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/channels/e0;", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.o implements v3.p<e0<? super T>, kotlin.coroutines.d<? super r2>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e<T> eVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.this$0, dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l e0<? super T> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((b) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
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
                e0<? super T> e0Var = (e0) this.L$0;
                e<T> eVar = this.this$0;
                this.label = 1;
                if (eVar.h(e0Var, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    public e(@p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        this.f20110a = gVar;
        this.f20111b = i5;
        this.f20112c = iVar;
    }

    static /* synthetic */ <T> Object g(e<T> eVar, kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object g5 = t0.g(new a(jVar, eVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return g5 == l5 ? g5 : r2.f19517a;
    }

    @Override // kotlinx.coroutines.flow.internal.r
    @p4.l
    public kotlinx.coroutines.flow.i<T> a(@p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        kotlin.coroutines.g plus = gVar.plus(this.f20110a);
        if (iVar == kotlinx.coroutines.channels.i.SUSPEND) {
            int i6 = this.f20111b;
            if (i6 != -3) {
                if (i5 != -3) {
                    if (i6 != -2) {
                        if (i5 != -2 && (i6 = i6 + i5) < 0) {
                            i5 = Integer.MAX_VALUE;
                        }
                    }
                }
                i5 = i6;
            }
            iVar = this.f20112c;
        }
        if (l0.g(plus, this.f20110a) && i5 == this.f20111b && iVar == this.f20112c) {
            return this;
        }
        return i(plus, i5, iVar);
    }

    @Override // kotlinx.coroutines.flow.i
    @p4.m
    public Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return g(this, jVar, dVar);
    }

    @p4.m
    protected String e() {
        return null;
    }

    @p4.m
    protected abstract Object h(@p4.l e0<? super T> e0Var, @p4.l kotlin.coroutines.d<? super r2> dVar);

    @p4.l
    protected abstract e<T> i(@p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar);

    @p4.m
    public kotlinx.coroutines.flow.i<T> j() {
        return null;
    }

    @p4.l
    public final v3.p<e0<? super T>, kotlin.coroutines.d<? super r2>, Object> k() {
        return new b(this, null);
    }

    public final int l() {
        int i5 = this.f20111b;
        if (i5 == -3) {
            return -2;
        }
        return i5;
    }

    @p4.l
    public g0<T> m(@p4.l s0 s0Var) {
        return c0.g(s0Var, this.f20110a, l(), this.f20112c, u0.ATOMIC, null, k(), 16, null);
    }

    @p4.l
    public String toString() {
        String j32;
        ArrayList arrayList = new ArrayList(4);
        String e5 = e();
        if (e5 != null) {
            arrayList.add(e5);
        }
        if (this.f20110a != kotlin.coroutines.i.INSTANCE) {
            arrayList.add("context=" + this.f20110a);
        }
        if (this.f20111b != -3) {
            arrayList.add("capacity=" + this.f20111b);
        }
        if (this.f20112c != kotlinx.coroutines.channels.i.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f20112c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(x0.a(this));
        sb.append('[');
        j32 = kotlin.collections.e0.j3(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb.append(j32);
        sb.append(']');
        return sb.toString();
    }
}
