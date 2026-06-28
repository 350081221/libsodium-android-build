package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import com.umeng.analytics.pro.bi;
import kotlin.a1;
import kotlin.e1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\u001au\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001au\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001aU\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001al\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000e\u001aU\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u0010\u0010\u0018\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0004H\u0000\u001as\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/v0;", "name", t0.b.f22420d, "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "transform", socket.g.f22386a, "(Lkotlinx/coroutines/flow/i;Lv3/q;)Lkotlinx/coroutines/flow/i;", bi.aJ, "Lkotlin/Function2;", "action", "f", "(Lkotlinx/coroutines/flow/i;Lv3/p;)Lkotlinx/coroutines/flow/i;", "", "cause", "d", "e", "b", "c", "(Lkotlinx/coroutines/flow/j;Lv3/q;Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,222:1\n106#2:223\n106#2:224\n106#2:225\n106#2:226\n75#3:227\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n50#1:223\n76#1:224\n146#1:225\n181#1:226\n218#1:227\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class t {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {Opcodes.ADD_INT_LIT8}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
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
            return t.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,112:1\n147#2,13:113\n160#2,6:127\n329#3:126\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n159#1:126\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f20204a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.q f20205b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {114, 121, 128}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
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
                return b.this.collect(null, this);
            }
        }

        public b(i iVar, v3.q qVar) {
            this.f20204a = iVar;
            this.f20205b = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // kotlinx.coroutines.flow.i
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> r9, @p4.l kotlin.coroutines.d<? super kotlin.r2> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.t.b.a
                if (r0 == 0) goto L13
                r0 = r10
                kotlinx.coroutines.flow.t$b$a r0 = (kotlinx.coroutines.flow.t.b.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$b$a r0 = new kotlinx.coroutines.flow.t$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.L$0
                kotlinx.coroutines.flow.internal.v r9 = (kotlinx.coroutines.flow.internal.v) r9
                kotlin.e1.n(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.L$0
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                kotlin.e1.n(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.L$1
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.j) r9
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.t$b r2 = (kotlinx.coroutines.flow.t.b) r2
                kotlin.e1.n(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                kotlin.e1.n(r10)
                kotlinx.coroutines.flow.i r10 = r8.f20204a     // Catch: java.lang.Throwable -> L96
                r0.L$0 = r8     // Catch: java.lang.Throwable -> L96
                r0.L$1 = r9     // Catch: java.lang.Throwable -> L96
                r0.label = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                kotlinx.coroutines.flow.internal.v r10 = new kotlinx.coroutines.flow.internal.v
                kotlin.coroutines.g r4 = r0.getContext()
                r10.<init>(r9, r4)
                v3.q r9 = r2.f20205b     // Catch: java.lang.Throwable -> L8e
                r0.L$0 = r10     // Catch: java.lang.Throwable -> L8e
                r0.L$1 = r6     // Catch: java.lang.Throwable -> L8e
                r0.label = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                kotlin.jvm.internal.i0.e(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                kotlin.jvm.internal.i0.e(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                kotlin.r2 r9 = kotlin.r2.f19517a
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                kotlinx.coroutines.flow.z0 r10 = new kotlinx.coroutines.flow.z0
                r10.<init>(r9)
                v3.q r2 = r2.f20205b
                r0.L$0 = r9
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r10 = kotlinx.coroutines.flow.t.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.b.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,112:1\n182#2,7:113\n189#2,7:121\n329#3:120\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n188#1:120\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class c<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f20206a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.p f20207b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {114, 122}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u243", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
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
                return c.this.collect(null, this);
            }
        }

        public c(i iVar, v3.p pVar) {
            this.f20206a = iVar;
            this.f20207b = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.flow.j, java.lang.Object, kotlinx.coroutines.flow.j<? super T>] */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.flow.internal.v] */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.flow.internal.v] */
        @Override // kotlinx.coroutines.flow.i
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> r7, @p4.l kotlin.coroutines.d<? super kotlin.r2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.t.c.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.t$c$a r0 = (kotlinx.coroutines.flow.t.c.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$c$a r0 = new kotlinx.coroutines.flow.t$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4a
                if (r2 == r4) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.flow.internal.v r7 = (kotlinx.coroutines.flow.internal.v) r7
                kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L30
                goto L94
            L30:
                r8 = move-exception
                goto L98
            L32:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3a:
                java.lang.Object r7 = r0.L$2
                kotlin.jvm.internal.k1$a r7 = (kotlin.jvm.internal.k1.a) r7
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r4 = r0.L$0
                kotlinx.coroutines.flow.t$c r4 = (kotlinx.coroutines.flow.t.c) r4
                kotlin.e1.n(r8)
                goto L6d
            L4a:
                kotlin.e1.n(r8)
                kotlin.jvm.internal.k1$a r8 = new kotlin.jvm.internal.k1$a
                r8.<init>()
                r8.element = r4
                kotlinx.coroutines.flow.i r2 = r6.f20206a
                kotlinx.coroutines.flow.t$d r5 = new kotlinx.coroutines.flow.t$d
                r5.<init>(r8, r7)
                r0.L$0 = r6
                r0.L$1 = r7
                r0.L$2 = r8
                r0.label = r4
                java.lang.Object r2 = r2.collect(r5, r0)
                if (r2 != r1) goto L6a
                return r1
            L6a:
                r4 = r6
                r2 = r7
                r7 = r8
            L6d:
                boolean r7 = r7.element
                if (r7 == 0) goto L9c
                kotlinx.coroutines.flow.internal.v r7 = new kotlinx.coroutines.flow.internal.v
                kotlin.coroutines.g r8 = r0.getContext()
                r7.<init>(r2, r8)
                v3.p r8 = r4.f20207b     // Catch: java.lang.Throwable -> L30
                r0.L$0 = r7     // Catch: java.lang.Throwable -> L30
                r2 = 0
                r0.L$1 = r2     // Catch: java.lang.Throwable -> L30
                r0.L$2 = r2     // Catch: java.lang.Throwable -> L30
                r0.label = r3     // Catch: java.lang.Throwable -> L30
                r2 = 6
                kotlin.jvm.internal.i0.e(r2)     // Catch: java.lang.Throwable -> L30
                java.lang.Object r8 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L30
                r0 = 7
                kotlin.jvm.internal.i0.e(r0)     // Catch: java.lang.Throwable -> L30
                if (r8 != r1) goto L94
                return r1
            L94:
                r7.releaseIntercepted()
                goto L9c
            L98:
                r7.releaseIntercepted()
                throw r8
            L9c:
                kotlin.r2 r7 = kotlin.r2.f19517a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.c.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class d<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1.a f20208a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j<T> f20209b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {185}, m = "emit", n = {}, s = {})
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
        d(k1.a aVar, j<? super T> jVar) {
            this.f20208a = aVar;
            this.f20209b = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.t.d.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.t$d$a r0 = (kotlinx.coroutines.flow.t.d.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$d$a r0 = new kotlinx.coroutines.flow.t$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e1.n(r6)
                goto L44
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.e1.n(r6)
                kotlin.jvm.internal.k1$a r6 = r4.f20208a
                r2 = 0
                r6.element = r2
                kotlinx.coroutines.flow.j<T> r6 = r4.f20209b
                r0.label = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                kotlin.r2 r5 = kotlin.r2.f19517a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.d.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,112:1\n77#2:113\n78#2,7:115\n329#3:114\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n77#1:114\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class e<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.p f20210a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f20211b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {116, 120}, m = "collect", n = {"this", "$this$onStart_u24lambda_u241", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
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
                return e.this.collect(null, this);
            }
        }

        public e(v3.p pVar, i iVar) {
            this.f20210a = pVar;
            this.f20211b = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.i
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> r7, @p4.l kotlin.coroutines.d<? super kotlin.r2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.t.e.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.t$e$a r0 = (kotlinx.coroutines.flow.t.e.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$e$a r0 = new kotlinx.coroutines.flow.t$e$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.e1.n(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.L$2
                kotlinx.coroutines.flow.internal.v r7 = (kotlinx.coroutines.flow.internal.v) r7
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r4 = r0.L$0
                kotlinx.coroutines.flow.t$e r4 = (kotlinx.coroutines.flow.t.e) r4
                kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                kotlin.e1.n(r8)
                kotlinx.coroutines.flow.internal.v r8 = new kotlinx.coroutines.flow.internal.v
                kotlin.coroutines.g r2 = r0.getContext()
                r8.<init>(r7, r2)
                v3.p r2 = r6.f20210a     // Catch: java.lang.Throwable -> L86
                r0.L$0 = r6     // Catch: java.lang.Throwable -> L86
                r0.L$1 = r7     // Catch: java.lang.Throwable -> L86
                r0.L$2 = r8     // Catch: java.lang.Throwable -> L86
                r0.label = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.i0.e(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.i0.e(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                kotlinx.coroutines.flow.i r7 = r4.f20211b
                r8 = 0
                r0.L$0 = r8
                r0.L$1 = r8
                r0.L$2 = r8
                r0.label = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                kotlin.r2 r7 = kotlin.r2.f19517a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.e.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class f<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<j<? super R>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ i<T> $this_transform;
        final /* synthetic */ v3.q<j<? super R>, T, kotlin.coroutines.d<? super r2>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n*L\n1#1,222:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a<T> implements j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v3.q<j<? super R>, T, kotlin.coroutines.d<? super r2>, Object> f20212a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j<R> f20213b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", f = "Emitters.kt", i = {}, l = {42}, m = "emit", n = {}, s = {})
            @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.t$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0603a extends kotlin.coroutines.jvm.internal.d {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0603a(a<? super T> aVar, kotlin.coroutines.d<? super C0603a> dVar) {
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
            public a(v3.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, j<? super R> jVar) {
                this.f20212a = qVar;
                this.f20213b = jVar;
            }

            @p4.m
            public final Object a(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
                kotlin.jvm.internal.i0.e(4);
                new C0603a(this, dVar);
                kotlin.jvm.internal.i0.e(5);
                this.f20212a.invoke(this.f20213b, t5, dVar);
                return r2.f19517a;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
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
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.t.f.a.C0603a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.t$f$a$a r0 = (kotlinx.coroutines.flow.t.f.a.C0603a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.t$f$a$a r0 = new kotlinx.coroutines.flow.t$f$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.e1.n(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.e1.n(r6)
                    v3.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super kotlin.r2>, java.lang.Object> r6 = r4.f20212a
                    kotlinx.coroutines.flow.j<R> r2 = r4.f20213b
                    r0.label = r3
                    java.lang.Object r5 = r6.invoke(r2, r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    kotlin.r2 r5 = kotlin.r2.f19517a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.f.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(i<? extends T> iVar, v3.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.$this_transform = iVar;
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.$this_transform, this.$transform, dVar);
            fVar.L$0 = obj;
            return fVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l j<? super R> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((f) create(jVar, dVar)).invokeSuspend(r2.f19517a);
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
                j jVar = (j) this.L$0;
                i<T> iVar = this.$this_transform;
                a aVar = new a(this.$transform, jVar);
                this.label = 1;
                if (iVar.collect(aVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }

        @p4.m
        public final Object invokeSuspend$$forInline(@p4.l Object obj) {
            j jVar = (j) this.L$0;
            i<T> iVar = this.$this_transform;
            a aVar = new a(this.$transform, jVar);
            kotlin.jvm.internal.i0.e(0);
            iVar.collect(aVar, this);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class g<R> implements i<R> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f20214a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.q f20215b;

        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
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

        public g(i iVar, v3.q qVar) {
            this.f20214a = iVar;
            this.f20215b = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l j<? super R> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            Object collect = this.f20214a.collect(new h(this.f20215b, jVar), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }

        @p4.m
        public Object e(@p4.l j jVar, @p4.l kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.i0.e(4);
            new a(dVar);
            kotlin.jvm.internal.i0.e(5);
            i iVar = this.f20214a;
            h hVar = new h(this.f20215b, jVar);
            kotlin.jvm.internal.i0.e(0);
            iVar.collect(hVar, dVar);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class h<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.q<j<? super R>, T, kotlin.coroutines.d<? super r2>, Object> f20216a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j<R> f20217b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", f = "Emitters.kt", i = {}, l = {53}, m = "emit", n = {}, s = {})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ h<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(h<? super T> hVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.this$0 = hVar;
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
        public h(v3.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, j<? super R> jVar) {
            this.f20216a = qVar;
            this.f20217b = jVar;
        }

        @p4.m
        public final Object a(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            kotlin.jvm.internal.i0.e(4);
            new a(this, dVar);
            kotlin.jvm.internal.i0.e(5);
            this.f20216a.invoke(this.f20217b, t5, dVar);
            return r2.f19517a;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.t.h.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.t$h$a r0 = (kotlinx.coroutines.flow.t.h.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.t$h$a r0 = new kotlinx.coroutines.flow.t$h$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e1.n(r6)
                goto L41
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.e1.n(r6)
                v3.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super kotlin.r2>, java.lang.Object> r6 = r4.f20216a
                kotlinx.coroutines.flow.j<R> r2 = r4.f20217b
                r0.label = r3
                java.lang.Object r5 = r6.invoke(r2, r5, r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                kotlin.r2 r5 = kotlin.r2.f19517a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.h.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    public static final void b(@p4.l j<?> jVar) {
        if (jVar instanceof z0) {
            throw ((z0) jVar).f20284a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(kotlinx.coroutines.flow.j<? super T> r4, v3.q<? super kotlinx.coroutines.flow.j<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.d<? super kotlin.r2>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.coroutines.d<? super kotlin.r2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.t.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.t$a r0 = (kotlinx.coroutines.flow.t.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.t$a r0 = new kotlinx.coroutines.flow.t$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.e1.n(r7)     // Catch: java.lang.Throwable -> L47
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.e1.n(r7)
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L47
            r0.label = r3     // Catch: java.lang.Throwable -> L47
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L47
            if (r4 != r1) goto L44
            return r1
        L44:
            kotlin.r2 r4 = kotlin.r2.f19517a
            return r4
        L47:
            r4 = move-exception
            if (r6 == 0) goto L4f
            if (r6 == r4) goto L4f
            kotlin.o.a(r4, r6)
        L4f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.c(kotlinx.coroutines.flow.j, v3.q, java.lang.Throwable, kotlin.coroutines.d):java.lang.Object");
    }

    @p4.l
    public static final <T> i<T> d(@p4.l i<? extends T> iVar, @p4.l v3.q<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        return new b(iVar, qVar);
    }

    @p4.l
    public static final <T> i<T> e(@p4.l i<? extends T> iVar, @p4.l v3.p<? super j<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return new c(iVar, pVar);
    }

    @p4.l
    public static final <T> i<T> f(@p4.l i<? extends T> iVar, @p4.l v3.p<? super j<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return new e(pVar, iVar);
    }

    @p4.l
    public static final <T, R> i<R> g(@p4.l i<? extends T> iVar, @kotlin.b @p4.l v3.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        return k.J0(new f(iVar, qVar, null));
    }

    @p4.l
    @a1
    public static final <T, R> i<R> h(@p4.l i<? extends T> iVar, @kotlin.b @p4.l v3.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        return new g(iVar, qVar);
    }
}
