package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\n\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\u001a,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\n*\u00020\u0005*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u001a\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001ad\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\b\u001aj\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\n*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u000125\b\u0004\u0010\u0013\u001a/\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\b\u001a\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aJ\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\b\u001a~\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00028\u00012H\b\u0001\u0010\u001e\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001cø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a~\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00028\u00012H\b\u0001\u0010\u001e\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001cø\u0001\u0000¢\u0006\u0004\b!\u0010 \u001an\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012F\u0010\u001e\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001cø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "predicate", bi.ay, "(Lkotlinx/coroutines/flow/i;Lv3/p;)Lkotlinx/coroutines/flow/i;", "d", "R", "b", "Lkotlin/reflect/d;", "klass", "c", "e", "Lkotlin/v0;", "name", t0.b.f22420d, "transform", "f", socket.g.f22386a, "Lkotlin/collections/p0;", "l", "Lkotlin/r2;", "action", bi.aJ, "initial", "Lkotlin/Function3;", "accumulator", "operation", "k", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lv3/q;)Lkotlinx/coroutines/flow/i;", "i", "j", "(Lkotlinx/coroutines/flow/i;Lv3/q;)Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,136:1\n21#1:143\n23#1:147\n21#1:148\n23#1:152\n50#2:137\n55#2:139\n50#2:140\n55#2:142\n50#2:144\n55#2:146\n50#2:149\n55#2:151\n50#2:153\n55#2:155\n50#2:156\n55#2:158\n50#2:159\n55#2:161\n50#2:163\n55#2:165\n106#3:138\n106#3:141\n106#3:145\n106#3:150\n106#3:154\n106#3:157\n106#3:160\n106#3:162\n106#3:164\n106#3:166\n106#3:167\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n36#1:143\n36#1:147\n41#1:148\n41#1:152\n21#1:137\n21#1:139\n28#1:140\n28#1:142\n36#1:144\n36#1:146\n41#1:149\n41#1:151\n46#1:153\n46#1:155\n53#1:156\n53#1:158\n60#1:159\n60#1:161\n78#1:163\n78#1:165\n21#1:138\n28#1:141\n36#1:145\n41#1:150\n46#1:154\n53#1:157\n60#1:160\n68#1:162\n78#1:164\n105#1:166\n125#1:167\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 {

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$g"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i f20026a;

        /* renamed from: b */
        final /* synthetic */ v3.p f20027b;

        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.a0$a$a */
        /* loaded from: classes4.dex */
        public static final class C0576a extends kotlin.coroutines.jvm.internal.d {
            int label;
            /* synthetic */ Object result;

            public C0576a(kotlin.coroutines.d dVar) {
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

        @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n22#2,2:223\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a */
            final /* synthetic */ kotlinx.coroutines.flow.j f20028a;

            /* renamed from: b */
            final /* synthetic */ v3.p f20029b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {Opcodes.XOR_INT_LIT8, Opcodes.XOR_INT_LIT8}, m = "emit", n = {t0.b.f22420d, "$this$filter_u24lambda_u240"}, s = {"L$0", "L$1"})
            @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.a0$a$b$a */
            /* loaded from: classes4.dex */
            public static final class C0577a extends kotlin.coroutines.jvm.internal.d {
                Object L$0;
                Object L$1;
                int label;
                /* synthetic */ Object result;

                public C0577a(kotlin.coroutines.d dVar) {
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

            public b(kotlinx.coroutines.flow.j jVar, v3.p pVar) {
                this.f20028a = jVar;
                this.f20029b = pVar;
            }

            @p4.m
            public final Object a(Object obj, @p4.l kotlin.coroutines.d dVar) {
                kotlin.jvm.internal.i0.e(4);
                new C0577a(dVar);
                kotlin.jvm.internal.i0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f20028a;
                if (((Boolean) this.f20029b.invoke(obj, dVar)).booleanValue()) {
                    kotlin.jvm.internal.i0.e(0);
                    jVar.emit(obj, dVar);
                    kotlin.jvm.internal.i0.e(1);
                }
                return r2.f19517a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
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
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.a.b.C0577a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$a$b$a r0 = (kotlinx.coroutines.flow.a0.a.b.C0577a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$a$b$a r0 = new kotlinx.coroutines.flow.a0$a$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.e1.n(r8)
                    goto L6c
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.L$1
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    java.lang.Object r2 = r0.L$0
                    kotlin.e1.n(r8)
                    goto L56
                L3e:
                    kotlin.e1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f20028a
                    v3.p r2 = r6.f20029b
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.label = r4
                    java.lang.Object r2 = r2.invoke(r7, r0)
                    if (r2 != r1) goto L52
                    return r1
                L52:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L56:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L6c
                    r8 = 0
                    r0.L$0 = r8
                    r0.L$1 = r8
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L6c
                    return r1
                L6c:
                    kotlin.r2 r7 = kotlin.r2.f19517a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.a.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(kotlinx.coroutines.flow.i iVar, v3.p pVar) {
            this.f20026a = iVar;
            this.f20027b = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            Object l5;
            Object collect = this.f20026a.collect(new b(jVar, this.f20027b), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }

        @p4.m
        public Object e(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.i0.e(4);
            new C0576a(dVar);
            kotlin.jvm.internal.i0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f20026a;
            b bVar = new b(jVar, this.f20027b);
            kotlin.jvm.internal.i0.e(0);
            iVar.collect(bVar, dVar);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/a0$a"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b implements kotlinx.coroutines.flow.i<Object> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i f20030a;

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
                return b.this.collect(null, this);
            }
        }

        @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$a$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n22#2:223\n36#2:224\n23#2:225\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.a0$b$b */
        /* loaded from: classes4.dex */
        public static final class C0578b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a */
            final /* synthetic */ kotlinx.coroutines.flow.j f20031a;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {Opcodes.XOR_INT_LIT8}, m = "emit", n = {}, s = {})
            @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.a0$b$b$a */
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
                    return C0578b.this.emit(null, this);
                }
            }

            public C0578b(kotlinx.coroutines.flow.j jVar) {
                this.f20031a = jVar;
            }

            @p4.m
            public final Object a(Object obj, @p4.l kotlin.coroutines.d dVar) {
                kotlin.jvm.internal.i0.e(4);
                new a(dVar);
                kotlin.jvm.internal.i0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f20031a;
                kotlin.jvm.internal.l0.y(3, "R");
                if (obj instanceof Object) {
                    kotlin.jvm.internal.i0.e(0);
                    jVar.emit(obj, dVar);
                    kotlin.jvm.internal.i0.e(1);
                }
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
            public final java.lang.Object emit(java.lang.Object r6, @p4.l kotlin.coroutines.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.a0.b.C0578b.a
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.a0$b$b$a r0 = (kotlinx.coroutines.flow.a0.b.C0578b.a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$b$b$a r0 = new kotlinx.coroutines.flow.a0$b$b$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.e1.n(r7)
                    goto L49
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.e1.n(r7)
                    kotlinx.coroutines.flow.j r7 = r5.f20031a
                    r2 = 3
                    java.lang.String r4 = "R"
                    kotlin.jvm.internal.l0.y(r2, r4)
                    boolean r2 = r6 instanceof java.lang.Object
                    if (r2 == 0) goto L49
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L49
                    return r1
                L49:
                    kotlin.r2 r6 = kotlin.r2.f19517a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.b.C0578b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public b(kotlinx.coroutines.flow.i iVar) {
            this.f20030a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super Object> jVar, @p4.l kotlin.coroutines.d dVar) {
            Object l5;
            kotlinx.coroutines.flow.i iVar = this.f20030a;
            kotlin.jvm.internal.l0.w();
            Object collect = iVar.collect(new C0578b(jVar), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }

        @p4.m
        public Object e(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.i0.e(4);
            new a(dVar);
            kotlin.jvm.internal.i0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f20030a;
            kotlin.jvm.internal.l0.w();
            C0578b c0578b = new C0578b(jVar);
            kotlin.jvm.internal.i0.e(0);
            iVar.collect(c0578b, dVar);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/a0$a"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class c implements kotlinx.coroutines.flow.i<Object> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i f20032a;

        /* renamed from: b */
        final /* synthetic */ kotlin.reflect.d f20033b;

        @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$a$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n22#2:223\n41#2:224\n23#2:225\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a */
            final /* synthetic */ kotlinx.coroutines.flow.j f20034a;

            /* renamed from: b */
            final /* synthetic */ kotlin.reflect.d f20035b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2", f = "Transform.kt", i = {}, l = {Opcodes.XOR_INT_LIT8}, m = "emit", n = {}, s = {})
            @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.a0$c$a$a */
            /* loaded from: classes4.dex */
            public static final class C0579a extends kotlin.coroutines.jvm.internal.d {
                Object L$0;
                Object L$1;
                int label;
                /* synthetic */ Object result;

                public C0579a(kotlin.coroutines.d dVar) {
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

            public a(kotlinx.coroutines.flow.j jVar, kotlin.reflect.d dVar) {
                this.f20034a = jVar;
                this.f20035b = dVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.j
            @p4.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @p4.l kotlin.coroutines.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.a0.c.a.C0579a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.a0$c$a$a r0 = (kotlinx.coroutines.flow.a0.c.a.C0579a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$c$a$a r0 = new kotlinx.coroutines.flow.a0$c$a$a
                    r0.<init>(r6)
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
                    kotlinx.coroutines.flow.j r6 = r4.f20034a
                    kotlin.reflect.d r2 = r4.f20035b
                    boolean r2 = r2.o(r5)
                    if (r2 == 0) goto L47
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.r2 r5 = kotlin.r2.f19517a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.c.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public c(kotlinx.coroutines.flow.i iVar, kotlin.reflect.d dVar) {
            this.f20032a = iVar;
            this.f20033b = dVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super Object> jVar, @p4.l kotlin.coroutines.d dVar) {
            Object l5;
            Object collect = this.f20032a.collect(new a(jVar, this.f20033b), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$g"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class d<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i f20036a;

        /* renamed from: b */
        final /* synthetic */ v3.p f20037b;

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
                return d.this.collect(null, this);
            }
        }

        @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n29#2,2:223\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a */
            final /* synthetic */ kotlinx.coroutines.flow.j f20038a;

            /* renamed from: b */
            final /* synthetic */ v3.p f20039b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {Opcodes.XOR_INT_LIT8, Opcodes.XOR_INT_LIT8}, m = "emit", n = {t0.b.f22420d, "$this$filterNot_u24lambda_u241"}, s = {"L$0", "L$1"})
            @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
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

            public b(kotlinx.coroutines.flow.j jVar, v3.p pVar) {
                this.f20038a = jVar;
                this.f20039b = pVar;
            }

            @p4.m
            public final Object a(Object obj, @p4.l kotlin.coroutines.d dVar) {
                kotlin.jvm.internal.i0.e(4);
                new a(dVar);
                kotlin.jvm.internal.i0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f20038a;
                if (!((Boolean) this.f20039b.invoke(obj, dVar)).booleanValue()) {
                    kotlin.jvm.internal.i0.e(0);
                    jVar.emit(obj, dVar);
                    kotlin.jvm.internal.i0.e(1);
                }
                return r2.f19517a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
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
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.d.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$d$b$a r0 = (kotlinx.coroutines.flow.a0.d.b.a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$d$b$a r0 = new kotlinx.coroutines.flow.a0$d$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.e1.n(r8)
                    goto L6c
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.L$1
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    java.lang.Object r2 = r0.L$0
                    kotlin.e1.n(r8)
                    goto L56
                L3e:
                    kotlin.e1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f20038a
                    v3.p r2 = r6.f20039b
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.label = r4
                    java.lang.Object r2 = r2.invoke(r7, r0)
                    if (r2 != r1) goto L52
                    return r1
                L52:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L56:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 != 0) goto L6c
                    r8 = 0
                    r0.L$0 = r8
                    r0.L$1 = r8
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L6c
                    return r1
                L6c:
                    kotlin.r2 r7 = kotlin.r2.f19517a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.d.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public d(kotlinx.coroutines.flow.i iVar, v3.p pVar) {
            this.f20036a = iVar;
            this.f20037b = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            Object l5;
            Object collect = this.f20036a.collect(new b(jVar, this.f20037b), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }

        @p4.m
        public Object e(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.i0.e(4);
            new a(dVar);
            kotlin.jvm.internal.i0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f20036a;
            b bVar = new b(jVar, this.f20037b);
            kotlin.jvm.internal.i0.e(0);
            iVar.collect(bVar, dVar);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$g"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class e<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i f20040a;

        @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n47#2,2:223\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a */
            final /* synthetic */ kotlinx.coroutines.flow.j f20041a;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {Opcodes.XOR_INT_LIT8}, m = "emit", n = {}, s = {})
            @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.a0$e$a$a */
            /* loaded from: classes4.dex */
            public static final class C0580a extends kotlin.coroutines.jvm.internal.d {
                int label;
                /* synthetic */ Object result;

                public C0580a(kotlin.coroutines.d dVar) {
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

            public a(kotlinx.coroutines.flow.j jVar) {
                this.f20041a = jVar;
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
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.a0.e.a.C0580a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.a0$e$a$a r0 = (kotlinx.coroutines.flow.a0.e.a.C0580a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$e$a$a r0 = new kotlinx.coroutines.flow.a0$e$a$a
                    r0.<init>(r6)
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
                    kotlinx.coroutines.flow.j r6 = r4.f20041a
                    if (r5 == 0) goto L41
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    kotlin.r2 r5 = kotlin.r2.f19517a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.e.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public e(kotlinx.coroutines.flow.i iVar) {
            this.f20040a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            Object l5;
            Object collect = this.f20040a.collect(new a(jVar), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$g"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class f<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i f20042a;

        /* renamed from: b */
        final /* synthetic */ v3.p f20043b;

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
                return f.this.collect(null, this);
            }
        }

        @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n54#2:223\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a */
            final /* synthetic */ kotlinx.coroutines.flow.j f20044a;

            /* renamed from: b */
            final /* synthetic */ v3.p f20045b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {Opcodes.XOR_INT_LIT8, Opcodes.XOR_INT_LIT8}, m = "emit", n = {}, s = {})
            @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
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
                    return b.this.emit(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, v3.p pVar) {
                this.f20044a = jVar;
                this.f20045b = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @p4.m
            public final Object a(Object obj, @p4.l kotlin.coroutines.d dVar) {
                kotlin.jvm.internal.i0.e(4);
                new a(dVar);
                kotlin.jvm.internal.i0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f20044a;
                Object invoke = this.f20045b.invoke(obj, dVar);
                kotlin.jvm.internal.i0.e(0);
                jVar.emit(invoke, dVar);
                kotlin.jvm.internal.i0.e(1);
                return r2.f19517a;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
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
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.f.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$f$b$a r0 = (kotlinx.coroutines.flow.a0.f.b.a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$f$b$a r0 = new kotlinx.coroutines.flow.a0$f$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.e1.n(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.L$0
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.e1.n(r8)
                    goto L51
                L3c:
                    kotlin.e1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f20044a
                    v3.p r2 = r6.f20045b
                    r0.L$0 = r8
                    r0.label = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.L$0 = r2
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.r2 r7 = kotlin.r2.f19517a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.f.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public f(kotlinx.coroutines.flow.i iVar, v3.p pVar) {
            this.f20042a = iVar;
            this.f20043b = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            Object l5;
            Object collect = this.f20042a.collect(new b(jVar, this.f20043b), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }

        @p4.m
        public Object e(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.i0.e(4);
            new a(dVar);
            kotlin.jvm.internal.i0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f20042a;
            b bVar = new b(jVar, this.f20043b);
            kotlin.jvm.internal.i0.e(0);
            iVar.collect(bVar, dVar);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$g"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class g<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i f20046a;

        /* renamed from: b */
        final /* synthetic */ v3.p f20047b;

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

        @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n61#2,2:223\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a */
            final /* synthetic */ kotlinx.coroutines.flow.j f20048a;

            /* renamed from: b */
            final /* synthetic */ v3.p f20049b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0}, l = {Opcodes.XOR_INT_LIT8, Opcodes.SHL_INT_LIT8}, m = "emit", n = {"$this$mapNotNull_u24lambda_u246"}, s = {"L$0"})
            @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
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
                    return b.this.emit(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, v3.p pVar) {
                this.f20048a = jVar;
                this.f20049b = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @p4.m
            public final Object a(Object obj, @p4.l kotlin.coroutines.d dVar) {
                kotlin.jvm.internal.i0.e(4);
                new a(dVar);
                kotlin.jvm.internal.i0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f20048a;
                Object invoke = this.f20049b.invoke(obj, dVar);
                if (invoke != null) {
                    kotlin.jvm.internal.i0.e(0);
                    jVar.emit(invoke, dVar);
                    kotlin.jvm.internal.i0.e(1);
                }
                return r2.f19517a;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
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
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.g.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.a0$g$b$a r0 = (kotlinx.coroutines.flow.a0.g.b.a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$g$b$a r0 = new kotlinx.coroutines.flow.a0$g$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.e1.n(r8)
                    goto L60
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.L$0
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.e1.n(r8)
                    goto L51
                L3c:
                    kotlin.e1.n(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f20048a
                    v3.p r2 = r6.f20049b
                    r0.L$0 = r8
                    r0.label = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    if (r8 != 0) goto L54
                    goto L60
                L54:
                    r2 = 0
                    r0.L$0 = r2
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L60
                    return r1
                L60:
                    kotlin.r2 r7 = kotlin.r2.f19517a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.g.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public g(kotlinx.coroutines.flow.i iVar, v3.p pVar) {
            this.f20046a = iVar;
            this.f20047b = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            Object l5;
            Object collect = this.f20046a.collect(new b(jVar, this.f20047b), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }

        @p4.m
        public Object e(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.i0.e(4);
            new a(dVar);
            kotlin.jvm.internal.i0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f20046a;
            b bVar = new b(jVar, this.f20047b);
            kotlin.jvm.internal.i0.e(0);
            iVar.collect(bVar, dVar);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/t$g"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class h<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i f20050a;

        /* renamed from: b */
        final /* synthetic */ v3.p f20051b;

        @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/t$h", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n79#2,2:223\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a */
            final /* synthetic */ kotlinx.coroutines.flow.j f20052a;

            /* renamed from: b */
            final /* synthetic */ v3.p f20053b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {Opcodes.XOR_INT_LIT8, Opcodes.SHL_INT_LIT8}, m = "emit", n = {t0.b.f22420d, "$this$onEach_u24lambda_u248"}, s = {"L$0", "L$1"})
            @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.a0$h$a$a */
            /* loaded from: classes4.dex */
            public static final class C0581a extends kotlin.coroutines.jvm.internal.d {
                Object L$0;
                Object L$1;
                int label;
                /* synthetic */ Object result;

                public C0581a(kotlin.coroutines.d dVar) {
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

            public a(kotlinx.coroutines.flow.j jVar, v3.p pVar) {
                this.f20052a = jVar;
                this.f20053b = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
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
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.a0.h.a.C0581a
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.a0$h$a$a r0 = (kotlinx.coroutines.flow.a0.h.a.C0581a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.a0$h$a$a r0 = new kotlinx.coroutines.flow.a0$h$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.e1.n(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.L$1
                    kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                    java.lang.Object r2 = r0.L$0
                    kotlin.e1.n(r7)
                    goto L5c
                L3e:
                    kotlin.e1.n(r7)
                    kotlinx.coroutines.flow.j r7 = r5.f20052a
                    v3.p r2 = r5.f20053b
                    r0.L$0 = r6
                    r0.L$1 = r7
                    r0.label = r4
                    r4 = 6
                    kotlin.jvm.internal.i0.e(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.i0.e(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.L$0 = r7
                    r0.L$1 = r7
                    r0.label = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    kotlin.r2 r6 = kotlin.r2.f19517a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.h.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public h(kotlinx.coroutines.flow.i iVar, v3.p pVar) {
            this.f20050a = iVar;
            this.f20051b = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            Object l5;
            Object collect = this.f20050a.collect(new a(jVar, this.f20051b), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,112:1\n106#2,7:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class i<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: a */
        final /* synthetic */ Object f20054a;

        /* renamed from: b */
        final /* synthetic */ kotlinx.coroutines.flow.i f20055b;

        /* renamed from: c */
        final /* synthetic */ v3.q f20056c;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {114, 115}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u249", "accumulator"}, s = {"L$0", "L$1", "L$2"})
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
                return i.this.collect(null, this);
            }
        }

        public i(Object obj, kotlinx.coroutines.flow.i iVar, v3.q qVar) {
            this.f20054a = obj;
            this.f20055b = iVar;
            this.f20056c = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // kotlinx.coroutines.flow.i
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super R> r7, @p4.l kotlin.coroutines.d<? super kotlin.r2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.a0.i.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.a0$i$a r0 = (kotlinx.coroutines.flow.a0.i.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$i$a r0 = new kotlinx.coroutines.flow.a0$i$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L44
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.e1.n(r8)
                goto L7b
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.L$2
                kotlin.jvm.internal.k1$h r7 = (kotlin.jvm.internal.k1.h) r7
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                java.lang.Object r4 = r0.L$0
                kotlinx.coroutines.flow.a0$i r4 = (kotlinx.coroutines.flow.a0.i) r4
                kotlin.e1.n(r8)
                goto L62
            L44:
                kotlin.e1.n(r8)
                kotlin.jvm.internal.k1$h r8 = new kotlin.jvm.internal.k1$h
                r8.<init>()
                java.lang.Object r2 = r6.f20054a
                r8.element = r2
                r0.L$0 = r6
                r0.L$1 = r7
                r0.L$2 = r8
                r0.label = r4
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L5f
                return r1
            L5f:
                r4 = r6
                r2 = r7
                r7 = r8
            L62:
                kotlinx.coroutines.flow.i r8 = r4.f20055b
                kotlinx.coroutines.flow.a0$j r5 = new kotlinx.coroutines.flow.a0$j
                v3.q r4 = r4.f20056c
                r5.<init>(r7, r4, r2)
                r7 = 0
                r0.L$0 = r7
                r0.L$1 = r7
                r0.L$2 = r7
                r0.label = r3
                java.lang.Object r7 = r8.collect(r5, r0)
                if (r7 != r1) goto L7b
                return r1
            L7b:
                kotlin.r2 r7 = kotlin.r2.f19517a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.i.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class j<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a */
        final /* synthetic */ k1.h<R> f20057a;

        /* renamed from: b */
        final /* synthetic */ v3.q<R, T, kotlin.coroutines.d<? super R>, Object> f20058b;

        /* renamed from: c */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f20059c;

        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {109, 110}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ j<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(j<? super T> jVar, kotlin.coroutines.d<? super a> dVar) {
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
        j(k1.h<R> hVar, v3.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super R> jVar) {
            this.f20057a = hVar;
            this.f20058b = qVar;
            this.f20059c = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.j
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, @p4.l kotlin.coroutines.d<? super kotlin.r2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.a0.j.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.a0$j$a r0 = (kotlinx.coroutines.flow.a0.j.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$j$a r0 = new kotlinx.coroutines.flow.a0$j$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.e1.n(r9)
                goto L70
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.L$1
                kotlin.jvm.internal.k1$h r8 = (kotlin.jvm.internal.k1.h) r8
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.a0$j r2 = (kotlinx.coroutines.flow.a0.j) r2
                kotlin.e1.n(r9)
                goto L5a
            L40:
                kotlin.e1.n(r9)
                kotlin.jvm.internal.k1$h<R> r9 = r7.f20057a
                v3.q<R, T, kotlin.coroutines.d<? super R>, java.lang.Object> r2 = r7.f20058b
                T r5 = r9.element
                r0.L$0 = r7
                r0.L$1 = r9
                r0.label = r4
                java.lang.Object r8 = r2.invoke(r5, r8, r0)
                if (r8 != r1) goto L56
                return r1
            L56:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L5a:
                r8.element = r9
                kotlinx.coroutines.flow.j<R> r8 = r2.f20059c
                kotlin.jvm.internal.k1$h<R> r9 = r2.f20057a
                T r9 = r9.element
                r2 = 0
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L70
                return r1
            L70:
                kotlin.r2 r8 = kotlin.r2.f19517a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.j.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,112:1\n126#2,10:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class k<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i f20060a;

        /* renamed from: b */
        final /* synthetic */ v3.q f20061b;

        public k(kotlinx.coroutines.flow.i iVar, v3.q qVar) {
            this.f20060a = iVar;
            this.f20061b = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            k1.h hVar = new k1.h();
            hVar.element = (T) kotlinx.coroutines.flow.internal.u.f20143a;
            Object collect = this.f20060a.collect(new l(hVar, this.f20061b, jVar), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class l<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a */
        final /* synthetic */ k1.h<Object> f20062a;

        /* renamed from: b */
        final /* synthetic */ v3.q<T, T, kotlin.coroutines.d<? super T>, Object> f20063b;

        /* renamed from: c */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f20064c;

        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {131, 133}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ l<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(l<? super T> lVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.this$0 = lVar;
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
        l(k1.h<Object> hVar, v3.q<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super T> jVar) {
            this.f20062a = hVar;
            this.f20063b = qVar;
            this.f20064c = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.j
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, @p4.l kotlin.coroutines.d<? super kotlin.r2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.a0.l.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.a0$l$a r0 = (kotlinx.coroutines.flow.a0.l.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$l$a r0 = new kotlinx.coroutines.flow.a0$l$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.e1.n(r9)
                goto L79
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.L$1
                kotlin.jvm.internal.k1$h r8 = (kotlin.jvm.internal.k1.h) r8
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.a0$l r2 = (kotlinx.coroutines.flow.a0.l) r2
                kotlin.e1.n(r9)
                goto L60
            L40:
                kotlin.e1.n(r9)
                kotlin.jvm.internal.k1$h<java.lang.Object> r9 = r7.f20062a
                T r2 = r9.element
                kotlinx.coroutines.internal.t0 r5 = kotlinx.coroutines.flow.internal.u.f20143a
                if (r2 != r5) goto L4d
                r2 = r7
                goto L63
            L4d:
                v3.q<T, T, kotlin.coroutines.d<? super T>, java.lang.Object> r5 = r7.f20063b
                r0.L$0 = r7
                r0.L$1 = r9
                r0.label = r4
                java.lang.Object r8 = r5.invoke(r2, r8, r0)
                if (r8 != r1) goto L5c
                return r1
            L5c:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L60:
                r6 = r9
                r9 = r8
                r8 = r6
            L63:
                r9.element = r8
                kotlinx.coroutines.flow.j<T> r8 = r2.f20064c
                kotlin.jvm.internal.k1$h<java.lang.Object> r9 = r2.f20062a
                T r9 = r9.element
                r2 = 0
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L79
                return r1
            L79:
                kotlin.r2 r8 = kotlin.r2.f19517a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.l.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,112:1\n69#2,5:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class m<T> implements kotlinx.coroutines.flow.i<kotlin.collections.p0<? extends T>> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i f20065a;

        public m(kotlinx.coroutines.flow.i iVar) {
            this.f20065a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super kotlin.collections.p0<? extends T>> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            Object collect = this.f20065a.collect(new n(jVar, new k1.f()), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$withIndex$1$1\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,136:1\n32#2,4:137\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$withIndex$1$1\n*L\n71#1:137,4\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class n<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.j<kotlin.collections.p0<? extends T>> f20066a;

        /* renamed from: b */
        final /* synthetic */ k1.f f20067b;

        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {71}, m = "emit", n = {}, s = {})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ n<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(n<? super T> nVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.this$0 = nVar;
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
        n(kotlinx.coroutines.flow.j<? super kotlin.collections.p0<? extends T>> jVar, k1.f fVar) {
            this.f20066a = jVar;
            this.f20067b = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
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
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.a0.n.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.a0$n$a r0 = (kotlinx.coroutines.flow.a0.n.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.a0$n$a r0 = new kotlinx.coroutines.flow.a0$n$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e1.n(r9)
                goto L4e
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                kotlin.e1.n(r9)
                kotlinx.coroutines.flow.j<kotlin.collections.p0<? extends T>> r9 = r7.f20066a
                kotlin.collections.p0 r2 = new kotlin.collections.p0
                kotlin.jvm.internal.k1$f r4 = r7.f20067b
                int r5 = r4.element
                int r6 = r5 + 1
                r4.element = r6
                if (r5 < 0) goto L51
                r2.<init>(r5, r8)
                r0.label = r3
                java.lang.Object r8 = r9.emit(r2, r0)
                if (r8 != r1) goto L4e
                return r1
            L4e:
                kotlin.r2 r8 = kotlin.r2.f19517a
                return r8
            L51:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "Index overflow has happened"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.n.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> a(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return new a(iVar, pVar);
    }

    public static final /* synthetic */ <R> kotlinx.coroutines.flow.i<R> b(kotlinx.coroutines.flow.i<?> iVar) {
        kotlin.jvm.internal.l0.w();
        return new b(iVar);
    }

    @p4.l
    public static final <R> kotlinx.coroutines.flow.i<R> c(@p4.l kotlinx.coroutines.flow.i<?> iVar, @p4.l kotlin.reflect.d<R> dVar) {
        return new c(iVar, dVar);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> d(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return new d(iVar, pVar);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> e(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar) {
        return new e(iVar);
    }

    @p4.l
    public static final <T, R> kotlinx.coroutines.flow.i<R> f(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return new f(iVar, pVar);
    }

    @p4.l
    public static final <T, R> kotlinx.coroutines.flow.i<R> g(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return new g(iVar, pVar);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> h(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return new h(iVar, pVar);
    }

    @p4.l
    public static final <T, R> kotlinx.coroutines.flow.i<R> i(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar, R r5, @kotlin.b @p4.l v3.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new i(r5, iVar, qVar);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<T> j(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar, @p4.l v3.q<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar) {
        return new k(iVar, qVar);
    }

    @p4.l
    public static final <T, R> kotlinx.coroutines.flow.i<R> k(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar, R r5, @kotlin.b @p4.l v3.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return kotlinx.coroutines.flow.k.z1(iVar, r5, qVar);
    }

    @p4.l
    public static final <T> kotlinx.coroutines.flow.i<kotlin.collections.p0<T>> l(@p4.l kotlinx.coroutines.flow.i<? extends T> iVar) {
        return new m(iVar);
    }
}
