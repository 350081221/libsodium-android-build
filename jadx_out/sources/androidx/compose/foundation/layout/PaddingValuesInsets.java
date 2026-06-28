package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "equals", "", "other", "", "getBottom", "", "density", "Landroidx/compose/ui/unit/Density;", "getLeft", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getRight", "getTop", TTDownloadField.TT_HASHCODE, "toString", "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PaddingValuesInsets implements WindowInsets {

    @l
    private final PaddingValues paddingValues;

    public PaddingValuesInsets(@l PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaddingValuesInsets)) {
            return false;
        }
        return l0.g(((PaddingValuesInsets) obj).paddingValues, this.paddingValues);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@l Density density) {
        return density.mo298roundToPx0680j_4(this.paddingValues.mo503calculateBottomPaddingD9Ej5fM());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@l Density density, @l LayoutDirection layoutDirection) {
        return density.mo298roundToPx0680j_4(this.paddingValues.mo504calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@l Density density, @l LayoutDirection layoutDirection) {
        return density.mo298roundToPx0680j_4(this.paddingValues.mo505calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@l Density density) {
        return density.mo298roundToPx0680j_4(this.paddingValues.mo506calculateTopPaddingD9Ej5fM());
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @l
    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return "PaddingValues(" + ((Object) Dp.m6055toStringimpl(this.paddingValues.mo504calculateLeftPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) Dp.m6055toStringimpl(this.paddingValues.mo506calculateTopPaddingD9Ej5fM())) + ", " + ((Object) Dp.m6055toStringimpl(this.paddingValues.mo505calculateRightPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) Dp.m6055toStringimpl(this.paddingValues.mo503calculateBottomPaddingD9Ej5fM())) + ')';
    }
}
