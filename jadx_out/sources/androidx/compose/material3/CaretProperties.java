package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@Stable
@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0005\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0004J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0016\u0010\u0004\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/CaretProperties;", "", "Landroidx/compose/ui/unit/Dp;", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "caretHeight", "caretWidth", "copy-YgX7TsA", "(FF)Landroidx/compose/material3/CaretProperties;", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "F", "getCaretHeight-D9Ej5fM", "getCaretWidth-D9Ej5fM", "<init>", "(FFLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class CaretProperties {
    public static final int $stable = 0;
    private final float caretHeight;
    private final float caretWidth;

    private CaretProperties(float f5, float f6) {
        this.caretHeight = f5;
        this.caretWidth = f6;
    }

    public /* synthetic */ CaretProperties(float f5, float f6, kotlin.jvm.internal.w wVar) {
        this(f5, f6);
    }

    /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ CaretProperties m1622copyYgX7TsA$default(CaretProperties caretProperties, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = caretProperties.caretHeight;
        }
        if ((i5 & 2) != 0) {
            f6 = caretProperties.caretWidth;
        }
        return caretProperties.m1625copyYgX7TsA(f5, f6);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m1623component1D9Ej5fM() {
        return this.caretHeight;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m1624component2D9Ej5fM() {
        return this.caretWidth;
    }

    @p4.l
    /* renamed from: copy-YgX7TsA, reason: not valid java name */
    public final CaretProperties m1625copyYgX7TsA(float f5, float f6) {
        return new CaretProperties(f5, f6, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaretProperties)) {
            return false;
        }
        CaretProperties caretProperties = (CaretProperties) obj;
        return Dp.m6049equalsimpl0(this.caretHeight, caretProperties.caretHeight) && Dp.m6049equalsimpl0(this.caretWidth, caretProperties.caretWidth);
    }

    /* renamed from: getCaretHeight-D9Ej5fM, reason: not valid java name */
    public final float m1626getCaretHeightD9Ej5fM() {
        return this.caretHeight;
    }

    /* renamed from: getCaretWidth-D9Ej5fM, reason: not valid java name */
    public final float m1627getCaretWidthD9Ej5fM() {
        return this.caretWidth;
    }

    public int hashCode() {
        return (Dp.m6050hashCodeimpl(this.caretHeight) * 31) + Dp.m6050hashCodeimpl(this.caretWidth);
    }

    @p4.l
    public String toString() {
        return "CaretProperties(caretHeight=" + ((Object) Dp.m6055toStringimpl(this.caretHeight)) + ", caretWidth=" + ((Object) Dp.m6055toStringimpl(this.caretWidth)) + ')';
    }
}
