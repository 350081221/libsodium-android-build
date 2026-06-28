package androidx.compose.ui.text;

import androidx.annotation.IntRange;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&J\u001a\u0010\u0015\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0013H&J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000bH&J\u001a\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH&ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H&J,\u0010-\u001a\u00020*2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\b\b\u0001\u0010)\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001d\u00100\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\u0002H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J<\u0010;\u001a\u00020*2\u0006\u00102\u001a\u0002012\b\b\u0002\u00104\u001a\u0002032\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00108\u001a\u0004\u0018\u000107H&ø\u0001\u0000¢\u0006\u0004\b9\u0010:JR\u0010;\u001a\u00020*2\u0006\u00102\u001a\u0002012\b\b\u0002\u00104\u001a\u0002032\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\b\b\u0002\u0010?\u001a\u00020>H&ø\u0001\u0000¢\u0006\u0004\b@\u0010AJZ\u0010;\u001a\u00020*2\u0006\u00102\u001a\u0002012\u0006\u0010C\u001a\u00020B2\b\b\u0002\u0010D\u001a\u00020\u000b2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\b\b\u0002\u0010?\u001a\u00020>H&ø\u0001\u0000¢\u0006\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0014\u0010M\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010HR\u0014\u0010O\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010HR\u0014\u0010Q\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010HR\u0014\u0010S\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010HR\u0014\u0010V\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001c\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\\u0082\u0001\u0001^ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006_À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/Paragraph;", "", "", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Rect;", "getCursorRect", "lineIndex", "", "getLineLeft", "getLineRight", "getLineTop", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "", "visibleEnd", "getLineEnd", "isLineEllipsized", "getLineForOffset", "usePrimaryDirection", "getHorizontalPosition", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "getBidiRunDirection", "vertical", "getLineForVerticalPosition", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "getBoundingBox", "Landroidx/compose/ui/text/TextRange;", "range", "", "array", "arrayStart", "Lkotlin/r2;", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "fillBoundingBoxes", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "getWidth", "()F", "width", "getHeight", "height", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "getDidExceedMaxLines", "()Z", "didExceedMaxLines", "getLineCount", "()I", "lineCount", "", "getPlaceholderRects", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/AndroidParagraph;", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface Paragraph {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ int getLineEnd$default(Paragraph paragraph, int i5, boolean z4, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        return paragraph.getLineEnd(i5, z4);
    }

    /* renamed from: paint-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m5428paintLG529CI$default(Paragraph paragraph, Canvas canvas, long j5, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i5, int i6, Object obj) {
        long j6;
        Shadow shadow2;
        TextDecoration textDecoration2;
        int i7;
        if (obj == null) {
            if ((i6 & 2) != 0) {
                j6 = Color.Companion.m3770getUnspecified0d7_KjU();
            } else {
                j6 = j5;
            }
            DrawStyle drawStyle2 = null;
            if ((i6 & 4) != 0) {
                shadow2 = null;
            } else {
                shadow2 = shadow;
            }
            if ((i6 & 8) != 0) {
                textDecoration2 = null;
            } else {
                textDecoration2 = textDecoration;
            }
            if ((i6 & 16) == 0) {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 32) != 0) {
                i7 = DrawScope.Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            paragraph.mo5395paintLG529CI(canvas, j6, shadow2, textDecoration2, drawStyle2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    static /* synthetic */ void m5429paintRPmYEkk$default(Paragraph paragraph, Canvas canvas, long j5, Shadow shadow, TextDecoration textDecoration, int i5, Object obj) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        if (obj == null) {
            if ((i5 & 2) != 0) {
                j5 = Color.Companion.m3770getUnspecified0d7_KjU();
            }
            long j6 = j5;
            if ((i5 & 4) != 0) {
                shadow2 = null;
            } else {
                shadow2 = shadow;
            }
            if ((i5 & 8) != 0) {
                textDecoration2 = null;
            } else {
                textDecoration2 = textDecoration;
            }
            paragraph.mo5396paintRPmYEkk(canvas, j6, shadow2, textDecoration2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    static /* synthetic */ void m5430painthn5TExg$default(Paragraph paragraph, Canvas canvas, Brush brush, float f5, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i5, int i6, Object obj) {
        float f6;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i7;
        if (obj == null) {
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
                i7 = DrawScope.Companion.m4278getDefaultBlendMode0nO6VwU();
            } else {
                i7 = i5;
            }
            paragraph.mo5397painthn5TExg(canvas, brush, f6, shadow2, textDecoration2, drawStyle2, i7);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q */
    void mo5391fillBoundingBoxes8ffj60Q(long j5, @l float[] fArr, @IntRange(from = 0) int i5);

    @l
    ResolvedTextDirection getBidiRunDirection(int i5);

    @l
    Rect getBoundingBox(int i5);

    @l
    Rect getCursorRect(int i5);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int i5, boolean z4);

    float getLastBaseline();

    float getLineBottom(int i5);

    int getLineCount();

    int getLineEnd(int i5, boolean z4);

    int getLineForOffset(int i5);

    int getLineForVerticalPosition(float f5);

    float getLineHeight(int i5);

    float getLineLeft(int i5);

    float getLineRight(int i5);

    int getLineStart(int i5);

    float getLineTop(int i5);

    float getLineWidth(int i5);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* renamed from: getOffsetForPosition-k-4lQ0M */
    int mo5393getOffsetForPositionk4lQ0M(long j5);

    @l
    ResolvedTextDirection getParagraphDirection(int i5);

    @l
    Path getPathForRange(int i5, int i6);

    @l
    List<Rect> getPlaceholderRects();

    float getWidth();

    /* renamed from: getWordBoundary--jx7JFs */
    long mo5394getWordBoundaryjx7JFs(int i5);

    boolean isLineEllipsized(int i5);

    /* renamed from: paint-LG529CI */
    void mo5395paintLG529CI(@l Canvas canvas, long j5, @m Shadow shadow, @m TextDecoration textDecoration, @m DrawStyle drawStyle, int i5);

    /* renamed from: paint-RPmYEkk */
    void mo5396paintRPmYEkk(@l Canvas canvas, long j5, @m Shadow shadow, @m TextDecoration textDecoration);

    /* renamed from: paint-hn5TExg */
    void mo5397painthn5TExg(@l Canvas canvas, @l Brush brush, float f5, @m Shadow shadow, @m TextDecoration textDecoration, @m DrawStyle drawStyle, int i5);
}
