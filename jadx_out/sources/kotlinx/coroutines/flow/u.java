package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.e1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.l2;

@kotlin.i0(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aj\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ae\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f23\b\u0002\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u007f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012W\u0010\u0013\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001f\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\"\u001a\u00020\u0012*\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "", "Lkotlin/v0;", "name", "cause", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "action", bi.ay, "(Lkotlinx/coroutines/flow/i;Lv3/q;)Lkotlinx/coroutines/flow/i;", "", "retries", "Lkotlin/Function2;", "", "predicate", "e", "(Lkotlinx/coroutines/flow/i;JLv3/p;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function4;", "attempt", socket.g.f22386a, "(Lkotlinx/coroutines/flow/i;Lv3/r;)Lkotlinx/coroutines/flow/i;", "collector", "b", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "coroutineContext", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/g;)Z", "other", "d", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,224:1\n106#2:225\n106#2:227\n1#3:226\n162#4:228\n*S KotlinDebug\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n58#1:225\n132#1:227\n221#1:228\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class u {

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,112:1\n59#2,3:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<T> implements i<T> {

        /* renamed from: a */
        final /* synthetic */ i f20218a;

        /* renamed from: b */
        final /* synthetic */ v3.q f20219b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {113, 114}, m = "collect", n = {"this", "$this$catch_u24lambda_u240"}, s = {"L$0", "L$1"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.u$a$a */
        /* loaded from: classes4.dex */
        public static final class C0604a extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C0604a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(i iVar, v3.q qVar) {
            this.f20218a = iVar;
            this.f20219b = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.i
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> r6, @p4.l kotlin.coroutines.d<? super kotlin.r2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.u.a.C0604a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.u$a$a r0 = (kotlinx.coroutines.flow.u.a.C0604a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.u$a$a r0 = new kotlinx.coroutines.flow.u$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.e1.n(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.L$1
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.u$a r2 = (kotlinx.coroutines.flow.u.a) r2
                kotlin.e1.n(r7)
                goto L53
            L40:
                kotlin.e1.n(r7)
                kotlinx.coroutines.flow.i r7 = r5.f20218a
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r7 = kotlinx.coroutines.flow.k.v(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                v3.q r2 = r2.f20219b
                r4 = 0
                r0.L$0 = r4
                r0.L$1 = r4
                r0.label = r3
                r3 = 6
                kotlin.jvm.internal.i0.e(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.i0.e(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                kotlin.r2 r6 = kotlin.r2.f19517a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.a.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {156}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.v(null, null, this);
        }
    }

    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class c<T> implements j {

        /* renamed from: a */
        final /* synthetic */ j<T> f20220a;

        /* renamed from: b */
        final /* synthetic */ k1.h<Throwable> f20221b;

        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {158}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ c<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.this$0 = cVar;
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
        c(j<? super T> jVar, k1.h<Throwable> hVar) {
            this.f20220a = jVar;
            this.f20221b = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, @p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.u.c.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.u$c$a r0 = (kotlinx.coroutines.flow.u.c.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.u$c$a r0 = new kotlinx.coroutines.flow.u$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.u$c r5 = (kotlinx.coroutines.flow.u.c) r5
                kotlin.e1.n(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.e1.n(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f20220a     // Catch: java.lang.Throwable -> L4a
                r0.L$0 = r4     // Catch: java.lang.Throwable -> L4a
                r0.label = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                kotlin.r2 r5 = kotlin.r2.f19517a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.k1$h<java.lang.Throwable> r5 = r5.f20221b
                r5.element = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.c.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.o implements v3.p<Throwable, kotlin.coroutines.d<? super Boolean>, Object> {
        int label;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new d(dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l Throwable th, @p4.m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((d) create(th, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "", "cause", "", "attempt", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class e<T> extends kotlin.coroutines.jvm.internal.o implements v3.r<j<? super T>, Throwable, Long, kotlin.coroutines.d<? super Boolean>, Object> {
        final /* synthetic */ v3.p<Throwable, kotlin.coroutines.d<? super Boolean>, Object> $predicate;
        final /* synthetic */ long $retries;
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(long j5, v3.p<? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.d<? super e> dVar) {
            super(4, dVar);
            this.$retries = j5;
            this.$predicate = pVar;
        }

        @Override // v3.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th, Long l5, kotlin.coroutines.d<? super Boolean> dVar) {
            return invoke((j) obj, th, l5.longValue(), dVar);
        }

        @p4.m
        public final Object invoke(@p4.l j<? super T> jVar, @p4.l Throwable th, long j5, @p4.m kotlin.coroutines.d<? super Boolean> dVar) {
            e eVar = new e(this.$retries, this.$predicate, dVar);
            eVar.L$0 = th;
            eVar.J$0 = j5;
            return eVar.invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
        
            if (((java.lang.Boolean) r8).booleanValue() != false) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.e1.n(r8)
                goto L31
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                kotlin.e1.n(r8)
                java.lang.Object r8 = r7.L$0
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                long r3 = r7.J$0
                long r5 = r7.$retries
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L3a
                v3.p<java.lang.Throwable, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r1 = r7.$predicate
                r7.label = r2
                java.lang.Object r8 = r1.invoke(r8, r7)
                if (r8 != r0) goto L31
                return r0
            L31:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L3a
                goto L3b
            L3a:
                r2 = 0
            L3b:
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r2)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,112:1\n133#2,15:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class f<T> implements i<T> {

        /* renamed from: a */
        final /* synthetic */ i f20222a;

        /* renamed from: b */
        final /* synthetic */ v3.r f20223b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {117, 119}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u242", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u242", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int I$0;
            long J$0;
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(i iVar, v3.r rVar) {
            this.f20222a = iVar;
            this.f20223b = rVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0076 -> B:14:0x00a8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0097 -> B:11:0x009a). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> r12, @p4.l kotlin.coroutines.d<? super kotlin.r2> r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof kotlinx.coroutines.flow.u.f.a
                if (r0 == 0) goto L13
                r0 = r13
                kotlinx.coroutines.flow.u$f$a r0 = (kotlinx.coroutines.flow.u.f.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.u$f$a r0 = new kotlinx.coroutines.flow.u$f$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L52
                if (r2 == r4) goto L42
                if (r2 != r3) goto L3a
                long r5 = r0.J$0
                java.lang.Object r12 = r0.L$2
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.flow.u$f r7 = (kotlinx.coroutines.flow.u.f) r7
                kotlin.e1.n(r13)
                goto L9a
            L3a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L42:
                int r12 = r0.I$0
                long r5 = r0.J$0
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.flow.u$f r7 = (kotlinx.coroutines.flow.u.f) r7
                kotlin.e1.n(r13)
                goto L74
            L52:
                kotlin.e1.n(r13)
                r5 = 0
                r13 = r11
            L58:
                kotlinx.coroutines.flow.i r2 = r13.f20222a
                r0.L$0 = r13
                r0.L$1 = r12
                r7 = 0
                r0.L$2 = r7
                r0.J$0 = r5
                r7 = 0
                r0.I$0 = r7
                r0.label = r4
                java.lang.Object r2 = kotlinx.coroutines.flow.k.v(r2, r12, r0)
                if (r2 != r1) goto L6f
                return r1
            L6f:
                r10 = r2
                r2 = r12
                r12 = r7
                r7 = r13
                r13 = r10
            L74:
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                if (r13 == 0) goto La8
                v3.r r12 = r7.f20223b
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.b.g(r5)
                r0.L$0 = r7
                r0.L$1 = r2
                r0.L$2 = r13
                r0.J$0 = r5
                r0.label = r3
                r9 = 6
                kotlin.jvm.internal.i0.e(r9)
                java.lang.Object r12 = r12.invoke(r2, r13, r8, r0)
                r8 = 7
                kotlin.jvm.internal.i0.e(r8)
                if (r12 != r1) goto L97
                return r1
            L97:
                r10 = r13
                r13 = r12
                r12 = r10
            L9a:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto La7
                r12 = 1
                long r5 = r5 + r12
                r12 = r4
                goto La8
            La7:
                throw r12
            La8:
                r13 = r7
                if (r12 != 0) goto Lae
                kotlin.r2 r12 = kotlin.r2.f19517a
                return r12
            Lae:
                r12 = r2
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.f.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @p4.l
    public static final <T> i<T> a(@p4.l i<? extends T> iVar, @p4.l v3.q<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        return new a(iVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, @p4.l kotlinx.coroutines.flow.j<? super T> r5, @p4.l kotlin.coroutines.d<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.u.b
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.u$b r0 = (kotlinx.coroutines.flow.u.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.u$b r0 = new kotlinx.coroutines.flow.u$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.e1.n(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.e1.n(r6)
            kotlin.jvm.internal.k1$h r6 = new kotlin.jvm.internal.k1$h
            r6.<init>()
            kotlinx.coroutines.flow.u$c r2 = new kotlinx.coroutines.flow.u$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L51
            r0.label = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.element
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            kotlin.coroutines.g r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            kotlin.o.a(r4, r5)
            throw r4
        L72:
            kotlin.o.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.u.b(kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    private static final boolean c(Throwable th, kotlin.coroutines.g gVar) {
        l2 l2Var = (l2) gVar.get(l2.U);
        if (l2Var != null && l2Var.isCancelled()) {
            return d(th, l2Var.y());
        }
        return false;
    }

    private static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && kotlin.jvm.internal.l0.g(th2, th);
    }

    @p4.l
    public static final <T> i<T> e(@p4.l i<? extends T> iVar, long j5, @p4.l v3.p<? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        boolean z4;
        if (j5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return k.y1(iVar, new e(j5, pVar, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j5).toString());
    }

    public static /* synthetic */ i f(i iVar, long j5, v3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = Long.MAX_VALUE;
        }
        if ((i5 & 2) != 0) {
            pVar = new d(null);
        }
        return k.w1(iVar, j5, pVar);
    }

    @p4.l
    public static final <T> i<T> g(@p4.l i<? extends T> iVar, @p4.l v3.r<? super j<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> rVar) {
        return new f(iVar, rVar);
    }
}
