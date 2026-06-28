package androidx.compose.foundation.text2.input.internal;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000eH\u0002\u001a\f\u0010\u0013\u001a\u00020\u0005*\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t¨\u0006\u0014"}, d2 = {"DefaultCursorThickness", "Landroidx/compose/ui/unit/Dp;", "F", "cursorAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "isSpecified", "", "Landroidx/compose/ui/graphics/Brush;", "(Landroidx/compose/ui/graphics/Brush;)Z", "getCursorRectInScroller", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/Density;", "cursorOffset", "", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "rtl", "textFieldWidth", "roundToNext", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,584:1\n652#2:585\n154#3:586\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt\n*L\n535#1:585\n529#1:586\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldCoreModifierKt {

    @l
    private static final AnimationSpec<Float> cursorAnimationSpec = AnimationSpecKt.m119infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(TextFieldCoreModifierKt$cursorAnimationSpec$1.INSTANCE), null, 0, 6, null);
    private static final float DefaultCursorThickness = Dp.m6044constructorimpl(2);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x001c, code lost:
    
        if (r8 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.geometry.Rect getCursorRectInScroller(androidx.compose.ui.unit.Density r7, int r8, androidx.compose.ui.text.TextLayoutResult r9, boolean r10, int r11) {
        /*
            if (r9 == 0) goto L1e
            kotlin.ranges.l r0 = new kotlin.ranges.l
            androidx.compose.ui.text.TextLayoutInput r1 = r9.getLayoutInput()
            androidx.compose.ui.text.AnnotatedString r1 = r1.getText()
            int r1 = r1.length()
            r2 = 0
            r0.<init>(r2, r1)
            int r8 = kotlin.ranges.s.J(r8, r0)
            androidx.compose.ui.geometry.Rect r8 = r9.getCursorRect(r8)
            if (r8 != 0) goto L24
        L1e:
            androidx.compose.ui.geometry.Rect$Companion r8 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r8 = r8.getZero()
        L24:
            r0 = r8
            float r8 = androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierKt.DefaultCursorThickness
            int r7 = r7.mo298roundToPx0680j_4(r8)
            if (r10 == 0) goto L36
            float r8 = (float) r11
            float r9 = r0.getLeft()
            float r8 = r8 - r9
            float r9 = (float) r7
            float r8 = r8 - r9
            goto L3a
        L36:
            float r8 = r0.getLeft()
        L3a:
            r1 = r8
            if (r10 == 0) goto L45
            float r7 = (float) r11
            float r8 = r0.getLeft()
            float r7 = r7 - r8
            r3 = r7
            goto L4c
        L45:
            float r8 = r0.getLeft()
            float r7 = (float) r7
            float r8 = r8 + r7
            r3 = r8
        L4c:
            r2 = 0
            r4 = 0
            r5 = 10
            r6 = 0
            androidx.compose.ui.geometry.Rect r7 = androidx.compose.ui.geometry.Rect.copy$default(r0, r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierKt.getCursorRectInScroller(androidx.compose.ui.unit.Density, int, androidx.compose.ui.text.TextLayoutResult, boolean, int):androidx.compose.ui.geometry.Rect");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSpecified(Brush brush) {
        boolean z4;
        if (!(brush instanceof SolidColor)) {
            return true;
        }
        if (((SolidColor) brush).m4067getValue0d7_KjU() == Color.Companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToNext(float f5) {
        double floor;
        if (!Float.isNaN(f5) && !Float.isInfinite(f5)) {
            if (f5 > 0.0f) {
                floor = Math.ceil(f5);
            } else {
                floor = Math.floor(f5);
            }
            return (float) floor;
        }
        return f5;
    }
}
