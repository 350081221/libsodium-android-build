package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/ResistanceConfig;", "", "basis", "", "factorAtMin", "factorAtMax", "(FFF)V", "getBasis", "()F", "getFactorAtMax", "getFactorAtMin", "computeResistance", "overflow", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@k(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
/* loaded from: classes.dex */
public final class ResistanceConfig {
    public static final int $stable = 0;
    private final float basis;
    private final float factorAtMax;
    private final float factorAtMin;

    public ResistanceConfig(float f5, float f6, float f7) {
        this.basis = f5;
        this.factorAtMin = f6;
        this.factorAtMax = f7;
    }

    public final float computeResistance(float f5) {
        float f6;
        boolean z4;
        float H;
        if (f5 < 0.0f) {
            f6 = this.factorAtMin;
        } else {
            f6 = this.factorAtMax;
        }
        if (f6 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return 0.0f;
        }
        H = u.H(f5 / this.basis, -1.0f, 1.0f);
        return (this.basis / f6) * ((float) Math.sin((H * 3.1415927f) / 2));
    }

    public boolean equals(@m Object obj) {
        boolean z4;
        boolean z5;
        boolean z6;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResistanceConfig)) {
            return false;
        }
        ResistanceConfig resistanceConfig = (ResistanceConfig) obj;
        if (this.basis == resistanceConfig.basis) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.factorAtMin == resistanceConfig.factorAtMin) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (this.factorAtMax == resistanceConfig.factorAtMax) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            return true;
        }
        return false;
    }

    public final float getBasis() {
        return this.basis;
    }

    public final float getFactorAtMax() {
        return this.factorAtMax;
    }

    public final float getFactorAtMin() {
        return this.factorAtMin;
    }

    public int hashCode() {
        return (((Float.hashCode(this.basis) * 31) + Float.hashCode(this.factorAtMin)) * 31) + Float.hashCode(this.factorAtMax);
    }

    @l
    public String toString() {
        return "ResistanceConfig(basis=" + this.basis + ", factorAtMin=" + this.factorAtMin + ", factorAtMax=" + this.factorAtMax + ')';
    }

    public /* synthetic */ ResistanceConfig(float f5, float f6, float f7, int i5, w wVar) {
        this(f5, (i5 & 2) != 0 ? 10.0f : f6, (i5 & 4) != 0 ? 10.0f : f7);
    }
}
