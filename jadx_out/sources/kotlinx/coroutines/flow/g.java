package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.k1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002Bg\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012:\u0010\u0018\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eRH\u0010\u0018\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/flow/g;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", bi.ay, "Lkotlinx/coroutines/flow/i;", "upstream", "Lkotlin/Function1;", "", "b", "Lv3/l;", "keySelector", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "old", "new", "", "c", "Lv3/p;", "areEquivalent", "<init>", "(Lkotlinx/coroutines/flow/i;Lv3/l;Lv3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class g<T> implements i<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final i<T> f20092a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    @u3.e
    public final v3.l<T, Object> f20093b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    @u3.e
    public final v3.p<Object, Object, Boolean> f20094c;

    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class a<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g<T> f20095a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<Object> f20096b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<T> f20097c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {77}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0584a extends kotlin.coroutines.jvm.internal.d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0584a(a<? super T> aVar, kotlin.coroutines.d<? super C0584a> dVar) {
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
        a(g<T> gVar, k1.h<Object> hVar, j<? super T> jVar) {
            this.f20095a = gVar;
            this.f20096b = hVar;
            this.f20097c = jVar;
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
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.g.a.C0584a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.g$a$a r0 = (kotlinx.coroutines.flow.g.a.C0584a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.g$a$a r0 = new kotlinx.coroutines.flow.g$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e1.n(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.e1.n(r7)
                kotlinx.coroutines.flow.g<T> r7 = r5.f20095a
                v3.l<T, java.lang.Object> r7 = r7.f20093b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.k1$h<java.lang.Object> r2 = r5.f20096b
                T r2 = r2.element
                kotlinx.coroutines.internal.t0 r4 = kotlinx.coroutines.flow.internal.u.f20143a
                if (r2 == r4) goto L58
                kotlinx.coroutines.flow.g<T> r4 = r5.f20095a
                v3.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f20094c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                kotlin.r2 r6 = kotlin.r2.f19517a
                return r6
            L58:
                kotlin.jvm.internal.k1$h<java.lang.Object> r2 = r5.f20096b
                r2.element = r7
                kotlinx.coroutines.flow.j<T> r7 = r5.f20097c
                r0.label = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                kotlin.r2 r6 = kotlin.r2.f19517a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@p4.l i<? extends T> iVar, @p4.l v3.l<? super T, ? extends Object> lVar, @p4.l v3.p<Object, Object, Boolean> pVar) {
        this.f20092a = iVar;
        this.f20093b = lVar;
        this.f20094c = pVar;
    }

    @Override // kotlinx.coroutines.flow.i
    @p4.m
    public Object collect(@p4.l j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        k1.h hVar = new k1.h();
        hVar.element = (T) kotlinx.coroutines.flow.internal.u.f20143a;
        Object collect = this.f20092a.collect(new a(this, hVar, jVar), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (collect == l5) {
            return collect;
        }
        return r2.f19517a;
    }
}
