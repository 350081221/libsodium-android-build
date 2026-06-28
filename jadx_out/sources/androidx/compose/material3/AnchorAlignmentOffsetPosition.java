package androidx.compose.material3;

import androidx.compose.material3.MenuPosition;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/AnchorAlignmentOffsetPosition;", "", "()V", "Horizontal", "Vertical", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class AnchorAlignmentOffsetPosition {
    public static final int $stable = 0;

    @p4.l
    public static final AnchorAlignmentOffsetPosition INSTANCE = new AnchorAlignmentOffsetPosition();

    @kotlin.i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\t\u0010\n\u001a\u00020\u0006HÂ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J2\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Horizontal;", "Landroidx/compose/material3/MenuPosition$Horizontal;", "menuAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "anchorAlignment", TypedValues.CycleType.S_WAVE_OFFSET, "", "(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "position", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "menuWidth", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "position-95KtPRI", "(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class Horizontal implements MenuPosition.Horizontal {
        public static final int $stable = 0;

        @p4.l
        private final Alignment.Horizontal anchorAlignment;

        @p4.l
        private final Alignment.Horizontal menuAlignment;
        private final int offset;

        public Horizontal(@p4.l Alignment.Horizontal horizontal, @p4.l Alignment.Horizontal horizontal2, int i5) {
            this.menuAlignment = horizontal;
            this.anchorAlignment = horizontal2;
            this.offset = i5;
        }

        private final Alignment.Horizontal component1() {
            return this.menuAlignment;
        }

        private final Alignment.Horizontal component2() {
            return this.anchorAlignment;
        }

        private final int component3() {
            return this.offset;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, Alignment.Horizontal horizontal2, Alignment.Horizontal horizontal3, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                horizontal2 = horizontal.menuAlignment;
            }
            if ((i6 & 2) != 0) {
                horizontal3 = horizontal.anchorAlignment;
            }
            if ((i6 & 4) != 0) {
                i5 = horizontal.offset;
            }
            return horizontal.copy(horizontal2, horizontal3, i5);
        }

        @p4.l
        public final Horizontal copy(@p4.l Alignment.Horizontal horizontal, @p4.l Alignment.Horizontal horizontal2, int i5) {
            return new Horizontal(horizontal, horizontal2, i5);
        }

        public boolean equals(@p4.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) obj;
            return kotlin.jvm.internal.l0.g(this.menuAlignment, horizontal.menuAlignment) && kotlin.jvm.internal.l0.g(this.anchorAlignment, horizontal.anchorAlignment) && this.offset == horizontal.offset;
        }

        public int hashCode() {
            return (((this.menuAlignment.hashCode() * 31) + this.anchorAlignment.hashCode()) * 31) + Integer.hashCode(this.offset);
        }

        @Override // androidx.compose.material3.MenuPosition.Horizontal
        /* renamed from: position-95KtPRI, reason: not valid java name */
        public int mo1550position95KtPRI(@p4.l IntRect intRect, long j5, int i5, @p4.l LayoutDirection layoutDirection) {
            int i6;
            int align = this.anchorAlignment.align(0, intRect.getWidth(), layoutDirection);
            int i7 = -this.menuAlignment.align(0, i5, layoutDirection);
            if (layoutDirection == LayoutDirection.Ltr) {
                i6 = this.offset;
            } else {
                i6 = -this.offset;
            }
            return intRect.getLeft() + align + i7 + i6;
        }

        @p4.l
        public String toString() {
            return "Horizontal(menuAlignment=" + this.menuAlignment + ", anchorAlignment=" + this.anchorAlignment + ", offset=" + this.offset + ')';
        }
    }

    @kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\t\u0010\n\u001a\u00020\u0006HÂ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/AnchorAlignmentOffsetPosition$Vertical;", "Landroidx/compose/material3/MenuPosition$Vertical;", "menuAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "anchorAlignment", TypedValues.CycleType.S_WAVE_OFFSET, "", "(Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Vertical;I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "position", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "menuHeight", "position-JVtK1S4", "(Landroidx/compose/ui/unit/IntRect;JI)I", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Immutable
    /* loaded from: classes.dex */
    public static final class Vertical implements MenuPosition.Vertical {
        public static final int $stable = 0;

        @p4.l
        private final Alignment.Vertical anchorAlignment;

        @p4.l
        private final Alignment.Vertical menuAlignment;
        private final int offset;

        public Vertical(@p4.l Alignment.Vertical vertical, @p4.l Alignment.Vertical vertical2, int i5) {
            this.menuAlignment = vertical;
            this.anchorAlignment = vertical2;
            this.offset = i5;
        }

        private final Alignment.Vertical component1() {
            return this.menuAlignment;
        }

        private final Alignment.Vertical component2() {
            return this.anchorAlignment;
        }

        private final int component3() {
            return this.offset;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, Alignment.Vertical vertical2, Alignment.Vertical vertical3, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                vertical2 = vertical.menuAlignment;
            }
            if ((i6 & 2) != 0) {
                vertical3 = vertical.anchorAlignment;
            }
            if ((i6 & 4) != 0) {
                i5 = vertical.offset;
            }
            return vertical.copy(vertical2, vertical3, i5);
        }

        @p4.l
        public final Vertical copy(@p4.l Alignment.Vertical vertical, @p4.l Alignment.Vertical vertical2, int i5) {
            return new Vertical(vertical, vertical2, i5);
        }

        public boolean equals(@p4.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) obj;
            return kotlin.jvm.internal.l0.g(this.menuAlignment, vertical.menuAlignment) && kotlin.jvm.internal.l0.g(this.anchorAlignment, vertical.anchorAlignment) && this.offset == vertical.offset;
        }

        public int hashCode() {
            return (((this.menuAlignment.hashCode() * 31) + this.anchorAlignment.hashCode()) * 31) + Integer.hashCode(this.offset);
        }

        @Override // androidx.compose.material3.MenuPosition.Vertical
        /* renamed from: position-JVtK1S4, reason: not valid java name */
        public int mo1551positionJVtK1S4(@p4.l IntRect intRect, long j5, int i5) {
            int align = this.anchorAlignment.align(0, intRect.getHeight());
            return intRect.getTop() + align + (-this.menuAlignment.align(0, i5)) + this.offset;
        }

        @p4.l
        public String toString() {
            return "Vertical(menuAlignment=" + this.menuAlignment + ", anchorAlignment=" + this.anchorAlignment + ", offset=" + this.offset + ')';
        }
    }

    private AnchorAlignmentOffsetPosition() {
    }
}
