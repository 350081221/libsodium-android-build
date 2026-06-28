package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ChipKt$FilterChip$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ SelectableChipColors $colors;
    final /* synthetic */ q<RowScope, Composer, Integer, r2> $content;
    final /* synthetic */ State<Color> $contentColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ p<Composer, Integer, r2> $selectedIcon;
    final /* synthetic */ p<Composer, Integer, r2> $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.ChipKt$FilterChip$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ SelectableChipColors $colors;
        final /* synthetic */ q<RowScope, Composer, Integer, r2> $content;
        final /* synthetic */ State<Color> $contentColor;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ p<Composer, Integer, r2> $leadingIcon;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ p<Composer, Integer, r2> $selectedIcon;
        final /* synthetic */ p<Composer, Integer, r2> $trailingIcon;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt$FilterChip$3$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,761:1\n154#2:762\n154#2:763\n91#3,2:764\n93#3:794\n91#3,2:875\n93#3:905\n97#3:910\n97#3:915\n79#4,11:766\n79#4,11:802\n79#4,11:836\n92#4:868\n92#4:873\n79#4,11:877\n92#4:909\n92#4:914\n456#5,8:777\n464#5,3:791\n456#5,8:813\n464#5,3:827\n456#5,8:847\n464#5,3:861\n467#5,3:865\n467#5,3:870\n456#5,8:888\n464#5,3:902\n467#5,3:906\n467#5,3:911\n3737#6,6:785\n3737#6,6:821\n3737#6,6:855\n3737#6,6:896\n67#7,7:795\n74#7:830\n69#7,5:831\n74#7:864\n78#7:869\n78#7:874\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt$FilterChip$3$1$1\n*L\n225#1:762\n233#1:763\n216#1:764,2\n216#1:794\n279#1:875,2\n279#1:905\n279#1:910\n216#1:915\n216#1:766,11\n241#1:802,11\n266#1:836,11\n266#1:868\n241#1:873\n279#1:877,11\n279#1:909\n216#1:914\n216#1:777,8\n216#1:791,3\n241#1:813,8\n241#1:827,3\n266#1:847,8\n266#1:861,3\n266#1:865,3\n241#1:870,3\n279#1:888,8\n279#1:902,3\n279#1:906,3\n216#1:911,3\n216#1:785,6\n241#1:821,6\n266#1:855,6\n279#1:896,6\n241#1:795,7\n241#1:830\n266#1:831,5\n266#1:864\n266#1:869\n241#1:874\n*E\n"})
        /* renamed from: androidx.compose.material.ChipKt$FilterChip$3$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00401 extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ SelectableChipColors $colors;
            final /* synthetic */ q<RowScope, Composer, Integer, r2> $content;
            final /* synthetic */ State<Color> $contentColor;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ p<Composer, Integer, r2> $leadingIcon;
            final /* synthetic */ boolean $selected;
            final /* synthetic */ p<Composer, Integer, r2> $selectedIcon;
            final /* synthetic */ p<Composer, Integer, r2> $trailingIcon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00401(p<? super Composer, ? super Integer, r2> pVar, boolean z4, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, SelectableChipColors selectableChipColors, boolean z5, State<Color> state) {
                super(2);
                this.$leadingIcon = pVar;
                this.$selected = z4;
                this.$selectedIcon = pVar2;
                this.$trailingIcon = pVar3;
                this.$content = qVar;
                this.$colors = selectableChipColors;
                this.$enabled = z5;
                this.$contentColor = state;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return r2.f19517a;
            }

            /* JADX WARN: Type inference failed for: r5v17 */
            /* JADX WARN: Type inference failed for: r5v4 */
            /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@m Composer composer, int i5) {
                float m6044constructorimpl;
                float m6044constructorimpl2;
                float f5;
                q<RowScope, Composer, Integer, r2> qVar;
                Arrangement arrangement;
                int i6;
                float f6;
                ?? r5;
                Modifier modifier;
                float f7;
                float f8;
                float f9;
                if ((i5 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1543702066, i5, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:215)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier m587defaultMinSizeVpY3zN4$default = SizeKt.m587defaultMinSizeVpY3zN4$default(IntrinsicKt.width(companion, IntrinsicSize.Max), 0.0f, ChipDefaults.INSTANCE.m1261getMinHeightD9Ej5fM(), 1, null);
                if (this.$leadingIcon == null && (!this.$selected || this.$selectedIcon == null)) {
                    m6044constructorimpl = ChipKt.HorizontalPadding;
                } else {
                    m6044constructorimpl = Dp.m6044constructorimpl(0);
                }
                float f10 = m6044constructorimpl;
                if (this.$trailingIcon == null) {
                    m6044constructorimpl2 = ChipKt.HorizontalPadding;
                } else {
                    m6044constructorimpl2 = Dp.m6044constructorimpl(0);
                }
                Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(m587defaultMinSizeVpY3zN4$default, f10, 0.0f, m6044constructorimpl2, 0.0f, 10, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Horizontal start = arrangement2.getStart();
                Alignment.Companion companion2 = Alignment.Companion;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                p<Composer, Integer, r2> pVar = this.$leadingIcon;
                boolean z4 = this.$selected;
                p<Composer, Integer, r2> pVar2 = this.$selectedIcon;
                q<RowScope, Composer, Integer, r2> qVar2 = this.$content;
                p<Composer, Integer, r2> pVar3 = this.$trailingIcon;
                SelectableChipColors selectableChipColors = this.$colors;
                boolean z5 = this.$enabled;
                State<Color> state = this.$contentColor;
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                a<ComposeUiNode> constructor = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
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
                Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer.startReplaceableGroup(-1943411941);
                if (pVar != null || (z4 && pVar2 != null)) {
                    f5 = ChipKt.LeadingIconStartSpacing;
                    SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, f5), composer, 6);
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    a<ComposeUiNode> constructor2 = companion3.getConstructor();
                    qVar = qVar2;
                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                    arrangement = arrangement2;
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
                    Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer.startReplaceableGroup(649985791);
                    if (pVar != null) {
                        State<Color> leadingIconColor = selectableChipColors.leadingIconColor(z5, z4, composer, 0);
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3736getAlphaimpl(leadingIconColor.getValue().m3744unboximpl())))}, pVar, composer, 8);
                    }
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-1943411127);
                    if (!z4 || pVar2 == null) {
                        i6 = -1323940314;
                    } else {
                        long m3744unboximpl = state.getValue().m3744unboximpl();
                        composer.startReplaceableGroup(649986622);
                        if (pVar != null) {
                            f7 = ChipKt.SelectedIconContainerSize;
                            modifier = ClipKt.clip(BackgroundKt.m200backgroundbw27NRU(SizeKt.m594requiredSize3ABfNKs(companion, f7), state.getValue().m3744unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                            r5 = 0;
                            m3744unboximpl = selectableChipColors.backgroundColor(z5, z4, composer, 0).getValue().m3744unboximpl();
                        } else {
                            r5 = 0;
                            modifier = companion;
                        }
                        composer.endReplaceableGroup();
                        Alignment center = companion2.getCenter();
                        composer.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, r5, composer, 6);
                        i6 = -1323940314;
                        composer.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, r5);
                        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                        a<ComposeUiNode> constructor3 = companion3.getConstructor();
                        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier);
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
                        Updater.m3271setimpl(m3264constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                        composer.startReplaceableGroup(2058660585);
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(m3744unboximpl)), pVar2, composer, ProvidedValue.$stable | 0);
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                    }
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    f6 = ChipKt.LeadingIconEndSpacing;
                    SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, f6), composer, 6);
                } else {
                    arrangement = arrangement2;
                    qVar = qVar2;
                    i6 = -1323940314;
                }
                composer.endReplaceableGroup();
                Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                Arrangement.Horizontal start2 = arrangement.getStart();
                Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, centerVertically2, composer, 54);
                composer.startReplaceableGroup(i6);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                a<ComposeUiNode> constructor4 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(weight$default);
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
                Updater.m3271setimpl(m3264constructorimpl4, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl4.getInserting() || !l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                qVar.invoke(rowScopeInstance, composer, 6);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-1181292468);
                if (pVar3 != null) {
                    f8 = ChipKt.TrailingIconSpacing;
                    SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, f8), composer, 6);
                    pVar3.invoke(composer, 0);
                    f9 = ChipKt.TrailingIconSpacing;
                    SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, f9), composer, 6);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(p<? super Composer, ? super Integer, r2> pVar, boolean z4, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, SelectableChipColors selectableChipColors, boolean z5, State<Color> state) {
            super(2);
            this.$leadingIcon = pVar;
            this.$selected = z4;
            this.$selectedIcon = pVar2;
            this.$trailingIcon = pVar3;
            this.$content = qVar;
            this.$colors = selectableChipColors;
            this.$enabled = z5;
            this.$contentColor = state;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1582291359, i5, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:212)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2(), ComposableLambdaKt.composableLambda(composer, -1543702066, true, new C00401(this.$leadingIcon, this.$selected, this.$selectedIcon, this.$trailingIcon, this.$content, this.$colors, this.$enabled, this.$contentColor)), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$FilterChip$3(State<Color> state, p<? super Composer, ? super Integer, r2> pVar, boolean z4, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, SelectableChipColors selectableChipColors, boolean z5) {
        super(2);
        this.$contentColor = state;
        this.$leadingIcon = pVar;
        this.$selected = z4;
        this.$selectedIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$content = qVar;
        this.$colors = selectableChipColors;
        this.$enabled = z5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@m Composer composer, int i5) {
        if ((i5 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(722126431, i5, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:211)");
        }
        CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3736getAlphaimpl(this.$contentColor.getValue().m3744unboximpl()))), ComposableLambdaKt.composableLambda(composer, 1582291359, true, new AnonymousClass1(this.$leadingIcon, this.$selected, this.$selectedIcon, this.$trailingIcon, this.$content, this.$colors, this.$enabled, this.$contentColor)), composer, ProvidedValue.$stable | 0 | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
