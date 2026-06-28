package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\f\u001a\u00020\t*\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/platform/style/DrawStyleSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroidx/compose/ui/graphics/StrokeJoin;", "Landroid/graphics/Paint$Join;", "toAndroidJoin-Ww9F2mQ", "(I)Landroid/graphics/Paint$Join;", "toAndroidJoin", "Landroidx/compose/ui/graphics/StrokeCap;", "Landroid/graphics/Paint$Cap;", "toAndroidCap-BeK7IIE", "(I)Landroid/graphics/Paint$Cap;", "toAndroidCap", "Landroid/text/TextPaint;", "textPaint", "Lkotlin/r2;", "updateDrawState", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "<init>", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 8;

    @l
    private final DrawStyle drawStyle;

    public DrawStyleSpan(@l DrawStyle drawStyle) {
        this.drawStyle = drawStyle;
    }

    /* renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    private final Paint.Cap m5816toAndroidCapBeK7IIE(int i5) {
        StrokeCap.Companion companion = StrokeCap.Companion;
        if (StrokeCap.m4081equalsimpl0(i5, companion.m4085getButtKaPHkGw())) {
            return Paint.Cap.BUTT;
        }
        if (StrokeCap.m4081equalsimpl0(i5, companion.m4086getRoundKaPHkGw())) {
            return Paint.Cap.ROUND;
        }
        if (StrokeCap.m4081equalsimpl0(i5, companion.m4087getSquareKaPHkGw())) {
            return Paint.Cap.SQUARE;
        }
        return Paint.Cap.BUTT;
    }

    /* renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    private final Paint.Join m5817toAndroidJoinWw9F2mQ(int i5) {
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        if (StrokeJoin.m4091equalsimpl0(i5, companion.m4096getMiterLxFBmk8())) {
            return Paint.Join.MITER;
        }
        if (StrokeJoin.m4091equalsimpl0(i5, companion.m4097getRoundLxFBmk8())) {
            return Paint.Join.ROUND;
        }
        if (StrokeJoin.m4091equalsimpl0(i5, companion.m4095getBevelLxFBmk8())) {
            return Paint.Join.BEVEL;
        }
        return Paint.Join.MITER;
    }

    @l
    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@m TextPaint textPaint) {
        PathEffect pathEffect;
        if (textPaint != null) {
            DrawStyle drawStyle = this.drawStyle;
            if (l0.g(drawStyle, Fill.INSTANCE)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (drawStyle instanceof Stroke) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
                textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
                textPaint.setStrokeJoin(m5817toAndroidJoinWw9F2mQ(((Stroke) this.drawStyle).m4342getJoinLxFBmk8()));
                textPaint.setStrokeCap(m5816toAndroidCapBeK7IIE(((Stroke) this.drawStyle).m4341getCapKaPHkGw()));
                androidx.compose.ui.graphics.PathEffect pathEffect2 = ((Stroke) this.drawStyle).getPathEffect();
                if (pathEffect2 != null) {
                    pathEffect = AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect2);
                } else {
                    pathEffect = null;
                }
                textPaint.setPathEffect(pathEffect);
            }
        }
    }
}
