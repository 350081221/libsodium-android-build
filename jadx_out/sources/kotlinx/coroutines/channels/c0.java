package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import kotlin.d1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;

@kotlin.i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001ag\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a \u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aª\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lkotlinx/coroutines/channels/e0;", "Lkotlin/Function0;", "Lkotlin/r2;", "block", bi.ay, "(Lkotlinx/coroutines/channels/e0;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "E", "Lkotlinx/coroutines/s0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "capacity", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "Lkotlinx/coroutines/channels/g0;", "e", "(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;ILv3/p;)Lkotlinx/coroutines/channels/g0;", "Lkotlinx/coroutines/u0;", "start", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "c", "(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;ILkotlinx/coroutines/u0;Lv3/l;Lv3/p;)Lkotlinx/coroutines/channels/g0;", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "d", "(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/i;Lkotlinx/coroutines/u0;Lv3/l;Lv3/p;)Lkotlinx/coroutines/channels/g0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nProduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,151:1\n1#2:152\n314#3,11:153\n*S KotlinDebug\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n*L\n48#1:153,11\n*E\n"})
/* loaded from: classes4.dex */
public final class c0 {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {153}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
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
            return c0.a(null, null, this);
        }
    }

    @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class b extends n0 implements v3.a<r2> {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class c extends n0 implements v3.l<Throwable, r2> {
        final /* synthetic */ kotlinx.coroutines.p<r2> $cont;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(kotlinx.coroutines.p<? super r2> pVar) {
            super(1);
            this.$cont = pVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
            invoke2(th);
            return r2.f19517a;
        }

        /* renamed from: invoke */
        public final void invoke2(@p4.m Throwable th) {
            kotlinx.coroutines.p<r2> pVar = this.$cont;
            d1.a aVar = d1.Companion;
            pVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@p4.l kotlinx.coroutines.channels.e0<?> r4, @p4.l v3.a<kotlin.r2> r5, @p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.c0.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.c0$a r0 = (kotlinx.coroutines.channels.c0.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.c0$a r0 = new kotlinx.coroutines.channels.c0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.L$1
            r5 = r4
            v3.a r5 = (v3.a) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.e0 r4 = (kotlinx.coroutines.channels.e0) r4
            kotlin.e1.n(r6)     // Catch: java.lang.Throwable -> L32
            goto L7a
        L32:
            r4 = move-exception
            goto L80
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.e1.n(r6)
            kotlin.coroutines.g r6 = r0.getContext()
            kotlinx.coroutines.l2$b r2 = kotlinx.coroutines.l2.U
            kotlin.coroutines.g$b r6 = r6.get(r2)
            if (r6 != r4) goto L4d
            r6 = r3
            goto L4e
        L4d:
            r6 = 0
        L4e:
            if (r6 == 0) goto L84
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L32
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L32
            r0.label = r3     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.q r6 = new kotlinx.coroutines.q     // Catch: java.lang.Throwable -> L32
            kotlin.coroutines.d r2 = kotlin.coroutines.intrinsics.b.e(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.B()     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.channels.c0$c r2 = new kotlinx.coroutines.channels.c0$c     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.I(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.E()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = kotlin.coroutines.intrinsics.b.l()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L77
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L77:
            if (r4 != r1) goto L7a
            return r1
        L7a:
            r5.invoke()
            kotlin.r2 r4 = kotlin.r2.f19517a
            return r4
        L80:
            r5.invoke()
            throw r4
        L84:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.c0.a(kotlinx.coroutines.channels.e0, v3.a, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(e0 e0Var, v3.a aVar, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = b.INSTANCE;
        }
        return a(e0Var, aVar, dVar);
    }

    @p4.l
    @g2
    public static final <E> g0<E> c(@p4.l s0 s0Var, @p4.l kotlin.coroutines.g gVar, int i5, @p4.l u0 u0Var, @p4.m v3.l<? super Throwable, r2> lVar, @kotlin.b @p4.l v3.p<? super e0<? super E>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return d(s0Var, gVar, i5, i.SUSPEND, u0Var, lVar, pVar);
    }

    @p4.l
    public static final <E> g0<E> d(@p4.l s0 s0Var, @p4.l kotlin.coroutines.g gVar, int i5, @p4.l i iVar, @p4.l u0 u0Var, @p4.m v3.l<? super Throwable, r2> lVar, @kotlin.b @p4.l v3.p<? super e0<? super E>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        d0 d0Var = new d0(m0.e(s0Var, gVar), o.d(i5, iVar, null, 4, null));
        if (lVar != null) {
            d0Var.t0(lVar);
        }
        d0Var.w1(u0Var, d0Var, pVar);
        return d0Var;
    }

    @p4.l
    @a2
    public static final <E> g0<E> e(@p4.l s0 s0Var, @p4.l kotlin.coroutines.g gVar, int i5, @kotlin.b @p4.l v3.p<? super e0<? super E>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        return d(s0Var, gVar, i5, i.SUSPEND, u0.DEFAULT, null, pVar);
    }

    public static /* synthetic */ g0 f(s0 s0Var, kotlin.coroutines.g gVar, int i5, u0 u0Var, v3.l lVar, v3.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            gVar = kotlin.coroutines.i.INSTANCE;
        }
        kotlin.coroutines.g gVar2 = gVar;
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        int i7 = i5;
        if ((i6 & 4) != 0) {
            u0Var = u0.DEFAULT;
        }
        u0 u0Var2 = u0Var;
        if ((i6 & 8) != 0) {
            lVar = null;
        }
        return c(s0Var, gVar2, i7, u0Var2, lVar, pVar);
    }

    public static /* synthetic */ g0 g(s0 s0Var, kotlin.coroutines.g gVar, int i5, i iVar, u0 u0Var, v3.l lVar, v3.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            gVar = kotlin.coroutines.i.INSTANCE;
        }
        kotlin.coroutines.g gVar2 = gVar;
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        int i7 = i5;
        if ((i6 & 4) != 0) {
            iVar = i.SUSPEND;
        }
        i iVar2 = iVar;
        if ((i6 & 8) != 0) {
            u0Var = u0.DEFAULT;
        }
        u0 u0Var2 = u0Var;
        if ((i6 & 16) != 0) {
            lVar = null;
        }
        return d(s0Var, gVar2, i7, iVar2, u0Var2, lVar, pVar);
    }

    public static /* synthetic */ g0 h(s0 s0Var, kotlin.coroutines.g gVar, int i5, v3.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            gVar = kotlin.coroutines.i.INSTANCE;
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return e(s0Var, gVar, i5, pVar);
    }
}
