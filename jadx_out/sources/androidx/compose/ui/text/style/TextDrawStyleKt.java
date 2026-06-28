package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.i0;
import p4.l;
import u3.h;
import v3.a;

@i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "start", "stop", "fraction", "", "modulate", "Landroidx/compose/ui/graphics/Color;", "alpha", "modulate-DxMtmZc", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@h(name = "TextDrawStyleKt")
/* loaded from: classes.dex */
public final class TextDrawStyleKt {
    @l
    public static final TextForegroundStyle lerp(@l TextForegroundStyle textForegroundStyle, @l TextForegroundStyle textForegroundStyle2, float f5) {
        boolean z4 = textForegroundStyle instanceof BrushStyle;
        if (!z4 && !(textForegroundStyle2 instanceof BrushStyle)) {
            return TextForegroundStyle.Companion.m5957from8_81llA(ColorKt.m3785lerpjxsXWHM(textForegroundStyle.mo5834getColor0d7_KjU(), textForegroundStyle2.mo5834getColor0d7_KjU(), f5));
        }
        if (z4 && (textForegroundStyle2 instanceof BrushStyle)) {
            return TextForegroundStyle.Companion.from((Brush) SpanStyleKt.lerpDiscrete(((BrushStyle) textForegroundStyle).getBrush(), ((BrushStyle) textForegroundStyle2).getBrush(), f5), MathHelpersKt.lerp(textForegroundStyle.getAlpha(), textForegroundStyle2.getAlpha(), f5));
        }
        return (TextForegroundStyle) SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f5);
    }

    /* renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m5956modulateDxMtmZc(long j5, float f5) {
        if (!Float.isNaN(f5) && f5 < 1.0f) {
            return Color.m3733copywmQWz5c$default(j5, Color.m3736getAlphaimpl(j5) * f5, 0.0f, 0.0f, 0.0f, 14, null);
        }
        return j5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float takeOrElse(float f5, a<Float> aVar) {
        return Float.isNaN(f5) ? aVar.invoke().floatValue() : f5;
    }
}
