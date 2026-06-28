package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.e1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a+\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aJ\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000b\u001ar\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\u0001\u0010\u0018\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0014¢\u0006\u0002\b\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010\u001b\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0080Hø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", "count", "d", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "predicate", "e", "(Lkotlinx/coroutines/flow/i;Lv3/p;)Lkotlinx/coroutines/flow/i;", socket.g.f22386a, "Lkotlinx/coroutines/flow/j;", t0.b.f22420d, "Lkotlin/r2;", "f", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", bi.aJ, "R", "Lkotlin/Function3;", "Lkotlin/v0;", "name", "Lkotlin/u;", "transform", "i", "(Lkotlinx/coroutines/flow/i;Lv3/q;)Lkotlinx/coroutines/flow/i;", "b", "(Lkotlinx/coroutines/flow/i;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,141:1\n1#2:142\n106#3:143\n106#3:144\n106#3:145\n106#3:146\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n22#1:143\n33#1:144\n52#1:145\n83#1:146\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class v {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {136}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1\n*L\n1#1,141:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return v.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n*L\n1#1,141:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.p<T, kotlin.coroutines.d<? super Boolean>, Object> f20226a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {130}, m = "emit", n = {"this"}, s = {"L$0"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
        @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,141:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
            this.f20226a = pVar;
        }

        @p4.m
        public Object a(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            kotlin.jvm.internal.i0.e(4);
            new a(dVar);
            kotlin.jvm.internal.i0.e(5);
            if (((Boolean) this.f20226a.invoke(t5, dVar)).booleanValue()) {
                return r2.f19517a;
            }
            throw new kotlinx.coroutines.flow.internal.a(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, @p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.v$b$a r0 = (kotlinx.coroutines.flow.v.b.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$b$a r0 = new kotlinx.coroutines.flow.v$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.v$b r5 = (kotlinx.coroutines.flow.v.b) r5
                kotlin.e1.n(r6)
                goto L46
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.e1.n(r6)
                v3.p<T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f20226a
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L51
                kotlin.r2 r5 = kotlin.r2.f19517a
                return r5
            L51:
                kotlinx.coroutines.flow.internal.a r6 = new kotlinx.coroutines.flow.internal.a
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,112:1\n23#2,5:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class c<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f20227a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20228b;

        public c(kotlinx.coroutines.flow.i iVar, int i5) {
            this.f20227a = iVar;
            this.f20228b = i5;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            Object collect = this.f20227a.collect(new d(new k1.f(), this.f20228b, jVar), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class d<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.f f20229a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20230b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f20231c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ d<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(dVar2);
                this.this$0 = dVar;
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
        d(k1.f fVar, int i5, kotlinx.coroutines.flow.j<? super T> jVar) {
            this.f20229a = fVar;
            this.f20230b = i5;
            this.f20231c = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @p4.l kotlin.coroutines.d<? super kotlin.r2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.v.d.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.v$d$a r0 = (kotlinx.coroutines.flow.v.d.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$d$a r0 = new kotlinx.coroutines.flow.v$d$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e1.n(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.e1.n(r7)
                kotlin.jvm.internal.k1$f r7 = r5.f20229a
                int r2 = r7.element
                int r4 = r5.f20230b
                if (r2 < r4) goto L4a
                kotlinx.coroutines.flow.j<T> r7 = r5.f20231c
                r0.label = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                kotlin.r2 r6 = kotlin.r2.f19517a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.element = r2
                kotlin.r2 r6 = kotlin.r2.f19517a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.d.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,112:1\n34#2,10:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class e<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f20232a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.p f20233b;

        public e(kotlinx.coroutines.flow.i iVar, v3.p pVar) {
            this.f20232a = iVar;
            this.f20233b = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            Object collect = this.f20232a.collect(new f(new k1.a(), jVar, this.f20233b), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class f<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.a f20234a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f20235b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v3.p<T, kotlin.coroutines.d<? super Boolean>, Object> f20236c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {37, 38, 40}, m = "emit", n = {"this", t0.b.f22420d}, s = {"L$0", "L$1"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ f<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(f<? super T> fVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.this$0 = fVar;
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
        f(k1.a aVar, kotlinx.coroutines.flow.j<? super T> jVar, v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
            this.f20234a = aVar;
            this.f20235b = jVar;
            this.f20236c = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.j
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @p4.l kotlin.coroutines.d<? super kotlin.r2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.v.f.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.v$f$a r0 = (kotlinx.coroutines.flow.v.f.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$f$a r0 = new kotlinx.coroutines.flow.v$f$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                kotlin.e1.n(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.L$1
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.v$f r2 = (kotlinx.coroutines.flow.v.f) r2
                kotlin.e1.n(r8)
                goto L6c
            L41:
                kotlin.e1.n(r8)
                goto L59
            L45:
                kotlin.e1.n(r8)
                kotlin.jvm.internal.k1$a r8 = r6.f20234a
                boolean r8 = r8.element
                if (r8 == 0) goto L5c
                kotlinx.coroutines.flow.j<T> r8 = r6.f20235b
                r0.label = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                kotlin.r2 r7 = kotlin.r2.f19517a
                return r7
            L5c:
                v3.p<T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f20236c
                r0.L$0 = r6
                r0.L$1 = r7
                r0.label = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.k1$a r8 = r2.f20234a
                r8.element = r5
                kotlinx.coroutines.flow.j<T> r8 = r2.f20235b
                r2 = 0
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                kotlin.r2 r7 = kotlin.r2.f19517a
                return r7
            L8b:
                kotlin.r2 r7 = kotlin.r2.f19517a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.f.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {73}, m = "emitAbort$FlowKt__LimitKt", n = {"$this$emitAbort"}, s = {"L$0"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class g<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return v.f(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,112:1\n53#2,3:113\n66#2,4:116\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class h<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f20237a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20238b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {115}, m = "collect", n = {"$this$take_u24lambda_u244"}, s = {"L$0"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
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
                return h.this.collect(null, this);
            }
        }

        public h(kotlinx.coroutines.flow.i iVar, int i5) {
            this.f20237a = iVar;
            this.f20238b = i5;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        
            kotlinx.coroutines.flow.internal.q.b(r8, r7);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // kotlinx.coroutines.flow.i
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> r7, @p4.l kotlin.coroutines.d<? super kotlin.r2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.v.h.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.v$h$a r0 = (kotlinx.coroutines.flow.v.h.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$h$a r0 = new kotlinx.coroutines.flow.v$h$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                kotlin.e1.n(r8)     // Catch: kotlinx.coroutines.flow.internal.a -> L51
                goto L55
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                kotlin.e1.n(r8)
                kotlin.jvm.internal.k1$f r8 = new kotlin.jvm.internal.k1$f
                r8.<init>()
                kotlinx.coroutines.flow.i r2 = r6.f20237a     // Catch: kotlinx.coroutines.flow.internal.a -> L51
                kotlinx.coroutines.flow.v$i r4 = new kotlinx.coroutines.flow.v$i     // Catch: kotlinx.coroutines.flow.internal.a -> L51
                int r5 = r6.f20238b     // Catch: kotlinx.coroutines.flow.internal.a -> L51
                r4.<init>(r8, r5, r7)     // Catch: kotlinx.coroutines.flow.internal.a -> L51
                r0.L$0 = r7     // Catch: kotlinx.coroutines.flow.internal.a -> L51
                r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.a -> L51
                java.lang.Object r7 = r2.collect(r4, r0)     // Catch: kotlinx.coroutines.flow.internal.a -> L51
                if (r7 != r1) goto L55
                return r1
            L51:
                r8 = move-exception
                kotlinx.coroutines.flow.internal.q.b(r8, r7)
            L55:
                kotlin.r2 r7 = kotlin.r2.f19517a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.h.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class i<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.f f20239a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20240b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f20241c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {61, 63}, m = "emit", n = {}, s = {})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ i<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(i<? super T> iVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.this$0 = iVar;
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
        i(k1.f fVar, int i5, kotlinx.coroutines.flow.j<? super T> jVar) {
            this.f20239a = fVar;
            this.f20240b = i5;
            this.f20241c = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.j
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @p4.l kotlin.coroutines.d<? super kotlin.r2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.v.i.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.v$i$a r0 = (kotlinx.coroutines.flow.v.i.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$i$a r0 = new kotlinx.coroutines.flow.v$i$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.e1.n(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                kotlin.e1.n(r7)
                goto L51
            L38:
                kotlin.e1.n(r7)
                kotlin.jvm.internal.k1$f r7 = r5.f20239a
                int r2 = r7.element
                int r2 = r2 + r4
                r7.element = r2
                int r7 = r5.f20240b
                if (r2 >= r7) goto L54
                kotlinx.coroutines.flow.j<T> r7 = r5.f20241c
                r0.label = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                kotlin.r2 r6 = kotlin.r2.f19517a
                return r6
            L54:
                kotlinx.coroutines.flow.j<T> r7 = r5.f20241c
                r0.label = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.v.a(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                kotlin.r2 r6 = kotlin.r2.f19517a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.i.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,112:1\n85#2:113\n126#2,15:114\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n85#1:114,15\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class j<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f20242a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.p f20243b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {124}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
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
                return j.this.collect(null, this);
            }
        }

        public j(kotlinx.coroutines.flow.i iVar, v3.p pVar) {
            this.f20242a = iVar;
            this.f20243b = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.i
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> r6, @p4.l kotlin.coroutines.d<? super kotlin.r2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.v.j.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.v$j$a r0 = (kotlinx.coroutines.flow.v.j.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$j$a r0 = new kotlinx.coroutines.flow.v$j$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.L$0
                kotlinx.coroutines.flow.v$k r6 = (kotlinx.coroutines.flow.v.k) r6
                kotlin.e1.n(r7)     // Catch: kotlinx.coroutines.flow.internal.a -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                kotlin.e1.n(r7)
                kotlinx.coroutines.flow.i r7 = r5.f20242a
                kotlinx.coroutines.flow.v$k r2 = new kotlinx.coroutines.flow.v$k
                v3.p r4 = r5.f20243b
                r2.<init>(r4, r6)
                r0.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.a -> L4e
                r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.a -> L4e
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.a -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                kotlinx.coroutines.flow.internal.q.b(r7, r6)
            L53:
                kotlin.r2 r6 = kotlin.r2.f19517a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.j.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,141:1\n86#2,5:142\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class k<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.p f20244a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j f20245b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {142, 143}, m = "emit", n = {"this", t0.b.f22420d, "this"}, s = {"L$0", "L$1", "L$0"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,141:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
            Object L$1;
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
                return k.this.emit(null, this);
            }
        }

        public k(v3.p pVar, kotlinx.coroutines.flow.j jVar) {
            this.f20244a = pVar;
            this.f20245b = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.j
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r8, @p4.l kotlin.coroutines.d<? super kotlin.r2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.v.k.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.v$k$a r0 = (kotlinx.coroutines.flow.v.k.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$k$a r0 = new kotlinx.coroutines.flow.v$k$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.L$0
                kotlinx.coroutines.flow.v$k r8 = (kotlinx.coroutines.flow.v.k) r8
                kotlin.e1.n(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.L$1
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.v$k r2 = (kotlinx.coroutines.flow.v.k) r2
                kotlin.e1.n(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                kotlin.e1.n(r9)
                v3.p r9 = r7.f20244a
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r4
                r2 = 6
                kotlin.jvm.internal.i0.e(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.i0.e(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                kotlinx.coroutines.flow.j r2 = r8.f20245b
                r0.L$0 = r8
                r5 = 0
                r0.L$1 = r5
                r0.label = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                kotlin.r2 r8 = kotlin.r2.f19517a
                return r8
            L81:
                kotlinx.coroutines.flow.internal.a r9 = new kotlinx.coroutines.flow.internal.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.k.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,141:1\n126#2,15:142\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n119#1:142,15\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class l<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.i<T> $this_transformWhile;
        final /* synthetic */ v3.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super Boolean>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @kotlin.i0(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
        @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n1#1,141:1\n120#2:142\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.j<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v3.q f20246a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f20247b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", i = {0}, l = {142}, m = "emit", n = {"this"}, s = {"L$0"})
            @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
            @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,141:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.v$l$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0605a extends kotlin.coroutines.jvm.internal.d {
                Object L$0;
                int label;
                /* synthetic */ Object result;

                public C0605a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(v3.q qVar, kotlinx.coroutines.flow.j jVar) {
                this.f20246a = qVar;
                this.f20247b = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.j
            @p4.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(T r5, @p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.l.a.C0605a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.v$l$a$a r0 = (kotlinx.coroutines.flow.v.l.a.C0605a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.v$l$a$a r0 = new kotlinx.coroutines.flow.v$l$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r5 = r0.L$0
                    kotlinx.coroutines.flow.v$l$a r5 = (kotlinx.coroutines.flow.v.l.a) r5
                    kotlin.e1.n(r6)
                    goto L50
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    kotlin.e1.n(r6)
                    v3.q r6 = r4.f20246a
                    kotlinx.coroutines.flow.j r2 = r4.f20247b
                    r0.L$0 = r4
                    r0.label = r3
                    r3 = 6
                    kotlin.jvm.internal.i0.e(r3)
                    java.lang.Object r6 = r6.invoke(r2, r5, r0)
                    r5 = 7
                    kotlin.jvm.internal.i0.e(r5)
                    if (r6 != r1) goto L4f
                    return r1
                L4f:
                    r5 = r4
                L50:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L5b
                    kotlin.r2 r5 = kotlin.r2.f19517a
                    return r5
                L5b:
                    kotlinx.coroutines.flow.internal.a r6 = new kotlinx.coroutines.flow.internal.a
                    r6.<init>(r5)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.l.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(kotlinx.coroutines.flow.i<? extends T> iVar, v3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> qVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.$this_transformWhile = iVar;
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            l lVar = new l(this.$this_transformWhile, this.$transform, dVar);
            lVar.L$0 = obj;
            return lVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((l) create(jVar, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            a aVar;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    aVar = (a) this.L$0;
                    try {
                        e1.n(obj);
                    } catch (kotlinx.coroutines.flow.internal.a e5) {
                        e = e5;
                        kotlinx.coroutines.flow.internal.q.b(e, aVar);
                        return r2.f19517a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                kotlinx.coroutines.flow.i<T> iVar = this.$this_transformWhile;
                a aVar2 = new a(this.$transform, jVar);
                try {
                    this.L$0 = aVar2;
                    this.label = 1;
                    if (iVar.collect(aVar2, this) == l5) {
                        return l5;
                    }
                } catch (kotlinx.coroutines.flow.internal.a e6) {
                    e = e6;
                    aVar = aVar2;
                    kotlinx.coroutines.flow.internal.q.b(e, aVar);
                    return r2.f19517a;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.v$a r0 = (kotlinx.coroutines.flow.v.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.v$a r0 = new kotlinx.coroutines.flow.v$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.v$b r4 = (kotlinx.coroutines.flow.v.b) r4
            kotlin.e1.n(r6)     // Catch: kotlinx.coroutines.flow.internal.a -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L4c
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.e1.n(r6)
            kotlinx.coroutines.flow.v$b r6 = new kotlinx.coroutines.flow.v$b
            r6.<init>(r5)
            r0.L$0 = r6     // Catch: kotlinx.coroutines.flow.internal.a -> L4a
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.a -> L4a
            java.lang.Object r4 = r4.collect(r6, r0)     // Catch: kotlinx.coroutines.flow.internal.a -> L4a
            if (r4 != r1) goto L4f
            return r1
        L4a:
            r5 = move-exception
            r4 = r6
        L4c:
            kotlinx.coroutines.flow.internal.q.b(r5, r4)
        L4f:
            kotlin.r2 r4 = kotlin.r2.f19517a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.b(kotlinx.coroutines.flow.i, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    private static final <T> Object c(kotlinx.coroutines.flow.i<? extends T> iVar, v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.d<? super r2> dVar) {
        b bVar = new b(pVar);
        try {
            kotlin.jvm.internal.i0.e(0);
            iVar.collect(bVar, dVar);
            kotlin.jvm.internal.i0.e(1);
        } catch (kotlinx.coroutines.flow.internal.a e5) {
            kotlinx.coroutines.flow.internal.q.b(e5, bVar);
        }
        return r2.f19517a;
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> d(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar, int i5) {
        boolean z4;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new c(iVar, i5);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i5).toString());
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> e(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return new e(iVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object f(kotlinx.coroutines.flow.j<? super T> r4, T r5, kotlin.coroutines.d<? super kotlin.r2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.g
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.v$g r0 = (kotlinx.coroutines.flow.v.g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.v$g r0 = new kotlinx.coroutines.flow.v$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
            kotlin.e1.n(r6)
            goto L43
        L35:
            kotlin.e1.n(r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlinx.coroutines.flow.internal.a r5 = new kotlinx.coroutines.flow.internal.a
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.f(kotlinx.coroutines.flow.j, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> g(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar, int i5) {
        boolean z4;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new h(iVar, i5);
        }
        throw new IllegalArgumentException(("Requested element count " + i5 + " should be positive").toString());
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> h(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return new j(iVar, pVar);
    }

    @p4.l
    public static final <T, R> kotlinx.coroutines.flow.i<R> i(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar, @kotlin.b @p4.l v3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> qVar) {
        return kotlinx.coroutines.flow.k.J0(new l(iVar, qVar, null));
    }
}
