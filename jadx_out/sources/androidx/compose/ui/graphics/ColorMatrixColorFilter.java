package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Arrays;

@kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0019J\u0015\u0010\u0005\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrixColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/ColorMatrix;", "obtainColorMatrix-p10-uLo", "()[F", "obtainColorMatrix", "targetColorMatrix", "copyColorMatrix-gBh15pI", "([F)[F", "copyColorMatrix", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "colorMatrix", "[F", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "([FLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/w;)V", "([FLkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class ColorMatrixColorFilter extends ColorFilter {

    @p4.m
    private float[] colorMatrix;

    private ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.colorMatrix = fArr;
    }

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter, kotlin.jvm.internal.w wVar) {
        this(fArr, colorFilter);
    }

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, kotlin.jvm.internal.w wVar) {
        this(fArr);
    }

    /* renamed from: copyColorMatrix-gBh15pI$default, reason: not valid java name */
    public static /* synthetic */ float[] m3811copyColorMatrixgBh15pI$default(ColorMatrixColorFilter colorMatrixColorFilter, float[] fArr, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            fArr = ColorMatrix.m3791constructorimpl$default(null, 1, null);
        }
        return colorMatrixColorFilter.m3813copyColorMatrixgBh15pI(fArr);
    }

    /* renamed from: obtainColorMatrix-p10-uLo, reason: not valid java name */
    private final float[] m3812obtainColorMatrixp10uLo() {
        float[] fArr = this.colorMatrix;
        if (fArr == null) {
            float[] actualColorMatrixFromFilter = AndroidColorFilter_androidKt.actualColorMatrixFromFilter(getNativeColorFilter$ui_graphics_release());
            this.colorMatrix = actualColorMatrixFromFilter;
            return actualColorMatrixFromFilter;
        }
        return fArr;
    }

    @p4.l
    /* renamed from: copyColorMatrix-gBh15pI, reason: not valid java name */
    public final float[] m3813copyColorMatrixgBh15pI(@p4.l float[] fArr) {
        kotlin.collections.o.H0(m3812obtainColorMatrixp10uLo(), fArr, 0, 0, 0, 14, null);
        return fArr;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ColorMatrixColorFilter) && Arrays.equals(m3812obtainColorMatrixp10uLo(), ((ColorMatrixColorFilter) obj).m3812obtainColorMatrixp10uLo())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return ColorMatrix.m3798hashCodeimpl(fArr);
        }
        return 0;
    }

    @p4.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.colorMatrix;
        sb.append((Object) (fArr == null ? "null" : ColorMatrix.m3809toStringimpl(fArr)));
        sb.append(')');
        return sb.toString();
    }

    private ColorMatrixColorFilter(float[] fArr) {
        this(fArr, AndroidColorFilter_androidKt.m3598actualColorMatrixColorFilterjHGOpc(fArr), null);
    }
}
