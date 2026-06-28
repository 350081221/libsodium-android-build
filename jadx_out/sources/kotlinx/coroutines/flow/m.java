package kotlinx.coroutines.flow;

import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007\u001a$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0011\u001a\u00020\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/channels/g0;", "channel", "Lkotlin/r2;", "d", "(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "consume", "e", "(Lkotlinx/coroutines/flow/j;Lkotlinx/coroutines/channels/g0;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/i;", socket.g.f22386a, "c", "Lkotlinx/coroutines/channels/d;", "b", "Lkotlinx/coroutines/s0;", "scope", "f", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,176:1\n106#2:177\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n*L\n153#1:177\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n*L\n1#1,112:1\n154#2,2:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d f20180a;

        public a(kotlinx.coroutines.channels.d dVar) {
            this.f20180a = dVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l j<? super T> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            Object l02 = k.l0(jVar, this.f20180a.n(), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (l02 == l5) {
                return l02;
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {36, 37}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b<T> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
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
            return m.e(null, null, false, this);
        }
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> i<T> b(@p4.l kotlinx.coroutines.channels.d<T> dVar) {
        return new a(dVar);
    }

    @p4.l
    public static final <T> i<T> c(@p4.l kotlinx.coroutines.channels.g0<? extends T> g0Var) {
        return new e(g0Var, true, null, 0, null, 28, null);
    }

    @p4.m
    public static final <T> Object d(@p4.l j<? super T> jVar, @p4.l kotlinx.coroutines.channels.g0<? extends T> g0Var, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object e5 = e(jVar, g0Var, true, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return e5 == l5 ? e5 : r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:12:0x0036, B:14:0x0060, B:19:0x0075, B:21:0x007d, B:32:0x0052, B:34:0x005c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008f -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(kotlinx.coroutines.flow.j<? super T> r6, kotlinx.coroutines.channels.g0<? extends T> r7, boolean r8, kotlin.coroutines.d<? super kotlin.r2> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.m.b
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.m$b r0 = (kotlinx.coroutines.flow.m.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m$b r0 = new kotlinx.coroutines.flow.m$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L56
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            kotlin.e1.n(r9)     // Catch: java.lang.Throwable -> L9b
        L39:
            r9 = r6
            r6 = r2
            goto L60
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            kotlin.e1.n(r9)     // Catch: java.lang.Throwable -> L9b
            goto L75
        L56:
            kotlin.e1.n(r9)
            kotlinx.coroutines.flow.k.o0(r6)
            kotlinx.coroutines.channels.n r9 = r7.iterator()     // Catch: java.lang.Throwable -> L9b
        L60:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9b
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9b
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L9b
            r0.Z$0 = r8     // Catch: java.lang.Throwable -> L9b
            r0.label = r4     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r9.c(r0)     // Catch: java.lang.Throwable -> L9b
            if (r2 != r1) goto L71
            return r1
        L71:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L9b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L9b
            if (r9 == 0) goto L92
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L9b
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L9b
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9b
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L9b
            r0.Z$0 = r8     // Catch: java.lang.Throwable -> L9b
            r0.label = r3     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L9b
            if (r9 != r1) goto L39
            return r1
        L92:
            if (r8 == 0) goto L98
            r6 = 0
            kotlinx.coroutines.channels.s.b(r7, r6)
        L98:
            kotlin.r2 r6 = kotlin.r2.f19517a
            return r6
        L9b:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L9d
        L9d:
            r9 = move-exception
            if (r8 == 0) goto La3
            kotlinx.coroutines.channels.s.b(r7, r6)
        La3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.m.e(kotlinx.coroutines.flow.j, kotlinx.coroutines.channels.g0, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    @p4.l
    public static final <T> kotlinx.coroutines.channels.g0<T> f(@p4.l i<? extends T> iVar, @p4.l kotlinx.coroutines.s0 s0Var) {
        return kotlinx.coroutines.flow.internal.f.b(iVar).m(s0Var);
    }

    @p4.l
    public static final <T> i<T> g(@p4.l kotlinx.coroutines.channels.g0<? extends T> g0Var) {
        return new e(g0Var, false, null, 0, null, 28, null);
    }
}
