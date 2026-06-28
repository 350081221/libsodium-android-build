package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR>\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/flow/y0;", "T", "Lkotlinx/coroutines/flow/i0;", "Lkotlinx/coroutines/flow/j;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", bi.ay, "Lkotlinx/coroutines/flow/i0;", "sharedFlow", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "b", "Lv3/p;", "action", "", "d", "()Ljava/util/List;", "replayCache", "<init>", "(Lkotlinx/coroutines/flow/i0;Lv3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class y0<T> implements i0<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final i0<T> f20278a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final v3.p<j<? super T>, kotlin.coroutines.d<? super r2>, Object> f20279b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {409}, m = "collect", n = {}, s = {})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ y0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0<T> y0Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.this$0 = y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y0(@p4.l i0<? extends T> i0Var, @p4.l v3.p<? super j<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        this.f20278a = i0Var;
        this.f20279b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.i0, kotlinx.coroutines.flow.i
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(@p4.l kotlinx.coroutines.flow.j<? super T> r6, @p4.l kotlin.coroutines.d<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.y0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.y0$a r0 = (kotlinx.coroutines.flow.y0.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.y0$a r0 = new kotlinx.coroutines.flow.y0$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.e1.n(r7)
            goto L46
        L31:
            kotlin.e1.n(r7)
            kotlinx.coroutines.flow.i0<T> r7 = r5.f20278a
            kotlinx.coroutines.flow.x0 r2 = new kotlinx.coroutines.flow.x0
            v3.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super kotlin.r2>, java.lang.Object> r4 = r5.f20279b
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.y r6 = new kotlin.y
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y0.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.i0
    @p4.l
    public List<T> d() {
        return this.f20278a.d();
    }
}
