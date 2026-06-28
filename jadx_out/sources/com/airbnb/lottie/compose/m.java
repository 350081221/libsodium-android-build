package com.airbnb.lottie.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007B@\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\u000eR5\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00000\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00028\u0000X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "T", "", "property", "keyPath", "Lcom/airbnb/lottie/model/KeyPath;", t0.b.f22420d, "(Ljava/lang/Object;Lcom/airbnb/lottie/model/KeyPath;Ljava/lang/Object;)V", "callback", "Lkotlin/Function1;", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "Lkotlin/ParameterName;", "name", "frameInfo", "(Ljava/lang/Object;Lcom/airbnb/lottie/model/KeyPath;Lkotlin/jvm/functions/Function1;)V", "getCallback$lottie_compose_release", "()Lkotlin/jvm/functions/Function1;", "getKeyPath$lottie_compose_release", "()Lcom/airbnb/lottie/model/KeyPath;", "getProperty$lottie_compose_release", "()Ljava/lang/Object;", "Ljava/lang/Object;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class m<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f1247d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final T f1248a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final com.airbnb.lottie.model.e f1249b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final v3.l<com.airbnb.lottie.value.b<T>, T> f1250c;

    @i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "it", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "invoke", "(Lcom/airbnb/lottie/value/LottieFrameInfo;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends n0 implements v3.l<com.airbnb.lottie.value.b<T>, T> {
        final /* synthetic */ T $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T t5) {
            super(1);
            this.$value = t5;
        }

        @Override // v3.l
        public final T invoke(@p4.l com.airbnb.lottie.value.b<T> it) {
            l0.p(it, "it");
            return this.$value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(T t5, @p4.l com.airbnb.lottie.model.e keyPath, @p4.l v3.l<? super com.airbnb.lottie.value.b<T>, ? extends T> callback) {
        l0.p(keyPath, "keyPath");
        l0.p(callback, "callback");
        this.f1248a = t5;
        this.f1249b = keyPath;
        this.f1250c = callback;
    }

    @p4.l
    public final v3.l<com.airbnb.lottie.value.b<T>, T> a() {
        return this.f1250c;
    }

    @p4.l
    public final com.airbnb.lottie.model.e b() {
        return this.f1249b;
    }

    public final T c() {
        return this.f1248a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(T t5, @p4.l com.airbnb.lottie.model.e keyPath, T t6) {
        this((Object) t5, keyPath, (v3.l) new a(t6));
        l0.p(keyPath, "keyPath");
    }
}
