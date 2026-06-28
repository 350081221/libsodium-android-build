package com.yuanqi.master.manager;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import com.lody.virtual.remote.vloc.VLocation;
import com.yqtech.multiapp.R;
import com.yuanqi.master.ViewModelFactoryKt;
import com.yuanqi.master.tools.f1;
import com.yuanqi.master.tools.x0;
import java.util.List;
import java.util.Map;
import kotlin.collections.w;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v0;
import kotlin.r2;
import kotlin.reflect.o;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\tX\u008a\u008e\u0002"}, d2 = {"ManagerScreen", "", "navController", "Landroidx/navigation/NavHostController;", "managerViewModel", "Lcom/yuanqi/master/manager/ManagerViewModel;", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/manager/ManagerViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release", "locationPermissionState", "", "clickCount", "", com.yuanqi.master.config.c.V, "showLocationFunction", "angle", "", "lightGuide", "showOverlay"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nManagerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerScreen.kt\ncom/yuanqi/master/manager/ManagerScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,351:1\n81#2,11:352\n74#3:363\n25#4:364\n36#4:371\n25#4:378\n25#4:385\n25#4:392\n25#4:399\n1116#5,6:365\n1116#5,6:372\n1116#5,6:379\n1116#5,6:386\n1116#5,6:393\n1116#5,6:400\n81#6:406\n107#6,2:407\n81#6:409\n107#6,2:410\n81#6:412\n107#6,2:413\n81#6:418\n107#6,2:419\n76#7:415\n109#7,2:416\n*S KotlinDebug\n*F\n+ 1 ManagerScreen.kt\ncom/yuanqi/master/manager/ManagerScreenKt\n*L\n80#1:352,11\n83#1:363\n86#1:364\n91#1:371\n115#1:378\n120#1:385\n122#1:392\n126#1:399\n86#1:365,6\n91#1:372,6\n115#1:379,6\n120#1:386,6\n122#1:393,6\n126#1:400,6\n86#1:406\n86#1:407,2\n115#1:409\n115#1:410,2\n120#1:412\n120#1:413,2\n126#1:418\n126#1:419,2\n122#1:415\n122#1:416,2\n*E\n"})
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f14750a = {l1.j(new v0(e.class, com.yuanqi.master.config.c.V, "<v#2>", 1)), l1.j(new v0(e.class, "lightGuide", "<v#5>", 1))};

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.manager.ManagerScreenKt$ManagerScreen$1", f = "ManagerScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ManagerViewModel $managerViewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ManagerViewModel managerViewModel, Context context, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$managerViewModel = managerViewModel;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new a(this.$managerViewModel, this.$context, dVar);
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
                this.$managerViewModel.A(this.$context);
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ MutableFloatState $angle$delegate;
        final /* synthetic */ MutableState<Integer> $clickCount$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ x0<Boolean> $showLocation$delegate;
        final /* synthetic */ MutableState<Boolean> $showLocationFunction$delegate;
        final /* synthetic */ MutableState<Boolean> $showOverlay$delegate;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nManagerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerScreen.kt\ncom/yuanqi/master/manager/ManagerScreenKt$ManagerScreen$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,351:1\n154#2:352\n154#2:353\n83#3,3:354\n1116#4,6:357\n*S KotlinDebug\n*F\n+ 1 ManagerScreen.kt\ncom/yuanqi/master/manager/ManagerScreenKt$ManagerScreen$2$1\n*L\n141#1:352\n142#1:353\n145#1:354,3\n145#1:357,6\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements q<RowScope, Composer, Integer, r2> {
            final /* synthetic */ MutableFloatState $angle$delegate;
            final /* synthetic */ MutableState<Integer> $clickCount$delegate;
            final /* synthetic */ x0<Boolean> $showLocation$delegate;
            final /* synthetic */ MutableState<Boolean> $showLocationFunction$delegate;
            final /* synthetic */ MutableState<Boolean> $showOverlay$delegate;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.manager.e$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0362a extends n0 implements v3.a<r2> {
                final /* synthetic */ MutableFloatState $angle$delegate;
                final /* synthetic */ MutableState<Integer> $clickCount$delegate;
                final /* synthetic */ x0<Boolean> $showLocation$delegate;
                final /* synthetic */ MutableState<Boolean> $showLocationFunction$delegate;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0362a(MutableState<Integer> mutableState, x0<Boolean> x0Var, MutableFloatState mutableFloatState, MutableState<Boolean> mutableState2) {
                    super(0);
                    this.$clickCount$delegate = mutableState;
                    this.$showLocation$delegate = x0Var;
                    this.$angle$delegate = mutableFloatState;
                    this.$showLocationFunction$delegate = mutableState2;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    e.m(this.$clickCount$delegate, e.l(this.$clickCount$delegate) + 1);
                    if (e.l(this.$clickCount$delegate) >= 5) {
                        e.o(this.$showLocation$delegate, !e.n(r0));
                        f1.r(e.n(this.$showLocation$delegate) ? "显示位置保护" : "隐藏位置保护", 0, 2, null);
                        e.f(this.$angle$delegate, e.n(this.$showLocation$delegate) ? 0.0f : 180.0f);
                        e.d(this.$showLocationFunction$delegate, e.n(this.$showLocation$delegate));
                        e.m(this.$clickCount$delegate, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MutableState<Integer> mutableState, x0<Boolean> x0Var, MutableFloatState mutableFloatState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
                super(3);
                this.$clickCount$delegate = mutableState;
                this.$showLocation$delegate = x0Var;
                this.$angle$delegate = mutableFloatState;
                this.$showLocationFunction$delegate = mutableState2;
                this.$showOverlay$delegate = mutableState3;
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
                    ComposerKt.traceEventStart(541658894, i5, -1, "com.yuanqi.master.manager.ManagerScreen.<anonymous>.<anonymous> (ManagerScreen.kt:136)");
                }
                Painter painterResource = PainterResources_androidKt.painterResource(R.mipmap.ic_light_on, composer, 6);
                Modifier m201backgroundbw27NRU$default = BackgroundKt.m201backgroundbw27NRU$default(GraphicsLayerModifierKt.m3894graphicsLayerAp8cVGQ$default(SizeKt.m602size3ABfNKs(PaddingKt.m557paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dp.m6044constructorimpl(10), 0.0f, 11, null), Dp.m6044constructorimpl(28)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, e.e(this.$angle$delegate), 0.0f, 0L, null, false, null, 0L, 0L, 0, 130815, null), (com.yuanqi.master.mine.account.a.f14786a.k() && e.i(this.$showOverlay$delegate)) ? Color.Companion.m3771getWhite0d7_KjU() : Color.Companion.m3769getTransparent0d7_KjU(), null, 2, null);
                MutableState<Integer> mutableState = this.$clickCount$delegate;
                int i6 = 0;
                x0<Boolean> x0Var = this.$showLocation$delegate;
                MutableFloatState mutableFloatState = this.$angle$delegate;
                MutableState<Boolean> mutableState2 = this.$showLocationFunction$delegate;
                Object[] objArr = {mutableState, x0Var, mutableFloatState, mutableState2};
                composer.startReplaceableGroup(-568225417);
                boolean z4 = false;
                for (int i7 = 4; i6 < i7; i7 = 4) {
                    z4 |= composer.changed(objArr[i6]);
                    i6++;
                }
                Object rememberedValue = composer.rememberedValue();
                if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0362a(mutableState, x0Var, mutableFloatState, mutableState2);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                ImageKt.Image(painterResource, "", ZIndexModifierKt.zIndex(ClickableKt.m235clickableXHw0xAI$default(m201backgroundbw27NRU$default, false, null, null, (v3.a) rememberedValue, 7, null), 1.0f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.manager.e$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0363b extends n0 implements v3.a<r2> {
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0363b(Context context) {
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
                if (context instanceof ManagerActivity) {
                    ((ManagerActivity) context).finish();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState<Integer> mutableState, x0<Boolean> x0Var, MutableFloatState mutableFloatState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, Context context) {
            super(2);
            this.$clickCount$delegate = mutableState;
            this.$showLocation$delegate = x0Var;
            this.$angle$delegate = mutableFloatState;
            this.$showLocationFunction$delegate = mutableState2;
            this.$showOverlay$delegate = mutableState3;
            this.$context = context;
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
                ComposerKt.traceEventStart(-1499322423, i5, -1, "com.yuanqi.master.manager.ManagerScreen.<anonymous> (ManagerScreen.kt:135)");
            }
            com.yuanqi.master.tools.a.f(StringResources_androidKt.stringResource(R.string.application_management, composer, 6), ComposableLambdaKt.composableLambda(composer, 541658894, true, new a(this.$clickCount$delegate, this.$showLocation$delegate, this.$angle$delegate, this.$showLocationFunction$delegate, this.$showOverlay$delegate)), new C0363b(this.$context), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nManagerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerScreen.kt\ncom/yuanqi/master/manager/ManagerScreenKt$ManagerScreen$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,351:1\n154#2:352\n154#2:388\n154#2:389\n154#2:390\n154#2:391\n154#2:392\n164#2:393\n154#2:394\n154#2:395\n74#3,6:353\n80#3:387\n84#3:408\n79#4,11:359\n92#4:407\n456#5,8:370\n464#5,3:384\n50#5:396\n49#5:397\n467#5,3:404\n3737#6,6:378\n1116#7,6:398\n*S KotlinDebug\n*F\n+ 1 ManagerScreen.kt\ncom/yuanqi/master/manager/ManagerScreenKt$ManagerScreen$3\n*L\n320#1:352\n323#1:388\n327#1:389\n329#1:390\n334#1:391\n336#1:392\n342#1:393\n343#1:394\n344#1:395\n316#1:353,6\n316#1:387\n316#1:408\n316#1:359,11\n316#1:407\n316#1:370,8\n316#1:384,3\n338#1:396\n338#1:397\n316#1:404,3\n316#1:378,6\n338#1:398,6\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class c extends n0 implements q<PaddingValues, Composer, Integer, r2> {
        final /* synthetic */ int $CLICK_INTERVAL;
        final /* synthetic */ MutableFloatState $angle$delegate;
        final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $changeLocationResultLauncher;
        final /* synthetic */ MutableState<Integer> $clickCount$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ k1.g $lastClickTime;
        final /* synthetic */ x0<Boolean> $lightGuide$delegate;
        final /* synthetic */ ManagedActivityResultLauncher<String[], Map<String, Boolean>> $locationPermissionResultLauncher;
        final /* synthetic */ ManagerViewModel $managerViewModel;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ x0<Boolean> $showLocation$delegate;
        final /* synthetic */ MutableState<Boolean> $showLocationFunction$delegate;
        final /* synthetic */ MutableState<Boolean> $showOverlay$delegate;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nManagerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerScreen.kt\ncom/yuanqi/master/manager/ManagerScreenKt$ManagerScreen$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,351:1\n154#2:352\n154#2:388\n154#2:389\n154#2:390\n154#2:426\n154#2:462\n154#2:463\n154#2:500\n154#2:506\n154#2:507\n154#2:508\n74#3,6:353\n80#3:387\n73#3,7:464\n80#3:499\n84#3:505\n84#3:562\n79#4,11:359\n79#4,11:397\n79#4,11:433\n79#4,11:471\n92#4:504\n79#4,11:514\n92#4:546\n92#4:551\n92#4:556\n92#4:561\n456#5,8:370\n464#5,3:384\n456#5,8:408\n464#5,3:422\n456#5,8:444\n464#5,3:458\n456#5,8:482\n464#5,3:496\n467#5,3:501\n456#5,8:525\n464#5,3:539\n467#5,3:543\n467#5,3:548\n467#5,3:553\n467#5,3:558\n3737#6,6:378\n3737#6,6:416\n3737#6,6:452\n3737#6,6:490\n3737#6,6:533\n68#7,6:391\n74#7:425\n69#7,5:509\n74#7:542\n78#7:547\n78#7:557\n87#8,6:427\n93#8:461\n97#8:552\n*S KotlinDebug\n*F\n+ 1 ManagerScreen.kt\ncom/yuanqi/master/manager/ManagerScreenKt$ManagerScreen$3$1\n*L\n174#1:352\n179#1:388\n180#1:389\n182#1:390\n185#1:426\n190#1:462\n195#1:463\n205#1:500\n219#1:506\n220#1:507\n221#1:508\n170#1:353,6\n170#1:387\n197#1:464,7\n197#1:499\n197#1:505\n170#1:562\n170#1:359,11\n177#1:397,11\n184#1:433,11\n197#1:471,11\n197#1:504\n217#1:514,11\n217#1:546\n184#1:551\n177#1:556\n170#1:561\n170#1:370,8\n170#1:384,3\n177#1:408,8\n177#1:422,3\n184#1:444,8\n184#1:458,3\n197#1:482,8\n197#1:496,3\n197#1:501,3\n217#1:525,8\n217#1:539,3\n217#1:543,3\n184#1:548,3\n177#1:553,3\n170#1:558,3\n170#1:378,6\n177#1:416,6\n184#1:452,6\n197#1:490,6\n217#1:533,6\n177#1:391,6\n177#1:425\n217#1:509,5\n217#1:542\n217#1:547\n177#1:557\n184#1:427,6\n184#1:461\n184#1:552\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements q<BoxScope, Composer, Integer, r2> {
            final /* synthetic */ int $CLICK_INTERVAL;
            final /* synthetic */ MutableFloatState $angle$delegate;
            final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $changeLocationResultLauncher;
            final /* synthetic */ MutableState<Integer> $clickCount$delegate;
            final /* synthetic */ Context $context;
            final /* synthetic */ PaddingValues $it;
            final /* synthetic */ k1.g $lastClickTime;
            final /* synthetic */ ManagedActivityResultLauncher<String[], Map<String, Boolean>> $locationPermissionResultLauncher;
            final /* synthetic */ ManagerViewModel $managerViewModel;
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ x0<Boolean> $showLocation$delegate;
            final /* synthetic */ MutableState<Boolean> $showLocationFunction$delegate;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.manager.e$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0364a extends n0 implements v3.a<r2> {
                final /* synthetic */ int $CLICK_INTERVAL;
                final /* synthetic */ Context $context;
                final /* synthetic */ k1.g $lastClickTime;
                final /* synthetic */ ManagerViewModel $managerViewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0364a(k1.g gVar, int i5, ManagerViewModel managerViewModel, Context context) {
                    super(0);
                    this.$lastClickTime = gVar;
                    this.$CLICK_INTERVAL = i5;
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
                    long currentTimeMillis = System.currentTimeMillis();
                    k1.g gVar = this.$lastClickTime;
                    if (currentTimeMillis - gVar.element < this.$CLICK_INTERVAL) {
                        return;
                    }
                    gVar.element = currentTimeMillis;
                    this.$managerViewModel.O(this.$context);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class b extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;
                final /* synthetic */ ManagerViewModel $managerViewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(ManagerViewModel managerViewModel, Context context) {
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
                    this.$managerViewModel.Q(this.$context);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.manager.e$c$a$c, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0365c extends n0 implements p<Composer, Integer, r2> {
                final /* synthetic */ State<String> $noteStr;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0365c(State<String> state) {
                    super(2);
                    this.$noteStr = state;
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
                        ComposerKt.traceEventStart(-511623044, i5, -1, "com.yuanqi.master.manager.ManagerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManagerScreen.kt:250)");
                    }
                    TextKt.m2452Text4IGK_g(this.$noteStr.getValue(), (Modifier) null, com.yuanqi.master.theme.b.Q(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3456, 0, 131058);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class d extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;
                final /* synthetic */ ManagerViewModel $managerViewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(ManagerViewModel managerViewModel, Context context) {
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
                    this.$managerViewModel.g0(this.$context);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.manager.e$c$a$e, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0366e extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;
                final /* synthetic */ ManagerViewModel $managerViewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0366e(ManagerViewModel managerViewModel, Context context) {
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
                    this.$managerViewModel.T(this.$context);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class f extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;
                final /* synthetic */ ManagerViewModel $managerViewModel;
                final /* synthetic */ NavHostController $navController;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(ManagerViewModel managerViewModel, Context context, NavHostController navHostController) {
                    super(0);
                    this.$managerViewModel = managerViewModel;
                    this.$context = context;
                    this.$navController = navHostController;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$managerViewModel.l0(this.$context, this.$navController);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class g extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;
                final /* synthetic */ ManagerViewModel $managerViewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(ManagerViewModel managerViewModel, Context context) {
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
                    ManagerViewModel managerViewModel = this.$managerViewModel;
                    Context context = this.$context;
                    String D = managerViewModel.D();
                    l0.m(D);
                    managerViewModel.m0(context, D, this.$managerViewModel.G());
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class h extends n0 implements q<AnimatedVisibilityScope, Composer, Integer, r2> {
                final /* synthetic */ MutableFloatState $angle$delegate;
                final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $changeLocationResultLauncher;
                final /* synthetic */ MutableState<Integer> $clickCount$delegate;
                final /* synthetic */ Context $context;
                final /* synthetic */ ManagedActivityResultLauncher<String[], Map<String, Boolean>> $locationPermissionResultLauncher;
                final /* synthetic */ ManagerViewModel $managerViewModel;
                final /* synthetic */ x0<Boolean> $showLocation$delegate;
                final /* synthetic */ MutableState<Boolean> $showLocationFunction$delegate;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @r1({"SMAP\nManagerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerScreen.kt\ncom/yuanqi/master/manager/ManagerScreenKt$ManagerScreen$3$1$1$8$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,351:1\n37#2,2:352\n*S KotlinDebug\n*F\n+ 1 ManagerScreen.kt\ncom/yuanqi/master/manager/ManagerScreenKt$ManagerScreen$3$1$1$8$1\n*L\n300#1:352,2\n*E\n"})
                /* renamed from: com.yuanqi.master.manager.e$c$a$h$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0367a extends n0 implements v3.a<r2> {
                    final /* synthetic */ MutableFloatState $angle$delegate;
                    final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $changeLocationResultLauncher;
                    final /* synthetic */ MutableState<Integer> $clickCount$delegate;
                    final /* synthetic */ Context $context;
                    final /* synthetic */ ManagedActivityResultLauncher<String[], Map<String, Boolean>> $locationPermissionResultLauncher;
                    final /* synthetic */ ManagerViewModel $managerViewModel;
                    final /* synthetic */ x0<Boolean> $showLocation$delegate;
                    final /* synthetic */ MutableState<Boolean> $showLocationFunction$delegate;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.manager.e$c$a$h$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0368a extends n0 implements v3.a<r2> {
                        final /* synthetic */ MutableFloatState $angle$delegate;
                        final /* synthetic */ MutableState<Integer> $clickCount$delegate;
                        final /* synthetic */ x0<Boolean> $showLocation$delegate;
                        final /* synthetic */ MutableState<Boolean> $showLocationFunction$delegate;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0368a(x0<Boolean> x0Var, MutableState<Boolean> mutableState, MutableFloatState mutableFloatState, MutableState<Integer> mutableState2) {
                            super(0);
                            this.$showLocation$delegate = x0Var;
                            this.$showLocationFunction$delegate = mutableState;
                            this.$angle$delegate = mutableFloatState;
                            this.$clickCount$delegate = mutableState2;
                        }

                        @Override // v3.a
                        public /* bridge */ /* synthetic */ r2 invoke() {
                            invoke2();
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            e.o(this.$showLocation$delegate, false);
                            f1.r("隐藏位置保护", 0, 2, null);
                            e.d(this.$showLocationFunction$delegate, e.n(this.$showLocation$delegate));
                            e.f(this.$angle$delegate, 180.0f);
                            e.m(this.$clickCount$delegate, 0);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0367a(Context context, ManagerViewModel managerViewModel, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, ManagedActivityResultLauncher<String[], Map<String, Boolean>> managedActivityResultLauncher2, x0<Boolean> x0Var, MutableState<Boolean> mutableState, MutableFloatState mutableFloatState, MutableState<Integer> mutableState2) {
                        super(0);
                        this.$context = context;
                        this.$managerViewModel = managerViewModel;
                        this.$changeLocationResultLauncher = managedActivityResultLauncher;
                        this.$locationPermissionResultLauncher = managedActivityResultLauncher2;
                        this.$showLocation$delegate = x0Var;
                        this.$showLocationFunction$delegate = mutableState;
                        this.$angle$delegate = mutableFloatState;
                        this.$clickCount$delegate = mutableState2;
                    }

                    @Override // v3.a
                    public /* bridge */ /* synthetic */ r2 invoke() {
                        invoke2();
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        List L;
                        if (f1.j(this.$context)) {
                            ManagerViewModel managerViewModel = this.$managerViewModel;
                            Context context = this.$context;
                            ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher = this.$changeLocationResultLauncher;
                            String D = managerViewModel.D();
                            l0.m(D);
                            managerViewModel.n0(context, managedActivityResultLauncher, D, this.$managerViewModel.G(), new C0368a(this.$showLocation$delegate, this.$showLocationFunction$delegate, this.$angle$delegate, this.$clickCount$delegate));
                            return;
                        }
                        ActivityResultLauncher activityResultLauncher = this.$locationPermissionResultLauncher;
                        L = w.L("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
                        activityResultLauncher.launch(L.toArray(new String[0]));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(Context context, ManagerViewModel managerViewModel, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, ManagedActivityResultLauncher<String[], Map<String, Boolean>> managedActivityResultLauncher2, x0<Boolean> x0Var, MutableState<Boolean> mutableState, MutableFloatState mutableFloatState, MutableState<Integer> mutableState2) {
                    super(3);
                    this.$context = context;
                    this.$managerViewModel = managerViewModel;
                    this.$changeLocationResultLauncher = managedActivityResultLauncher;
                    this.$locationPermissionResultLauncher = managedActivityResultLauncher2;
                    this.$showLocation$delegate = x0Var;
                    this.$showLocationFunction$delegate = mutableState;
                    this.$angle$delegate = mutableFloatState;
                    this.$clickCount$delegate = mutableState2;
                }

                @Override // v3.q
                public /* bridge */ /* synthetic */ r2 invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                    invoke(animatedVisibilityScope, composer, num.intValue());
                    return r2.f19517a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@l AnimatedVisibilityScope AnimatedVisibility, @m Composer composer, int i5) {
                    l0.p(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(828822093, i5, -1, "com.yuanqi.master.manager.ManagerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManagerScreen.kt:276)");
                    }
                    com.yuanqi.master.tools.a.m(R.mipmap.menu_virtual_location, StringResources_androidKt.stringResource(R.string.virtual_location, composer, 6), null, null, new C0367a(this.$context, this.$managerViewModel, this.$changeLocationResultLauncher, this.$locationPermissionResultLauncher, this.$showLocation$delegate, this.$showLocationFunction$delegate, this.$angle$delegate, this.$clickCount$delegate), composer, 6, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaddingValues paddingValues, ManagerViewModel managerViewModel, Context context, k1.g gVar, int i5, NavHostController navHostController, MutableState<Boolean> mutableState, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, ManagedActivityResultLauncher<String[], Map<String, Boolean>> managedActivityResultLauncher2, x0<Boolean> x0Var, MutableFloatState mutableFloatState, MutableState<Integer> mutableState2) {
                super(3);
                this.$it = paddingValues;
                this.$managerViewModel = managerViewModel;
                this.$context = context;
                this.$lastClickTime = gVar;
                this.$CLICK_INTERVAL = i5;
                this.$navController = navHostController;
                this.$showLocationFunction$delegate = mutableState;
                this.$changeLocationResultLauncher = managedActivityResultLauncher;
                this.$locationPermissionResultLauncher = managedActivityResultLauncher2;
                this.$showLocation$delegate = x0Var;
                this.$angle$delegate = mutableFloatState;
                this.$clickCount$delegate = mutableState2;
            }

            @Override // v3.q
            public /* bridge */ /* synthetic */ r2 invoke(BoxScope boxScope, Composer composer, Integer num) {
                invoke(boxScope, composer, num.intValue());
                return r2.f19517a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@l BoxScope GradientBox, @m Composer composer, int i5) {
                Bitmap bitmap$default;
                l0.p(GradientBox, "$this$GradientBox");
                if ((i5 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1449972443, i5, -1, "com.yuanqi.master.manager.ManagerScreen.<anonymous>.<anonymous> (ManagerScreen.kt:169)");
                }
                Modifier.Companion companion = Modifier.Companion;
                float f5 = 10;
                Modifier verticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m555paddingVpY3zN4$default(SizeKt.fillMaxSize$default(PaddingKt.padding(companion, this.$it), 0.0f, 1, null), 0.0f, Dp.m6044constructorimpl(f5), 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                ManagerViewModel managerViewModel = this.$managerViewModel;
                Context context = this.$context;
                k1.g gVar = this.$lastClickTime;
                int i6 = this.$CLICK_INTERVAL;
                NavHostController navHostController = this.$navController;
                MutableState<Boolean> mutableState = this.$showLocationFunction$delegate;
                ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher = this.$changeLocationResultLauncher;
                ManagedActivityResultLauncher<String[], Map<String, Boolean>> managedActivityResultLauncher2 = this.$locationPermissionResultLauncher;
                x0<Boolean> x0Var = this.$showLocation$delegate;
                MutableFloatState mutableFloatState = this.$angle$delegate;
                MutableState<Integer> mutableState2 = this.$clickCount$delegate;
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
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(verticalScroll$default);
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
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier m201backgroundbw27NRU$default = BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m555paddingVpY3zN4$default(companion, Dp.m6044constructorimpl(f5), 0.0f, 2, null), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f5))), com.yuanqi.master.theme.b.k(), null, 2, null);
                float f6 = 15;
                Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(m201backgroundbw27NRU$default, Dp.m6044constructorimpl(f6), 0.0f, 2, null);
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
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
                Modifier m555paddingVpY3zN4$default2 = PaddingKt.m555paddingVpY3zN4$default(companion, 0.0f, Dp.m6044constructorimpl(f6), 1, null);
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default2);
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
                Modifier m602size3ABfNKs = SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(50));
                Drawable y4 = managerViewModel.y(context);
                ImageBitmap asImageBitmap = (y4 == null || (bitmap$default = DrawableKt.toBitmap$default(y4, 0, 0, null, 7, null)) == null) ? null : AndroidImageBitmap_androidKt.asImageBitmap(bitmap$default);
                composer.startReplaceableGroup(543807555);
                ImageBitmap imageResource = asImageBitmap == null ? ImageResources_androidKt.imageResource(ImageBitmap.Companion, R.drawable.android, composer, 56) : asImageBitmap;
                composer.endReplaceableGroup();
                ImageKt.m257Image5hnEew(imageResource, "", m602size3ABfNKs, null, null, 0.0f, null, 0, composer, 440, 248);
                float f7 = 20;
                SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, Dp.m6044constructorimpl(f7)), composer, 6);
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
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
                Updater.m3271setimpl(m3264constructorimpl4, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl4.getInserting() || !l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                TextKt.m2452Text4IGK_g(String.valueOf(managerViewModel.v()), (Modifier) null, com.yuanqi.master.theme.b.L(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, new TextStyle(0L, TextUnitKt.getSp(15), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777213, (kotlin.jvm.internal.w) null), composer, 384, 1572864, 65530);
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(5)), composer, 6);
                TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.version, composer, 6) + " : " + managerViewModel.H(context), (Modifier) null, com.yuanqi.master.theme.b.Q(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, new TextStyle(0L, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777213, (kotlin.jvm.internal.w) null), composer, 384, 1572864, 65530);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
                Modifier m235clickableXHw0xAI$default = ClickableKt.m235clickableXHw0xAI$default(BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(SizeKt.m588height3ABfNKs(SizeKt.m607width3ABfNKs(companion, Dp.m6044constructorimpl(100)), Dp.m6044constructorimpl(40)), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f7))), com.yuanqi.master.theme.b.o(), null, 2, null), false, null, null, new C0364a(gVar, i6, managerViewModel, context), 7, null);
                Alignment center = companion2.getCenter();
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor5 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(m235clickableXHw0xAI$default);
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
                TextKt.m2452Text4IGK_g("启动", (Modifier) null, Color.Companion.m3771getWhite0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3462, 0, 131058);
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
                com.yuanqi.master.tools.a.m(R.mipmap.menu_short_cut, StringResources_androidKt.stringResource(R.string.desktop_shortcuts, composer, 6), null, null, new b(managerViewModel, context), composer, 6, 12);
                com.yuanqi.master.tools.a.m(R.mipmap.menu_note, StringResources_androidKt.stringResource(R.string.set_note, composer, 6), null, ComposableLambdaKt.composableLambda(composer, -511623044, true, new C0365c(SnapshotStateKt.collectAsState(managerViewModel.B(), null, composer, 8, 1))), new d(managerViewModel, context), composer, 3078, 4);
                com.yuanqi.master.tools.a.m(R.mipmap.menu_pwd, (String) SnapshotStateKt.collectAsState(managerViewModel.E(), null, composer, 8, 1).getValue(), null, null, new C0366e(managerViewModel, context), composer, 6, 12);
                com.yuanqi.master.tools.a.m(R.mipmap.mine_change_device, StringResources_androidKt.stringResource(R.string.one_click_change, composer, 6), null, null, new f(managerViewModel, context, navHostController), composer, 6, 12);
                com.yuanqi.master.tools.a.m(R.mipmap.menu_app_clear, StringResources_androidKt.stringResource(R.string.menu_clear_cache, composer, 6), null, null, new g(managerViewModel, context), composer, 6, 12);
                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, e.c(mutableState), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 828822093, true, new h(context, managerViewModel, managedActivityResultLauncher, managedActivityResultLauncher2, x0Var, mutableState, mutableFloatState, mutableState2)), composer, 1572870, 30);
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
        /* loaded from: classes3.dex */
        public static final class b extends n0 implements v3.a<r2> {
            final /* synthetic */ x0<Boolean> $lightGuide$delegate;
            final /* synthetic */ MutableState<Boolean> $showOverlay$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(x0<Boolean> x0Var, MutableState<Boolean> mutableState) {
                super(0);
                this.$lightGuide$delegate = x0Var;
                this.$showOverlay$delegate = mutableState;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                e.h(this.$lightGuide$delegate, false);
                e.j(this.$showOverlay$delegate, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ManagerViewModel managerViewModel, Context context, k1.g gVar, int i5, NavHostController navHostController, MutableState<Boolean> mutableState, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, ManagedActivityResultLauncher<String[], Map<String, Boolean>> managedActivityResultLauncher2, x0<Boolean> x0Var, MutableFloatState mutableFloatState, MutableState<Integer> mutableState2, MutableState<Boolean> mutableState3, x0<Boolean> x0Var2) {
            super(3);
            this.$managerViewModel = managerViewModel;
            this.$context = context;
            this.$lastClickTime = gVar;
            this.$CLICK_INTERVAL = i5;
            this.$navController = navHostController;
            this.$showLocationFunction$delegate = mutableState;
            this.$changeLocationResultLauncher = managedActivityResultLauncher;
            this.$locationPermissionResultLauncher = managedActivityResultLauncher2;
            this.$showLocation$delegate = x0Var;
            this.$angle$delegate = mutableFloatState;
            this.$clickCount$delegate = mutableState2;
            this.$showOverlay$delegate = mutableState3;
            this.$lightGuide$delegate = x0Var2;
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
                ComposerKt.traceEventStart(2076842516, i5, -1, "com.yuanqi.master.manager.ManagerScreen.<anonymous> (ManagerScreen.kt:168)");
            }
            com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, 1449972443, true, new a(it, this.$managerViewModel, this.$context, this.$lastClickTime, this.$CLICK_INTERVAL, this.$navController, this.$showLocationFunction$delegate, this.$changeLocationResultLauncher, this.$locationPermissionResultLauncher, this.$showLocation$delegate, this.$angle$delegate, this.$clickCount$delegate)), composer, 6);
            if (e.i(this.$showOverlay$delegate)) {
                Modifier.Companion companion = Modifier.Companion;
                float f5 = 30;
                Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(BackgroundKt.m201backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), com.yuanqi.master.theme.b.K2(), null, 2, null), 0.0f, 0.0f, Dp.m6044constructorimpl(f5), 0.0f, 11, null);
                Alignment.Horizontal end = Alignment.Companion.getEnd();
                x0<Boolean> x0Var = this.$lightGuide$delegate;
                MutableState<Boolean> mutableState = this.$showOverlay$delegate;
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer, 48);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                v3.a<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f6 = 64;
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(f6)), composer, 6);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.ic_guide_right, composer, 6), "", SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(80)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
                float f7 = 32;
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(f7)), composer, 6);
                Color.Companion companion3 = Color.Companion;
                TextKt.m2452Text4IGK_g("右上角 💡 连续点击5次后可以 隐藏/显示 位置保护功能入口。", PaddingKt.m557paddingqDBjuR0$default(companion, Dp.m6044constructorimpl(f6), 0.0f, 0.0f, 0.0f, 14, null), companion3.m3771getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3510, 0, 131056);
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(f7)), composer, 6);
                BorderStroke m228BorderStrokecXLIe8U = BorderStrokeKt.m228BorderStrokecXLIe8U(Dp.m6044constructorimpl((float) 2.0d), companion3.m3771getWhite0d7_KjU());
                RoundedCornerShape m823RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(8));
                Modifier m557paddingqDBjuR0$default2 = PaddingKt.m557paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m6044constructorimpl(f5), 0.0f, 11, null);
                composer.startReplaceableGroup(511388516);
                boolean changed = composer.changed(x0Var) | composer.changed(mutableState);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new b(x0Var, mutableState);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                ButtonKt.OutlinedButton((v3.a) rememberedValue, m557paddingqDBjuR0$default2, false, m823RoundedCornerShape0680j_4, null, null, m228BorderStrokecXLIe8U, null, null, com.yuanqi.master.manager.c.f14748a.a(), composer, 806879280, 436);
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
            e.a(this.$navController, this.$managerViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Landroidx/activity/result/ActivityResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.manager.e$e, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0369e extends n0 implements v3.l<ActivityResult, r2> {
        final /* synthetic */ ManagerViewModel $managerViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0369e(ManagerViewModel managerViewModel) {
            super(1);
            this.$managerViewModel = managerViewModel;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ActivityResult activityResult) {
            invoke2(activityResult);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l ActivityResult result) {
            l0.p(result, "result");
            if (result.getResultCode() == -1) {
                Intent data = result.getData();
                this.$managerViewModel.R(data != null ? (VLocation) data.getParcelableExtra(com.yuanqi.group.c.f13757k) : null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends n0 implements v3.l<Map<String, Boolean>, r2> {
        final /* synthetic */ MutableState<Boolean> $locationPermissionState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(MutableState<Boolean> mutableState) {
            super(1);
            this.$locationPermissionState$delegate = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Map<String, Boolean> map) {
            invoke2(map);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l Map<String, Boolean> it) {
            l0.p(it, "it");
            MutableState<Boolean> mutableState = this.$locationPermissionState$delegate;
            Boolean bool = it.get("android.permission.ACCESS_FINE_LOCATION");
            Boolean bool2 = Boolean.TRUE;
            e.k(mutableState, l0.g(bool, bool2) || l0.g(it.get("android.permission.ACCESS_COARSE_LOCATION"), bool2));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@l NavHostController navController, @m ManagerViewModel managerViewModel, @m Composer composer, int i5, int i6) {
        ManagerViewModel managerViewModel2;
        float f5;
        CreationExtras creationExtras;
        l0.p(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(674810117);
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
            ComposerKt.traceEventStart(674810117, i5, -1, "com.yuanqi.master.manager.ManagerScreen (ManagerScreen.kt:80)");
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
        ActivityResultContracts.RequestMultiplePermissions requestMultiplePermissions = new ActivityResultContracts.RequestMultiplePermissions();
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(mutableState);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new f(mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions, (v3.l) rememberedValue2, startRestartGroup, 8);
        ManagedActivityResultLauncher rememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.StartActivityForResult(), new C0369e(managerViewModel2), startRestartGroup, 8);
        Boolean bool = Boolean.TRUE;
        EffectsKt.LaunchedEffect(bool, new a(managerViewModel2, context, null), startRestartGroup, 70);
        k1.g gVar = new k1.g();
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue3;
        x0 x0Var = new x0(com.yuanqi.master.config.c.V, Boolean.valueOf(com.yuanqi.master.mine.account.a.f14786a.j()));
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) rememberedValue4;
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == companion.getEmpty()) {
            if (c(mutableState3)) {
                f5 = 0.0f;
            } else {
                f5 = 180.0f;
            }
            rememberedValue5 = PrimitiveSnapshotStateKt.mutableFloatStateOf(f5);
            startRestartGroup.updateRememberedValue(rememberedValue5);
        }
        startRestartGroup.endReplaceableGroup();
        MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue5;
        x0 x0Var2 = new x0(com.yuanqi.master.config.c.Q, bool);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == companion.getEmpty()) {
            rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(g(x0Var2)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue6);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState4 = (MutableState) rememberedValue6;
        ManagerViewModel managerViewModel3 = managerViewModel2;
        ScaffoldKt.m2107ScaffoldTvnljyQ(null, ComposableLambdaKt.composableLambda(startRestartGroup, -1499322423, true, new b(mutableState2, x0Var, mutableFloatState, mutableState3, mutableState4, context)), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, 2076842516, true, new c(managerViewModel2, context, gVar, 1000, navController, mutableState3, rememberLauncherForActivityResult2, rememberLauncherForActivityResult, x0Var, mutableFloatState, mutableState2, mutableState4, x0Var2)), startRestartGroup, 805306416, 509);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(navController, managerViewModel3, i5, i6));
        }
    }

    private static final boolean b(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MutableState<Boolean> mutableState, boolean z4) {
        mutableState.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(MutableFloatState mutableFloatState, float f5) {
        mutableFloatState.setFloatValue(f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(x0<Boolean> x0Var) {
        return x0Var.getValue(null, f14750a[1]).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(x0<Boolean> x0Var, boolean z4) {
        x0Var.setValue(null, f14750a[1], Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(MutableState<Boolean> mutableState, boolean z4) {
        mutableState.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(MutableState<Boolean> mutableState, boolean z4) {
        mutableState.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(MutableState<Integer> mutableState, int i5) {
        mutableState.setValue(Integer.valueOf(i5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(x0<Boolean> x0Var) {
        return x0Var.getValue(null, f14750a[0]).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(x0<Boolean> x0Var, boolean z4) {
        x0Var.setValue(null, f14750a[0], Boolean.valueOf(z4));
    }
}
