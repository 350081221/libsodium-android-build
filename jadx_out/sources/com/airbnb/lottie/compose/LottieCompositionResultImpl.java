package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.y;

@Stable
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010 \u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005H\u0000¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\b'R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0018\u0010\u0011R/\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "()V", "compositionDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/airbnb/lottie/LottieComposition;", "<set-?>", "", com.umeng.analytics.pro.d.U, "getError", "()Ljava/lang/Throwable;", "setError", "(Ljava/lang/Throwable;)V", "error$delegate", "Landroidx/compose/runtime/MutableState;", "isComplete", "", "()Z", "isComplete$delegate", "Landroidx/compose/runtime/State;", "isFailure", "isFailure$delegate", "isLoading", "isLoading$delegate", "isSuccess", "isSuccess$delegate", t0.b.f22420d, "getValue", "()Lcom/airbnb/lottie/LottieComposition;", "setValue", "(Lcom/airbnb/lottie/LottieComposition;)V", "value$delegate", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "", "composition", "complete$lottie_compose_release", "completeExceptionally", "completeExceptionally$lottie_compose_release", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nLottieCompositionResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieCompositionResult.kt\ncom/airbnb/lottie/compose/LottieCompositionResultImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,128:1\n81#2:129\n107#2,2:130\n81#2:132\n107#2,2:133\n81#2:135\n81#2:136\n81#2:137\n81#2:138\n*S KotlinDebug\n*F\n+ 1 LottieCompositionResult.kt\ncom/airbnb/lottie/compose/LottieCompositionResultImpl\n*L\n95#1:129\n95#1:130,2\n98#1:132\n98#1:133,2\n101#1:135\n103#1:136\n105#1:137\n107#1:138\n*E\n"})
/* loaded from: classes2.dex */
public final class LottieCompositionResultImpl implements LottieCompositionResult {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final y<com.airbnb.lottie.k> f1171a = a0.c(null, 1, null);

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final MutableState f1172b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final MutableState f1173c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final State f1174d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final State f1175e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private final State f1176f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private final State f1177g;

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends n0 implements v3.a<Boolean> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            return Boolean.valueOf((LottieCompositionResultImpl.this.getValue() == null && LottieCompositionResultImpl.this.getError() == null) ? false : true);
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class b extends n0 implements v3.a<Boolean> {
        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.getError() != null);
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class c extends n0 implements v3.a<Boolean> {
        c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.getValue() == null && LottieCompositionResultImpl.this.getError() == null);
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class d extends n0 implements v3.a<Boolean> {
        d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.getValue() != null);
        }
    }

    public LottieCompositionResultImpl() {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f1172b = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f1173c = mutableStateOf$default2;
        this.f1174d = SnapshotStateKt.derivedStateOf(new c());
        this.f1175e = SnapshotStateKt.derivedStateOf(new a());
        this.f1176f = SnapshotStateKt.derivedStateOf(new b());
        this.f1177g = SnapshotStateKt.derivedStateOf(new d());
    }

    private void r(Throwable th) {
        this.f1173c.setValue(th);
    }

    private void s(com.airbnb.lottie.k kVar) {
        this.f1172b.setValue(kVar);
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    @p4.m
    public Object b(@p4.l kotlin.coroutines.d<? super com.airbnb.lottie.k> dVar) {
        return this.f1171a.b(dVar);
    }

    public final synchronized void c(@p4.l com.airbnb.lottie.k composition) {
        l0.p(composition, "composition");
        if (j()) {
            return;
        }
        s(composition);
        this.f1171a.M(composition);
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean d() {
        return ((Boolean) this.f1176f.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean g() {
        return ((Boolean) this.f1174d.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    @p4.m
    public Throwable getError() {
        return (Throwable) this.f1173c.getValue();
    }

    public final synchronized void h(@p4.l Throwable error) {
        l0.p(error, "error");
        if (j()) {
            return;
        }
        r(error);
        this.f1171a.c(error);
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isSuccess() {
        return ((Boolean) this.f1177g.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean j() {
        return ((Boolean) this.f1175e.getValue()).booleanValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    @p4.m
    public com.airbnb.lottie.k getValue() {
        return (com.airbnb.lottie.k) this.f1172b.getValue();
    }
}
