package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0091\u0001\u0010\u0015\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u008b\u0001\u0010\u0015\u001a\u00020\u0004*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u001a\u001aD\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aD\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010 \u001a5\u0010$\u001a\u00020\u00042\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u00122\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0012H\u0003¢\u0006\u0004\b$\u0010%\u001a\u0019\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'*\u00020&H\u0003¢\u0006\u0004\b)\u0010*\u001a\"\u0010,\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002\"\u0014\u0010.\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00100\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;", "", "checked", "Lkotlin/Function1;", "Lkotlin/r2;", "onCheckedChange", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/material3/SegmentedButtonColors;", "colors", "Landroidx/compose/foundation/BorderStroke;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "icon", TTDownloadField.TT_LABEL, "SegmentedButton", "(Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;ZLv3/l;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;", "selected", "onClick", "(Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;ZLv3/a;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/unit/Dp;", "space", "Lkotlin/u;", "content", "SingleChoiceSegmentedButtonRow-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLv3/q;Landroidx/compose/runtime/Composer;II)V", "SingleChoiceSegmentedButtonRow", "MultiChoiceSegmentedButtonRow-uFdPcIQ", "MultiChoiceSegmentedButtonRow", "SegmentedButtonContent", "(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/runtime/State;", "", "interactionCountAsState", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "interactionCount", "interactionZIndex", "", "CheckedZIndexFactor", "F", "IconSpacing", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,786:1\n1116#2,6:787\n1116#2,6:793\n1116#2,6:831\n1116#2,6:874\n1116#2,6:924\n1116#2,6:930\n64#3:799\n64#3:842\n91#4,2:800\n93#4:830\n97#4:841\n91#4,2:843\n93#4:873\n97#4:884\n78#5,11:802\n91#5:840\n78#5,11:845\n91#5:883\n78#5,11:890\n91#5:922\n456#6,8:813\n464#6,3:827\n467#6,3:837\n456#6,8:856\n464#6,3:870\n467#6,3:880\n456#6,8:901\n464#6,3:915\n467#6,3:919\n3737#7,6:821\n3737#7,6:864\n3737#7,6:909\n69#8,5:885\n74#8:918\n78#8:923\n154#9:936\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt\n*L\n139#1:787,6\n214#1:793,6\n275#1:831,6\n312#1:874,6\n400#1:924,6\n401#1:930,6\n272#1:799\n309#1:842\n267#1:800,2\n267#1:830\n267#1:841\n305#1:843,2\n305#1:873\n305#1:884\n267#1:802,11\n267#1:840\n305#1:845,11\n305#1:883\n323#1:890,11\n323#1:922\n267#1:813,8\n267#1:827,3\n267#1:837,3\n305#1:856,8\n305#1:870,3\n305#1:880,3\n323#1:901,8\n323#1:915,3\n323#1:919,3\n267#1:821,6\n305#1:864,6\n323#1:909,6\n323#1:885,5\n323#1:918\n323#1:923\n777#1:936\n*E\n"})
/* loaded from: classes.dex */
public final class SegmentedButtonKt {
    private static final float CheckedZIndexFactor = 5.0f;
    private static final float IconSpacing = Dp.m6044constructorimpl(8);

    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: MultiChoiceSegmentedButtonRow-uFdPcIQ, reason: not valid java name */
    public static final void m2152MultiChoiceSegmentedButtonRowuFdPcIQ(@p4.m Modifier modifier, float f5, @p4.l v3.q<? super MultiChoiceSegmentedButtonRowScope, ? super Composer, ? super Integer, r2> qVar, @p4.m Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(155922315);
        int i11 = i6 & 1;
        if (i11 != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            i7 = i5;
        }
        int i12 = i6 & 2;
        if (i12 != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(f5)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i7 |= i10;
        }
        if ((i7 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i11 != 0) {
                modifier = Modifier.Companion;
            }
            if (i12 != 0) {
                f5 = SegmentedButtonDefaults.INSTANCE.m2150getBorderWidthD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(155922315, i7, -1, "androidx.compose.material3.MultiChoiceSegmentedButtonRow (SegmentedButton.kt:303)");
            }
            Modifier width = IntrinsicKt.width(SizeKt.m587defaultMinSizeVpY3zN4$default(modifier, 0.0f, OutlinedSegmentedButtonTokens.INSTANCE.m2989getContainerHeightD9Ej5fM(), 1, null), IntrinsicSize.Min);
            Arrangement.HorizontalOrVertical m462spacedBy0680j_4 = Arrangement.INSTANCE.m462spacedBy0680j_4(Dp.m6044constructorimpl(-f5));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m462spacedBy0680j_4, centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(width);
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
            Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(573415834);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MultiChoiceSegmentedButtonScopeWrapper(rowScopeInstance);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            qVar.invoke((MultiChoiceSegmentedButtonScopeWrapper) rememberedValue, startRestartGroup, Integer.valueOf(((i7 >> 3) & 112) | 6));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        float f6 = f5;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SegmentedButtonKt$MultiChoiceSegmentedButtonRow$2(modifier2, f6, qVar, i5, i6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a3  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SegmentedButton(@p4.l androidx.compose.material3.MultiChoiceSegmentedButtonRowScope r27, boolean r28, @p4.l v3.l<? super java.lang.Boolean, kotlin.r2> r29, @p4.l androidx.compose.ui.graphics.Shape r30, @p4.m androidx.compose.ui.Modifier r31, boolean r32, @p4.m androidx.compose.material3.SegmentedButtonColors r33, @p4.m androidx.compose.foundation.BorderStroke r34, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r35, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r37, @p4.m androidx.compose.runtime.Composer r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SegmentedButtonKt.SegmentedButton(androidx.compose.material3.MultiChoiceSegmentedButtonRowScope, boolean, v3.l, androidx.compose.ui.graphics.Shape, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SegmentedButtonColors, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, v3.p, v3.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final void SegmentedButtonContent(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1464121570);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1464121570, i6, -1, "androidx.compose.material3.SegmentedButtonContent (SegmentedButton.kt:321)");
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier padding = PaddingKt.padding(Modifier.Companion, ButtonDefaults.INSTANCE.getTextButtonContentPadding());
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
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
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), OutlinedSegmentedButtonTokens.INSTANCE.getLabelTextFont()), ComposableLambdaKt.composableLambda(startRestartGroup, 1420592651, true, new SegmentedButtonKt$SegmentedButtonContent$1$1(pVar, pVar2)), startRestartGroup, 48);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SegmentedButtonKt$SegmentedButtonContent$2(pVar, pVar2, i5));
        }
    }

    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: SingleChoiceSegmentedButtonRow-uFdPcIQ, reason: not valid java name */
    public static final void m2153SingleChoiceSegmentedButtonRowuFdPcIQ(@p4.m Modifier modifier, float f5, @p4.l v3.q<? super SingleChoiceSegmentedButtonRowScope, ? super Composer, ? super Integer, r2> qVar, @p4.m Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1520863498);
        int i11 = i6 & 1;
        if (i11 != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            i7 = i5;
        }
        int i12 = i6 & 2;
        if (i12 != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(f5)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i7 |= i10;
        }
        if ((i7 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i11 != 0) {
                modifier = Modifier.Companion;
            }
            if (i12 != 0) {
                f5 = SegmentedButtonDefaults.INSTANCE.m2150getBorderWidthD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520863498, i7, -1, "androidx.compose.material3.SingleChoiceSegmentedButtonRow (SegmentedButton.kt:265)");
            }
            Modifier width = IntrinsicKt.width(SizeKt.m587defaultMinSizeVpY3zN4$default(SelectableGroupKt.selectableGroup(modifier), 0.0f, OutlinedSegmentedButtonTokens.INSTANCE.m2989getContainerHeightD9Ej5fM(), 1, null), IntrinsicSize.Min);
            Arrangement.HorizontalOrVertical m462spacedBy0680j_4 = Arrangement.INSTANCE.m462spacedBy0680j_4(Dp.m6044constructorimpl(-f5));
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m462spacedBy0680j_4, centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(width);
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
            Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-181589424);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SingleChoiceSegmentedButtonScopeWrapper(rowScopeInstance);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            qVar.invoke((SingleChoiceSegmentedButtonScopeWrapper) rememberedValue, startRestartGroup, Integer.valueOf(((i7 >> 3) & 112) | 6));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        float f6 = f5;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SegmentedButtonKt$SingleChoiceSegmentedButtonRow$2(modifier2, f6, qVar, i5, i6));
        }
    }

    @Composable
    private static final State<Integer> interactionCountAsState(InteractionSource interactionSource, Composer composer, int i5) {
        composer.startReplaceableGroup(281890131);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(281890131, i5, -1, "androidx.compose.material3.interactionCountAsState (SegmentedButton.kt:398)");
        }
        composer.startReplaceableGroup(-1372284393);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        boolean z4 = false;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableIntState mutableIntState = (MutableIntState) rememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-1372284334);
        int i6 = i5 & 14;
        if (((i6 ^ 6) > 4 && composer.changed(interactionSource)) || (i5 & 6) == 4) {
            z4 = true;
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (z4 || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SegmentedButtonKt$interactionCountAsState$1$1(interactionSource, mutableIntState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (v3.p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue2, composer, i6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableIntState;
    }

    private static final Modifier interactionZIndex(Modifier modifier, boolean z4, State<Integer> state) {
        return LayoutModifierKt.layout(modifier, new SegmentedButtonKt$interactionZIndex$1(state, z4));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SegmentedButton(@p4.l androidx.compose.material3.SingleChoiceSegmentedButtonRowScope r26, boolean r27, @p4.l v3.a<kotlin.r2> r28, @p4.l androidx.compose.ui.graphics.Shape r29, @p4.m androidx.compose.ui.Modifier r30, boolean r31, @p4.m androidx.compose.material3.SegmentedButtonColors r32, @p4.m androidx.compose.foundation.BorderStroke r33, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r34, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r35, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, @p4.m androidx.compose.runtime.Composer r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SegmentedButtonKt.SegmentedButton(androidx.compose.material3.SingleChoiceSegmentedButtonRowScope, boolean, v3.a, androidx.compose.ui.graphics.Shape, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SegmentedButtonColors, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, v3.p, v3.p, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
