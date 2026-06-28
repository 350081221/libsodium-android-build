package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001ac\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a<\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aB\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a,\u0010\u001a\u001a\u00020\b*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "tooltip", "Landroidx/compose/material3/BasicTooltipState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "focusable", "enableUserInput", "content", "BasicTooltipBox", "(Landroidx/compose/ui/window/PopupPositionProvider;Lv3/p;Landroidx/compose/material3/BasicTooltipState;Landroidx/compose/ui/Modifier;ZZLv3/p;Landroidx/compose/runtime/Composer;II)V", "WrappedAnchor", "(ZLandroidx/compose/material3/BasicTooltipState;Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Lkotlinx/coroutines/s0;", "scope", "TooltipPopup", "(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/material3/BasicTooltipState;Lkotlinx/coroutines/s0;ZLv3/p;Landroidx/compose/runtime/Composer;I)V", "enabled", "handleGestures", "", TTDownloadField.TT_LABEL, "anchorSemantics", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBasicTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/BasicTooltip_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,225:1\n487#2,4:226\n491#2,2:234\n495#2:240\n487#2,4:288\n491#2,2:296\n495#2:302\n25#3:230\n456#3,8:259\n464#3,3:273\n467#3,3:277\n25#3:292\n456#3,8:320\n464#3,3:334\n467#3,3:338\n1116#4,3:231\n1119#4,3:237\n1116#4,6:282\n1116#4,3:293\n1119#4,3:299\n1116#4,6:343\n487#5:236\n487#5:298\n67#6,7:241\n74#6:276\n78#6:281\n68#6,6:303\n74#6:337\n78#6:342\n78#7,11:248\n91#7:280\n78#7,11:309\n91#7:341\n3737#8,6:267\n3737#8,6:328\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/BasicTooltip_androidKt\n*L\n83#1:226,4\n83#1:234,2\n83#1:240\n115#1:288,4\n115#1:296,2\n115#1:302\n83#1:230\n84#1:259,8\n84#1:273,3\n84#1:277,3\n115#1:292\n117#1:320,8\n117#1:334,3\n117#1:338,3\n83#1:231,3\n83#1:237,3\n103#1:282,6\n115#1:293,3\n115#1:299,3\n134#1:343,6\n83#1:236\n115#1:298\n84#1:241,7\n84#1:276\n84#1:281\n117#1:303,6\n117#1:337\n117#1:342\n84#1:248,11\n84#1:280\n117#1:309,11\n117#1:341\n84#1:267,6\n117#1:328,6\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTooltip_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTooltipBox(@p4.l androidx.compose.ui.window.PopupPositionProvider r20, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r21, @p4.l androidx.compose.material3.BasicTooltipState r22, @p4.m androidx.compose.ui.Modifier r23, boolean r24, boolean r25, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r26, @p4.m androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BasicTooltip_androidKt.BasicTooltipBox(androidx.compose.ui.window.PopupPositionProvider, v3.p, androidx.compose.material3.BasicTooltipState, androidx.compose.ui.Modifier, boolean, boolean, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TooltipPopup(PopupPositionProvider popupPositionProvider, BasicTooltipState basicTooltipState, s0 s0Var, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-237130298);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(popupPositionProvider)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i6 = i11 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(basicTooltipState)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i6 |= i10;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(s0Var)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i6 |= i9;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(z4)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i6 |= i8;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i6 |= i7;
        }
        if ((i6 & 9363) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-237130298, i6, -1, "androidx.compose.material3.TooltipPopup (BasicTooltip.android.kt:129)");
            }
            boolean z5 = false;
            String stringResource = StringResources_androidKt.stringResource(androidx.compose.foundation.R.string.tooltip_description, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1291172190);
            if ((i6 & 112) == 32) {
                z5 = true;
            }
            boolean changedInstance = startRestartGroup.changedInstance(s0Var) | z5;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BasicTooltip_androidKt$TooltipPopup$1$1(basicTooltipState, s0Var);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidPopup_androidKt.Popup(popupPositionProvider, (v3.a) rememberedValue, new PopupProperties(z4, false, false, null, false, false, 62, null), ComposableLambdaKt.composableLambda(startRestartGroup, 282408040, true, new BasicTooltip_androidKt$TooltipPopup$2(stringResource, pVar)), startRestartGroup, (i6 & 14) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BasicTooltip_androidKt$TooltipPopup$3(popupPositionProvider, basicTooltipState, s0Var, z4, pVar, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void WrappedAnchor(boolean z4, BasicTooltipState basicTooltipState, Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(513239742);
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(z4)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            i7 = i5;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(basicTooltipState)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        int i12 = i6 & 4;
        if (i12 != 0) {
            i7 |= 384;
        } else if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i7 |= i10;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i7 |= i11;
        }
        if ((i7 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i12 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(513239742, i7, -1, "androidx.compose.material3.WrappedAnchor (BasicTooltip.android.kt:113)");
            }
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.i.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            Modifier anchorSemantics = anchorSemantics(handleGestures(modifier, z4, basicTooltipState), StringResources_androidKt.stringResource(androidx.compose.foundation.R.string.tooltip_label, startRestartGroup, 0), z4, basicTooltipState, coroutineScope);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(anchorSemantics);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf((i7 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BasicTooltip_androidKt$WrappedAnchor$2(z4, basicTooltipState, modifier2, pVar, i5, i6));
        }
    }

    private static final Modifier anchorSemantics(Modifier modifier, String str, boolean z4, BasicTooltipState basicTooltipState, s0 s0Var) {
        return z4 ? SemanticsModifierKt.semantics(modifier, true, new BasicTooltip_androidKt$anchorSemantics$1(str, s0Var, basicTooltipState)) : modifier;
    }

    private static final Modifier handleGestures(Modifier modifier, boolean z4, BasicTooltipState basicTooltipState) {
        if (z4) {
            return SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(modifier, basicTooltipState, new BasicTooltip_androidKt$handleGestures$1(basicTooltipState, null)), basicTooltipState, new BasicTooltip_androidKt$handleGestures$2(basicTooltipState, null));
        }
        return modifier;
    }
}
