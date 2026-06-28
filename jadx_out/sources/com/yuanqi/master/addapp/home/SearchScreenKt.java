package com.yuanqi.master.addapp.home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.core.graphics.drawable.DrawableKt;
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
import com.yuanqi.master.addapp.AddAppViewModel;
import com.yuanqi.master.addapp.home.SearchScreenKt;
import com.yuanqi.master.tools.q0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.text.f0;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;
import v3.p;
import v3.q;
import v3.r;

@i0(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"SearchGridItems", "", "addAppViewModel", "Lcom/yuanqi/master/addapp/AddAppViewModel;", "info", "Lcom/yuanqi/group/home/models/AppInfo;", "index", "", "appShowList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "action", "Lkotlin/Function0;", "(Lcom/yuanqi/master/addapp/AddAppViewModel;Lcom/yuanqi/group/home/models/AppInfo;ILandroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SearchScreen", "navController", "Landroidx/navigation/NavHostController;", "(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,447:1\n81#2,11:448\n25#3:459\n25#3:468\n25#3:475\n25#3:486\n36#3:498\n36#3:505\n36#3:512\n456#3,8:542\n464#3,3:556\n456#3,8:577\n464#3,3:591\n456#3,8:609\n464#3,3:623\n467#3,3:631\n467#3,3:640\n467#3,3:645\n1116#4,6:460\n1116#4,6:469\n1116#4,6:476\n1116#4,3:487\n1119#4,3:493\n1116#4,6:499\n1116#4,6:506\n1116#4,6:513\n74#5:466\n74#5:467\n74#5:497\n74#5:519\n487#6,4:482\n491#6,2:490\n495#6:496\n487#7:492\n154#8:520\n154#8:521\n164#8:522\n154#8:523\n154#8:524\n154#8:595\n154#8:627\n154#8:628\n154#8:629\n154#8:630\n154#8:636\n154#8:637\n154#8:638\n154#8:639\n68#9,6:525\n74#9:559\n78#9:649\n79#10,11:531\n79#10,11:566\n79#10,11:598\n92#10:634\n92#10:643\n92#10:648\n3737#11,6:550\n3737#11,6:585\n3737#11,6:617\n74#12,6:560\n80#12:594\n84#12:644\n91#13,2:596\n93#13:626\n97#13:635\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt\n*L\n94#1:448,11\n98#1:459\n108#1:468\n112#1:475\n116#1:486\n123#1:498\n129#1:505\n142#1:512\n342#1:542,8\n342#1:556,3\n371#1:577,8\n371#1:591,3\n379#1:609,8\n379#1:623,3\n379#1:631,3\n371#1:640,3\n342#1:645,3\n98#1:460,6\n108#1:469,6\n112#1:476,6\n116#1:487,3\n116#1:493,3\n123#1:499,6\n129#1:506,6\n142#1:513,6\n102#1:466\n103#1:467\n120#1:497\n333#1:519\n116#1:482,4\n116#1:490,2\n116#1:496\n116#1:492\n364#1:520\n365#1:521\n367#1:522\n367#1:523\n368#1:524\n377#1:595\n387#1:627\n388#1:628\n402#1:629\n403#1:630\n425#1:636\n427#1:637\n433#1:638\n436#1:639\n342#1:525,6\n342#1:559\n342#1:649\n342#1:531,11\n371#1:566,11\n379#1:598,11\n379#1:634\n371#1:643\n342#1:648\n342#1:550,6\n371#1:585,6\n379#1:617,6\n371#1:560,6\n371#1:594\n371#1:644\n379#1:596,2\n379#1:626\n379#1:635\n*E\n"})
/* loaded from: classes3.dex */
public final class SearchScreenKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements v3.a<r2> {
        final /* synthetic */ v3.a<r2> $action;
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $index;
        final /* synthetic */ com.yuanqi.group.home.models.c $info;
        final /* synthetic */ MutableState<Boolean> $isSelect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AddAppViewModel addAppViewModel, com.yuanqi.group.home.models.c cVar, Context context, MutableState<Boolean> mutableState, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, int i5, v3.a<r2> aVar) {
            super(0);
            this.$addAppViewModel = addAppViewModel;
            this.$info = cVar;
            this.$context = context;
            this.$isSelect = mutableState;
            this.$appShowList = snapshotStateList;
            this.$index = i5;
            this.$action = aVar;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
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
                this.$isSelect.setValue(Boolean.FALSE);
            } else {
                a5.f14017f = 1;
                this.$isSelect.setValue(Boolean.TRUE);
            }
            SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList = this.$appShowList;
            int i5 = this.$index;
            com.yuanqi.group.home.models.c a6 = a5.a();
            l0.o(a6, "copy(...)");
            snapshotStateList.set(i5, a6);
            this.$action.invoke();
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
    @r1({"SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchGridItems$2$1$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,447:1\n766#2:448\n857#2,2:449\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchGridItems$2$1$1$2\n*L\n407#1:448\n407#1:449,2\n*E\n"})
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
            com.yuanqi.group.home.models.c a6 = a5.a();
            l0.o(a6, "copy(...)");
            snapshotStateList2.set(i5, a6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ v3.a<r2> $action;
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appShowList;
        final /* synthetic */ int $index;
        final /* synthetic */ com.yuanqi.group.home.models.c $info;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AddAppViewModel addAppViewModel, com.yuanqi.group.home.models.c cVar, int i5, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, v3.a<r2> aVar, int i6) {
            super(2);
            this.$addAppViewModel = addAppViewModel;
            this.$info = cVar;
            this.$index = i5;
            this.$appShowList = snapshotStateList;
            this.$action = aVar;
            this.$$changed = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            SearchScreenKt.a(this.$addAppViewModel, this.$info, this.$index, this.$appShowList, this.$action, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.home.SearchScreenKt$SearchScreen$1$1", f = "SearchScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ SoftwareKeyboardController $softKeyboard;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SoftwareKeyboardController softwareKeyboardController, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.$softKeyboard = softwareKeyboardController;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new e(this.$softKeyboard, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                SoftwareKeyboardController softwareKeyboardController = this.$softKeyboard;
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.hide();
                }
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.home.SearchScreenKt$SearchScreen$2$1", f = "SearchScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ FocusRequester $focusRequester;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(FocusRequester focusRequester, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.$focusRequester = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new f(this.$focusRequester, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                this.$focusRequester.requestFocus();
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.home.SearchScreenKt$SearchScreen$4$1", f = "SearchScreen.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends o implements p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ SoftwareKeyboardController $softKeyboard;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.home.SearchScreenKt$SearchScreen$4$1$1", f = "SearchScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends o implements q<PressGestureScope, Offset, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ SoftwareKeyboardController $softKeyboard;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SoftwareKeyboardController softwareKeyboardController, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.$softKeyboard = softwareKeyboardController;
            }

            @Override // v3.q
            public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, kotlin.coroutines.d<? super r2> dVar) {
                return m6435invoked4ec7I(pressGestureScope, offset.m3503unboximpl(), dVar);
            }

            @p4.m
            /* renamed from: invoke-d-4ec7I, reason: not valid java name */
            public final Object m6435invoked4ec7I(@p4.l PressGestureScope pressGestureScope, long j5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return new a(this.$softKeyboard, dVar).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                kotlin.coroutines.intrinsics.d.l();
                if (this.label == 0) {
                    e1.n(obj);
                    SoftwareKeyboardController softwareKeyboardController = this.$softKeyboard;
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.hide();
                    }
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(SoftwareKeyboardController softwareKeyboardController, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.$softKeyboard = softwareKeyboardController;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            g gVar = new g(this.$softKeyboard, dVar);
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
                a aVar = new a(this.$softKeyboard, null);
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, aVar, null, this, 11, null) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,447:1\n50#2:448\n49#2:449\n1116#3,6:450\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5\n*L\n314#1:448\n314#1:449\n314#1:450,6\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class h extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $CLICK_INTERVAL;
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appshowList;
        final /* synthetic */ Context $context;
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ LazyGridState $gridState;
        final /* synthetic */ k1.g $lastClickTime;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ s0 $scope;
        final /* synthetic */ k1.h<MutableState<String>> $searchStr;
        final /* synthetic */ SoftwareKeyboardController $softKeyboard;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,447:1\n154#2:448\n154#2:449\n154#2:450\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$1\n*L\n182#1:448\n184#1:449\n185#1:450\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ int $CLICK_INTERVAL;
            final /* synthetic */ AddAppViewModel $addAppViewModel;
            final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appshowList;
            final /* synthetic */ k1.g $lastClickTime;
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ k1.h<MutableState<String>> $searchStr;
            final /* synthetic */ SoftwareKeyboardController $softKeyboard;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,447:1\n154#2:448\n154#2:449\n154#2:450\n154#2:451\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$1$1\n*L\n187#1:448\n202#1:449\n203#1:450\n216#1:451\n*E\n"})
            /* renamed from: com.yuanqi.master.addapp.home.SearchScreenKt$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0273a extends n0 implements q<RowScope, Composer, Integer, r2> {
                final /* synthetic */ int $CLICK_INTERVAL;
                final /* synthetic */ AddAppViewModel $addAppViewModel;
                final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appshowList;
                final /* synthetic */ k1.g $lastClickTime;
                final /* synthetic */ NavHostController $navController;
                final /* synthetic */ k1.h<MutableState<String>> $searchStr;
                final /* synthetic */ SoftwareKeyboardController $softKeyboard;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.addapp.home.SearchScreenKt$h$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0274a extends n0 implements v3.a<r2> {
                    final /* synthetic */ int $CLICK_INTERVAL;
                    final /* synthetic */ k1.g $lastClickTime;
                    final /* synthetic */ NavHostController $navController;
                    final /* synthetic */ SoftwareKeyboardController $softKeyboard;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0274a(k1.g gVar, int i5, SoftwareKeyboardController softwareKeyboardController, NavHostController navHostController) {
                        super(0);
                        this.$lastClickTime = gVar;
                        this.$CLICK_INTERVAL = i5;
                        this.$softKeyboard = softwareKeyboardController;
                        this.$navController = navHostController;
                    }

                    @Override // v3.a
                    public /* bridge */ /* synthetic */ r2 invoke() {
                        invoke2();
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        long currentTimeMillis = System.currentTimeMillis();
                        k1.g gVar = this.$lastClickTime;
                        if (currentTimeMillis - gVar.element < this.$CLICK_INTERVAL) {
                            return;
                        }
                        gVar.element = currentTimeMillis;
                        SoftwareKeyboardController softwareKeyboardController = this.$softKeyboard;
                        if (softwareKeyboardController != null) {
                            softwareKeyboardController.hide();
                        }
                        this.$navController.popBackStack();
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @r1({"SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$1$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,447:1\n766#2:448\n857#2,2:449\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$1$1$2\n*L\n240#1:448\n240#1:449,2\n*E\n"})
                /* renamed from: com.yuanqi.master.addapp.home.SearchScreenKt$h$a$a$b */
                /* loaded from: classes3.dex */
                public static final class b extends n0 implements v3.l<String, r2> {
                    final /* synthetic */ AddAppViewModel $addAppViewModel;
                    final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appshowList;
                    final /* synthetic */ k1.h<MutableState<String>> $searchStr;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(k1.h<MutableState<String>> hVar, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, AddAppViewModel addAppViewModel) {
                        super(1);
                        this.$searchStr = hVar;
                        this.$appshowList = snapshotStateList;
                        this.$addAppViewModel = addAppViewModel;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final int invoke$lambda$1(String it, com.yuanqi.group.home.models.c cVar, com.yuanqi.group.home.models.c cVar2) {
                        int p32;
                        int p33;
                        l0.p(it, "$it");
                        CharSequence name = cVar.f14016e;
                        l0.o(name, "name");
                        p32 = f0.p3(name, it, 0, true, 2, null);
                        CharSequence name2 = cVar2.f14016e;
                        l0.o(name2, "name");
                        p33 = f0.p3(name2, it, 0, true, 2, null);
                        if (p32 == p33) {
                            return cVar.f14016e.toString().compareTo(cVar2.f14016e.toString());
                        }
                        return l0.t(p32, p33);
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(String str) {
                        invoke2(str);
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@p4.l final String it) {
                        List r5;
                        boolean Q2;
                        l0.p(it, "it");
                        this.$searchStr.element.setValue(it);
                        if (it.length() == 0) {
                            this.$appshowList.clear();
                            return;
                        }
                        SnapshotStateList<com.yuanqi.group.home.models.c> l5 = this.$addAppViewModel.l();
                        ArrayList arrayList = new ArrayList();
                        for (com.yuanqi.group.home.models.c cVar : l5) {
                            Q2 = f0.Q2(cVar.f14016e.toString(), it, true);
                            if (Q2) {
                                arrayList.add(cVar);
                            }
                        }
                        r5 = e0.r5(arrayList, new Comparator() { // from class: com.yuanqi.master.addapp.home.m
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                int invoke$lambda$1;
                                invoke$lambda$1 = SearchScreenKt.h.a.C0273a.b.invoke$lambda$1(it, (com.yuanqi.group.home.models.c) obj, (com.yuanqi.group.home.models.c) obj2);
                                return invoke$lambda$1;
                            }
                        });
                        Log.d(com.yuanqi.master.config.c.f14519a, String.valueOf(r5.size()));
                        this.$appshowList.clear();
                        this.$appshowList.addAll(r5);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0273a(k1.h<MutableState<String>> hVar, k1.g gVar, int i5, SoftwareKeyboardController softwareKeyboardController, NavHostController navHostController, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, AddAppViewModel addAppViewModel) {
                    super(3);
                    this.$searchStr = hVar;
                    this.$lastClickTime = gVar;
                    this.$CLICK_INTERVAL = i5;
                    this.$softKeyboard = softwareKeyboardController;
                    this.$navController = navHostController;
                    this.$appshowList = snapshotStateList;
                    this.$addAppViewModel = addAppViewModel;
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
                        ComposerKt.traceEventStart(-1025213036, i5, -1, "com.yuanqi.master.addapp.home.SearchScreen.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:186)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, Dp.m6044constructorimpl(8)), composer, 6);
                    IconKt.m1924Iconww6aTOc(PainterResources_androidKt.painterResource(R.mipmap.back, composer, 6), "", ClickableKt.m235clickableXHw0xAI$default(companion, false, null, null, new C0274a(this.$lastClickTime, this.$CLICK_INTERVAL, this.$softKeyboard, this.$navController), 7, null), com.yuanqi.master.theme.b.L(), composer, 3128, 0);
                    SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, Dp.m6044constructorimpl(18)), composer, 6);
                    Modifier m588height3ABfNKs = SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(50));
                    String value = this.$searchStr.element.getValue();
                    TextStyle textStyle = new TextStyle(0L, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777213, (w) null);
                    RoundedCornerShape m823RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(25));
                    TextFieldColors m1499textFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m1499textFieldColorsdx8h9Zs(com.yuanqi.master.theme.b.j(), 0L, com.yuanqi.master.theme.b.l(), com.yuanqi.master.theme.b.j(), 0L, Color.Companion.m3769getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, com.yuanqi.master.theme.b.j(), 0L, 0L, 0L, com.yuanqi.master.theme.b.S(), 0L, composer, 200070, 805502976, 48, 1540050);
                    b bVar = new b(this.$searchStr, this.$appshowList, this.$addAppViewModel);
                    com.yuanqi.master.addapp.home.g gVar = com.yuanqi.master.addapp.home.g.f14477a;
                    TextFieldKt.TextField(value, (v3.l<? super String, r2>) bVar, m588height3ABfNKs, false, false, textStyle, (p<? super Composer, ? super Integer, r2>) null, (p<? super Composer, ? super Integer, r2>) gVar.a(), (p<? super Composer, ? super Integer, r2>) gVar.b(), (p<? super Composer, ? super Integer, r2>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) m823RoundedCornerShape0680j_4, m1499textFieldColorsdx8h9Zs, composer, 113443200, 24576, 245336);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k1.h<MutableState<String>> hVar, k1.g gVar, int i5, SoftwareKeyboardController softwareKeyboardController, NavHostController navHostController, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, AddAppViewModel addAppViewModel) {
                super(2);
                this.$searchStr = hVar;
                this.$lastClickTime = gVar;
                this.$CLICK_INTERVAL = i5;
                this.$softKeyboard = softwareKeyboardController;
                this.$navController = navHostController;
                this.$appshowList = snapshotStateList;
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
                    ComposerKt.traceEventStart(-103655195, i5, -1, "com.yuanqi.master.addapp.home.SearchScreen.<anonymous>.<anonymous> (SearchScreen.kt:180)");
                }
                AppBarKt.m1202TopAppBarHsRjFd4(PaddingKt.m557paddingqDBjuR0$default(SizeKt.m588height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6044constructorimpl(60)), 0.0f, 0.0f, Dp.m6044constructorimpl(18), 0.0f, 11, null), Color.Companion.m3769getTransparent0d7_KjU(), 0L, Dp.m6044constructorimpl(0), null, ComposableLambdaKt.composableLambda(composer, -1025213036, true, new C0273a(this.$searchStr, this.$lastClickTime, this.$CLICK_INTERVAL, this.$softKeyboard, this.$navController, this.$appshowList, this.$addAppViewModel)), composer, 199734, 20);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,447:1\n766#2:448\n857#2,2:449\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$2\n*L\n151#1:448\n151#1:449,2\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class b extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;
            final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appshowList;
            final /* synthetic */ Context $context;
            final /* synthetic */ s0 $scope;
            final /* synthetic */ k1.h<MutableState<String>> $searchStr;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a extends n0 implements v3.a<r2> {
                final /* synthetic */ AddAppViewModel $addAppViewModel;
                final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appshowList;
                final /* synthetic */ Context $context;
                final /* synthetic */ s0 $scope;
                final /* synthetic */ k1.h<MutableState<String>> $searchStr;
                final /* synthetic */ ArrayList<com.yuanqi.group.home.models.c> $selectAppList;

                /* JADX INFO: Access modifiers changed from: package-private */
                @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.home.SearchScreenKt$SearchScreen$5$2$2$1", f = "SearchScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @r1({"SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$2$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,447:1\n766#2:448\n857#2,2:449\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$2$2$1\n*L\n171#1:448\n171#1:449,2\n*E\n"})
                /* renamed from: com.yuanqi.master.addapp.home.SearchScreenKt$h$b$a$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0275a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
                    final /* synthetic */ AddAppViewModel $addAppViewModel;
                    final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appshowList;
                    final /* synthetic */ Context $context;
                    final /* synthetic */ k1.h<MutableState<String>> $searchStr;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0275a(AddAppViewModel addAppViewModel, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, Context context, k1.h<MutableState<String>> hVar, kotlin.coroutines.d<? super C0275a> dVar) {
                        super(2, dVar);
                        this.$addAppViewModel = addAppViewModel;
                        this.$appshowList = snapshotStateList;
                        this.$context = context;
                        this.$searchStr = hVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.l
                    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                        return new C0275a(this.$addAppViewModel, this.$appshowList, this.$context, this.$searchStr, dVar);
                    }

                    @Override // v3.p
                    @p4.m
                    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                        return ((C0275a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.m
                    public final Object invokeSuspend(@p4.l Object obj) {
                        boolean z4;
                        kotlin.coroutines.intrinsics.d.l();
                        if (this.label == 0) {
                            e1.n(obj);
                            AddAppViewModel addAppViewModel = this.$addAppViewModel;
                            SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList = this.$appshowList;
                            ArrayList arrayList = new ArrayList();
                            for (com.yuanqi.group.home.models.c cVar : snapshotStateList) {
                                if (cVar.f14017f > 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    arrayList.add(cVar);
                                }
                            }
                            addAppViewModel.K(arrayList);
                            q0.f15237a.a().s(this.$context, this.$searchStr.element.getValue());
                            return r2.f19517a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(ArrayList<com.yuanqi.group.home.models.c> arrayList, s0 s0Var, AddAppViewModel addAppViewModel, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, Context context, k1.h<MutableState<String>> hVar) {
                    super(0);
                    this.$selectAppList = arrayList;
                    this.$scope = s0Var;
                    this.$addAppViewModel = addAppViewModel;
                    this.$appshowList = snapshotStateList;
                    this.$context = context;
                    this.$searchStr = hVar;
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
                    kotlinx.coroutines.k.f(this.$scope, kotlinx.coroutines.k1.c(), null, new C0275a(this.$addAppViewModel, this.$appshowList, this.$context, this.$searchStr, null), 2, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.SearchScreenKt$h$b$b, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0276b extends n0 implements q<RowScope, Composer, Integer, r2> {
                final /* synthetic */ long $textColor;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0276b(long j5) {
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
                        ComposerKt.traceEventStart(-949983592, i5, -1, "com.yuanqi.master.addapp.home.SearchScreen.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:177)");
                    }
                    TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.confirm, composer, 6), (Modifier) null, this.$textColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 0, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, s0 s0Var, AddAppViewModel addAppViewModel, Context context, k1.h<MutableState<String>> hVar) {
                super(2);
                this.$appshowList = snapshotStateList;
                this.$scope = s0Var;
                this.$addAppViewModel = addAppViewModel;
                this.$context = context;
                this.$searchStr = hVar;
            }

            @Override // v3.p
            public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@p4.m Composer composer, int i5) {
                long m5;
                long m3771getWhite0d7_KjU;
                if ((i5 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2079723176, i5, -1, "com.yuanqi.master.addapp.home.SearchScreen.<anonymous>.<anonymous> (SearchScreen.kt:149)");
                }
                ArrayList arrayList = new ArrayList();
                SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList = this.$appshowList;
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
                if (arrayList.isEmpty()) {
                    m5 = com.yuanqi.master.theme.b.T();
                } else {
                    m5 = com.yuanqi.master.theme.b.m();
                }
                long j5 = m5;
                if (arrayList.isEmpty()) {
                    m3771getWhite0d7_KjU = com.yuanqi.master.theme.b.i();
                } else {
                    m3771getWhite0d7_KjU = Color.Companion.m3771getWhite0d7_KjU();
                }
                ButtonKt.Button(new a(arrayList, this.$scope, this.$addAppViewModel, this.$appshowList, this.$context, this.$searchStr), null, false, null, ButtonDefaults.INSTANCE.m1594buttonColorsro_MJ88(j5, 0L, 0L, 0L, composer, (ButtonDefaults.$stable | 0) << 12, 14), null, null, null, null, ComposableLambdaKt.composableLambda(composer, -949983592, true, new C0276b(m3771getWhite0d7_KjU)), composer, 805306368, 494);
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
            final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appshowList;
            final /* synthetic */ LazyGridState $gridState;
            final /* synthetic */ k1.h<MutableState<String>> $searchStr;
            final /* synthetic */ SoftwareKeyboardController $softKeyboard;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$3$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,447:1\n69#2,5:448\n74#2:481\n78#2:487\n79#3,11:453\n92#3:486\n456#4,8:464\n464#4,3:478\n467#4,3:483\n3737#5,6:472\n154#6:482\n154#6:488\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$3$1\n*L\n264#1:448,5\n264#1:481\n264#1:487\n264#1:453,11\n264#1:486\n264#1:464,8\n264#1:478,3\n264#1:483,3\n264#1:472,6\n272#1:482\n285#1:488\n*E\n"})
            /* loaded from: classes3.dex */
            public static final class a extends n0 implements q<BoxScope, Composer, Integer, r2> {
                final /* synthetic */ AddAppViewModel $addAppViewModel;
                final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appshowList;
                final /* synthetic */ LazyGridState $gridState;
                final /* synthetic */ PaddingValues $it;
                final /* synthetic */ k1.h<MutableState<String>> $searchStr;
                final /* synthetic */ SoftwareKeyboardController $softKeyboard;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.addapp.home.SearchScreenKt$h$c$a$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0277a extends n0 implements v3.l<LazyGridScope, r2> {
                    final /* synthetic */ AddAppViewModel $addAppViewModel;
                    final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appshowList;
                    final /* synthetic */ SoftwareKeyboardController $softKeyboard;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @r1({"SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$3$1$2$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,447:1\n36#2:448\n1116#3,6:449\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/SearchScreenKt$SearchScreen$5$3$1$2$1\n*L\n304#1:448\n304#1:449,6\n*E\n"})
                    /* renamed from: com.yuanqi.master.addapp.home.SearchScreenKt$h$c$a$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0278a extends n0 implements r<LazyGridItemScope, Integer, Composer, Integer, r2> {
                        final /* synthetic */ AddAppViewModel $addAppViewModel;
                        final /* synthetic */ SnapshotStateList<com.yuanqi.group.home.models.c> $appshowList;
                        final /* synthetic */ SoftwareKeyboardController $softKeyboard;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.yuanqi.master.addapp.home.SearchScreenKt$h$c$a$a$a$a, reason: collision with other inner class name */
                        /* loaded from: classes3.dex */
                        public static final class C0279a extends n0 implements v3.a<r2> {
                            final /* synthetic */ SoftwareKeyboardController $softKeyboard;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C0279a(SoftwareKeyboardController softwareKeyboardController) {
                                super(0);
                                this.$softKeyboard = softwareKeyboardController;
                            }

                            @Override // v3.a
                            public /* bridge */ /* synthetic */ r2 invoke() {
                                invoke2();
                                return r2.f19517a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                SoftwareKeyboardController softwareKeyboardController = this.$softKeyboard;
                                if (softwareKeyboardController != null) {
                                    softwareKeyboardController.hide();
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0278a(AddAppViewModel addAppViewModel, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, SoftwareKeyboardController softwareKeyboardController) {
                            super(4);
                            this.$addAppViewModel = addAppViewModel;
                            this.$appshowList = snapshotStateList;
                            this.$softKeyboard = softwareKeyboardController;
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
                                ComposerKt.traceEventStart(-1074428418, i6, -1, "com.yuanqi.master.addapp.home.SearchScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:290)");
                            }
                            AddAppViewModel addAppViewModel = this.$addAppViewModel;
                            com.yuanqi.group.home.models.c cVar = this.$appshowList.get(i5);
                            SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList = this.$appshowList;
                            SoftwareKeyboardController softwareKeyboardController = this.$softKeyboard;
                            composer.startReplaceableGroup(1157296644);
                            boolean changed = composer.changed(softwareKeyboardController);
                            Object rememberedValue = composer.rememberedValue();
                            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new C0279a(softwareKeyboardController);
                                composer.updateRememberedValue(rememberedValue);
                            }
                            composer.endReplaceableGroup();
                            SearchScreenKt.a(addAppViewModel, cVar, i5, snapshotStateList, (v3.a) rememberedValue, composer, ((i6 << 3) & 896) | 3144);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0277a(SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, AddAppViewModel addAppViewModel, SoftwareKeyboardController softwareKeyboardController) {
                        super(1);
                        this.$appshowList = snapshotStateList;
                        this.$addAppViewModel = addAppViewModel;
                        this.$softKeyboard = softwareKeyboardController;
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(LazyGridScope lazyGridScope) {
                        invoke2(lazyGridScope);
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@p4.l LazyGridScope LazyVerticalGrid) {
                        l0.p(LazyVerticalGrid, "$this$LazyVerticalGrid");
                        LazyGridScope.items$default(LazyVerticalGrid, this.$appshowList.size(), null, null, null, ComposableLambdaKt.composableLambdaInstance(-1074428418, true, new C0278a(this.$addAppViewModel, this.$appshowList, this.$softKeyboard)), 14, null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(k1.h<MutableState<String>> hVar, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, PaddingValues paddingValues, LazyGridState lazyGridState, AddAppViewModel addAppViewModel, SoftwareKeyboardController softwareKeyboardController) {
                    super(3);
                    this.$searchStr = hVar;
                    this.$appshowList = snapshotStateList;
                    this.$it = paddingValues;
                    this.$gridState = lazyGridState;
                    this.$addAppViewModel = addAppViewModel;
                    this.$softKeyboard = softwareKeyboardController;
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
                        ComposerKt.traceEventStart(548474231, i5, -1, "com.yuanqi.master.addapp.home.SearchScreen.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:262)");
                    }
                    if ((this.$searchStr.element.getValue().length() > 0) && this.$appshowList.isEmpty()) {
                        composer.startReplaceableGroup(810165915);
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, this.$it), 0.0f, 1, null);
                        Alignment topCenter = Alignment.Companion.getTopCenter();
                        composer.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topCenter, false, composer, 6);
                        composer.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        v3.a<ComposeUiNode> constructor = companion2.getConstructor();
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
                        TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.no_result, composer, 6), PaddingKt.m557paddingqDBjuR0$default(companion, 0.0f, Dp.m6044constructorimpl(150), 0.0f, 0.0f, 13, null), com.yuanqi.master.theme.b.N(), TextUnitKt.getSp(24), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3504, 0, 130544);
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(810166554);
                        LazyGridDslKt.LazyVerticalGrid(new GridCells.Fixed(4), PaddingKt.m555paddingVpY3zN4$default(PaddingKt.padding(Modifier.Companion, this.$it), Dp.m6044constructorimpl(6), 0.0f, 2, null), this.$gridState, null, false, null, null, null, false, new C0277a(this.$appshowList, this.$addAppViewModel, this.$softKeyboard), composer, 0, 504);
                        composer.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(k1.h<MutableState<String>> hVar, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, LazyGridState lazyGridState, AddAppViewModel addAppViewModel, SoftwareKeyboardController softwareKeyboardController) {
                super(3);
                this.$searchStr = hVar;
                this.$appshowList = snapshotStateList;
                this.$gridState = lazyGridState;
                this.$addAppViewModel = addAppViewModel;
                this.$softKeyboard = softwareKeyboardController;
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
                    ComposerKt.traceEventStart(1930902896, i5, -1, "com.yuanqi.master.addapp.home.SearchScreen.<anonymous>.<anonymous> (SearchScreen.kt:261)");
                }
                com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, 548474231, true, new a(this.$searchStr, this.$appshowList, it, this.$gridState, this.$addAppViewModel, this.$softKeyboard)), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.addapp.home.SearchScreenKt$SearchScreen$5$4$1", f = "SearchScreen.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class d extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ FocusRequester $focusRequester;
            final /* synthetic */ SoftwareKeyboardController $softKeyboard;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, kotlin.coroutines.d<? super d> dVar) {
                super(2, dVar);
                this.$focusRequester = focusRequester;
                this.$softKeyboard = softwareKeyboardController;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new d(this.$focusRequester, this.$softKeyboard, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((d) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                    if (d1.b(300L, this) == l5) {
                        return l5;
                    }
                }
                this.$focusRequester.requestFocus();
                SoftwareKeyboardController softwareKeyboardController = this.$softKeyboard;
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.show();
                }
                return r2.f19517a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class e extends n0 implements v3.a<r2> {
            final /* synthetic */ NavHostController $navController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(NavHostController navHostController) {
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
                this.$navController.popBackStack();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, k1.h<MutableState<String>> hVar, k1.g gVar, int i5, NavHostController navHostController, SnapshotStateList<com.yuanqi.group.home.models.c> snapshotStateList, AddAppViewModel addAppViewModel, s0 s0Var, Context context, LazyGridState lazyGridState) {
            super(2);
            this.$focusRequester = focusRequester;
            this.$softKeyboard = softwareKeyboardController;
            this.$searchStr = hVar;
            this.$lastClickTime = gVar;
            this.$CLICK_INTERVAL = i5;
            this.$navController = navHostController;
            this.$appshowList = snapshotStateList;
            this.$addAppViewModel = addAppViewModel;
            this.$scope = s0Var;
            this.$context = context;
            this.$gridState = lazyGridState;
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
                ComposerKt.traceEventStart(31829793, i5, -1, "com.yuanqi.master.addapp.home.SearchScreen.<anonymous> (SearchScreen.kt:147)");
            }
            ScaffoldKt.m2107ScaffoldTvnljyQ(FocusRequesterModifierKt.focusRequester(Modifier.Companion, this.$focusRequester), ComposableLambdaKt.composableLambda(composer, -103655195, true, new a(this.$searchStr, this.$lastClickTime, this.$CLICK_INTERVAL, this.$softKeyboard, this.$navController, this.$appshowList, this.$addAppViewModel)), null, null, ComposableLambdaKt.composableLambda(composer, 2079723176, true, new b(this.$appshowList, this.$scope, this.$addAppViewModel, this.$context, this.$searchStr)), 0, Color.Companion.m3760getBlack0d7_KjU(), 0L, null, ComposableLambdaKt.composableLambda(composer, 1930902896, true, new c(this.$searchStr, this.$appshowList, this.$gridState, this.$addAppViewModel, this.$softKeyboard)), composer, 806903856, 428);
            r2 r2Var = r2.f19517a;
            FocusRequester focusRequester = this.$focusRequester;
            SoftwareKeyboardController softwareKeyboardController = this.$softKeyboard;
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(focusRequester) | composer.changed(softwareKeyboardController);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new d(focusRequester, softwareKeyboardController, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            EffectsKt.LaunchedEffect(r2Var, (p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue, composer, 70);
            BackHandlerKt.BackHandler(true, new e(this.$navController), composer, 6, 0);
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
        final /* synthetic */ int $$default;
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(AddAppViewModel addAppViewModel, NavHostController navHostController, int i5, int i6) {
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
            SearchScreenKt.b(this.$addAppViewModel, this.$navController, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"UnrememberedMutableState"})
    public static final void a(@p4.l AddAppViewModel addAppViewModel, @p4.l com.yuanqi.group.home.models.c info, int i5, @p4.l SnapshotStateList<com.yuanqi.group.home.models.c> appShowList, @p4.l v3.a<r2> action, @p4.m Composer composer, int i6) {
        boolean z4;
        MutableState mutableStateOf$default;
        long i7;
        Composer composer2;
        l0.p(addAppViewModel, "addAppViewModel");
        l0.p(info, "info");
        l0.p(appShowList, "appShowList");
        l0.p(action, "action");
        Composer startRestartGroup = composer.startRestartGroup(-1147757068);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1147757068, i6, -1, "com.yuanqi.master.addapp.home.SearchGridItems (SearchScreen.kt:329)");
        }
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        if (info.f14017f > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z4), null, 2, null);
        if (((Boolean) mutableStateOf$default.getValue()).booleanValue()) {
            i7 = com.yuanqi.master.theme.b.F2();
        } else {
            i7 = com.yuanqi.master.theme.b.i();
        }
        Modifier.Companion companion = Modifier.Companion;
        float f5 = 6;
        Modifier m588height3ABfNKs = SizeKt.m588height3ABfNKs(BorderKt.m212borderxT4_qwU(BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m553padding3ABfNKs(ClickableKt.m235clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, null, null, new a(addAppViewModel, info, context, mutableStateOf$default, appShowList, i5, action), 7, null), Dp.m6044constructorimpl(2)), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f5))), com.yuanqi.master.theme.b.k(), null, 2, null), Dp.m6044constructorimpl((float) 0.5d), i7, RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f5))), Dp.m6044constructorimpl(120));
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion3.getConstructor();
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
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        startRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
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
        Updater.m3271setimpl(m3264constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (((Boolean) mutableStateOf$default.getValue()).booleanValue()) {
            startRestartGroup.startReplaceableGroup(-327672754);
            MutableIntState mutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(info.f14017f);
            SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(8)), startRestartGroup, 6);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
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
            Updater.m3271setimpl(m3264constructorimpl3, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f6 = 30;
            float f7 = 3;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.app_minus, startRestartGroup, 6), (String) null, ClickableKt.m235clickableXHw0xAI$default(PaddingKt.m553padding3ABfNKs(SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(f6)), Dp.m6044constructorimpl(f7)), false, null, null, new b(info, mutableIntStateOf, appShowList, i5), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
            TextKt.m2452Text4IGK_g(String.valueOf(mutableIntStateOf.getValue().intValue()), (Modifier) null, com.yuanqi.master.theme.b.L(), TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, startRestartGroup, 3456, 0, 131058);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.app_add, startRestartGroup, 6), (String) null, ClickableKt.m235clickableXHw0xAI$default(PaddingKt.m553padding3ABfNKs(SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(f6)), Dp.m6044constructorimpl(f7)), false, null, null, new c(appShowList, addAppViewModel, info, context, mutableIntStateOf, i5), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(5)), composer2, 6);
            composer2.endReplaceableGroup();
        } else {
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(-327670198);
            SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(20)), composer2, 6);
            composer2.endReplaceableGroup();
        }
        Drawable drawable = info.f14015d;
        l0.m(drawable);
        ImageKt.Image(new BitmapPainter(AndroidImageBitmap_androidKt.asImageBitmap(DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null)), 0L, 0L, 6, null), info.f14016e.toString(), SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(40)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 392, 120);
        Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(companion, 0.0f, Dp.m6044constructorimpl(10), 0.0f, 0.0f, 13, null);
        TextKt.m2452Text4IGK_g(info.f14016e.toString(), m557paddingqDBjuR0$default, com.yuanqi.master.theme.b.L(), TextUnitKt.m6247TextUnitanM5pPY(10.0f, TextUnitType.Companion.m6268getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, TextOverflow.Companion.m5986getEllipsisgIe3tQ8(), false, 1, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer2, 432, 3120, 120304);
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
            endRestartGroup.updateScope(new d(addAppViewModel, info, i5, appShowList, action, i6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    public static final void b(@p4.m AddAppViewModel addAppViewModel, @p4.l NavHostController navController, @p4.m Composer composer, int i5, int i6) {
        AddAppViewModel addAppViewModel2;
        MutableState mutableStateOf$default;
        CreationExtras creationExtras;
        l0.p(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(-386193060);
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
            ComposerKt.traceEventStart(-386193060, i5, -1, "com.yuanqi.master.addapp.home.SearchScreen (SearchScreen.kt:96)");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        FocusRequester focusRequester = (FocusRequester) rememberedValue;
        FocusManager focusManager = (FocusManager) startRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) startRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
        k1.g gVar = new k1.g();
        k1.h hVar = new k1.h();
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        T t5 = rememberedValue2;
        if (rememberedValue2 == companion.getEmpty()) {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            startRestartGroup.updateRememberedValue(mutableStateOf$default);
            t5 = mutableStateOf$default;
        }
        startRestartGroup.endReplaceableGroup();
        hVar.element = t5;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt.mutableStateListOf();
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue3;
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.i.INSTANCE, startRestartGroup));
            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue4 = compositionScopedCoroutineScopeCanceller;
        }
        startRestartGroup.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue4).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        LazyGridState rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
        Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        startRestartGroup.startReplaceableGroup(1258014938);
        if (rememberLazyGridState.isScrollInProgress()) {
            r2 r2Var = r2.f19517a;
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(softwareKeyboardController);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new e(softwareKeyboardController, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(r2Var, (p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue5, startRestartGroup, 70);
        }
        startRestartGroup.endReplaceableGroup();
        r2 r2Var2 = r2.f19517a;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed2 = startRestartGroup.changed(focusRequester);
        Object rememberedValue6 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue6 == companion.getEmpty()) {
            rememberedValue6 = new f(focusRequester, null);
            startRestartGroup.updateRememberedValue(rememberedValue6);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(r2Var2, (p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue6, startRestartGroup, 70);
        EffectsKt.DisposableEffect(r2Var2, new SearchScreenKt$SearchScreen$3(focusManager), startRestartGroup, 6);
        Modifier.Companion companion2 = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed3 = startRestartGroup.changed(softwareKeyboardController);
        Object rememberedValue7 = startRestartGroup.rememberedValue();
        if (changed3 || rememberedValue7 == companion.getEmpty()) {
            rememberedValue7 = new g(softwareKeyboardController, null);
            startRestartGroup.updateRememberedValue(rememberedValue7);
        }
        startRestartGroup.endReplaceableGroup();
        AddAppViewModel addAppViewModel3 = addAppViewModel2;
        SurfaceKt.m2304SurfaceT9BRK9s(SuspendingPointerInputFilterKt.pointerInput(companion2, r2Var2, (p<? super PointerInputScope, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue7), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 31829793, true, new h(focusRequester, softwareKeyboardController, hVar, gVar, 1000, navController, snapshotStateList, addAppViewModel2, coroutineScope, context, rememberLazyGridState)), startRestartGroup, 12582912, 126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i(addAppViewModel3, navController, i5, i6));
        }
    }
}
