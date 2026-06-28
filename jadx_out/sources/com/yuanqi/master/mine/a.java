package com.yuanqi.master.mine;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"LoadingDialog", "", "mineViewModel", "Lcom/yuanqi/master/mine/MineViewModel;", "(Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.mine.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0371a extends n0 implements v3.a<r2> {
        final /* synthetic */ MineViewModel $mineViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0371a(MineViewModel mineViewModel) {
            super(0);
            this.$mineViewModel = mineViewModel;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$mineViewModel.x().setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nMineActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineActivity.kt\ncom/yuanqi/master/mine/MineActivityKt$LoadingDialog$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,104:1\n154#2:105\n154#2:140\n154#2:176\n69#3,5:106\n74#3:139\n78#3:186\n79#4,11:111\n79#4,11:147\n92#4:180\n92#4:185\n456#5,8:122\n464#5,3:136\n456#5,8:158\n464#5,3:172\n467#5,3:177\n467#5,3:182\n3737#6,6:130\n3737#6,6:166\n74#7,6:141\n80#7:175\n84#7:181\n*S KotlinDebug\n*F\n+ 1 MineActivity.kt\ncom/yuanqi/master/mine/MineActivityKt$LoadingDialog$2\n*L\n85#1:105\n90#1:140\n96#1:176\n83#1:106,5\n83#1:139\n83#1:186\n83#1:111,11\n89#1:147,11\n89#1:180\n83#1:185\n83#1:122,8\n83#1:136,3\n89#1:158,8\n89#1:172,3\n89#1:177,3\n83#1:182,3\n83#1:130,6\n89#1:166,6\n89#1:141,6\n89#1:175\n89#1:181\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ MineViewModel $mineViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MineViewModel mineViewModel) {
            super(2);
            this.$mineViewModel = mineViewModel;
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
                ComposerKt.traceEventStart(829900187, i5, -1, "com.yuanqi.master.mine.LoadingDialog.<anonymous> (MineActivity.kt:82)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m201backgroundbw27NRU$default = BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(companion, RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(15))), Color.Companion.m3771getWhite0d7_KjU(), null, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment center = companion2.getCenter();
            MineViewModel mineViewModel = this.$mineViewModel;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m201backgroundbw27NRU$default);
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
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m554paddingVpY3zN4 = PaddingKt.m554paddingVpY3zN4(companion, Dp.m6044constructorimpl(30), Dp.m6044constructorimpl(20));
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m554paddingVpY3zN4);
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
            Updater.m3271setimpl(m3264constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer.startReplaceableGroup(229321897);
            if (mineViewModel.y().getValue().booleanValue()) {
                ProgressIndicatorKt.m1399CircularProgressIndicatorLxG7B9w(PaddingKt.m557paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m6044constructorimpl(10), 7, null), com.yuanqi.master.theme.b.O(), 0.0f, 0L, 0, composer, 54, 28);
            }
            composer.endReplaceableGroup();
            TextKt.m2452Text4IGK_g(mineViewModel.w().getValue(), (Modifier) null, com.yuanqi.master.theme.b.O(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 384, 0, 131066);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MineViewModel $mineViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MineViewModel mineViewModel, int i5) {
            super(2);
            this.$mineViewModel = mineViewModel;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            a.a(this.$mineViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@p4.l MineViewModel mineViewModel, @m Composer composer, int i5) {
        l0.p(mineViewModel, "mineViewModel");
        Composer startRestartGroup = composer.startRestartGroup(669486610);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(669486610, i5, -1, "com.yuanqi.master.mine.LoadingDialog (MineActivity.kt:78)");
        }
        AndroidDialog_androidKt.Dialog(new C0371a(mineViewModel), null, ComposableLambdaKt.composableLambda(startRestartGroup, 829900187, true, new b(mineViewModel)), startRestartGroup, 384, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(mineViewModel, i5));
        }
    }
}
