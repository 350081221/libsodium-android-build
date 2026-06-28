package androidx.compose.ui.unit;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/unit/DensityImpl;", "Landroidx/compose/ui/unit/Density;", "density", "", "fontScale", "(FF)V", "getDensity", "()F", "getFontScale", "component1", "component2", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DensityImpl implements Density {
    private final float density;
    private final float fontScale;

    public DensityImpl(float f5, float f6) {
        this.density = f5;
        this.fontScale = f6;
    }

    public static /* synthetic */ DensityImpl copy$default(DensityImpl densityImpl, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = densityImpl.density;
        }
        if ((i5 & 2) != 0) {
            f6 = densityImpl.fontScale;
        }
        return densityImpl.copy(f5, f6);
    }

    public final float component1() {
        return this.density;
    }

    public final float component2() {
        return this.fontScale;
    }

    @l
    public final DensityImpl copy(float f5, float f6) {
        return new DensityImpl(f5, f6);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityImpl)) {
            return false;
        }
        DensityImpl densityImpl = (DensityImpl) obj;
        return Float.compare(this.density, densityImpl.density) == 0 && Float.compare(this.fontScale, densityImpl.fontScale) == 0;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.fontScale;
    }

    public int hashCode() {
        return (Float.hashCode(this.density) * 31) + Float.hashCode(this.fontScale);
    }

    @l
    public String toString() {
        return "DensityImpl(density=" + this.density + ", fontScale=" + this.fontScale + ')';
    }
}
