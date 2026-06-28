package com.yuanqi.master.mine.vip;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ScaffoldKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import com.yqtech.multiapp.R;
import com.yuanqi.master.network.model.UserInfoData;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"BuyVipSuccessScreen", "", "navController", "Landroidx/navigation/NavHostController;", "(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements v3.a<r2> {
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(NavHostController navHostController) {
            super(0);
            this.$navController = navHostController;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NavController.navigate$default(this.$navController, com.yuanqi.master.mine.c.f14821c, null, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.mine.vip.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0423b extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ NavHostController $navController;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.mine.vip.b$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements v3.a<r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NavHostController navHostController) {
                super(0);
                this.$navController = navHostController;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NavController.navigate$default(this.$navController, com.yuanqi.master.mine.c.f14821c, null, null, 6, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0423b(NavHostController navHostController) {
            super(2);
            this.$navController = navHostController;
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
                ComposerKt.traceEventStart(28183935, i5, -1, "com.yuanqi.master.mine.vip.BuyVipSuccessScreen.<anonymous> (BuyVipSuccessScreen.kt:47)");
            }
            com.yuanqi.master.tools.a.f("支付成功", null, new a(this.$navController), composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends n0 implements q<PaddingValues, Composer, Integer, r2> {
        final /* synthetic */ NavHostController $navController;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nBuyVipSuccessScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyVipSuccessScreen.kt\ncom/yuanqi/master/mine/vip/BuyVipSuccessScreenKt$BuyVipSuccessScreen$3$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,115:1\n68#2,6:116\n74#2:150\n68#2,6:187\n74#2:221\n78#2:228\n78#2:282\n79#3,11:122\n79#3,11:158\n79#3,11:193\n92#3:227\n79#3,11:238\n92#3:270\n92#3:276\n92#3:281\n456#4,8:133\n464#4,3:147\n456#4,8:169\n464#4,3:183\n456#4,8:204\n464#4,3:218\n467#4,3:224\n456#4,8:249\n464#4,3:263\n467#4,3:267\n467#4,3:273\n467#4,3:278\n3737#5,6:141\n3737#5,6:177\n3737#5,6:212\n3737#5,6:257\n73#6,7:151\n80#6:186\n84#6:277\n154#7:222\n154#7:223\n154#7:229\n154#7:230\n154#7:231\n154#7:232\n154#7:272\n88#8,5:233\n93#8:266\n97#8:271\n*S KotlinDebug\n*F\n+ 1 BuyVipSuccessScreen.kt\ncom/yuanqi/master/mine/vip/BuyVipSuccessScreenKt$BuyVipSuccessScreen$3$1\n*L\n53#1:116,6\n53#1:150\n55#1:187,6\n55#1:221\n55#1:228\n53#1:282\n53#1:122,11\n54#1:158,11\n55#1:193,11\n55#1:227\n82#1:238,11\n82#1:270\n54#1:276\n53#1:281\n53#1:133,8\n53#1:147,3\n54#1:169,8\n54#1:183,3\n55#1:204,8\n55#1:218,3\n55#1:224,3\n82#1:249,8\n82#1:263,3\n82#1:267,3\n54#1:273,3\n53#1:278,3\n53#1:141,6\n54#1:177,6\n55#1:212,6\n82#1:257,6\n54#1:151,7\n54#1:186\n54#1:277\n65#1:222\n75#1:223\n81#1:229\n84#1:230\n85#1:231\n87#1:232\n108#1:272\n82#1:233,5\n82#1:266\n82#1:271\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements q<BoxScope, Composer, Integer, r2> {
            final /* synthetic */ PaddingValues $it;
            final /* synthetic */ NavHostController $navController;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.vip.b$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0424a extends n0 implements v3.a<r2> {
                final /* synthetic */ NavHostController $navController;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0424a(NavHostController navHostController) {
                    super(0);
                    this.$navController = navHostController;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    NavController.navigate$default(this.$navController, com.yuanqi.master.mine.c.f14821c, null, null, 6, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaddingValues paddingValues, NavHostController navHostController) {
                super(3);
                this.$it = paddingValues;
                this.$navController = navHostController;
            }

            @Override // v3.q
            public /* bridge */ /* synthetic */ r2 invoke(BoxScope boxScope, Composer composer, Integer num) {
                invoke(boxScope, composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@l BoxScope GradientBox, @m Composer composer, int i5) {
                l0.p(GradientBox, "$this$GradientBox");
                if ((i5 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(127734161, i5, -1, "com.yuanqi.master.mine.vip.BuyVipSuccessScreen.<anonymous>.<anonymous> (BuyVipSuccessScreen.kt:52)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier padding = PaddingKt.padding(companion, this.$it);
                NavHostController navHostController = this.$navController;
                composer.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                v3.a<ComposeUiNode> constructor = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
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
                composer.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
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
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Painter painterResource = PainterResources_androidKt.painterResource(R.mipmap.buy_success_bg, composer, 6);
                ContentScale.Companion companion4 = ContentScale.Companion;
                ImageKt.Image(painterResource, "", fillMaxWidth$default2, (Alignment) null, companion4.getFillWidth(), 0.0f, (ColorFilter) null, composer, 25016, 104);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.buy_success, composer, 6), "", boxScopeInstance.align(SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(80)), companion2.getCenter()), (Alignment) null, companion4.getFillWidth(), 0.0f, (ColorFilter) null, composer, 24632, 104);
                TextKt.m2452Text4IGK_g("支付成功", PaddingKt.m557paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dp.m6044constructorimpl(9), 7, null), com.yuanqi.master.theme.b.L(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 200070, 0, 131024);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(48)), composer, 6);
                float f5 = 20;
                Modifier m554paddingVpY3zN4 = PaddingKt.m554paddingVpY3zN4(BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m555paddingVpY3zN4$default(companion, Dp.m6044constructorimpl(f5), 0.0f, 2, null), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(15))), com.yuanqi.master.theme.b.k(), null, 2, null), Dp.m6044constructorimpl(f5), Dp.m6044constructorimpl(5));
                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor4 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m554paddingVpY3zN4);
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
                Updater.m3271setimpl(m3264constructorimpl4, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl4.getInserting() || !l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                TextKt.m2452Text4IGK_g("当前会员有效期至", RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), com.yuanqi.master.theme.b.t(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3462, 0, 131056);
                UserInfoData value = com.yuanqi.master.mine.account.a.f14786a.b().getValue();
                TextKt.m2452Text4IGK_g(String.valueOf(value != null ? value.getVipOvertime() : null), (Modifier) null, com.yuanqi.master.theme.b.t(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3456, 0, 131058);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
                com.yuanqi.master.tools.a.o("返回", com.yuanqi.master.theme.b.W1(), 0L, 0.0f, 0.0f, 0.0f, 0L, new C0424a(navHostController), composer, 54, 124);
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(25)), composer, 6);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(NavHostController navHostController) {
            super(3);
            this.$navController = navHostController;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@l PaddingValues it, @m Composer composer, int i5) {
            int i6;
            l0.p(it, "it");
            if ((i5 & 14) == 0) {
                i6 = (composer.changed(it) ? 4 : 2) | i5;
            } else {
                i6 = i5;
            }
            if ((i6 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207037110, i5, -1, "com.yuanqi.master.mine.vip.BuyVipSuccessScreen.<anonymous> (BuyVipSuccessScreen.kt:51)");
            }
            com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, 127734161, true, new a(it, this.$navController)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(NavHostController navHostController, int i5) {
            super(2);
            this.$navController = navHostController;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            b.a(this.$navController, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@l NavHostController navController, @m Composer composer, int i5) {
        l0.p(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(392080571);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(392080571, i5, -1, "com.yuanqi.master.mine.vip.BuyVipSuccessScreen (BuyVipSuccessScreen.kt:41)");
        }
        BackHandlerKt.BackHandler(false, new a(navController), startRestartGroup, 0, 1);
        ScaffoldKt.m2107ScaffoldTvnljyQ(null, ComposableLambdaKt.composableLambda(startRestartGroup, 28183935, true, new C0423b(navController)), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, -207037110, true, new c(navController)), startRestartGroup, 805306416, 509);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(navController, i5));
        }
    }
}
