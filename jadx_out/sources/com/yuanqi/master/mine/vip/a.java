package com.yuanqi.master.mine.vip;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
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
import com.yuanqi.master.network.model.response.VipMealData;
import com.yuanqi.master.start.TextActivity;
import com.yuanqi.master.tools.f1;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a#\u0010\r\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"BuyVipScreen", "", "navController", "Landroidx/navigation/NavHostController;", "mineViewModel", "Lcom/yuanqi/master/mine/MineViewModel;", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/Composer;II)V", "PrivItem", "imageId", "", com.alipay.sdk.m.x.d.f3030v, "", "(ILjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "VipMealModel", "isSelectYear", "Landroidx/compose/runtime/MutableState;", "", "(Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "VipPri", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nBuyVipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyVipScreen.kt\ncom/yuanqi/master/mine/vip/BuyVipScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,395:1\n81#2,11:396\n25#3:407\n25#3:415\n456#3,8:440\n464#3,3:454\n456#3,8:476\n464#3,3:490\n467#3,3:494\n467#3,3:499\n456#3,8:522\n464#3,3:536\n467#3,3:542\n456#3,8:565\n464#3,3:579\n456#3,8:600\n464#3,3:614\n36#3:618\n456#3,8:647\n464#3,3:661\n456#3,8:683\n464#3,3:697\n467#3,3:714\n467#3,3:719\n467#3,3:724\n456#3,8:747\n464#3,3:761\n36#3:765\n456#3,8:793\n464#3,3:807\n456#3,8:829\n464#3,3:843\n456#3,8:879\n464#3,3:893\n467#3,3:897\n467#3,3:902\n467#3,3:907\n456#3,8:931\n464#3,3:945\n467#3,3:949\n467#3,3:954\n467#3,3:959\n1116#4,6:408\n1116#4,6:416\n1116#4,6:619\n1116#4,6:766\n74#5:414\n67#6,7:422\n74#6:457\n78#6:503\n68#6,6:583\n74#6:617\n69#6,5:631\n74#6:664\n78#6:723\n78#6:728\n68#6,6:730\n74#6:764\n69#6,5:777\n74#6:810\n69#6,5:863\n74#6:896\n78#6:901\n78#6:911\n69#6,5:915\n74#6:948\n78#6:953\n78#6:958\n79#7,11:429\n79#7,11:465\n92#7:497\n92#7:502\n79#7,11:511\n92#7:545\n79#7,11:554\n79#7,11:589\n79#7,11:636\n79#7,11:672\n92#7:717\n92#7:722\n92#7:727\n79#7,11:736\n79#7,11:782\n79#7,11:818\n79#7,11:868\n92#7:900\n92#7:905\n92#7:910\n79#7,11:920\n92#7:952\n92#7:957\n92#7:962\n3737#8,6:448\n3737#8,6:484\n3737#8,6:530\n3737#8,6:573\n3737#8,6:608\n3737#8,6:655\n3737#8,6:691\n3737#8,6:755\n3737#8,6:801\n3737#8,6:837\n3737#8,6:887\n3737#8,6:939\n154#9:458\n154#9:540\n154#9:541\n154#9:625\n154#9:626\n154#9:627\n164#9:628\n154#9:629\n154#9:630\n154#9:665\n154#9:729\n154#9:772\n154#9:773\n154#9:774\n164#9:775\n154#9:776\n154#9:811\n154#9:860\n154#9:861\n154#9:862\n154#9:912\n154#9:913\n154#9:914\n87#10,6:459\n93#10:493\n97#10:498\n86#10,7:547\n93#10:582\n97#10:963\n73#11,7:504\n80#11:539\n84#11:546\n74#11,6:666\n80#11:700\n84#11:718\n74#11,6:812\n80#11:846\n84#11:906\n1099#12:701\n928#12,6:702\n928#12,6:708\n1099#12:847\n928#12,6:848\n928#12,6:854\n*S KotlinDebug\n*F\n+ 1 BuyVipScreen.kt\ncom/yuanqi/master/mine/vip/BuyVipScreenKt\n*L\n70#1:396,11\n73#1:407\n84#1:415\n229#1:440,8\n229#1:454,3\n237#1:476,8\n237#1:490,3\n237#1:494,3\n229#1:499,3\n251#1:522,8\n251#1:536,3\n251#1:542,3\n268#1:565,8\n268#1:579,3\n273#1:600,8\n273#1:614,3\n279#1:618\n278#1:647,8\n278#1:661,3\n291#1:683,8\n291#1:697,3\n291#1:714,3\n278#1:719,3\n273#1:724,3\n319#1:747,8\n319#1:761,3\n325#1:765\n324#1:793,8\n324#1:807,3\n336#1:829,8\n336#1:843,3\n356#1:879,8\n356#1:893,3\n356#1:897,3\n336#1:902,3\n324#1:907,3\n374#1:931,8\n374#1:945,3\n374#1:949,3\n319#1:954,3\n268#1:959,3\n73#1:408,6\n84#1:416,6\n279#1:619,6\n325#1:766,6\n77#1:414\n229#1:422,7\n229#1:457\n229#1:503\n273#1:583,6\n273#1:617\n278#1:631,5\n278#1:664\n278#1:723\n273#1:728\n319#1:730,6\n319#1:764\n324#1:777,5\n324#1:810\n356#1:863,5\n356#1:896\n356#1:901\n324#1:911\n374#1:915,5\n374#1:948\n374#1:953\n319#1:958\n229#1:429,11\n237#1:465,11\n237#1:497\n229#1:502\n251#1:511,11\n251#1:545\n268#1:554,11\n273#1:589,11\n278#1:636,11\n291#1:672,11\n291#1:717\n278#1:722\n273#1:727\n319#1:736,11\n324#1:782,11\n336#1:818,11\n356#1:868,11\n356#1:900\n336#1:905\n324#1:910\n374#1:920,11\n374#1:952\n319#1:957\n268#1:962\n229#1:448,6\n237#1:484,6\n251#1:530,6\n268#1:573,6\n273#1:608,6\n278#1:655,6\n291#1:691,6\n319#1:755,6\n324#1:801,6\n336#1:837,6\n356#1:887,6\n374#1:939,6\n237#1:458\n255#1:540\n259#1:541\n283#1:625\n285#1:626\n286#1:627\n288#1:628\n288#1:629\n289#1:630\n292#1:665\n313#1:729\n329#1:772\n331#1:773\n332#1:774\n334#1:775\n334#1:776\n337#1:811\n358#1:860\n359#1:861\n360#1:862\n377#1:912\n378#1:913\n379#1:914\n237#1:459,6\n237#1:493\n237#1:498\n268#1:547,7\n268#1:582\n268#1:963\n251#1:504,7\n251#1:539\n251#1:546\n291#1:666,6\n291#1:700\n291#1:718\n336#1:812,6\n336#1:846\n336#1:906\n301#1:701\n302#1:702,6\n305#1:708,6\n346#1:847\n347#1:848,6\n350#1:854,6\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.vip.BuyVipScreenKt$BuyVipScreen$1", f = "BuyVipScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.mine.vip.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0416a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0416a(MineViewModel mineViewModel, NavHostController navHostController, kotlin.coroutines.d<? super C0416a> dVar) {
            super(2, dVar);
            this.$mineViewModel = mineViewModel;
            this.$navController = navHostController;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new C0416a(this.$mineViewModel, this.$navController, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
            return ((C0416a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                this.$mineViewModel.K();
                this.$mineViewModel.U(this.$navController);
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.mine.vip.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0417a extends n0 implements v3.a<r2> {
            final /* synthetic */ MineViewModel $mineViewModel;
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0417a(MineViewModel mineViewModel, NavHostController navHostController) {
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
                if (this.$mineViewModel.B()) {
                    this.$mineViewModel.R(false);
                    MineActivity a5 = MineActivity.f14760b.a();
                    if (a5 != null) {
                        a5.finish();
                        return;
                    }
                    return;
                }
                this.$navController.popBackStack();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MineViewModel mineViewModel, NavHostController navHostController) {
            super(2);
            this.$mineViewModel = mineViewModel;
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
                ComposerKt.traceEventStart(1526352464, i5, -1, "com.yuanqi.master.mine.vip.BuyVipScreen.<anonymous> (BuyVipScreen.kt:88)");
            }
            com.yuanqi.master.tools.a.f(StringResources_androidKt.stringResource(R.string.buy_vip_title, composer, 6), null, new C0417a(this.$mineViewModel, this.$navController), composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends n0 implements q<PaddingValues, Composer, Integer, r2> {
        final /* synthetic */ MutableState<Boolean> $agreeRule;
        final /* synthetic */ MutableState<Boolean> $chooseVip;
        final /* synthetic */ Context $context;
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nBuyVipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyVipScreen.kt\ncom/yuanqi/master/mine/vip/BuyVipScreenKt$BuyVipScreen$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,395:1\n154#2:396\n154#2:468\n154#2:469\n154#2:470\n154#2:509\n154#2:510\n154#2:511\n154#2:558\n154#2:559\n154#2:560\n154#2:600\n154#2:601\n154#2:602\n68#3,6:397\n74#3:431\n69#3,5:561\n74#3:594\n78#3:599\n69#3,5:603\n74#3:636\n78#3:641\n78#3:651\n79#4,11:403\n79#4,11:439\n79#4,11:480\n79#4,11:519\n92#4:551\n92#4:556\n79#4,11:566\n92#4:598\n79#4,11:608\n92#4:640\n92#4:645\n92#4:650\n456#5,8:414\n464#5,3:428\n456#5,8:450\n464#5,3:464\n36#5:471\n456#5,8:491\n464#5,3:505\n456#5,8:530\n464#5,3:544\n467#5,3:548\n467#5,3:553\n456#5,8:577\n464#5,3:591\n467#5,3:595\n456#5,8:619\n464#5,3:633\n467#5,3:637\n467#5,3:642\n467#5,3:647\n3737#6,6:422\n3737#6,6:458\n3737#6,6:499\n3737#6,6:538\n3737#6,6:585\n3737#6,6:627\n73#7,7:432\n80#7:467\n84#7:646\n1116#8,6:472\n91#9,2:478\n93#9:508\n86#9,7:512\n93#9:547\n97#9:552\n97#9:557\n*S KotlinDebug\n*F\n+ 1 BuyVipScreen.kt\ncom/yuanqi/master/mine/vip/BuyVipScreenKt$BuyVipScreen$3$1\n*L\n103#1:396\n106#1:468\n108#1:469\n116#1:470\n129#1:509\n130#1:510\n136#1:511\n159#1:558\n164#1:559\n165#1:560\n187#1:600\n192#1:601\n193#1:602\n99#1:397,6\n99#1:431\n161#1:561,5\n161#1:594\n161#1:599\n189#1:603,5\n189#1:636\n189#1:641\n99#1:651\n99#1:403,11\n105#1:439,11\n117#1:480,11\n137#1:519,11\n137#1:551\n117#1:556\n161#1:566,11\n161#1:598\n189#1:608,11\n189#1:640\n105#1:645\n99#1:650\n99#1:414,8\n99#1:428,3\n105#1:450,8\n105#1:464,3\n120#1:471\n117#1:491,8\n117#1:505,3\n137#1:530,8\n137#1:544,3\n137#1:548,3\n117#1:553,3\n161#1:577,8\n161#1:591,3\n161#1:595,3\n189#1:619,8\n189#1:633,3\n189#1:637,3\n105#1:642,3\n99#1:647,3\n99#1:422,6\n105#1:458,6\n117#1:499,6\n137#1:538,6\n161#1:585,6\n189#1:627,6\n105#1:432,7\n105#1:467\n105#1:646\n120#1:472,6\n117#1:478,2\n117#1:508\n137#1:512,7\n137#1:547\n137#1:552\n117#1:557\n*E\n"})
        /* renamed from: com.yuanqi.master.mine.vip.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0418a extends n0 implements q<BoxScope, Composer, Integer, r2> {
            final /* synthetic */ MutableState<Boolean> $agreeRule;
            final /* synthetic */ MutableState<Boolean> $chooseVip;
            final /* synthetic */ Context $context;
            final /* synthetic */ PaddingValues $it;
            final /* synthetic */ MineViewModel $mineViewModel;
            final /* synthetic */ NavHostController $navController;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.vip.a$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0419a extends n0 implements v3.a<r2> {
                final /* synthetic */ MutableState<Boolean> $agreeRule;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0419a(MutableState<Boolean> mutableState) {
                    super(0);
                    this.$agreeRule = mutableState;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$agreeRule.setValue(Boolean.valueOf(!this.$agreeRule.getValue().booleanValue()));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.vip.a$c$a$b */
            /* loaded from: classes3.dex */
            public static final class b extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(Context context) {
                    super(0);
                    this.$context = context;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Context context = this.$context;
                    Intent intent = new Intent(this.$context, (Class<?>) TextActivity.class);
                    intent.putExtra(com.alipay.sdk.m.x.d.f3030v, "会员服务协议");
                    intent.putExtra("content", com.yuanqi.master.config.d.f14558b);
                    context.startActivity(intent);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.vip.a$c$a$c, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0420c extends n0 implements v3.a<r2> {
                final /* synthetic */ MutableState<Boolean> $agreeRule;
                final /* synthetic */ MutableState<Boolean> $chooseVip;
                final /* synthetic */ Context $context;
                final /* synthetic */ MineViewModel $mineViewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0420c(MutableState<Boolean> mutableState, Context context, MineViewModel mineViewModel, MutableState<Boolean> mutableState2) {
                    super(0);
                    this.$agreeRule = mutableState;
                    this.$context = context;
                    this.$mineViewModel = mineViewModel;
                    this.$chooseVip = mutableState2;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (!this.$agreeRule.getValue().booleanValue()) {
                        f1.r(this.$context.getString(R.string.must_agree) + this.$context.getString(R.string.buy_vip_agreement), 0, 2, null);
                        return;
                    }
                    MineViewModel mineViewModel = this.$mineViewModel;
                    MineActivity a5 = MineActivity.f14760b.a();
                    l0.m(a5);
                    mineViewModel.h(a5, this.$chooseVip.getValue().booleanValue());
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.vip.a$c$a$d */
            /* loaded from: classes3.dex */
            public static final class d extends n0 implements v3.a<r2> {
                final /* synthetic */ MutableState<Boolean> $agreeRule;
                final /* synthetic */ MutableState<Boolean> $chooseVip;
                final /* synthetic */ Context $context;
                final /* synthetic */ MineViewModel $mineViewModel;
                final /* synthetic */ NavHostController $navController;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.mine.vip.a$c$a$d$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0421a extends n0 implements v3.a<r2> {
                    final /* synthetic */ MineViewModel $mineViewModel;
                    final /* synthetic */ NavHostController $navController;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.vip.BuyVipScreenKt$BuyVipScreen$3$1$1$1$5$1$1", f = "BuyVipScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.mine.vip.a$c$a$d$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0422a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                        final /* synthetic */ NavHostController $navController;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0422a(NavHostController navHostController, kotlin.coroutines.d<? super C0422a> dVar) {
                            super(2, dVar);
                            this.$navController = navHostController;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @l
                        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                            return new C0422a(this.$navController, dVar);
                        }

                        @Override // v3.p
                        @m
                        public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
                            return ((C0422a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object obj) {
                            kotlin.coroutines.intrinsics.d.l();
                            if (this.label == 0) {
                                e1.n(obj);
                                NavController.navigate$default(this.$navController, com.yuanqi.master.mine.c.f14826h, null, null, 6, null);
                                return r2.f19517a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0421a(MineViewModel mineViewModel, NavHostController navHostController) {
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
                        k.f(this.$mineViewModel.t(), k1.e(), null, new C0422a(this.$navController, null), 2, null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(MutableState<Boolean> mutableState, Context context, MineViewModel mineViewModel, MutableState<Boolean> mutableState2, NavHostController navHostController) {
                    super(0);
                    this.$agreeRule = mutableState;
                    this.$context = context;
                    this.$mineViewModel = mineViewModel;
                    this.$chooseVip = mutableState2;
                    this.$navController = navHostController;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (!this.$agreeRule.getValue().booleanValue()) {
                        f1.r(this.$context.getString(R.string.must_agree) + this.$context.getString(R.string.buy_vip_agreement), 0, 2, null);
                        return;
                    }
                    MineViewModel mineViewModel = this.$mineViewModel;
                    MineActivity a5 = MineActivity.f14760b.a();
                    l0.m(a5);
                    mineViewModel.g(a5, this.$chooseVip.getValue().booleanValue(), new C0421a(this.$mineViewModel, this.$navController));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0418a(PaddingValues paddingValues, MineViewModel mineViewModel, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Context context, NavHostController navHostController) {
                super(3);
                this.$it = paddingValues;
                this.$mineViewModel = mineViewModel;
                this.$chooseVip = mutableState;
                this.$agreeRule = mutableState2;
                this.$context = context;
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
                l0.p(GradientBox, "$this$GradientBox");
                if ((i5 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1625902690, i5, -1, "com.yuanqi.master.mine.vip.BuyVipScreen.<anonymous>.<anonymous> (BuyVipScreen.kt:98)");
                }
                Modifier.Companion companion = Modifier.Companion;
                float f5 = 20;
                Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), this.$it), Dp.m6044constructorimpl(f5), 0.0f, 2, null);
                MineViewModel mineViewModel = this.$mineViewModel;
                MutableState<Boolean> mutableState = this.$chooseVip;
                MutableState<Boolean> mutableState2 = this.$agreeRule;
                Context context = this.$context;
                NavHostController navHostController = this.$navController;
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
                Alignment.Horizontal start = companion2.getStart();
                composer.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), start, composer, 48);
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
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(10)), composer, 6);
                a.d(composer, 0);
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(f5)), composer, 6);
                long L = com.yuanqi.master.theme.b.L();
                FontWeight.Companion companion4 = FontWeight.Companion;
                TextKt.m2452Text4IGK_g("会员套餐", (Modifier) null, L, TextUnitKt.getSp(15), (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 200070, 0, 131026);
                a.c(mineViewModel, mutableState, composer, 56);
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(f5)), composer, 6);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(mutableState2);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0419a(mutableState2);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier m235clickableXHw0xAI$default = ClickableKt.m235clickableXHw0xAI$default(fillMaxWidth$default, false, null, null, (v3.a) rememberedValue, 7, null);
                Arrangement.Horizontal start2 = arrangement.getStart();
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start2, centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m235clickableXHw0xAI$default);
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
                Updater.m3271setimpl(m3264constructorimpl3, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier m553padding3ABfNKs = PaddingKt.m553padding3ABfNKs(SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(30)), Dp.m6044constructorimpl(6));
                if (mutableState2.getValue().booleanValue()) {
                    composer.startReplaceableGroup(283256462);
                    i6 = R.mipmap.checked;
                } else {
                    composer.startReplaceableGroup(283256506);
                    i6 = R.mipmap.uncheck;
                }
                Painter painterResource = PainterResources_androidKt.painterResource(i6, composer, 6);
                composer.endReplaceableGroup();
                ImageKt.Image(painterResource, "", m553padding3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
                SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, Dp.m6044constructorimpl(4)), composer, 6);
                Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer, 48);
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
                Updater.m3271setimpl(m3264constructorimpl4, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl4.getInserting() || !l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.read_aree, composer, 6), (Modifier) null, com.yuanqi.master.theme.b.L(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3456, 0, 131058);
                TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.buy_vip_agreement, composer, 6), ClickableKt.m235clickableXHw0xAI$default(companion, false, null, null, new b(context), 7, null), com.yuanqi.master.theme.b.m(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3456, 0, 131056);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(f5)), composer, 6);
                float f6 = 40;
                Modifier m235clickableXHw0xAI$default2 = ClickableKt.m235clickableXHw0xAI$default(BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(SizeKt.m588height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6044constructorimpl(f6)), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f5))), ColorKt.Color(4278309388L), null, 2, null), false, null, null, new C0420c(mutableState2, context, mineViewModel, mutableState), 7, null);
                Alignment center = companion2.getCenter();
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor5 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(m235clickableXHw0xAI$default2);
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
                Updater.m3271setimpl(m3264constructorimpl5, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl5.getInserting() || !l0.g(m3264constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m3264constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m3264constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                modifierMaterializerOf5.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                String stringResource = StringResources_androidKt.stringResource(R.string.wx_pay, composer, 6);
                Color.Companion companion5 = Color.Companion;
                TextKt.m2452Text4IGK_g(stringResource, (Modifier) null, companion5.m3771getWhite0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 200064, 0, 131026);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(f5)), composer, 6);
                Modifier m235clickableXHw0xAI$default3 = ClickableKt.m235clickableXHw0xAI$default(BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(SizeKt.m588height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6044constructorimpl(f6)), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f5))), ColorKt.Color(4278233839L), null, 2, null), false, null, null, new d(mutableState2, context, mineViewModel, mutableState, navHostController), 7, null);
                Alignment center2 = companion2.getCenter();
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor6 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(m235clickableXHw0xAI$default3);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor6);
                } else {
                    composer.useNode();
                }
                Composer m3264constructorimpl6 = Updater.m3264constructorimpl(composer);
                Updater.m3271setimpl(m3264constructorimpl6, rememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl6.getInserting() || !l0.g(m3264constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    m3264constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    m3264constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                modifierMaterializerOf6.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.ali_pay, composer, 6), (Modifier) null, companion5.m3771getWhite0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 200064, 0, 131026);
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
        c(MineViewModel mineViewModel, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Context context, NavHostController navHostController) {
            super(3);
            this.$mineViewModel = mineViewModel;
            this.$chooseVip = mutableState;
            this.$agreeRule = mutableState2;
            this.$context = context;
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
                ComposerKt.traceEventStart(1291131419, i5, -1, "com.yuanqi.master.mine.vip.BuyVipScreen.<anonymous> (BuyVipScreen.kt:97)");
            }
            com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, 1625902690, true, new C0418a(it, this.$mineViewModel, this.$chooseVip, this.$agreeRule, this.$context, this.$navController)), composer, 6);
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
        final /* synthetic */ MineViewModel $mineViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(NavHostController navHostController, MineViewModel mineViewModel, int i5, int i6) {
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
            a.a(this.$navController, this.$mineViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $imageId;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i5, String str, int i6) {
            super(2);
            this.$imageId = i5;
            this.$title = str;
            this.$$changed = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            a.b(this.$imageId, this.$title, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<Boolean> $isSelectYear;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(MutableState<Boolean> mutableState) {
            super(0);
            this.$isSelectYear = mutableState;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$isSelectYear.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends n0 implements v3.a<r2> {
        final /* synthetic */ MutableState<Boolean> $isSelectYear;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(MutableState<Boolean> mutableState) {
            super(0);
            this.$isSelectYear = mutableState;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$isSelectYear.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MutableState<Boolean> $isSelectYear;
        final /* synthetic */ MineViewModel $mineViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(MineViewModel mineViewModel, MutableState<Boolean> mutableState, int i5) {
            super(2);
            this.$mineViewModel = mineViewModel;
            this.$isSelectYear = mutableState;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            a.c(this.$mineViewModel, this.$isSelectYear, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i5) {
            super(2);
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            a.d(composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@l NavHostController navController, @m MineViewModel mineViewModel, @m Composer composer, int i5, int i6) {
        MineViewModel mineViewModel2;
        CreationExtras creationExtras;
        l0.p(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(1890249100);
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
            ComposerKt.traceEventStart(1890249100, i5, -1, "com.yuanqi.master.mine.vip.BuyVipScreen (BuyVipScreen.kt:70)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Boolean bool = Boolean.TRUE;
        EffectsKt.LaunchedEffect(bool, new C0416a(mineViewModel2, navController, null), startRestartGroup, 70);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1526352464, true, new b(mineViewModel2, navController));
        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1291131419, true, new c(mineViewModel2, (MutableState) rememberedValue2, mutableState, context, navController));
        MineViewModel mineViewModel3 = mineViewModel2;
        ScaffoldKt.m2107ScaffoldTvnljyQ(null, composableLambda, null, null, null, 0, 0L, 0L, null, composableLambda2, startRestartGroup, 805306416, 509);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(navController, mineViewModel3, i5, i6));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(int i5, @l String title, @m Composer composer, int i6) {
        int i7;
        Composer composer2;
        int i8;
        int i9;
        l0.p(title, "title");
        Composer startRestartGroup = composer.startRestartGroup(200697627);
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed(i5)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i7 = i9 | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 112) == 0) {
            if (startRestartGroup.changed(title)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i7 |= i8;
        }
        int i10 = i7;
        if ((i10 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(200697627, i10, -1, "com.yuanqi.master.mine.vip.PrivItem (BuyVipScreen.kt:249)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            startRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(i5, startRestartGroup, i10 & 14), "", SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(50)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 440, 120);
            SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(8)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TextKt.m2452Text4IGK_g(title, (Modifier) null, com.yuanqi.master.theme.b.M(), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer2, ((i10 >> 3) & 14) | 3456, 0, 131058);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(i5, title, i6));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@l MineViewModel mineViewModel, @l MutableState<Boolean> isSelectYear, @m Composer composer, int i5) {
        long I2;
        long J2;
        long G2;
        Float f5;
        long I22;
        long J22;
        long G22;
        long b42;
        Integer num;
        long j5;
        ArrayList r5;
        Integer num2;
        l0.p(mineViewModel, "mineViewModel");
        l0.p(isSelectYear, "isSelectYear");
        Composer startRestartGroup = composer.startRestartGroup(-688697654);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-688697654, i5, -1, "com.yuanqi.master.mine.vip.VipMealModel (BuyVipScreen.kt:266)");
        }
        startRestartGroup.startReplaceableGroup(693286680);
        Modifier.Companion companion = Modifier.Companion;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Horizontal start = arrangement.getStart();
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion3.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
        Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (isSelectYear.getValue().booleanValue()) {
            I2 = com.yuanqi.master.theme.b.k();
        } else {
            I2 = com.yuanqi.master.theme.b.I2();
        }
        long j6 = I2;
        if (isSelectYear.getValue().booleanValue()) {
            J2 = com.yuanqi.master.theme.b.k();
        } else {
            J2 = com.yuanqi.master.theme.b.J2();
        }
        long j7 = J2;
        if (isSelectYear.getValue().booleanValue()) {
            G2 = com.yuanqi.master.theme.b.Q();
        } else {
            G2 = com.yuanqi.master.theme.b.G2();
        }
        long j8 = G2;
        Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
        Color.Companion companion4 = Color.Companion;
        Modifier m201backgroundbw27NRU$default = BackgroundKt.m201backgroundbw27NRU$default(weight$default, companion4.m3769getTransparent0d7_KjU(), null, 2, null);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m201backgroundbw27NRU$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
        Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(isSelectYear);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new f(isSelectYear);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        float f6 = 120;
        float f7 = 7;
        float f8 = 10;
        Modifier m201backgroundbw27NRU$default2 = BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m557paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.m588height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m235clickableXHw0xAI$default(companion, false, null, null, (v3.a) rememberedValue, 7, null), 0.0f, 1, null), Dp.m6044constructorimpl(f6)), companion2.getBottomCenter()), 0.0f, Dp.m6044constructorimpl(f7), 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f8))), j6, null, 2, null);
        float f9 = (float) 1.3d;
        Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(BorderKt.m212borderxT4_qwU(m201backgroundbw27NRU$default2, Dp.m6044constructorimpl(f9), j7, RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f8))), 0.0f, Dp.m6044constructorimpl(f7), 0.0f, 0.0f, 13, null);
        Alignment topCenter = companion2.getTopCenter();
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(topCenter, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor3);
        } else {
            startRestartGroup.useNode();
        }
        Composer m3264constructorimpl3 = Updater.m3264constructorimpl(startRestartGroup);
        Updater.m3271setimpl(m3264constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        float f10 = 20;
        Modifier m557paddingqDBjuR0$default2 = PaddingKt.m557paddingqDBjuR0$default(companion, 0.0f, Dp.m6044constructorimpl(f10), 0.0f, 0.0f, 13, null);
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
        v3.a<ComposeUiNode> constructor4 = companion3.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default2);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor4);
        } else {
            startRestartGroup.useNode();
        }
        Composer m3264constructorimpl4 = Updater.m3264constructorimpl(startRestartGroup);
        Updater.m3271setimpl(m3264constructorimpl4, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl4.getInserting() || !l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        long sp = TextUnitKt.getSp(15);
        FontWeight.Companion companion5 = FontWeight.Companion;
        TextKt.m2452Text4IGK_g("月费会员", (Modifier) null, j8, sp, (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, startRestartGroup, 199686, 0, 131026);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        int pushStyle = builder.pushStyle(new SpanStyle(j8, TextUnitKt.getSp(20), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65532, (w) null));
        try {
            builder.append("￥");
            r2 r2Var = r2.f19517a;
            builder.pop(pushStyle);
            pushStyle = builder.pushStyle(new SpanStyle(j8, TextUnitKt.getSp(32), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65532, (w) null));
            try {
                VipMealData value = mineViewModel.z().getValue();
                if (value != null) {
                    f5 = Float.valueOf(value.getOrderAmount());
                } else {
                    f5 = null;
                }
                builder.append(String.valueOf(f5));
                builder.pop(pushStyle);
                TextKt.m2453TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, startRestartGroup, 0, 0, 262142);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, Dp.m6044constructorimpl(f10)), startRestartGroup, 6);
                if (!isSelectYear.getValue().booleanValue()) {
                    I22 = com.yuanqi.master.theme.b.k();
                } else {
                    I22 = com.yuanqi.master.theme.b.I2();
                }
                if (!isSelectYear.getValue().booleanValue()) {
                    J22 = com.yuanqi.master.theme.b.k();
                } else {
                    J22 = com.yuanqi.master.theme.b.J2();
                }
                long j9 = J22;
                if (!isSelectYear.getValue().booleanValue()) {
                    G22 = com.yuanqi.master.theme.b.Q();
                } else {
                    G22 = com.yuanqi.master.theme.b.G2();
                }
                long j10 = G22;
                Modifier m201backgroundbw27NRU$default3 = BackgroundKt.m201backgroundbw27NRU$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), companion4.m3769getTransparent0d7_KjU(), null, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor5 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(m201backgroundbw27NRU$default3);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3264constructorimpl5 = Updater.m3264constructorimpl(startRestartGroup);
                Updater.m3271setimpl(m3264constructorimpl5, rememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl5.getInserting() || !l0.g(m3264constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m3264constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m3264constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                modifierMaterializerOf5.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed2 = startRestartGroup.changed(isSelectYear);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new g(isSelectYear);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier m212borderxT4_qwU = BorderKt.m212borderxT4_qwU(BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m557paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.m588height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m235clickableXHw0xAI$default(companion, false, null, null, (v3.a) rememberedValue2, 7, null), 0.0f, 1, null), Dp.m6044constructorimpl(f6)), companion2.getBottomCenter()), 0.0f, Dp.m6044constructorimpl(f7), 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f8))), I22, null, 2, null), Dp.m6044constructorimpl(f9), j9, RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f8)));
                Alignment topCenter2 = companion2.getTopCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(topCenter2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor6 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(m212borderxT4_qwU);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor6);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3264constructorimpl6 = Updater.m3264constructorimpl(startRestartGroup);
                Updater.m3271setimpl(m3264constructorimpl6, rememberBoxMeasurePolicy4, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl6.getInserting() || !l0.g(m3264constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    m3264constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    m3264constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                modifierMaterializerOf6.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                Modifier m557paddingqDBjuR0$default3 = PaddingKt.m557paddingqDBjuR0$default(companion, 0.0f, Dp.m6044constructorimpl(f10), 0.0f, 0.0f, 13, null);
                Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                startRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor7 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default3);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor7);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3264constructorimpl7 = Updater.m3264constructorimpl(startRestartGroup);
                Updater.m3271setimpl(m3264constructorimpl7, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl7, currentCompositionLocalMap7, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash7 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl7.getInserting() || !l0.g(m3264constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    m3264constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    m3264constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                modifierMaterializerOf7.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                TextKt.m2452Text4IGK_g("年费会员", (Modifier) null, j10, TextUnitKt.getSp(15), (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, startRestartGroup, 199686, 0, 131026);
                builder = new AnnotatedString.Builder(0, 1, null);
                pushStyle = builder.pushStyle(new SpanStyle(j10, TextUnitKt.getSp(20), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65532, (w) null));
                try {
                    builder.append("￥");
                    builder.pop(pushStyle);
                    pushStyle = builder.pushStyle(new SpanStyle(j10, TextUnitKt.getSp(32), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65532, (w) null));
                    try {
                        if (mineViewModel.A().getValue() != null) {
                            VipMealData value2 = mineViewModel.A().getValue();
                            if (value2 != null) {
                                num2 = Integer.valueOf((int) value2.getOrderAmount());
                            } else {
                                num2 = null;
                            }
                            builder.append(String.valueOf(num2));
                        }
                        builder.pop(pushStyle);
                        TextKt.m2453TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, startRestartGroup, 0, 0, 262142);
                        Modifier clip = ClipKt.clip(SizeKt.m588height3ABfNKs(SizeKt.m607width3ABfNKs(companion, Dp.m6044constructorimpl(100)), Dp.m6044constructorimpl(f10)), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(3)));
                        if (isSelectYear.getValue().booleanValue()) {
                            b42 = com.yuanqi.master.theme.b.E2();
                        } else {
                            b42 = com.yuanqi.master.theme.b.b4();
                        }
                        Modifier m201backgroundbw27NRU$default4 = BackgroundKt.m201backgroundbw27NRU$default(clip, b42, null, 2, null);
                        Alignment center = companion2.getCenter();
                        startRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
                        v3.a<ComposeUiNode> constructor8 = companion3.getConstructor();
                        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(m201backgroundbw27NRU$default4);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor8);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m3264constructorimpl8 = Updater.m3264constructorimpl(startRestartGroup);
                        Updater.m3271setimpl(m3264constructorimpl8, rememberBoxMeasurePolicy5, companion3.getSetMeasurePolicy());
                        Updater.m3271setimpl(m3264constructorimpl8, currentCompositionLocalMap8, companion3.getSetResolvedCompositionLocals());
                        p<ComposeUiNode, Integer, r2> setCompositeKeyHash8 = companion3.getSetCompositeKeyHash();
                        if (m3264constructorimpl8.getInserting() || !l0.g(m3264constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            m3264constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                            m3264constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                        }
                        modifierMaterializerOf8.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        StringBuilder sb = new StringBuilder();
                        VipMealData value3 = mineViewModel.A().getValue();
                        if (value3 != null) {
                            num = Integer.valueOf((int) value3.getOrderAmount());
                        } else {
                            num = null;
                        }
                        sb.append(num);
                        sb.append("享受13个月");
                        String sb2 = sb.toString();
                        if (isSelectYear.getValue().booleanValue()) {
                            j5 = 4293370229L;
                        } else {
                            j5 = 4288322202L;
                        }
                        TextKt.m2452Text4IGK_g(sb2, (Modifier) null, ColorKt.Color(j5), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, startRestartGroup, 3072, 0, 131058);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        Modifier clip2 = ClipKt.clip(SizeKt.m588height3ABfNKs(SizeKt.m607width3ABfNKs(boxScopeInstance.align(companion, companion2.getTopCenter()), Dp.m6044constructorimpl(80)), Dp.m6044constructorimpl(f10)), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f8)));
                        Brush.Companion companion6 = Brush.Companion;
                        r5 = kotlin.collections.w.r(Color.m3724boximpl(ColorKt.Color(4293613133L)), Color.m3724boximpl(ColorKt.Color(4293823830L)));
                        Modifier background$default = BackgroundKt.background$default(clip2, Brush.Companion.m3685linearGradientmHitzGk$default(companion6, r5, 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
                        Alignment center2 = companion2.getCenter();
                        startRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = startRestartGroup.getCurrentCompositionLocalMap();
                        v3.a<ComposeUiNode> constructor9 = companion3.getConstructor();
                        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(background$default);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor9);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m3264constructorimpl9 = Updater.m3264constructorimpl(startRestartGroup);
                        Updater.m3271setimpl(m3264constructorimpl9, rememberBoxMeasurePolicy6, companion3.getSetMeasurePolicy());
                        Updater.m3271setimpl(m3264constructorimpl9, currentCompositionLocalMap9, companion3.getSetResolvedCompositionLocals());
                        p<ComposeUiNode, Integer, r2> setCompositeKeyHash9 = companion3.getSetCompositeKeyHash();
                        if (m3264constructorimpl9.getInserting() || !l0.g(m3264constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                            m3264constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                            m3264constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                        }
                        modifierMaterializerOf9.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        TextKt.m2452Text4IGK_g("限时优惠", (Modifier) null, companion4.m3771getWhite0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, startRestartGroup, 3462, 0, 131058);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new h(mineViewModel, isSelectYear, i5));
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(@m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-870205839);
        if (i5 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-870205839, i5, -1, "com.yuanqi.master.mine.vip.VipPri (BuyVipScreen.kt:227)");
            }
            Alignment.Companion companion = Alignment.Companion;
            Alignment center = companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion2 = Modifier.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
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
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.v_bg, startRestartGroup, 6), "", SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), (Alignment) null, ContentScale.Companion.getFillWidth(), 0.0f, (ColorFilter) null, startRestartGroup, 25016, 104);
            Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(companion2, Dp.m6044constructorimpl(15), 0.0f, 2, null);
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            b(R.mipmap.mutil_open, "无限多开", startRestartGroup, 54);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null), startRestartGroup, 0);
            b(R.mipmap.app_lock_tip, "应用锁", startRestartGroup, 54);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null), startRestartGroup, 0);
            b(R.mipmap.change_device_tip, "一键换机", startRestartGroup, 54);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null), startRestartGroup, 0);
            b(R.mipmap.custom_sercice_tip, "专属客服", startRestartGroup, 54);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(i5));
        }
    }
}
