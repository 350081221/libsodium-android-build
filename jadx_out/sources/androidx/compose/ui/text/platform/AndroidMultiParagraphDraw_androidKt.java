package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a^\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aT\u0010\u0014\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "decoration", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Lkotlin/r2;", "drawMultiParagraph-7AXcY_I", "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "drawMultiParagraph", "drawParagraphs-7AXcY_I", "drawParagraphs", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAndroidMultiParagraphDraw.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMultiParagraphDraw.android.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDraw_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n33#2,6:96\n33#2,6:102\n33#2,6:108\n*S KotlinDebug\n*F\n+ 1 AndroidMultiParagraphDraw.android.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDraw_androidKt\n*L\n53#1:96,6\n60#1:102,6\n90#1:108,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidMultiParagraphDraw_androidKt {
    /* renamed from: drawMultiParagraph-7AXcY_I, reason: not valid java name */
    public static final void m5788drawMultiParagraph7AXcY_I(@l MultiParagraph multiParagraph, @l Canvas canvas, @l Brush brush, float f5, @m Shadow shadow, @m TextDecoration textDecoration, @m DrawStyle drawStyle, int i5) {
        canvas.save();
        if (multiParagraph.getParagraphInfoList$ui_text_release().size() <= 1) {
            m5790drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f5, shadow, textDecoration, drawStyle, i5);
        } else if (brush instanceof SolidColor) {
            m5790drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f5, shadow, textDecoration, drawStyle, i5);
        } else if (brush instanceof ShaderBrush) {
            List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
            int size = paragraphInfoList$ui_text_release.size();
            float f6 = 0.0f;
            float f7 = 0.0f;
            for (int i6 = 0; i6 < size; i6++) {
                ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i6);
                f7 += paragraphInfo.getParagraph().getHeight();
                f6 = Math.max(f6, paragraphInfo.getParagraph().getWidth());
            }
            Shader mo3703createShaderuvyYCjk = ((ShaderBrush) brush).mo3703createShaderuvyYCjk(SizeKt.Size(f6, f7));
            Matrix matrix = new Matrix();
            mo3703createShaderuvyYCjk.getLocalMatrix(matrix);
            List<ParagraphInfo> paragraphInfoList$ui_text_release2 = multiParagraph.getParagraphInfoList$ui_text_release();
            int size2 = paragraphInfoList$ui_text_release2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ParagraphInfo paragraphInfo2 = paragraphInfoList$ui_text_release2.get(i7);
                paragraphInfo2.getParagraph().mo5397painthn5TExg(canvas, BrushKt.ShaderBrush(mo3703createShaderuvyYCjk), f5, shadow, textDecoration, drawStyle, i5);
                canvas.translate(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                mo3703createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    /* renamed from: drawMultiParagraph-7AXcY_I$default, reason: not valid java name */
    public static /* synthetic */ void m5789drawMultiParagraph7AXcY_I$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f5, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i5, int i6, Object obj) {
        float f6;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i7;
        if ((i6 & 4) != 0) {
            f6 = Float.NaN;
        } else {
            f6 = f5;
        }
        if ((i6 & 8) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i6 & 16) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i6 & 32) != 0) {
            drawStyle2 = null;
        } else {
            drawStyle2 = drawStyle;
        }
        if ((i6 & 64) != 0) {
            i7 = BlendMode.Companion.m3676getSrcOver0nO6VwU();
        } else {
            i7 = i5;
        }
        m5788drawMultiParagraph7AXcY_I(multiParagraph, canvas, brush, f6, shadow2, textDecoration2, drawStyle2, i7);
    }

    /* renamed from: drawParagraphs-7AXcY_I, reason: not valid java name */
    private static final void m5790drawParagraphs7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f5, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i5) {
        List<ParagraphInfo> paragraphInfoList$ui_text_release = multiParagraph.getParagraphInfoList$ui_text_release();
        int size = paragraphInfoList$ui_text_release.size();
        for (int i6 = 0; i6 < size; i6++) {
            ParagraphInfo paragraphInfo = paragraphInfoList$ui_text_release.get(i6);
            paragraphInfo.getParagraph().mo5397painthn5TExg(canvas, brush, f5, shadow, textDecoration, drawStyle, i5);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}
