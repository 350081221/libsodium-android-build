package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aN\u0010\u000b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\\\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/runtime/Composable;", "content", "IconButton", "(Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "IconToggleButton", "(ZLv3/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "RippleRadius", "F", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material/IconButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,130:1\n25#2:131\n456#2,8:154\n464#2,3:168\n467#2,3:173\n25#2:178\n456#2,8:201\n464#2,3:215\n467#2,3:220\n1116#3,6:132\n1116#3,6:179\n69#4,5:138\n74#4:171\n78#4:177\n69#4,5:185\n74#4:218\n78#4:224\n79#5,11:143\n92#5:176\n79#5,11:190\n92#5:223\n3737#6,6:162\n3737#6,6:209\n74#7:172\n74#7:219\n154#8:225\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material/IconButtonKt\n*L\n63#1:131\n66#1:154,8\n66#1:168,3\n66#1:173,3\n107#1:178\n110#1:201,8\n110#1:215,3\n110#1:220,3\n63#1:132,6\n107#1:179,6\n66#1:138,5\n66#1:171\n66#1:177\n110#1:185,5\n110#1:218\n110#1:224\n66#1:143,11\n66#1:176\n110#1:190,11\n110#1:223\n66#1:162,6\n110#1:209,6\n78#1:172\n123#1:219\n129#1:225\n*E\n"})
/* loaded from: classes.dex */
public final class IconButtonKt {
    private static final float RippleRadius = Dp.m6044constructorimpl(24);

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void IconButton(@p4.l v3.a<kotlin.r2> r18, @p4.m androidx.compose.ui.Modifier r19, boolean r20, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r21, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r22, @p4.m androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.IconButtonKt.IconButton(v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x004e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void IconToggleButton(boolean r18, @p4.l v3.l<? super java.lang.Boolean, kotlin.r2> r19, @p4.m androidx.compose.ui.Modifier r20, boolean r21, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r22, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r23, @p4.m androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.IconButtonKt.IconToggleButton(boolean, v3.l, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
