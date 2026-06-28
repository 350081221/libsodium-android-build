package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.bi;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.channels.c0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0014R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/internal/g;", "T", "Lkotlinx/coroutines/flow/internal/e;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "i", "Lkotlinx/coroutines/s0;", "scope", "Lkotlinx/coroutines/channels/g0;", "m", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", bi.aJ, "(Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "e", "Lkotlinx/coroutines/flow/i;", "d", "Lkotlinx/coroutines/flow/i;", "flow", "I", "concurrency", "<init>", "(Lkotlinx/coroutines/flow/i;ILkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class g<T> extends e<T> {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final kotlinx.coroutines.flow.i<kotlinx.coroutines.flow.i<T>> f20113d;

    /* renamed from: e, reason: collision with root package name */
    private final int f20114e;

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", bi.ax, "Lkotlin/r2;", bi.ay, "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class a<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l2 f20115a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.d f20116b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0<T> f20117c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ y<T> f20118d;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0585a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ y<T> $collector;
            final /* synthetic */ kotlinx.coroutines.flow.i<T> $inner;
            final /* synthetic */ kotlinx.coroutines.sync.d $semaphore;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0585a(kotlinx.coroutines.flow.i<? extends T> iVar, y<T> yVar, kotlinx.coroutines.sync.d dVar, kotlin.coroutines.d<? super C0585a> dVar2) {
                super(2, dVar2);
                this.$inner = iVar;
                this.$collector = yVar;
                this.$semaphore = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new C0585a(this.$inner, this.$collector, this.$semaphore, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C0585a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                Object l5;
                l5 = kotlin.coroutines.intrinsics.d.l();
                int i5 = this.label;
                try {
                    if (i5 != 0) {
                        if (i5 == 1) {
                            e1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        e1.n(obj);
                        kotlinx.coroutines.flow.i<T> iVar = this.$inner;
                        y<T> yVar = this.$collector;
                        this.label = 1;
                        if (iVar.collect(yVar, this) == l5) {
                            return l5;
                        }
                    }
                    this.$semaphore.release();
                    return r2.f19517a;
                } catch (Throwable th) {
                    this.$semaphore.release();
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {66}, m = "emit", n = {"this", bi.ax}, s = {"L$0", "L$1"})
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(a<? super T> aVar, kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
                this.this$0 = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(l2 l2Var, kotlinx.coroutines.sync.d dVar, e0<? super T> e0Var, y<T> yVar) {
            this.f20115a = l2Var;
            this.f20116b = dVar;
            this.f20117c = e0Var;
            this.f20118d = yVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        @p4.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@p4.l kotlinx.coroutines.flow.i<? extends T> r8, @p4.l kotlin.coroutines.d<? super kotlin.r2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.g.a.b
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.g$a$b r0 = (kotlinx.coroutines.flow.internal.g.a.b) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.g$a$b r0 = new kotlinx.coroutines.flow.internal.g$a$b
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.L$1
                kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.flow.internal.g$a r0 = (kotlinx.coroutines.flow.internal.g.a) r0
                kotlin.e1.n(r9)
                goto L53
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                kotlin.e1.n(r9)
                kotlinx.coroutines.l2 r9 = r7.f20115a
                if (r9 == 0) goto L43
                kotlinx.coroutines.p2.A(r9)
            L43:
                kotlinx.coroutines.sync.d r9 = r7.f20116b
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r3
                java.lang.Object r9 = r9.e(r0)
                if (r9 != r1) goto L52
                return r1
            L52:
                r0 = r7
            L53:
                kotlinx.coroutines.channels.e0<T> r1 = r0.f20117c
                r2 = 0
                r3 = 0
                kotlinx.coroutines.flow.internal.g$a$a r4 = new kotlinx.coroutines.flow.internal.g$a$a
                kotlinx.coroutines.flow.internal.y<T> r9 = r0.f20118d
                kotlinx.coroutines.sync.d r0 = r0.f20116b
                r5 = 0
                r4.<init>(r8, r9, r0, r5)
                r5 = 3
                r6 = 0
                kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
                kotlin.r2 r8 = kotlin.r2.f19517a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.g.a.emit(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
        }
    }

    public /* synthetic */ g(kotlinx.coroutines.flow.i iVar, int i5, kotlin.coroutines.g gVar, int i6, kotlinx.coroutines.channels.i iVar2, int i7, kotlin.jvm.internal.w wVar) {
        this(iVar, i5, (i7 & 4) != 0 ? kotlin.coroutines.i.INSTANCE : gVar, (i7 & 8) != 0 ? -2 : i6, (i7 & 16) != 0 ? kotlinx.coroutines.channels.i.SUSPEND : iVar2);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    protected String e() {
        return "concurrency=" + this.f20114e;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.m
    protected Object h(@p4.l e0<? super T> e0Var, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        kotlinx.coroutines.sync.d b5 = kotlinx.coroutines.sync.f.b(this.f20114e, 0, 2, null);
        y yVar = new y(e0Var);
        Object collect = this.f20113d.collect(new a((l2) dVar.getContext().get(l2.U), b5, e0Var, yVar), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (collect == l5) {
            return collect;
        }
        return r2.f19517a;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    protected e<T> i(@p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        return new g(this.f20113d, this.f20114e, gVar, i5, iVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    public g0<T> m(@p4.l s0 s0Var) {
        return c0.e(s0Var, this.f20110a, this.f20111b, k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@p4.l kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> iVar, int i5, @p4.l kotlin.coroutines.g gVar, int i6, @p4.l kotlinx.coroutines.channels.i iVar2) {
        super(gVar, i6, iVar2);
        this.f20113d = iVar;
        this.f20114e = i5;
    }
}
