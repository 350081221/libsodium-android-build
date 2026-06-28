package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0004\u001a\u00020\u0003H¦Bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00028\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u0007\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/n;", "E", "", "", "c", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", bi.ay, "next", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface n<E> {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {589}, m = "next", n = {"$this"}, s = {"L$0"})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.channels.n$a$a */
        /* loaded from: classes4.dex */
        public static final class C0570a<E> extends kotlin.coroutines.jvm.internal.d {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            C0570a(kotlin.coroutines.d<? super C0570a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return a.a(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @u3.h(name = "next")
        @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object a(kotlinx.coroutines.channels.n r4, kotlin.coroutines.d r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.n.a.C0570a
                if (r0 == 0) goto L13
                r0 = r5
                kotlinx.coroutines.channels.n$a$a r0 = (kotlinx.coroutines.channels.n.a.C0570a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.channels.n$a$a r0 = new kotlinx.coroutines.channels.n$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.L$0
                kotlinx.coroutines.channels.n r4 = (kotlinx.coroutines.channels.n) r4
                kotlin.e1.n(r5)
                goto L43
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                kotlin.e1.n(r5)
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r5 = r4.c(r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L50
                java.lang.Object r4 = r4.next()
                return r4
            L50:
                kotlinx.coroutines.channels.w r4 = new kotlinx.coroutines.channels.w
                java.lang.String r5 = "Channel was closed"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.n.a.a(kotlinx.coroutines.channels.n, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @u3.h(name = "next")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    /* synthetic */ Object a(kotlin.coroutines.d dVar);

    @p4.m
    Object c(@p4.l kotlin.coroutines.d<? super Boolean> dVar);

    E next();
}
