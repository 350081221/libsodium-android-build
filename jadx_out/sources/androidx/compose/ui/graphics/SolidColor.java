package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001d\u0010\u0015\u001a\u00020\u00148\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/graphics/SolidColor;", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/Paint;", bi.aA, "", "alpha", "Lkotlin/r2;", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/graphics/Color;", t0.b.f22420d, "J", "getValue-0d7_KjU", "()J", "<init>", "(JLkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class SolidColor extends Brush {
    private final long value;

    private SolidColor(long j5) {
        super(null);
        this.value = j5;
    }

    public /* synthetic */ SolidColor(long j5, kotlin.jvm.internal.w wVar) {
        this(j5);
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public void mo3681applyToPq9zytI(long j5, @p4.l Paint paint, float f5) {
        boolean z4;
        long j6;
        paint.setAlpha(1.0f);
        if (f5 == 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            long j7 = this.value;
            j6 = Color.m3733copywmQWz5c$default(j7, Color.m3736getAlphaimpl(j7) * f5, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j6 = this.value;
        }
        paint.mo3613setColor8_81llA(j6);
        if (paint.getShader() != null) {
            paint.setShader(null);
        }
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SolidColor) && Color.m3735equalsimpl0(this.value, ((SolidColor) obj).value)) {
            return true;
        }
        return false;
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m4067getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m3741hashCodeimpl(this.value);
    }

    @p4.l
    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m3742toStringimpl(this.value)) + ')';
    }
}
