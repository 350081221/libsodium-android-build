package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001am\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\n2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aq\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\n2\u001c\u0010\u001a\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a$\u0010 \u001a\u00020\u0014*\u00020\u00142\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0002\"\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxValue;", "initialValue", "Lkotlin/Function1;", "", "confirmValueChange", "", "Lkotlin/v0;", "name", "totalDistance", "positionalThreshold", "Landroidx/compose/material3/SwipeToDismissBoxState;", "rememberSwipeToDismissBoxState", "(Landroidx/compose/material3/SwipeToDismissBoxValue;Lv3/l;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SwipeToDismissBoxState;", "state", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", ForeAndBackgroundEvent.BACKGROUND, "dismissContent", "Landroidx/compose/ui/Modifier;", "modifier", "", "directions", "SwipeToDismiss", "(Landroidx/compose/material3/SwipeToDismissBoxState;Lv3/q;Lv3/q;Landroidx/compose/ui/Modifier;Ljava/util/Set;Landroidx/compose/runtime/Composer;II)V", "backgroundContent", "enableDismissFromStartToEnd", "enableDismissFromEndToStart", "content", "SwipeToDismissBox", "(Landroidx/compose/material3/SwipeToDismissBoxState;Lv3/q;Landroidx/compose/ui/Modifier;ZZLv3/q;Landroidx/compose/runtime/Composer;II)V", "swipeToDismissBoxAnchors", "Landroidx/compose/ui/unit/Dp;", "DismissThreshold", "F", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,480:1\n74#2:481\n74#2:488\n1116#3,6:482\n68#4,6:489\n74#4:523\n78#4:608\n78#5,11:495\n78#5,11:530\n91#5:562\n78#5,11:570\n91#5:602\n91#5:607\n456#6,8:506\n464#6,3:520\n456#6,8:541\n464#6,3:555\n467#6,3:559\n456#6,8:581\n464#6,3:595\n467#6,3:599\n467#6,3:604\n3737#7,6:514\n3737#7,6:549\n3737#7,6:589\n87#8,6:524\n93#8:558\n97#8:563\n87#8,6:564\n93#8:598\n97#8:603\n154#9:609\n*S KotlinDebug\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxKt\n*L\n221#1:481\n294#1:488\n228#1:482,6\n296#1:489,6\n296#1:523\n296#1:608\n296#1:495,11\n306#1:530,11\n306#1:562\n310#1:570,11\n310#1:602\n296#1:607\n296#1:506,8\n296#1:520,3\n306#1:541,8\n306#1:555,3\n306#1:559,3\n310#1:581,8\n310#1:595,3\n310#1:599,3\n296#1:604,3\n296#1:514,6\n306#1:549,6\n310#1:589,6\n306#1:524,6\n306#1:558\n306#1:563\n310#1:564,6\n310#1:598\n310#1:603\n378#1:609\n*E\n"})
/* loaded from: classes.dex */
public final class SwipeToDismissBoxKt {
    private static final float DismissThreshold = Dp.m6044constructorimpl(125);

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004f  */
    @kotlin.k(level = kotlin.m.WARNING, message = "Use SwipeToDismissBox instead", replaceWith = @kotlin.b1(expression = "SwipeToDismissBox(state, background, modifier, enableDismissFromStartToEnd, enableDismissFromEndToStart, dismissContent)", imports = {}))
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SwipeToDismiss(@p4.l androidx.compose.material3.SwipeToDismissBoxState r17, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r18, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r19, @p4.m androidx.compose.ui.Modifier r20, @p4.m java.util.Set<? extends androidx.compose.material3.SwipeToDismissBoxValue> r21, @p4.m androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeToDismissBoxKt.SwipeToDismiss(androidx.compose.material3.SwipeToDismissBoxState, v3.q, v3.q, androidx.compose.ui.Modifier, java.util.Set, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SwipeToDismissBox(@p4.l androidx.compose.material3.SwipeToDismissBoxState r20, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r21, @p4.m androidx.compose.ui.Modifier r22, boolean r23, boolean r24, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r25, @p4.m androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeToDismissBoxKt.SwipeToDismissBox(androidx.compose.material3.SwipeToDismissBoxState, v3.q, androidx.compose.ui.Modifier, boolean, boolean, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final /* synthetic */ float access$getDismissThreshold$p() {
        return DismissThreshold;
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    public static final SwipeToDismissBoxState rememberSwipeToDismissBoxState(@p4.m SwipeToDismissBoxValue swipeToDismissBoxValue, @p4.m v3.l<? super SwipeToDismissBoxValue, Boolean> lVar, @p4.m v3.l<? super Float, Float> lVar2, @p4.m Composer composer, int i5, int i6) {
        boolean z4;
        boolean z5;
        composer.startReplaceableGroup(-246335487);
        if ((i6 & 1) != 0) {
            swipeToDismissBoxValue = SwipeToDismissBoxValue.Settled;
        }
        if ((i6 & 2) != 0) {
            lVar = SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$1.INSTANCE;
        }
        if ((i6 & 4) != 0) {
            lVar2 = SwipeToDismissBoxDefaults.INSTANCE.getPositionalThreshold(composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-246335487, i5, -1, "androidx.compose.material3.rememberSwipeToDismissBoxState (SwipeToDismissBox.kt:219)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean z6 = false;
        Object[] objArr = new Object[0];
        Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> Saver = SwipeToDismissBoxState.Companion.Saver(lVar, lVar2, density);
        composer.startReplaceableGroup(-1012845646);
        if (((6 ^ (i5 & 14)) > 4 && composer.changed(swipeToDismissBoxValue)) || (i5 & 6) == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean changed = z4 | composer.changed(density);
        if ((((i5 & 112) ^ 48) > 32 && composer.changed(lVar)) || (i5 & 48) == 32) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z7 = changed | z5;
        if ((((i5 & 896) ^ 384) > 256 && composer.changed(lVar2)) || (i5 & 384) == 256) {
            z6 = true;
        }
        boolean z8 = z7 | z6;
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1(swipeToDismissBoxValue, density, lVar, lVar2);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SwipeToDismissBoxState swipeToDismissBoxState = (SwipeToDismissBoxState) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) Saver, (String) null, (v3.a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeToDismissBoxState;
    }

    private static final Modifier swipeToDismissBoxAnchors(Modifier modifier, SwipeToDismissBoxState swipeToDismissBoxState, boolean z4, boolean z5) {
        return modifier.then(new SwipeToDismissAnchorsElement(swipeToDismissBoxState, z4, z5));
    }
}
