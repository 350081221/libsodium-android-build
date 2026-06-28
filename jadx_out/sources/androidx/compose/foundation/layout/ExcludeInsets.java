package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/layout/ExcludeInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "included", "excluded", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/layout/WindowInsets;)V", "equals", "", "other", "", "getBottom", "", "density", "Landroidx/compose/ui/unit/Density;", "getLeft", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getRight", "getTop", TTDownloadField.TT_HASHCODE, "toString", "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ExcludeInsets implements WindowInsets {

    @l
    private final WindowInsets excluded;

    @l
    private final WindowInsets included;

    public ExcludeInsets(@l WindowInsets windowInsets, @l WindowInsets windowInsets2) {
        this.included = windowInsets;
        this.excluded = windowInsets2;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExcludeInsets)) {
            return false;
        }
        ExcludeInsets excludeInsets = (ExcludeInsets) obj;
        if (l0.g(excludeInsets.included, this.included) && l0.g(excludeInsets.excluded, this.excluded)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@l Density density) {
        int u4;
        u4 = u.u(this.included.getBottom(density) - this.excluded.getBottom(density), 0);
        return u4;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@l Density density, @l LayoutDirection layoutDirection) {
        int u4;
        u4 = u.u(this.included.getLeft(density, layoutDirection) - this.excluded.getLeft(density, layoutDirection), 0);
        return u4;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@l Density density, @l LayoutDirection layoutDirection) {
        int u4;
        u4 = u.u(this.included.getRight(density, layoutDirection) - this.excluded.getRight(density, layoutDirection), 0);
        return u4;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@l Density density) {
        int u4;
        u4 = u.u(this.included.getTop(density) - this.excluded.getTop(density), 0);
        return u4;
    }

    public int hashCode() {
        return (this.included.hashCode() * 31) + this.excluded.hashCode();
    }

    @l
    public String toString() {
        return '(' + this.included + " - " + this.excluded + ')';
    }
}
