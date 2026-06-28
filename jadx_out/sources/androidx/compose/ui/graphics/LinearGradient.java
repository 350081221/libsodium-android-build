package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;

@kotlin.i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"J\u001e\u0010\b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "Landroidx/compose/ui/graphics/Color;", "colors", "Ljava/util/List;", "", "stops", "Landroidx/compose/ui/geometry/Offset;", "start", "J", "end", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "I", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "<init>", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class LinearGradient extends ShaderBrush {

    @p4.l
    private final List<Color> colors;
    private final long end;
    private final long start;

    @p4.m
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j5, long j6, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(list, (i6 & 2) != 0 ? null : list2, j5, j6, (i6 & 16) != 0 ? TileMode.Companion.m4105getClamp3opZhB0() : i5, null);
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j5, long j6, int i5, kotlin.jvm.internal.w wVar) {
        this(list, list2, j5, j6, i5);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @p4.l
    /* renamed from: createShader-uvyYCjk */
    public Shader mo3703createShaderuvyYCjk(long j5) {
        boolean z4;
        float m3493getXimpl;
        boolean z5;
        float m3494getYimpl;
        boolean z6;
        float m3493getXimpl2;
        float m3494getYimpl2;
        boolean z7 = true;
        if (Offset.m3493getXimpl(this.start) == Float.POSITIVE_INFINITY) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            m3493getXimpl = Size.m3562getWidthimpl(j5);
        } else {
            m3493getXimpl = Offset.m3493getXimpl(this.start);
        }
        if (Offset.m3494getYimpl(this.start) == Float.POSITIVE_INFINITY) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            m3494getYimpl = Size.m3559getHeightimpl(j5);
        } else {
            m3494getYimpl = Offset.m3494getYimpl(this.start);
        }
        if (Offset.m3493getXimpl(this.end) == Float.POSITIVE_INFINITY) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            m3493getXimpl2 = Size.m3562getWidthimpl(j5);
        } else {
            m3493getXimpl2 = Offset.m3493getXimpl(this.end);
        }
        if (Offset.m3494getYimpl(this.end) != Float.POSITIVE_INFINITY) {
            z7 = false;
        }
        if (z7) {
            m3494getYimpl2 = Size.m3559getHeightimpl(j5);
        } else {
            m3494getYimpl2 = Offset.m3494getYimpl(this.end);
        }
        return ShaderKt.m4047LinearGradientShaderVjE6UOU(OffsetKt.Offset(m3493getXimpl, m3494getYimpl), OffsetKt.Offset(m3493getXimpl2, m3494getYimpl2), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        if (kotlin.jvm.internal.l0.g(this.colors, linearGradient.colors) && kotlin.jvm.internal.l0.g(this.stops, linearGradient.stops) && Offset.m3490equalsimpl0(this.start, linearGradient.start) && Offset.m3490equalsimpl0(this.end, linearGradient.end) && TileMode.m4101equalsimpl0(this.tileMode, linearGradient.tileMode)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo3682getIntrinsicSizeNHjbRc() {
        /*
            r6 = this;
            long r0 = r6.start
            float r0 = androidx.compose.ui.geometry.Offset.m3493getXimpl(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r3
        L17:
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L44
            long r4 = r6.end
            float r0 = androidx.compose.ui.geometry.Offset.m3493getXimpl(r4)
            boolean r4 = java.lang.Float.isInfinite(r0)
            if (r4 != 0) goto L2f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L2f
            r0 = r2
            goto L30
        L2f:
            r0 = r3
        L30:
            if (r0 == 0) goto L44
            long r4 = r6.start
            float r0 = androidx.compose.ui.geometry.Offset.m3493getXimpl(r4)
            long r4 = r6.end
            float r4 = androidx.compose.ui.geometry.Offset.m3493getXimpl(r4)
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            goto L45
        L44:
            r0 = r1
        L45:
            long r4 = r6.start
            float r4 = androidx.compose.ui.geometry.Offset.m3494getYimpl(r4)
            boolean r5 = java.lang.Float.isInfinite(r4)
            if (r5 != 0) goto L59
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L59
            r4 = r2
            goto L5a
        L59:
            r4 = r3
        L5a:
            if (r4 == 0) goto L83
            long r4 = r6.end
            float r4 = androidx.compose.ui.geometry.Offset.m3494getYimpl(r4)
            boolean r5 = java.lang.Float.isInfinite(r4)
            if (r5 != 0) goto L6f
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L6f
            goto L70
        L6f:
            r2 = r3
        L70:
            if (r2 == 0) goto L83
            long r1 = r6.start
            float r1 = androidx.compose.ui.geometry.Offset.m3494getYimpl(r1)
            long r2 = r6.end
            float r2 = androidx.compose.ui.geometry.Offset.m3494getYimpl(r2)
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
        L83:
            long r0 = androidx.compose.ui.geometry.SizeKt.Size(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.LinearGradient.mo3682getIntrinsicSizeNHjbRc():long");
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
        return ((((((hashCode + i5) * 31) + Offset.m3495hashCodeimpl(this.start)) * 31) + Offset.m3495hashCodeimpl(this.end)) * 31) + TileMode.m4102hashCodeimpl(this.tileMode);
    }

    @p4.l
    public String toString() {
        String str;
        String str2 = "";
        if (!OffsetKt.m3510isFinitek4lQ0M(this.start)) {
            str = "";
        } else {
            str = "start=" + ((Object) Offset.m3501toStringimpl(this.start)) + ", ";
        }
        if (OffsetKt.m3510isFinitek4lQ0M(this.end)) {
            str2 = "end=" + ((Object) Offset.m3501toStringimpl(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m4103toStringimpl(this.tileMode)) + ')';
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j5, long j6, int i5) {
        this.colors = list;
        this.stops = list2;
        this.start = j5;
        this.end = j6;
        this.tileMode = i5;
    }
}
