package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1
            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo4204clipPathmtrdDE(@l Path path, int i5) {
                DrawContext.this.getCanvas().mo3587clipPathmtrdDE(path, i5);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo4205clipRectN_I0leg(float f5, float f6, float f7, float f8, int i5) {
                DrawContext.this.getCanvas().mo3588clipRectN_I0leg(f5, f6, f7, f8, i5);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo4206getCenterF1C5BW0() {
                return SizeKt.m3572getCenteruvyYCjk(mo4207getSizeNHjbRc());
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo4207getSizeNHjbRc() {
                return DrawContext.this.mo4202getSizeNHjbRc();
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void inset(float f5, float f6, float f7, float f8) {
                boolean z4;
                Canvas canvas = DrawContext.this.getCanvas();
                DrawContext drawContext2 = DrawContext.this;
                long Size = SizeKt.Size(Size.m3562getWidthimpl(mo4207getSizeNHjbRc()) - (f7 + f5), Size.m3559getHeightimpl(mo4207getSizeNHjbRc()) - (f8 + f6));
                if (Size.m3562getWidthimpl(Size) >= 0.0f && Size.m3559getHeightimpl(Size) >= 0.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    drawContext2.mo4203setSizeuvyYCjk(Size);
                    canvas.translate(f5, f6);
                    return;
                }
                throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo4208rotateUv8p0NA(float f5, long j5) {
                Canvas canvas = DrawContext.this.getCanvas();
                canvas.translate(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5));
                canvas.rotate(f5);
                canvas.translate(-Offset.m3493getXimpl(j5), -Offset.m3494getYimpl(j5));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo4209scale0AR0LA0(float f5, float f6, long j5) {
                Canvas canvas = DrawContext.this.getCanvas();
                canvas.translate(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5));
                canvas.scale(f5, f6);
                canvas.translate(-Offset.m3493getXimpl(j5), -Offset.m3494getYimpl(j5));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo4210transform58bKbWc(@l float[] fArr) {
                DrawContext.this.getCanvas().mo3589concat58bKbWc(fArr);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void translate(float f5, float f6) {
                DrawContext.this.getCanvas().translate(f5, f6);
            }
        };
    }
}
