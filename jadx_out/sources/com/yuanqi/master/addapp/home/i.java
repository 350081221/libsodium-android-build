package com.yuanqi.master.addapp.home;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ProgressIndicatorKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.navigation.NavController;
import com.yuanqi.master.addapp.AddAppActivity;
import com.yuanqi.master.addapp.AddAppViewModel;
import com.yuanqi.master.tools.f1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"DataManagerScreen", "", "navController", "Landroidx/navigation/NavController;", "addAppViewModel", "Lcom/yuanqi/master/addapp/AddAppViewModel;", "(Landroidx/navigation/NavController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V", "TextWithBlueBorder", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release", "storagePermissionState", "", "allFilesAccessPermissionState"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nDataManagerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataManagerScreen.kt\ncom/yuanqi/master/addapp/home/DataManagerScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,192:1\n81#2,11:193\n74#3:204\n25#4:205\n25#4:212\n36#4:219\n36#4:226\n456#4,8:252\n464#4,3:266\n467#4,3:271\n1116#5,6:206\n1116#5,6:213\n1116#5,6:220\n1116#5,6:227\n154#6:233\n154#6:234\n154#6:235\n154#6:270\n69#7,5:236\n74#7:269\n78#7:275\n79#8,11:241\n92#8:274\n3737#9,6:260\n81#10:276\n107#10,2:277\n81#10:279\n107#10,2:280\n*S KotlinDebug\n*F\n+ 1 DataManagerScreen.kt\ncom/yuanqi/master/addapp/home/DataManagerScreenKt\n*L\n57#1:193,11\n61#1:204\n64#1:205\n67#1:212\n72#1:219\n80#1:226\n177#1:252,8\n177#1:266,3\n177#1:271,3\n64#1:206,6\n67#1:213,6\n72#1:220,6\n80#1:227,6\n179#1:233\n180#1:234\n181#1:235\n189#1:270\n177#1:236,5\n177#1:269\n177#1:275\n177#1:241,11\n177#1:274\n177#1:260,6\n64#1:276\n64#1:277,2\n67#1:279\n67#1:280,2\n*E\n"})
/* loaded from: classes3.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ Context $context;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.addapp.home.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0294a extends n0 implements v3.a<r2> {
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0294a(Context context) {
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
                if (context instanceof AddAppActivity) {
                    ((AddAppActivity) context).finish();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(2);
            this.$context = context;
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
                ComposerKt.traceEventStart(-1055315596, i5, -1, "com.yuanqi.master.addapp.home.DataManagerScreen.<anonymous> (DataManagerScreen.kt:86)");
            }
            com.yuanqi.master.tools.a.f("数据管理", null, new C0294a(this.$context), composer, 6, 2);
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
        final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $allFilesAccessPermissionResultLauncher;
        final /* synthetic */ Context $context;
        final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $storagePermissionResultLauncher;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nDataManagerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataManagerScreen.kt\ncom/yuanqi/master/addapp/home/DataManagerScreenKt$DataManagerScreen$2$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,192:1\n68#2,6:193\n74#2:227\n78#2:275\n79#3,11:199\n79#3,11:230\n92#3:269\n92#3:274\n456#4,8:210\n464#4,3:224\n456#4,8:241\n464#4,3:255\n467#4,3:266\n467#4,3:271\n3737#5,6:218\n3737#5,6:249\n78#6,2:228\n80#6:258\n84#6:270\n154#7:259\n154#7:260\n154#7:261\n154#7:262\n154#7:263\n154#7:264\n154#7:265\n*S KotlinDebug\n*F\n+ 1 DataManagerScreen.kt\ncom/yuanqi/master/addapp/home/DataManagerScreenKt$DataManagerScreen$2$1\n*L\n95#1:193,6\n95#1:227\n95#1:275\n95#1:199,11\n98#1:230,11\n98#1:269\n95#1:274\n95#1:210,8\n95#1:224,3\n98#1:241,8\n98#1:255,3\n98#1:266,3\n95#1:271,3\n95#1:218,6\n98#1:249,6\n98#1:228,2\n98#1:258\n98#1:270\n100#1:259\n102#1:260\n103#1:261\n120#1:262\n122#1:263\n124#1:264\n125#1:265\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements q<BoxScope, Composer, Integer, r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;
            final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $allFilesAccessPermissionResultLauncher;
            final /* synthetic */ Context $context;
            final /* synthetic */ PaddingValues $it;
            final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $storagePermissionResultLauncher;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.i$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0295a extends n0 implements v3.a<r2> {
                final /* synthetic */ AddAppViewModel $addAppViewModel;
                final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $allFilesAccessPermissionResultLauncher;
                final /* synthetic */ Context $context;
                final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $storagePermissionResultLauncher;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0295a(ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, Context context, AddAppViewModel addAppViewModel, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher2) {
                    super(0);
                    this.$allFilesAccessPermissionResultLauncher = managedActivityResultLauncher;
                    this.$context = context;
                    this.$addAppViewModel = addAppViewModel;
                    this.$storagePermissionResultLauncher = managedActivityResultLauncher2;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (!f1.e() && Build.VERSION.SDK_INT >= 30) {
                        this.$allFilesAccessPermissionResultLauncher.launch(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"));
                    } else if (!f1.n(this.$context)) {
                        this.$addAppViewModel.v0(this.$context, true, this.$storagePermissionResultLauncher);
                    } else {
                        this.$addAppViewModel.w0(this.$context);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.i$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0296b extends n0 implements v3.a<r2> {
                final /* synthetic */ AddAppViewModel $addAppViewModel;
                final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $allFilesAccessPermissionResultLauncher;
                final /* synthetic */ Context $context;
                final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $storagePermissionResultLauncher;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0296b(ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, Context context, AddAppViewModel addAppViewModel, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher2) {
                    super(0);
                    this.$allFilesAccessPermissionResultLauncher = managedActivityResultLauncher;
                    this.$context = context;
                    this.$addAppViewModel = addAppViewModel;
                    this.$storagePermissionResultLauncher = managedActivityResultLauncher2;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (!f1.e() && Build.VERSION.SDK_INT >= 30) {
                        this.$allFilesAccessPermissionResultLauncher.launch(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"));
                    } else if (!f1.n(this.$context)) {
                        this.$addAppViewModel.v0(this.$context, false, this.$storagePermissionResultLauncher);
                    } else {
                        this.$addAppViewModel.u0(this.$context);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaddingValues paddingValues, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, Context context, AddAppViewModel addAppViewModel, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher2) {
                super(3);
                this.$it = paddingValues;
                this.$allFilesAccessPermissionResultLauncher = managedActivityResultLauncher;
                this.$context = context;
                this.$addAppViewModel = addAppViewModel;
                this.$storagePermissionResultLauncher = managedActivityResultLauncher2;
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
                    ComposerKt.traceEventStart(1356678690, i5, -1, "com.yuanqi.master.addapp.home.DataManagerScreen.<anonymous>.<anonymous> (DataManagerScreen.kt:94)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, this.$it), 0.0f, 1, null);
                ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher = this.$allFilesAccessPermissionResultLauncher;
                Context context = this.$context;
                AddAppViewModel addAppViewModel = this.$addAppViewModel;
                ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher2 = this.$storagePermissionResultLauncher;
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
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer, 54);
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
                com.yuanqi.master.tools.a.q("注意：数据备份在添加了应用之后才能进行，需要关闭当前正在使用的多开应用，再打开应用进入数据管理页面，进行数据备份，应用越多备份的时间越长，请耐心等待。", composer, 6);
                float f5 = 30;
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(f5)), composer, 6);
                float f6 = 15;
                float f7 = 2;
                i.f("数据备份", ClickableKt.m235clickableXHw0xAI$default(BorderKt.m212borderxT4_qwU(BackgroundKt.m200backgroundbw27NRU(companion, com.yuanqi.master.theme.b.n(), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f6))), Dp.m6044constructorimpl(f7), com.yuanqi.master.theme.b.m(), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f6))), false, null, null, new C0295a(managedActivityResultLauncher, context, addAppViewModel, managedActivityResultLauncher2), 7, null), composer, 6, 0);
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(60)), composer, 6);
                com.yuanqi.master.tools.a.q("注意：如果当前应用存在其他App数据，进行数据恢复将会导致数据覆盖，当前的数据会消失，数据恢复后，需要关闭当前应用，重新打开元气多开应用，才能使用备份的数据。", composer, 6);
                SpacerKt.Spacer(SizeKt.m588height3ABfNKs(companion, Dp.m6044constructorimpl(f5)), composer, 6);
                i.f("数据恢复", ClickableKt.m235clickableXHw0xAI$default(BorderKt.m212borderxT4_qwU(BackgroundKt.m200backgroundbw27NRU(companion, com.yuanqi.master.theme.b.V(), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f6))), Dp.m6044constructorimpl(f7), com.yuanqi.master.theme.b.W(), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f6))), false, null, null, new C0296b(managedActivityResultLauncher, context, addAppViewModel, managedActivityResultLauncher2), 7, null), composer, 6, 0);
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
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.addapp.home.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0297b extends n0 implements v3.a<r2> {
            public static final C0297b INSTANCE = new C0297b();

            C0297b() {
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

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nDataManagerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataManagerScreen.kt\ncom/yuanqi/master/addapp/home/DataManagerScreenKt$DataManagerScreen$2$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,192:1\n154#2:193\n154#2:228\n154#2:264\n69#3,5:194\n74#3:227\n78#3:274\n79#4,11:199\n79#4,11:235\n92#4:268\n92#4:273\n456#5,8:210\n464#5,3:224\n456#5,8:246\n464#5,3:260\n467#5,3:265\n467#5,3:270\n3737#6,6:218\n3737#6,6:254\n74#7,6:229\n80#7:263\n84#7:269\n*S KotlinDebug\n*F\n+ 1 DataManagerScreen.kt\ncom/yuanqi/master/addapp/home/DataManagerScreenKt$DataManagerScreen$2$3\n*L\n150#1:193\n156#1:228\n162#1:264\n148#1:194,5\n148#1:227\n148#1:274\n148#1:199,11\n154#1:235,11\n154#1:268\n148#1:273\n148#1:210,8\n148#1:224,3\n154#1:246,8\n154#1:260,3\n154#1:265,3\n148#1:270,3\n148#1:218,6\n154#1:254,6\n154#1:229,6\n154#1:263\n154#1:269\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class c extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AddAppViewModel addAppViewModel) {
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
                    ComposerKt.traceEventStart(-574689157, i5, -1, "com.yuanqi.master.addapp.home.DataManagerScreen.<anonymous>.<anonymous> (DataManagerScreen.kt:147)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier m201backgroundbw27NRU$default = BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(companion, RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(15))), Color.Companion.m3771getWhite0d7_KjU(), null, 2, null);
                Alignment.Companion companion2 = Alignment.Companion;
                Alignment center = companion2.getCenter();
                AddAppViewModel addAppViewModel = this.$addAppViewModel;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                v3.a<ComposeUiNode> constructor = companion3.getConstructor();
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
                Modifier m554paddingVpY3zN4 = PaddingKt.m554paddingVpY3zN4(companion, Dp.m6044constructorimpl(30), Dp.m6044constructorimpl(20));
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m554paddingVpY3zN4);
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
                ProgressIndicatorKt.m2071CircularProgressIndicatorLxG7B9w(PaddingKt.m557paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m6044constructorimpl(10), 7, null), com.yuanqi.master.theme.b.O(), 0.0f, 0L, 0, composer, 54, 28);
                TextKt.m2452Text4IGK_g(addAppViewModel.F().getValue(), (Modifier) null, com.yuanqi.master.theme.b.i(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 384, 0, 131066);
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
        b(AddAppViewModel addAppViewModel, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, Context context, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher2) {
            super(3);
            this.$addAppViewModel = addAppViewModel;
            this.$allFilesAccessPermissionResultLauncher = managedActivityResultLauncher;
            this.$context = context;
            this.$storagePermissionResultLauncher = managedActivityResultLauncher2;
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
                ComposerKt.traceEventStart(1836391625, i5, -1, "com.yuanqi.master.addapp.home.DataManagerScreen.<anonymous> (DataManagerScreen.kt:93)");
            }
            com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, 1356678690, true, new a(it, this.$allFilesAccessPermissionResultLauncher, this.$context, this.$addAppViewModel, this.$storagePermissionResultLauncher)), composer, 6);
            if (this.$addAppViewModel.E().getValue().booleanValue()) {
                AndroidDialog_androidKt.Dialog(C0297b.INSTANCE, null, ComposableLambdaKt.composableLambda(composer, -574689157, true, new c(this.$addAppViewModel)), composer, 390, 2);
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
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ NavController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(NavController navController, AddAppViewModel addAppViewModel, int i5, int i6) {
            super(2);
            this.$navController = navController;
            this.$addAppViewModel = addAppViewModel;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            i.a(this.$navController, this.$addAppViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/activity/result/ActivityResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends n0 implements v3.l<ActivityResult, r2> {
        final /* synthetic */ MutableState<Boolean> $allFilesAccessPermissionState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MutableState<Boolean> mutableState) {
            super(1);
            this.$allFilesAccessPermissionState$delegate = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ActivityResult activityResult) {
            invoke2(activityResult);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l ActivityResult it) {
            l0.p(it, "it");
            i.e(this.$allFilesAccessPermissionState$delegate, f1.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends n0 implements v3.l<Boolean, r2> {
        final /* synthetic */ MutableState<Boolean> $storagePermissionState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(MutableState<Boolean> mutableState) {
            super(1);
            this.$storagePermissionState$delegate = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return r2.f19517a;
        }

        public final void invoke(boolean z4) {
            i.c(this.$storagePermissionState$delegate, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Modifier modifier, int i5, int i6) {
            super(2);
            this.$text = str;
            this.$modifier = modifier;
            this.$$changed = i5;
            this.$$default = i6;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            i.f(this.$text, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0184  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@p4.l androidx.navigation.NavController r23, @p4.m com.yuanqi.master.addapp.AddAppViewModel r24, @p4.m androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.addapp.home.i.a(androidx.navigation.NavController, com.yuanqi.master.addapp.AddAppViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean b(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState<Boolean> mutableState, boolean z4) {
        mutableState.setValue(Boolean.valueOf(z4));
    }

    private static final boolean d(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState<Boolean> mutableState, boolean z4) {
        mutableState.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@p4.l java.lang.String r27, @p4.m androidx.compose.ui.Modifier r28, @p4.m androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.addapp.home.i.f(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
