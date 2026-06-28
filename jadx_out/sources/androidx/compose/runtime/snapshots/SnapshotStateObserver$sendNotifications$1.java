package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,652:1\n460#2,11:653\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n*L\n87#1:653,11\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotStateObserver$sendNotifications$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$sendNotifications$1(SnapshotStateObserver snapshotStateObserver) {
        super(0);
        this.this$0 = snapshotStateObserver;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableVector mutableVector;
        boolean z4;
        boolean drainChanges;
        MutableVector mutableVector2;
        do {
            mutableVector = this.this$0.observedScopeMaps;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (mutableVector) {
                z4 = snapshotStateObserver.sendingNotifications;
                if (!z4) {
                    snapshotStateObserver.sendingNotifications = true;
                    try {
                        mutableVector2 = snapshotStateObserver.observedScopeMaps;
                        int size = mutableVector2.getSize();
                        if (size > 0) {
                            Object[] content = mutableVector2.getContent();
                            int i5 = 0;
                            do {
                                ((SnapshotStateObserver.ObservedScopeMap) content[i5]).notifyInvalidatedScopes();
                                i5++;
                            } while (i5 < size);
                        }
                        snapshotStateObserver.sendingNotifications = false;
                    } finally {
                    }
                }
                r2 r2Var = r2.f19517a;
            }
            drainChanges = this.this$0.drainChanges();
        } while (drainChanges);
    }
}
