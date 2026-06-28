package com.yuanqi.master.main;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.AddKt;
import androidx.compose.material.icons.rounded.MenuKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.navigation.NavHostController;
import com.yuanqi.master.addapp.AddAppActivity;
import com.yuanqi.master.main.MainActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"LaunchItem", "", "info", "Lcom/yuanqi/group/home/models/AppData;", "modifier", "Landroidx/compose/ui/Modifier;", "mainViewModel", "Lcom/yuanqi/master/main/MainViewModel;", "(Lcom/yuanqi/group/home/models/AppData;Landroidx/compose/ui/Modifier;Lcom/yuanqi/master/main/MainViewModel;Landroidx/compose/runtime/Composer;II)V", "MainScreen", "navController", "Landroidx/navigation/NavHostController;", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/main/MainViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMainScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,349:1\n81#2,11:350\n81#2,11:361\n154#3:372\n154#3:373\n154#3:374\n154#3:445\n154#3:446\n69#4,5:375\n74#4:408\n67#4,7:452\n74#4:487\n78#4:492\n78#4:497\n79#5,11:380\n79#5,11:416\n92#5:450\n79#5,11:459\n92#5:491\n92#5:496\n456#6,8:391\n464#6,3:405\n456#6,8:427\n464#6,3:441\n467#6,3:447\n456#6,8:470\n464#6,3:484\n467#6,3:488\n467#6,3:493\n3737#7,6:399\n3737#7,6:435\n3737#7,6:478\n73#8,7:409\n80#8:444\n84#8:451\n*S KotlinDebug\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt\n*L\n66#1:350,11\n258#1:361,11\n264#1:372\n265#1:373\n267#1:374\n280#1:445\n281#1:446\n262#1:375,5\n262#1:408\n305#1:452,7\n305#1:487\n305#1:492\n262#1:497\n262#1:380,11\n271#1:416,11\n271#1:450\n305#1:459,11\n305#1:491\n262#1:496\n262#1:391,8\n262#1:405,3\n271#1:427,8\n271#1:441,3\n271#1:447,3\n305#1:470,8\n305#1:484,3\n305#1:488,3\n262#1:493,3\n262#1:399,6\n271#1:435,6\n305#1:478,6\n271#1:409,7\n271#1:444\n271#1:451\n*E\n"})
/* loaded from: classes3.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements v3.q<AnimatedVisibilityScope, Composer, Integer, r2> {
        final /* synthetic */ v2.b $noteApp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v2.b bVar) {
            super(3);
            this.$noteApp = bVar;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.l AnimatedVisibilityScope AnimatedVisibility, @p4.m Composer composer, int i5) {
            l0.p(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1517769097, i5, -1, "com.yuanqi.master.main.LaunchItem.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:294)");
            }
            v2.b bVar = this.$noteApp;
            TextKt.m2452Text4IGK_g(String.valueOf(bVar != null ? bVar.getNoteName() : null), (Modifier) null, 0L, TextUnitKt.m6247TextUnitanM5pPY(11.0f, TextUnitType.Companion.m6268getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, TextOverflow.Companion.m5986getEllipsisgIe3tQ8(), false, 1, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 0, 3120, 120310);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements v3.a<r2> {
        final /* synthetic */ MainViewModel $mainViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MainViewModel mainViewModel) {
            super(0);
            this.$mainViewModel = mainViewModel;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$mainViewModel.Q().setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/ColumnScope;", "invoke", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends n0 implements v3.q<ColumnScope, Composer, Integer, r2> {
        final /* synthetic */ com.yuanqi.group.home.models.b $info;
        final /* synthetic */ MainViewModel $mainViewModel;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements v3.a<r2> {
            final /* synthetic */ com.yuanqi.group.home.models.b $info;
            final /* synthetic */ MainViewModel $mainViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MainViewModel mainViewModel, com.yuanqi.group.home.models.b bVar) {
                super(0);
                this.$mainViewModel = mainViewModel;
                this.$info = bVar;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$mainViewModel.B(this.$info);
                this.$mainViewModel.Q().setValue(Boolean.FALSE);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b extends n0 implements v3.a<r2> {
            final /* synthetic */ MainViewModel $mainViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MainViewModel mainViewModel) {
                super(0);
                this.$mainViewModel = mainViewModel;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$mainViewModel.Q().setValue(Boolean.FALSE);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.main.d$c$c, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0342c extends n0 implements v3.a<r2> {
            final /* synthetic */ MainViewModel $mainViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0342c(MainViewModel mainViewModel) {
                super(0);
                this.$mainViewModel = mainViewModel;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$mainViewModel.Q().setValue(Boolean.FALSE);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.main.d$c$d, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0343d extends n0 implements v3.a<r2> {
            final /* synthetic */ MainViewModel $mainViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0343d(MainViewModel mainViewModel) {
                super(0);
                this.$mainViewModel = mainViewModel;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$mainViewModel.Q().setValue(Boolean.FALSE);
                MainActivity.a aVar = MainActivity.f14671c;
                Intent intent = new Intent(aVar.a(), (Class<?>) AddAppActivity.class);
                intent.putExtra(com.yuanqi.master.config.c.f14521b, com.yuanqi.master.config.c.f14527e);
                aVar.a().startActivityForResult(intent, 7);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MainViewModel mainViewModel, com.yuanqi.group.home.models.b bVar) {
            super(3);
            this.$mainViewModel = mainViewModel;
            this.$info = bVar;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.l ColumnScope DropdownMenu, @p4.m Composer composer, int i5) {
            l0.p(DropdownMenu, "$this$DropdownMenu");
            if ((i5 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(103949635, i5, -1, "com.yuanqi.master.main.LaunchItem.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:308)");
            }
            com.yuanqi.master.main.b bVar = com.yuanqi.master.main.b.f14696a;
            AndroidMenu_androidKt.DropdownMenuItem(bVar.j(), new a(this.$mainViewModel, this.$info), null, null, null, false, null, null, null, composer, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
            DividerKt.m1852HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer, 0, 7);
            AndroidMenu_androidKt.DropdownMenuItem(bVar.k(), new b(this.$mainViewModel), null, null, null, false, null, null, null, composer, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
            DividerKt.m1852HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer, 0, 7);
            AndroidMenu_androidKt.DropdownMenuItem(bVar.b(), new C0342c(this.$mainViewModel), null, null, null, false, null, null, null, composer, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
            DividerKt.m1852HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer, 0, 7);
            AndroidMenu_androidKt.DropdownMenuItem(bVar.c(), new C0343d(this.$mainViewModel), null, null, null, false, null, null, null, composer, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.main.d$d, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0344d extends n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ com.yuanqi.group.home.models.b $info;
        final /* synthetic */ MainViewModel $mainViewModel;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0344d(com.yuanqi.group.home.models.b bVar, Modifier modifier, MainViewModel mainViewModel, int i5, int i6) {
            super(2);
            this.$info = bVar;
            this.$modifier = modifier;
            this.$mainViewModel = mainViewModel;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            d.a(this.$info, this.$modifier, this.$mainViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ MainViewModel $mainViewModel;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nMainScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt$MainScreen$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,349:1\n154#2:350\n154#2:358\n25#3:351\n1116#4,6:352\n*S KotlinDebug\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt$MainScreen$1$1\n*L\n82#1:350\n96#1:358\n90#1:351\n90#1:352,6\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements v3.q<RowScope, Composer, Integer, r2> {
            final /* synthetic */ MainViewModel $mainViewModel;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.main.d$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0345a extends n0 implements v3.a<r2> {
                public static final C0345a INSTANCE = new C0345a();

                C0345a() {
                    super(0);
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    MainActivity.a aVar = MainActivity.f14671c;
                    aVar.a().startActivityForResult(new Intent(aVar.a(), (Class<?>) AddAppActivity.class), 5);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class b extends n0 implements v3.a<r2> {
                final /* synthetic */ k1.a $showMenu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(k1.a aVar) {
                    super(0);
                    this.$showMenu = aVar;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$showMenu.element = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class c extends n0 implements v3.a<r2> {
                final /* synthetic */ MainViewModel $mainViewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(MainViewModel mainViewModel) {
                    super(0);
                    this.$mainViewModel = mainViewModel;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$mainViewModel.Q().setValue(Boolean.FALSE);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/ColumnScope;", "invoke", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.main.d$e$a$d, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0346d extends n0 implements v3.q<ColumnScope, Composer, Integer, r2> {
                final /* synthetic */ k1.a $showMenu;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.main.d$e$a$d$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0347a extends n0 implements v3.a<r2> {
                    final /* synthetic */ k1.a $showMenu;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0347a(k1.a aVar) {
                        super(0);
                        this.$showMenu = aVar;
                    }

                    @Override // v3.a
                    public /* bridge */ /* synthetic */ r2 invoke() {
                        invoke2();
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.$showMenu.element = false;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0346d(k1.a aVar) {
                    super(3);
                    this.$showMenu = aVar;
                }

                @Override // v3.q
                public /* bridge */ /* synthetic */ r2 invoke(ColumnScope columnScope, Composer composer, Integer num) {
                    invoke(columnScope, composer, num.intValue());
                    return r2.f19517a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@p4.l ColumnScope DropdownMenu, @p4.m Composer composer, int i5) {
                    l0.p(DropdownMenu, "$this$DropdownMenu");
                    if ((i5 & 81) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1894421670, i5, -1, "com.yuanqi.master.main.MainScreen.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:103)");
                    }
                    AndroidMenu_androidKt.DropdownMenuItem(com.yuanqi.master.main.b.f14696a.d(), new C0347a(this.$showMenu), null, null, null, false, null, null, null, composer, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MainViewModel mainViewModel) {
                super(3);
                this.$mainViewModel = mainViewModel;
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
                    ComposerKt.traceEventStart(860017612, i5, -1, "com.yuanqi.master.main.MainScreen.<anonymous>.<anonymous> (MainScreen.kt:78)");
                }
                Icons.Rounded rounded = Icons.Rounded.INSTANCE;
                ImageVector add = AddKt.getAdd(rounded);
                Modifier.Companion companion = Modifier.Companion;
                float f5 = 10;
                IconKt.m1925Iconww6aTOc(add, "", ClickableKt.m235clickableXHw0xAI$default(PaddingKt.m557paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m6044constructorimpl(f5), 0.0f, 11, null), false, null, null, C0345a.INSTANCE, 7, null), 0L, composer, 48, 8);
                k1.a aVar = new k1.a();
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = Boolean.FALSE;
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                aVar.element = ((Boolean) rememberedValue).booleanValue();
                IconKt.m1925Iconww6aTOc(MenuKt.getMenu(rounded), "", ClickableKt.m235clickableXHw0xAI$default(PaddingKt.m557paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m6044constructorimpl(f5), 0.0f, 11, null), false, null, null, new b(aVar), 7, null), 0L, composer, 48, 8);
                if (aVar.element) {
                    AndroidMenu_androidKt.m1553DropdownMenu4kj_NE(true, new c(this.$mainViewModel), null, 0L, null, null, ComposableLambdaKt.composableLambda(composer, -1894421670, true, new C0346d(aVar)), composer, 1572870, 60);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(MainViewModel mainViewModel) {
            super(2);
            this.$mainViewModel = mainViewModel;
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
                ComposerKt.traceEventStart(-24595301, i5, -1, "com.yuanqi.master.main.MainScreen.<anonymous> (MainScreen.kt:71)");
            }
            AppBarKt.TopAppBar(com.yuanqi.master.main.b.f14696a.a(), null, null, ComposableLambdaKt.composableLambda(composer, 860017612, true, new a(this.$mainViewModel)), null, null, null, composer, 3078, 118);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nMainScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt$MainScreen$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,349:1\n154#2:350\n*S KotlinDebug\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt$MainScreen$2\n*L\n124#1:350\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class f extends n0 implements v3.q<PaddingValues, Composer, Integer, r2> {
        final /* synthetic */ MainViewModel $mainViewModel;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nMainScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt$MainScreen$2$1\n+ 2 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n1#1,349:1\n450#2,14:350\n*S KotlinDebug\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt$MainScreen$2$1\n*L\n126#1:350,14\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements v3.l<LazyGridScope, r2> {
            final /* synthetic */ MainViewModel $mainViewModel;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.main.MainScreenKt$MainScreen$2$1$1$1", f = "MainScreen.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.main.d$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0348a extends kotlin.coroutines.jvm.internal.o implements v3.p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ com.yuanqi.group.home.models.b $info;
                final /* synthetic */ MainViewModel $mainViewModel;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.main.d$f$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0349a extends n0 implements v3.l<Offset, r2> {
                    final /* synthetic */ com.yuanqi.group.home.models.b $info;
                    final /* synthetic */ MainViewModel $mainViewModel;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0349a(MainViewModel mainViewModel, com.yuanqi.group.home.models.b bVar) {
                        super(1);
                        this.$mainViewModel = mainViewModel;
                        this.$info = bVar;
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
                        m6437invokek4lQ0M(offset.m3503unboximpl());
                        return r2.f19517a;
                    }

                    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m6437invokek4lQ0M(long j5) {
                        this.$mainViewModel.L().setValue(this.$info);
                        this.$mainViewModel.Q().setValue(Boolean.TRUE);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.main.d$f$a$a$b */
                /* loaded from: classes3.dex */
                public static final class b extends n0 implements v3.l<Offset, r2> {
                    public static final b INSTANCE = new b();

                    b() {
                        super(1);
                    }

                    @Override // v3.l
                    public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
                        m6438invokek4lQ0M(offset.m3503unboximpl());
                        return r2.f19517a;
                    }

                    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                    public final void m6438invokek4lQ0M(long j5) {
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0348a(MainViewModel mainViewModel, com.yuanqi.group.home.models.b bVar, kotlin.coroutines.d<? super C0348a> dVar) {
                    super(2, dVar);
                    this.$mainViewModel = mainViewModel;
                    this.$info = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    C0348a c0348a = new C0348a(this.$mainViewModel, this.$info, dVar);
                    c0348a.L$0 = obj;
                    return c0348a;
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l PointerInputScope pointerInputScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0348a) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
                        C0349a c0349a = new C0349a(this.$mainViewModel, this.$info);
                        b bVar = b.INSTANCE;
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, c0349a, null, bVar, this, 5, null) == l5) {
                            return l5;
                        }
                    }
                    return r2.f19517a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class b extends n0 implements v3.q<AnimatedVisibilityScope, Composer, Integer, r2> {
                final /* synthetic */ v2.b $noteApp;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(v2.b bVar) {
                    super(3);
                    this.$noteApp = bVar;
                }

                @Override // v3.q
                public /* bridge */ /* synthetic */ r2 invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                    invoke(animatedVisibilityScope, composer, num.intValue());
                    return r2.f19517a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@p4.l AnimatedVisibilityScope AnimatedVisibility, @p4.m Composer composer, int i5) {
                    l0.p(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1045475649, i5, -1, "com.yuanqi.master.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:182)");
                    }
                    v2.b bVar = this.$noteApp;
                    TextKt.m2452Text4IGK_g(String.valueOf(bVar != null ? bVar.getNoteName() : null), (Modifier) null, 0L, TextUnitKt.m6247TextUnitanM5pPY(11.0f, TextUnitType.Companion.m6268getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, TextOverflow.Companion.m5986getEllipsisgIe3tQ8(), false, 1, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 0, 3120, 120310);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class c extends n0 implements v3.a<r2> {
                final /* synthetic */ MainViewModel $mainViewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(MainViewModel mainViewModel) {
                    super(0);
                    this.$mainViewModel = mainViewModel;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$mainViewModel.Q().setValue(Boolean.FALSE);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/ColumnScope;", "invoke", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.main.d$f$a$d, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0350d extends n0 implements v3.q<ColumnScope, Composer, Integer, r2> {
                final /* synthetic */ com.yuanqi.group.home.models.b $info;
                final /* synthetic */ MainViewModel $mainViewModel;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.main.d$f$a$d$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0351a extends n0 implements v3.a<r2> {
                    final /* synthetic */ com.yuanqi.group.home.models.b $info;
                    final /* synthetic */ MainViewModel $mainViewModel;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0351a(MainViewModel mainViewModel, com.yuanqi.group.home.models.b bVar) {
                        super(0);
                        this.$mainViewModel = mainViewModel;
                        this.$info = bVar;
                    }

                    @Override // v3.a
                    public /* bridge */ /* synthetic */ r2 invoke() {
                        invoke2();
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.$mainViewModel.B(this.$info);
                        this.$mainViewModel.Q().setValue(Boolean.FALSE);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.main.d$f$a$d$b */
                /* loaded from: classes3.dex */
                public static final class b extends n0 implements v3.a<r2> {
                    final /* synthetic */ MainViewModel $mainViewModel;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(MainViewModel mainViewModel) {
                        super(0);
                        this.$mainViewModel = mainViewModel;
                    }

                    @Override // v3.a
                    public /* bridge */ /* synthetic */ r2 invoke() {
                        invoke2();
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.$mainViewModel.Q().setValue(Boolean.FALSE);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.main.d$f$a$d$c */
                /* loaded from: classes3.dex */
                public static final class c extends n0 implements v3.a<r2> {
                    final /* synthetic */ MainViewModel $mainViewModel;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    c(MainViewModel mainViewModel) {
                        super(0);
                        this.$mainViewModel = mainViewModel;
                    }

                    @Override // v3.a
                    public /* bridge */ /* synthetic */ r2 invoke() {
                        invoke2();
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.$mainViewModel.Q().setValue(Boolean.FALSE);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.main.d$f$a$d$d, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0352d extends n0 implements v3.a<r2> {
                    final /* synthetic */ MainViewModel $mainViewModel;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0352d(MainViewModel mainViewModel) {
                        super(0);
                        this.$mainViewModel = mainViewModel;
                    }

                    @Override // v3.a
                    public /* bridge */ /* synthetic */ r2 invoke() {
                        invoke2();
                        return r2.f19517a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.$mainViewModel.Q().setValue(Boolean.FALSE);
                        MainActivity.a aVar = MainActivity.f14671c;
                        Intent intent = new Intent(aVar.a(), (Class<?>) AddAppActivity.class);
                        intent.putExtra(com.yuanqi.master.config.c.f14521b, com.yuanqi.master.config.c.f14527e);
                        aVar.a().startActivityForResult(intent, 7);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0350d(MainViewModel mainViewModel, com.yuanqi.group.home.models.b bVar) {
                    super(3);
                    this.$mainViewModel = mainViewModel;
                    this.$info = bVar;
                }

                @Override // v3.q
                public /* bridge */ /* synthetic */ r2 invoke(ColumnScope columnScope, Composer composer, Integer num) {
                    invoke(columnScope, composer, num.intValue());
                    return r2.f19517a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@p4.l ColumnScope DropdownMenu, @p4.m Composer composer, int i5) {
                    l0.p(DropdownMenu, "$this$DropdownMenu");
                    if ((i5 & 81) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1525640955, i5, -1, "com.yuanqi.master.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:196)");
                    }
                    com.yuanqi.master.main.b bVar = com.yuanqi.master.main.b.f14696a;
                    AndroidMenu_androidKt.DropdownMenuItem(bVar.e(), new C0351a(this.$mainViewModel, this.$info), null, null, null, false, null, null, null, composer, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
                    DividerKt.m1852HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer, 0, 7);
                    AndroidMenu_androidKt.DropdownMenuItem(bVar.f(), new b(this.$mainViewModel), null, null, null, false, null, null, null, composer, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
                    DividerKt.m1852HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer, 0, 7);
                    AndroidMenu_androidKt.DropdownMenuItem(bVar.g(), new c(this.$mainViewModel), null, null, null, false, null, null, null, composer, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
                    DividerKt.m1852HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer, 0, 7);
                    AndroidMenu_androidKt.DropdownMenuItem(bVar.h(), new C0352d(this.$mainViewModel), null, null, null, false, null, null, null, composer, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;", "androidx/compose/foundation/lazy/grid/LazyGridDslKt$items$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$1\n*L\n1#1,563:1\n*E\n"})
            /* loaded from: classes3.dex */
            public static final class e extends n0 implements v3.l {
                public static final e INSTANCE = new e();

                public e() {
                    super(1);
                }

                @Override // v3.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((com.yuanqi.group.home.models.b) obj);
                }

                @Override // v3.l
                @p4.m
                public final Void invoke(com.yuanqi.group.home.models.b bVar) {
                    return null;
                }
            }

            @i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke", "androidx/compose/foundation/lazy/grid/LazyGridDslKt$items$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$2\n*L\n1#1,563:1\n*E\n"})
            /* renamed from: com.yuanqi.master.main.d$f$a$f, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0353f extends n0 implements v3.l<Integer, Object> {
                final /* synthetic */ List $items;
                final /* synthetic */ v3.l $key;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0353f(v3.l lVar, List list) {
                    super(1);
                    this.$key = lVar;
                    this.$items = list;
                }

                @Override // v3.l
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                @p4.l
                public final Object invoke(int i5) {
                    return this.$key.invoke(this.$items.get(i5));
                }
            }

            @i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J", "androidx/compose/foundation/lazy/grid/LazyGridDslKt$items$3"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$3\n*L\n1#1,563:1\n*E\n"})
            /* loaded from: classes3.dex */
            public static final class g extends n0 implements v3.p<LazyGridItemSpanScope, Integer, GridItemSpan> {
                final /* synthetic */ List $items;
                final /* synthetic */ v3.p $span;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(v3.p pVar, List list) {
                    super(2);
                    this.$span = pVar;
                    this.$items = list;
                }

                @Override // v3.p
                public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
                    return GridItemSpan.m670boximpl(m6439invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
                }

                /* renamed from: invoke-_-orMbw, reason: not valid java name */
                public final long m6439invoke_orMbw(@p4.l LazyGridItemSpanScope lazyGridItemSpanScope, int i5) {
                    return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items.get(i5))).m677unboximpl();
                }
            }

            @i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke", "androidx/compose/foundation/lazy/grid/LazyGridDslKt$items$4"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$4\n*L\n1#1,563:1\n*E\n"})
            /* loaded from: classes3.dex */
            public static final class h extends n0 implements v3.l<Integer, Object> {
                final /* synthetic */ v3.l $contentType;
                final /* synthetic */ List $items;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public h(v3.l lVar, List list) {
                    super(1);
                    this.$contentType = lVar;
                    this.$items = list;
                }

                @Override // v3.l
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                @p4.m
                public final Object invoke(int i5) {
                    return this.$contentType.invoke(this.$items.get(i5));
                }
            }

            @i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5\n+ 2 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt$MainScreen$2$1\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,563:1\n142#2:564\n141#2,12:565\n153#2:578\n154#2,2:580\n156#2:583\n140#2:584\n160#2:619\n159#2:620\n163#2,6:657\n169#2:664\n162#2,30:666\n192#2,2:701\n194#2,3:739\n232#2:742\n236#2:748\n238#2:754\n154#3:577\n154#3:579\n154#3:582\n154#3:663\n154#3:665\n69#4,5:585\n74#4:618\n67#4,7:703\n74#4:738\n78#4:747\n78#4:753\n79#5,11:590\n79#5,11:628\n92#5:699\n79#5,11:710\n92#5:746\n92#5:752\n456#6,8:601\n464#6,3:615\n456#6,8:639\n464#6,3:653\n467#6,3:696\n456#6,8:721\n464#6,3:735\n467#6,3:743\n467#6,3:749\n3737#7,6:609\n3737#7,6:647\n3737#7,6:729\n73#8,7:621\n80#8:656\n84#8:700\n*S KotlinDebug\n*F\n+ 1 MainScreen.kt\ncom/yuanqi/master/main/MainScreenKt$MainScreen$2$1\n*L\n152#1:577\n153#1:579\n155#1:582\n168#1:663\n169#1:665\n140#1:585,5\n140#1:618\n193#1:703,7\n193#1:738\n193#1:747\n140#1:753\n140#1:590,11\n159#1:628,11\n159#1:699\n193#1:710,11\n193#1:746\n140#1:752\n140#1:601,8\n140#1:615,3\n159#1:639,8\n159#1:653,3\n159#1:696,3\n193#1:721,8\n193#1:735,3\n193#1:743,3\n140#1:749,3\n140#1:609,6\n159#1:647,6\n193#1:729,6\n159#1:621,7\n159#1:656\n159#1:700\n*E\n"})
            /* loaded from: classes3.dex */
            public static final class i extends n0 implements v3.r<LazyGridItemScope, Integer, Composer, Integer, r2> {
                final /* synthetic */ List $items;
                final /* synthetic */ MainViewModel $mainViewModel$inlined;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i(List list, MainViewModel mainViewModel) {
                    super(4);
                    this.$items = list;
                    this.$mainViewModel$inlined = mainViewModel;
                }

                @Override // v3.r
                public /* bridge */ /* synthetic */ r2 invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                    return r2.f19517a;
                }

                @Composable
                public final void invoke(@p4.l LazyGridItemScope lazyGridItemScope, int i5, @p4.m Composer composer, int i6) {
                    int i7;
                    v2.b bVar;
                    Object obj;
                    if ((i6 & 14) == 0) {
                        i7 = i6 | (composer.changed(lazyGridItemScope) ? 4 : 2);
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
                        ComposerKt.traceEventStart(699646206, i7, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:461)");
                    }
                    com.yuanqi.group.home.models.b bVar2 = (com.yuanqi.group.home.models.b) this.$items.get(i5);
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier m588height3ABfNKs = SizeKt.m588height3ABfNKs(BackgroundKt.m201backgroundbw27NRU$default(ShadowKt.m3406shadows4CzXII$default(PaddingKt.m553padding3ABfNKs(SuspendingPointerInputFilterKt.pointerInput(LazyGridItemScope.animateItemPlacement$default(lazyGridItemScope, companion, null, 1, null), bVar2, new C0348a(this.$mainViewModel$inlined, bVar2, null)), Dp.m6044constructorimpl(5)), Dp.m6044constructorimpl(1), null, false, 0L, 0L, 30, null), com.yuanqi.master.theme.b.U(), null, 2, null), Dp.m6044constructorimpl(120));
                    Alignment.Companion companion2 = Alignment.Companion;
                    Alignment center = companion2.getCenter();
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    v3.a<ComposeUiNode> constructor = companion3.getConstructor();
                    v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m588height3ABfNKs);
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
                    v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    composer.startReplaceableGroup(-483455358);
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                    v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
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
                    v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Drawable icon = bVar2.getIcon();
                    l0.m(icon);
                    ImageKt.Image(new BitmapPainter(AndroidImageBitmap_androidKt.asImageBitmap(DrawableKt.toBitmap$default(icon, 0, 0, null, 7, null)), 0L, 0L, 6, null), bVar2.getName().toString(), PaddingKt.m557paddingqDBjuR0$default(SizeKt.m602size3ABfNKs(companion, Dp.m6044constructorimpl(40)), 0.0f, 0.0f, 0.0f, Dp.m6044constructorimpl(8), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 392, 120);
                    TextKt.m2452Text4IGK_g(bVar2.getName() + '_' + (bVar2.getUserId() + 1), (Modifier) null, 0L, TextUnitKt.m6247TextUnitanM5pPY(10.0f, TextUnitType.Companion.m6268getSpUIouoOA()), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, TextOverflow.Companion.m5986getEllipsisgIe3tQ8(), false, 1, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 0, 3120, 120310);
                    List<v2.b> value = this.$mainViewModel$inlined.I().getValue();
                    if (value != null) {
                        l0.m(value);
                        Iterator<T> it = value.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            v2.b bVar3 = (v2.b) obj;
                            if (bVar3.getUserId() == bVar2.getUserId() && l0.g(bVar3.getPackageName(), bVar2.getPackageName())) {
                                break;
                            }
                        }
                        bVar = (v2.b) obj;
                    } else {
                        bVar = null;
                    }
                    AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, bVar != null, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 1045475649, true, new b(bVar)), composer, 1572870, 30);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-1473257903);
                    if (this.$mainViewModel$inlined.Q().getValue().booleanValue()) {
                        com.yuanqi.group.home.models.b value2 = this.$mainViewModel$inlined.L().getValue();
                        if (l0.g(value2 != null ? value2.getPackageName() : null, bVar2.getPackageName())) {
                            com.yuanqi.group.home.models.b value3 = this.$mainViewModel$inlined.L().getValue();
                            if (value3 != null && value3.getUserId() == bVar2.getUserId()) {
                                composer.startReplaceableGroup(733328855);
                                Modifier.Companion companion4 = Modifier.Companion;
                                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                                composer.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                                v3.a<ComposeUiNode> constructor3 = companion5.getConstructor();
                                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion4);
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
                                Updater.m3271setimpl(m3264constructorimpl3, rememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                                Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                                composer.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                AndroidMenu_androidKt.m1553DropdownMenu4kj_NE(true, new c(this.$mainViewModel$inlined), null, 0L, null, null, ComposableLambdaKt.composableLambda(composer, 1525640955, true, new C0350d(this.$mainViewModel$inlined, bVar2)), composer, 1572870, 60);
                                composer.endReplaceableGroup();
                                composer.endNode();
                                composer.endReplaceableGroup();
                                composer.endReplaceableGroup();
                            }
                        }
                    }
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
            a(MainViewModel mainViewModel) {
                super(1);
                this.$mainViewModel = mainViewModel;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(LazyGridScope lazyGridScope) {
                invoke2(lazyGridScope);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@p4.l LazyGridScope LazyVerticalGrid) {
                l0.p(LazyVerticalGrid, "$this$LazyVerticalGrid");
                SnapshotStateList<com.yuanqi.group.home.models.b> G = this.$mainViewModel.G();
                MainViewModel mainViewModel = this.$mainViewModel;
                LazyVerticalGrid.items(G.size(), null, null, new h(e.INSTANCE, G), ComposableLambdaKt.composableLambdaInstance(699646206, true, new i(G, mainViewModel)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b extends n0 implements v3.a<r2> {
            public static final b INSTANCE = new b();

            b() {
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
        f(MainViewModel mainViewModel) {
            super(3);
            this.$mainViewModel = mainViewModel;
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
                ComposerKt.traceEventStart(2125037414, i5, -1, "com.yuanqi.master.main.MainScreen.<anonymous> (MainScreen.kt:118)");
            }
            LazyGridDslKt.LazyVerticalGrid(new GridCells.Fixed(com.yuanqi.master.config.a.f14505g.a().c().getValue().intValue()), PaddingKt.m555paddingVpY3zN4$default(PaddingKt.padding(Modifier.Companion, it), Dp.m6044constructorimpl(10), 0.0f, 2, null), this.$mainViewModel.J(), null, false, null, null, null, false, new a(this.$mainViewModel), composer, 0, 504);
            if (this.$mainViewModel.N().getValue().booleanValue()) {
                AndroidDialog_androidKt.Dialog(b.INSTANCE, null, com.yuanqi.master.main.b.f14696a.i(), composer, 390, 2);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ MainViewModel $mainViewModel;
        final /* synthetic */ NavHostController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(NavHostController navHostController, MainViewModel mainViewModel, int i5, int i6) {
            super(2);
            this.$navController = navHostController;
            this.$mainViewModel = mainViewModel;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            d.b(this.$navController, this.$mainViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@p4.l com.yuanqi.group.home.models.b r29, @p4.l androidx.compose.ui.Modifier r30, @p4.m com.yuanqi.master.main.MainViewModel r31, @p4.m androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 1103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.main.d.a(com.yuanqi.group.home.models.b, androidx.compose.ui.Modifier, com.yuanqi.master.main.MainViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @android.annotation.SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@p4.l androidx.navigation.NavHostController r21, @p4.m com.yuanqi.master.main.MainViewModel r22, @p4.m androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.main.d.b(androidx.navigation.NavHostController, com.yuanqi.master.main.MainViewModel, androidx.compose.runtime.Composer, int, int):void");
    }
}
