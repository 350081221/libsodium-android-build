package com.yuanqi.master.mine.account;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.navigation.NavHostController;
import com.yqtech.multiapp.R;
import com.yuanqi.master.mine.MineViewModel;
import com.yuanqi.master.network.model.ShareListData;
import com.yuanqi.master.tools.v0;
import java.util.List;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;
import v3.q;
import v3.r;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"InviteScreen", "", "navController", "Landroidx/navigation/NavHostController;", "mineViewModel", "Lcom/yuanqi/master/mine/MineViewModel;", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nInviteScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InviteScreen.kt\ncom/yuanqi/master/mine/account/InviteScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,102:1\n81#2,11:103\n74#3:114\n25#4:115\n1116#5,6:116\n*S KotlinDebug\n*F\n+ 1 InviteScreen.kt\ncom/yuanqi/master/mine/account/InviteScreenKt\n*L\n39#1:103,11\n41#1:114\n43#1:115\n43#1:116,6\n*E\n"})
/* loaded from: classes3.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.InviteScreenKt$InviteScreen$1", f = "InviteScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ MineViewModel $mineViewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MineViewModel mineViewModel, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$mineViewModel = mineViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new a(this.$mineViewModel, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                this.$mineViewModel.I();
                this.$mineViewModel.J();
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements q<PaddingValues, Composer, Integer, r2> {
        final /* synthetic */ Context $context;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ List<ShareListData> $sharedList;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nInviteScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InviteScreen.kt\ncom/yuanqi/master/mine/account/InviteScreenKt$InviteScreen$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,102:1\n154#2:103\n154#2:175\n154#2:176\n154#2:177\n154#2:178\n154#2:179\n154#2:180\n68#3,6:104\n74#3:138\n68#3,6:181\n74#3:215\n67#3,7:216\n74#3:251\n78#3:256\n78#3:261\n78#3:271\n79#4,11:110\n79#4,11:146\n79#4,11:187\n79#4,11:223\n92#4:255\n92#4:260\n92#4:265\n92#4:270\n456#5,8:121\n464#5,3:135\n456#5,8:157\n464#5,3:171\n456#5,8:198\n464#5,3:212\n456#5,8:234\n464#5,3:248\n467#5,3:252\n467#5,3:257\n467#5,3:262\n467#5,3:267\n3737#6,6:129\n3737#6,6:165\n3737#6,6:206\n3737#6,6:242\n73#7,7:139\n80#7:174\n84#7:266\n*S KotlinDebug\n*F\n+ 1 InviteScreen.kt\ncom/yuanqi/master/mine/account/InviteScreenKt$InviteScreen$2$1\n*L\n60#1:103\n72#1:175\n73#1:176\n74#1:177\n76#1:178\n81#1:179\n82#1:180\n57#1:104,6\n57#1:138\n83#1:181,6\n83#1:215\n85#1:216,7\n85#1:251\n85#1:256\n83#1:261\n57#1:271\n57#1:110,11\n68#1:146,11\n83#1:187,11\n85#1:223,11\n85#1:255\n83#1:260\n68#1:265\n57#1:270\n57#1:121,8\n57#1:135,3\n68#1:157,8\n68#1:171,3\n83#1:198,8\n83#1:212,3\n85#1:234,8\n85#1:248,3\n85#1:252,3\n83#1:257,3\n68#1:262,3\n57#1:267,3\n57#1:129,6\n68#1:165,6\n83#1:206,6\n85#1:242,6\n68#1:139,7\n68#1:174\n68#1:266\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements q<BoxScope, Composer, Integer, r2> {
            final /* synthetic */ Context $context;
            final /* synthetic */ PaddingValues $it;
            final /* synthetic */ MineViewModel $mineViewModel;
            final /* synthetic */ List<ShareListData> $sharedList;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.h$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0395a extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;
                final /* synthetic */ String $shareText;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0395a(Context context, String str) {
                    super(0);
                    this.$context = context;
                    this.$shareText = str;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    v0 v0Var = v0.f15260a;
                    v0Var.c(this.$context, this.$shareText);
                    v0Var.o(this.$context, this.$shareText, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.h$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0396b extends n0 implements v3.l<LazyListScope, r2> {
                final /* synthetic */ List<ShareListData> $sharedList;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.mine.account.h$b$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0397a extends n0 implements r<LazyItemScope, Integer, Composer, Integer, r2> {
                    final /* synthetic */ List<ShareListData> $sharedList;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0397a(List<ShareListData> list) {
                        super(4);
                        this.$sharedList = list;
                    }

                    @Override // v3.r
                    public /* bridge */ /* synthetic */ r2 invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return r2.f19517a;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@l LazyItemScope items, int i5, @m Composer composer, int i6) {
                        int i7;
                        l0.p(items, "$this$items");
                        if ((i6 & 112) == 0) {
                            i7 = (composer.changed(i5) ? 32 : 16) | i6;
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 721) == 144 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1993496821, i6, -1, "com.yuanqi.master.mine.account.InviteScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InviteScreen.kt:90)");
                        }
                        ShareListData shareListData = this.$sharedList.get(i5);
                        com.yuanqi.master.tools.a.k(shareListData.getSharedUserName(), shareListData.getCreateTime(), composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0396b(List<ShareListData> list) {
                    super(1);
                    this.$sharedList = list;
                }

                @Override // v3.l
                public /* bridge */ /* synthetic */ r2 invoke(LazyListScope lazyListScope) {
                    invoke2(lazyListScope);
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@l LazyListScope LazyColumn) {
                    l0.p(LazyColumn, "$this$LazyColumn");
                    LazyListScope.items$default(LazyColumn, this.$sharedList.size(), null, null, ComposableLambdaKt.composableLambdaInstance(-1993496821, true, new C0397a(this.$sharedList)), 6, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaddingValues paddingValues, MineViewModel mineViewModel, Context context, List<ShareListData> list) {
                super(3);
                this.$it = paddingValues;
                this.$mineViewModel = mineViewModel;
                this.$context = context;
                this.$sharedList = list;
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
                    ComposerKt.traceEventStart(1220914222, i5, -1, "com.yuanqi.master.mine.account.InviteScreen.<anonymous>.<anonymous> (InviteScreen.kt:56)");
                }
                Modifier.Companion companion = Modifier.Companion;
                float f5 = 10;
                Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(PaddingKt.padding(companion, this.$it), Dp.m6044constructorimpl(f5), 0.0f, 2, null);
                MineViewModel mineViewModel = this.$mineViewModel;
                Context context = this.$context;
                List<ShareListData> list = this.$sharedList;
                composer.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                v3.a<ComposeUiNode> constructor = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
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
                String str = "您的好友邀请您一起免费使用应用多开分身，快来点击以下链接安装使用吧！https://www.yqdk.com/share.html?inviteCode=" + mineViewModel.p().getValue();
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer, 0);
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
                TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.share_link, composer, 6), PaddingKt.m555paddingVpY3zN4$default(companion, Dp.m6044constructorimpl(f5), 0.0f, 2, null), com.yuanqi.master.theme.b.h(), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3504, 0, 131056);
                TextKt.m2452Text4IGK_g(str, PaddingKt.m555paddingVpY3zN4$default(companion, Dp.m6044constructorimpl(f5), 0.0f, 2, null), com.yuanqi.master.theme.b.h(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 432, 0, 131064);
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(f5)), composer, 6);
                com.yuanqi.master.tools.a.o(StringResources_androidKt.stringResource(R.string.copy_share, composer, 6), com.yuanqi.master.theme.b.m(), 0L, 0.0f, Dp.m6044constructorimpl(0), 0.0f, TextUnitKt.getSp(14), new C0395a(context, str), composer, 1597488, 44);
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(f5)), composer, 6);
                TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.invite_list, composer, 6), PaddingKt.m555paddingVpY3zN4$default(companion, Dp.m6044constructorimpl(f5), 0.0f, 2, null), com.yuanqi.master.theme.b.h(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 432, 0, 131064);
                Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(fillMaxHeight$default);
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
                if (list.isEmpty()) {
                    composer.startReplaceableGroup(1749053891);
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                    v3.a<ComposeUiNode> constructor4 = companion3.getConstructor();
                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
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
                    Updater.m3271setimpl(m3264constructorimpl4, rememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                    Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                    p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                    if (m3264constructorimpl4.getInserting() || !l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(1749053989);
                    LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new C0396b(list), composer, 0, 255);
                    composer.endReplaceableGroup();
                }
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
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
        b(MineViewModel mineViewModel, Context context, List<ShareListData> list) {
            super(3);
            this.$mineViewModel = mineViewModel;
            this.$context = context;
            this.$sharedList = list;
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
                ComposerKt.traceEventStart(1847784295, i5, -1, "com.yuanqi.master.mine.account.InviteScreen.<anonymous> (InviteScreen.kt:55)");
            }
            com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, 1220914222, true, new a(it, this.$mineViewModel, this.$context, this.$sharedList)), composer, 6);
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
        final /* synthetic */ int $$default;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(NavHostController navHostController, MineViewModel mineViewModel, int i5, int i6) {
            super(2);
            this.$navController = navHostController;
            this.$mineViewModel = mineViewModel;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            h.a(this.$navController, this.$mineViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0114  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@p4.l androidx.navigation.NavHostController r23, @p4.m com.yuanqi.master.mine.MineViewModel r24, @p4.m androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.mine.account.h.a(androidx.navigation.NavHostController, com.yuanqi.master.mine.MineViewModel, androidx.compose.runtime.Composer, int, int):void");
    }
}
