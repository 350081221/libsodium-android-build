package androidx.compose.material3.internal;

import android.view.View;
import androidx.compose.material3.TouchExplorationStateProvider_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.List;
import java.util.UUID;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a<\u0010\u0007\u001a\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0013\b\b\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0083\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\u0017\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "onDismissRequest", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupPositionProvider", "Landroidx/compose/runtime/Composable;", "content", "ExposedDropdownMenuPopup", "(Lv3/a;Landroidx/compose/ui/window/PopupPositionProvider;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "SimpleStack", "(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "", "isTouchExplorationEnabled", "currentContent", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,436:1\n74#2:437\n74#2:438\n74#2:439\n1116#3,6:440\n1116#3,6:446\n1116#3,6:452\n1116#3,6:458\n1116#3,6:464\n78#4,11:470\n91#4:501\n78#4,11:502\n91#4:533\n456#5,8:481\n464#5,6:495\n456#5,8:513\n464#5,6:527\n3737#6,6:489\n3737#6,6:521\n81#7:534\n81#7:535\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt\n*L\n86#1:437\n87#1:438\n88#1:439\n94#1:440,6\n121#1:446,6\n134#1:452,6\n146#1:458,6\n157#1:464,6\n144#1:470,11\n144#1:501\n168#1:502,11\n168#1:533\n144#1:481,8\n144#1:495,6\n168#1:513,8\n168#1:527,6\n144#1:489,6\n168#1:521,6\n89#1:534\n92#1:535\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopup_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ExposedDropdownMenuPopup(@m a<r2> aVar, @l PopupPositionProvider popupPositionProvider, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5, int i6) {
        a<r2> aVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        a<r2> aVar3;
        final LayoutDirection layoutDirection;
        int i11;
        Object obj;
        boolean z4;
        Composer startRestartGroup = composer.startRestartGroup(-727958629);
        int i12 = i6 & 1;
        if (i12 != 0) {
            i7 = i5 | 6;
            aVar2 = aVar;
        } else if ((i5 & 6) == 0) {
            aVar2 = aVar;
            if (startRestartGroup.changedInstance(aVar2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            aVar2 = aVar;
            i7 = i5;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(popupPositionProvider)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i7 |= i10;
        }
        int i13 = i7;
        if ((i13 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            aVar3 = aVar2;
        } else {
            if (i12 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-727958629, i13, -1, "androidx.compose.material3.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:84)");
            }
            View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            State<Boolean> state = TouchExplorationStateProvider_androidKt.touchExplorationState(startRestartGroup, 0);
            CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(pVar, startRestartGroup, (i13 >> 6) & 14);
            UUID uuid = (UUID) RememberSaveableKt.m3351rememberSaveable(new Object[0], (Saver) null, (String) null, (a) ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupId$1.INSTANCE, startRestartGroup, 3072, 6);
            boolean ExposedDropdownMenuPopup$lambda$0 = ExposedDropdownMenuPopup$lambda$0(state);
            startRestartGroup.startReplaceableGroup(-246571242);
            boolean changed = startRestartGroup.changed(ExposedDropdownMenuPopup$lambda$0);
            Object rememberedValue = startRestartGroup.rememberedValue();
            boolean z5 = true;
            if (!changed && rememberedValue != Composer.Companion.getEmpty()) {
                layoutDirection = layoutDirection2;
                i11 = i13;
                obj = rememberedValue;
            } else {
                layoutDirection = layoutDirection2;
                i11 = i13;
                PopupLayout popupLayout = new PopupLayout(aVar3, view, popupPositionProvider, ExposedDropdownMenuPopup$lambda$0(state), density, uuid);
                popupLayout.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(-493861435, true, new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1(popupLayout, rememberUpdatedState)));
                startRestartGroup.updateRememberedValue(popupLayout);
                obj = popupLayout;
            }
            final PopupLayout popupLayout2 = (PopupLayout) obj;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-246570242);
            boolean changedInstance = startRestartGroup.changedInstance(popupLayout2);
            int i14 = i11 & 14;
            if (i14 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean changed2 = changedInstance | z4 | startRestartGroup.changed(layoutDirection);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1(popupLayout2, aVar3, layoutDirection);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(popupLayout2, (v3.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-246569906);
            boolean changedInstance2 = startRestartGroup.changedInstance(popupLayout2);
            if (i14 != 4) {
                z5 = false;
            }
            boolean changed3 = changedInstance2 | z5 | startRestartGroup.changed(layoutDirection);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2$1(popupLayout2, aVar3, layoutDirection);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((a) rememberedValue3, startRestartGroup, 0);
            Modifier.Companion companion = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(-246569499);
            boolean changedInstance3 = startRestartGroup.changedInstance(popupLayout2);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$4$1(popupLayout2);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (v3.l) rememberedValue4);
            startRestartGroup.startReplaceableGroup(-246569030);
            boolean changedInstance4 = startRestartGroup.changedInstance(popupLayout2) | startRestartGroup.changed(layoutDirection);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = new MeasurePolicy() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5$1

                    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5$1$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass1 extends n0 implements v3.l<Placeable.PlacementScope, r2> {
                        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                        AnonymousClass1() {
                            super(1);
                        }

                        @Override // v3.l
                        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@l Placeable.PlacementScope placementScope) {
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
                        PopupLayout.this.setParentLayoutDirection(layoutDirection);
                        return MeasureScope.layout$default(measureScope, 0, 0, null, AnonymousClass1.INSTANCE, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue5;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(onGloballyPositioned);
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
            Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6(aVar3, popupPositionProvider, pVar, i5, i6));
        }
    }

    private static final boolean ExposedDropdownMenuPopup$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<Composer, Integer, r2> ExposedDropdownMenuPopup$lambda$1(State<? extends p<? super Composer, ? super Integer, r2>> state) {
        return (p) state.getValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void SimpleStack(Modifier modifier, p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        composer.startReplaceableGroup(437877758);
        ExposedDropdownMenuPopup_androidKt$SimpleStack$1 exposedDropdownMenuPopup_androidKt$SimpleStack$1 = ExposedDropdownMenuPopup_androidKt$SimpleStack$1.INSTANCE;
        int i6 = ((i5 << 3) & 112) | ((i5 >> 3) & 14);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i7 = ((i6 << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
        Updater.m3271setimpl(m3264constructorimpl, exposedDropdownMenuPopup_androidKt$SimpleStack$1, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, Integer.valueOf((i7 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        pVar.invoke(composer, Integer.valueOf((i7 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
