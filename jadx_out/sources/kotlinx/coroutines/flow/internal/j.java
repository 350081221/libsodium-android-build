package kotlinx.coroutines.flow.internal;

import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bz\u0012B\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010RS\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u00178\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/flow/internal/j;", "T", "R", "Lkotlinx/coroutines/flow/internal/h;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/e;", "i", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "r", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/v0;", "name", t0.b.f22420d, "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "e", "Lv3/q;", "transform", "Lkotlinx/coroutines/flow/i;", "flow", "<init>", "(Lv3/q;Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* loaded from: classes4.dex */
public final class j<T, R> extends h<T, R> {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final v3.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super r2>, Object> f20120e;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.j<R> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ j<T, R> this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0586a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k1.h<l2> f20121a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s0 f20122b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j<T, R> f20123c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<R> f20124d;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: kotlinx.coroutines.flow.internal.j$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0587a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ kotlinx.coroutines.flow.j<R> $collector;
                final /* synthetic */ T $value;
                int label;
                final /* synthetic */ j<T, R> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0587a(j<T, R> jVar, kotlinx.coroutines.flow.j<? super R> jVar2, T t5, kotlin.coroutines.d<? super C0587a> dVar) {
                    super(2, dVar);
                    this.this$0 = jVar;
                    this.$collector = jVar2;
                    this.$value = t5;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0587a(this.this$0, this.$collector, this.$value, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0587a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                        v3.q qVar = ((j) this.this$0).f20120e;
                        kotlinx.coroutines.flow.j<R> jVar = this.$collector;
                        T t5 = this.$value;
                        this.label = 1;
                        if (qVar.invoke(jVar, t5, this) == l5) {
                            return l5;
                        }
                    }
                    return r2.f19517a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {30}, m = "emit", n = {"this", t0.b.f22420d}, s = {"L$0", "L$1"})
            /* renamed from: kotlinx.coroutines.flow.internal.j$a$a$b */
            /* loaded from: classes4.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.d {
                Object L$0;
                Object L$1;
                Object L$2;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C0586a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C0586a<? super T> c0586a, kotlin.coroutines.d<? super b> dVar) {
                    super(dVar);
                    this.this$0 = c0586a;
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
            C0586a(k1.h<l2> hVar, s0 s0Var, j<T, R> jVar, kotlinx.coroutines.flow.j<? super R> jVar2) {
                this.f20121a = hVar;
                this.f20122b = s0Var;
                this.f20123c = jVar;
                this.f20124d = jVar2;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.j
            @p4.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, @p4.l kotlin.coroutines.d<? super kotlin.r2> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.j.a.C0586a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    kotlinx.coroutines.flow.internal.j$a$a$b r0 = (kotlinx.coroutines.flow.internal.j.a.C0586a.b) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.j$a$a$b r0 = new kotlinx.coroutines.flow.internal.j$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.L$2
                    kotlinx.coroutines.l2 r8 = (kotlinx.coroutines.l2) r8
                    java.lang.Object r8 = r0.L$1
                    java.lang.Object r0 = r0.L$0
                    kotlinx.coroutines.flow.internal.j$a$a r0 = (kotlinx.coroutines.flow.internal.j.a.C0586a) r0
                    kotlin.e1.n(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.e1.n(r9)
                    kotlin.jvm.internal.k1$h<kotlinx.coroutines.l2> r9 = r7.f20121a
                    T r9 = r9.element
                    kotlinx.coroutines.l2 r9 = (kotlinx.coroutines.l2) r9
                    if (r9 == 0) goto L5d
                    kotlinx.coroutines.flow.internal.l r2 = new kotlinx.coroutines.flow.internal.l
                    r2.<init>()
                    r9.cancel(r2)
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.L$2 = r9
                    r0.label = r3
                    java.lang.Object r9 = r9.b0(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.k1$h<kotlinx.coroutines.l2> r9 = r0.f20121a
                    kotlinx.coroutines.s0 r1 = r0.f20122b
                    r2 = 0
                    kotlinx.coroutines.u0 r3 = kotlinx.coroutines.u0.UNDISPATCHED
                    kotlinx.coroutines.flow.internal.j$a$a$a r4 = new kotlinx.coroutines.flow.internal.j$a$a$a
                    kotlinx.coroutines.flow.internal.j<T, R> r5 = r0.f20123c
                    kotlinx.coroutines.flow.j<R> r0 = r0.f20124d
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    kotlinx.coroutines.l2 r8 = kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
                    r9.element = r8
                    kotlin.r2 r8 = kotlin.r2.f19517a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.j.a.C0586a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(j<T, R> jVar, kotlinx.coroutines.flow.j<? super R> jVar2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.this$0 = jVar;
            this.$collector = jVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.this$0, this.$collector, dVar);
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
                k1.h hVar = new k1.h();
                j<T, R> jVar = this.this$0;
                kotlinx.coroutines.flow.i<S> iVar = jVar.f20119d;
                C0586a c0586a = new C0586a(hVar, s0Var, jVar, this.$collector);
                this.label = 1;
                if (iVar.collect(c0586a, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    public /* synthetic */ j(v3.q qVar, kotlinx.coroutines.flow.i iVar, kotlin.coroutines.g gVar, int i5, kotlinx.coroutines.channels.i iVar2, int i6, kotlin.jvm.internal.w wVar) {
        this(qVar, iVar, (i6 & 4) != 0 ? kotlin.coroutines.i.INSTANCE : gVar, (i6 & 8) != 0 ? -2 : i5, (i6 & 16) != 0 ? kotlinx.coroutines.channels.i.SUSPEND : iVar2);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @p4.l
    protected e<R> i(@p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar) {
        return new j(this.f20120e, this.f20119d, gVar, i5, iVar);
    }

    @Override // kotlinx.coroutines.flow.internal.h
    @p4.m
    protected Object r(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object g5 = t0.g(new a(this, jVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return g5 == l5 ? g5 : r2.f19517a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@p4.l v3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, @p4.l kotlinx.coroutines.flow.i<? extends T> iVar, @p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar2) {
        super(iVar, gVar, i5, iVar2);
        this.f20120e = qVar;
    }
}
