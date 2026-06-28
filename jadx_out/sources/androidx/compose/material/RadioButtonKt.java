package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u00006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013\"\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013¨\u0006\u0019"}, d2 = {"", "selected", "Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/RadioButtonColors;", "colors", "RadioButton", "(ZLv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "", "RadioAnimationDuration", "I", "Landroidx/compose/ui/unit/Dp;", "RadioButtonRippleRadius", "F", "RadioButtonPadding", "RadioButtonSize", "RadioRadius", "RadioButtonDotSize", "RadioStrokeWidth", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,233:1\n25#2:234\n1116#3,6:235\n1116#3,6:243\n75#4:241\n75#4:252\n154#5:242\n154#5:249\n154#5:250\n154#5:251\n154#5:253\n154#5:254\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n*L\n79#1:234\n79#1:235,6\n116#1:243,6\n83#1:241\n230#1:252\n83#1:242\n227#1:249\n228#1:250\n229#1:251\n231#1:253\n232#1:254\n*E\n"})
/* loaded from: classes.dex */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize;
    private static final float RadioButtonPadding;
    private static final float RadioButtonRippleRadius = Dp.m6044constructorimpl(24);
    private static final float RadioButtonSize;
    private static final float RadioRadius;
    private static final float RadioStrokeWidth;

    static {
        float f5 = 2;
        RadioButtonPadding = Dp.m6044constructorimpl(f5);
        float m6044constructorimpl = Dp.m6044constructorimpl(20);
        RadioButtonSize = m6044constructorimpl;
        RadioRadius = Dp.m6044constructorimpl(m6044constructorimpl / f5);
        RadioButtonDotSize = Dp.m6044constructorimpl(12);
        RadioStrokeWidth = Dp.m6044constructorimpl(f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0061  */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RadioButton(boolean r22, @p4.m v3.a<kotlin.r2> r23, @p4.m androidx.compose.ui.Modifier r24, boolean r25, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r26, @p4.m androidx.compose.material.RadioButtonColors r27, @p4.m androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.RadioButtonKt.RadioButton(boolean, v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.RadioButtonColors, androidx.compose.runtime.Composer, int, int):void");
    }
}
