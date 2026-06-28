package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.math.d;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0080\u0001\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aj\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001ah\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001af\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u0014\u00101\u001a\u00020\u0017*\u0002002\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u001a&\u00105\u001a\u000202*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/text/TextMeasurer;", "textMeasurer", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Lkotlin/r2;", "drawText-JFhB2K4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V", "drawText", "", "drawText-TPWCCtM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "", "alpha", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "drawText-d8-rzKo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "drawText-LVfH_YU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "clip", "Landroidx/compose/ui/unit/Constraints;", "textLayoutConstraints-v_w8tDc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J", "textLayoutConstraints", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,399:1\n262#2,11:400\n262#2,11:411\n262#2,8:422\n270#2,3:433\n262#2,11:436\n652#3:430\n658#3:431\n646#3:432\n159#4:447\n159#4:448\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n167#1:400,11\n233#1:411,11\n277#1:422,8\n277#1:433,3\n337#1:436,11\n284#1:430\n297#1:431\n297#1:432\n375#1:447\n387#1:448\n*E\n"})
/* loaded from: classes.dex */
public final class TextPainterKt {
    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (textLayoutResult.getHasVisualOverflow() && !TextOverflow.m5978equalsimpl0(textLayoutResult.getLayoutInput().m5514getOverflowgIe3tQ8(), TextOverflow.Companion.m5987getVisiblegIe3tQ8())) {
            DrawTransform.m4329clipRectN_I0leg$default(drawTransform, 0.0f, 0.0f, IntSize.m6214getWidthimpl(textLayoutResult.m5518getSizeYbymL2g()), IntSize.m6213getHeightimpl(textLayoutResult.m5518getSizeYbymL2g()), 0, 16, null);
        }
    }

    /* renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m5524drawTextJFhB2K4(@l DrawScope drawScope, @l TextMeasurer textMeasurer, @l AnnotatedString annotatedString, long j5, @l TextStyle textStyle, int i5, boolean z4, int i6, @l List<AnnotatedString.Range<Placeholder>> list, long j6, int i7) {
        TextLayoutResult m5521measurexDpz5zY$default = TextMeasurer.m5521measurexDpz5zY$default(textMeasurer, annotatedString, textStyle, i5, z4, i6, list, m5532textLayoutConstraintsv_w8tDc(drawScope, j6, j5), drawScope.getLayoutDirection(), drawScope, null, false, 1536, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5));
        clip(transform, m5521measurexDpz5zY$default);
        MultiParagraph.m5418paintLG529CI$default(m5521measurexDpz5zY$default.getMultiParagraph(), drawScope.getDrawContext().getCanvas(), 0L, null, null, null, i7, 30, null);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: drawText-JFhB2K4$default, reason: not valid java name */
    public static /* synthetic */ void m5525drawTextJFhB2K4$default(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j5, TextStyle textStyle, int i5, boolean z4, int i6, List list, long j6, int i7, int i8, Object obj) {
        long j7;
        TextStyle textStyle2;
        int i9;
        boolean z5;
        int i10;
        List list2;
        long j8;
        int i11;
        List E;
        if ((i8 & 4) != 0) {
            j7 = Offset.Companion.m3509getZeroF1C5BW0();
        } else {
            j7 = j5;
        }
        if ((i8 & 8) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i8 & 16) != 0) {
            i9 = TextOverflow.Companion.m5985getClipgIe3tQ8();
        } else {
            i9 = i5;
        }
        if ((i8 & 32) != 0) {
            z5 = true;
        } else {
            z5 = z4;
        }
        if ((i8 & 64) != 0) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = i6;
        }
        if ((i8 & 128) != 0) {
            E = w.E();
            list2 = E;
        } else {
            list2 = list;
        }
        if ((i8 & 256) != 0) {
            j8 = Size.Companion.m3570getUnspecifiedNHjbRc();
        } else {
            j8 = j6;
        }
        if ((i8 & 512) != 0) {
            i11 = DrawScope.Companion.m4278getDefaultBlendMode0nO6VwU();
        } else {
            i11 = i7;
        }
        m5524drawTextJFhB2K4(drawScope, textMeasurer, annotatedString, j7, textStyle2, i9, z5, i10, list2, j8, i11);
    }

    /* renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m5526drawTextLVfH_YU(@l DrawScope drawScope, @l TextLayoutResult textLayoutResult, @l Brush brush, long j5, float f5, @m Shadow shadow, @m TextDecoration textDecoration, @m DrawStyle drawStyle, int i5) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        float alpha;
        if (shadow == null) {
            shadow2 = textLayoutResult.getLayoutInput().getStyle().getShadow();
        } else {
            shadow2 = shadow;
        }
        if (textDecoration == null) {
            textDecoration2 = textLayoutResult.getLayoutInput().getStyle().getTextDecoration();
        } else {
            textDecoration2 = textDecoration;
        }
        if (drawStyle == null) {
            drawStyle2 = textLayoutResult.getLayoutInput().getStyle().getDrawStyle();
        } else {
            drawStyle2 = drawStyle;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5));
        clip(transform, textLayoutResult);
        MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        if (!Float.isNaN(f5)) {
            alpha = f5;
        } else {
            alpha = textLayoutResult.getLayoutInput().getStyle().getAlpha();
        }
        multiParagraph.m5426painthn5TExg(canvas, brush, alpha, shadow2, textDecoration2, drawStyle2, i5);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: drawText-LVfH_YU$default, reason: not valid java name */
    public static /* synthetic */ void m5527drawTextLVfH_YU$default(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j5, float f5, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i5, int i6, Object obj) {
        long j6;
        float f6;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i7;
        if ((i6 & 4) != 0) {
            j6 = Offset.Companion.m3509getZeroF1C5BW0();
        } else {
            j6 = j5;
        }
        if ((i6 & 8) != 0) {
            f6 = Float.NaN;
        } else {
            f6 = f5;
        }
        if ((i6 & 16) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i6 & 32) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i6 & 64) != 0) {
            drawStyle2 = null;
        } else {
            drawStyle2 = drawStyle;
        }
        if ((i6 & 128) != 0) {
            i7 = DrawScope.Companion.m4278getDefaultBlendMode0nO6VwU();
        } else {
            i7 = i5;
        }
        m5526drawTextLVfH_YU(drawScope, textLayoutResult, brush, j6, f6, shadow2, textDecoration2, drawStyle2, i7);
    }

    /* renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m5528drawTextTPWCCtM(@l DrawScope drawScope, @l TextMeasurer textMeasurer, @l String str, long j5, @l TextStyle textStyle, int i5, boolean z4, int i6, long j6, int i7) {
        TextLayoutResult m5521measurexDpz5zY$default = TextMeasurer.m5521measurexDpz5zY$default(textMeasurer, new AnnotatedString(str, null, null, 6, null), textStyle, i5, z4, i6, null, m5532textLayoutConstraintsv_w8tDc(drawScope, j6, j5), drawScope.getLayoutDirection(), drawScope, null, false, 1568, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5));
        clip(transform, m5521measurexDpz5zY$default);
        MultiParagraph.m5418paintLG529CI$default(m5521measurexDpz5zY$default.getMultiParagraph(), drawScope.getDrawContext().getCanvas(), 0L, null, null, null, i7, 30, null);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: drawText-TPWCCtM$default, reason: not valid java name */
    public static /* synthetic */ void m5529drawTextTPWCCtM$default(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j5, TextStyle textStyle, int i5, boolean z4, int i6, long j6, int i7, int i8, Object obj) {
        long j7;
        TextStyle textStyle2;
        int i9;
        boolean z5;
        int i10;
        long j8;
        int i11;
        if ((i8 & 4) != 0) {
            j7 = Offset.Companion.m3509getZeroF1C5BW0();
        } else {
            j7 = j5;
        }
        if ((i8 & 8) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i8 & 16) != 0) {
            i9 = TextOverflow.Companion.m5985getClipgIe3tQ8();
        } else {
            i9 = i5;
        }
        if ((i8 & 32) != 0) {
            z5 = true;
        } else {
            z5 = z4;
        }
        if ((i8 & 64) != 0) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = i6;
        }
        if ((i8 & 128) != 0) {
            j8 = Size.Companion.m3570getUnspecifiedNHjbRc();
        } else {
            j8 = j6;
        }
        if ((i8 & 256) != 0) {
            i11 = DrawScope.Companion.m4278getDefaultBlendMode0nO6VwU();
        } else {
            i11 = i7;
        }
        m5528drawTextTPWCCtM(drawScope, textMeasurer, str, j7, textStyle2, i9, z5, i10, j8, i11);
    }

    /* renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m5530drawTextd8rzKo(@l DrawScope drawScope, @l TextLayoutResult textLayoutResult, long j5, long j6, float f5, @m Shadow shadow, @m TextDecoration textDecoration, @m DrawStyle drawStyle, int i5) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        long m5575getColor0d7_KjU;
        boolean z4;
        float alpha;
        if (shadow == null) {
            shadow2 = textLayoutResult.getLayoutInput().getStyle().getShadow();
        } else {
            shadow2 = shadow;
        }
        if (textDecoration == null) {
            textDecoration2 = textLayoutResult.getLayoutInput().getStyle().getTextDecoration();
        } else {
            textDecoration2 = textDecoration;
        }
        if (drawStyle == null) {
            drawStyle2 = textLayoutResult.getLayoutInput().getStyle().getDrawStyle();
        } else {
            drawStyle2 = drawStyle;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m3493getXimpl(j6), Offset.m3494getYimpl(j6));
        clip(transform, textLayoutResult);
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        boolean z5 = true;
        if (brush != null) {
            if (j5 == Color.Companion.m3770getUnspecified0d7_KjU()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                if (!Float.isNaN(f5)) {
                    alpha = f5;
                } else {
                    alpha = textLayoutResult.getLayoutInput().getStyle().getAlpha();
                }
                multiParagraph.m5426painthn5TExg(canvas, brush, alpha, shadow2, textDecoration2, drawStyle2, i5);
                drawContext.getCanvas().restore();
                drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
            }
        }
        MultiParagraph multiParagraph2 = textLayoutResult.getMultiParagraph();
        Canvas canvas2 = drawScope.getDrawContext().getCanvas();
        if (j5 == Color.Companion.m3770getUnspecified0d7_KjU()) {
            z5 = false;
        }
        if (z5) {
            m5575getColor0d7_KjU = j5;
        } else {
            m5575getColor0d7_KjU = textLayoutResult.getLayoutInput().getStyle().m5575getColor0d7_KjU();
        }
        multiParagraph2.m5424paintLG529CI(canvas2, TextDrawStyleKt.m5956modulateDxMtmZc(m5575getColor0d7_KjU, f5), shadow2, textDecoration2, drawStyle2, i5);
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* renamed from: drawText-d8-rzKo$default, reason: not valid java name */
    public static /* synthetic */ void m5531drawTextd8rzKo$default(DrawScope drawScope, TextLayoutResult textLayoutResult, long j5, long j6, float f5, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i5, int i6, Object obj) {
        long j7;
        long j8;
        float f6;
        Shadow shadow2;
        TextDecoration textDecoration2;
        int i7;
        if ((i6 & 2) != 0) {
            j7 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j7 = j5;
        }
        if ((i6 & 4) != 0) {
            j8 = Offset.Companion.m3509getZeroF1C5BW0();
        } else {
            j8 = j6;
        }
        if ((i6 & 8) != 0) {
            f6 = Float.NaN;
        } else {
            f6 = f5;
        }
        DrawStyle drawStyle2 = null;
        if ((i6 & 16) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i6 & 32) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i6 & 64) == 0) {
            drawStyle2 = drawStyle;
        }
        if ((i6 & 128) != 0) {
            i7 = DrawScope.Companion.m4278getDefaultBlendMode0nO6VwU();
        } else {
            i7 = i5;
        }
        m5530drawTextd8rzKo(drawScope, textLayoutResult, j7, j8, f6, shadow2, textDecoration2, drawStyle2, i7);
    }

    /* renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m5532textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j5, long j6) {
        boolean z4;
        boolean z5;
        int L0;
        int i5;
        boolean z6;
        int i6;
        int L02;
        Size.Companion companion = Size.Companion;
        boolean z7 = true;
        int i7 = 0;
        if (j5 == companion.m3570getUnspecifiedNHjbRc()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && !Float.isNaN(Size.m3562getWidthimpl(j5))) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            L02 = d.L0((float) Math.ceil(Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc()) - Offset.m3493getXimpl(j6)));
            i5 = L02;
            L0 = 0;
        } else {
            L0 = d.L0((float) Math.ceil(Size.m3562getWidthimpl(j5)));
            i5 = L0;
        }
        if (j5 == companion.m3570getUnspecifiedNHjbRc()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6 && !Float.isNaN(Size.m3559getHeightimpl(j5))) {
            z7 = false;
        }
        if (z7) {
            i6 = d.L0((float) Math.ceil(Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc()) - Offset.m3494getYimpl(j6)));
        } else {
            i7 = d.L0((float) Math.ceil(Size.m3559getHeightimpl(j5)));
            i6 = i7;
        }
        return ConstraintsKt.Constraints(L0, i5, i7, i6);
    }
}
