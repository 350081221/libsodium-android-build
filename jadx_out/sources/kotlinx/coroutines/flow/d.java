package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/flow/d;", "T", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/i;", bi.ay, "Lkotlinx/coroutines/flow/i;", "flow", "<init>", "(Lkotlinx/coroutines/flow/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class d<T> implements c<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final i<T> f20084a;

    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,285:1\n329#2:286\n*S KotlinDebug\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n*L\n274#1:286\n*E\n"})
    /* loaded from: classes4.dex */
    static final class a<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j<T> f20085a;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {275}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0583a extends kotlin.coroutines.jvm.internal.d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0583a(a<? super T> aVar, kotlin.coroutines.d<? super C0583a> dVar) {
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
        a(j<? super T> jVar) {
            this.f20085a = jVar;
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.d.a.C0583a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.d$a$a r0 = (kotlinx.coroutines.flow.d.a.C0583a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.d$a$a r0 = new kotlinx.coroutines.flow.d$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e1.n(r6)
                goto L46
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.e1.n(r6)
                kotlin.coroutines.g r6 = r0.getContext()
                kotlinx.coroutines.p2.z(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f20085a
                r0.label = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                kotlin.r2 r5 = kotlin.r2.f19517a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@p4.l i<? extends T> iVar) {
        this.f20084a = iVar;
    }

    @Override // kotlinx.coroutines.flow.i
    @p4.m
    public Object collect(@p4.l j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object collect = this.f20084a.collect(new a(jVar), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return collect == l5 ? collect : r2.f19517a;
    }
}
