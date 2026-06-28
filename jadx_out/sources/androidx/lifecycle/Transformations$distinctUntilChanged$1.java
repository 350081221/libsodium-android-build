package androidx.lifecycle;

import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Add missing generic type declarations: [X] */
@i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"X", "kotlin.jvm.PlatformType", t0.b.f22420d, "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class Transformations$distinctUntilChanged$1<X> extends n0 implements l<X, r2> {
    final /* synthetic */ k1.a $firstTime;
    final /* synthetic */ MediatorLiveData<X> $outputLiveData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$distinctUntilChanged$1(MediatorLiveData<X> mediatorLiveData, k1.a aVar) {
        super(1);
        this.$outputLiveData = mediatorLiveData;
        this.$firstTime = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
        invoke2((Transformations$distinctUntilChanged$1<X>) obj);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(X x4) {
        X value = this.$outputLiveData.getValue();
        if (this.$firstTime.element || ((value == null && x4 != null) || !(value == null || l0.g(value, x4)))) {
            this.$firstTime.element = false;
            this.$outputLiveData.setValue(x4);
        }
    }
}
