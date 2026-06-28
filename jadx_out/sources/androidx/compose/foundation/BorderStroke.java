package androidx.compose.foundation;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/BorderStroke;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/ui/graphics/Brush;", "brush", "copy-D5KLDUw", "(FLandroidx/compose/ui/graphics/Brush;)Landroidx/compose/foundation/BorderStroke;", "copy", "F", "getWidth-D9Ej5fM", "()F", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class BorderStroke {
    public static final int $stable = 0;

    @p4.l
    private final Brush brush;
    private final float width;

    private BorderStroke(float f5, Brush brush) {
        this.width = f5;
        this.brush = brush;
    }

    public /* synthetic */ BorderStroke(float f5, Brush brush, w wVar) {
        this(f5, brush);
    }

    /* renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m225copyD5KLDUw$default(BorderStroke borderStroke, float f5, Brush brush, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = borderStroke.width;
        }
        if ((i5 & 2) != 0) {
            brush = borderStroke.brush;
        }
        return borderStroke.m226copyD5KLDUw(f5, brush);
    }

    @p4.l
    /* renamed from: copy-D5KLDUw, reason: not valid java name */
    public final BorderStroke m226copyD5KLDUw(float f5, @p4.l Brush brush) {
        return new BorderStroke(f5, brush, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) obj;
        if (Dp.m6049equalsimpl0(this.width, borderStroke.width) && l0.g(this.brush, borderStroke.brush)) {
            return true;
        }
        return false;
    }

    @p4.l
    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m227getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (Dp.m6050hashCodeimpl(this.width) * 31) + this.brush.hashCode();
    }

    @p4.l
    public String toString() {
        return "BorderStroke(width=" + ((Object) Dp.m6055toStringimpl(this.width)) + ", brush=" + this.brush + ')';
    }
}
