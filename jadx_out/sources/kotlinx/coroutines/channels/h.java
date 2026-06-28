package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.t2;
import kotlinx.coroutines.u0;

@kotlin.i0(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u001a \u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042-\b\u0002\u0010\u0012\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112/\b\u0001\u0010\u0018\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"E", "Lkotlinx/coroutines/channels/g0;", "", "capacity", "Lkotlinx/coroutines/u0;", "start", "Lkotlinx/coroutines/channels/d;", "b", "Lkotlinx/coroutines/s0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "cause", "Lkotlin/r2;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", bi.ay, "(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;ILkotlinx/coroutines/u0;Lv3/l;Lv3/p;)Lkotlinx/coroutines/channels/d;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,202:1\n48#2,4:203\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n51#1:203,4\n*E\n"})
/* loaded from: classes4.dex */
public final class h {

    @kotlin.i0(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/p0$a", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/o0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "exception", "Lkotlin/r2;", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n1#1,110:1\n51#2:111\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.a implements o0 {
        public a(o0.b bVar) {
            super(bVar);
        }

        @Override // kotlinx.coroutines.o0
        public void handleException(@p4.l kotlin.coroutines.g gVar, @p4.l Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b extends n0 implements v3.l<Throwable, r2> {
        final /* synthetic */ g0<E> $this_broadcast;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(g0<? extends E> g0Var) {
            super(1);
            this.$this_broadcast = g0Var;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
            invoke2(th);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m Throwable th) {
            s.b(this.$this_broadcast, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [E] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {56, 57}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class c<E> extends kotlin.coroutines.jvm.internal.o implements v3.p<e0<? super E>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ g0<E> $channel;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(g0<? extends E> g0Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.$channel = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.$channel, dVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l e0<? super E> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((c) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004a A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0068 -> B:7:0x003e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.L$1
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r4 = r7.L$0
                kotlinx.coroutines.channels.e0 r4 = (kotlinx.coroutines.channels.e0) r4
                kotlin.e1.n(r8)
                r8 = r4
                goto L3d
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.L$1
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r4 = r7.L$0
                kotlinx.coroutines.channels.e0 r4 = (kotlinx.coroutines.channels.e0) r4
                kotlin.e1.n(r8)
                r5 = r7
                goto L4f
            L30:
                kotlin.e1.n(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.channels.e0 r8 = (kotlinx.coroutines.channels.e0) r8
                kotlinx.coroutines.channels.g0<E> r1 = r7.$channel
                kotlinx.coroutines.channels.n r1 = r1.iterator()
            L3d:
                r4 = r7
            L3e:
                r4.L$0 = r8
                r4.L$1 = r1
                r4.label = r3
                java.lang.Object r5 = r1.c(r4)
                if (r5 != r0) goto L4b
                return r0
            L4b:
                r6 = r4
                r4 = r8
                r8 = r5
                r5 = r6
            L4f:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L6b
                java.lang.Object r8 = r1.next()
                r5.L$0 = r4
                r5.L$1 = r1
                r5.label = r2
                java.lang.Object r8 = r4.F(r8, r5)
                if (r8 != r0) goto L68
                return r0
            L68:
                r8 = r4
                r4 = r5
                goto L3e
            L6b:
                kotlin.r2 r8 = kotlin.r2.f19517a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @p4.l
    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @c3
    public static final <E> d<E> a(@p4.l s0 s0Var, @p4.l kotlin.coroutines.g gVar, int i5, @p4.l u0 u0Var, @p4.m v3.l<? super Throwable, r2> lVar, @kotlin.b @p4.l v3.p<? super e0<? super E>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        g gVar2;
        kotlin.coroutines.g e5 = m0.e(s0Var, gVar);
        d a5 = f.a(i5);
        if (u0Var.isLazy()) {
            gVar2 = new b0(e5, a5, pVar);
        } else {
            gVar2 = new g(e5, a5, true);
        }
        if (lVar != null) {
            ((t2) gVar2).t0(lVar);
        }
        ((kotlinx.coroutines.a) gVar2).w1(u0Var, gVar2, pVar);
        return (d<E>) gVar2;
    }

    @p4.l
    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @c3
    public static final <E> d<E> b(@p4.l g0<? extends E> g0Var, int i5, @p4.l u0 u0Var) {
        return c(t0.m(t0.m(c2.f19867a, k1.g()), new a(o0.T)), null, i5, u0Var, new b(g0Var), new c(g0Var, null), 1, null);
    }

    public static /* synthetic */ d c(s0 s0Var, kotlin.coroutines.g gVar, int i5, u0 u0Var, v3.l lVar, v3.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            gVar = kotlin.coroutines.i.INSTANCE;
        }
        kotlin.coroutines.g gVar2 = gVar;
        if ((i6 & 2) != 0) {
            i5 = 1;
        }
        int i7 = i5;
        if ((i6 & 4) != 0) {
            u0Var = u0.LAZY;
        }
        u0 u0Var2 = u0Var;
        if ((i6 & 8) != 0) {
            lVar = null;
        }
        return a(s0Var, gVar2, i7, u0Var2, lVar, pVar);
    }

    public static /* synthetic */ d d(g0 g0Var, int i5, u0 u0Var, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 1;
        }
        if ((i6 & 2) != 0) {
            u0Var = u0.LAZY;
        }
        return b(g0Var, i5, u0Var);
    }
}
