package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.k1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", bi.ay, "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "predicate", "b", "(Lkotlinx/coroutines/flow/i;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes4.dex */
public final /* synthetic */ class q {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {17}, m = "count", n = {"i"}, s = {"L$0"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
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
            return k.Y(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.f f20193a;

        b(k1.f fVar) {
            this.f20193a = fVar;
        }

        @Override // kotlinx.coroutines.flow.j
        @p4.m
        public final Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            this.f20193a.element++;
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {29}, m = "count", n = {"i"}, s = {"L$0"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
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
            return k.Z(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class d<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.p<T, kotlin.coroutines.d<? super Boolean>, Object> f20194a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.f f20195b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {30}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
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
        d(v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, k1.f fVar) {
            this.f20194a = pVar;
            this.f20195b = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.q.d.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.q$d$a r0 = (kotlinx.coroutines.flow.q.d.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.q$d$a r0 = new kotlinx.coroutines.flow.q$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.q$d r5 = (kotlinx.coroutines.flow.q.d) r5
                kotlin.e1.n(r6)
                goto L46
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.e1.n(r6)
                v3.p<T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f20194a
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
                if (r6 == 0) goto L55
                kotlin.jvm.internal.k1$f r5 = r5.f20195b
                int r6 = r5.element
                int r6 = r6 + r3
                r5.element = r6
            L55:
                kotlin.r2 r5 = kotlin.r2.f19517a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q.d.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, @p4.l kotlin.coroutines.d<? super java.lang.Integer> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.q.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.q$a r0 = (kotlinx.coroutines.flow.q.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.q$a r0 = new kotlinx.coroutines.flow.q$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.k1$f r4 = (kotlin.jvm.internal.k1.f) r4
            kotlin.e1.n(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e1.n(r5)
            kotlin.jvm.internal.k1$f r5 = new kotlin.jvm.internal.k1$f
            r5.<init>()
            kotlinx.coroutines.flow.q$b r2 = new kotlinx.coroutines.flow.q$b
            r2.<init>(r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            int r4 = r4.element
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.f(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q.a(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@p4.l kotlinx.coroutines.flow.i<? extends T> r4, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @p4.l kotlin.coroutines.d<? super java.lang.Integer> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.q.c
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.q$c r0 = (kotlinx.coroutines.flow.q.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.q$c r0 = new kotlinx.coroutines.flow.q$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.k1$f r4 = (kotlin.jvm.internal.k1.f) r4
            kotlin.e1.n(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e1.n(r6)
            kotlin.jvm.internal.k1$f r6 = new kotlin.jvm.internal.k1$f
            r6.<init>()
            kotlinx.coroutines.flow.q$d r2 = new kotlinx.coroutines.flow.q$d
            r2.<init>(r5, r6)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r6
        L4e:
            int r4 = r4.element
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.f(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q.b(kotlinx.coroutines.flow.i, v3.p, kotlin.coroutines.d):java.lang.Object");
    }
}
