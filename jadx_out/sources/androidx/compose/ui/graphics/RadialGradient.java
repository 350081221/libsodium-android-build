package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;

@kotlin.i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J\u001e\u0010\b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "Landroidx/compose/ui/graphics/Color;", "colors", "Ljava/util/List;", "", "stops", "Landroidx/compose/ui/geometry/Offset;", "center", "J", "radius", "F", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "I", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "<init>", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class RadialGradient extends ShaderBrush {
    private final long center;

    @p4.l
    private final List<Color> colors;
    private final float radius;

    @p4.m
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List list, List list2, long j5, float f5, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(list, (i6 & 2) != 0 ? null : list2, j5, f5, (i6 & 16) != 0 ? TileMode.Companion.m4105getClamp3opZhB0() : i5, null);
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j5, float f5, int i5, kotlin.jvm.internal.w wVar) {
        this(list, list2, j5, f5, i5);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @p4.l
    /* renamed from: createShader-uvyYCjk */
    public Shader mo3703createShaderuvyYCjk(long j5) {
        boolean z4;
        float m3493getXimpl;
        boolean z5;
        float m3494getYimpl;
        float f5;
        boolean z6 = true;
        if (OffsetKt.m3514isUnspecifiedk4lQ0M(this.center)) {
            long m3572getCenteruvyYCjk = SizeKt.m3572getCenteruvyYCjk(j5);
            m3493getXimpl = Offset.m3493getXimpl(m3572getCenteruvyYCjk);
            m3494getYimpl = Offset.m3494getYimpl(m3572getCenteruvyYCjk);
        } else {
            if (Offset.m3493getXimpl(this.center) == Float.POSITIVE_INFINITY) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                m3493getXimpl = Size.m3562getWidthimpl(j5);
            } else {
                m3493getXimpl = Offset.m3493getXimpl(this.center);
            }
            if (Offset.m3494getYimpl(this.center) == Float.POSITIVE_INFINITY) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                m3494getYimpl = Size.m3559getHeightimpl(j5);
            } else {
                m3494getYimpl = Offset.m3494getYimpl(this.center);
            }
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long Offset = OffsetKt.Offset(m3493getXimpl, m3494getYimpl);
        float f6 = this.radius;
        if (f6 != Float.POSITIVE_INFINITY) {
            z6 = false;
        }
        if (z6) {
            f5 = Size.m3561getMinDimensionimpl(j5) / 2;
        } else {
            f5 = f6;
        }
        return ShaderKt.m4049RadialGradientShader8uybcMk(Offset, f5, list, list2, this.tileMode);
    }

    public boolean equals(@p4.m Object obj) {
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        if (!kotlin.jvm.internal.l0.g(this.colors, radialGradient.colors) || !kotlin.jvm.internal.l0.g(this.stops, radialGradient.stops) || !Offset.m3490equalsimpl0(this.center, radialGradient.center)) {
            return false;
        }
        if (this.radius == radialGradient.radius) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && TileMode.m4101equalsimpl0(this.tileMode, radialGradient.tileMode)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo3682getIntrinsicSizeNHjbRc() {
        float f5 = this.radius;
        if (!((Float.isInfinite(f5) || Float.isNaN(f5)) ? false : true)) {
            return Size.Companion.m3570getUnspecifiedNHjbRc();
        }
        float f6 = this.radius;
        float f7 = 2;
        return SizeKt.Size(f6 * f7, f6 * f7);
    }

    public int hashCode() {
        int i5;
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        if (list != null) {
            i5 = list.hashCode();
        } else {
            i5 = 0;
        }
        return ((((((hashCode + i5) * 31) + Offset.m3495hashCodeimpl(this.center)) * 31) + Float.hashCode(this.radius)) * 31) + TileMode.m4102hashCodeimpl(this.tileMode);
    }

    @p4.l
    public String toString() {
        String str;
        boolean z4;
        String str2 = "";
        if (!OffsetKt.m3512isSpecifiedk4lQ0M(this.center)) {
            str = "";
        } else {
            str = "center=" + ((Object) Offset.m3501toStringimpl(this.center)) + ", ";
        }
        float f5 = this.radius;
        if (!Float.isInfinite(f5) && !Float.isNaN(f5)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m4103toStringimpl(this.tileMode)) + ')';
    }

    private RadialGradient(List<Color> list, List<Float> list2, long j5, float f5, int i5) {
        this.colors = list;
        this.stops = list2;
        this.center = j5;
        this.radius = f5;
        this.tileMode = i5;
    }
}
