package kotlinx.coroutines.channels;

import kotlin.e1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.k1;

@kotlin.i0(d1 = {"\u0000&\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u001a1\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"", "delayMillis", "initialDelayMillis", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlinx/coroutines/channels/j0;", "mode", "Lkotlinx/coroutines/channels/g0;", "Lkotlin/r2;", "e", "Lkotlinx/coroutines/channels/h0;", "channel", "d", "(JJLkotlinx/coroutines/channels/h0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTickerChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TickerChannels.kt\nkotlinx/coroutines/channels/TickerChannelsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
/* loaded from: classes4.dex */
public final class i0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {106, 108, 109}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {
        long J$0;
        Object L$0;
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
            return i0.c(0L, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {84, 88, 94, 96}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {
        long J$0;
        long J$1;
        Object L$0;
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
            return i0.d(0L, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {72, 73}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.o implements v3.p<e0<? super r2>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ long $initialDelayMillis;
        final /* synthetic */ j0 $mode;
        private /* synthetic */ Object L$0;
        int label;

        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f19880a;

            static {
                int[] iArr = new int[j0.values().length];
                try {
                    iArr[j0.FIXED_PERIOD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j0.FIXED_DELAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f19880a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j0 j0Var, long j5, long j6, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.$mode = j0Var;
            this.$delayMillis = j5;
            this.$initialDelayMillis = j6;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.$mode, this.$delayMillis, this.$initialDelayMillis, dVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l e0<? super r2> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((c) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1 || i5 == 2) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                e0 e0Var = (e0) this.L$0;
                int i6 = a.f19880a[this.$mode.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        long j5 = this.$delayMillis;
                        long j6 = this.$initialDelayMillis;
                        h0 channel = e0Var.getChannel();
                        this.label = 2;
                        if (i0.c(j5, j6, channel, this) == l5) {
                            return l5;
                        }
                    }
                } else {
                    long j7 = this.$delayMillis;
                    long j8 = this.$initialDelayMillis;
                    h0 channel2 = e0Var.getChannel();
                    this.label = 1;
                    if (i0.d(j7, j8, channel2, this) == l5) {
                        return l5;
                    }
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007d -> B:12:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r6, long r8, kotlinx.coroutines.channels.h0<? super kotlin.r2> r10, kotlin.coroutines.d<? super kotlin.r2> r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.i0.a
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.i0$a r0 = (kotlinx.coroutines.channels.i0.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.i0$a r0 = new kotlinx.coroutines.channels.i0$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.h0 r8 = (kotlinx.coroutines.channels.h0) r8
            kotlin.e1.n(r11)
        L34:
            r10 = r8
            goto L63
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.channels.h0 r8 = (kotlinx.coroutines.channels.h0) r8
            kotlin.e1.n(r11)
            goto L73
        L48:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            r10 = r8
            kotlinx.coroutines.channels.h0 r10 = (kotlinx.coroutines.channels.h0) r10
            kotlin.e1.n(r11)
            goto L63
        L53:
            kotlin.e1.n(r11)
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r5
            java.lang.Object r8 = kotlinx.coroutines.d1.b(r8, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            kotlin.r2 r8 = kotlin.r2.f19517a
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r4
            java.lang.Object r8 = r10.F(r8, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            r8 = r10
        L73:
            r0.L$0 = r8
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.d1.b(r6, r0)
            if (r9 != r1) goto L34
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.i0.c(long, long, kotlinx.coroutines.channels.h0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00fc -> B:15:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0112 -> B:13:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(long r18, long r20, kotlinx.coroutines.channels.h0<? super kotlin.r2> r22, kotlin.coroutines.d<? super kotlin.r2> r23) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.i0.d(long, long, kotlinx.coroutines.channels.h0, kotlin.coroutines.d):java.lang.Object");
    }

    @p4.l
    @c3
    public static final g0<r2> e(long j5, long j6, @p4.l kotlin.coroutines.g gVar, @p4.l j0 j0Var) {
        boolean z4;
        boolean z5 = true;
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (j6 < 0) {
                z5 = false;
            }
            if (z5) {
                return c0.e(c2.f19867a, k1.g().plus(gVar), 0, new c(j0Var, j5, j6, null));
            }
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j6 + " ms").toString());
        }
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + j5 + " ms").toString());
    }

    public static /* synthetic */ g0 f(long j5, long j6, kotlin.coroutines.g gVar, j0 j0Var, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j6 = j5;
        }
        if ((i5 & 4) != 0) {
            gVar = kotlin.coroutines.i.INSTANCE;
        }
        if ((i5 & 8) != 0) {
            j0Var = j0.FIXED_PERIOD;
        }
        return e(j5, j6, gVar, j0Var);
    }
}
