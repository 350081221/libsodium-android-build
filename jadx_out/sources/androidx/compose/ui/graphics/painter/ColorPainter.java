package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001d\u0010\u0014\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R \u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/painter/ColorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "onDraw", "", "alpha", "", "applyAlpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "J", "getColor-0d7_KjU", "()J", "F", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/geometry/Size;", "intrinsicSize", "getIntrinsicSize-NH-jbRc", "<init>", "(JLkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ColorPainter extends Painter {
    private float alpha;
    private final long color;

    @m
    private ColorFilter colorFilter;
    private final long intrinsicSize;

    private ColorPainter(long j5) {
        this.color = j5;
        this.alpha = 1.0f;
        this.intrinsicSize = Size.Companion.m3570getUnspecifiedNHjbRc();
    }

    public /* synthetic */ ColorPainter(long j5, w wVar) {
        this(j5);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float f5) {
        this.alpha = f5;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(@m ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ColorPainter) && Color.m3735equalsimpl0(this.color, ((ColorPainter) obj).color)) {
            return true;
        }
        return false;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m4351getColor0d7_KjU() {
        return this.color;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo4347getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    public int hashCode() {
        return Color.m3741hashCodeimpl(this.color);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@l DrawScope drawScope) {
        DrawScope.m4272drawRectnJ9OG0$default(drawScope, this.color, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
    }

    @l
    public String toString() {
        return "ColorPainter(color=" + ((Object) Color.m3742toStringimpl(this.color)) + ')';
    }
}
