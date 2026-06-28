package androidx.compose.runtime;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SnapshotMutableStateImpl$component2$1<T> extends n0 implements l<T, r2> {
    final /* synthetic */ SnapshotMutableStateImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotMutableStateImpl$component2$1(SnapshotMutableStateImpl<T> snapshotMutableStateImpl) {
        super(1);
        this.this$0 = snapshotMutableStateImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
        invoke2((SnapshotMutableStateImpl$component2$1<T>) obj);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(T t5) {
        this.this$0.setValue(t5);
    }
}
