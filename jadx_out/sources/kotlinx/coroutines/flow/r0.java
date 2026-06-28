package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.e1;
import kotlin.jvm.internal.k1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/r0;", "Lkotlinx/coroutines/flow/o0;", "Lkotlinx/coroutines/flow/t0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/m0;", bi.ay, "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class r0 implements o0 {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/flow/m0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<j<? super m0>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ t0<Integer> $subscriptionCount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "Lkotlin/r2;", bi.ay, "(ILkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.flow.r0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0601a<T> implements j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k1.a f20198a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j<m0> f20199b;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {158}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.r0$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0602a extends kotlin.coroutines.jvm.internal.d {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C0601a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0602a(C0601a<? super T> c0601a, kotlin.coroutines.d<? super C0602a> dVar) {
                    super(dVar);
                    this.this$0 = c0601a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0601a(k1.a aVar, j<? super m0> jVar) {
                this.f20198a = aVar;
                this.f20199b = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @p4.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(int r5, @p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.r0.a.C0601a.C0602a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.r0$a$a$a r0 = (kotlinx.coroutines.flow.r0.a.C0601a.C0602a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.r0$a$a$a r0 = new kotlinx.coroutines.flow.r0$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.e1.n(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.e1.n(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.k1$a r5 = r4.f20198a
                    boolean r6 = r5.element
                    if (r6 != 0) goto L4e
                    r5.element = r3
                    kotlinx.coroutines.flow.j<kotlinx.coroutines.flow.m0> r5 = r4.f20199b
                    kotlinx.coroutines.flow.m0 r6 = kotlinx.coroutines.flow.m0.START
                    r0.label = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.r2 r5 = kotlin.r2.f19517a
                    return r5
                L4e:
                    kotlin.r2 r5 = kotlin.r2.f19517a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r0.a.C0601a.a(int, kotlin.coroutines.d):java.lang.Object");
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0<Integer> t0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$subscriptionCount = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.$subscriptionCount, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l j<? super m0> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e1.n(obj);
            } else {
                e1.n(obj);
                j jVar = (j) this.L$0;
                k1.a aVar = new k1.a();
                t0<Integer> t0Var = this.$subscriptionCount;
                C0601a c0601a = new C0601a(aVar, jVar);
                this.label = 1;
                if (t0Var.collect(c0601a, this) == l5) {
                    return l5;
                }
            }
            throw new kotlin.y();
        }
    }

    @Override // kotlinx.coroutines.flow.o0
    @p4.l
    public i<m0> a(@p4.l t0<Integer> t0Var) {
        return k.J0(new a(t0Var, null));
    }

    @p4.l
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
