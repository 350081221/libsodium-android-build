package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnParentData;", "", "weight", "", "fill", "", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "(FZLandroidx/compose/foundation/layout/CrossAxisAlignment;)V", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "setCrossAxisAlignment", "(Landroidx/compose/foundation/layout/CrossAxisAlignment;)V", "getFill", "()Z", "setFill", "(Z)V", "getWeight", "()F", "setWeight", "(F)V", "component1", "component2", "component3", "copy", "equals", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RowColumnParentData {
    public static final int $stable = 8;

    @m
    private CrossAxisAlignment crossAxisAlignment;
    private boolean fill;
    private float weight;

    public RowColumnParentData() {
        this(0.0f, false, null, 7, null);
    }

    public RowColumnParentData(float f5, boolean z4, @m CrossAxisAlignment crossAxisAlignment) {
        this.weight = f5;
        this.fill = z4;
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public static /* synthetic */ RowColumnParentData copy$default(RowColumnParentData rowColumnParentData, float f5, boolean z4, CrossAxisAlignment crossAxisAlignment, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = rowColumnParentData.weight;
        }
        if ((i5 & 2) != 0) {
            z4 = rowColumnParentData.fill;
        }
        if ((i5 & 4) != 0) {
            crossAxisAlignment = rowColumnParentData.crossAxisAlignment;
        }
        return rowColumnParentData.copy(f5, z4, crossAxisAlignment);
    }

    public final float component1() {
        return this.weight;
    }

    public final boolean component2() {
        return this.fill;
    }

    @m
    public final CrossAxisAlignment component3() {
        return this.crossAxisAlignment;
    }

    @l
    public final RowColumnParentData copy(float f5, boolean z4, @m CrossAxisAlignment crossAxisAlignment) {
        return new RowColumnParentData(f5, z4, crossAxisAlignment);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
        return Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && l0.g(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment);
    }

    @m
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int hashCode = ((Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill)) * 31;
        CrossAxisAlignment crossAxisAlignment = this.crossAxisAlignment;
        return hashCode + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode());
    }

    public final void setCrossAxisAlignment(@m CrossAxisAlignment crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public final void setFill(boolean z4) {
        this.fill = z4;
    }

    public final void setWeight(float f5) {
        this.weight = f5;
    }

    @l
    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ')';
    }

    public /* synthetic */ RowColumnParentData(float f5, boolean z4, CrossAxisAlignment crossAxisAlignment, int i5, w wVar) {
        this((i5 & 1) != 0 ? 0.0f : f5, (i5 & 2) != 0 ? true : z4, (i5 & 4) != 0 ? null : crossAxisAlignment);
    }
}
