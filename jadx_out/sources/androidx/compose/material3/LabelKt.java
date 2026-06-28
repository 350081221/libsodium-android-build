package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a^\u0010\u000e\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/material3/CaretScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", TTDownloadField.TT_LABEL, "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "isPersistent", "Lkotlin/Function0;", "content", "Label", "(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLv3/p;Landroidx/compose/runtime/Composer;II)V", "enabled", "Landroidx/compose/material3/BasicTooltipState;", "state", "HandleInteractions", "(ZLandroidx/compose/material3/BasicTooltipState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "anchorBounds", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLabel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Label.kt\nandroidx/compose/material3/LabelKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,146:1\n1116#2,6:147\n1116#2,6:153\n1116#2,6:159\n1116#2,6:165\n1116#2,6:171\n81#3:177\n107#3,2:178\n*S KotlinDebug\n*F\n+ 1 Label.kt\nandroidx/compose/material3/LabelKt\n*L\n67#1:147,6\n74#1:153,6\n78#1:159,6\n79#1:165,6\n120#1:171,6\n78#1:177\n78#1:178,2\n*E\n"})
/* loaded from: classes.dex */
public final class LabelKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void HandleInteractions(boolean z4, BasicTooltipState basicTooltipState, MutableInteractionSource mutableInteractionSource, Composer composer, int i5) {
        int i6;
        boolean z5;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1479255681);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(z4)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(basicTooltipState)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(mutableInteractionSource)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1479255681, i6, -1, "androidx.compose.material3.HandleInteractions (Label.kt:117)");
            }
            if (z4) {
                startRestartGroup.startReplaceableGroup(-404204353);
                boolean z6 = true;
                if ((i6 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i6 & 112) != 32) {
                    z6 = false;
                }
                boolean z7 = z5 | z6;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z7 || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new LabelKt$HandleInteractions$1$1(mutableInteractionSource, basicTooltipState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(mutableInteractionSource, (v3.p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue, startRestartGroup, (i6 >> 6) & 14);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LabelKt$HandleInteractions$2(z4, basicTooltipState, mutableInteractionSource, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x004a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Label(@p4.l v3.q<? super androidx.compose.material3.CaretScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r20, @p4.m androidx.compose.ui.Modifier r21, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r22, boolean r23, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r24, @p4.m androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.LabelKt.Label(v3.q, androidx.compose.ui.Modifier, androidx.compose.foundation.interaction.MutableInteractionSource, boolean, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutCoordinates Label$lambda$3(MutableState<LayoutCoordinates> mutableState) {
        return mutableState.getValue();
    }
}
