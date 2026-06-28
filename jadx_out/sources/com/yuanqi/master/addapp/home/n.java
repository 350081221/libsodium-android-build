package com.yuanqi.master.addapp.home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
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
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.i;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.stub.RequestExternalStorageManagerActivity;
import com.yqtech.multiapp.R;
import com.yuanqi.master.ViewModelFactoryKt;
import com.yuanqi.master.addapp.AddAppActivity;
import com.yuanqi.master.addapp.AddAppViewModel;
import com.yuanqi.master.tools.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.text.h0;
import kotlin.u0;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import v3.p;
import v3.q;
import v3.r;

@i0(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u000f\u001a)\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u0084\u0002"}, d2 = {"HomeGridItems", "", "index", "", "addAppViewModel", "Lcom/yuanqi/master/addapp/AddAppViewModel;", "appShowList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/yuanqi/group/home/models/AppInfo;", "(ILcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/Composer;I)V", "SelectAppScene", "navController", "Landroidx/navigation/NavHostController;", "(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;II)V", "SelectAppTitle", "(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;I)V", "drawBottomBorder", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "borderColor", "Landroidx/compose/ui/graphics/Color;", "drawBottomBorder-H2RKhps", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "app_release", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 12 Composer.kt\nandroidx/compose/runtime/Updater\n+ 13 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 14 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,676:1\n81#2,11:677\n25#3:688\n25#3:699\n25#3:713\n456#3,8:744\n464#3,3:758\n456#3,8:779\n464#3,3:793\n25#3:797\n456#3,8:821\n464#3,3:835\n467#3,3:843\n467#3,3:852\n467#3,3:857\n1116#4,6:689\n1116#4,3:700\n1119#4,3:706\n1116#4,6:714\n1116#4,6:798\n487#5,4:695\n491#5,2:703\n495#5:709\n487#6:705\n74#7:710\n74#7:720\n74#7:721\n1#8:711\n154#9:712\n154#9:722\n154#9:723\n164#9:724\n154#9:725\n154#9:726\n154#9:804\n154#9:839\n154#9:840\n154#9:841\n154#9:842\n154#9:848\n154#9:849\n154#9:850\n154#9:851\n68#10,6:727\n74#10:761\n78#10:861\n79#11,11:733\n79#11,11:768\n79#11,11:810\n92#11:846\n92#11:855\n92#11:860\n3737#12,6:752\n3737#12,6:787\n3737#12,6:829\n74#13,6:762\n80#13:796\n84#13:856\n88#14,5:805\n93#14:838\n97#14:847\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt\n*L\n114#1:677,11\n118#1:688\n121#1:699\n130#1:713\n552#1:744,8\n552#1:758,3\n584#1:779,8\n584#1:793,3\n589#1:797\n593#1:821,8\n593#1:835,3\n593#1:843,3\n584#1:852,3\n552#1:857,3\n118#1:689,6\n121#1:700,3\n121#1:706,3\n130#1:714,6\n589#1:798,6\n121#1:695,4\n121#1:703,2\n121#1:709\n121#1:705\n122#1:710\n134#1:720\n549#1:721\n122#1:712\n576#1:722\n577#1:723\n579#1:724\n579#1:725\n580#1:726\n592#1:804\n601#1:839\n602#1:840\n617#1:841\n618#1:842\n642#1:848\n644#1:849\n649#1:850\n652#1:851\n552#1:727,6\n552#1:761\n552#1:861\n552#1:733,11\n584#1:768,11\n593#1:810,11\n593#1:846\n584#1:855\n552#1:860\n552#1:752,6\n584#1:787,6\n593#1:829,6\n584#1:762,6\n584#1:796\n584#1:856\n593#1:805,5\n593#1:838\n593#1:847\n*E\n"})
/* loaded from: classes3.dex */
public final class n {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements v3.a<r2> {
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $index;
        final /* synthetic */ com.yuanqi.group.home.models.c $info;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AddAppViewModel addAppViewModel, com.yuanqi.group.home.models.c cVar, Context context, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, int i5) {
            super(0);
            this.$addAppViewModel = addAppViewModel;
            this.$info = cVar;
            this.$context = context;
            this.$appShowList = snapshotStateList;
            this.$index = i5;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.$addAppViewModel.E().getValue().booleanValue()) {
                return;
            }
            if (!com.yuanqi.master.mine.account.a.f14786a.k()) {
                AddAppViewModel addAppViewModel = this.$addAppViewModel;
                String packageName = this.$info.f14012a;
                l0.o(packageName, "packageName");
                if (addAppViewModel.M(packageName)) {
                    this.$addAppViewModel.b(this.$context, 2);
                    return;
                }
            }
            com.yuanqi.group.home.models.c a5 = this.$info.a();
            if (this.$info.f14017f > 0) {
                a5.f14017f = 0;
            } else {
                a5.f14017f = 1;
            }
            SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList = this.$appShowList;
            int i5 = this.$index;
            l0.m(a5);
            snapshotStateList.set(i5, a5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements v3.a<r2> {
        final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
        final /* synthetic */ int $index;
        final /* synthetic */ com.yuanqi.group.home.models.c $info;
        final /* synthetic */ MutableIntState $installNum;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.yuanqi.group.home.models.c cVar, MutableIntState mutableIntState, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, int i5) {
            super(0);
            this.$info = cVar;
            this.$installNum = mutableIntState;
            this.$appShowList = snapshotStateList;
            this.$index = i5;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            com.yuanqi.group.home.models.c a5 = this.$info.a();
            this.$installNum.setIntValue(r1.getIntValue() - 1);
            a5.f14017f = this.$installNum.getIntValue();
            SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList = this.$appShowList;
            int i5 = this.$index;
            l0.m(a5);
            snapshotStateList.set(i5, a5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$HomeGridItems$2$1$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,676:1\n766#2:677\n857#2,2:678\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$HomeGridItems$2$1$1$2\n*L\n622#1:677\n622#1:678,2\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class c extends n0 implements v3.a<r2> {
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $index;
        final /* synthetic */ com.yuanqi.group.home.models.c $info;
        final /* synthetic */ MutableIntState $installNum;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, AddAppViewModel addAppViewModel, com.yuanqi.group.home.models.c cVar, Context context, MutableIntState mutableIntState, int i5) {
            super(0);
            this.$appShowList = snapshotStateList;
            this.$addAppViewModel = addAppViewModel;
            this.$info = cVar;
            this.$context = context;
            this.$installNum = mutableIntState;
            this.$index = i5;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ArrayList<com.yuanqi.group.home.models.c> arrayList = new ArrayList<>();
            SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList = this.$appShowList;
            ArrayList arrayList2 = new ArrayList();
            Iterator<com.yuanqi.group.home.models.c> it = snapshotStateList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.yuanqi.group.home.models.c next = it.next();
                if (next.f14017f > 0) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll(arrayList2);
            if (!com.yuanqi.master.mine.account.a.f14786a.k() && this.$addAppViewModel.N(arrayList, this.$info.f14012a)) {
                this.$addAppViewModel.b(this.$context, 2);
                return;
            }
            com.yuanqi.group.home.models.c a5 = this.$info.a();
            MutableIntState mutableIntState = this.$installNum;
            mutableIntState.setValue(mutableIntState.getValue().intValue() + 1);
            a5.f14017f = this.$installNum.getValue().intValue();
            SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList2 = this.$appShowList;
            int i5 = this.$index;
            l0.m(a5);
            snapshotStateList2.set(i5, a5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
        final /* synthetic */ int $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i5, AddAppViewModel addAppViewModel, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, int i6) {
            super(2);
            this.$index = i5;
            this.$addAppViewModel = addAppViewModel;
            this.$appShowList = snapshotStateList;
            this.$$changed = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            n.a(this.$index, this.$addAppViewModel, this.$appShowList, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,676:1\n154#2:677\n154#2:712\n69#3,5:678\n74#3:711\n78#3:717\n79#4,11:683\n92#4:716\n456#5,8:694\n464#5,3:708\n467#5,3:713\n3737#6,6:702\n81#7:718\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1\n*L\n434#1:677\n439#1:712\n432#1:678,5\n432#1:711\n432#1:717\n432#1:683,11\n432#1:716\n432#1:694,8\n432#1:708,3\n432#1:713,3\n432#1:702,6\n431#1:718\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class e extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
        final /* synthetic */ float $boxSize;
        final /* synthetic */ Context $context;
        final /* synthetic */ LazyGridState $gridState;
        final /* synthetic */ SnapshotStateList<Character> $indexList;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ s0 $scope;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AddAppViewModel addAppViewModel, NavHostController navHostController) {
                super(2);
                this.$addAppViewModel = addAppViewModel;
                this.$navController = navHostController;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@p4.m Composer composer, int i5) {
                if ((i5 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1572850097, i5, -1, "com.yuanqi.master.addapp.home.SelectAppScene.<anonymous>.<anonymous> (SelectAppScreen.kt:140)");
                }
                n.c(this.$addAppViewModel, this.$navController, composer, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,676:1\n766#2:677\n857#2,2:678\n154#3:680\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$2\n*L\n144#1:677\n144#1:678,2\n150#1:680\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class b extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;
            final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ s0 $scope;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a extends n0 implements v3.a<r2> {
                final /* synthetic */ AddAppViewModel $addAppViewModel;
                final /* synthetic */ NavHostController $navController;
                final /* synthetic */ s0 $scope;
                final /* synthetic */ ArrayList<com.yuanqi.group.home.models.c> $selectAppList;

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.home.SelectAppScreenKt$SelectAppScene$1$2$2$1", f = "SelectAppScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.addapp.home.n$e$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0303a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                    final /* synthetic */ AddAppViewModel $addAppViewModel;
                    final /* synthetic */ NavHostController $navController;
                    final /* synthetic */ ArrayList<com.yuanqi.group.home.models.c> $selectAppList;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.home.SelectAppScreenKt$SelectAppScene$1$2$2$1$1", f = "SelectAppScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.addapp.home.n$e$b$a$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0304a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                        final /* synthetic */ NavHostController $navController;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0304a(NavHostController navHostController, kotlin.coroutines.d<? super C0304a> dVar) {
                            super(2, dVar);
                            this.$navController = navHostController;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @p4.l
                        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                            return new C0304a(this.$navController, dVar);
                        }

                        @Override // v3.p
                        @p4.m
                        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                            return ((C0304a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @p4.m
                        public final Object invokeSuspend(@p4.l Object obj) {
                            kotlin.coroutines.intrinsics.d.l();
                            if (this.label == 0) {
                                e1.n(obj);
                                this.$navController.popBackStack();
                                return r2.f19517a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0303a(AddAppViewModel addAppViewModel, ArrayList<com.yuanqi.group.home.models.c> arrayList, NavHostController navHostController, kotlin.coroutines.d<? super C0303a> dVar) {
                        super(2, dVar);
                        this.$addAppViewModel = addAppViewModel;
                        this.$selectAppList = arrayList;
                        this.$navController = navHostController;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.l
                    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                        C0303a c0303a = new C0303a(this.$addAppViewModel, this.$selectAppList, this.$navController, dVar);
                        c0303a.L$0 = obj;
                        return c0303a;
                    }

                    @Override // v3.p
                    @p4.m
                    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                        return ((C0303a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.m
                    public final Object invokeSuspend(@p4.l Object obj) {
                        kotlin.coroutines.intrinsics.d.l();
                        if (this.label == 0) {
                            e1.n(obj);
                            s0 s0Var = (s0) this.L$0;
                            this.$addAppViewModel.K(this.$selectAppList);
                            kotlinx.coroutines.k.f(s0Var, k1.e(), null, new C0304a(this.$navController, null), 2, null);
                            return r2.f19517a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(ArrayList<com.yuanqi.group.home.models.c> arrayList, s0 s0Var, AddAppViewModel addAppViewModel, NavHostController navHostController) {
                    super(0);
                    this.$selectAppList = arrayList;
                    this.$scope = s0Var;
                    this.$addAppViewModel = addAppViewModel;
                    this.$navController = navHostController;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (this.$selectAppList.isEmpty()) {
                        return;
                    }
                    kotlinx.coroutines.k.f(this.$scope, k1.c(), null, new C0303a(this.$addAppViewModel, this.$selectAppList, this.$navController, null), 2, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.n$e$b$b, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0305b extends n0 implements q<RowScope, Composer, Integer, r2> {
                final /* synthetic */ long $textColor;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0305b(long j5) {
                    super(3);
                    this.$textColor = j5;
                }

                @Override // v3.q
                public /* bridge */ /* synthetic */ r2 invoke(RowScope rowScope, Composer composer, Integer num) {
                    invoke(rowScope, composer, num.intValue());
                    return r2.f19517a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@p4.l RowScope Button, @p4.m Composer composer, int i5) {
                    l0.p(Button, "$this$Button");
                    if ((i5 & 81) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(962941918, i5, -1, "com.yuanqi.master.addapp.home.SelectAppScene.<anonymous>.<anonymous>.<anonymous> (SelectAppScreen.kt:163)");
                    }
                    TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.confirm, composer, 6), (Modifier) null, this.$textColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 0, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, s0 s0Var, AddAppViewModel addAppViewModel, NavHostController navHostController) {
                super(2);
                this.$appShowList = snapshotStateList;
                this.$scope = s0Var;
                this.$addAppViewModel = addAppViewModel;
                this.$navController = navHostController;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@p4.m Composer composer, int i5) {
                if ((i5 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-479840818, i5, -1, "com.yuanqi.master.addapp.home.SelectAppScene.<anonymous>.<anonymous> (SelectAppScreen.kt:142)");
                }
                ArrayList arrayList = new ArrayList();
                SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList = this.$appShowList;
                ArrayList arrayList2 = new ArrayList();
                Iterator<com.yuanqi.group.home.models.c> it = snapshotStateList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.yuanqi.group.home.models.c next = it.next();
                    if (next.f14017f > 0) {
                        arrayList2.add(next);
                    }
                }
                arrayList.addAll(arrayList2);
                ButtonKt.Button(new a(arrayList, this.$scope, this.$addAppViewModel, this.$navController), PaddingKt.m557paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dp.m6044constructorimpl(17), 0.0f, 11, null), false, null, ButtonDefaults.INSTANCE.m1594buttonColorsro_MJ88(arrayList.isEmpty() ? com.yuanqi.master.theme.b.T() : com.yuanqi.master.theme.b.m(), 0L, 0L, 0L, composer, (ButtonDefaults.$stable | 0) << 12, 14), null, null, null, null, ComposableLambdaKt.composableLambda(composer, 962941918, true, new C0305b(arrayList.isEmpty() ? com.yuanqi.master.theme.b.i() : Color.Companion.m3771getWhite0d7_KjU())), composer, 805306416, 492);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c extends n0 implements q<PaddingValues, Composer, Integer, r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;
            final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
            final /* synthetic */ float $boxSize;
            final /* synthetic */ Context $context;
            final /* synthetic */ LazyGridState $gridState;
            final /* synthetic */ SnapshotStateList<Character> $indexList;
            final /* synthetic */ s0 $scope;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,676:1\n73#2,4:677\n77#2,20:688\n25#3:681\n955#4,6:682\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1\n*L\n168#1:677,4\n168#1:688,20\n168#1:681\n168#1:682,6\n*E\n"})
            /* loaded from: classes3.dex */
            public static final class a extends n0 implements q<BoxScope, Composer, Integer, r2> {
                final /* synthetic */ AddAppViewModel $addAppViewModel;
                final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
                final /* synthetic */ float $boxSize;
                final /* synthetic */ Context $context;
                final /* synthetic */ LazyGridState $gridState;
                final /* synthetic */ SnapshotStateList<Character> $indexList;
                final /* synthetic */ PaddingValues $it;
                final /* synthetic */ s0 $scope;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.addapp.home.n$e$c$a$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0306a extends n0 implements v3.a<r2> {
                    final /* synthetic */ Context $context;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0306a(Context context) {
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
                        a1.f15052a.a(this.$context);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.home.SelectAppScreenKt$SelectAppScene$1$3$1$1$11", f = "SelectAppScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes3.dex */
                public static final class b extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                    final /* synthetic */ AddAppViewModel $addAppViewModel;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.home.SelectAppScreenKt$SelectAppScene$1$3$1$1$11$1", f = "SelectAppScreen.kt", i = {}, l = {421}, m = "invokeSuspend", n = {}, s = {})
                    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.addapp.home.n$e$c$a$b$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0307a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                        final /* synthetic */ AddAppViewModel $addAppViewModel;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0307a(AddAppViewModel addAppViewModel, kotlin.coroutines.d<? super C0307a> dVar) {
                            super(2, dVar);
                            this.$addAppViewModel = addAppViewModel;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @p4.l
                        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                            return new C0307a(this.$addAppViewModel, dVar);
                        }

                        @Override // v3.p
                        @p4.m
                        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                            return ((C0307a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @p4.m
                        public final Object invokeSuspend(@p4.l Object obj) {
                            Object l5;
                            l5 = kotlin.coroutines.intrinsics.d.l();
                            int i5 = this.label;
                            if (i5 != 0) {
                                if (i5 == 1) {
                                    e1.n(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                e1.n(obj);
                                this.label = 1;
                                if (d1.b(1000L, this) == l5) {
                                    return l5;
                                }
                            }
                            this.$addAppViewModel.C().setValue("");
                            return r2.f19517a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(AddAppViewModel addAppViewModel, kotlin.coroutines.d<? super b> dVar) {
                        super(2, dVar);
                        this.$addAppViewModel = addAppViewModel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.l
                    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                        b bVar = new b(this.$addAppViewModel, dVar);
                        bVar.L$0 = obj;
                        return bVar;
                    }

                    @Override // v3.p
                    @p4.m
                    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                        return ((b) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.m
                    public final Object invokeSuspend(@p4.l Object obj) {
                        kotlin.coroutines.intrinsics.d.l();
                        if (this.label == 0) {
                            e1.n(obj);
                            kotlinx.coroutines.k.f((s0) this.L$0, k1.c(), null, new C0307a(this.$addAppViewModel, null), 2, null);
                            return r2.f19517a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.addapp.home.n$e$c$a$c, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0308c extends n0 implements v3.a<r2> {
                    final /* synthetic */ Context $context;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0308c(Context context) {
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
                        if (Build.VERSION.SDK_INT >= 30) {
                            RequestExternalStorageManagerActivity.request(VirtualCore.get().getContext(), false);
                            return;
                        }
                        AddAppActivity.a aVar = AddAppActivity.f14427e;
                        AddAppActivity a5 = aVar.a();
                        l0.m(a5);
                        if (!ActivityCompat.shouldShowRequestPermissionRationale(a5, "android.permission.READ_EXTERNAL_STORAGE")) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", this.$context.getPackageName(), null));
                            this.$context.startActivity(intent);
                        } else {
                            AddAppActivity a6 = aVar.a();
                            l0.m(a6);
                            ActivityCompat.requestPermissions(a6, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1024);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/constraintlayout/compose/ConstrainScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes3.dex */
                public static final class d extends n0 implements v3.l<ConstrainScope, r2> {
                    public static final d INSTANCE = new d();

                    d() {
                        super(1);
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(ConstrainScope constrainScope) {
                        invoke2(constrainScope);
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@p4.l ConstrainScope constrainAs) {
                        l0.p(constrainAs, "$this$constrainAs");
                        VerticalAnchorable.DefaultImpls.m6394linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                        VerticalAnchorable.DefaultImpls.m6394linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.addapp.home.n$e$c$a$e, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0309e extends n0 implements v3.l<LazyGridScope, r2> {
                    final /* synthetic */ AddAppViewModel $addAppViewModel;
                    final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.addapp.home.n$e$c$a$e$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0310a extends n0 implements r<LazyGridItemScope, Integer, Composer, Integer, r2> {
                        final /* synthetic */ AddAppViewModel $addAppViewModel;
                        final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0310a(AddAppViewModel addAppViewModel, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList) {
                            super(4);
                            this.$addAppViewModel = addAppViewModel;
                            this.$appShowList = snapshotStateList;
                        }

                        @Override // v3.r
                        public /* bridge */ /* synthetic */ r2 invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                            return r2.f19517a;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@p4.l LazyGridItemScope items, int i5, @p4.m Composer composer, int i6) {
                            l0.p(items, "$this$items");
                            if ((i6 & 112) == 0) {
                                i6 |= composer.changed(i5) ? 32 : 16;
                            }
                            if ((i6 & 721) == 144 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1795369011, i6, -1, "com.yuanqi.master.addapp.home.SelectAppScene.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelectAppScreen.kt:308)");
                            }
                            n.a(i5, this.$addAppViewModel, this.$appShowList, composer, ((i6 >> 3) & 14) | 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0309e(SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, AddAppViewModel addAppViewModel) {
                        super(1);
                        this.$appShowList = snapshotStateList;
                        this.$addAppViewModel = addAppViewModel;
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(LazyGridScope lazyGridScope) {
                        invoke2(lazyGridScope);
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@p4.l LazyGridScope LazyVerticalGrid) {
                        l0.p(LazyVerticalGrid, "$this$LazyVerticalGrid");
                        LazyGridScope.items$default(LazyVerticalGrid, this.$appShowList.size(), null, null, null, ComposableLambdaKt.composableLambdaInstance(-1795369011, true, new C0310a(this.$addAppViewModel, this.$appShowList)), 14, null);
                        LazyGridScope.item$default(LazyVerticalGrid, null, null, null, com.yuanqi.master.addapp.home.h.f14480a.c(), 7, null);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/constraintlayout/compose/ConstrainScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1$1$6\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,676:1\n154#2:677\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1$1$6\n*L\n327#1:677\n*E\n"})
                /* loaded from: classes3.dex */
                public static final class f extends n0 implements v3.l<ConstrainScope, r2> {
                    public static final f INSTANCE = new f();

                    f() {
                        super(1);
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(ConstrainScope constrainScope) {
                        invoke2(constrainScope);
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@p4.l ConstrainScope constrainAs) {
                        l0.p(constrainAs, "$this$constrainAs");
                        VerticalAnchorable.DefaultImpls.m6394linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), Dp.m6044constructorimpl(5), 0.0f, 4, null);
                        HorizontalAnchorable.DefaultImpls.m6355linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                        HorizontalAnchorable.DefaultImpls.m6355linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.home.SelectAppScreenKt$SelectAppScene$1$3$1$1$7", f = "SelectAppScreen.kt", i = {}, l = {332}, m = "invokeSuspend", n = {}, s = {})
                @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes3.dex */
                public static final class g extends o implements p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
                    final /* synthetic */ AddAppViewModel $addAppViewModel;
                    final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
                    final /* synthetic */ float $boxSize;
                    final /* synthetic */ LazyGridState $gridState;
                    final /* synthetic */ s0 $scope;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "change", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "<anonymous parameter 1>", "Landroidx/compose/ui/geometry/Offset;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1$1$7$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,676:1\n223#2,2:677\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1$1$7$1\n*L\n340#1:677,2\n*E\n"})
                    /* renamed from: com.yuanqi.master.addapp.home.n$e$c$a$g$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0311a extends n0 implements p<PointerInputChange, Offset, r2> {
                        final /* synthetic */ AddAppViewModel $addAppViewModel;
                        final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
                        final /* synthetic */ float $boxSize;
                        final /* synthetic */ LazyGridState $gridState;
                        final /* synthetic */ s0 $scope;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.home.SelectAppScreenKt$SelectAppScene$1$3$1$1$7$1$1", f = "SelectAppScreen.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
                        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.yuanqi.master.addapp.home.n$e$c$a$g$a$a, reason: collision with other inner class name */
                        /* loaded from: classes3.dex */
                        public static final class C0312a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                            final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
                            final /* synthetic */ LazyGridState $gridState;
                            final /* synthetic */ com.yuanqi.group.home.models.c $info;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C0312a(LazyGridState lazyGridState, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, com.yuanqi.group.home.models.c cVar, kotlin.coroutines.d<? super C0312a> dVar) {
                                super(2, dVar);
                                this.$gridState = lazyGridState;
                                this.$appShowList = snapshotStateList;
                                this.$info = cVar;
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @p4.l
                            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                                return new C0312a(this.$gridState, this.$appShowList, this.$info, dVar);
                            }

                            @Override // v3.p
                            @p4.m
                            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                                return ((C0312a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @p4.m
                            public final Object invokeSuspend(@p4.l Object obj) {
                                Object l5;
                                l5 = kotlin.coroutines.intrinsics.d.l();
                                int i5 = this.label;
                                if (i5 != 0) {
                                    if (i5 == 1) {
                                        e1.n(obj);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    e1.n(obj);
                                    LazyGridState lazyGridState = this.$gridState;
                                    int indexOf = this.$appShowList.indexOf(this.$info);
                                    this.label = 1;
                                    if (LazyGridState.scrollToItem$default(lazyGridState, indexOf, 0, this, 2, null) == l5) {
                                        return l5;
                                    }
                                }
                                return r2.f19517a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0311a(float f5, AddAppViewModel addAppViewModel, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, s0 s0Var, LazyGridState lazyGridState) {
                            super(2);
                            this.$boxSize = f5;
                            this.$addAppViewModel = addAppViewModel;
                            this.$appShowList = snapshotStateList;
                            this.$scope = s0Var;
                            this.$gridState = lazyGridState;
                        }

                        @Override // v3.p
                        public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange, Offset offset) {
                            m6436invokeUv8p0NA(pointerInputChange, offset.m3503unboximpl());
                            return r2.f19517a;
                        }

                        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                        public final void m6436invokeUv8p0NA(@p4.l PointerInputChange change, long j5) {
                            l0.p(change, "change");
                            float m3494getYimpl = Offset.m3494getYimpl(change.m4872getPositionF1C5BW0()) / this.$boxSize;
                            if (m3494getYimpl >= 0.0f && m3494getYimpl < this.$addAppViewModel.v().size()) {
                                this.$addAppViewModel.C().setValue(String.valueOf(this.$addAppViewModel.v().toList().get((int) m3494getYimpl).charValue()));
                                SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList = this.$appShowList;
                                AddAppViewModel addAppViewModel = this.$addAppViewModel;
                                for (com.yuanqi.group.home.models.c cVar : snapshotStateList) {
                                    if (l0.g(String.valueOf(cVar.f14021j), addAppViewModel.C().getValue())) {
                                        kotlinx.coroutines.k.f(this.$scope, null, null, new C0312a(this.$gridState, this.$appShowList, cVar, null), 3, null);
                                        return;
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    g(float f5, AddAppViewModel addAppViewModel, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, s0 s0Var, LazyGridState lazyGridState, kotlin.coroutines.d<? super g> dVar) {
                        super(2, dVar);
                        this.$boxSize = f5;
                        this.$addAppViewModel = addAppViewModel;
                        this.$appShowList = snapshotStateList;
                        this.$scope = s0Var;
                        this.$gridState = lazyGridState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.l
                    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                        g gVar = new g(this.$boxSize, this.$addAppViewModel, this.$appShowList, this.$scope, this.$gridState, dVar);
                        gVar.L$0 = obj;
                        return gVar;
                    }

                    @Override // v3.p
                    @p4.m
                    public final Object invoke(@p4.l PointerInputScope pointerInputScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                        return ((g) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.m
                    public final Object invokeSuspend(@p4.l Object obj) {
                        Object l5;
                        l5 = kotlin.coroutines.intrinsics.d.l();
                        int i5 = this.label;
                        if (i5 != 0) {
                            if (i5 == 1) {
                                e1.n(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            e1.n(obj);
                            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                            C0311a c0311a = new C0311a(this.$boxSize, this.$addAppViewModel, this.$appShowList, this.$scope, this.$gridState);
                            this.label = 1;
                            if (DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, null, null, c0311a, this, 7, null) == l5) {
                                return l5;
                            }
                        }
                        return r2.f19517a;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes3.dex */
                public static final class h extends n0 implements v3.l<LazyListScope, r2> {
                    final /* synthetic */ AddAppViewModel $addAppViewModel;
                    final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
                    final /* synthetic */ LazyGridState $gridState;
                    final /* synthetic */ SnapshotStateList<Character> $indexList;
                    final /* synthetic */ s0 $scope;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1$1$8$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,676:1\n154#2:677\n69#3,5:678\n74#3:711\n78#3:716\n79#4,11:683\n92#4:715\n456#5,8:694\n464#5,3:708\n467#5,3:712\n3737#6,6:702\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1$1$8$1\n*L\n361#1:677\n362#1:678,5\n362#1:711\n362#1:716\n362#1:683,11\n362#1:715\n362#1:694,8\n362#1:708,3\n362#1:712,3\n362#1:702,6\n*E\n"})
                    /* renamed from: com.yuanqi.master.addapp.home.n$e$c$a$h$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0313a extends n0 implements r<LazyItemScope, Integer, Composer, Integer, r2> {
                        final /* synthetic */ AddAppViewModel $addAppViewModel;
                        final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
                        final /* synthetic */ LazyGridState $gridState;
                        final /* synthetic */ SnapshotStateList<Character> $indexList;
                        final /* synthetic */ s0 $scope;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1$1$8$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,676:1\n223#2,2:677\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1$1$8$1$1\n*L\n372#1:677,2\n*E\n"})
                        /* renamed from: com.yuanqi.master.addapp.home.n$e$c$a$h$a$a, reason: collision with other inner class name */
                        /* loaded from: classes3.dex */
                        public static final class C0314a extends n0 implements v3.a<r2> {
                            final /* synthetic */ AddAppViewModel $addAppViewModel;
                            final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
                            final /* synthetic */ LazyGridState $gridState;
                            final /* synthetic */ SnapshotStateList<Character> $indexList;
                            final /* synthetic */ int $it;
                            final /* synthetic */ s0 $scope;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.home.SelectAppScreenKt$SelectAppScene$1$3$1$1$8$1$1$1", f = "SelectAppScreen.kt", i = {}, l = {376}, m = "invokeSuspend", n = {}, s = {})
                            @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                            /* renamed from: com.yuanqi.master.addapp.home.n$e$c$a$h$a$a$a, reason: collision with other inner class name */
                            /* loaded from: classes3.dex */
                            public static final class C0315a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                                final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
                                final /* synthetic */ LazyGridState $gridState;
                                final /* synthetic */ com.yuanqi.group.home.models.c $info;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C0315a(LazyGridState lazyGridState, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, com.yuanqi.group.home.models.c cVar, kotlin.coroutines.d<? super C0315a> dVar) {
                                    super(2, dVar);
                                    this.$gridState = lazyGridState;
                                    this.$appShowList = snapshotStateList;
                                    this.$info = cVar;
                                }

                                @Override // kotlin.coroutines.jvm.internal.a
                                @p4.l
                                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                                    return new C0315a(this.$gridState, this.$appShowList, this.$info, dVar);
                                }

                                @Override // v3.p
                                @p4.m
                                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                                    return ((C0315a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.a
                                @p4.m
                                public final Object invokeSuspend(@p4.l Object obj) {
                                    Object l5;
                                    l5 = kotlin.coroutines.intrinsics.d.l();
                                    int i5 = this.label;
                                    if (i5 != 0) {
                                        if (i5 == 1) {
                                            e1.n(obj);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        e1.n(obj);
                                        LazyGridState lazyGridState = this.$gridState;
                                        int indexOf = this.$appShowList.indexOf(this.$info);
                                        this.label = 1;
                                        if (LazyGridState.animateScrollToItem$default(lazyGridState, indexOf, 0, this, 2, null) == l5) {
                                            return l5;
                                        }
                                    }
                                    return r2.f19517a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C0314a(AddAppViewModel addAppViewModel, SnapshotStateList<Character> snapshotStateList, int i5, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList2, s0 s0Var, LazyGridState lazyGridState) {
                                super(0);
                                this.$addAppViewModel = addAppViewModel;
                                this.$indexList = snapshotStateList;
                                this.$it = i5;
                                this.$appShowList = snapshotStateList2;
                                this.$scope = s0Var;
                                this.$gridState = lazyGridState;
                            }

                            @Override // v3.a
                            public /* bridge */ /* synthetic */ r2 invoke() {
                                invoke2();
                                return r2.f19517a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                this.$addAppViewModel.C().setValue(String.valueOf(this.$indexList.get(this.$it).charValue()));
                                SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList = this.$appShowList;
                                AddAppViewModel addAppViewModel = this.$addAppViewModel;
                                for (com.yuanqi.group.home.models.c cVar : snapshotStateList) {
                                    if (l0.g(String.valueOf(cVar.f14021j), addAppViewModel.C().getValue())) {
                                        kotlinx.coroutines.k.f(this.$scope, null, null, new C0315a(this.$gridState, this.$appShowList, cVar, null), 3, null);
                                        return;
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0313a(SnapshotStateList<Character> snapshotStateList, AddAppViewModel addAppViewModel, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList2, s0 s0Var, LazyGridState lazyGridState) {
                            super(4);
                            this.$indexList = snapshotStateList;
                            this.$addAppViewModel = addAppViewModel;
                            this.$appShowList = snapshotStateList2;
                            this.$scope = s0Var;
                            this.$gridState = lazyGridState;
                        }

                        @Override // v3.r
                        public /* bridge */ /* synthetic */ r2 invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                            return r2.f19517a;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@p4.l LazyItemScope items, int i5, @p4.m Composer composer, int i6) {
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
                                ComposerKt.traceEventStart(-428209245, i6, -1, "com.yuanqi.master.addapp.home.SelectAppScene.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelectAppScreen.kt:355)");
                            }
                            boolean g5 = l0.g(String.valueOf(this.$indexList.get(i5).charValue()), this.$addAppViewModel.C().getValue());
                            Color.Companion companion = Color.Companion;
                            long m3771getWhite0d7_KjU = g5 ? companion.m3771getWhite0d7_KjU() : companion.m3760getBlack0d7_KjU();
                            long m5 = g5 ? com.yuanqi.master.theme.b.m() : Color.Companion.m3771getWhite0d7_KjU();
                            float m6044constructorimpl = Dp.m6044constructorimpl(24);
                            Alignment center = Alignment.Companion.getCenter();
                            Modifier m235clickableXHw0xAI$default = ClickableKt.m235clickableXHw0xAI$default(BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(SizeKt.m607width3ABfNKs(SizeKt.m588height3ABfNKs(Modifier.Companion, m6044constructorimpl), m6044constructorimpl), RoundedCornerShapeKt.getCircleShape()), m5, null, 2, null), false, null, null, new C0314a(this.$addAppViewModel, this.$indexList, i5, this.$appShowList, this.$scope, this.$gridState), 7, null);
                            SnapshotStateList<Character> snapshotStateList = this.$indexList;
                            composer.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                            composer.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            v3.a<ComposeUiNode> constructor = companion2.getConstructor();
                            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m235clickableXHw0xAI$default);
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
                            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                            composer.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            TextKt.m2452Text4IGK_g(String.valueOf(snapshotStateList.get(i5).charValue()), (Modifier) null, m3771getWhite0d7_KjU, TextUnitKt.m6247TextUnitanM5pPY(15.0f, TextUnitType.Companion.m6268getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 0, 0, 130546);
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
                    h(SnapshotStateList<Character> snapshotStateList, AddAppViewModel addAppViewModel, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList2, s0 s0Var, LazyGridState lazyGridState) {
                        super(1);
                        this.$indexList = snapshotStateList;
                        this.$addAppViewModel = addAppViewModel;
                        this.$appShowList = snapshotStateList2;
                        this.$scope = s0Var;
                        this.$gridState = lazyGridState;
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(LazyListScope lazyListScope) {
                        invoke2(lazyListScope);
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@p4.l LazyListScope LazyColumn) {
                        l0.p(LazyColumn, "$this$LazyColumn");
                        LazyListScope.items$default(LazyColumn, this.$indexList.size(), null, null, ComposableLambdaKt.composableLambdaInstance(-428209245, true, new C0313a(this.$indexList, this.$addAppViewModel, this.$appShowList, this.$scope, this.$gridState)), 6, null);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/constraintlayout/compose/ConstrainScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1$1$9$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,676:1\n154#2:677\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1$1$9$1\n*L\n410#1:677\n*E\n"})
                /* loaded from: classes3.dex */
                public static final class i extends n0 implements v3.l<ConstrainScope, r2> {
                    final /* synthetic */ ConstrainedLayoutReference $column;
                    final /* synthetic */ float $marginTop;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    i(ConstrainedLayoutReference constrainedLayoutReference, float f5) {
                        super(1);
                        this.$column = constrainedLayoutReference;
                        this.$marginTop = f5;
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(ConstrainScope constrainScope) {
                        invoke2(constrainScope);
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@p4.l ConstrainScope constrainAs) {
                        l0.p(constrainAs, "$this$constrainAs");
                        HorizontalAnchorable.DefaultImpls.m6355linkToVpY3zN4$default(constrainAs.getTop(), this.$column.getTop(), this.$marginTop, 0.0f, 4, null);
                        VerticalAnchorable.DefaultImpls.m6394linkToVpY3zN4$default(constrainAs.getEnd(), this.$column.getStart(), Dp.m6044constructorimpl(10), 0.0f, 4, null);
                    }
                }

                @i0(k = 3, mv = {1, 9, 0}, xi = 48)
                @r1({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$1\n*L\n1#1,1524:1\n*E\n"})
                /* loaded from: classes3.dex */
                public static final class j extends n0 implements v3.l<SemanticsPropertyReceiver, r2> {
                    final /* synthetic */ Measurer $measurer;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public j(Measurer measurer) {
                        super(1);
                        this.$measurer = measurer;
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@p4.l SemanticsPropertyReceiver semantics) {
                        l0.p(semantics, "$this$semantics");
                        ToolingUtilsKt.setDesignInfoProvider(semantics, this.$measurer);
                    }
                }

                @i0(k = 3, mv = {1, 9, 0}, xi = 48)
                @r1({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$2\n+ 2 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1524:1\n172#2,6:1525\n180#2,2:1565\n179#2:1567\n184#2,4:1604\n183#2,7:1608\n190#2,2:1616\n202#2:1618\n203#2:1624\n205#2,5:1630\n212#2,2:1669\n211#2:1671\n216#2,4:1708\n215#2,7:1712\n222#2,2:1720\n261#2:1722\n262#2:1728\n263#2,5:1734\n275#2,4:1773\n274#2,7:1777\n283#2:1789\n296#2,5:1790\n295#2:1796\n294#2:1797\n322#2,10:1798\n397#2,5:1808\n402#2,7:1814\n413#2,4:1866\n412#2,7:1870\n419#2,9:1882\n69#3,5:1531\n74#3:1564\n78#3:1629\n69#3,5:1635\n74#3:1668\n78#3:1733\n69#3,5:1739\n74#3:1772\n78#3:1788\n69#3,5:1832\n74#3:1865\n78#3:1881\n79#4,11:1536\n79#4,11:1575\n92#4:1622\n92#4:1628\n79#4,11:1640\n79#4,11:1679\n92#4:1726\n92#4:1732\n79#4,11:1744\n92#4:1787\n79#4,11:1837\n92#4:1880\n456#5,8:1547\n464#5,3:1561\n456#5,8:1586\n464#5,3:1600\n467#5,3:1619\n467#5,3:1625\n456#5,8:1651\n464#5,3:1665\n456#5,8:1690\n464#5,3:1704\n467#5,3:1723\n467#5,3:1729\n456#5,8:1755\n464#5,3:1769\n467#5,3:1784\n50#5:1824\n49#5:1825\n456#5,8:1848\n464#5,3:1862\n467#5,3:1877\n3737#6,6:1555\n3737#6,6:1594\n3737#6,6:1659\n3737#6,6:1698\n3737#6,6:1763\n3737#6,6:1856\n73#7,7:1568\n80#7:1603\n84#7:1623\n73#7,7:1672\n80#7:1707\n84#7:1727\n154#8:1615\n154#8:1719\n154#8:1795\n154#8:1813\n154#8:1821\n154#8:1822\n154#8:1823\n1116#9,6:1826\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppScene$1$3$1\n*L\n175#1:1531,5\n175#1:1564\n175#1:1629\n207#1:1635,5\n207#1:1668\n207#1:1733\n265#1:1739,5\n265#1:1772\n265#1:1788\n402#1:1832,5\n402#1:1865\n402#1:1881\n175#1:1536,11\n179#1:1575,11\n179#1:1622\n175#1:1628\n207#1:1640,11\n211#1:1679,11\n211#1:1726\n207#1:1732\n265#1:1744,11\n265#1:1787\n402#1:1837,11\n402#1:1880\n175#1:1547,8\n175#1:1561,3\n179#1:1586,8\n179#1:1600,3\n179#1:1619,3\n175#1:1625,3\n207#1:1651,8\n207#1:1665,3\n211#1:1690,8\n211#1:1704,3\n211#1:1723,3\n207#1:1729,3\n265#1:1755,8\n265#1:1769,3\n265#1:1784,3\n408#1:1824\n408#1:1825\n402#1:1848,8\n402#1:1862,3\n402#1:1877,3\n175#1:1555,6\n179#1:1594,6\n207#1:1659,6\n211#1:1698,6\n265#1:1763,6\n402#1:1856,6\n179#1:1568,7\n179#1:1603\n179#1:1623\n211#1:1672,7\n211#1:1707\n211#1:1727\n189#1:1615\n221#1:1719\n299#1:1795\n401#1:1813\n404#1:1821\n405#1:1822\n406#1:1823\n408#1:1826,6\n*E\n"})
                /* loaded from: classes3.dex */
                public static final class k extends n0 implements p<Composer, Integer, r2> {
                    final /* synthetic */ int $$changed;
                    final /* synthetic */ AddAppViewModel $addAppViewModel$inlined;
                    final /* synthetic */ SnapshotStateList $appShowList$inlined;
                    final /* synthetic */ float $boxSize$inlined;
                    final /* synthetic */ Context $context$inlined;
                    final /* synthetic */ LazyGridState $gridState$inlined;
                    final /* synthetic */ SnapshotStateList $indexList$inlined;
                    final /* synthetic */ v3.a $onHelpersChanged;
                    final /* synthetic */ ConstraintLayoutScope $scope;
                    final /* synthetic */ s0 $scope$inlined;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public k(ConstraintLayoutScope constraintLayoutScope, int i5, v3.a aVar, SnapshotStateList snapshotStateList, AddAppViewModel addAppViewModel, LazyGridState lazyGridState, Context context, float f5, s0 s0Var, SnapshotStateList snapshotStateList2) {
                        super(2);
                        this.$scope = constraintLayoutScope;
                        this.$onHelpersChanged = aVar;
                        this.$appShowList$inlined = snapshotStateList;
                        this.$addAppViewModel$inlined = addAppViewModel;
                        this.$gridState$inlined = lazyGridState;
                        this.$context$inlined = context;
                        this.$boxSize$inlined = f5;
                        this.$scope$inlined = s0Var;
                        this.$indexList$inlined = snapshotStateList2;
                        this.$$changed = i5;
                    }

                    @Override // v3.p
                    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return r2.f19517a;
                    }

                    /* JADX WARN: Type inference failed for: r14v16 */
                    /* JADX WARN: Type inference failed for: r14v7 */
                    /* JADX WARN: Type inference failed for: r14v8, types: [boolean, int] */
                    @Composable
                    public final void invoke(@p4.m Composer composer, int i5) {
                        int i6;
                        ConstrainedLayoutReference constrainedLayoutReference;
                        ConstrainedLayoutReference constrainedLayoutReference2;
                        Composer composer2;
                        k kVar;
                        ConstraintLayoutScope constraintLayoutScope;
                        ConstrainedLayoutReference constrainedLayoutReference3;
                        k kVar2;
                        char S6;
                        ConstraintLayoutScope constraintLayoutScope2;
                        Composer composer3;
                        ?? r14;
                        if (((i5 & 11) ^ 2) == 0 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        int helpersHashCode = this.$scope.getHelpersHashCode();
                        this.$scope.reset();
                        ConstraintLayoutScope constraintLayoutScope3 = this.$scope;
                        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope3.createRefs();
                        ConstrainedLayoutReference component1 = createRefs.component1();
                        ConstrainedLayoutReference component2 = createRefs.component2();
                        ConstrainedLayoutReference component3 = createRefs.component3();
                        if (this.$appShowList$inlined.isEmpty()) {
                            composer.startReplaceableGroup(-1270180180);
                            composer.startReplaceableGroup(-1270180154);
                            if (this.$addAppViewModel$inlined.u() || this.$addAppViewModel$inlined.B().getValue().booleanValue()) {
                                i6 = helpersHashCode;
                                constrainedLayoutReference = component3;
                                constraintLayoutScope2 = constraintLayoutScope3;
                                constrainedLayoutReference2 = component2;
                                composer3 = composer;
                                r14 = 0;
                            } else {
                                Modifier.Companion companion = Modifier.Companion;
                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                Alignment.Companion companion2 = Alignment.Companion;
                                Alignment center = companion2.getCenter();
                                composer.startReplaceableGroup(733328855);
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
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
                                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                composer.startReplaceableGroup(-483455358);
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center2, centerHorizontally, composer, 54);
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
                                constrainedLayoutReference = component3;
                                constrainedLayoutReference2 = component2;
                                constraintLayoutScope2 = constraintLayoutScope3;
                                i6 = helpersHashCode;
                                TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.no_app_query_permissions, composer, 6), (Modifier) null, com.yuanqi.master.theme.b.N(), TextUnitKt.getSp(24), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3456, 0, 130546);
                                composer3 = composer;
                                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(20)), composer3, 6);
                                r14 = 0;
                                ButtonKt.Button(new C0306a(this.$context$inlined), null, false, null, ButtonDefaults.INSTANCE.m1594buttonColorsro_MJ88(Color.Companion.m3771getWhite0d7_KjU(), 0L, 0L, 0L, composer, ((ButtonDefaults.$stable | 0) << 12) | 6, 14), null, null, null, null, com.yuanqi.master.addapp.home.h.f14480a.a(), composer, 805306368, 494);
                                composer.endReplaceableGroup();
                                composer.endNode();
                                composer.endReplaceableGroup();
                                composer.endReplaceableGroup();
                                composer.endReplaceableGroup();
                                composer.endNode();
                                composer.endReplaceableGroup();
                                composer.endReplaceableGroup();
                            }
                            composer.endReplaceableGroup();
                            if (this.$addAppViewModel$inlined.B().getValue().booleanValue()) {
                                if (!this.$addAppViewModel$inlined.s()) {
                                    composer3.startReplaceableGroup(-1270178249);
                                    Modifier.Companion companion4 = Modifier.Companion;
                                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                                    Alignment.Companion companion5 = Alignment.Companion;
                                    Alignment center3 = companion5.getCenter();
                                    composer3.startReplaceableGroup(733328855);
                                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center3, r14, composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, r14);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                                    v3.a<ComposeUiNode> constructor3 = companion6.getConstructor();
                                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(fillMaxSize$default2);
                                    if (!(composer.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer.useNode();
                                    }
                                    Composer m3264constructorimpl3 = Updater.m3264constructorimpl(composer);
                                    Updater.m3271setimpl(m3264constructorimpl3, rememberBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                                    Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                                    p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                                    if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer3, Integer.valueOf((int) r14));
                                    composer3.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    Arrangement.HorizontalOrVertical center4 = Arrangement.INSTANCE.getCenter();
                                    Alignment.Horizontal centerHorizontally2 = companion5.getCenterHorizontally();
                                    composer3.startReplaceableGroup(-483455358);
                                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center4, centerHorizontally2, composer3, 54);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, r14);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                                    v3.a<ComposeUiNode> constructor4 = companion6.getConstructor();
                                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion4);
                                    if (!(composer.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer3.createNode(constructor4);
                                    } else {
                                        composer.useNode();
                                    }
                                    Composer m3264constructorimpl4 = Updater.m3264constructorimpl(composer);
                                    Updater.m3271setimpl(m3264constructorimpl4, columnMeasurePolicy2, companion6.getSetMeasurePolicy());
                                    Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                                    p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                                    if (m3264constructorimpl4.getInserting() || !l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer3, Integer.valueOf((int) r14));
                                    composer3.startReplaceableGroup(2058660585);
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.no_file_access_permissions, composer3, 6), (Modifier) null, com.yuanqi.master.theme.b.N(), TextUnitKt.getSp(24), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3456, 0, 130546);
                                    composer3 = composer;
                                    SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion4, Dp.m6044constructorimpl(20)), composer3, 6);
                                    ButtonKt.Button(new C0308c(this.$context$inlined), null, false, null, ButtonDefaults.INSTANCE.m1594buttonColorsro_MJ88(Color.Companion.m3771getWhite0d7_KjU(), 0L, 0L, 0L, composer, ((ButtonDefaults.$stable | 0) << 12) | 6, 14), null, null, null, null, com.yuanqi.master.addapp.home.h.f14480a.b(), composer, 805306368, 494);
                                    composer.endReplaceableGroup();
                                    composer.endNode();
                                    composer.endReplaceableGroup();
                                    composer.endReplaceableGroup();
                                    composer.endReplaceableGroup();
                                    composer.endNode();
                                    composer.endReplaceableGroup();
                                    composer.endReplaceableGroup();
                                    composer.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-1270174558);
                                    Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                                    Alignment center5 = Alignment.Companion.getCenter();
                                    composer3.startReplaceableGroup(733328855);
                                    MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center5, r14, composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, r14);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                                    v3.a<ComposeUiNode> constructor5 = companion7.getConstructor();
                                    q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(fillMaxSize$default3);
                                    if (!(composer.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer3.createNode(constructor5);
                                    } else {
                                        composer.useNode();
                                    }
                                    Composer m3264constructorimpl5 = Updater.m3264constructorimpl(composer);
                                    Updater.m3271setimpl(m3264constructorimpl5, rememberBoxMeasurePolicy3, companion7.getSetMeasurePolicy());
                                    Updater.m3271setimpl(m3264constructorimpl5, currentCompositionLocalMap5, companion7.getSetResolvedCompositionLocals());
                                    p<ComposeUiNode, Integer, r2> setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
                                    if (m3264constructorimpl5.getInserting() || !l0.g(m3264constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        m3264constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        m3264constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    modifierMaterializerOf5.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer3, Integer.valueOf((int) r14));
                                    composer3.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                    composer2 = composer3;
                                    TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.no_apk_file, composer3, 6), (Modifier) null, com.yuanqi.master.theme.b.N(), TextUnitKt.getSp(24), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3456, 0, 130546);
                                    composer.endReplaceableGroup();
                                    composer.endNode();
                                    composer.endReplaceableGroup();
                                    composer.endReplaceableGroup();
                                    composer.endReplaceableGroup();
                                    composer.endReplaceableGroup();
                                    kVar = this;
                                    constraintLayoutScope = constraintLayoutScope2;
                                }
                            }
                            composer2 = composer3;
                            composer.endReplaceableGroup();
                            kVar = this;
                            constraintLayoutScope = constraintLayoutScope2;
                        } else {
                            i6 = helpersHashCode;
                            constrainedLayoutReference = component3;
                            constrainedLayoutReference2 = component2;
                            composer2 = composer;
                            composer2.startReplaceableGroup(-1270173609);
                            kVar = this;
                            constraintLayoutScope = constraintLayoutScope3;
                            LazyGridDslKt.LazyVerticalGrid(new GridCells.Fixed(4), constraintLayoutScope3.constrainAs(PaddingKt.m557paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m6044constructorimpl(8), 0.0f, Dp.m6044constructorimpl(32), 0.0f, 10, null), component1, d.INSTANCE), this.$gridState$inlined, null, false, null, null, null, false, new C0309e(this.$appShowList$inlined, this.$addAppViewModel$inlined), composer, 384, 504);
                            composer.endReplaceableGroup();
                        }
                        composer2.startReplaceableGroup(-1270171924);
                        if (kVar.$addAppViewModel$inlined.B().getValue().booleanValue()) {
                            constrainedLayoutReference3 = constrainedLayoutReference2;
                        } else {
                            constrainedLayoutReference3 = constrainedLayoutReference2;
                            LazyDslKt.LazyColumn(SuspendingPointerInputFilterKt.pointerInput(constraintLayoutScope.constrainAs(Modifier.Companion, constrainedLayoutReference3, f.INSTANCE), r2.f19517a, new g(kVar.$boxSize$inlined, kVar.$addAppViewModel$inlined, kVar.$appShowList$inlined, kVar.$scope$inlined, kVar.$gridState$inlined, null)), null, null, false, null, Alignment.Companion.getCenterHorizontally(), null, false, new h(kVar.$indexList$inlined, kVar.$addAppViewModel$inlined, kVar.$appShowList$inlined, kVar.$scope$inlined, kVar.$gridState$inlined), composer, 12779520, 94);
                        }
                        composer.endReplaceableGroup();
                        composer2.startReplaceableGroup(2013946740);
                        if (kVar.$addAppViewModel$inlined.C().getValue().length() > 0) {
                            List<Character> list = kVar.$addAppViewModel$inlined.v().toList();
                            S6 = h0.S6(kVar.$addAppViewModel$inlined.C().getValue());
                            Log.d(com.yuanqi.master.config.c.f14519a, String.valueOf(list.indexOf(Character.valueOf(S6))));
                            float m6044constructorimpl = Dp.m6044constructorimpl((r1 * 24) - 20);
                            Alignment center6 = Alignment.Companion.getCenter();
                            Modifier m201backgroundbw27NRU$default = BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(SizeKt.m588height3ABfNKs(SizeKt.m607width3ABfNKs(Modifier.Companion, Dp.m6044constructorimpl(80)), Dp.m6044constructorimpl(60)), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(5))), com.yuanqi.master.theme.b.v(), null, 2, null);
                            Dp m6042boximpl = Dp.m6042boximpl(m6044constructorimpl);
                            composer2.startReplaceableGroup(511388516);
                            boolean changed = composer2.changed(m6042boximpl) | composer2.changed(constrainedLayoutReference3);
                            Object rememberedValue = composer.rememberedValue();
                            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new i(constrainedLayoutReference3, m6044constructorimpl);
                                composer2.updateRememberedValue(rememberedValue);
                            }
                            composer.endReplaceableGroup();
                            Modifier constrainAs = constraintLayoutScope.constrainAs(m201backgroundbw27NRU$default, constrainedLayoutReference, (v3.l) rememberedValue);
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center6, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                            v3.a<ComposeUiNode> constructor6 = companion8.getConstructor();
                            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(constrainAs);
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer2.createNode(constructor6);
                            } else {
                                composer.useNode();
                            }
                            Composer m3264constructorimpl6 = Updater.m3264constructorimpl(composer);
                            Updater.m3271setimpl(m3264constructorimpl6, rememberBoxMeasurePolicy4, companion8.getSetMeasurePolicy());
                            Updater.m3271setimpl(m3264constructorimpl6, currentCompositionLocalMap6, companion8.getSetResolvedCompositionLocals());
                            p<ComposeUiNode, Integer, r2> setCompositeKeyHash6 = companion8.getSetCompositeKeyHash();
                            if (m3264constructorimpl6.getInserting() || !l0.g(m3264constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                m3264constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                m3264constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                            }
                            modifierMaterializerOf6.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                            TextKt.m2452Text4IGK_g(kVar.$addAppViewModel$inlined.C().getValue(), (Modifier) null, com.yuanqi.master.theme.b.o(), TextUnitKt.m6247TextUnitanM5pPY(25.0f, TextUnitType.Companion.m6268getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 384, 0, 130546);
                            composer.endReplaceableGroup();
                            composer.endNode();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                            kVar2 = this;
                            EffectsKt.LaunchedEffect(kVar2.$addAppViewModel$inlined.C().getValue(), new b(kVar2.$addAppViewModel$inlined, null), composer2, 64);
                        } else {
                            kVar2 = kVar;
                        }
                        composer.endReplaceableGroup();
                        if (kVar2.$scope.getHelpersHashCode() != i6) {
                            kVar2.$onHelpersChanged.invoke();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(PaddingValues paddingValues, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, AddAppViewModel addAppViewModel, LazyGridState lazyGridState, Context context, float f5, s0 s0Var, SnapshotStateList<Character> snapshotStateList2) {
                    super(3);
                    this.$it = paddingValues;
                    this.$appShowList = snapshotStateList;
                    this.$addAppViewModel = addAppViewModel;
                    this.$gridState = lazyGridState;
                    this.$context = context;
                    this.$boxSize = f5;
                    this.$scope = s0Var;
                    this.$indexList = snapshotStateList2;
                }

                @Override // v3.q
                public /* bridge */ /* synthetic */ r2 invoke(BoxScope boxScope, Composer composer, Integer num) {
                    invoke(boxScope, composer, num.intValue());
                    return r2.f19517a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@p4.l BoxScope GradientBox, @p4.m Composer composer, int i5) {
                    l0.p(GradientBox, "$this$GradientBox");
                    if ((i5 & 81) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-216719265, i5, -1, "com.yuanqi.master.addapp.home.SelectAppScene.<anonymous>.<anonymous>.<anonymous> (SelectAppScreen.kt:167)");
                    }
                    Modifier padding = PaddingKt.padding(Modifier.Companion, this.$it);
                    SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList = this.$appShowList;
                    AddAppViewModel addAppViewModel = this.$addAppViewModel;
                    LazyGridState lazyGridState = this.$gridState;
                    Context context = this.$context;
                    float f5 = this.$boxSize;
                    s0 s0Var = this.$scope;
                    SnapshotStateList<Character> snapshotStateList2 = this.$indexList;
                    composer.startReplaceableGroup(-270267587);
                    composer.startReplaceableGroup(-3687241);
                    Object rememberedValue = composer.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = new Measurer();
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    Measurer measurer = (Measurer) rememberedValue;
                    composer.startReplaceableGroup(-3687241);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new ConstraintLayoutScope();
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue2;
                    composer.startReplaceableGroup(-3687241);
                    Object rememberedValue3 = composer.rememberedValue();
                    if (rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer.updateRememberedValue(rememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    u0<MeasurePolicy, v3.a<r2>> rememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) rememberedValue3, measurer, composer, 4544);
                    LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(padding, false, new j(measurer), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new k(constraintLayoutScope, 0, rememberConstraintLayoutMeasurePolicy.component2(), snapshotStateList, addAppViewModel, lazyGridState, context, f5, s0Var, snapshotStateList2)), rememberConstraintLayoutMeasurePolicy.component1(), composer, 48, 0);
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, AddAppViewModel addAppViewModel, LazyGridState lazyGridState, Context context, float f5, s0 s0Var, SnapshotStateList<Character> snapshotStateList2) {
                super(3);
                this.$appShowList = snapshotStateList;
                this.$addAppViewModel = addAppViewModel;
                this.$gridState = lazyGridState;
                this.$context = context;
                this.$boxSize = f5;
                this.$scope = s0Var;
                this.$indexList = snapshotStateList2;
            }

            @Override // v3.q
            public /* bridge */ /* synthetic */ r2 invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                invoke(paddingValues, composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@p4.l PaddingValues it, @p4.m Composer composer, int i5) {
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
                    ComposerKt.traceEventStart(219874310, i5, -1, "com.yuanqi.master.addapp.home.SelectAppScene.<anonymous>.<anonymous> (SelectAppScreen.kt:166)");
                }
                com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, -216719265, true, new a(it, this.$appShowList, this.$addAppViewModel, this.$gridState, this.$context, this.$boxSize, this.$scope, this.$indexList)), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AddAppViewModel addAppViewModel, NavHostController navHostController, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, s0 s0Var, LazyGridState lazyGridState, Context context, float f5, SnapshotStateList<Character> snapshotStateList2) {
            super(2);
            this.$addAppViewModel = addAppViewModel;
            this.$navController = navHostController;
            this.$appShowList = snapshotStateList;
            this.$scope = s0Var;
            this.$gridState = lazyGridState;
            this.$context = context;
            this.$boxSize = f5;
            this.$indexList = snapshotStateList2;
        }

        private static final com.airbnb.lottie.k invoke$lambda$0(LottieCompositionResult lottieCompositionResult) {
            return lottieCompositionResult.getValue();
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1867187979, i5, -1, "com.yuanqi.master.addapp.home.SelectAppScene.<anonymous> (SelectAppScreen.kt:139)");
            }
            ScaffoldKt.m2107ScaffoldTvnljyQ(null, ComposableLambdaKt.composableLambda(composer, 1572850097, true, new a(this.$addAppViewModel, this.$navController)), null, null, ComposableLambdaKt.composableLambda(composer, -479840818, true, new b(this.$appShowList, this.$scope, this.$addAppViewModel, this.$navController)), 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(composer, 219874310, true, new c(this.$appShowList, this.$addAppViewModel, this.$gridState, this.$context, this.$boxSize, this.$scope, this.$indexList)), composer, 805330992, 493);
            if (this.$addAppViewModel.E().getValue().booleanValue()) {
                LottieCompositionResult v4 = com.airbnb.lottie.compose.r.v(i.e.a(i.e.b(R.raw.waiting)), null, null, null, null, null, composer, 6, 62);
                Modifier.Companion companion = Modifier.Companion;
                Modifier m201backgroundbw27NRU$default = BackgroundKt.m201backgroundbw27NRU$default(SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(200)), com.yuanqi.master.theme.b.g(), null, 2, null);
                Alignment center = Alignment.Companion.getCenter();
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                v3.a<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                com.airbnb.lottie.compose.d.b(invoke$lambda$0(v4), SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(100)), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, null, composer, 56, 0, 1048572);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(AddAppViewModel addAppViewModel, NavHostController navHostController, int i5, int i6) {
            super(2);
            this.$addAppViewModel = addAppViewModel;
            this.$navController = navHostController;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            n.b(this.$addAppViewModel, this.$navController, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppTitle$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,676:1\n86#2,7:677\n93#2:712\n97#2:799\n79#3,11:684\n79#3,11:720\n92#3:752\n79#3,11:761\n92#3:793\n92#3:798\n456#4,8:695\n464#4,3:709\n456#4,8:731\n464#4,3:745\n467#4,3:749\n456#4,8:772\n464#4,3:786\n467#4,3:790\n467#4,3:795\n3737#5,6:703\n3737#5,6:739\n3737#5,6:780\n154#6:713\n154#6:714\n154#6:754\n154#6:755\n69#7,5:715\n74#7:748\n78#7:753\n69#7,5:756\n74#7:789\n78#7:794\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppTitle$1\n*L\n453#1:677,7\n453#1:712\n453#1:799\n453#1:684,11\n455#1:720,11\n455#1:752\n479#1:761,11\n479#1:793\n453#1:798\n453#1:695,8\n453#1:709,3\n455#1:731,8\n455#1:745,3\n455#1:749,3\n479#1:772,8\n479#1:786,3\n479#1:790,3\n453#1:795,3\n453#1:703,6\n455#1:739,6\n479#1:780,6\n457#1:713\n458#1:714\n481#1:754\n482#1:755\n455#1:715,5\n455#1:748\n455#1:753\n479#1:756,5\n479#1:789\n479#1:794\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class g extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ AddAppViewModel $addAppViewModel;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements v3.a<r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AddAppViewModel addAppViewModel) {
                super(0);
                this.$addAppViewModel = addAppViewModel;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$addAppViewModel.B().setValue(Boolean.FALSE);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppTitle$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,676:1\n154#2:677\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppTitle$1$1$2\n*L\n466#1:677\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class b extends n0 implements v3.l<ContentDrawScope, r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AddAppViewModel addAppViewModel) {
                super(1);
                this.$addAppViewModel = addAppViewModel;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@p4.l ContentDrawScope drawWithContent) {
                l0.p(drawWithContent, "$this$drawWithContent");
                drawWithContent.drawContent();
                if (this.$addAppViewModel.B().getValue().booleanValue()) {
                    return;
                }
                n.e(drawWithContent, Dp.m6044constructorimpl(1), com.yuanqi.master.theme.b.m());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c extends n0 implements v3.a<r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AddAppViewModel addAppViewModel) {
                super(0);
                this.$addAppViewModel = addAppViewModel;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$addAppViewModel.B().setValue(Boolean.TRUE);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppTitle$1$1$5\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,676:1\n154#2:677\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppTitle$1$1$5\n*L\n489#1:677\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class d extends n0 implements v3.l<ContentDrawScope, r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(AddAppViewModel addAppViewModel) {
                super(1);
                this.$addAppViewModel = addAppViewModel;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@p4.l ContentDrawScope drawWithContent) {
                l0.p(drawWithContent, "$this$drawWithContent");
                drawWithContent.drawContent();
                if (this.$addAppViewModel.B().getValue().booleanValue()) {
                    n.e(drawWithContent, Dp.m6044constructorimpl(1), com.yuanqi.master.theme.b.m());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(AddAppViewModel addAppViewModel) {
            super(2);
            this.$addAppViewModel = addAppViewModel;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-640385782, i5, -1, "com.yuanqi.master.addapp.home.SelectAppTitle.<anonymous> (SelectAppScreen.kt:452)");
            }
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            AddAppViewModel addAppViewModel = this.$addAppViewModel;
            composer.startReplaceableGroup(693286680);
            Modifier.Companion companion2 = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
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
            Alignment center = companion.getCenter();
            float f5 = 150;
            float f6 = 50;
            Modifier drawWithContent = DrawModifierKt.drawWithContent(ClickableKt.m235clickableXHw0xAI$default(SizeKt.m588height3ABfNKs(SizeKt.m607width3ABfNKs(companion2, Dp.m6044constructorimpl(f5)), Dp.m6044constructorimpl(f6)), false, null, null, new a(addAppViewModel), 7, null), new b(addAppViewModel));
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(drawWithContent);
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
            String stringResource = StringResources_androidKt.stringResource(R.string.title_select_app, composer, 6);
            long sp = TextUnitKt.getSp(15);
            long L = com.yuanqi.master.theme.b.L();
            TextAlign.Companion companion4 = TextAlign.Companion;
            int m5936getCentere0LSkKk = companion4.m5936getCentere0LSkKk();
            TextOverflow.Companion companion5 = TextOverflow.Companion;
            TextKt.m2452Text4IGK_g(stringResource, (Modifier) null, L, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(m5936getCentere0LSkKk), 0L, companion5.m5986getEllipsisgIe3tQ8(), false, 2, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3456, 3120, 120306);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            Alignment center2 = companion.getCenter();
            Modifier drawWithContent2 = DrawModifierKt.drawWithContent(ClickableKt.m235clickableXHw0xAI$default(SizeKt.m588height3ABfNKs(SizeKt.m607width3ABfNKs(companion2, Dp.m6044constructorimpl(f5)), Dp.m6044constructorimpl(f6)), false, null, null, new c(addAppViewModel), 7, null), new d(addAppViewModel));
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(drawWithContent2);
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
            String stringResource2 = StringResources_androidKt.stringResource(R.string.install_from_sd, composer, 6);
            long sp2 = TextUnitKt.getSp(15);
            TextKt.m2452Text4IGK_g(stringResource2, (Modifier) null, com.yuanqi.master.theme.b.L(), sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(companion4.m5936getCentere0LSkKk()), 0L, companion5.m5986getEllipsisgIe3tQ8(), false, 2, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3456, 3120, 120306);
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
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppTitle$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,676:1\n154#2:677\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/SelectAppScreenKt$SelectAppTitle$2\n*L\n520#1:677\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class h extends n0 implements q<RowScope, Composer, Integer, r2> {
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements v3.a<r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AddAppViewModel addAppViewModel, NavHostController navHostController) {
                super(0);
                this.$addAppViewModel = addAppViewModel;
                this.$navController = navHostController;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.$addAppViewModel.E().getValue().booleanValue()) {
                    return;
                }
                NavController.navigate$default(this.$navController, com.yuanqi.master.config.c.f14535i, null, null, 6, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(AddAppViewModel addAppViewModel, NavHostController navHostController) {
            super(3);
            this.$addAppViewModel = addAppViewModel;
            this.$navController = navHostController;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.l RowScope TopAppBar, @p4.m Composer composer, int i5) {
            l0.p(TopAppBar, "$this$TopAppBar");
            if ((i5 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-250098305, i5, -1, "com.yuanqi.master.addapp.home.SelectAppTitle.<anonymous> (SelectAppScreen.kt:515)");
            }
            if (!this.$addAppViewModel.B().getValue().booleanValue()) {
                IconKt.m1924Iconww6aTOc(PainterResources_androidKt.painterResource(R.mipmap.search, composer, 6), "", ClickableKt.m235clickableXHw0xAI$default(PaddingKt.m557paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dp.m6044constructorimpl(10), 0.0f, 11, null), false, null, null, new a(this.$addAppViewModel, this.$navController), 7, null), com.yuanqi.master.theme.b.L(), composer, 3128, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(AddAppViewModel addAppViewModel, NavHostController navHostController, int i5) {
            super(2);
            this.$addAppViewModel = addAppViewModel;
            this.$navController = navHostController;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            n.c(this.$addAppViewModel, this.$navController, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"UnrememberedMutableState"})
    public static final void a(int i5, @p4.l AddAppViewModel addAppViewModel, @p4.l SnapshotStateList<com.yuanqi.group.home.models.c> appShowList, @p4.m Composer composer, int i6) {
        boolean z4;
        MutableState mutableStateOf$default;
        long k5;
        Modifier.Companion companion;
        Composer composer2;
        com.yuanqi.group.home.models.c cVar;
        l0.p(addAppViewModel, "addAppViewModel");
        l0.p(appShowList, "appShowList");
        Composer startRestartGroup = composer.startRestartGroup(-1517407493);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1517407493, i6, -1, "com.yuanqi.master.addapp.home.HomeGridItems (SelectAppScreen.kt:543)");
        }
        com.yuanqi.group.home.models.c cVar2 = appShowList.get(i5);
        if (cVar2.f14017f > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z4), null, 2, null);
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        if (((Boolean) mutableStateOf$default.getValue()).booleanValue()) {
            k5 = com.yuanqi.master.theme.b.F2();
        } else {
            k5 = com.yuanqi.master.theme.b.k();
        }
        Modifier.Companion companion2 = Modifier.Companion;
        float f5 = 6;
        Modifier m588height3ABfNKs = SizeKt.m588height3ABfNKs(BorderKt.m212borderxT4_qwU(BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m553padding3ABfNKs(ClickableKt.m235clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), false, null, null, new a(addAppViewModel, cVar2, context, appShowList, i5), 7, null), Dp.m6044constructorimpl(2)), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f5))), com.yuanqi.master.theme.b.k(), null, 2, null), Dp.m6044constructorimpl((float) 0.5d), k5, RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f5))), Dp.m6044constructorimpl(120));
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion4.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m588height3ABfNKs);
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
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
        startRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        v3.a<ComposeUiNode> constructor2 = companion4.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        Updater.m3271setimpl(m3264constructorimpl2, columnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (((Boolean) mutableStateOf$default.getValue()).booleanValue()) {
            startRestartGroup.startReplaceableGroup(-506402018);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotIntStateKt.mutableIntStateOf(cVar2.f14017f);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableIntState mutableIntState = (MutableIntState) rememberedValue;
            SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion2, Dp.m6044constructorimpl(8)), startRestartGroup, 6);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, companion3.getTop(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor3 = companion4.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default2);
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
            Updater.m3271setimpl(m3264constructorimpl3, rowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Painter painterResource = PainterResources_androidKt.painterResource(R.mipmap.app_minus, startRestartGroup, 6);
            float f6 = 30;
            Modifier m602size3ABfNKs = SizeKt.m602size3ABfNKs(companion2, Dp.m6044constructorimpl(f6));
            float f7 = 3;
            cVar = cVar2;
            ImageKt.Image(painterResource, (String) null, ClickableKt.m235clickableXHw0xAI$default(PaddingKt.m553padding3ABfNKs(m602size3ABfNKs, Dp.m6044constructorimpl(f7)), false, null, null, new b(cVar2, mutableIntState, appShowList, i5), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
            TextKt.m2452Text4IGK_g(String.valueOf(mutableIntState.getValue().intValue()), (Modifier) null, com.yuanqi.master.theme.b.L(), TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, startRestartGroup, 3456, 0, 131058);
            companion = companion2;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.app_add, startRestartGroup, 6), (String) null, ClickableKt.m235clickableXHw0xAI$default(PaddingKt.m553padding3ABfNKs(SizeKt.m602size3ABfNKs(companion2, Dp.m6044constructorimpl(f6)), Dp.m6044constructorimpl(f7)), false, null, null, new c(appShowList, addAppViewModel, cVar, context, mutableIntState, i5), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(5)), composer2, 6);
            composer2.endReplaceableGroup();
        } else {
            companion = companion2;
            composer2 = startRestartGroup;
            cVar = cVar2;
            composer2.startReplaceableGroup(-506399390);
            SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(20)), composer2, 6);
            composer2.endReplaceableGroup();
        }
        com.yuanqi.group.home.models.c cVar3 = cVar;
        Drawable drawable = cVar3.f14015d;
        l0.m(drawable);
        ImageKt.Image(new BitmapPainter(AndroidImageBitmap_androidKt.asImageBitmap(DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null)), 0L, 0L, 6, null), cVar3.f14016e.toString(), SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(40)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 392, 120);
        Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(companion, 0.0f, Dp.m6044constructorimpl(10), 0.0f, 0.0f, 13, null);
        TextKt.m2452Text4IGK_g(cVar3.f14016e.toString(), m557paddingqDBjuR0$default, com.yuanqi.master.theme.b.L(), TextUnitKt.m6247TextUnitanM5pPY(10.0f, TextUnitType.Companion.m6268getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, TextOverflow.Companion.m5985getClipgIe3tQ8(), false, 1, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer2, 432, 3120, 120304);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(i5, addAppViewModel, appShowList, i6));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    public static final void b(@p4.m AddAppViewModel addAppViewModel, @p4.l NavHostController navController, @p4.m Composer composer, int i5, int i6) {
        AddAppViewModel addAppViewModel2;
        SnapshotStateList<com.yuanqi.group.home.models.c> k5;
        CreationExtras creationExtras;
        l0.p(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(1655286682);
        if ((i6 & 1) != 0) {
            ViewModelProvider.Factory a5 = ViewModelFactoryKt.a();
            startRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current != null) {
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    creationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel = ViewModelKt.viewModel(AddAppViewModel.class, current, null, a5, creationExtras, startRestartGroup, 36936, 0);
                startRestartGroup.endReplaceableGroup();
                addAppViewModel2 = (AddAppViewModel) viewModel;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            addAppViewModel2 = addAppViewModel;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1655286682, i5, -1, "com.yuanqi.master.addapp.home.SelectAppScene (SelectAppScreen.kt:116)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new LazyGridState(0, 0, 3, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LazyGridState lazyGridState = (LazyGridState) rememberedValue;
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.i.INSTANCE, startRestartGroup));
            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue2 = compositionScopedCoroutineScopeCanceller;
        }
        startRestartGroup.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        float mo304toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo304toPx0680j_4(Dp.m6044constructorimpl(24));
        if (addAppViewModel2.B().getValue().booleanValue()) {
            k5 = addAppViewModel2.j();
        } else {
            k5 = addAppViewModel2.k();
        }
        SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList = k5;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = addAppViewModel2.v();
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        AddAppViewModel addAppViewModel3 = addAppViewModel2;
        SurfaceKt.m2304SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, 0L, Color.Companion.m3760getBlack0d7_KjU(), 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1867187979, true, new e(addAppViewModel2, navController, snapshotStateList, coroutineScope, lazyGridState, (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), mo304toPx0680j_4, (SnapshotStateList) rememberedValue3)), startRestartGroup, 12585990, 118);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(addAppViewModel3, navController, i5, i6));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@p4.l AddAppViewModel addAppViewModel, @p4.l NavHostController navController, @p4.m Composer composer, int i5) {
        l0.p(addAppViewModel, "addAppViewModel");
        l0.p(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(-736728242);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-736728242, i5, -1, "com.yuanqi.master.addapp.home.SelectAppTitle (SelectAppScreen.kt:448)");
        }
        AppBarKt.TopAppBar(ComposableLambdaKt.composableLambda(startRestartGroup, -640385782, true, new g(addAppViewModel)), null, com.yuanqi.master.addapp.home.h.f14480a.d(), ComposableLambdaKt.composableLambda(startRestartGroup, -250098305, true, new h(addAppViewModel, navController)), null, TopAppBarDefaults.INSTANCE.m2611topAppBarColorszjMxDiM(Color.Companion.m3769getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, startRestartGroup, ((TopAppBarDefaults.$stable | 0) << 15) | 6, 30), null, startRestartGroup, 3462, 82);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(addAppViewModel, navController, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(DrawScope drawScope, float f5, long j5) {
        float mo304toPx0680j_4 = drawScope.mo304toPx0680j_4(f5);
        DrawScope.m4264drawLineNGM6Ib0$default(drawScope, j5, OffsetKt.Offset(0.0f, Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc()) - mo304toPx0680j_4), OffsetKt.Offset(Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc()), Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc()) - mo304toPx0680j_4), mo304toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
    }
}
