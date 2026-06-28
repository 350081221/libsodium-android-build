package androidx.compose.material.internal;

import android.view.View;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
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

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a<\u0010\u0007\u001a\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0013\b\b\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0083\b¢\u0006\u0004\b\u000b\u0010\f\" \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\u0017\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "onDismissRequest", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupPositionProvider", "Landroidx/compose/runtime/Composable;", "content", "ExposedDropdownMenuPopup", "(Lv3/a;Landroidx/compose/ui/window/PopupPositionProvider;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "SimpleStack", "(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "currentContent", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,464:1\n74#2:465\n74#2:466\n74#2:467\n74#2:468\n25#3:469\n456#3,8:487\n464#3,6:501\n456#3,8:519\n464#3,6:533\n1116#4,6:470\n79#5,11:476\n92#5:507\n79#5,11:508\n92#5:539\n3737#6,6:495\n3737#6,6:527\n81#7:540\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt\n*L\n85#1:465\n86#1:466\n87#1:467\n88#1:468\n92#1:469\n150#1:487,8\n150#1:501,6\n179#1:519,8\n179#1:533,6\n92#1:470,6\n150#1:476,11\n150#1:507\n179#1:508,11\n179#1:539\n150#1:495,6\n179#1:527,6\n90#1:540\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopup_androidKt {

    @l
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, ExposedDropdownMenuPopup_androidKt$LocalPopupTestTag$1.INSTANCE, 1, null);

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
        String str;
        a<r2> aVar4;
        int i11;
        Composer composer2;
        Object obj;
        a<r2> aVar5;
        Composer composer3;
        Composer startRestartGroup = composer.startRestartGroup(-707851182);
        int i12 = i6 & 1;
        if (i12 != 0) {
            i7 = i5 | 6;
            aVar2 = aVar;
        } else if ((i5 & 14) == 0) {
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
        } else if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(popupPositionProvider)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i5 & 896) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i7 |= i10;
        }
        int i13 = i7;
        if ((i13 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            aVar5 = aVar2;
            composer3 = startRestartGroup;
        } else {
            if (i12 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-707851182, i13, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:83)");
            }
            View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            String str2 = (String) startRestartGroup.consume(LocalPopupTestTag);
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(pVar, startRestartGroup, (i13 >> 6) & 14);
            UUID uuid = (UUID) RememberSaveableKt.m3351rememberSaveable(new Object[0], (Saver) null, (String) null, (a) ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupId$1.INSTANCE, startRestartGroup, 3080, 6);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                layoutDirection = layoutDirection2;
                str = str2;
                aVar4 = aVar3;
                i11 = i13;
                Composer composer4 = startRestartGroup;
                PopupLayout popupLayout = new PopupLayout(aVar3, str2, view, density, popupPositionProvider, uuid);
                popupLayout.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(580081703, true, new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1(popupLayout, rememberUpdatedState)));
                composer4.updateRememberedValue(popupLayout);
                obj = popupLayout;
                composer2 = composer4;
            } else {
                layoutDirection = layoutDirection2;
                str = str2;
                aVar4 = aVar3;
                i11 = i13;
                composer2 = startRestartGroup;
                obj = rememberedValue;
            }
            composer2.endReplaceableGroup();
            final PopupLayout popupLayout2 = (PopupLayout) obj;
            EffectsKt.DisposableEffect(popupLayout2, new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1(popupLayout2, aVar4, str, layoutDirection), composer2, 8);
            EffectsKt.SideEffect(new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2(popupLayout2, aVar4, str, layoutDirection), composer2, 0);
            EffectsKt.DisposableEffect(popupPositionProvider, new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$3(popupLayout2, popupPositionProvider), composer2, (i11 >> 3) & 14);
            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.Companion, new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5(popupLayout2));
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6

                @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1, reason: invalid class name */
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
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(onGloballyPositioned);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(composer2);
            Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            aVar5 = aVar4;
            composer3 = composer2;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7(aVar5, popupPositionProvider, pVar, i5, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<Composer, Integer, r2> ExposedDropdownMenuPopup$lambda$0(State<? extends p<? super Composer, ? super Integer, r2>> state) {
        return (p) state.getValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void SimpleStack(Modifier modifier, p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        composer.startReplaceableGroup(-1085885553);
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

    @l
    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }
}
