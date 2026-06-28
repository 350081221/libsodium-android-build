package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;

@kotlin.i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/SweepGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/geometry/Offset;", "center", "J", "", "Landroidx/compose/ui/graphics/Color;", "colors", "Ljava/util/List;", "", "stops", "<init>", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class SweepGradient extends ShaderBrush {
    private final long center;

    @p4.l
    private final List<Color> colors;

    @p4.m
    private final List<Float> stops;

    public /* synthetic */ SweepGradient(long j5, List list, List list2, int i5, kotlin.jvm.internal.w wVar) {
        this(j5, list, (i5 & 4) != 0 ? null : list2, null);
    }

    public /* synthetic */ SweepGradient(long j5, List list, List list2, kotlin.jvm.internal.w wVar) {
        this(j5, list, list2);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @p4.l
    /* renamed from: createShader-uvyYCjk */
    public Shader mo3703createShaderuvyYCjk(long j5) {
        boolean z4;
        float m3493getXimpl;
        float m3494getYimpl;
        long Offset;
        if (OffsetKt.m3514isUnspecifiedk4lQ0M(this.center)) {
            Offset = SizeKt.m3572getCenteruvyYCjk(j5);
        } else {
            boolean z5 = true;
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
            if (Offset.m3494getYimpl(this.center) != Float.POSITIVE_INFINITY) {
                z5 = false;
            }
            if (z5) {
                m3494getYimpl = Size.m3559getHeightimpl(j5);
            } else {
                m3494getYimpl = Offset.m3494getYimpl(this.center);
            }
            Offset = OffsetKt.Offset(m3493getXimpl, m3494getYimpl);
        }
        return ShaderKt.m4051SweepGradientShader9KIMszo(Offset, this.colors, this.stops);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        if (Offset.m3490equalsimpl0(this.center, sweepGradient.center) && kotlin.jvm.internal.l0.g(this.colors, sweepGradient.colors) && kotlin.jvm.internal.l0.g(this.stops, sweepGradient.stops)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i5;
        int m3495hashCodeimpl = ((Offset.m3495hashCodeimpl(this.center) * 31) + this.colors.hashCode()) * 31;
        List<Float> list = this.stops;
        if (list != null) {
            i5 = list.hashCode();
        } else {
            i5 = 0;
        }
        return m3495hashCodeimpl + i5;
    }

    @p4.l
    public String toString() {
        String str;
        if (OffsetKt.m3512isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + ((Object) Offset.m3501toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }

    private SweepGradient(long j5, List<Color> list, List<Float> list2) {
        this.center = j5;
        this.colors = list;
        this.stops = list2;
    }
}
