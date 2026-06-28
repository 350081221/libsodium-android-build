package androidx.compose.foundation.text2.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;", "", "Lkotlin/r2;", "resetCachedX", "", "cachedX", "F", "getCachedX", "()F", "setCachedX", "(F)V", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldPreparedSelectionState {
    public static final int $stable = 8;
    private float cachedX = Float.NaN;

    public final float getCachedX() {
        return this.cachedX;
    }

    public final void resetCachedX() {
        this.cachedX = Float.NaN;
    }

    public final void setCachedX(float f5) {
        this.cachedX = f5;
    }
}
