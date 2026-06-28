package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.channels.s;

@Stable
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0011\u0010\u000e\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/airbnb/lottie/compose/LottieRetrySignal;", "", "()V", "channel", "Lkotlinx/coroutines/channels/Channel;", "", "<set-?>", "", "isAwaitingRetry", "()Z", "setAwaitingRetry", "(Z)V", "isAwaitingRetry$delegate", "Landroidx/compose/runtime/MutableState;", "awaitRetry", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retry", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nLottieRetrySignal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieRetrySignal.kt\ncom/airbnb/lottie/compose/LottieRetrySignal\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,50:1\n81#2:51\n107#2,2:52\n*S KotlinDebug\n*F\n+ 1 LottieRetrySignal.kt\ncom/airbnb/lottie/compose/LottieRetrySignal\n*L\n35#1:51\n35#1:52,2\n*E\n"})
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final int f1251c = 0;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final kotlinx.coroutines.channels.l<r2> f1252a = kotlinx.coroutines.channels.o.d(1, kotlinx.coroutines.channels.i.DROP_OLDEST, null, 4, null);

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final MutableState f1253b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.airbnb.lottie.compose.LottieRetrySignal", f = "LottieRetrySignal.kt", i = {0}, l = {45}, m = "awaitRetry", n = {"this"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {
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
            return o.this.a(this);
        }
    }

    public o() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f1253b = mutableStateOf$default;
    }

    private final void d(boolean z4) {
        this.f1253b.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.airbnb.lottie.compose.o.a
            if (r0 == 0) goto L13
            r0 = r6
            com.airbnb.lottie.compose.o$a r0 = (com.airbnb.lottie.compose.o.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.airbnb.lottie.compose.o$a r0 = new com.airbnb.lottie.compose.o$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.L$0
            com.airbnb.lottie.compose.o r0 = (com.airbnb.lottie.compose.o) r0
            kotlin.e1.n(r6)     // Catch: java.lang.Throwable -> L2e
            goto L4c
        L2e:
            r6 = move-exception
            goto L54
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            kotlin.e1.n(r6)
            r5.d(r4)     // Catch: java.lang.Throwable -> L52
            kotlinx.coroutines.channels.l<kotlin.r2> r6 = r5.f1252a     // Catch: java.lang.Throwable -> L52
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L52
            r0.label = r4     // Catch: java.lang.Throwable -> L52
            java.lang.Object r6 = r6.D(r0)     // Catch: java.lang.Throwable -> L52
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r5
        L4c:
            r0.d(r3)
            kotlin.r2 r6 = kotlin.r2.f19517a
            return r6
        L52:
            r6 = move-exception
            r0 = r5
        L54:
            r0.d(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.o.a(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.f1253b.getValue()).booleanValue();
    }

    public final void c() {
        s.m0(this.f1252a, r2.f19517a);
    }
}
