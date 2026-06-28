package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SnapshotStateObserver$readObserver$1 extends n0 implements l<Object, r2> {
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$readObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(1);
        this.this$0 = snapshotStateObserver;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
        invoke2(obj);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Object obj) {
        boolean z4;
        MutableVector mutableVector;
        SnapshotStateObserver.ObservedScopeMap observedScopeMap;
        z4 = this.this$0.isPaused;
        if (z4) {
            return;
        }
        mutableVector = this.this$0.observedScopeMaps;
        SnapshotStateObserver snapshotStateObserver = this.this$0;
        synchronized (mutableVector) {
            observedScopeMap = snapshotStateObserver.currentMap;
            l0.m(observedScopeMap);
            observedScopeMap.recordRead(obj);
            r2 r2Var = r2.f19517a;
        }
    }
}
