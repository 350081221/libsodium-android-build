package com.yuanqi.master.mine.account;

import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import com.yqtech.multiapp.R;
import com.yuanqi.master.ViewModelFactoryKt;
import com.yuanqi.master.mine.MineActivity;
import com.yuanqi.master.mine.MineViewModel;
import com.yuanqi.master.network.model.UserInfoData;
import com.yuanqi.master.tools.f1;
import com.yuanqi.master.tools.o0;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"AccountScreen", "", "navController", "Landroidx/navigation/NavHostController;", "mineViewModel", "Lcom/yuanqi/master/mine/MineViewModel;", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nAccountScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountScreen.kt\ncom/yuanqi/master/mine/account/AccountScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,261:1\n81#2,11:262\n74#3:273\n25#4:274\n25#4:281\n1116#5,6:275\n1116#5,6:282\n*S KotlinDebug\n*F\n+ 1 AccountScreen.kt\ncom/yuanqi/master/mine/account/AccountScreenKt\n*L\n60#1:262,11\n63#1:273\n65#1:274\n68#1:281\n65#1:275,6\n68#1:282,6\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements v3.a<r2> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MineActivity a5 = MineActivity.f14760b.a();
            if (a5 != null) {
                a5.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nAccountScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountScreen.kt\ncom/yuanqi/master/mine/account/AccountScreenKt$AccountScreen$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,261:1\n36#2:262\n36#2:269\n36#2:276\n1116#3,6:263\n1116#3,6:270\n1116#3,6:277\n*S KotlinDebug\n*F\n+ 1 AccountScreen.kt\ncom/yuanqi/master/mine/account/AccountScreenKt$AccountScreen$2\n*L\n239#1:262\n241#1:269\n249#1:276\n239#1:263,6\n241#1:270,6\n249#1:277,6\n*E\n"})
    /* renamed from: com.yuanqi.master.mine.account.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0374b extends n0 implements q<PaddingValues, Composer, Integer, r2> {
        final /* synthetic */ Context $context;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ MutableState<Boolean> $showConfirm;
        final /* synthetic */ MutableState<Boolean> $showDelete;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nAccountScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountScreen.kt\ncom/yuanqi/master/mine/account/AccountScreenKt$AccountScreen$2$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,261:1\n68#2,6:262\n74#2:296\n68#2,6:335\n74#2:369\n78#2:460\n78#2:485\n79#3,11:268\n79#3,11:303\n79#3,11:341\n79#3,11:376\n79#3,11:413\n92#3:446\n92#3:454\n92#3:459\n92#3:471\n92#3:484\n456#4,8:279\n464#4,3:293\n456#4,8:314\n464#4,3:328\n456#4,8:352\n464#4,3:366\n456#4,8:387\n464#4,3:401\n456#4,8:424\n464#4,3:438\n467#4,3:443\n467#4,3:451\n467#4,3:456\n36#4:461\n467#4,3:468\n36#4:474\n467#4,3:481\n3737#5,6:287\n3737#5,6:322\n3737#5,6:360\n3737#5,6:395\n3737#5,6:432\n74#6,6:297\n80#6:331\n74#6,6:407\n80#6:441\n84#6:447\n84#6:472\n154#7:332\n154#7:333\n154#7:334\n154#7:405\n154#7:406\n154#7:442\n154#7:448\n154#7:449\n154#7:450\n154#7:473\n87#8,6:370\n93#8:404\n97#8:455\n1116#9,6:462\n1116#9,6:475\n*S KotlinDebug\n*F\n+ 1 AccountScreen.kt\ncom/yuanqi/master/mine/account/AccountScreenKt$AccountScreen$2$1\n*L\n82#1:262,6\n82#1:296\n113#1:335,6\n113#1:369\n113#1:460\n82#1:485\n82#1:268,11\n87#1:303,11\n113#1:341,11\n124#1:376,11\n134#1:413,11\n134#1:446\n124#1:454\n113#1:459\n87#1:471\n82#1:484\n82#1:279,8\n82#1:293,3\n87#1:314,8\n87#1:328,3\n113#1:352,8\n113#1:366,3\n124#1:387,8\n124#1:401,3\n134#1:424,8\n134#1:438,3\n134#1:443,3\n124#1:451,3\n113#1:456,3\n216#1:461\n87#1:468,3\n224#1:474\n82#1:481,3\n82#1:287,6\n87#1:322,6\n113#1:360,6\n124#1:395,6\n134#1:432,6\n87#1:297,6\n87#1:331\n134#1:407,6\n134#1:441\n134#1:447\n87#1:472\n116#1:332\n117#1:333\n121#1:334\n131#1:405\n136#1:406\n154#1:442\n164#1:448\n165#1:449\n166#1:450\n223#1:473\n124#1:370,6\n124#1:404\n124#1:455\n216#1:462,6\n224#1:475,6\n*E\n"})
        /* renamed from: com.yuanqi.master.mine.account.b$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements q<BoxScope, Composer, Integer, r2> {
            final /* synthetic */ PaddingValues $it;
            final /* synthetic */ MineViewModel $mineViewModel;
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ MutableState<Boolean> $showConfirm;
            final /* synthetic */ MutableState<Boolean> $showDelete;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.b$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0375a extends n0 implements v3.a<r2> {
                final /* synthetic */ MineViewModel $mineViewModel;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.mine.account.b$b$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0376a extends n0 implements v3.a<r2> {
                    public static final C0376a INSTANCE = new C0376a();

                    C0376a() {
                        super(0);
                    }

                    @Override // v3.a
                    public /* bridge */ /* synthetic */ r2 invoke() {
                        invoke2();
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0375a(MineViewModel mineViewModel) {
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
                    com.yuanqi.master.mine.account.a.f14786a.n(this.$mineViewModel.t(), C0376a.INSTANCE);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.b$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0377b extends n0 implements v3.a<r2> {
                final /* synthetic */ NavHostController $navController;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0377b(NavHostController navHostController) {
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
                    NavController.navigate$default(this.$navController, com.yuanqi.master.mine.c.f14825g, null, null, 6, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.b$b$a$c */
            /* loaded from: classes3.dex */
            public static final class c extends n0 implements q<RowScope, Composer, Integer, r2> {
                final /* synthetic */ String $vipText;
                final /* synthetic */ long $vipTextColor;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(String str, long j5) {
                    super(3);
                    this.$vipText = str;
                    this.$vipTextColor = j5;
                }

                @Override // v3.q
                public /* bridge */ /* synthetic */ r2 invoke(RowScope rowScope, Composer composer, Integer num) {
                    invoke(rowScope, composer, num.intValue());
                    return r2.f19517a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@l RowScope Button, @m Composer composer, int i5) {
                    l0.p(Button, "$this$Button");
                    if ((i5 & 81) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(472370512, i5, -1, "com.yuanqi.master.mine.account.AccountScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountScreen.kt:168)");
                    }
                    TextKt.m2452Text4IGK_g(this.$vipText, (Modifier) null, this.$vipTextColor, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 199680, 0, 131026);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.b$b$a$d */
            /* loaded from: classes3.dex */
            public static final class d extends n0 implements v3.a<r2> {
                final /* synthetic */ MineViewModel $mineViewModel;
                final /* synthetic */ NavHostController $navController;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(MineViewModel mineViewModel, NavHostController navHostController) {
                    super(0);
                    this.$mineViewModel = mineViewModel;
                    this.$navController = navHostController;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$mineViewModel.P("3");
                    NavController.navigate$default(this.$navController, com.yuanqi.master.mine.c.f14822d, null, null, 6, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.b$b$a$e */
            /* loaded from: classes3.dex */
            public static final class e extends n0 implements v3.a<r2> {
                final /* synthetic */ MineViewModel $mineViewModel;
                final /* synthetic */ NavHostController $navController;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(MineViewModel mineViewModel, NavHostController navHostController) {
                    super(0);
                    this.$mineViewModel = mineViewModel;
                    this.$navController = navHostController;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$mineViewModel.P("4");
                    NavController.navigate$default(this.$navController, com.yuanqi.master.mine.c.f14822d, null, null, 6, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.b$b$a$f */
            /* loaded from: classes3.dex */
            public static final class f extends n0 implements v3.a<r2> {
                final /* synthetic */ NavHostController $navController;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(NavHostController navHostController) {
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
                    com.yuanqi.master.mine.account.a aVar = com.yuanqi.master.mine.account.a.f14786a;
                    if (aVar.b().getValue() == null) {
                        f1.r("请在绑定手机号之后再进行多账号注册。", 0, 2, null);
                        return;
                    }
                    UserInfoData value = aVar.b().getValue();
                    if ((value != null ? value.getUserPhone() : null) == null) {
                        f1.r("请在绑定手机号之后再进行多账号注册。", 0, 2, null);
                    } else {
                        NavController.navigate$default(this.$navController, com.yuanqi.master.mine.c.f14823e, null, null, 6, null);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.b$b$a$g */
            /* loaded from: classes3.dex */
            public static final class g extends n0 implements v3.a<r2> {
                final /* synthetic */ MutableState<Boolean> $showConfirm;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(MutableState<Boolean> mutableState) {
                    super(0);
                    this.$showConfirm = mutableState;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$showConfirm.setValue(Boolean.TRUE);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.b$b$a$h */
            /* loaded from: classes3.dex */
            public static final class h extends n0 implements v3.a<r2> {
                final /* synthetic */ MutableState<Boolean> $showDelete;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(MutableState<Boolean> mutableState) {
                    super(0);
                    this.$showDelete = mutableState;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$showDelete.setValue(Boolean.TRUE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaddingValues paddingValues, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MineViewModel mineViewModel, NavHostController navHostController) {
                super(3);
                this.$it = paddingValues;
                this.$showDelete = mutableState;
                this.$showConfirm = mutableState2;
                this.$mineViewModel = mineViewModel;
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
                int i6;
                List L;
                List list;
                String str;
                int i7;
                String sb;
                String sb2;
                String userEmail;
                List L2;
                l0.p(GradientBox, "$this$GradientBox");
                if ((i5 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(773766374, i5, -1, "com.yuanqi.master.mine.account.AccountScreen.<anonymous>.<anonymous> (AccountScreen.kt:81)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, this.$it), 0.0f, 1, null);
                MutableState<Boolean> mutableState = this.$showDelete;
                MutableState<Boolean> mutableState2 = this.$showConfirm;
                MineViewModel mineViewModel = this.$mineViewModel;
                NavHostController navHostController = this.$navController;
                composer.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
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
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                composer.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxSize$default2);
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
                com.yuanqi.master.mine.account.a aVar = com.yuanqi.master.mine.account.a.f14786a;
                int i8 = aVar.k() ? R.mipmap.ic_vip : R.mipmap.ic_vip_normal;
                long m42 = aVar.k() ? com.yuanqi.master.theme.b.m4() : Color.Companion.m3771getWhite0d7_KjU();
                String stringResource = StringResources_androidKt.stringResource(aVar.k() ? R.string.vip_reorder : R.string.buy_tip, composer, 0);
                long h42 = aVar.k() ? com.yuanqi.master.theme.b.h4() : com.yuanqi.master.theme.b.o();
                long g42 = aVar.k() ? com.yuanqi.master.theme.b.g4() : Color.Companion.m3771getWhite0d7_KjU();
                if (aVar.k()) {
                    L2 = w.L(Color.m3724boximpl(com.yuanqi.master.theme.b.c4()), Color.m3724boximpl(com.yuanqi.master.theme.b.d4()), Color.m3724boximpl(com.yuanqi.master.theme.b.e4()), Color.m3724boximpl(com.yuanqi.master.theme.b.e4()));
                    list = L2;
                    i6 = 1;
                } else {
                    i6 = 1;
                    L = w.L(Color.m3724boximpl(com.yuanqi.master.theme.b.o()), Color.m3724boximpl(com.yuanqi.master.theme.b.n()), Color.m3724boximpl(com.yuanqi.master.theme.b.o()));
                    list = L;
                }
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, i6, null);
                float f5 = 10;
                Modifier m553padding3ABfNKs = PaddingKt.m553padding3ABfNKs(BackgroundKt.background$default(ClipKt.clip(PaddingKt.m553padding3ABfNKs(fillMaxWidth$default, Dp.m6044constructorimpl(f5)), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f5))), Brush.Companion.m3683horizontalGradient8A3gB4$default(Brush.Companion, list, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6044constructorimpl(f5));
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                long j5 = h42;
                v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m553padding3ABfNKs);
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
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor4 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default2);
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
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                float f6 = 30;
                ImageKt.Image(PainterResources_androidKt.painterResource(i8, composer, 0), "isVip", SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
                float f7 = 5;
                Modifier weight$default = RowScope.weight$default(rowScopeInstance, PaddingKt.m553padding3ABfNKs(companion, Dp.m6044constructorimpl(f7)), 1.0f, false, 2, null);
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor5 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(weight$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor5);
                } else {
                    composer.useNode();
                }
                Composer m3264constructorimpl5 = Updater.m3264constructorimpl(composer);
                Updater.m3271setimpl(m3264constructorimpl5, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl5.getInserting() || !l0.g(m3264constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m3264constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m3264constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                modifierMaterializerOf5.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                boolean z4 = false;
                TextKt.m2452Text4IGK_g(aVar.d(new C0375a(mineViewModel)), (Modifier) null, m42, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5986getEllipsisgIe3tQ8(), false, 1, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 199680, 3120, 120786);
                composer.startReplaceableGroup(675835338);
                if (aVar.k()) {
                    TextKt.m2452Text4IGK_g(aVar.h() + StringResources_androidKt.stringResource(R.string.vip_end_tip, composer, 6), PaddingKt.m557paddingqDBjuR0$default(companion, 0.0f, Dp.m6044constructorimpl(f7), 0.0f, 0.0f, 13, null), m42, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3120, 0, 131056);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                ButtonKt.Button(new C0377b(navHostController), PaddingKt.m555paddingVpY3zN4$default(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(48)), 0.0f, Dp.m6044constructorimpl(f7), 1, null), false, RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(24)), ButtonDefaults.INSTANCE.m1594buttonColorsro_MJ88(g42, 0L, 0L, 0L, composer, (ButtonDefaults.$stable | 0) << 12, 14), null, null, null, null, ComposableLambdaKt.composableLambda(composer, 472370512, true, new c(stringResource, j5)), composer, 805306416, 484);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                UserInfoData value = aVar.b().getValue();
                String str2 = "";
                if (value == null || (str = value.getUserPhone()) == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    composer.startReplaceableGroup(-1196705243);
                    i7 = 6;
                    sb = StringResources_androidKt.stringResource(R.string.bind_phone, composer, 6);
                    composer.endReplaceableGroup();
                } else {
                    i7 = 6;
                    composer.startReplaceableGroup(-1196705177);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(StringResources_androidKt.stringResource(R.string.have_bind_phone, composer, 6));
                    sb3.append(' ');
                    UserInfoData value2 = aVar.b().getValue();
                    sb3.append(value2 != null ? value2.getUserPhone() : null);
                    sb = sb3.toString();
                    composer.endReplaceableGroup();
                }
                com.yuanqi.master.tools.a.m(R.mipmap.mine_change_phone, sb, null, null, new d(mineViewModel, navHostController), composer, 6, 12);
                UserInfoData value3 = aVar.b().getValue();
                if (value3 != null && (userEmail = value3.getUserEmail()) != null) {
                    str2 = userEmail;
                }
                if (str2.length() == 0) {
                    z4 = true;
                }
                if (z4) {
                    composer.startReplaceableGroup(-1196704676);
                    sb2 = StringResources_androidKt.stringResource(R.string.bind_email, composer, i7);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-1196704610);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(StringResources_androidKt.stringResource(R.string.have_bind_email, composer, i7));
                    sb4.append(' ');
                    UserInfoData value4 = aVar.b().getValue();
                    sb4.append(value4 != null ? value4.getUserEmail() : null);
                    sb2 = sb4.toString();
                    composer.endReplaceableGroup();
                }
                com.yuanqi.master.tools.a.m(R.mipmap.mine_change_email, sb2, null, null, new e(mineViewModel, navHostController), composer, 6, 12);
                com.yuanqi.master.tools.a.m(R.mipmap.mine_small_register, StringResources_androidKt.stringResource(R.string.small_registration, composer, i7), "（绑定同一手机号）", null, new f(navHostController), composer, 390, 8);
                String stringResource2 = StringResources_androidKt.stringResource(R.string.login_out, composer, i7);
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(mutableState2);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new g(mutableState2);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                com.yuanqi.master.tools.a.m(R.mipmap.mine_login_out, stringResource2, null, null, (v3.a) rememberedValue, composer, 6, 12);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                String stringResource3 = StringResources_androidKt.stringResource(R.string.cancel_account, composer, i7);
                Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dp.m6044constructorimpl(f6), 7, null);
                composer.startReplaceableGroup(1157296644);
                boolean changed2 = composer.changed(mutableState);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new h(mutableState);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                TextKt.m2452Text4IGK_g(stringResource3, ClickableKt.m235clickableXHw0xAI$default(m557paddingqDBjuR0$default, false, null, null, (v3.a) rememberedValue2, 7, null), com.yuanqi.master.theme.b.Q(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3456, 0, 131056);
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
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.mine.account.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0378b extends n0 implements v3.a<r2> {
            final /* synthetic */ MutableState<Boolean> $showConfirm;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0378b(MutableState<Boolean> mutableState) {
                super(0);
                this.$showConfirm = mutableState;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$showConfirm.setValue(Boolean.FALSE);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.mine.account.b$b$c */
        /* loaded from: classes3.dex */
        public static final class c extends n0 implements v3.a<r2> {
            final /* synthetic */ MutableState<Boolean> $showConfirm;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(MutableState<Boolean> mutableState) {
                super(0);
                this.$showConfirm = mutableState;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$showConfirm.setValue(Boolean.FALSE);
                MineActivity a5 = MineActivity.f14760b.a();
                if (a5 != null) {
                    a5.finish();
                }
                com.yuanqi.master.mine.account.a.f14786a.m();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.mine.account.b$b$d */
        /* loaded from: classes3.dex */
        public static final class d extends n0 implements v3.a<r2> {
            final /* synthetic */ MutableState<Boolean> $showDelete;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(MutableState<Boolean> mutableState) {
                super(0);
                this.$showDelete = mutableState;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$showDelete.setValue(Boolean.FALSE);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.mine.account.b$b$e */
        /* loaded from: classes3.dex */
        public static final class e extends n0 implements v3.a<r2> {
            final /* synthetic */ MineViewModel $mineViewModel;
            final /* synthetic */ MutableState<Boolean> $showDelete;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.account.b$b$e$a */
            /* loaded from: classes3.dex */
            public static final class a extends n0 implements v3.a<r2> {
                public static final a INSTANCE = new a();

                a() {
                    super(0);
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    MineActivity a5 = MineActivity.f14760b.a();
                    if (a5 != null) {
                        a5.finish();
                    }
                    com.yuanqi.master.mine.account.a.f14786a.m();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(MutableState<Boolean> mutableState, MineViewModel mineViewModel) {
                super(0);
                this.$showDelete = mutableState;
                this.$mineViewModel = mineViewModel;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$showDelete.setValue(Boolean.FALSE);
                this.$mineViewModel.i(a.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0374b(MutableState<Boolean> mutableState, Context context, MutableState<Boolean> mutableState2, MineViewModel mineViewModel, NavHostController navHostController) {
            super(3);
            this.$showConfirm = mutableState;
            this.$context = context;
            this.$showDelete = mutableState2;
            this.$mineViewModel = mineViewModel;
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
                ComposerKt.traceEventStart(1900485087, i5, -1, "com.yuanqi.master.mine.account.AccountScreen.<anonymous> (AccountScreen.kt:80)");
            }
            com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, 773766374, true, new a(it, this.$showDelete, this.$showConfirm, this.$mineViewModel, this.$navController)), composer, 6);
            composer.startReplaceableGroup(-2050222810);
            if (this.$showConfirm.getValue().booleanValue()) {
                o0 o0Var = o0.f15213a;
                Context context = this.$context;
                String string = context.getString(R.string.warn_tip);
                l0.o(string, "getString(...)");
                MutableState<Boolean> mutableState = this.$showConfirm;
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(mutableState);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0378b(mutableState);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                v3.a aVar = (v3.a) rememberedValue;
                MutableState<Boolean> mutableState2 = this.$showConfirm;
                composer.startReplaceableGroup(1157296644);
                boolean changed2 = composer.changed(mutableState2);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new c(mutableState2);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                o0.Y(o0Var, context, string, "退出后，无法正常使用。您确定要退出吗？", null, null, false, false, false, false, null, null, aVar, (v3.a) rememberedValue2, 2008, null);
            }
            composer.endReplaceableGroup();
            if (this.$showDelete.getValue().booleanValue()) {
                o0 o0Var2 = o0.f15213a;
                Context context2 = this.$context;
                MutableState<Boolean> mutableState3 = this.$showDelete;
                composer.startReplaceableGroup(1157296644);
                boolean changed3 = composer.changed(mutableState3);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new d(mutableState3);
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                o0Var2.h0(context2, (v3.a) rememberedValue3, new e(this.$showDelete, this.$mineViewModel));
            }
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
            b.a(this.$navController, this.$mineViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@l NavHostController navController, @m MineViewModel mineViewModel, @m Composer composer, int i5, int i6) {
        MineViewModel mineViewModel2;
        CreationExtras creationExtras;
        l0.p(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(-1127886704);
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
                ViewModel viewModel = ViewModelKt.viewModel(MineViewModel.class, current, null, a5, creationExtras, startRestartGroup, 36936, 0);
                startRestartGroup.endReplaceableGroup();
                mineViewModel2 = (MineViewModel) viewModel;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            mineViewModel2 = mineViewModel;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1127886704, i5, -1, "com.yuanqi.master.mine.account.AccountScreen (AccountScreen.kt:60)");
        }
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        BackHandlerKt.BackHandler(false, a.INSTANCE, startRestartGroup, 48, 1);
        MineViewModel mineViewModel3 = mineViewModel2;
        ScaffoldKt.m2107ScaffoldTvnljyQ(null, com.yuanqi.master.mine.account.c.f14792a.a(), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1900485087, true, new C0374b(mutableState, context, (MutableState) rememberedValue2, mineViewModel2, navController)), startRestartGroup, 805306416, 509);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(navController, mineViewModel3, i5, i6));
        }
    }
}
