package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.i0;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDragScope;", "", "", "newOffset", "lastKnownVelocity", "Lkotlin/r2;", "dragTo", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface AnchoredDragScope {
    static /* synthetic */ void dragTo$default(AnchoredDragScope anchoredDragScope, float f5, float f6, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
        }
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        anchoredDragScope.dragTo(f5, f6);
    }

    void dragTo(float f5, float f6);
}
