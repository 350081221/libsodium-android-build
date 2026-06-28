package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;
import kotlin.a1;
import kotlin.b1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.w1;

@kotlin.i0(d1 = {"\u0000H\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aE\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007\u001aR\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0012\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000b\u001a7\u0010\u0016\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001a\u0010\u001a\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0001\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/d;", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/g0;", "Lkotlin/u;", "block", "b", "(Lkotlinx/coroutines/channels/d;Lv3/l;)Ljava/lang/Object;", "", "i", "(Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/g;", bi.aJ, "c", "(Lkotlinx/coroutines/channels/g0;Lv3/l;)Ljava/lang/Object;", "Lkotlin/r2;", "action", "e", "(Lkotlinx/coroutines/channels/g0;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "j", "d", "(Lkotlinx/coroutines/channels/d;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "cause", bi.ay, "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
@r1({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,141:1\n82#1,11:142\n105#1:153\n82#1,6:154\n106#1,2:160\n92#1:162\n88#1,3:163\n33#1,5:166\n*S KotlinDebug\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n105#1:142,11\n116#1:153\n116#1:154,6\n116#1:160,2\n116#1:162\n116#1:163,3\n129#1:166,5\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class u {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {106}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
    @r1({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$consumeEach$1\n*L\n1#1,141:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return u.e(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {130}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
    @r1({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$consumeEach$3\n*L\n1#1,141:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return u.d(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {149}, m = "toList", n = {"$this$toList_u24lambda_u243", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return s.g0(null, this);
        }
    }

    @a1
    public static final void a(@p4.l g0<?> g0Var, @p4.m Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = w1.a("Channel was consumed, consumer had failed", th);
            }
        }
        g0Var.cancel(cancellationException);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @c3
    public static final <E, R> R b(@p4.l d<E> dVar, @p4.l v3.l<? super g0<? extends E>, ? extends R> lVar) {
        g0<E> n5 = dVar.n();
        try {
            return lVar.invoke(n5);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            g0.a.b(n5, null, 1, null);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static final <E, R> R c(@p4.l g0<? extends E> g0Var, @p4.l v3.l<? super g0<? extends E>, ? extends R> lVar) {
        try {
            R invoke = lVar.invoke(g0Var);
            kotlin.jvm.internal.i0.d(1);
            s.b(g0Var, null);
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:15:0x0066, B:17:0x006e, B:29:0x0079), top: B:14:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:15:0x0066, B:17:0x006e, B:29:0x0079), top: B:14:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0062 -> B:13:0x0038). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object d(@p4.l kotlinx.coroutines.channels.d<E> r6, @p4.l v3.l<? super E, kotlin.r2> r7, @p4.l kotlin.coroutines.d<? super kotlin.r2> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.u.b
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.u$b r0 = (kotlinx.coroutines.channels.u.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$b r0 = new kotlinx.coroutines.channels.u$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 != r4) goto L3d
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r2 = r0.L$0
            v3.l r2 = (v3.l) r2
            kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L3b
            r5 = r0
            r0 = r7
            r7 = r2
        L38:
            r2 = r1
            r1 = r5
            goto L66
        L3b:
            r6 = move-exception
            goto L8f
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            kotlin.e1.n(r8)
            kotlinx.coroutines.channels.g0 r6 = r6.n()
            kotlinx.coroutines.channels.n r8 = r6.iterator()     // Catch: java.lang.Throwable -> L8b
            r5 = r8
            r8 = r6
            r6 = r5
        L53:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L88
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L88
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L88
            r0.label = r4     // Catch: java.lang.Throwable -> L88
            java.lang.Object r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L88
            if (r2 != r1) goto L62
            return r1
        L62:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L38
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L85
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L79
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L85
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L85
            r8 = r0
            r0 = r1
            r1 = r2
            goto L53
        L79:
            kotlin.r2 r6 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L85
            kotlin.jvm.internal.i0.d(r4)
            kotlinx.coroutines.channels.g0.a.b(r0, r3, r4, r3)
            kotlin.jvm.internal.i0.c(r4)
            return r6
        L85:
            r6 = move-exception
            r7 = r0
            goto L8f
        L88:
            r6 = move-exception
            r7 = r8
            goto L8f
        L8b:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L8f:
            kotlin.jvm.internal.i0.d(r4)
            kotlinx.coroutines.channels.g0.a.b(r7, r3, r4, r3)
            kotlin.jvm.internal.i0.c(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.d(kotlinx.coroutines.channels.d, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object e(@p4.l kotlinx.coroutines.channels.g0<? extends E> r5, @p4.l v3.l<? super E, kotlin.r2> r6, @p4.l kotlin.coroutines.d<? super kotlin.r2> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.u.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.u$a r0 = (kotlinx.coroutines.channels.u.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$a r0 = new kotlinx.coroutines.channels.u$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.g0 r6 = (kotlinx.coroutines.channels.g0) r6
            java.lang.Object r2 = r0.L$0
            v3.l r2 = (v3.l) r2
            kotlin.e1.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L7e
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.e1.n(r7)
            kotlinx.coroutines.channels.n r7 = r5.iterator()     // Catch: java.lang.Throwable -> L7a
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L35
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L35
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L35
            r0.label = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.c(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            r2.invoke(r7)     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4a
        L6d:
            kotlin.r2 r5 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L35
            kotlin.jvm.internal.i0.d(r3)
            r7 = 0
            kotlinx.coroutines.channels.s.b(r6, r7)
            kotlin.jvm.internal.i0.c(r3)
            return r5
        L7a:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7e:
            throw r5     // Catch: java.lang.Throwable -> L7f
        L7f:
            r7 = move-exception
            kotlin.jvm.internal.i0.d(r3)
            kotlinx.coroutines.channels.s.b(r6, r5)
            kotlin.jvm.internal.i0.c(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.e(kotlinx.coroutines.channels.g0, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    private static final <E> Object f(d<E> dVar, v3.l<? super E, r2> lVar, kotlin.coroutines.d<? super r2> dVar2) {
        g0<E> n5 = dVar.n();
        try {
            n<E> it = n5.iterator();
            while (true) {
                kotlin.jvm.internal.i0.e(3);
                kotlin.jvm.internal.i0.e(0);
                Object c5 = it.c(null);
                kotlin.jvm.internal.i0.e(1);
                if (((Boolean) c5).booleanValue()) {
                    lVar.invoke(it.next());
                } else {
                    return r2.f19517a;
                }
            }
        } finally {
            kotlin.jvm.internal.i0.d(1);
            g0.a.b(n5, null, 1, null);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    private static final <E> Object g(g0<? extends E> g0Var, v3.l<? super E, r2> lVar, kotlin.coroutines.d<? super r2> dVar) {
        try {
            n<? extends E> it = g0Var.iterator();
            while (true) {
                kotlin.jvm.internal.i0.e(3);
                kotlin.jvm.internal.i0.e(0);
                Object c5 = it.c(null);
                kotlin.jvm.internal.i0.e(1);
                if (((Boolean) c5).booleanValue()) {
                    lVar.invoke(it.next());
                } else {
                    r2 r2Var = r2.f19517a;
                    kotlin.jvm.internal.i0.d(1);
                    s.b(g0Var, null);
                    kotlin.jvm.internal.i0.c(1);
                    return r2Var;
                }
            }
        } finally {
        }
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ kotlinx.coroutines.selects.g h(g0 g0Var) {
        l0.n(g0Var, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>");
        return g0Var.t();
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ Object i(g0 g0Var, kotlin.coroutines.d dVar) {
        l0.n(g0Var, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>");
        return g0Var.w(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0067, B:14:0x006f, B:29:0x0078), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0067, B:14:0x006f, B:29:0x0078), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0064 -> B:12:0x0067). Please report as a decompilation issue!!! */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object j(@p4.l kotlinx.coroutines.channels.g0<? extends E> r7, @p4.l kotlin.coroutines.d<? super java.util.List<? extends E>> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.u.c
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.u$c r0 = (kotlinx.coroutines.channels.u.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$c r0 = new kotlinx.coroutines.channels.u$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.L$3
            kotlinx.coroutines.channels.n r7 = (kotlinx.coroutines.channels.n) r7
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.channels.g0 r2 = (kotlinx.coroutines.channels.g0) r2
            java.lang.Object r4 = r0.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.L$0
            java.util.List r5 = (java.util.List) r5
            kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L39
            goto L67
        L39:
            r7 = move-exception
            r8 = r2
            goto L89
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            kotlin.e1.n(r8)
            java.util.List r8 = kotlin.collections.u.i()
            kotlinx.coroutines.channels.n r2 = r7.iterator()     // Catch: java.lang.Throwable -> L85
            r4 = r8
            r5 = r4
            r8 = r7
            r7 = r2
        L53:
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L83
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L83
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L83
            r0.L$3 = r7     // Catch: java.lang.Throwable -> L83
            r0.label = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r7.c(r0)     // Catch: java.lang.Throwable -> L83
            if (r2 != r1) goto L64
            return r1
        L64:
            r6 = r2
            r2 = r8
            r8 = r6
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L39
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L78
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L39
            r4.add(r8)     // Catch: java.lang.Throwable -> L39
            r8 = r2
            goto L53
        L78:
            kotlin.r2 r7 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L39
            r7 = 0
            kotlinx.coroutines.channels.s.b(r2, r7)
            java.util.List r7 = kotlin.collections.u.a(r5)
            return r7
        L83:
            r7 = move-exception
            goto L89
        L85:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L89:
            throw r7     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            kotlinx.coroutines.channels.s.b(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.j(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }
}
