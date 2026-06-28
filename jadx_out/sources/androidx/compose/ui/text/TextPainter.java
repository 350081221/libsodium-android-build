package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Lkotlin/r2;", "paint", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextPainter {
    public static final int $stable = 0;

    @l
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    public final void paint(@l Canvas canvas, @l TextLayoutResult textLayoutResult) {
        boolean z4;
        long m3760getBlack0d7_KjU;
        float f5;
        if (textLayoutResult.getHasVisualOverflow() && !TextOverflow.m5978equalsimpl0(textLayoutResult.getLayoutInput().m5514getOverflowgIe3tQ8(), TextOverflow.Companion.m5987getVisiblegIe3tQ8())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            Rect m3533Recttz77jQw = RectKt.m3533Recttz77jQw(Offset.Companion.m3509getZeroF1C5BW0(), SizeKt.Size(IntSize.m6214getWidthimpl(textLayoutResult.m5518getSizeYbymL2g()), IntSize.m6213getHeightimpl(textLayoutResult.m5518getSizeYbymL2g())));
            canvas.save();
            Canvas.m3707clipRectmtrdDE$default(canvas, m3533Recttz77jQw, 0, 2, null);
        }
        SpanStyle spanStyle$ui_text_release = textLayoutResult.getLayoutInput().getStyle().getSpanStyle$ui_text_release();
        TextDecoration textDecoration = spanStyle$ui_text_release.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle$ui_text_release.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        DrawStyle drawStyle = spanStyle$ui_text_release.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        try {
            Brush brush = spanStyle$ui_text_release.getBrush();
            if (brush != null) {
                if (spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release() != TextForegroundStyle.Unspecified.INSTANCE) {
                    f5 = spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release().getAlpha();
                } else {
                    f5 = 1.0f;
                }
                MultiParagraph.m5420painthn5TExg$default(textLayoutResult.getMultiParagraph(), canvas, brush, f5, shadow2, textDecoration2, drawStyle2, 0, 64, null);
            } else {
                if (spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release() != TextForegroundStyle.Unspecified.INSTANCE) {
                    m3760getBlack0d7_KjU = spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release().mo5834getColor0d7_KjU();
                } else {
                    m3760getBlack0d7_KjU = Color.Companion.m3760getBlack0d7_KjU();
                }
                MultiParagraph.m5418paintLG529CI$default(textLayoutResult.getMultiParagraph(), canvas, m3760getBlack0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
            }
        } finally {
            if (z4) {
                canvas.restore();
            }
        }
    }
}
