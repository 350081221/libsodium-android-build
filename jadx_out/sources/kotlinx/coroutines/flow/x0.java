package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.apache.http.HttpStatus;

@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\u0002\b\u000eø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR>\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\u0002\b\u000e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/x0;", "T", "Lkotlinx/coroutines/flow/j;", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", bi.ay, "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "b", "Lv3/p;", "action", "<init>", "(Lkotlinx/coroutines/flow/j;Lv3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,426:1\n329#2:427\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n417#1:427\n*E\n"})
/* loaded from: classes4.dex */
public final class x0<T> implements j<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final j<T> f20262a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final v3.p<j<? super T>, kotlin.coroutines.d<? super r2>, Object> f20263b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 423}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ x0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x0<T> x0Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.this$0 = x0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x0(@p4.l j<? super T> jVar, @p4.l v3.p<? super j<? super T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        this.f20262a = jVar;
        this.f20263b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.v] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@p4.l kotlin.coroutines.d<? super kotlin.r2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.x0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.x0$a r0 = (kotlinx.coroutines.flow.x0.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.x0$a r0 = new kotlinx.coroutines.flow.x0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e1.n(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.internal.v r2 = (kotlinx.coroutines.flow.internal.v) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.x0 r4 = (kotlinx.coroutines.flow.x0) r4
            kotlin.e1.n(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            kotlin.e1.n(r7)
            kotlinx.coroutines.flow.internal.v r2 = new kotlinx.coroutines.flow.internal.v
            kotlinx.coroutines.flow.j<T> r7 = r6.f20262a
            kotlin.coroutines.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            v3.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super kotlin.r2>, java.lang.Object> r7 = r6.f20263b     // Catch: java.lang.Throwable -> L7d
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L7d
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L7d
            r0.label = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.j<T> r7 = r4.f20262a
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.x0
            if (r2 == 0) goto L7a
            kotlinx.coroutines.flow.x0 r7 = (kotlinx.coroutines.flow.x0) r7
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            kotlin.r2 r7 = kotlin.r2.f19517a
            return r7
        L7a:
            kotlin.r2 r7 = kotlin.r2.f19517a
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x0.a(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.j
    @p4.m
    public Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return this.f20262a.emit(t5, dVar);
    }
}
