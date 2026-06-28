package androidx.compose.foundation;

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
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001ac\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a<\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aB\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a,\u0010\u001a\u001a\u00020\b*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "tooltip", "Landroidx/compose/foundation/BasicTooltipState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "focusable", "enableUserInput", "content", "BasicTooltipBox", "(Landroidx/compose/ui/window/PopupPositionProvider;Lv3/p;Landroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;ZZLv3/p;Landroidx/compose/runtime/Composer;II)V", "WrappedAnchor", "(ZLandroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Lkotlinx/coroutines/s0;", "scope", "TooltipPopup", "(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/s0;ZLv3/p;Landroidx/compose/runtime/Composer;I)V", "enabled", "handleGestures", "", TTDownloadField.TT_LABEL, "anchorSemantics", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nBasicTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/foundation/BasicTooltip_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,222:1\n487#2,4:223\n491#2,2:231\n495#2:237\n487#2,4:285\n491#2,2:293\n495#2:299\n25#3:227\n456#3,8:256\n464#3,3:270\n467#3,3:274\n25#3:289\n456#3,8:317\n464#3,3:331\n467#3,3:335\n1116#4,3:228\n1119#4,3:234\n1116#4,6:279\n1116#4,3:290\n1119#4,3:296\n487#5:233\n487#5:295\n67#6,7:238\n74#6:273\n78#6:278\n68#6,6:300\n74#6:334\n78#6:339\n79#7,11:245\n92#7:277\n79#7,11:306\n92#7:338\n3737#8,6:264\n3737#8,6:325\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/foundation/BasicTooltip_androidKt\n*L\n76#1:223,4\n76#1:231,2\n76#1:237\n109#1:285,4\n109#1:293,2\n109#1:299\n76#1:227\n77#1:256,8\n77#1:270,3\n77#1:274,3\n109#1:289\n111#1:317,8\n111#1:331,3\n111#1:335,3\n76#1:228,3\n76#1:234,3\n96#1:279,6\n109#1:290,3\n109#1:296,3\n76#1:233\n109#1:295\n77#1:238,7\n77#1:273\n77#1:278\n111#1:300,6\n111#1:334\n111#1:339\n77#1:245,11\n77#1:277\n111#1:306,11\n111#1:338\n77#1:264,6\n111#1:325,6\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTooltip_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0080  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTooltipBox(@p4.l androidx.compose.ui.window.PopupPositionProvider r18, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r19, @p4.l androidx.compose.foundation.BasicTooltipState r20, @p4.m androidx.compose.ui.Modifier r21, boolean r22, boolean r23, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r24, @p4.m androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltip_androidKt.BasicTooltipBox(androidx.compose.ui.window.PopupPositionProvider, v3.p, androidx.compose.foundation.BasicTooltipState, androidx.compose.ui.Modifier, boolean, boolean, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TooltipPopup(PopupPositionProvider popupPositionProvider, BasicTooltipState basicTooltipState, s0 s0Var, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-73658727);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-73658727, i5, -1, "androidx.compose.foundation.TooltipPopup (BasicTooltip.android.kt:124)");
        }
        AndroidPopup_androidKt.Popup(popupPositionProvider, new BasicTooltip_androidKt$TooltipPopup$1(basicTooltipState, s0Var), new PopupProperties(z4, false, false, null, false, false, 62, null), ComposableLambdaKt.composableLambda(startRestartGroup, -1147839433, true, new BasicTooltip_androidKt$TooltipPopup$2(StringResources_androidKt.stringResource(R.string.tooltip_description, startRestartGroup, 0), pVar)), startRestartGroup, (i5 & 14) | 3072, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
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
        Composer startRestartGroup = composer.startRestartGroup(1712976033);
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
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
        } else if ((i5 & 112) == 0) {
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
        } else if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i7 |= i10;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i5 & 7168) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i7 |= i11;
        }
        if ((i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i12 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1712976033, i7, -1, "androidx.compose.foundation.WrappedAnchor (BasicTooltip.android.kt:107)");
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
            Modifier anchorSemantics = anchorSemantics(handleGestures(modifier, z4, basicTooltipState), StringResources_androidKt.stringResource(R.string.tooltip_label, startRestartGroup, 0), z4, basicTooltipState, coroutineScope);
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
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
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
