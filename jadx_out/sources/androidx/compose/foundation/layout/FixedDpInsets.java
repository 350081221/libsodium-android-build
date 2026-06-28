package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u001a\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/FixedDpInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getLeft", "getTop", "getRight", "getBottom", "", "toString", "", "other", "", "equals", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/unit/Dp;", "leftDp", "F", "topDp", "rightDp", "bottomDp", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/FixedDpInsets\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,748:1\n1#2:749\n*E\n"})
/* loaded from: classes.dex */
final class FixedDpInsets implements WindowInsets {
    private final float bottomDp;
    private final float leftDp;
    private final float rightDp;
    private final float topDp;

    private FixedDpInsets(float f5, float f6, float f7, float f8) {
        this.leftDp = f5;
        this.topDp = f6;
        this.rightDp = f7;
        this.bottomDp = f8;
    }

    public /* synthetic */ FixedDpInsets(float f5, float f6, float f7, float f8, w wVar) {
        this(f5, f6, f7, f8);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDpInsets)) {
            return false;
        }
        FixedDpInsets fixedDpInsets = (FixedDpInsets) obj;
        if (Dp.m6049equalsimpl0(this.leftDp, fixedDpInsets.leftDp) && Dp.m6049equalsimpl0(this.topDp, fixedDpInsets.topDp) && Dp.m6049equalsimpl0(this.rightDp, fixedDpInsets.rightDp) && Dp.m6049equalsimpl0(this.bottomDp, fixedDpInsets.bottomDp)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@l Density density) {
        return density.mo298roundToPx0680j_4(this.bottomDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@l Density density, @l LayoutDirection layoutDirection) {
        return density.mo298roundToPx0680j_4(this.leftDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@l Density density, @l LayoutDirection layoutDirection) {
        return density.mo298roundToPx0680j_4(this.rightDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@l Density density) {
        return density.mo298roundToPx0680j_4(this.topDp);
    }

    public int hashCode() {
        return (((((Dp.m6050hashCodeimpl(this.leftDp) * 31) + Dp.m6050hashCodeimpl(this.topDp)) * 31) + Dp.m6050hashCodeimpl(this.rightDp)) * 31) + Dp.m6050hashCodeimpl(this.bottomDp);
    }

    @l
    public String toString() {
        return "Insets(left=" + ((Object) Dp.m6055toStringimpl(this.leftDp)) + ", top=" + ((Object) Dp.m6055toStringimpl(this.topDp)) + ", right=" + ((Object) Dp.m6055toStringimpl(this.rightDp)) + ", bottom=" + ((Object) Dp.m6055toStringimpl(this.bottomDp)) + ')';
    }
}
