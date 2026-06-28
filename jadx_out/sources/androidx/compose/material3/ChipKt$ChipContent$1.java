package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$ChipContent$1\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,2741:1\n78#2,11:2742\n78#2,11:2775\n91#2:2807\n78#2,11:2812\n91#2:2844\n78#2,11:2851\n91#2:2883\n91#2:2888\n456#3,8:2753\n464#3,3:2767\n456#3,8:2786\n464#3,3:2800\n467#3,3:2804\n456#3,8:2823\n464#3,3:2837\n467#3,3:2841\n456#3,8:2862\n464#3,3:2876\n467#3,3:2880\n467#3,3:2885\n3737#4,6:2761\n3737#4,6:2794\n3737#4,6:2831\n3737#4,6:2870\n69#5,5:2770\n74#5:2803\n78#5:2808\n69#5,5:2846\n74#5:2879\n78#5:2884\n154#6:2809\n91#7,2:2810\n93#7:2840\n97#7:2845\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$ChipContent$1\n*L\n1953#1:2742,11\n1959#1:2775,11\n1959#1:2807\n1975#1:2812,11\n1975#1:2844\n1984#1:2851,11\n1984#1:2883\n1953#1:2888\n1953#1:2753,8\n1953#1:2767,3\n1959#1:2786,8\n1959#1:2800,3\n1959#1:2804,3\n1975#1:2823,8\n1975#1:2837,3\n1975#1:2841,3\n1984#1:2862,8\n1984#1:2876,3\n1984#1:2880,3\n1953#1:2885,3\n1953#1:2761,6\n1959#1:2794,6\n1975#1:2831,6\n1984#1:2870,6\n1959#1:2770,5\n1959#1:2803\n1959#1:2808\n1984#1:2846,5\n1984#1:2879\n1984#1:2884\n1978#1:2809\n1975#1:2810,2\n1975#1:2840\n1975#1:2845\n*E\n"})
/* loaded from: classes.dex */
public final class ChipKt$ChipContent$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $avatar;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ long $leadingIconColor;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;
    final /* synthetic */ long $trailingIconColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$ChipContent$1(float f5, PaddingValues paddingValues, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, long j5, v3.p<? super Composer, ? super Integer, r2> pVar4, long j6) {
        super(2);
        this.$minHeight = f5;
        this.$paddingValues = paddingValues;
        this.$avatar = pVar;
        this.$leadingIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$leadingIconColor = j5;
        this.$label = pVar4;
        this.$trailingIconColor = j6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        float f5;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1748799148, i5, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:1952)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier padding = PaddingKt.padding(SizeKt.m587defaultMinSizeVpY3zN4$default(companion, 0.0f, this.$minHeight, 1, null), this.$paddingValues);
        AnonymousClass1 anonymousClass1 = new MeasurePolicy() { // from class: androidx.compose.material3.ChipKt$ChipContent$1.1

            @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.ChipKt$ChipContent$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            static final class C00601 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
                final /* synthetic */ int $height;
                final /* synthetic */ Placeable $labelPlaceable;
                final /* synthetic */ int $leadingIconHeight;
                final /* synthetic */ Placeable $leadingIconPlaceable;
                final /* synthetic */ int $leadingIconWidth;
                final /* synthetic */ int $trailingIconHeight;
                final /* synthetic */ Placeable $trailingIconPlaceable;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00601(Placeable placeable, int i5, int i6, Placeable placeable2, int i7, Placeable placeable3, int i8) {
                    super(1);
                    this.$leadingIconPlaceable = placeable;
                    this.$leadingIconHeight = i5;
                    this.$height = i6;
                    this.$labelPlaceable = placeable2;
                    this.$leadingIconWidth = i7;
                    this.$trailingIconPlaceable = placeable3;
                    this.$trailingIconHeight = i8;
                }

                @Override // v3.l
                public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                    Placeable placeable = this.$leadingIconPlaceable;
                    if (placeable != null) {
                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(this.$leadingIconHeight, this.$height), 0.0f, 4, null);
                    }
                    Placeable.PlacementScope.placeRelative$default(placementScope, this.$labelPlaceable, this.$leadingIconWidth, 0, 0.0f, 4, null);
                    Placeable placeable2 = this.$trailingIconPlaceable;
                    if (placeable2 != null) {
                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, this.$labelPlaceable.getWidth() + this.$leadingIconWidth, Alignment.Companion.getCenterVertically().align(this.$trailingIconHeight, this.$height), 0.0f, 4, null);
                    }
                }
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @p4.l
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                Placeable placeable;
                Measurable measurable;
                Placeable placeable2;
                Measurable measurable2;
                int size = list.size();
                int i6 = 0;
                while (true) {
                    placeable = null;
                    if (i6 < size) {
                        measurable = list.get(i6);
                        if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable), "leadingIcon")) {
                            break;
                        }
                        i6++;
                    } else {
                        measurable = null;
                        break;
                    }
                }
                Measurable measurable3 = measurable;
                if (measurable3 != null) {
                    placeable2 = measurable3.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null));
                } else {
                    placeable2 = null;
                }
                int widthOrZero = TextFieldImplKt.widthOrZero(placeable2);
                int heightOrZero = TextFieldImplKt.heightOrZero(placeable2);
                int size2 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size2) {
                        measurable2 = list.get(i7);
                        if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable2), "trailingIcon")) {
                            break;
                        }
                        i7++;
                    } else {
                        measurable2 = null;
                        break;
                    }
                }
                Measurable measurable4 = measurable2;
                if (measurable4 != null) {
                    placeable = measurable4.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null));
                }
                Placeable placeable3 = placeable;
                int widthOrZero2 = TextFieldImplKt.widthOrZero(placeable3);
                int heightOrZero2 = TextFieldImplKt.heightOrZero(placeable3);
                int size3 = list.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    Measurable measurable5 = list.get(i8);
                    if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable5), TTDownloadField.TT_LABEL)) {
                        Placeable mo4998measureBRTryo0 = measurable5.mo4998measureBRTryo0(ConstraintsKt.m6017offsetNN6EwU$default(j5, -(widthOrZero + widthOrZero2), 0, 2, null));
                        int width = mo4998measureBRTryo0.getWidth() + widthOrZero + widthOrZero2;
                        int max = Math.max(heightOrZero, Math.max(mo4998measureBRTryo0.getHeight(), heightOrZero2));
                        return MeasureScope.layout$default(measureScope, width, max, null, new C00601(placeable2, heightOrZero, max, mo4998measureBRTryo0, widthOrZero, placeable3, heightOrZero2), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        };
        v3.p<Composer, Integer, r2> pVar = this.$avatar;
        v3.p<Composer, Integer, r2> pVar2 = this.$leadingIcon;
        v3.p<Composer, Integer, r2> pVar3 = this.$trailingIcon;
        long j5 = this.$leadingIconColor;
        v3.p<Composer, Integer, r2> pVar4 = this.$label;
        long j6 = this.$trailingIconColor;
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion2.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
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
        Updater.m3271setimpl(m3264constructorimpl, anonymousClass1, companion2.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(651014582);
        if (pVar != null || pVar2 != null) {
            Modifier layoutId = LayoutIdKt.layoutId(companion, "leadingIcon");
            Alignment center = Alignment.Companion.getCenter();
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(layoutId);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(composer);
            Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (pVar != null) {
                composer.startReplaceableGroup(1725997334);
                pVar.invoke(composer, 0);
                composer.endReplaceableGroup();
            } else if (pVar2 != null) {
                composer.startReplaceableGroup(1725997437);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(j5)), pVar2, composer, ProvidedValue.$stable | 0);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1725997699);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        Modifier layoutId2 = LayoutIdKt.layoutId(companion, TTDownloadField.TT_LABEL);
        f5 = ChipKt.HorizontalElementsPadding;
        Modifier m554paddingVpY3zN4 = PaddingKt.m554paddingVpY3zN4(layoutId2, f5, Dp.m6044constructorimpl(0));
        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
        Alignment.Companion companion3 = Alignment.Companion;
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        v3.a<ComposeUiNode> constructor3 = companion2.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m554paddingVpY3zN4);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer m3264constructorimpl3 = Updater.m3264constructorimpl(composer);
        Updater.m3271setimpl(m3264constructorimpl3, rowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
        if (m3264constructorimpl3.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        pVar4.invoke(composer, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-313041276);
        if (pVar3 != null) {
            Modifier layoutId3 = LayoutIdKt.layoutId(companion, "trailingIcon");
            Alignment center2 = companion3.getCenter();
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor4 = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(layoutId3);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer m3264constructorimpl4 = Updater.m3264constructorimpl(composer);
            Updater.m3271setimpl(m3264constructorimpl4, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl4.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(j6)), pVar3, composer, ProvidedValue.$stable | 0);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
