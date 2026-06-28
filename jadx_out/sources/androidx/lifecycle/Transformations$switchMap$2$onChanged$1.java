package androidx.lifecycle;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "y", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class Transformations$switchMap$2$onChanged$1 extends n0 implements l<Object, r2> {
    final /* synthetic */ MediatorLiveData<Object> $result;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$2$onChanged$1(MediatorLiveData<Object> mediatorLiveData) {
        super(1);
        this.$result = mediatorLiveData;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
        invoke2(obj);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Object obj) {
        this.$result.setValue(obj);
    }
}
