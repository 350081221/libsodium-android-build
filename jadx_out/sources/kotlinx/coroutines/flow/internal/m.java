package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.a1;
import kotlin.collections.p0;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.channels.c0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.channels.h0;
import kotlinx.coroutines.internal.z0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

@i0(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0092\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ap\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015*\u001c\b\u0002\u0010\u0017\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00162\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/j;", "", "Lkotlinx/coroutines/flow/i;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "transform", bi.ay, "(Lkotlinx/coroutines/flow/j;[Lkotlinx/coroutines/flow/i;Lv3/a;Lv3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T1", "T2", "flow", "flow2", "b", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/q;)Lkotlinx/coroutines/flow/i;", "Lkotlin/collections/p0;", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,143:1\n106#2:144\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n86#1:144\n*E\n"})
/* loaded from: classes4.dex */
public final class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {54, 76, 79}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    @i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.a<T[]> $arrayFactory;
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] $flows;
        final /* synthetic */ kotlinx.coroutines.flow.j<R> $this_combineInternal;
        final /* synthetic */ v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> $transform;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0588a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ kotlinx.coroutines.flow.i<T>[] $flows;
            final /* synthetic */ int $i;
            final /* synthetic */ AtomicInteger $nonClosed;
            final /* synthetic */ kotlinx.coroutines.channels.l<p0<Object>> $resultChannel;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "T", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: kotlinx.coroutines.flow.internal.m$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0589a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.l<p0<Object>> f20126a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f20127b;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {32, 33}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.internal.m$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0590a extends kotlin.coroutines.jvm.internal.d {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C0589a<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0590a(C0589a<? super T> c0589a, kotlin.coroutines.d<? super C0590a> dVar) {
                        super(dVar);
                        this.this$0 = c0589a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.m
                    public final Object invokeSuspend(@p4.l Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                C0589a(kotlinx.coroutines.channels.l<p0<Object>> lVar, int i5) {
                    this.f20126a = lVar;
                    this.f20127b = i5;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.j
                @p4.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, @p4.l kotlin.coroutines.d<? super kotlin.r2> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.m.a.C0588a.C0589a.C0590a
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.internal.m$a$a$a$a r0 = (kotlinx.coroutines.flow.internal.m.a.C0588a.C0589a.C0590a) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.m$a$a$a$a r0 = new kotlinx.coroutines.flow.internal.m$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.e1.n(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        kotlin.e1.n(r8)
                        goto L4d
                    L38:
                        kotlin.e1.n(r8)
                        kotlinx.coroutines.channels.l<kotlin.collections.p0<java.lang.Object>> r8 = r6.f20126a
                        kotlin.collections.p0 r2 = new kotlin.collections.p0
                        int r5 = r6.f20127b
                        r2.<init>(r5, r7)
                        r0.label = r4
                        java.lang.Object r7 = r8.F(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.label = r3
                        java.lang.Object r7 = kotlinx.coroutines.b4.a(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        kotlin.r2 r7 = kotlin.r2.f19517a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.m.a.C0588a.C0589a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0588a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, int i5, AtomicInteger atomicInteger, kotlinx.coroutines.channels.l<p0<Object>> lVar, kotlin.coroutines.d<? super C0588a> dVar) {
                super(2, dVar);
                this.$flows = iVarArr;
                this.$i = i5;
                this.$nonClosed = atomicInteger;
                this.$resultChannel = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new C0588a(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C0588a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                Object l5;
                AtomicInteger atomicInteger;
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
                        kotlinx.coroutines.flow.i[] iVarArr = this.$flows;
                        int i6 = this.$i;
                        kotlinx.coroutines.flow.i iVar = iVarArr[i6];
                        C0589a c0589a = new C0589a(this.$resultChannel, i6);
                        this.label = 1;
                        if (iVar.collect(c0589a, this) == l5) {
                            return l5;
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        h0.a.a(this.$resultChannel, null, 1, null);
                    }
                    return r2.f19517a;
                } finally {
                    if (this.$nonClosed.decrementAndGet() == 0) {
                        h0.a.a(this.$resultChannel, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, v3.a<T[]> aVar, v3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$flows = iVarArr;
            this.$arrayFactory = aVar;
            this.$transform = qVar;
            this.$this_combineInternal = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x010b A[EDGE_INSN: B:39:0x010b->B:25:0x010b BREAK  A[LOOP:0: B:17:0x00e6->B:38:?], SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v0, types: [kotlinx.coroutines.flow.i<T>[], kotlinx.coroutines.flow.i[]] */
        /* JADX WARN: Type inference failed for: r2v12, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.flow.i<T>[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x012e -> B:8:0x00c3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 357
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n1#1,112:1\n87#2:113\n142#2:114\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f20128a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f20129b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v3.q f20130c;

        public b(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.flow.i iVar2, v3.q qVar) {
            this.f20128a = iVar;
            this.f20129b = iVar2;
            this.f20130c = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            Object g5 = t0.g(new c(jVar, this.f20128a, this.f20129b, this.f20130c, null), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (g5 == l5) {
                return g5;
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {126}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
    @i0(d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.i<T1> $flow;
        final /* synthetic */ kotlinx.coroutines.flow.i<T2> $flow2;
        final /* synthetic */ kotlinx.coroutines.flow.j<R> $this_unsafeFlow;
        final /* synthetic */ v3.q<T1, T2, kotlin.coroutines.d<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T1", "T2", "R", "", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes4.dex */
        public static final class a extends n0 implements v3.l<Throwable, r2> {
            final /* synthetic */ kotlinx.coroutines.b0 $collectJob;
            final /* synthetic */ kotlinx.coroutines.flow.j<R> $this_unsafeFlow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(kotlinx.coroutines.b0 b0Var, kotlinx.coroutines.flow.j<? super R> jVar) {
                super(1);
                this.$collectJob = b0Var;
                this.$this_unsafeFlow = jVar;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
                invoke2(th);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@p4.m Throwable th) {
                if (this.$collectJob.isActive()) {
                    this.$collectJob.cancel(new kotlinx.coroutines.flow.internal.a(this.$this_unsafeFlow));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlin/r2;", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.o implements v3.p<r2, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ Object $cnt;
            final /* synthetic */ kotlinx.coroutines.flow.i<T1> $flow;
            final /* synthetic */ kotlin.coroutines.g $scopeContext;
            final /* synthetic */ g0<Object> $second;
            final /* synthetic */ kotlinx.coroutines.flow.j<R> $this_unsafeFlow;
            final /* synthetic */ v3.q<T1, T2, kotlin.coroutines.d<? super R>, Object> $transform;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* loaded from: classes4.dex */
            public static final class a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlin.coroutines.g f20131a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f20132b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ g0<Object> f20133c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j<R> f20134d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ v3.q<T1, T2, kotlin.coroutines.d<? super R>, Object> f20135e;

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {129, 132, 132}, m = "invokeSuspend", n = {}, s = {})
                @i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlin/r2;", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                @r1({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,143:1\n501#2,5:144\n18#3:149\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n*L\n129#1:144,5\n132#1:149\n*E\n"})
                /* renamed from: kotlinx.coroutines.flow.internal.m$c$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0591a extends kotlin.coroutines.jvm.internal.o implements v3.p<r2, kotlin.coroutines.d<? super r2>, Object> {
                    final /* synthetic */ g0<Object> $second;
                    final /* synthetic */ kotlinx.coroutines.flow.j<R> $this_unsafeFlow;
                    final /* synthetic */ v3.q<T1, T2, kotlin.coroutines.d<? super R>, Object> $transform;
                    final /* synthetic */ T1 $value;
                    Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0591a(g0<? extends Object> g0Var, kotlinx.coroutines.flow.j<? super R> jVar, v3.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, T1 t12, kotlin.coroutines.d<? super C0591a> dVar) {
                        super(2, dVar);
                        this.$second = g0Var;
                        this.$this_unsafeFlow = jVar;
                        this.$transform = qVar;
                        this.$value = t12;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.l
                    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                        return new C0591a(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, dVar);
                    }

                    @Override // v3.p
                    @p4.m
                    public final Object invoke(@p4.l r2 r2Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                        return ((C0591a) create(r2Var, dVar)).invokeSuspend(r2.f19517a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x006e A[RETURN] */
                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.m
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r9) {
                        /*
                            r8 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                            int r1 = r8.label
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L30
                            if (r1 == r5) goto L26
                            if (r1 == r4) goto L1e
                            if (r1 != r3) goto L16
                            kotlin.e1.n(r9)
                            goto L6f
                        L16:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L1e:
                            java.lang.Object r1 = r8.L$0
                            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                            kotlin.e1.n(r9)
                            goto L64
                        L26:
                            kotlin.e1.n(r9)
                            kotlinx.coroutines.channels.p r9 = (kotlinx.coroutines.channels.p) r9
                            java.lang.Object r9 = r9.o()
                            goto L3e
                        L30:
                            kotlin.e1.n(r9)
                            kotlinx.coroutines.channels.g0<java.lang.Object> r9 = r8.$second
                            r8.label = r5
                            java.lang.Object r9 = r9.x(r8)
                            if (r9 != r0) goto L3e
                            return r0
                        L3e:
                            kotlinx.coroutines.flow.j<R> r1 = r8.$this_unsafeFlow
                            boolean r5 = r9 instanceof kotlinx.coroutines.channels.p.c
                            if (r5 == 0) goto L50
                            java.lang.Throwable r9 = kotlinx.coroutines.channels.p.f(r9)
                            if (r9 != 0) goto L4f
                            kotlinx.coroutines.flow.internal.a r9 = new kotlinx.coroutines.flow.internal.a
                            r9.<init>(r1)
                        L4f:
                            throw r9
                        L50:
                            v3.q<T1, T2, kotlin.coroutines.d<? super R>, java.lang.Object> r5 = r8.$transform
                            T1 r6 = r8.$value
                            kotlinx.coroutines.internal.t0 r7 = kotlinx.coroutines.flow.internal.u.f20143a
                            if (r9 != r7) goto L59
                            r9 = r2
                        L59:
                            r8.L$0 = r1
                            r8.label = r4
                            java.lang.Object r9 = r5.invoke(r6, r9, r8)
                            if (r9 != r0) goto L64
                            return r0
                        L64:
                            r8.L$0 = r2
                            r8.label = r3
                            java.lang.Object r9 = r1.emit(r9, r8)
                            if (r9 != r0) goto L6f
                            return r0
                        L6f:
                            kotlin.r2 r9 = kotlin.r2.f19517a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.m.c.b.a.C0591a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {128}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.internal.m$c$b$a$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0592b extends kotlin.coroutines.jvm.internal.d {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ a<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0592b(a<? super T> aVar, kotlin.coroutines.d<? super C0592b> dVar) {
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
                a(kotlin.coroutines.g gVar, Object obj, g0<? extends Object> g0Var, kotlinx.coroutines.flow.j<? super R> jVar, v3.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
                    this.f20131a = gVar;
                    this.f20132b = obj;
                    this.f20133c = g0Var;
                    this.f20134d = jVar;
                    this.f20135e = qVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                @p4.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T1 r13, @p4.l kotlin.coroutines.d<? super kotlin.r2> r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.m.c.b.a.C0592b
                        if (r0 == 0) goto L13
                        r0 = r14
                        kotlinx.coroutines.flow.internal.m$c$b$a$b r0 = (kotlinx.coroutines.flow.internal.m.c.b.a.C0592b) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.m$c$b$a$b r0 = new kotlinx.coroutines.flow.internal.m$c$b$a$b
                        r0.<init>(r12, r14)
                    L18:
                        java.lang.Object r14 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.e1.n(r14)
                        goto L51
                    L29:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L31:
                        kotlin.e1.n(r14)
                        kotlin.coroutines.g r14 = r12.f20131a
                        kotlin.r2 r2 = kotlin.r2.f19517a
                        java.lang.Object r4 = r12.f20132b
                        kotlinx.coroutines.flow.internal.m$c$b$a$a r11 = new kotlinx.coroutines.flow.internal.m$c$b$a$a
                        kotlinx.coroutines.channels.g0<java.lang.Object> r6 = r12.f20133c
                        kotlinx.coroutines.flow.j<R> r7 = r12.f20134d
                        v3.q<T1, T2, kotlin.coroutines.d<? super R>, java.lang.Object> r8 = r12.f20135e
                        r10 = 0
                        r5 = r11
                        r9 = r13
                        r5.<init>(r6, r7, r8, r9, r10)
                        r0.label = r3
                        java.lang.Object r13 = kotlinx.coroutines.flow.internal.f.c(r14, r2, r4, r11, r0)
                        if (r13 != r1) goto L51
                        return r1
                    L51:
                        kotlin.r2 r13 = kotlin.r2.f19517a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.m.c.b.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(kotlinx.coroutines.flow.i<? extends T1> iVar, kotlin.coroutines.g gVar, Object obj, g0<? extends Object> g0Var, kotlinx.coroutines.flow.j<? super R> jVar, v3.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.$flow = iVar;
                this.$scopeContext = gVar;
                this.$cnt = obj;
                this.$second = g0Var;
                this.$this_unsafeFlow = jVar;
                this.$transform = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new b(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l r2 r2Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((b) create(r2Var, dVar)).invokeSuspend(r2.f19517a);
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
                    kotlinx.coroutines.flow.i<T1> iVar = this.$flow;
                    a aVar = new a(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform);
                    this.label = 1;
                    if (iVar.collect(aVar, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/channels/e0;", "", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.m$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0593c extends kotlin.coroutines.jvm.internal.o implements v3.p<e0<? super Object>, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ kotlinx.coroutines.flow.i<T2> $flow2;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: kotlinx.coroutines.flow.internal.m$c$c$a */
            /* loaded from: classes4.dex */
            public static final class a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ e0<Object> f20136a;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {90}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.internal.m$c$c$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0594a extends kotlin.coroutines.jvm.internal.d {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ a<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0594a(a<? super T> aVar, kotlin.coroutines.d<? super C0594a> dVar) {
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

                a(e0<Object> e0Var) {
                    this.f20136a = e0Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                @p4.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T2 r5, @p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.internal.m.c.C0593c.a.C0594a
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.internal.m$c$c$a$a r0 = (kotlinx.coroutines.flow.internal.m.c.C0593c.a.C0594a) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.m$c$c$a$a r0 = new kotlinx.coroutines.flow.internal.m$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.e1.n(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.e1.n(r6)
                        kotlinx.coroutines.channels.e0<java.lang.Object> r6 = r4.f20136a
                        kotlinx.coroutines.channels.h0 r6 = r6.getChannel()
                        if (r5 != 0) goto L3e
                        kotlinx.coroutines.internal.t0 r5 = kotlinx.coroutines.flow.internal.u.f20143a
                    L3e:
                        r0.label = r3
                        java.lang.Object r5 = r6.F(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        kotlin.r2 r5 = kotlin.r2.f19517a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.m.c.C0593c.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0593c(kotlinx.coroutines.flow.i<? extends T2> iVar, kotlin.coroutines.d<? super C0593c> dVar) {
                super(2, dVar);
                this.$flow2 = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                C0593c c0593c = new C0593c(this.$flow2, dVar);
                c0593c.L$0 = obj;
                return c0593c;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ Object invoke(e0<? super Object> e0Var, kotlin.coroutines.d<? super r2> dVar) {
                return invoke2((e0<Object>) e0Var, dVar);
            }

            @p4.m
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@p4.l e0<Object> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C0593c) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
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
                    e0 e0Var = (e0) this.L$0;
                    kotlinx.coroutines.flow.i<T2> iVar = this.$flow2;
                    a aVar = new a(e0Var);
                    this.label = 1;
                    if (iVar.collect(aVar, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(kotlinx.coroutines.flow.j<? super R> jVar, kotlinx.coroutines.flow.i<? extends T2> iVar, kotlinx.coroutines.flow.i<? extends T1> iVar2, v3.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.$this_unsafeFlow = jVar;
            this.$flow2 = iVar;
            this.$flow = iVar2;
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.$this_unsafeFlow, this.$flow2, this.$flow, this.$transform, dVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.channels.g0] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.channels.g0] */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            kotlinx.coroutines.b0 c5;
            g0 g0Var;
            g0 g0Var2;
            kotlin.coroutines.g plus;
            r2 r2Var;
            b bVar;
            l5 = kotlin.coroutines.intrinsics.d.l();
            ?? r12 = this.label;
            try {
                if (r12 != 0) {
                    if (r12 == 1) {
                        g0Var2 = (g0) this.L$0;
                        try {
                            e1.n(obj);
                            r12 = g0Var2;
                        } catch (kotlinx.coroutines.flow.internal.a e5) {
                            e = e5;
                        }
                        g0.a.b(r12, null, 1, null);
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e1.n(obj);
                s0 s0Var = (s0) this.L$0;
                g0 h5 = c0.h(s0Var, null, 0, new C0593c(this.$flow2, null), 3, null);
                c5 = kotlinx.coroutines.r2.c(null, 1, null);
                l0.n(h5, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
                ((h0) h5).I(new a(c5, this.$this_unsafeFlow));
                try {
                    kotlin.coroutines.g coroutineContext = s0Var.getCoroutineContext();
                    Object b5 = z0.b(coroutineContext);
                    plus = s0Var.getCoroutineContext().plus(c5);
                    r2Var = r2.f19517a;
                    bVar = new b(this.$flow, coroutineContext, b5, h5, this.$this_unsafeFlow, this.$transform, null);
                    this.L$0 = h5;
                    this.label = 1;
                    g0Var = h5;
                } catch (kotlinx.coroutines.flow.internal.a e6) {
                    e = e6;
                    g0Var = h5;
                } catch (Throwable th) {
                    th = th;
                    g0Var = h5;
                }
                try {
                } catch (kotlinx.coroutines.flow.internal.a e7) {
                    e = e7;
                    g0Var2 = g0Var;
                    q.b(e, this.$this_unsafeFlow);
                    r12 = g0Var2;
                    g0.a.b(r12, null, 1, null);
                    return r2.f19517a;
                } catch (Throwable th2) {
                    th = th2;
                    r12 = g0Var;
                    g0.a.b(r12, null, 1, null);
                    throw th;
                }
                if (f.d(plus, r2Var, null, bVar, this, 4, null) == l5) {
                    return l5;
                }
                r12 = g0Var;
                g0.a.b(r12, null, 1, null);
                return r2.f19517a;
                q.b(e, this.$this_unsafeFlow);
                r12 = g0Var2;
                g0.a.b(r12, null, 1, null);
                return r2.f19517a;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @a1
    @p4.m
    public static final <R, T> Object a(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l kotlinx.coroutines.flow.i<? extends T>[] iVarArr, @p4.l v3.a<T[]> aVar, @p4.l v3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object a5 = p.a(new a(iVarArr, aVar, qVar, jVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return a5 == l5 ? a5 : r2.f19517a;
    }

    @p4.l
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> b(@p4.l kotlinx.coroutines.flow.i<? extends T1> iVar, @p4.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @p4.l v3.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new b(iVar2, iVar, qVar);
    }
}
