package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;
import v3.p;

@i0(d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004*\u0001\u0012\u001a8\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a@\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\t\u0010\r\u001a\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e\"\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/u;", "measurePolicy", "Lkotlin/r2;", "SubcomposeLayout", "(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "state", "(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "", "maxSlotsToRetainForReuse", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "SubcomposeSlotReusePolicy", "androidx/compose/ui/layout/SubcomposeLayoutKt$ReusedSlotId$1", "ReusedSlotId", "Landroidx/compose/ui/layout/SubcomposeLayoutKt$ReusedSlotId$1;", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,987:1\n25#2:988\n286#2,8:995\n294#2,2:1009\n1116#3,6:989\n3737#4,6:1003\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n*L\n77#1:988\n114#1:995,8\n114#1:1009,2\n77#1:989,6\n123#1:1003,6\n*E\n"})
/* loaded from: classes.dex */
public final class SubcomposeLayoutKt {

    @l
    private static final SubcomposeLayoutKt$ReusedSlotId$1 ReusedSlotId = new Object() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$ReusedSlotId$1
        @l
        public String toString() {
            return "ReusedSlotId";
        }
    };

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SubcomposeLayout(@m Modifier modifier, @l p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar, @m Composer composer, int i5, int i6) {
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1298353104);
        int i8 = i6 & 1;
        if (i8 != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i7 = (startRestartGroup.changed(modifier) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i5 & 112) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i7 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i8 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1298353104, i7, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:74)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SubcomposeLayoutState();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) rememberedValue;
            int i9 = i7 << 3;
            SubcomposeLayout(subcomposeLayoutState, modifier, pVar, startRestartGroup, (i9 & 112) | 8 | (i9 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SubcomposeLayoutKt$SubcomposeLayout$2(modifier, pVar, i5, i6));
        }
    }

    @l
    public static final SubcomposeSlotReusePolicy SubcomposeSlotReusePolicy(int i5) {
        return new FixedCountSubcomposeSlotReusePolicy(i5);
    }

    public static final /* synthetic */ SubcomposeLayoutKt$ReusedSlotId$1 access$getReusedSlotId$p() {
        return ReusedSlotId;
    }

    @Composable
    @UiComposable
    public static final void SubcomposeLayout(@l SubcomposeLayoutState subcomposeLayoutState, @m Modifier modifier, @l p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar, @m Composer composer, int i5, int i6) {
        Composer startRestartGroup = composer.startRestartGroup(-511989831);
        if ((i6 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511989831, i5, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:108)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        a<LayoutNode> constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
        startRestartGroup.startReplaceableGroup(1405779621);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new SubcomposeLayoutKt$SubcomposeLayout$$inlined$ReusableComposeNode$1(constructor$ui_release));
        } else {
            startRestartGroup.useNode();
        }
        Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
        Updater.m3271setimpl(m3264constructorimpl, subcomposeLayoutState, subcomposeLayoutState.getSetRoot$ui_release());
        Updater.m3271setimpl(m3264constructorimpl, rememberCompositionContext, subcomposeLayoutState.getSetCompositionContext$ui_release());
        Updater.m3271setimpl(m3264constructorimpl, pVar, subcomposeLayoutState.getSetMeasurePolicy$ui_release());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m3271setimpl(m3264constructorimpl, materializeModifier, companion.getSetModifier());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (!startRestartGroup.getSkipping()) {
            EffectsKt.SideEffect(new SubcomposeLayoutKt$SubcomposeLayout$4(subcomposeLayoutState), startRestartGroup, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SubcomposeLayoutKt$SubcomposeLayout$5(subcomposeLayoutState, modifier2, pVar, i5, i6));
        }
    }
}
