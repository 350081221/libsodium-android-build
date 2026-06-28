package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
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
public final class ChipKt$Chip$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ q<RowScope, Composer, Integer, r2> $content;
    final /* synthetic */ State<Color> $contentColor$delegate;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ p<Composer, Integer, r2> $leadingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.ChipKt$Chip$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ ChipColors $colors;
        final /* synthetic */ q<RowScope, Composer, Integer, r2> $content;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ p<Composer, Integer, r2> $leadingIcon;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt$Chip$3$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,761:1\n154#2:762\n91#3,2:763\n93#3:793\n97#3:798\n79#4,11:765\n92#4:797\n456#5,8:776\n464#5,3:790\n467#5,3:794\n3737#6,6:784\n81#7:799\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt$Chip$3$1$1\n*L\n123#1:762\n115#1:763,2\n115#1:793\n115#1:798\n115#1:765,11\n115#1:797\n115#1:776,8\n115#1:790,3\n115#1:794,3\n115#1:784,6\n131#1:799\n*E\n"})
        /* renamed from: androidx.compose.material.ChipKt$Chip$3$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00391 extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ ChipColors $colors;
            final /* synthetic */ q<RowScope, Composer, Integer, r2> $content;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ p<Composer, Integer, r2> $leadingIcon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00391(p<? super Composer, ? super Integer, r2> pVar, ChipColors chipColors, boolean z4, q<? super RowScope, ? super Composer, ? super Integer, r2> qVar) {
                super(2);
                this.$leadingIcon = pVar;
                this.$colors = chipColors;
                this.$enabled = z4;
                this.$content = qVar;
            }

            private static final long invoke$lambda$1$lambda$0(State<Color> state) {
                return state.getValue().m3744unboximpl();
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@m Composer composer, int i5) {
                float m6044constructorimpl;
                float f5;
                float f6;
                float f7;
                if ((i5 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1131213696, i5, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:114)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier m587defaultMinSizeVpY3zN4$default = SizeKt.m587defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m1261getMinHeightD9Ej5fM(), 1, null);
                if (this.$leadingIcon == null) {
                    m6044constructorimpl = ChipKt.HorizontalPadding;
                } else {
                    m6044constructorimpl = Dp.m6044constructorimpl(0);
                }
                f5 = ChipKt.HorizontalPadding;
                Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(m587defaultMinSizeVpY3zN4$default, m6044constructorimpl, 0.0f, f5, 0.0f, 10, null);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                p<Composer, Integer, r2> pVar = this.$leadingIcon;
                ChipColors chipColors = this.$colors;
                boolean z4 = this.$enabled;
                q<RowScope, Composer, Integer, r2> qVar = this.$content;
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                a<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer.startReplaceableGroup(2084788993);
                if (pVar != null) {
                    f6 = ChipKt.LeadingIconStartSpacing;
                    SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, f6), composer, 6);
                    State<Color> leadingIconContentColor = chipColors.leadingIconContentColor(z4, composer, 0);
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(invoke$lambda$1$lambda$0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3736getAlphaimpl(invoke$lambda$1$lambda$0(leadingIconContentColor))))}, pVar, composer, 8);
                    f7 = ChipKt.LeadingIconEndSpacing;
                    SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, f7), composer, 6);
                }
                composer.endReplaceableGroup();
                qVar.invoke(rowScopeInstance, composer, 6);
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
        AnonymousClass1(p<? super Composer, ? super Integer, r2> pVar, ChipColors chipColors, boolean z4, q<? super RowScope, ? super Composer, ? super Integer, r2> qVar) {
            super(2);
            this.$leadingIcon = pVar;
            this.$colors = chipColors;
            this.$enabled = z4;
            this.$content = qVar;
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
                ComposerKt.traceEventStart(667535631, i5, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:111)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2(), ComposableLambdaKt.composableLambda(composer, -1131213696, true, new C00391(this.$leadingIcon, this.$colors, this.$enabled, this.$content)), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$Chip$3(State<Color> state, p<? super Composer, ? super Integer, r2> pVar, ChipColors chipColors, boolean z4, q<? super RowScope, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$contentColor$delegate = state;
        this.$leadingIcon = pVar;
        this.$colors = chipColors;
        this.$enabled = z4;
        this.$content = qVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@m Composer composer, int i5) {
        long Chip$lambda$1;
        if ((i5 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139076687, i5, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:110)");
        }
        ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
        Chip$lambda$1 = ChipKt.Chip$lambda$1(this.$contentColor$delegate);
        CompositionLocalKt.CompositionLocalProvider(localContentAlpha.provides(Float.valueOf(Color.m3736getAlphaimpl(Chip$lambda$1))), ComposableLambdaKt.composableLambda(composer, 667535631, true, new AnonymousClass1(this.$leadingIcon, this.$colors, this.$enabled, this.$content)), composer, ProvidedValue.$stable | 0 | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
