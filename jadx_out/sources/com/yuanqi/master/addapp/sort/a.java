package com.yuanqi.master.addapp.sort;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ImageResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import androidx.core.graphics.drawable.DrawableKt;
import androidx.navigation.NavHostController;
import com.alipay.sdk.m.x.d;
import com.android.dx.io.Opcodes;
import com.lody.virtual.client.core.VirtualCore;
import com.yqtech.multiapp.R;
import com.yuanqi.master.addapp.AddAppActivity;
import com.yuanqi.master.addapp.AddAppViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.burnoutcrew.reorderable.g;
import org.burnoutcrew.reorderable.j;
import org.burnoutcrew.reorderable.k;
import p4.l;
import p4.m;
import v3.p;
import v3.q;
import v3.r;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0016\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"SortScreen", "", "navController", "Landroidx/navigation/NavHostController;", "addAppViewModel", "Lcom/yuanqi/master/addapp/AddAppViewModel;", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V", d.f3029u, com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nSortScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,212:1\n81#2,11:213\n74#3:224\n*S KotlinDebug\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt\n*L\n63#1:213,11\n68#1:224\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.addapp.sort.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0316a extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ Context $context;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.addapp.sort.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0317a extends n0 implements v3.a<r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0317a(AddAppViewModel addAppViewModel, Context context) {
                super(0);
                this.$addAppViewModel = addAppViewModel;
                this.$context = context;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a.b(this.$addAppViewModel, this.$context);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0316a(AddAppViewModel addAppViewModel, Context context) {
            super(2);
            this.$addAppViewModel = addAppViewModel;
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
                ComposerKt.traceEventStart(207349497, i5, -1, "com.yuanqi.master.addapp.sort.SortScreen.<anonymous> (SortScreen.kt:71)");
            }
            com.yuanqi.master.tools.a.f(StringResources_androidKt.stringResource(R.string.menu_sort, composer, 6), null, new C0317a(this.$addAppViewModel, this.$context), composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements q<PaddingValues, Composer, Integer, r2> {
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ Context $context;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nSortScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt$SortScreen$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,212:1\n154#2:213\n154#2:248\n154#2:280\n154#2:317\n154#2:328\n75#3,5:214\n80#3:247\n84#3:340\n79#4,11:219\n79#4,11:251\n79#4,11:288\n92#4:321\n92#4:326\n92#4:339\n456#5,8:230\n464#5,3:244\n456#5,8:262\n464#5,3:276\n456#5,8:299\n464#5,3:313\n467#5,3:318\n467#5,3:323\n25#5:329\n467#5,3:336\n3737#6,6:238\n3737#6,6:270\n3737#6,6:307\n91#7,2:249\n93#7:279\n86#7,7:281\n93#7:316\n97#7:322\n97#7:327\n1116#8,6:330\n*S KotlinDebug\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt$SortScreen$2$1\n*L\n81#1:213\n84#1:248\n90#1:280\n116#1:317\n134#1:328\n78#1:214,5\n78#1:247\n78#1:340\n78#1:219,11\n85#1:251,11\n98#1:288,11\n98#1:321\n85#1:326\n78#1:339\n78#1:230,8\n78#1:244,3\n85#1:262,8\n85#1:276,3\n98#1:299,8\n98#1:313,3\n98#1:318,3\n85#1:323,3\n136#1:329\n78#1:336,3\n78#1:238,6\n85#1:270,6\n98#1:307,6\n85#1:249,2\n85#1:279\n98#1:281,7\n98#1:316\n98#1:322\n85#1:327\n136#1:330,6\n*E\n"})
        /* renamed from: com.yuanqi.master.addapp.sort.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0318a extends n0 implements q<BoxScope, Composer, Integer, r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;
            final /* synthetic */ PaddingValues $it;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nSortScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt$SortScreen$2$1$1$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,212:1\n154#2:213\n154#2:214\n*S KotlinDebug\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt$SortScreen$2$1$1$1$1$1\n*L\n106#1:213\n107#1:214\n*E\n"})
            /* renamed from: com.yuanqi.master.addapp.sort.a$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0319a extends n0 implements q<AnimatedVisibilityScope, Composer, Integer, r2> {
                final /* synthetic */ AddAppViewModel $addAppViewModel;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.addapp.sort.a$b$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0320a extends n0 implements v3.a<r2> {
                    final /* synthetic */ AddAppViewModel $addAppViewModel;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0320a(AddAppViewModel addAppViewModel) {
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
                        this.$addAppViewModel.p().setValue(Integer.valueOf(Math.max(3, this.$addAppViewModel.p().getValue().intValue() - 1)));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0319a(AddAppViewModel addAppViewModel) {
                    super(3);
                    this.$addAppViewModel = addAppViewModel;
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
                        ComposerKt.traceEventStart(-1138395459, i5, -1, "com.yuanqi.master.addapp.sort.SortScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SortScreen.kt:102)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.app_minus, composer, 6), (String) null, ClickableKt.m235clickableXHw0xAI$default(PaddingKt.m553padding3ABfNKs(SizeKt.m602size3ABfNKs(Modifier.Companion, Dp.m6044constructorimpl(30)), Dp.m6044constructorimpl(3)), false, null, null, new C0320a(this.$addAppViewModel), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nSortScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt$SortScreen$2$1$1$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,212:1\n154#2:213\n*S KotlinDebug\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt$SortScreen$2$1$1$1$1$2\n*L\n125#1:213\n*E\n"})
            /* renamed from: com.yuanqi.master.addapp.sort.a$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0321b extends n0 implements q<AnimatedVisibilityScope, Composer, Integer, r2> {
                final /* synthetic */ AddAppViewModel $addAppViewModel;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.addapp.sort.a$b$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0322a extends n0 implements v3.a<r2> {
                    final /* synthetic */ AddAppViewModel $addAppViewModel;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0322a(AddAppViewModel addAppViewModel) {
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
                        this.$addAppViewModel.p().setValue(Integer.valueOf(Math.min(6, this.$addAppViewModel.p().getValue().intValue() + 1)));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0321b(AddAppViewModel addAppViewModel) {
                    super(3);
                    this.$addAppViewModel = addAppViewModel;
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
                        ComposerKt.traceEventStart(-936065740, i5, -1, "com.yuanqi.master.addapp.sort.SortScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SortScreen.kt:121)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.app_add, composer, 6), (String) null, ClickableKt.m235clickableXHw0xAI$default(SizeKt.m602size3ABfNKs(Modifier.Companion, Dp.m6044constructorimpl(24)), false, null, null, new C0322a(this.$addAppViewModel), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nSortScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt$SortScreen$2$1$1$2\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,212:1\n139#2,12:213\n*S KotlinDebug\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt$SortScreen$2$1$1$2\n*L\n148#1:213,12\n*E\n"})
            /* renamed from: com.yuanqi.master.addapp.sort.a$b$a$c */
            /* loaded from: classes3.dex */
            public static final class c extends n0 implements v3.l<LazyListScope, r2> {
                final /* synthetic */ MutableState<ArrayList<com.yuanqi.master.config.e>> $dataList;
                final /* synthetic */ j $state;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "item", "Lcom/yuanqi/master/config/SortApp;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.addapp.sort.a$b$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0323a extends n0 implements v3.l<com.yuanqi.master.config.e, Object> {
                    public static final C0323a INSTANCE = new C0323a();

                    C0323a() {
                        super(1);
                    }

                    @Override // v3.l
                    @l
                    public final Object invoke(@l com.yuanqi.master.config.e item) {
                        l0.p(item, "item");
                        return item.c();
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "dragging", "", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;ZLandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @r1({"SMAP\nSortScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt$SortScreen$2$1$1$2$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,212:1\n154#2:213\n154#2:214\n154#2:215\n154#2:216\n154#2:252\n154#2:253\n154#2:254\n87#3,6:217\n93#3:251\n97#3:259\n79#4,11:223\n92#4:258\n456#5,8:234\n464#5,3:248\n467#5,3:255\n3737#6,6:242\n*S KotlinDebug\n*F\n+ 1 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt$SortScreen$2$1$1$2$2$1\n*L\n163#1:213\n164#1:214\n165#1:215\n168#1:216\n172#1:252\n177#1:253\n188#1:254\n160#1:217,6\n160#1:251\n160#1:259\n160#1:223,11\n160#1:258\n160#1:234,8\n160#1:248,3\n160#1:255,3\n160#1:242,6\n*E\n"})
                /* renamed from: com.yuanqi.master.addapp.sort.a$b$a$c$b, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0324b extends n0 implements r<BoxScope, Boolean, Composer, Integer, r2> {
                    final /* synthetic */ com.yuanqi.master.config.e $item;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0324b(com.yuanqi.master.config.e eVar) {
                        super(4);
                        this.$item = eVar;
                    }

                    @Override // v3.r
                    public /* bridge */ /* synthetic */ r2 invoke(BoxScope boxScope, Boolean bool, Composer composer, Integer num) {
                        invoke(boxScope, bool.booleanValue(), composer, num.intValue());
                        return r2.f19517a;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@l BoxScope ReorderableItem, boolean z4, @m Composer composer, int i5) {
                        int i6;
                        Drawable drawable;
                        Bitmap bitmap$default;
                        l0.p(ReorderableItem, "$this$ReorderableItem");
                        if ((i5 & 112) == 0) {
                            i6 = (composer.changed(z4) ? 32 : 16) | i5;
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 721) == 144 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(613398383, i5, -1, "com.yuanqi.master.addapp.sort.SortScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SortScreen.kt:150)");
                        }
                        State<Color> m96animateColorAsStateeuL9pac = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(z4 ? com.yuanqi.master.theme.b.J() : com.yuanqi.master.theme.b.k(), null, "", null, composer, 384, 10);
                        try {
                            drawable = VirtualCore.getPM().getApplicationIcon(this.$item.c());
                        } catch (Exception e5) {
                            e5.printStackTrace();
                            drawable = null;
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        float f5 = 10;
                        Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m555paddingVpY3zN4$default(SizeKt.m588height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6044constructorimpl(55)), 0.0f, Dp.m6044constructorimpl(2), 1, null), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(6))), m96animateColorAsStateeuL9pac.getValue().m3744unboximpl(), null, 2, null), Dp.m6044constructorimpl(f5), 0.0f, 2, null);
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        com.yuanqi.master.config.e eVar = this.$item;
                        composer.startReplaceableGroup(693286680);
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
                        composer.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        v3.a<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Modifier m602size3ABfNKs = SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(30));
                        ImageBitmap asImageBitmap = (drawable == null || (bitmap$default = DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null)) == null) ? null : AndroidImageBitmap_androidKt.asImageBitmap(bitmap$default);
                        composer.startReplaceableGroup(318671506);
                        ImageBitmap imageResource = asImageBitmap == null ? ImageResources_androidKt.imageResource(ImageBitmap.Companion, R.drawable.android, composer, 56) : asImageBitmap;
                        composer.endReplaceableGroup();
                        ImageKt.m257Image5hnEew(imageResource, "", m602size3ABfNKs, null, null, 0.0f, null, 0, composer, 440, 248);
                        SpacerKt.Spacer(SizeKt.m607width3ABfNKs(companion, Dp.m6044constructorimpl(f5)), composer, 6);
                        TextKt.m2452Text4IGK_g(eVar.a(), (Modifier) null, com.yuanqi.master.theme.b.L(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 200064, 0, 131026);
                        SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.sort_menu, composer, 6), (String) null, SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;", "androidx/compose/foundation/lazy/LazyDslKt$items$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$1\n*L\n1#1,426:1\n*E\n"})
                /* renamed from: com.yuanqi.master.addapp.sort.a$b$a$c$c, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0325c extends n0 implements v3.l {
                    public static final C0325c INSTANCE = new C0325c();

                    public C0325c() {
                        super(1);
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((com.yuanqi.master.config.e) obj);
                    }

                    @Override // v3.l
                    @m
                    public final Void invoke(com.yuanqi.master.config.e eVar) {
                        return null;
                    }
                }

                @i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke", "androidx/compose/foundation/lazy/LazyDslKt$items$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$2\n*L\n1#1,426:1\n*E\n"})
                /* renamed from: com.yuanqi.master.addapp.sort.a$b$a$c$d */
                /* loaded from: classes3.dex */
                public static final class d extends n0 implements v3.l<Integer, Object> {
                    final /* synthetic */ List $items;
                    final /* synthetic */ v3.l $key;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public d(v3.l lVar, List list) {
                        super(1);
                        this.$key = lVar;
                        this.$items = list;
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    @l
                    public final Object invoke(int i5) {
                        return this.$key.invoke(this.$items.get(i5));
                    }
                }

                @i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke", "androidx/compose/foundation/lazy/LazyDslKt$items$3"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$3\n*L\n1#1,426:1\n*E\n"})
                /* renamed from: com.yuanqi.master.addapp.sort.a$b$a$c$e */
                /* loaded from: classes3.dex */
                public static final class e extends n0 implements v3.l<Integer, Object> {
                    final /* synthetic */ v3.l $contentType;
                    final /* synthetic */ List $items;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public e(v3.l lVar, List list) {
                        super(1);
                        this.$contentType = lVar;
                        this.$items = list;
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    @m
                    public final Object invoke(int i5) {
                        return this.$contentType.invoke(this.$items.get(i5));
                    }
                }

                @i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/LazyDslKt$items$4"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 SortScreen.kt\ncom/yuanqi/master/addapp/sort/SortScreenKt$SortScreen$2$1$1$2\n*L\n1#1,426:1\n149#2:427\n193#2:428\n*E\n"})
                /* renamed from: com.yuanqi.master.addapp.sort.a$b$a$c$f */
                /* loaded from: classes3.dex */
                public static final class f extends n0 implements r<LazyItemScope, Integer, Composer, Integer, r2> {
                    final /* synthetic */ List $items;
                    final /* synthetic */ j $state$inlined;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(List list, j jVar) {
                        super(4);
                        this.$items = list;
                        this.$state$inlined = jVar;
                    }

                    @Override // v3.r
                    public /* bridge */ /* synthetic */ r2 invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return r2.f19517a;
                    }

                    @Composable
                    public final void invoke(@l LazyItemScope lazyItemScope, int i5, @m Composer composer, int i6) {
                        int i7;
                        if ((i6 & 14) == 0) {
                            i7 = (composer.changed(lazyItemScope) ? 4 : 2) | i6;
                        } else {
                            i7 = i6;
                        }
                        if ((i6 & 112) == 0) {
                            i7 |= composer.changed(i5) ? 32 : 16;
                        }
                        if ((i7 & 731) == 146 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i7, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                        }
                        com.yuanqi.master.config.e eVar = (com.yuanqi.master.config.e) this.$items.get(i5);
                        org.burnoutcrew.reorderable.f.a(lazyItemScope, this.$state$inlined, eVar.c(), null, null, false, ComposableLambdaKt.composableLambda(composer, 613398383, true, new C0324b(eVar)), composer, 1572864 | (i7 & 14 & 14) | (j.f21106u << 3), 28);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(MutableState<ArrayList<com.yuanqi.master.config.e>> mutableState, j jVar) {
                    super(1);
                    this.$dataList = mutableState;
                    this.$state = jVar;
                }

                @Override // v3.l
                public /* bridge */ /* synthetic */ r2 invoke(LazyListScope lazyListScope) {
                    invoke2(lazyListScope);
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@l LazyListScope LazyColumn) {
                    l0.p(LazyColumn, "$this$LazyColumn");
                    ArrayList<com.yuanqi.master.config.e> value = this.$dataList.getValue();
                    C0323a c0323a = C0323a.INSTANCE;
                    j jVar = this.$state;
                    LazyColumn.items(value.size(), c0323a != null ? new d(c0323a, value) : null, new e(C0325c.INSTANCE, value), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new f(value, jVar)));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.sort.a$b$a$d */
            /* loaded from: classes3.dex */
            public /* synthetic */ class d extends h0 implements p<org.burnoutcrew.reorderable.d, org.burnoutcrew.reorderable.d, r2> {
                d(Object obj) {
                    super(2, obj, AddAppViewModel.class, "move", "move(Lorg/burnoutcrew/reorderable/ItemPosition;Lorg/burnoutcrew/reorderable/ItemPosition;)V", 0);
                }

                @Override // v3.p
                public /* bridge */ /* synthetic */ r2 invoke(org.burnoutcrew.reorderable.d dVar, org.burnoutcrew.reorderable.d dVar2) {
                    invoke2(dVar, dVar2);
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@l org.burnoutcrew.reorderable.d p02, @l org.burnoutcrew.reorderable.d p12) {
                    l0.p(p02, "p0");
                    l0.p(p12, "p1");
                    ((AddAppViewModel) this.receiver).P(p02, p12);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0318a(PaddingValues paddingValues, AddAppViewModel addAppViewModel) {
                super(3);
                this.$it = paddingValues;
                this.$addAppViewModel = addAppViewModel;
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
                    ComposerKt.traceEventStart(-1001560793, i5, -1, "com.yuanqi.master.addapp.sort.SortScreen.<anonymous>.<anonymous> (SortScreen.kt:77)");
                }
                Modifier.Companion companion = Modifier.Companion;
                float f5 = 14;
                Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(PaddingKt.padding(companion, this.$it), Dp.m6044constructorimpl(f5), 0.0f, 2, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                AddAppViewModel addAppViewModel = this.$addAppViewModel;
                composer.startReplaceableGroup(-483455358);
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 6);
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
                float f6 = 10;
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(f6)), composer, 6);
                Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
                Updater.m3271setimpl(m3264constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.light_tip, composer, 6), "", SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
                TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.content_set_display_num, composer, 6), SizeKt.fillMaxWidth(companion, 0.7f), com.yuanqi.master.theme.b.L(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3504, 0, 131056);
                Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
                Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically2, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
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
                Updater.m3271setimpl(m3264constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, addAppViewModel.p().getValue().intValue() > 3, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -1138395459, true, new C0319a(addAppViewModel)), composer, 1572870, 30);
                TextKt.m2452Text4IGK_g(String.valueOf(addAppViewModel.p().getValue().intValue()), PaddingKt.m555paddingVpY3zN4$default(companion, Dp.m6044constructorimpl(f5), 0.0f, 2, null), com.yuanqi.master.theme.b.L(), TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3504, 0, 131056);
                AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, addAppViewModel.p().getValue().intValue() < 6, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -936065740, true, new C0321b(addAppViewModel)), composer, 1572870, 30);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(f6)), composer, 6);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = addAppViewModel.G();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) rememberedValue;
                j a5 = k.a(new d(addAppViewModel), null, null, null, 0.0f, null, composer, 0, 62);
                LazyDslKt.LazyColumn(org.burnoutcrew.reorderable.a.b(g.c(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), a5), a5), a5.Y(), null, false, null, null, null, false, new c(mutableState, a5), composer, 0, Opcodes.INVOKE_CUSTOM);
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
        /* renamed from: com.yuanqi.master.addapp.sort.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0326b extends n0 implements v3.a<r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0326b(AddAppViewModel addAppViewModel, Context context) {
                super(0);
                this.$addAppViewModel = addAppViewModel;
                this.$context = context;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a.b(this.$addAppViewModel, this.$context);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AddAppViewModel addAppViewModel, Context context) {
            super(3);
            this.$addAppViewModel = addAppViewModel;
            this.$context = context;
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
                ComposerKt.traceEventStart(1505431694, i5, -1, "com.yuanqi.master.addapp.sort.SortScreen.<anonymous> (SortScreen.kt:76)");
            }
            com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, -1001560793, true, new C0318a(it, this.$addAppViewModel)), composer, 6);
            BackHandlerKt.BackHandler(true, new C0326b(this.$addAppViewModel, this.$context), composer, 6, 0);
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
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(NavHostController navHostController, AddAppViewModel addAppViewModel, int i5, int i6) {
            super(2);
            this.$navController = navHostController;
            this.$addAppViewModel = addAppViewModel;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@m Composer composer, int i5) {
            a.a(this.$navController, this.$addAppViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@p4.l androidx.navigation.NavHostController r23, @p4.m com.yuanqi.master.addapp.AddAppViewModel r24, @p4.m androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.addapp.sort.a.a(androidx.navigation.NavHostController, com.yuanqi.master.addapp.AddAppViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(@l AddAppViewModel addAppViewModel, @l Context context) {
        l0.p(addAppViewModel, "addAppViewModel");
        l0.p(context, "context");
        addAppViewModel.f0();
        AddAppActivity.a aVar = AddAppActivity.f14427e;
        AddAppActivity a5 = aVar.a();
        l0.m(a5);
        a5.setResult(-1);
        AddAppActivity a6 = aVar.a();
        l0.m(a6);
        a6.finish();
        if (context instanceof AddAppActivity) {
            ((AddAppActivity) context).finish();
        }
    }
}
