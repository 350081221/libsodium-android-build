package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.k;
import p4.l;
import p4.m;

@k(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0005\u001a\u00020\u0002HÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\n\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u001a\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/FixedThreshold;", "Landroidx/compose/material/ThresholdConfig;", "Landroidx/compose/ui/unit/Dp;", "component1-D9Ej5fM", "()F", "component1", "Landroidx/compose/ui/unit/Density;", "", "fromValue", "toValue", "computeThreshold", TypedValues.CycleType.S_WAVE_OFFSET, "copy-0680j_4", "(F)Landroidx/compose/material/FixedThreshold;", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "F", "<init>", "(FLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class FixedThreshold implements ThresholdConfig {
    public static final int $stable = 0;
    private final float offset;

    private FixedThreshold(float f5) {
        this.offset = f5;
    }

    public /* synthetic */ FixedThreshold(float f5, w wVar) {
        this(f5);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    private final float m1354component1D9Ej5fM() {
        return this.offset;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ FixedThreshold m1355copy0680j_4$default(FixedThreshold fixedThreshold, float f5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = fixedThreshold.offset;
        }
        return fixedThreshold.m1356copy0680j_4(f5);
    }

    @Override // androidx.compose.material.ThresholdConfig
    public float computeThreshold(@l Density density, float f5, float f6) {
        return f5 + (density.mo304toPx0680j_4(this.offset) * Math.signum(f6 - f5));
    }

    @l
    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final FixedThreshold m1356copy0680j_4(float f5) {
        return new FixedThreshold(f5, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedThreshold) && Dp.m6049equalsimpl0(this.offset, ((FixedThreshold) obj).offset);
    }

    public int hashCode() {
        return Dp.m6050hashCodeimpl(this.offset);
    }

    @l
    public String toString() {
        return "FixedThreshold(offset=" + ((Object) Dp.m6055toStringimpl(this.offset)) + ')';
    }
}
