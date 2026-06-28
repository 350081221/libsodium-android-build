package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Landroidx/lifecycle/EmittedSource;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CoroutineLiveDataKt$addDisposableSource$2 extends o implements p<s0, kotlin.coroutines.d<? super EmittedSource>, Object> {
    final /* synthetic */ LiveData<T> $source;
    final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1<T> extends n0 implements l<T, r2> {
        final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MediatorLiveData<T> mediatorLiveData) {
            super(1);
            this.$this_addDisposableSource = mediatorLiveData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
            invoke2((AnonymousClass1<T>) obj);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(T t5) {
            this.$this_addDisposableSource.setValue(t5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveDataKt$addDisposableSource$2(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, kotlin.coroutines.d<? super CoroutineLiveDataKt$addDisposableSource$2> dVar) {
        super(2, dVar);
        this.$this_addDisposableSource = mediatorLiveData;
        this.$source = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new CoroutineLiveDataKt$addDisposableSource$2(this.$this_addDisposableSource, this.$source, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m kotlin.coroutines.d<? super EmittedSource> dVar) {
        return ((CoroutineLiveDataKt$addDisposableSource$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            MediatorLiveData<T> mediatorLiveData = this.$this_addDisposableSource;
            mediatorLiveData.addSource(this.$source, new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(mediatorLiveData)));
            return new EmittedSource(this.$source, this.$this_addDisposableSource);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
