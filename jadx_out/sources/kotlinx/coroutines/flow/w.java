package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import com.umeng.analytics.pro.bi;
import kotlin.e1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.b2;

@kotlin.i0(d1 = {"\u0000R\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ag\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000227\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aq\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\r\u001a\u00020\f27\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002H\u0007\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0011\u001a9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0014\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0013\"\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0007\u001at\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0001\u0010\t\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0018¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aj\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000229\b\u0005\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u000b\u001ac\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000223\b\u0001\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000b\" \u0010%\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\"\u001a\u0010'\u001a\u00020&8\u0006X\u0087T¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/i;", "Lkotlin/Function2;", "Lkotlin/v0;", "name", t0.b.f22420d, "Lkotlin/coroutines/d;", "", "transform", bi.ay, "(Lkotlinx/coroutines/flow/i;Lv3/p;)Lkotlinx/coroutines/flow/i;", "", "concurrency", "c", "(Lkotlinx/coroutines/flow/i;ILv3/p;)Lkotlinx/coroutines/flow/i;", "e", "", "l", "", "flows", "m", "([Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "f", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "Lkotlin/u;", "n", "(Lkotlinx/coroutines/flow/i;Lv3/q;)Lkotlinx/coroutines/flow/i;", "b", "k", "I", bi.aJ, "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "Ljava/lang/String;", "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n53#2:219\n55#2:223\n53#2:224\n55#2:228\n50#3:220\n55#3:222\n50#3:225\n55#3:227\n106#4:221\n106#4:226\n106#4:229\n1#5:230\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n47#1:219\n47#1:223\n74#1:224\n74#1:228\n47#1:220\n47#1:222\n74#1:225\n74#1:227\n47#1:221\n74#1:226\n82#1:229\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class w {

    /* renamed from: a */
    private static final int f20250a = kotlinx.coroutines.internal.w0.b(k.f20164a, 16, 1, Integer.MAX_VALUE);

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/a0$f"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<R> implements i<i<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ i f20251a;

        /* renamed from: b */
        final /* synthetic */ v3.p f20252b;

        @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n54#2:223\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.w$a$a */
        /* loaded from: classes4.dex */
        public static final class C0606a<T> implements j {

            /* renamed from: a */
            final /* synthetic */ j f20253a;

            /* renamed from: b */
            final /* synthetic */ v3.p f20254b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {Opcodes.XOR_INT_LIT8, Opcodes.XOR_INT_LIT8}, m = "emit", n = {}, s = {})
            @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.w$a$a$a */
            /* loaded from: classes4.dex */
            public static final class C0607a extends kotlin.coroutines.jvm.internal.d {
                Object L$0;
                int label;
                /* synthetic */ Object result;

                public C0607a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return C0606a.this.emit(null, this);
                }
            }

            public C0606a(j jVar, v3.p pVar) {
                this.f20253a = jVar;
                this.f20254b = pVar;
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
            public final java.lang.Object emit(java.lang.Object r7, @p4.l kotlin.coroutines.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.w.a.C0606a.C0607a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.w$a$a$a r0 = (kotlinx.coroutines.flow.w.a.C0606a.C0607a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.w$a$a$a r0 = new kotlinx.coroutines.flow.w$a$a$a
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
                    kotlinx.coroutines.flow.j r8 = r6.f20253a
                    v3.p r2 = r6.f20254b
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
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.a.C0606a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(i iVar, v3.p pVar) {
            this.f20251a = iVar;
            this.f20252b = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l j jVar, @p4.l kotlin.coroutines.d dVar) {
            Object l5;
            Object collect = this.f20251a.collect(new C0606a(jVar, this.f20252b), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {193, 193}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n*L\n1#1,218:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b<R, T> extends kotlin.coroutines.jvm.internal.o implements v3.q<j<? super R>, T, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.p<T, kotlin.coroutines.d<? super i<? extends R>>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(v3.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.$transform = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v3.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, kotlin.coroutines.d<? super r2> dVar) {
            return invoke((j) obj, (j<? super R>) obj2, dVar);
        }

        @p4.m
        public final Object invoke(@p4.l j<? super R> jVar, T t5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            b bVar = new b(this.$transform, dVar);
            bVar.L$0 = jVar;
            bVar.L$1 = t5;
            return bVar.invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            j jVar;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        e1.n(obj);
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (j) this.L$0;
                e1.n(obj);
            } else {
                e1.n(obj);
                jVar = (j) this.L$0;
                Object obj2 = this.L$1;
                v3.p<T, kotlin.coroutines.d<? super i<? extends R>>, Object> pVar = this.$transform;
                this.L$0 = jVar;
                this.label = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == l5) {
                    return l5;
                }
            }
            this.L$0 = null;
            this.label = 2;
            if (k.m0(jVar, (i) obj, this) == l5) {
                return l5;
            }
            return r2.f19517a;
        }

        @p4.m
        public final Object invokeSuspend$$forInline(@p4.l Object obj) {
            j jVar = (j) this.L$0;
            i iVar = (i) this.$transform.invoke(this.L$1, this);
            kotlin.jvm.internal.i0.e(0);
            k.m0(jVar, iVar, this);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/a0$f"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class c<R> implements i<i<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ i f20255a;

        /* renamed from: b */
        final /* synthetic */ v3.p f20256b;

        @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n54#2:223\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a<T> implements j {

            /* renamed from: a */
            final /* synthetic */ j f20257a;

            /* renamed from: b */
            final /* synthetic */ v3.p f20258b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {Opcodes.XOR_INT_LIT8, Opcodes.XOR_INT_LIT8}, m = "emit", n = {}, s = {})
            @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.w$c$a$a */
            /* loaded from: classes4.dex */
            public static final class C0608a extends kotlin.coroutines.jvm.internal.d {
                Object L$0;
                int label;
                /* synthetic */ Object result;

                public C0608a(kotlin.coroutines.d dVar) {
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

            public a(j jVar, v3.p pVar) {
                this.f20257a = jVar;
                this.f20258b = pVar;
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
            public final java.lang.Object emit(java.lang.Object r7, @p4.l kotlin.coroutines.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.w.c.a.C0608a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.w$c$a$a r0 = (kotlinx.coroutines.flow.w.c.a.C0608a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.w$c$a$a r0 = new kotlinx.coroutines.flow.w$c$a$a
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
                    kotlinx.coroutines.flow.j r8 = r6.f20257a
                    v3.p r2 = r6.f20258b
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
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.c.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public c(i iVar, v3.p pVar) {
            this.f20255a = iVar;
            this.f20256b = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l j jVar, @p4.l kotlin.coroutines.d dVar) {
            Object l5;
            Object collect = this.f20255a.collect(new a(jVar, this.f20256b), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,112:1\n83#2,2:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class d<T> implements i<T> {

        /* renamed from: a */
        final /* synthetic */ i f20259a;

        public d(i iVar) {
            this.f20259a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            Object collect = this.f20259a.collect(new e(jVar), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (collect == l5) {
                return collect;
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", t0.b.f22420d, "Lkotlin/r2;", bi.ay, "(Lkotlinx/coroutines/flow/i;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class e<T> implements j {

        /* renamed from: a */
        final /* synthetic */ j<T> f20260a;

        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {83}, m = "emit", n = {}, s = {})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ e<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(e<? super T> eVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.this$0 = eVar;
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
        e(j<? super T> jVar) {
            this.f20260a = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        @p4.m
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@p4.l kotlinx.coroutines.flow.i<? extends T> r5, @p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.w.e.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.w$e$a r0 = (kotlinx.coroutines.flow.w.e.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.w$e$a r0 = new kotlinx.coroutines.flow.w$e$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e1.n(r6)
                goto L3f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.e1.n(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f20260a
                r0.label = r3
                java.lang.Object r5 = kotlinx.coroutines.flow.k.m0(r6, r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                kotlin.r2 r5 = kotlin.r2.f19517a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.e.emit(kotlinx.coroutines.flow.i, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {Opcodes.RSUB_INT_LIT8, Opcodes.RSUB_INT_LIT8}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class f<R, T> extends kotlin.coroutines.jvm.internal.o implements v3.q<j<? super R>, T, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.p<T, kotlin.coroutines.d<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(v3.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, kotlin.coroutines.d<? super f> dVar) {
            super(3, dVar);
            this.$transform = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v3.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, kotlin.coroutines.d<? super r2> dVar) {
            return invoke((j) obj, (j<? super R>) obj2, dVar);
        }

        @p4.m
        public final Object invoke(@p4.l j<? super R> jVar, T t5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            f fVar = new f(this.$transform, dVar);
            fVar.L$0 = jVar;
            fVar.L$1 = t5;
            return fVar.invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            j jVar;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        e1.n(obj);
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j jVar2 = (j) this.L$0;
                e1.n(obj);
                jVar = jVar2;
            } else {
                e1.n(obj);
                j jVar3 = (j) this.L$0;
                Object obj2 = this.L$1;
                v3.p<T, kotlin.coroutines.d<? super R>, Object> pVar = this.$transform;
                this.L$0 = jVar3;
                this.label = 1;
                obj = pVar.invoke(obj2, this);
                jVar = jVar3;
                if (obj == l5) {
                    return l5;
                }
            }
            this.L$0 = null;
            this.label = 2;
            if (jVar.emit(obj, this) == l5) {
                return l5;
            }
            return r2.f19517a;
        }
    }

    @p4.l
    @a2
    public static final <T, R> i<R> a(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return k.G0(new a(iVar, pVar));
    }

    @p4.l
    @a2
    public static final <T, R> i<R> b(@p4.l i<? extends T> iVar, @kotlin.b @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return k.d2(iVar, new b(pVar, null));
    }

    @p4.l
    @a2
    public static final <T, R> i<R> c(@p4.l i<? extends T> iVar, int i5, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return k.H0(new c(iVar, pVar), i5);
    }

    public static /* synthetic */ i d(i iVar, int i5, v3.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = f20250a;
        }
        return k.D0(iVar, i5, pVar);
    }

    @p4.l
    @a2
    public static final <T> i<T> e(@p4.l i<? extends i<? extends T>> iVar) {
        return new d(iVar);
    }

    @p4.l
    @a2
    public static final <T> i<T> f(@p4.l i<? extends i<? extends T>> iVar, int i5) {
        boolean z4;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i5 == 1) {
                return k.G0(iVar);
            }
            return new kotlinx.coroutines.flow.internal.g(iVar, i5, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i5).toString());
    }

    public static /* synthetic */ i g(i iVar, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = f20250a;
        }
        return k.H0(iVar, i5);
    }

    public static final int h() {
        return f20250a;
    }

    @b2
    public static /* synthetic */ void i() {
    }

    @b2
    public static /* synthetic */ void j() {
    }

    @p4.l
    @a2
    public static final <T, R> i<R> k(@p4.l i<? extends T> iVar, @kotlin.b @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return k.d2(iVar, new f(pVar, null));
    }

    @p4.l
    public static final <T> i<T> l(@p4.l Iterable<? extends i<? extends T>> iterable) {
        return new kotlinx.coroutines.flow.internal.k(iterable, null, 0, null, 14, null);
    }

    @p4.l
    public static final <T> i<T> m(@p4.l i<? extends T>... iVarArr) {
        Iterable B5;
        B5 = kotlin.collections.p.B5(iVarArr);
        return k.Z0(B5);
    }

    @p4.l
    @a2
    public static final <T, R> i<R> n(@p4.l i<? extends T> iVar, @kotlin.b @p4.l v3.q<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        return new kotlinx.coroutines.flow.internal.j(qVar, iVar, null, 0, null, 28, null);
    }
}
