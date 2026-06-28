package androidx.compose.ui.node;

import kotlin.i0;

@i0(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0080\b\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"", "width", "height", "Lkotlin/r2;", "checkMeasuredSize", "MaxLayoutDimension", "I", "MaxLayoutMask", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LookaheadDelegateKt {
    private static final int MaxLayoutDimension = 16777215;
    private static final int MaxLayoutMask = -16777216;

    public static final void checkMeasuredSize(int i5, int i6) {
        boolean z4;
        if ((i5 & (-16777216)) == 0 && ((-16777216) & i6) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return;
        }
        throw new IllegalStateException(("Size(" + i5 + " x " + i6 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }
}
