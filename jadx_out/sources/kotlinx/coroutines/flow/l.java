package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import java.util.Iterator;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b\u001a6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\rø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0012\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0016\"\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0012\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000\u001a#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020\u001f\u001a\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020\"\u001a\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020%\u001a\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020'\u001aM\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b*\u0010\n\u001aM\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b+\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"T", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "block", "Lkotlinx/coroutines/flow/i;", "n", "(Lv3/p;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function0;", "f", "Lkotlin/Function1;", socket.g.f22386a, "(Lv3/l;)Lkotlinx/coroutines/flow/i;", "", bi.ay, "", "b", "Lkotlin/sequences/m;", "e", "", "elements", bi.aA, "([Ljava/lang/Object;)Lkotlinx/coroutines/flow/i;", t0.b.f22420d, "o", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/i;", "m", "j", "", "", bi.aJ, "", "", "i", "Lkotlin/ranges/l;", "c", "Lkotlin/ranges/o;", "d", "Lkotlinx/coroutines/channels/e0;", "l", "k", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,354:1\n106#2:355\n106#2:356\n106#2:357\n106#2:358\n106#2:359\n106#2:360\n106#2:361\n106#2:362\n106#2:363\n106#2:364\n106#2:365\n106#2:366\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n68#1:355\n82#1:356\n89#1:357\n98#1:358\n107#1:359\n122#1:360\n131#1:361\n153#1:362\n164#1:363\n175#1:364\n184#1:365\n193#1:366\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class l {

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n194#2:113\n195#2,2:115\n197#2:118\n1855#3:114\n1856#3:117\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n194#1:114\n194#1:117\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a implements kotlinx.coroutines.flow.i<Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.o f20166a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2419"}, s = {"L$0"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0595a extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C0595a(kotlin.coroutines.d dVar) {
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

        public a(kotlin.ranges.o oVar) {
            this.f20166a = oVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.i
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super java.lang.Long> r8, @p4.l kotlin.coroutines.d<? super kotlin.r2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.a.C0595a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.l$a$a r0 = (kotlinx.coroutines.flow.l.a.C0595a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$a$a r0 = new kotlinx.coroutines.flow.l$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r8 = r0.L$1
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.e1.n(r9)
                r9 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3a:
                kotlin.e1.n(r9)
                kotlin.ranges.o r9 = r7.f20166a
                java.util.Iterator r9 = r9.iterator()
                r6 = r9
                r9 = r8
                r8 = r6
            L46:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L64
                r2 = r8
                kotlin.collections.t0 r2 = (kotlin.collections.t0) r2
                long r4 = r2.nextLong()
                java.lang.Long r2 = kotlin.coroutines.jvm.internal.b.g(r4)
                r0.L$0 = r9
                r0.L$1 = r8
                r0.label = r3
                java.lang.Object r2 = r9.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L64:
                kotlin.r2 r8 = kotlin.r2.f19517a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.a.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,112:1\n69#2,2:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.a f20167a;

        public b(v3.a aVar) {
            this.f20167a = aVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            Object emit = jVar.emit((Object) this.f20167a.invoke(), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (emit == l5) {
                return emit;
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,112:1\n83#2,2:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class c<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.l f20168a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", f = "Builders.kt", i = {}, l = {113, 113}, m = "collect", n = {}, s = {})
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
                return c.this.collect(null, this);
            }
        }

        public c(v3.l lVar) {
            this.f20168a = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
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
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.c.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$c$a r0 = (kotlinx.coroutines.flow.l.c.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$c$a r0 = new kotlinx.coroutines.flow.l$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.e1.n(r7)
                goto L60
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.L$0
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                kotlin.e1.n(r7)
                goto L54
            L3c:
                kotlin.e1.n(r7)
                v3.l r7 = r5.f20168a
                r0.L$0 = r6
                r0.label = r4
                r2 = 6
                kotlin.jvm.internal.i0.e(r2)
                java.lang.Object r7 = r7.invoke(r0)
                r2 = 7
                kotlin.jvm.internal.i0.e(r2)
                if (r7 != r1) goto L54
                return r1
            L54:
                r2 = 0
                r0.L$0 = r2
                r0.label = r3
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L60
                return r1
            L60:
                kotlin.r2 r6 = kotlin.r2.f19517a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.c.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n90#2:113\n91#2,2:115\n93#2:118\n1855#3:114\n1856#3:117\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n90#1:114\n90#1:117\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class d<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f20169a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u243"}, s = {"L$0"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
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
                return d.this.collect(null, this);
            }
        }

        public d(Iterable iterable) {
            this.f20169a = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
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
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.d.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$d$a r0 = (kotlinx.coroutines.flow.l.d.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$d$a r0 = new kotlinx.coroutines.flow.l$d$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.e1.n(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                kotlin.e1.n(r7)
                java.lang.Iterable r7 = r5.f20169a
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r6.next()
                r0.L$0 = r7
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L5d:
                kotlin.r2 r6 = kotlin.r2.f19517a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.d.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,112:1\n99#2:113\n100#2,2:115\n102#2:118\n32#3:114\n33#3:117\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n99#1:114\n99#1:117\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class e<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f20170a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u245"}, s = {"L$0"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
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
                return e.this.collect(null, this);
            }
        }

        public e(Iterator it) {
            this.f20170a = it;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
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
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.e.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$e$a r0 = (kotlinx.coroutines.flow.l.e.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$e$a r0 = new kotlinx.coroutines.flow.l$e$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.e1.n(r7)
                r7 = r2
                goto L42
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                kotlin.e1.n(r7)
                java.util.Iterator r7 = r5.f20170a
                r4 = r7
                r7 = r6
                r6 = r4
            L42:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L59
                java.lang.Object r2 = r6.next()
                r0.L$0 = r7
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L42
                return r1
            L59:
                kotlin.r2 r6 = kotlin.r2.f19517a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.e.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,112:1\n108#2:113\n109#2,2:115\n111#2:118\n1295#3:114\n1296#3:117\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n108#1:114\n108#1:117\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class f<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.sequences.m f20171a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u247"}, s = {"L$0"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
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
                return f.this.collect(null, this);
            }
        }

        public f(kotlin.sequences.m mVar) {
            this.f20171a = mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
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
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.f.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$f$a r0 = (kotlinx.coroutines.flow.l.f.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$f$a r0 = new kotlinx.coroutines.flow.l$f$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.e1.n(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                kotlin.e1.n(r7)
                kotlin.sequences.m r7 = r5.f20171a
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r6.next()
                r0.L$0 = r7
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L5d:
                kotlin.r2 r6 = kotlin.r2.f19517a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.f.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n154#2:113\n155#2,2:115\n157#2:118\n13579#3:114\n13580#3:117\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n154#1:114\n154#1:117\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class g<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f20172a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2411", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int I$0;
            int I$1;
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
                return g.this.collect(null, this);
            }
        }

        public g(Object[] objArr) {
            this.f20172a = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:10:0x005f). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> r8, @p4.l kotlin.coroutines.d<? super kotlin.r2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.g.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.l$g$a r0 = (kotlinx.coroutines.flow.l.g.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$g$a r0 = new kotlinx.coroutines.flow.l$g$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.I$1
                int r2 = r0.I$0
                java.lang.Object r4 = r0.L$1
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                kotlin.e1.n(r9)
                r9 = r5
                goto L5f
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                kotlin.e1.n(r9)
                java.lang.Object[] r9 = r7.f20172a
                int r2 = r9.length
                r4 = 0
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r4
                r4 = r6
            L4a:
                if (r2 >= r8) goto L61
                r5 = r4[r2]
                r0.L$0 = r9
                r0.L$1 = r4
                r0.I$0 = r2
                r0.I$1 = r8
                r0.label = r3
                java.lang.Object r5 = r9.emit(r5, r0)
                if (r5 != r1) goto L5f
                return r1
            L5f:
                int r2 = r2 + r3
                goto L4a
            L61:
                kotlin.r2 r8 = kotlin.r2.f19517a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.g.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n165#2:113\n166#2,2:115\n168#2:118\n13600#3:114\n13601#3:117\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n165#1:114\n165#1:117\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class h implements kotlinx.coroutines.flow.i<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f20173a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2413", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int I$0;
            int I$1;
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
                return h.this.collect(null, this);
            }
        }

        public h(int[] iArr) {
            this.f20173a = iArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0060 -> B:10:0x0063). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super java.lang.Integer> r8, @p4.l kotlin.coroutines.d<? super kotlin.r2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.h.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.l$h$a r0 = (kotlinx.coroutines.flow.l.h.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$h$a r0 = new kotlinx.coroutines.flow.l$h$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.I$1
                int r2 = r0.I$0
                java.lang.Object r4 = r0.L$1
                int[] r4 = (int[]) r4
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                kotlin.e1.n(r9)
                r9 = r5
                goto L63
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                kotlin.e1.n(r9)
                int[] r9 = r7.f20173a
                int r2 = r9.length
                r4 = 0
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r4
                r4 = r6
            L4a:
                if (r2 >= r8) goto L65
                r5 = r4[r2]
                java.lang.Integer r5 = kotlin.coroutines.jvm.internal.b.f(r5)
                r0.L$0 = r9
                r0.L$1 = r4
                r0.I$0 = r2
                r0.I$1 = r8
                r0.label = r3
                java.lang.Object r5 = r9.emit(r5, r0)
                if (r5 != r1) goto L63
                return r1
            L63:
                int r2 = r2 + r3
                goto L4a
            L65:
                kotlin.r2 r8 = kotlin.r2.f19517a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.h.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n176#2:113\n177#2,2:115\n179#2:118\n13607#3:114\n13608#3:117\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n176#1:114\n176#1:117\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class i implements kotlinx.coroutines.flow.i<Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long[] f20174a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2415", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int I$0;
            int I$1;
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
                return i.this.collect(null, this);
            }
        }

        public i(long[] jArr) {
            this.f20174a = jArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0060 -> B:10:0x0063). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super java.lang.Long> r9, @p4.l kotlin.coroutines.d<? super kotlin.r2> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.l.i.a
                if (r0 == 0) goto L13
                r0 = r10
                kotlinx.coroutines.flow.l$i$a r0 = (kotlinx.coroutines.flow.l.i.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$i$a r0 = new kotlinx.coroutines.flow.l$i$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r9 = r0.I$1
                int r2 = r0.I$0
                java.lang.Object r4 = r0.L$1
                long[] r4 = (long[]) r4
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                kotlin.e1.n(r10)
                r10 = r5
                goto L63
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                kotlin.e1.n(r10)
                long[] r10 = r8.f20174a
                int r2 = r10.length
                r4 = 0
                r7 = r10
                r10 = r9
                r9 = r2
                r2 = r4
                r4 = r7
            L4a:
                if (r2 >= r9) goto L65
                r5 = r4[r2]
                java.lang.Long r5 = kotlin.coroutines.jvm.internal.b.g(r5)
                r0.L$0 = r10
                r0.L$1 = r4
                r0.I$0 = r2
                r0.I$1 = r9
                r0.label = r3
                java.lang.Object r5 = r10.emit(r5, r0)
                if (r5 != r1) goto L63
                return r1
            L63:
                int r2 = r2 + r3
                goto L4a
            L65:
                kotlin.r2 r9 = kotlin.r2.f19517a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.i.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n185#2:113\n186#2,2:115\n188#2:118\n1855#3:114\n1856#3:117\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n185#1:114\n185#1:117\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class j implements kotlinx.coroutines.flow.i<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f20175a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2417"}, s = {"L$0"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
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
                return j.this.collect(null, this);
            }
        }

        public j(kotlin.ranges.l lVar) {
            this.f20175a = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.i
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super java.lang.Integer> r6, @p4.l kotlin.coroutines.d<? super kotlin.r2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.l.j.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$j$a r0 = (kotlinx.coroutines.flow.l.j.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$j$a r0 = new kotlinx.coroutines.flow.l$j$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.e1.n(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                kotlin.e1.n(r7)
                kotlin.ranges.l r7 = r5.f20175a
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L64
                r2 = r6
                kotlin.collections.s0 r2 = (kotlin.collections.s0) r2
                int r2 = r2.nextInt()
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.f(r2)
                r0.L$0 = r7
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L64:
                kotlin.r2 r6 = kotlin.r2.f19517a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.j.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,112:1\n123#2,4:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class k<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f20176a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {114}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u248"}, s = {"L$0", "L$1"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int I$0;
            int I$1;
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
                return k.this.collect(null, this);
            }
        }

        public k(Object[] objArr) {
            this.f20176a = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005d -> B:10:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.i
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> r8, @p4.l kotlin.coroutines.d<? super kotlin.r2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.l.k.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.l$k$a r0 = (kotlinx.coroutines.flow.l.k.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$k$a r0 = new kotlinx.coroutines.flow.l$k$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.I$1
                int r2 = r0.I$0
                java.lang.Object r4 = r0.L$1
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.l$k r5 = (kotlinx.coroutines.flow.l.k) r5
                kotlin.e1.n(r9)
                r9 = r4
                goto L60
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                kotlin.e1.n(r9)
                java.lang.Object[] r9 = r7.f20176a
                int r9 = r9.length
                r2 = 0
                r5 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L49:
                if (r2 >= r8) goto L62
                java.lang.Object[] r4 = r5.f20176a
                r4 = r4[r2]
                r0.L$0 = r5
                r0.L$1 = r9
                r0.I$0 = r2
                r0.I$1 = r8
                r0.label = r3
                java.lang.Object r4 = r9.emit(r4, r0)
                if (r4 != r1) goto L60
                return r1
            L60:
                int r2 = r2 + r3
                goto L49
            L62:
                kotlin.r2 r8 = kotlin.r2.f19517a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l.k.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,112:1\n136#2,2:113\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.l$l, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0596l<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f20177a;

        public C0596l(Object obj) {
            this.f20177a = obj;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            Object emit = jVar.emit((Object) this.f20177a, dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (emit == l5) {
                return emit;
            }
            return r2.f19517a;
        }
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> a(@p4.l Iterable<? extends T> iterable) {
        return new d(iterable);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> b(@p4.l Iterator<? extends T> it) {
        return new e(it);
    }

    @p4.l
    public static final kotlinx.coroutines.flow.i<Integer> c(@p4.l kotlin.ranges.l lVar) {
        return new j(lVar);
    }

    @p4.l
    public static final kotlinx.coroutines.flow.i<Long> d(@p4.l kotlin.ranges.o oVar) {
        return new a(oVar);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> e(@p4.l kotlin.sequences.m<? extends T> mVar) {
        return new f(mVar);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> f(@p4.l v3.a<? extends T> aVar) {
        return new b(aVar);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> g(@p4.l v3.l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar) {
        return new c(lVar);
    }

    @p4.l
    public static final kotlinx.coroutines.flow.i<Integer> h(@p4.l int[] iArr) {
        return new h(iArr);
    }

    @p4.l
    public static final kotlinx.coroutines.flow.i<Long> i(@p4.l long[] jArr) {
        return new i(jArr);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> j(@p4.l T[] tArr) {
        return new g(tArr);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> k(@kotlin.b @p4.l v3.p<? super kotlinx.coroutines.channels.e0<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return new kotlinx.coroutines.flow.b(pVar, null, 0, null, 14, null);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> l(@kotlin.b @p4.l v3.p<? super kotlinx.coroutines.channels.e0<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return new kotlinx.coroutines.flow.f(pVar, null, 0, null, 14, null);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> m() {
        return kotlinx.coroutines.flow.h.f20100a;
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> n(@kotlin.b @p4.l v3.p<? super kotlinx.coroutines.flow.j<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return new h0(pVar);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> o(T t5) {
        return new C0596l(t5);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> p(@p4.l T... tArr) {
        return new k(tArr);
    }
}
