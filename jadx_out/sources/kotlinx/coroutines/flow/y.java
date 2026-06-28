package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001au\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022F\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a{\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u00012H\b\u0004\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a#\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u001aG\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013\u001aI\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001a\u001a#\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013\u001a%\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"S", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function3;", "Lkotlin/v0;", "name", "accumulator", t0.b.f22420d, "Lkotlin/coroutines/d;", "", "operation", "i", "(Lkotlinx/coroutines/flow/i;Lv3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "R", "initial", "acc", "e", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lv3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "k", bi.ay, "Lkotlin/Function2;", "", "predicate", "b", "(Lkotlinx/coroutines/flow/i;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "d", socket.g.f22386a, bi.aJ, "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,172:1\n126#2,15:173\n126#2,15:188\n126#2,15:203\n126#2,15:218\n126#2,15:233\n*S KotlinDebug\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n72#1:173,15\n92#1:188,15\n106#1:203,15\n124#1:218,15\n137#1:233,15\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n93#2,2:142\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.h f20264a;

        public a(k1.h hVar) {
            this.f20264a = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @p4.m
        public Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            this.f20264a.element = t5;
            throw new kotlinx.coroutines.flow.internal.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n107#2,5:142\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.p f20265a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h f20266b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {142}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
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
                return b.this.emit(null, this);
            }
        }

        public b(v3.p pVar, k1.h hVar) {
            this.f20265a = pVar;
            this.f20266b = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.y$b$a r0 = (kotlinx.coroutines.flow.y.b.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$b$a r0 = new kotlinx.coroutines.flow.y$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.L$1
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.flow.y$b r0 = (kotlinx.coroutines.flow.y.b) r0
                kotlin.e1.n(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.e1.n(r6)
                v3.p r6 = r4.f20265a
                r0.L$0 = r4
                r0.L$1 = r5
                r0.label = r3
                r2 = 6
                kotlin.jvm.internal.i0.e(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.i0.e(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                kotlin.jvm.internal.k1$h r6 = r0.f20266b
                r6.element = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                kotlin.r2 r5 = kotlin.r2.f19517a
                return r5
            L64:
                kotlinx.coroutines.flow.internal.a r5 = new kotlinx.coroutines.flow.internal.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.u0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {183}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class d<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.v0(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n125#2,2:142\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class e<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.h f20267a;

        public e(k1.h hVar) {
            this.f20267a = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @p4.m
        public Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            this.f20267a.element = t5;
            throw new kotlinx.coroutines.flow.internal.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n138#2,5:142\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class f<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.p f20268a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h f20269b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {142}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
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
                return f.this.emit(null, this);
            }
        }

        public f(v3.p pVar, k1.h hVar) {
            this.f20268a = pVar;
            this.f20269b = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.f.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.y$f$a r0 = (kotlinx.coroutines.flow.y.f.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$f$a r0 = new kotlinx.coroutines.flow.y$f$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.L$1
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.flow.y$f r0 = (kotlinx.coroutines.flow.y.f) r0
                kotlin.e1.n(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.e1.n(r6)
                v3.p r6 = r4.f20268a
                r0.L$0 = r4
                r0.L$1 = r5
                r0.label = r3
                r2 = 6
                kotlin.jvm.internal.i0.e(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.i0.e(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                kotlin.jvm.internal.k1$h r6 = r0.f20269b
                r6.element = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                kotlin.r2 r5 = kotlin.r2.f19517a
                return r5
            L64:
                kotlinx.coroutines.flow.internal.a r5 = new kotlinx.coroutines.flow.internal.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.f.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class g<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
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
            return kotlinx.coroutines.flow.k.w0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class h<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.x0(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {44}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
    @r1({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$fold$1\n*L\n1#1,172:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class i<T, R> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return y.e(null, null, null, this);
        }
    }

    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$fold$2\n*L\n1#1,172:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class j<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.h<R> f20270a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.q<R, T, kotlin.coroutines.d<? super R>, Object> f20271b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", f = "Reduce.kt", i = {}, l = {45}, m = "emit", n = {}, s = {})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
        @r1({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$fold$2$emit$1\n*L\n1#1,172:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ j<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(j<? super T> jVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.this$0 = jVar;
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
        public j(k1.h<R> hVar, v3.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
            this.f20270a = hVar;
            this.f20271b = qVar;
        }

        @p4.m
        public final Object a(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            kotlin.jvm.internal.i0.e(4);
            new a(this, dVar);
            kotlin.jvm.internal.i0.e(5);
            k1.h<R> hVar = this.f20270a;
            hVar.element = (T) this.f20271b.invoke(hVar.element, t5, dVar);
            return r2.f19517a;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @p4.l kotlin.coroutines.d<? super kotlin.r2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.y.j.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.y$j$a r0 = (kotlinx.coroutines.flow.y.j.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$j$a r0 = new kotlinx.coroutines.flow.y$j$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.L$0
                kotlin.jvm.internal.k1$h r7 = (kotlin.jvm.internal.k1.h) r7
                kotlin.e1.n(r8)
                goto L4c
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                kotlin.e1.n(r8)
                kotlin.jvm.internal.k1$h<R> r8 = r6.f20270a
                v3.q<R, T, kotlin.coroutines.d<? super R>, java.lang.Object> r2 = r6.f20271b
                T r4 = r8.element
                r0.L$0 = r8
                r0.label = r3
                java.lang.Object r7 = r2.invoke(r4, r7, r0)
                if (r7 != r1) goto L49
                return r1
            L49:
                r5 = r8
                r8 = r7
                r7 = r5
            L4c:
                r7.element = r8
                kotlin.r2 r7 = kotlin.r2.f19517a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.j.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {155}, m = "last", n = {"result"}, s = {"L$0"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class k<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.T0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class l<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.h<Object> f20272a;

        l(k1.h<Object> hVar) {
            this.f20272a = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @p4.m
        public final Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            this.f20272a.element = t5;
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {167}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class m<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.U0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class n<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.h<T> f20273a;

        n(k1.h<T> hVar) {
            this.f20273a = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @p4.m
        public final Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            this.f20273a.element = t5;
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {22}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class o<S, T extends S> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.t1(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "T", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class p<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.h<Object> f20274a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.q<S, T, kotlin.coroutines.d<? super S>, Object> f20275b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ p<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super T> pVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.this$0 = pVar;
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
        p(k1.h<Object> hVar, v3.q<? super S, ? super T, ? super kotlin.coroutines.d<? super S>, ? extends Object> qVar) {
            this.f20274a = hVar;
            this.f20275b = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @p4.l kotlin.coroutines.d<? super kotlin.r2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.y.p.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.y$p$a r0 = (kotlinx.coroutines.flow.y.p.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.y$p$a r0 = new kotlinx.coroutines.flow.y$p$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.L$0
                kotlin.jvm.internal.k1$h r7 = (kotlin.jvm.internal.k1.h) r7
                kotlin.e1.n(r8)
                goto L50
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                kotlin.e1.n(r8)
                kotlin.jvm.internal.k1$h<java.lang.Object> r8 = r6.f20274a
                T r2 = r8.element
                kotlinx.coroutines.internal.t0 r4 = kotlinx.coroutines.flow.internal.u.f20143a
                if (r2 == r4) goto L53
                v3.q<S, T, kotlin.coroutines.d<? super S>, java.lang.Object> r4 = r6.f20275b
                r0.L$0 = r8
                r0.label = r3
                java.lang.Object r7 = r4.invoke(r2, r7, r0)
                if (r7 != r1) goto L4d
                return r1
            L4d:
                r5 = r8
                r8 = r7
                r7 = r5
            L50:
                r5 = r8
                r8 = r7
                r7 = r5
            L53:
                r8.element = r7
                kotlin.r2 r7 = kotlin.r2.f19517a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.p.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {57}, m = "single", n = {"result"}, s = {"L$0"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class q<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.I1(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$single$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class r<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.h<Object> f20276a;

        r(k1.h<Object> hVar) {
            this.f20276a = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @p4.m
        public final Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            boolean z4;
            k1.h<Object> hVar = this.f20276a;
            if (hVar.element == kotlinx.coroutines.flow.internal.u.f20143a) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                hVar.element = t5;
                return r2.f19517a;
            }
            throw new IllegalArgumentException("Flow has more than one element".toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n74#2,7:142\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class s<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.h f20277a;

        public s(k1.h hVar) {
            this.f20277a = hVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @p4.m
        public Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            boolean z4;
            k1.h hVar = this.f20277a;
            T t6 = hVar.element;
            T t7 = (T) kotlinx.coroutines.flow.internal.u.f20143a;
            if (t6 == t7) {
                hVar.element = t5;
                z4 = true;
            } else {
                hVar.element = t7;
                z4 = false;
            }
            if (z4) {
                return r2.f19517a;
            }
            throw new kotlinx.coroutines.flow.internal.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class t<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        t(kotlin.coroutines.d<? super t> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.J1(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, @p4.l kotlin.coroutines.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.c
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$c r0 = (kotlinx.coroutines.flow.y.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$c r0 = new kotlinx.coroutines.flow.y$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.flow.y$a r4 = (kotlinx.coroutines.flow.y.a) r4
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.k1$h r0 = (kotlin.jvm.internal.k1.h) r0
            kotlin.e1.n(r5)     // Catch: kotlinx.coroutines.flow.internal.a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.e1.n(r5)
            kotlin.jvm.internal.k1$h r5 = new kotlin.jvm.internal.k1$h
            r5.<init>()
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.flow.internal.u.f20143a
            r5.element = r2
            kotlinx.coroutines.flow.y$a r2 = new kotlinx.coroutines.flow.y$a
            r2.<init>(r5)
            r0.L$0 = r5     // Catch: kotlinx.coroutines.flow.internal.a -> L5b
            r0.L$1 = r2     // Catch: kotlinx.coroutines.flow.internal.a -> L5b
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            kotlinx.coroutines.flow.internal.q.b(r5, r4)
        L62:
            T r4 = r0.element
            kotlinx.coroutines.internal.t0 r5 = kotlinx.coroutines.flow.internal.u.f20143a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.a(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @p4.l kotlin.coroutines.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.d
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.y$d r0 = (kotlinx.coroutines.flow.y.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$d r0 = new kotlinx.coroutines.flow.y$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.L$2
            kotlinx.coroutines.flow.y$b r4 = (kotlinx.coroutines.flow.y.b) r4
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.internal.k1$h r5 = (kotlin.jvm.internal.k1.h) r5
            java.lang.Object r0 = r0.L$0
            v3.p r0 = (v3.p) r0
            kotlin.e1.n(r6)     // Catch: kotlinx.coroutines.flow.internal.a -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            kotlin.e1.n(r6)
            kotlin.jvm.internal.k1$h r6 = new kotlin.jvm.internal.k1$h
            r6.<init>()
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.flow.internal.u.f20143a
            r6.element = r2
            kotlinx.coroutines.flow.y$b r2 = new kotlinx.coroutines.flow.y$b
            r2.<init>(r5, r6)
            r0.L$0 = r5     // Catch: kotlinx.coroutines.flow.internal.a -> L62
            r0.L$1 = r6     // Catch: kotlinx.coroutines.flow.internal.a -> L62
            r0.L$2 = r2     // Catch: kotlinx.coroutines.flow.internal.a -> L62
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.a -> L62
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.a -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            kotlinx.coroutines.flow.internal.q.b(r6, r4)
        L6a:
            T r4 = r5.element
            kotlinx.coroutines.internal.t0 r5 = kotlinx.coroutines.flow.internal.u.f20143a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.b(kotlinx.coroutines.flow.i, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, @p4.l kotlin.coroutines.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.g
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$g r0 = (kotlinx.coroutines.flow.y.g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$g r0 = new kotlinx.coroutines.flow.y$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.flow.y$e r4 = (kotlinx.coroutines.flow.y.e) r4
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.k1$h r0 = (kotlin.jvm.internal.k1.h) r0
            kotlin.e1.n(r5)     // Catch: kotlinx.coroutines.flow.internal.a -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.e1.n(r5)
            kotlin.jvm.internal.k1$h r5 = new kotlin.jvm.internal.k1$h
            r5.<init>()
            kotlinx.coroutines.flow.y$e r2 = new kotlinx.coroutines.flow.y$e
            r2.<init>(r5)
            r0.L$0 = r5     // Catch: kotlinx.coroutines.flow.internal.a -> L57
            r0.L$1 = r2     // Catch: kotlinx.coroutines.flow.internal.a -> L57
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.a -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            kotlinx.coroutines.flow.internal.q.b(r5, r4)
        L5e:
            T r4 = r0.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.c(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @p4.l kotlin.coroutines.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.h
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.y$h r0 = (kotlinx.coroutines.flow.y.h) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$h r0 = new kotlinx.coroutines.flow.y$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.flow.y$f r4 = (kotlinx.coroutines.flow.y.f) r4
            java.lang.Object r5 = r0.L$0
            kotlin.jvm.internal.k1$h r5 = (kotlin.jvm.internal.k1.h) r5
            kotlin.e1.n(r6)     // Catch: kotlinx.coroutines.flow.internal.a -> L31
            goto L5e
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.e1.n(r6)
            kotlin.jvm.internal.k1$h r6 = new kotlin.jvm.internal.k1$h
            r6.<init>()
            kotlinx.coroutines.flow.y$f r2 = new kotlinx.coroutines.flow.y$f
            r2.<init>(r5, r6)
            r0.L$0 = r6     // Catch: kotlinx.coroutines.flow.internal.a -> L57
            r0.L$1 = r2     // Catch: kotlinx.coroutines.flow.internal.a -> L57
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.a -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L5e
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            kotlinx.coroutines.flow.internal.q.b(r6, r4)
        L5e:
            T r4 = r5.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.d(kotlinx.coroutines.flow.i, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, R> java.lang.Object e(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, R r5, @p4.l v3.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends java.lang.Object> r6, @p4.l kotlin.coroutines.d<? super R> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.y.i
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.y$i r0 = (kotlinx.coroutines.flow.y.i) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$i r0 = new kotlinx.coroutines.flow.y$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.e1.n(r7)
            goto L50
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e1.n(r7)
            kotlin.jvm.internal.k1$h r7 = new kotlin.jvm.internal.k1$h
            r7.<init>()
            r7.element = r5
            kotlinx.coroutines.flow.y$j r5 = new kotlinx.coroutines.flow.y$j
            r5.<init>(r7, r6)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r4 = r4.collect(r5, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r7
        L50:
            T r4 = r4.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.e(kotlinx.coroutines.flow.i, java.lang.Object, v3.q, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> Object f(kotlinx.coroutines.flow.i<? extends T> iVar, R r5, v3.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlin.coroutines.d<? super R> dVar) {
        k1.h hVar = new k1.h();
        hVar.element = r5;
        j jVar = new j(hVar, qVar);
        kotlin.jvm.internal.i0.e(0);
        iVar.collect(jVar, dVar);
        kotlin.jvm.internal.i0.e(1);
        return hVar.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object g(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, @p4.l kotlin.coroutines.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.k
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$k r0 = (kotlinx.coroutines.flow.y.k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$k r0 = new kotlinx.coroutines.flow.y$k
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.e1.n(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e1.n(r5)
            kotlin.jvm.internal.k1$h r5 = new kotlin.jvm.internal.k1$h
            r5.<init>()
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.flow.internal.u.f20143a
            r5.element = r2
            kotlinx.coroutines.flow.y$l r2 = new kotlinx.coroutines.flow.y$l
            r2.<init>(r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.element
            kotlinx.coroutines.internal.t0 r5 = kotlinx.coroutines.flow.internal.u.f20143a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.g(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object h(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, @p4.l kotlin.coroutines.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.m
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$m r0 = (kotlinx.coroutines.flow.y.m) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$m r0 = new kotlinx.coroutines.flow.y$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.e1.n(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e1.n(r5)
            kotlin.jvm.internal.k1$h r5 = new kotlin.jvm.internal.k1$h
            r5.<init>()
            kotlinx.coroutines.flow.y$n r2 = new kotlinx.coroutines.flow.y$n
            r2.<init>(r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            T r4 = r4.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.h(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.internal.t0, T] */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S, T extends S> java.lang.Object i(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, @p4.l v3.q<? super S, ? super T, ? super kotlin.coroutines.d<? super S>, ? extends java.lang.Object> r5, @p4.l kotlin.coroutines.d<? super S> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.y.o
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.y$o r0 = (kotlinx.coroutines.flow.y.o) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$o r0 = new kotlinx.coroutines.flow.y$o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.e1.n(r6)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e1.n(r6)
            kotlin.jvm.internal.k1$h r6 = new kotlin.jvm.internal.k1$h
            r6.<init>()
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.flow.internal.u.f20143a
            r6.element = r2
            kotlinx.coroutines.flow.y$p r2 = new kotlinx.coroutines.flow.y$p
            r2.<init>(r6, r5)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r6
        L52:
            T r4 = r4.element
            kotlinx.coroutines.internal.t0 r5 = kotlinx.coroutines.flow.internal.u.f20143a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Empty flow can't be reduced"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.i(kotlinx.coroutines.flow.i, v3.q, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object j(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, @p4.l kotlin.coroutines.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.q
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$q r0 = (kotlinx.coroutines.flow.y.q) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$q r0 = new kotlinx.coroutines.flow.y$q
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
            kotlin.e1.n(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e1.n(r5)
            kotlin.jvm.internal.k1$h r5 = new kotlin.jvm.internal.k1$h
            r5.<init>()
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.flow.internal.u.f20143a
            r5.element = r2
            kotlinx.coroutines.flow.y$r r2 = new kotlinx.coroutines.flow.y$r
            r2.<init>(r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.element
            kotlinx.coroutines.internal.t0 r5 = kotlinx.coroutines.flow.internal.u.f20143a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.j(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object k(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, @p4.l kotlin.coroutines.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.y.t
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.y$t r0 = (kotlinx.coroutines.flow.y.t) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y$t r0 = new kotlinx.coroutines.flow.y$t
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.flow.y$s r4 = (kotlinx.coroutines.flow.y.s) r4
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.k1$h r0 = (kotlin.jvm.internal.k1.h) r0
            kotlin.e1.n(r5)     // Catch: kotlinx.coroutines.flow.internal.a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.e1.n(r5)
            kotlin.jvm.internal.k1$h r5 = new kotlin.jvm.internal.k1$h
            r5.<init>()
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.flow.internal.u.f20143a
            r5.element = r2
            kotlinx.coroutines.flow.y$s r2 = new kotlinx.coroutines.flow.y$s
            r2.<init>(r5)
            r0.L$0 = r5     // Catch: kotlinx.coroutines.flow.internal.a -> L5b
            r0.L$1 = r2     // Catch: kotlinx.coroutines.flow.internal.a -> L5b
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            kotlinx.coroutines.flow.internal.q.b(r5, r4)
        L62:
            T r4 = r0.element
            kotlinx.coroutines.internal.t0 r5 = kotlinx.coroutines.flow.internal.u.f20143a
            if (r4 != r5) goto L69
            r4 = 0
        L69:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.k(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }
}
