package androidx.compose.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.math.d;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/BiasAlignment;", "Landroidx/compose/ui/Alignment;", "horizontalBias", "", "verticalBias", "(FF)V", "getHorizontalBias", "()F", "getVerticalBias", "align", "Landroidx/compose/ui/unit/IntOffset;", "size", "Landroidx/compose/ui/unit/IntSize;", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "component1", "component2", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "Horizontal", "Vertical", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class BiasAlignment implements Alignment {
    public static final int $stable = 0;
    private final float horizontalBias;
    private final float verticalBias;

    @i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/BiasAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "bias", "", "(F)V", "align", "", "size", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "component1", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class Horizontal implements Alignment.Horizontal {
        public static final int $stable = 0;
        private final float bias;

        public Horizontal(float f5) {
            this.bias = f5;
        }

        private final float component1() {
            return this.bias;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, float f5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = horizontal.bias;
            }
            return horizontal.copy(f5);
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public int align(int i5, int i6, @l LayoutDirection layoutDirection) {
            float f5;
            int L0;
            float f6 = (i6 - i5) / 2.0f;
            if (layoutDirection == LayoutDirection.Ltr) {
                f5 = this.bias;
            } else {
                f5 = (-1) * this.bias;
            }
            L0 = d.L0(f6 * (1 + f5));
            return L0;
        }

        @l
        public final Horizontal copy(float f5) {
            return new Horizontal(f5);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.bias, ((Horizontal) obj).bias) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        @l
        public String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }
    }

    @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/BiasAlignment$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "bias", "", "(F)V", "align", "", "size", "space", "component1", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class Vertical implements Alignment.Vertical {
        public static final int $stable = 0;
        private final float bias;

        public Vertical(float f5) {
            this.bias = f5;
        }

        private final float component1() {
            return this.bias;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, float f5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                f5 = vertical.bias;
            }
            return vertical.copy(f5);
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public int align(int i5, int i6) {
            int L0;
            L0 = d.L0(((i6 - i5) / 2.0f) * (1 + this.bias));
            return L0;
        }

        @l
        public final Vertical copy(float f5) {
            return new Vertical(f5);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Vertical) && Float.compare(this.bias, ((Vertical) obj).bias) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        @l
        public String toString() {
            return "Vertical(bias=" + this.bias + ')';
        }
    }

    public BiasAlignment(float f5, float f6) {
        this.horizontalBias = f5;
        this.verticalBias = f6;
    }

    public static /* synthetic */ BiasAlignment copy$default(BiasAlignment biasAlignment, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = biasAlignment.horizontalBias;
        }
        if ((i5 & 2) != 0) {
            f6 = biasAlignment.verticalBias;
        }
        return biasAlignment.copy(f5, f6);
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo3370alignKFBX0sM(long j5, long j6, @l LayoutDirection layoutDirection) {
        float f5;
        int L0;
        int L02;
        float m6214getWidthimpl = (IntSize.m6214getWidthimpl(j6) - IntSize.m6214getWidthimpl(j5)) / 2.0f;
        float m6213getHeightimpl = (IntSize.m6213getHeightimpl(j6) - IntSize.m6213getHeightimpl(j5)) / 2.0f;
        if (layoutDirection == LayoutDirection.Ltr) {
            f5 = this.horizontalBias;
        } else {
            f5 = (-1) * this.horizontalBias;
        }
        float f6 = 1;
        float f7 = m6213getHeightimpl * (f6 + this.verticalBias);
        L0 = d.L0(m6214getWidthimpl * (f5 + f6));
        L02 = d.L0(f7);
        return IntOffsetKt.IntOffset(L0, L02);
    }

    public final float component1() {
        return this.horizontalBias;
    }

    public final float component2() {
        return this.verticalBias;
    }

    @l
    public final BiasAlignment copy(float f5, float f6) {
        return new BiasAlignment(f5, f6);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        return Float.compare(this.horizontalBias, biasAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAlignment.verticalBias) == 0;
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    public int hashCode() {
        return (Float.hashCode(this.horizontalBias) * 31) + Float.hashCode(this.verticalBias);
    }

    @l
    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}
