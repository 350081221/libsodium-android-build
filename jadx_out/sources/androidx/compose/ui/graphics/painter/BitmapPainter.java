package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.math.d;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\"\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u000b\u001a\u00020\n*\u00020\tH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\u0013\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR(\u0010\u001f\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010&R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u001a\u0010+\u001a\u00020(8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "validateSize-N5eqBDc", "(JJ)J", "validateSize", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "onDraw", "", "alpha", "", "applyAlpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "J", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "I", "getFilterQuality-f-v9h1I$ui_graphics_release", "()I", "setFilterQuality-vDHp3xo$ui_graphics_release", "(I)V", "size", "F", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "<init>", "(Landroidx/compose/ui/graphics/ImageBitmap;JJLkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BitmapPainter extends Painter {
    private float alpha;

    @m
    private ColorFilter colorFilter;
    private int filterQuality;

    @l
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j5, long j6, int i5, w wVar) {
        this(imageBitmap, (i5 & 2) != 0 ? IntOffset.Companion.m6182getZeronOccac() : j5, (i5 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j6, null);
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j5, long j6, w wVar) {
        this(imageBitmap, j5, j6);
    }

    /* renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m4345validateSizeN5eqBDc(long j5, long j6) {
        boolean z4;
        if (IntOffset.m6172getXimpl(j5) >= 0 && IntOffset.m6173getYimpl(j5) >= 0 && IntSize.m6214getWidthimpl(j6) >= 0 && IntSize.m6213getHeightimpl(j6) >= 0 && IntSize.m6214getWidthimpl(j6) <= this.image.getWidth() && IntSize.m6213getHeightimpl(j6) <= this.image.getHeight()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return j6;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
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
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        if (l0.g(this.image, bitmapPainter.image) && IntOffset.m6171equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m6212equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m3828equalsimpl0(this.filterQuality, bitmapPainter.filterQuality)) {
            return true;
        }
        return false;
    }

    /* renamed from: getFilterQuality-f-v9h1I$ui_graphics_release, reason: not valid java name */
    public final int m4346getFilterQualityfv9h1I$ui_graphics_release() {
        return this.filterQuality;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo4347getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m6224toSizeozmzZPI(this.size);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + IntOffset.m6174hashCodeimpl(this.srcOffset)) * 31) + IntSize.m6215hashCodeimpl(this.srcSize)) * 31) + FilterQuality.m3829hashCodeimpl(this.filterQuality);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@l DrawScope drawScope) {
        int L0;
        int L02;
        ImageBitmap imageBitmap = this.image;
        long j5 = this.srcOffset;
        long j6 = this.srcSize;
        L0 = d.L0(Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc()));
        L02 = d.L0(Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc()));
        DrawScope.m4261drawImageAZ2fEMs$default(drawScope, imageBitmap, j5, j6, 0L, IntSizeKt.IntSize(L0, L02), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    /* renamed from: setFilterQuality-vDHp3xo$ui_graphics_release, reason: not valid java name */
    public final void m4348setFilterQualityvDHp3xo$ui_graphics_release(int i5) {
        this.filterQuality = i5;
    }

    @l
    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) IntOffset.m6179toStringimpl(this.srcOffset)) + ", srcSize=" + ((Object) IntSize.m6217toStringimpl(this.srcSize)) + ", filterQuality=" + ((Object) FilterQuality.m3830toStringimpl(this.filterQuality)) + ')';
    }

    private BitmapPainter(ImageBitmap imageBitmap, long j5, long j6) {
        this.image = imageBitmap;
        this.srcOffset = j5;
        this.srcSize = j6;
        this.filterQuality = FilterQuality.Companion.m3833getLowfv9h1I();
        this.size = m4345validateSizeN5eqBDc(j5, j6);
        this.alpha = 1.0f;
    }
}
