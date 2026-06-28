package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u00006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aO\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"", "selected", "Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/material3/RadioButtonColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "RadioButton", "(ZLv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "", "RadioAnimationDuration", "I", "Landroidx/compose/ui/unit/Dp;", "RadioButtonPadding", "F", "RadioButtonDotSize", "RadioStrokeWidth", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,268:1\n1116#2,6:269\n1116#2,6:278\n75#3:275\n75#3:277\n154#4:276\n154#4:284\n154#4:285\n154#4:286\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n*L\n79#1:269,6\n116#1:278,6\n82#1:275\n97#1:277\n82#1:276\n265#1:284\n266#1:285\n267#1:286\n*E\n"})
/* loaded from: classes.dex */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize = Dp.m6044constructorimpl(12);
    private static final float RadioButtonPadding;
    private static final float RadioStrokeWidth;

    static {
        float f5 = 2;
        RadioButtonPadding = Dp.m6044constructorimpl(f5);
        RadioStrokeWidth = Dp.m6044constructorimpl(f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0061  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RadioButton(boolean r22, @p4.m v3.a<kotlin.r2> r23, @p4.m androidx.compose.ui.Modifier r24, boolean r25, @p4.m androidx.compose.material3.RadioButtonColors r26, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r27, @p4.m androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.RadioButtonKt.RadioButton(boolean, v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.RadioButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }
}
