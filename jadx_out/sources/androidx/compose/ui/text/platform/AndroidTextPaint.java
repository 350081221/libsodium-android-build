package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00101\u001a\u00020\u0012¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0016\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR(\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u001e\u0012\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%R1\u0010.\u001a\u00020&2\u0006\u0010'\u001a\u00020&8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+*\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Lkotlin/r2;", "setTextDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "setShadow", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "setColor-8_81llA", "(J)V", "setColor", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/geometry/Size;", "size", "", "alpha", "setBrush-12SF9DM", "(Landroidx/compose/ui/graphics/Brush;JF)V", "setBrush", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "setDrawStyle", "Landroidx/compose/ui/graphics/Paint;", "composePaint", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/Shadow;", "getShadow$ui_text_release", "()Landroidx/compose/ui/graphics/Shadow;", "setShadow$ui_text_release", "(Landroidx/compose/ui/graphics/Shadow;)V", "getShadow$ui_text_release$annotations", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "Landroidx/compose/ui/graphics/BlendMode;", "<set-?>", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "getBlendMode-0nO6VwU$delegate", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;)Ljava/lang/Object;", "blendMode", "", "flags", "density", "<init>", "(IF)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAndroidTextPaint.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,144:1\n646#2:145\n646#2:146\n152#3:147\n*S KotlinDebug\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n*L\n83#1:145\n92#1:146\n93#1:147\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidTextPaint extends TextPaint {
    public static final int $stable = 8;

    @l
    private final Paint composePaint;

    @m
    private DrawStyle drawStyle;

    @l
    private Shadow shadow;

    @l
    private TextDecoration textDecoration;

    public AndroidTextPaint(int i5, float f5) {
        super(i5);
        ((TextPaint) this).density = f5;
        this.composePaint = AndroidPaint_androidKt.asComposePaint(this);
        this.textDecoration = TextDecoration.Companion.getNone();
        this.shadow = Shadow.Companion.getNone();
    }

    @VisibleForTesting
    public static /* synthetic */ void getShadow$ui_text_release$annotations() {
    }

    /* renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m5797setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j5, float f5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            f5 = Float.NaN;
        }
        androidTextPaint.m5800setBrush12SF9DM(brush, j5, f5);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m5798getBlendMode0nO6VwU() {
        return this.composePaint.mo3606getBlendMode0nO6VwU();
    }

    @l
    public final Shadow getShadow$ui_text_release() {
        return this.shadow;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m5799setBlendModes9anfk8(int i5) {
        this.composePaint.mo3612setBlendModes9anfk8(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        r8.mo3681applyToPq9zytI(r9, r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r11 = kotlin.ranges.u.H(r11, 0.0f, 1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r1 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        r0 = r7.composePaint;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (java.lang.Float.isNaN(r11) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r11 = r7.composePaint.getAlpha();
     */
    /* renamed from: setBrush-12SF9DM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5800setBrush12SF9DM(@p4.m androidx.compose.ui.graphics.Brush r8, long r9, float r11) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.graphics.SolidColor
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1c
            r0 = r8
            androidx.compose.ui.graphics.SolidColor r0 = (androidx.compose.ui.graphics.SolidColor) r0
            long r3 = r0.m4067getValue0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r0 = androidx.compose.ui.graphics.Color.Companion
            long r5 = r0.m3770getUnspecified0d7_KjU()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 != 0) goto L2e
        L1c:
            boolean r0 = r8 instanceof androidx.compose.ui.graphics.ShaderBrush
            if (r0 == 0) goto L48
            androidx.compose.ui.geometry.Size$Companion r0 = androidx.compose.ui.geometry.Size.Companion
            long r3 = r0.m3570getUnspecifiedNHjbRc()
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r1 = r2
        L2c:
            if (r1 == 0) goto L48
        L2e:
            androidx.compose.ui.graphics.Paint r0 = r7.composePaint
            boolean r1 = java.lang.Float.isNaN(r11)
            if (r1 == 0) goto L3d
            androidx.compose.ui.graphics.Paint r11 = r7.composePaint
            float r11 = r11.getAlpha()
            goto L44
        L3d:
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r11 = kotlin.ranges.s.H(r11, r1, r2)
        L44:
            r8.mo3681applyToPq9zytI(r9, r0, r11)
            goto L50
        L48:
            if (r8 != 0) goto L50
            androidx.compose.ui.graphics.Paint r8 = r7.composePaint
            r9 = 0
            r8.setShader(r9)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidTextPaint.m5800setBrush12SF9DM(androidx.compose.ui.graphics.Brush, long, float):void");
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m5801setColor8_81llA(long j5) {
        boolean z4;
        if (j5 != Color.Companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.composePaint.mo3613setColor8_81llA(j5);
            this.composePaint.setShader(null);
        }
    }

    public final void setDrawStyle(@m DrawStyle drawStyle) {
        if (drawStyle != null && !l0.g(this.drawStyle, drawStyle)) {
            this.drawStyle = drawStyle;
            if (l0.g(drawStyle, Fill.INSTANCE)) {
                this.composePaint.mo3617setStylek9PVt8s(PaintingStyle.Companion.m4000getFillTiuSbCo());
                return;
            }
            if (drawStyle instanceof Stroke) {
                this.composePaint.mo3617setStylek9PVt8s(PaintingStyle.Companion.m4001getStrokeTiuSbCo());
                Stroke stroke = (Stroke) drawStyle;
                this.composePaint.setStrokeWidth(stroke.getWidth());
                this.composePaint.setStrokeMiterLimit(stroke.getMiter());
                this.composePaint.mo3616setStrokeJoinWw9F2mQ(stroke.m4342getJoinLxFBmk8());
                this.composePaint.mo3615setStrokeCapBeK7IIE(stroke.m4341getCapKaPHkGw());
                this.composePaint.setPathEffect(stroke.getPathEffect());
            }
        }
    }

    public final void setShadow(@m Shadow shadow) {
        if (shadow != null && !l0.g(this.shadow, shadow)) {
            this.shadow = shadow;
            if (l0.g(shadow, Shadow.Companion.getNone())) {
                clearShadowLayer();
            } else {
                setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Offset.m3493getXimpl(this.shadow.m4058getOffsetF1C5BW0()), Offset.m3494getYimpl(this.shadow.m4058getOffsetF1C5BW0()), ColorKt.m3788toArgb8_81llA(this.shadow.m4057getColor0d7_KjU()));
            }
        }
    }

    public final void setShadow$ui_text_release(@l Shadow shadow) {
        this.shadow = shadow;
    }

    public final void setTextDecoration(@m TextDecoration textDecoration) {
        if (textDecoration != null && !l0.g(this.textDecoration, textDecoration)) {
            this.textDecoration = textDecoration;
            TextDecoration.Companion companion = TextDecoration.Companion;
            setUnderlineText(textDecoration.contains(companion.getUnderline()));
            setStrikeThruText(this.textDecoration.contains(companion.getLineThrough()));
        }
    }
}
