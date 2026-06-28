package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0012\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/LimitInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getLeft", "getTop", "getRight", "getBottom", "", "other", "", "equals", TTDownloadField.TT_HASHCODE, "", "toString", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "getInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "sides", "I", "getSides-JoeWqyM", "()I", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;ILkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class LimitInsets implements WindowInsets {

    @l
    private final WindowInsets insets;
    private final int sides;

    private LimitInsets(WindowInsets windowInsets, int i5) {
        this.insets = windowInsets;
        this.sides = i5;
    }

    public /* synthetic */ LimitInsets(WindowInsets windowInsets, int i5, w wVar) {
        this(windowInsets, i5);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) obj;
        if (l0.g(this.insets, limitInsets.insets) && WindowInsetsSides.m636equalsimpl0(this.sides, limitInsets.sides)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@l Density density) {
        if (WindowInsetsSides.m637hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m647getBottomJoeWqyM())) {
            return this.insets.getBottom(density);
        }
        return 0;
    }

    @l
    public final WindowInsets getInsets() {
        return this.insets;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@l Density density, @l LayoutDirection layoutDirection) {
        int m644getAllowLeftInRtlJoeWqyM$foundation_layout_release;
        if (layoutDirection == LayoutDirection.Ltr) {
            m644getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m643getAllowLeftInLtrJoeWqyM$foundation_layout_release();
        } else {
            m644getAllowLeftInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m644getAllowLeftInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m637hasAnybkgdKaI$foundation_layout_release(this.sides, m644getAllowLeftInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@l Density density, @l LayoutDirection layoutDirection) {
        int m646getAllowRightInRtlJoeWqyM$foundation_layout_release;
        if (layoutDirection == LayoutDirection.Ltr) {
            m646getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m645getAllowRightInLtrJoeWqyM$foundation_layout_release();
        } else {
            m646getAllowRightInRtlJoeWqyM$foundation_layout_release = WindowInsetsSides.Companion.m646getAllowRightInRtlJoeWqyM$foundation_layout_release();
        }
        if (WindowInsetsSides.m637hasAnybkgdKaI$foundation_layout_release(this.sides, m646getAllowRightInRtlJoeWqyM$foundation_layout_release)) {
            return this.insets.getRight(density, layoutDirection);
        }
        return 0;
    }

    /* renamed from: getSides-JoeWqyM, reason: not valid java name */
    public final int m508getSidesJoeWqyM() {
        return this.sides;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@l Density density) {
        if (WindowInsetsSides.m637hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m653getTopJoeWqyM())) {
            return this.insets.getTop(density);
        }
        return 0;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + WindowInsetsSides.m638hashCodeimpl(this.sides);
    }

    @l
    public String toString() {
        return '(' + this.insets + " only " + ((Object) WindowInsetsSides.m640toStringimpl(this.sides)) + ')';
    }
}
