package androidx.lifecycle;

import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Add missing generic type declarations: [X] */
@i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"X", "Y", t0.b.f22420d, "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class Transformations$switchMap$1<X> extends n0 implements l<X, r2> {
    final /* synthetic */ k1.h<LiveData<Y>> $liveData;
    final /* synthetic */ MediatorLiveData<Y> $result;
    final /* synthetic */ l<X, LiveData<Y>> $transform;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [Y] */
    @i0(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "y", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.Transformations$switchMap$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1<Y> extends n0 implements l<Y, r2> {
        final /* synthetic */ MediatorLiveData<Y> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MediatorLiveData<Y> mediatorLiveData) {
            super(1);
            this.$result = mediatorLiveData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
            invoke2((AnonymousClass1<Y>) obj);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Y y4) {
            this.$result.setValue(y4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$1(l<X, LiveData<Y>> lVar, k1.h<LiveData<Y>> hVar, MediatorLiveData<Y> mediatorLiveData) {
        super(1);
        this.$transform = lVar;
        this.$liveData = hVar;
        this.$result = mediatorLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
        invoke2((Transformations$switchMap$1<X>) obj);
        return r2.f19517a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LiveData, T, java.lang.Object] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(X x4) {
        ?? r42 = (LiveData) this.$transform.invoke(x4);
        T t5 = this.$liveData.element;
        if (t5 != r42) {
            if (t5 != 0) {
                MediatorLiveData<Y> mediatorLiveData = this.$result;
                l0.m(t5);
                mediatorLiveData.removeSource((LiveData) t5);
            }
            this.$liveData.element = r42;
            if (r42 != 0) {
                MediatorLiveData<Y> mediatorLiveData2 = this.$result;
                l0.m(r42);
                mediatorLiveData2.addSource(r42, new Transformations$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(this.$result)));
            }
        }
    }
}
