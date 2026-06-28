package com.yuanqi.master.manager;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import com.yqtech.multiapp.R;
import com.yuanqi.master.ViewModelFactoryKt;
import com.yuanqi.master.network.model.DeviceModel;
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

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ChangeDeviceScreen", "", "navController", "Landroidx/navigation/NavHostController;", "managerViewModel", "Lcom/yuanqi/master/manager/ManagerViewModel;", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/manager/ManagerViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nChangeDeviceScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeDeviceScreen.kt\ncom/yuanqi/master/manager/ChangeDeviceScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,101:1\n81#2,11:102\n74#3:113\n*S KotlinDebug\n*F\n+ 1 ChangeDeviceScreen.kt\ncom/yuanqi/master/manager/ChangeDeviceScreenKt\n*L\n34#1:102,11\n36#1:113\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.manager.ChangeDeviceScreenKt$ChangeDeviceScreen$1", f = "ChangeDeviceScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.manager.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0354a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ManagerViewModel $managerViewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0354a(ManagerViewModel managerViewModel, Context context, kotlin.coroutines.d<? super C0354a> dVar) {
            super(2, dVar);
            this.$managerViewModel = managerViewModel;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new C0354a(this.$managerViewModel, this.$context, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
            return ((C0354a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                this.$managerViewModel.w(this.$context);
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ManagerViewModel $managerViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nChangeDeviceScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeDeviceScreen.kt\ncom/yuanqi/master/manager/ChangeDeviceScreenKt$ChangeDeviceScreen$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,101:1\n154#2:102\n*S KotlinDebug\n*F\n+ 1 ChangeDeviceScreen.kt\ncom/yuanqi/master/manager/ChangeDeviceScreenKt$ChangeDeviceScreen$2$1\n*L\n47#1:102\n*E\n"})
        /* renamed from: com.yuanqi.master.manager.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0355a extends n0 implements q<RowScope, Composer, Integer, r2> {
            final /* synthetic */ Context $context;
            final /* synthetic */ ManagerViewModel $managerViewModel;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.manager.a$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0356a extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;
                final /* synthetic */ ManagerViewModel $managerViewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0356a(ManagerViewModel managerViewModel, Context context) {
                    super(0);
                    this.$managerViewModel = managerViewModel;
                    this.$context = context;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$managerViewModel.r(this.$context);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0355a(ManagerViewModel managerViewModel, Context context) {
                super(3);
                this.$managerViewModel = managerViewModel;
                this.$context = context;
            }

            @Override // v3.q
            public /* bridge */ /* synthetic */ r2 invoke(RowScope rowScope, Composer composer, Integer num) {
                invoke(rowScope, composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@l RowScope CustomTopBar, @m Composer composer, int i5) {
                l0.p(CustomTopBar, "$this$CustomTopBar");
                if ((i5 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(626680210, i5, -1, "com.yuanqi.master.manager.ChangeDeviceScreen.<anonymous>.<anonymous> (ChangeDeviceScreen.kt:43)");
                }
                TextKt.m2452Text4IGK_g("还原", ClickableKt.m235clickableXHw0xAI$default(PaddingKt.m557paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dp.m6044constructorimpl(20), 0.0f, 11, null), false, null, null, new C0356a(this.$managerViewModel, this.$context), 7, null), ColorResources_androidKt.colorResource(R.color.blue, composer, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 6, 0, 131064);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.manager.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0357b extends n0 implements v3.a<r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0357b(NavHostController navHostController) {
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
                this.$navController.popBackStack(i.f14757b, false, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ManagerViewModel managerViewModel, Context context, NavHostController navHostController) {
            super(2);
            this.$managerViewModel = managerViewModel;
            this.$context = context;
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
                ComposerKt.traceEventStart(-2075915123, i5, -1, "com.yuanqi.master.manager.ChangeDeviceScreen.<anonymous> (ChangeDeviceScreen.kt:42)");
            }
            com.yuanqi.master.tools.a.f("设备详情", ComposableLambdaKt.composableLambda(composer, 626680210, true, new C0355a(this.$managerViewModel, this.$context)), new C0357b(this.$navController), composer, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends n0 implements q<PaddingValues, Composer, Integer, r2> {
        final /* synthetic */ ManagerViewModel $managerViewModel;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nChangeDeviceScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeDeviceScreen.kt\ncom/yuanqi/master/manager/ChangeDeviceScreenKt$ChangeDeviceScreen$3$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,101:1\n74#2,6:102\n80#2:136\n74#2,6:172\n80#2:206\n84#2:211\n74#2,6:218\n80#2:252\n84#2:257\n84#2:262\n79#3,11:108\n79#3,11:143\n79#3,11:178\n92#3:210\n92#3:215\n79#3,11:224\n92#3:256\n92#3:261\n456#4,8:119\n464#4,3:133\n456#4,8:154\n464#4,3:168\n456#4,8:189\n464#4,3:203\n467#4,3:207\n467#4,3:212\n456#4,8:235\n464#4,3:249\n467#4,3:253\n467#4,3:258\n3737#5,6:127\n3737#5,6:162\n3737#5,6:197\n3737#5,6:243\n68#6,6:137\n74#6:171\n78#6:216\n154#7:217\n*S KotlinDebug\n*F\n+ 1 ChangeDeviceScreen.kt\ncom/yuanqi/master/manager/ChangeDeviceScreenKt$ChangeDeviceScreen$3$1\n*L\n58#1:102,6\n58#1:136\n65#1:172,6\n65#1:206\n65#1:211\n86#1:218,6\n86#1:252\n86#1:257\n58#1:262\n58#1:108,11\n59#1:143,11\n65#1:178,11\n65#1:210\n59#1:215\n86#1:224,11\n86#1:256\n58#1:261\n58#1:119,8\n58#1:133,3\n59#1:154,8\n59#1:168,3\n65#1:189,8\n65#1:203,3\n65#1:207,3\n59#1:212,3\n86#1:235,8\n86#1:249,3\n86#1:253,3\n58#1:258,3\n58#1:127,6\n59#1:162,6\n65#1:197,6\n86#1:243,6\n59#1:137,6\n59#1:171\n59#1:216\n89#1:217\n*E\n"})
        /* renamed from: com.yuanqi.master.manager.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0358a extends n0 implements q<BoxScope, Composer, Integer, r2> {
            final /* synthetic */ PaddingValues $it;
            final /* synthetic */ ManagerViewModel $managerViewModel;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.manager.a$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0359a extends n0 implements v3.a<r2> {
                final /* synthetic */ ManagerViewModel $managerViewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0359a(ManagerViewModel managerViewModel) {
                    super(0);
                    this.$managerViewModel = managerViewModel;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$managerViewModel.s();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0358a(PaddingValues paddingValues, ManagerViewModel managerViewModel) {
                super(3);
                this.$it = paddingValues;
                this.$managerViewModel = managerViewModel;
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
                    ComposerKt.traceEventStart(-1157002977, i5, -1, "com.yuanqi.master.manager.ChangeDeviceScreen.<anonymous>.<anonymous> (ChangeDeviceScreen.kt:57)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                PaddingValues paddingValues = this.$it;
                ManagerViewModel managerViewModel = this.$managerViewModel;
                composer.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                v3.a<ComposeUiNode> constructor = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
                Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                Modifier padding = PaddingKt.padding(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), 0.0f, 1, null), paddingValues);
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(padding);
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
                Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(verticalScroll$default);
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
                Updater.m3271setimpl(m3264constructorimpl3, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                DeviceModel value = managerViewModel.x().getValue();
                com.yuanqi.master.tools.a.g("当前设备", String.valueOf(value != null ? value.getDeviceModel() : null), composer, 6);
                DeviceModel value2 = managerViewModel.x().getValue();
                com.yuanqi.master.tools.a.g("名称", String.valueOf(value2 != null ? value2.getDeviceName() : null), composer, 6);
                DeviceModel value3 = managerViewModel.x().getValue();
                com.yuanqi.master.tools.a.g("型号", String.valueOf(value3 != null ? value3.getDeviceModel() : null), composer, 6);
                DeviceModel value4 = managerViewModel.x().getValue();
                com.yuanqi.master.tools.a.g("设备", String.valueOf(value4 != null ? value4.getDevice() : null), composer, 6);
                DeviceModel value5 = managerViewModel.x().getValue();
                com.yuanqi.master.tools.a.g("制造商", String.valueOf(value5 != null ? value5.getDeviceManu() : null), composer, 6);
                DeviceModel value6 = managerViewModel.x().getValue();
                com.yuanqi.master.tools.a.g("品牌", String.valueOf(value6 != null ? value6.getDeviceBrand() : null), composer, 6);
                DeviceModel value7 = managerViewModel.x().getValue();
                com.yuanqi.master.tools.a.g("IMEI", String.valueOf(value7 != null ? value7.getImei() : null), composer, 6);
                DeviceModel value8 = managerViewModel.x().getValue();
                com.yuanqi.master.tools.a.g("Android ID", String.valueOf(value8 != null ? value8.getAndroidId() : null), composer, 6);
                DeviceModel value9 = managerViewModel.x().getValue();
                com.yuanqi.master.tools.a.g("WIFI", String.valueOf(value9 != null ? value9.getWifi() : null), composer, 6);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6044constructorimpl(16), 1, null);
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor4 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
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
                Updater.m3271setimpl(m3264constructorimpl4, columnMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl4.getInserting() || !l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                com.yuanqi.master.tools.a.o(StringResources_androidKt.stringResource(R.string.one_click_change, composer, 6), 0L, 0L, 0.0f, 0.0f, 0.0f, 0L, new C0359a(managerViewModel), composer, 0, 126);
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
        c(ManagerViewModel managerViewModel) {
            super(3);
            this.$managerViewModel = managerViewModel;
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
                ComposerKt.traceEventStart(614849816, i5, -1, "com.yuanqi.master.manager.ChangeDeviceScreen.<anonymous> (ChangeDeviceScreen.kt:56)");
            }
            com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, -1157002977, true, new C0358a(it, this.$managerViewModel)), composer, 6);
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
        final /* synthetic */ int $$default;
        final /* synthetic */ ManagerViewModel $managerViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(NavHostController navHostController, ManagerViewModel managerViewModel, int i5, int i6) {
            super(2);
            this.$navController = navHostController;
            this.$managerViewModel = managerViewModel;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            a.a(this.$navController, this.$managerViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@l NavHostController navController, @m ManagerViewModel managerViewModel, @m Composer composer, int i5, int i6) {
        ManagerViewModel managerViewModel2;
        CreationExtras creationExtras;
        l0.p(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(1012880073);
        if ((i6 & 2) != 0) {
            ViewModelProvider.Factory a5 = ViewModelFactoryKt.a();
            startRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current != null) {
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    creationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel = ViewModelKt.viewModel(ManagerViewModel.class, current, null, a5, creationExtras, startRestartGroup, 36936, 0);
                startRestartGroup.endReplaceableGroup();
                managerViewModel2 = (ManagerViewModel) viewModel;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            managerViewModel2 = managerViewModel;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1012880073, i5, -1, "com.yuanqi.master.manager.ChangeDeviceScreen (ChangeDeviceScreen.kt:34)");
        }
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        EffectsKt.LaunchedEffect(Boolean.TRUE, new C0354a(managerViewModel2, context, null), startRestartGroup, 70);
        ManagerViewModel managerViewModel3 = managerViewModel2;
        ScaffoldKt.m2107ScaffoldTvnljyQ(null, ComposableLambdaKt.composableLambda(startRestartGroup, -2075915123, true, new b(managerViewModel2, context, navController)), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, 614849816, true, new c(managerViewModel2)), startRestartGroup, 805306416, 509);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(navController, managerViewModel3, i5, i6));
        }
    }
}
