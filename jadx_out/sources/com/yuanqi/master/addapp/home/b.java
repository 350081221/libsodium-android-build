package com.yuanqi.master.addapp.home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.navigation.NavHostController;
import com.yqtech.multiapp.R;
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

@i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\n\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\tX\u008a\u008e\u0002"}, d2 = {"CheckPermissionScreen", "", "navController", "Landroidx/navigation/NavHostController;", "addAppViewModel", "Lcom/yuanqi/master/addapp/AddAppViewModel;", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release", "notificationPermissionState", "", "fullScreenNotificationPermissionState", "allFilesAccessPermissionState", "storagePermissionState", "locationPermissionState", "floatingPermissionState", "shortcutPermissionState"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nCheckPermissionScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckPermissionScreen.kt\ncom/yuanqi/master/addapp/home/CheckPermissionScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,242:1\n81#2,11:243\n74#3:254\n25#4:255\n25#4:262\n25#4:269\n25#4:276\n25#4:283\n25#4:290\n25#4:297\n36#4:304\n36#4:311\n36#4:318\n1116#5,6:256\n1116#5,6:263\n1116#5,6:270\n1116#5,6:277\n1116#5,6:284\n1116#5,6:291\n1116#5,6:298\n1116#5,6:305\n1116#5,6:312\n1116#5,6:319\n81#6:325\n107#6,2:326\n81#6:328\n107#6,2:329\n81#6:331\n107#6,2:332\n81#6:334\n107#6,2:335\n81#6:337\n107#6,2:338\n81#6:340\n107#6,2:341\n81#6:343\n107#6,2:344\n*S KotlinDebug\n*F\n+ 1 CheckPermissionScreen.kt\ncom/yuanqi/master/addapp/home/CheckPermissionScreenKt\n*L\n47#1:243,11\n52#1:254\n55#1:255\n58#1:262\n61#1:269\n64#1:276\n67#1:283\n70#1:290\n73#1:297\n94#1:304\n102#1:311\n110#1:318\n55#1:256,6\n58#1:263,6\n61#1:270,6\n64#1:277,6\n67#1:284,6\n70#1:291,6\n73#1:298,6\n94#1:305,6\n102#1:312,6\n110#1:319,6\n55#1:325\n55#1:326,2\n58#1:328\n58#1:329,2\n61#1:331\n61#1:332,2\n64#1:334\n64#1:335,2\n67#1:337\n67#1:338,2\n70#1:340\n70#1:341,2\n73#1:343\n73#1:344,2\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ Context $context;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.addapp.home.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0286a extends n0 implements v3.a<r2> {
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0286a(Context context) {
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
                ComposerKt.traceEventStart(-626482684, i5, -1, "com.yuanqi.master.addapp.home.CheckPermissionScreen.<anonymous> (CheckPermissionScreen.kt:131)");
            }
            com.yuanqi.master.tools.a.f(StringResources_androidKt.stringResource(R.string.menu_permission_settings, composer, 6), null, new C0286a(this.$context), composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.addapp.home.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0287b extends n0 implements q<PaddingValues, Composer, Integer, r2> {
        final /* synthetic */ AddAppViewModel $addAppViewModel;
        final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $allFilesAccessPermissionResultLauncher;
        final /* synthetic */ MutableState<Boolean> $allFilesAccessPermissionState$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $floatingPermissionResultLauncher;
        final /* synthetic */ MutableState<Boolean> $floatingPermissionState$delegate;
        final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $locationPermissionResultLauncher;
        final /* synthetic */ MutableState<Boolean> $locationPermissionState$delegate;
        final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $notificationPermissionResultLauncher;
        final /* synthetic */ MutableState<Boolean> $notificationPermissionState$delegate;
        final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $shortcutPermissionResultLauncher;
        final /* synthetic */ MutableState<Boolean> $shortcutPermissionState$delegate;
        final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $storagePermissionResultLauncher;
        final /* synthetic */ MutableState<Boolean> $storagePermissionState$delegate;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nCheckPermissionScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckPermissionScreen.kt\ncom/yuanqi/master/addapp/home/CheckPermissionScreenKt$CheckPermissionScreen$2$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,242:1\n68#2,6:243\n74#2:277\n78#2:282\n79#3,11:249\n92#3:281\n456#4,8:260\n464#4,3:274\n467#4,3:278\n3737#5,6:268\n*S KotlinDebug\n*F\n+ 1 CheckPermissionScreen.kt\ncom/yuanqi/master/addapp/home/CheckPermissionScreenKt$CheckPermissionScreen$2$1\n*L\n139#1:243,6\n139#1:277\n139#1:282\n139#1:249,11\n139#1:281\n139#1:260,8\n139#1:274,3\n139#1:278,3\n139#1:268,6\n*E\n"})
        /* renamed from: com.yuanqi.master.addapp.home.b$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements q<BoxScope, Composer, Integer, r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;
            final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $allFilesAccessPermissionResultLauncher;
            final /* synthetic */ MutableState<Boolean> $allFilesAccessPermissionState$delegate;
            final /* synthetic */ Context $context;
            final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $floatingPermissionResultLauncher;
            final /* synthetic */ MutableState<Boolean> $floatingPermissionState$delegate;
            final /* synthetic */ PaddingValues $it;
            final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $locationPermissionResultLauncher;
            final /* synthetic */ MutableState<Boolean> $locationPermissionState$delegate;
            final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $notificationPermissionResultLauncher;
            final /* synthetic */ MutableState<Boolean> $notificationPermissionState$delegate;
            final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $shortcutPermissionResultLauncher;
            final /* synthetic */ MutableState<Boolean> $shortcutPermissionState$delegate;
            final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $storagePermissionResultLauncher;
            final /* synthetic */ MutableState<Boolean> $storagePermissionState$delegate;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.b$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0288a extends n0 implements v3.l<LazyListScope, r2> {
                final /* synthetic */ AddAppViewModel $addAppViewModel;
                final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $allFilesAccessPermissionResultLauncher;
                final /* synthetic */ MutableState<Boolean> $allFilesAccessPermissionState$delegate;
                final /* synthetic */ Context $context;
                final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $floatingPermissionResultLauncher;
                final /* synthetic */ MutableState<Boolean> $floatingPermissionState$delegate;
                final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $locationPermissionResultLauncher;
                final /* synthetic */ MutableState<Boolean> $locationPermissionState$delegate;
                final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $notificationPermissionResultLauncher;
                final /* synthetic */ MutableState<Boolean> $notificationPermissionState$delegate;
                final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $shortcutPermissionResultLauncher;
                final /* synthetic */ MutableState<Boolean> $shortcutPermissionState$delegate;
                final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $storagePermissionResultLauncher;
                final /* synthetic */ MutableState<Boolean> $storagePermissionState$delegate;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyItemScope;", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.yuanqi.master.addapp.home.b$b$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0289a extends n0 implements q<LazyItemScope, Composer, Integer, r2> {
                    final /* synthetic */ AddAppViewModel $addAppViewModel;
                    final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $allFilesAccessPermissionResultLauncher;
                    final /* synthetic */ MutableState<Boolean> $allFilesAccessPermissionState$delegate;
                    final /* synthetic */ Context $context;
                    final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $floatingPermissionResultLauncher;
                    final /* synthetic */ MutableState<Boolean> $floatingPermissionState$delegate;
                    final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $locationPermissionResultLauncher;
                    final /* synthetic */ MutableState<Boolean> $locationPermissionState$delegate;
                    final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $notificationPermissionResultLauncher;
                    final /* synthetic */ MutableState<Boolean> $notificationPermissionState$delegate;
                    final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $shortcutPermissionResultLauncher;
                    final /* synthetic */ MutableState<Boolean> $shortcutPermissionState$delegate;
                    final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $storagePermissionResultLauncher;
                    final /* synthetic */ MutableState<Boolean> $storagePermissionState$delegate;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.addapp.home.b$b$a$a$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0290a extends n0 implements v3.a<r2> {
                        final /* synthetic */ AddAppViewModel $addAppViewModel;
                        final /* synthetic */ Context $context;
                        final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $notificationPermissionResultLauncher;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0290a(Context context, AddAppViewModel addAppViewModel, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher) {
                            super(0);
                            this.$context = context;
                            this.$addAppViewModel = addAppViewModel;
                            this.$notificationPermissionResultLauncher = managedActivityResultLauncher;
                        }

                        @Override // v3.a
                        public /* bridge */ /* synthetic */ r2 invoke() {
                            invoke2();
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (f1.k(this.$context)) {
                                f1.r("通知权限已获取", 0, 2, null);
                            } else {
                                this.$addAppViewModel.T(this.$context, this.$notificationPermissionResultLauncher);
                            }
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.addapp.home.b$b$a$a$a$b, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C0291b extends n0 implements v3.a<r2> {
                        final /* synthetic */ AddAppViewModel $addAppViewModel;
                        final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $allFilesAccessPermissionResultLauncher;
                        final /* synthetic */ Context $context;
                        final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $storagePermissionResultLauncher;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0291b(AddAppViewModel addAppViewModel, Context context, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher2) {
                            super(0);
                            this.$addAppViewModel = addAppViewModel;
                            this.$context = context;
                            this.$allFilesAccessPermissionResultLauncher = managedActivityResultLauncher;
                            this.$storagePermissionResultLauncher = managedActivityResultLauncher2;
                        }

                        @Override // v3.a
                        public /* bridge */ /* synthetic */ r2 invoke() {
                            invoke2();
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (f1.e()) {
                                f1.r("所有文件访问权限已获取", 0, 2, null);
                            } else {
                                this.$addAppViewModel.R(this.$context, this.$allFilesAccessPermissionResultLauncher, this.$storagePermissionResultLauncher);
                            }
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.addapp.home.b$b$a$a$a$c */
                    /* loaded from: classes3.dex */
                    public static final class c extends n0 implements v3.a<r2> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $storagePermissionResultLauncher;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        c(Context context, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher) {
                            super(0);
                            this.$context = context;
                            this.$storagePermissionResultLauncher = managedActivityResultLauncher;
                        }

                        @Override // v3.a
                        public /* bridge */ /* synthetic */ r2 invoke() {
                            invoke2();
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (f1.n(this.$context)) {
                                f1.r("存储权限已获取", 0, 2, null);
                            } else {
                                this.$storagePermissionResultLauncher.launch("android.permission.WRITE_EXTERNAL_STORAGE");
                            }
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.addapp.home.b$b$a$a$a$d */
                    /* loaded from: classes3.dex */
                    public static final class d extends n0 implements v3.a<r2> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $locationPermissionResultLauncher;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        d(Context context, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher) {
                            super(0);
                            this.$context = context;
                            this.$locationPermissionResultLauncher = managedActivityResultLauncher;
                        }

                        @Override // v3.a
                        public /* bridge */ /* synthetic */ r2 invoke() {
                            invoke2();
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (f1.j(this.$context)) {
                                f1.r("位置权限已获取", 0, 2, null);
                            } else {
                                this.$locationPermissionResultLauncher.launch("android.permission.ACCESS_COARSE_LOCATION");
                            }
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.addapp.home.b$b$a$a$a$e */
                    /* loaded from: classes3.dex */
                    public static final class e extends n0 implements v3.a<r2> {
                        final /* synthetic */ AddAppViewModel $addAppViewModel;
                        final /* synthetic */ Context $context;
                        final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $shortcutPermissionResultLauncher;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        e(Context context, AddAppViewModel addAppViewModel, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher) {
                            super(0);
                            this.$context = context;
                            this.$addAppViewModel = addAppViewModel;
                            this.$shortcutPermissionResultLauncher = managedActivityResultLauncher;
                        }

                        @Override // v3.a
                        public /* bridge */ /* synthetic */ r2 invoke() {
                            invoke2();
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (f1.i(this.$context)) {
                                f1.r("创建桌面快捷方式权限已获取", 0, 2, null);
                            } else {
                                this.$addAppViewModel.c0(this.$context, this.$shortcutPermissionResultLauncher);
                            }
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.addapp.home.b$b$a$a$a$f */
                    /* loaded from: classes3.dex */
                    public static final class f extends n0 implements v3.a<r2> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $floatingPermissionResultLauncher;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        f(Context context, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher) {
                            super(0);
                            this.$context = context;
                            this.$floatingPermissionResultLauncher = managedActivityResultLauncher;
                        }

                        @Override // v3.a
                        public /* bridge */ /* synthetic */ r2 invoke() {
                            invoke2();
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Intent intent;
                            if (Build.VERSION.SDK_INT >= 26) {
                                intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                            } else {
                                intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + this.$context.getPackageName()));
                            }
                            this.$floatingPermissionResultLauncher.launch(intent);
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.addapp.home.b$b$a$a$a$g */
                    /* loaded from: classes3.dex */
                    public static final class g extends n0 implements v3.a<r2> {
                        final /* synthetic */ AddAppViewModel $addAppViewModel;
                        final /* synthetic */ Context $context;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        g(AddAppViewModel addAppViewModel, Context context) {
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
                            this.$addAppViewModel.a0(this.$context);
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.yuanqi.master.addapp.home.b$b$a$a$a$h */
                    /* loaded from: classes3.dex */
                    public static final class h extends n0 implements v3.a<r2> {
                        final /* synthetic */ AddAppViewModel $addAppViewModel;
                        final /* synthetic */ Context $context;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        h(AddAppViewModel addAppViewModel, Context context) {
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
                            this.$addAppViewModel.x0(this.$context);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0289a(Context context, MutableState<Boolean> mutableState, AddAppViewModel addAppViewModel, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, MutableState<Boolean> mutableState2, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher2, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher3, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher4, MutableState<Boolean> mutableState5, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher5, MutableState<Boolean> mutableState6, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher6) {
                        super(3);
                        this.$context = context;
                        this.$notificationPermissionState$delegate = mutableState;
                        this.$addAppViewModel = addAppViewModel;
                        this.$notificationPermissionResultLauncher = managedActivityResultLauncher;
                        this.$allFilesAccessPermissionState$delegate = mutableState2;
                        this.$allFilesAccessPermissionResultLauncher = managedActivityResultLauncher2;
                        this.$storagePermissionResultLauncher = managedActivityResultLauncher3;
                        this.$storagePermissionState$delegate = mutableState3;
                        this.$locationPermissionState$delegate = mutableState4;
                        this.$locationPermissionResultLauncher = managedActivityResultLauncher4;
                        this.$shortcutPermissionState$delegate = mutableState5;
                        this.$shortcutPermissionResultLauncher = managedActivityResultLauncher5;
                        this.$floatingPermissionState$delegate = mutableState6;
                        this.$floatingPermissionResultLauncher = managedActivityResultLauncher6;
                    }

                    @Override // v3.q
                    public /* bridge */ /* synthetic */ r2 invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return r2.f19517a;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@p4.l LazyItemScope item, @p4.m Composer composer, int i5) {
                        l0.p(item, "$this$item");
                        if ((i5 & 81) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1156818100, i5, -1, "com.yuanqi.master.addapp.home.CheckPermissionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckPermissionScreen.kt:141)");
                        }
                        com.yuanqi.master.tools.a.n("通知权限", b.b(this.$notificationPermissionState$delegate) || f1.k(this.$context), false, new C0290a(this.$context, this.$addAppViewModel, this.$notificationPermissionResultLauncher), composer, 6, 4);
                        com.yuanqi.master.tools.a.n("所有文件访问权限", b.n(this.$allFilesAccessPermissionState$delegate) || f1.e(), false, new C0291b(this.$addAppViewModel, this.$context, this.$allFilesAccessPermissionResultLauncher, this.$storagePermissionResultLauncher), composer, 6, 4);
                        com.yuanqi.master.tools.a.n("存储权限", b.c(this.$storagePermissionState$delegate) || f1.n(this.$context), false, new c(this.$context, this.$storagePermissionResultLauncher), composer, 6, 4);
                        com.yuanqi.master.tools.a.n("位置权限", b.e(this.$locationPermissionState$delegate) || f1.j(this.$context), false, new d(this.$context, this.$locationPermissionResultLauncher), composer, 6, 4);
                        com.yuanqi.master.tools.a.n("创建桌面快捷方式权限", b.i(this.$shortcutPermissionState$delegate) || f1.i(this.$context), false, new e(this.$context, this.$addAppViewModel, this.$shortcutPermissionResultLauncher), composer, 6, 4);
                        com.yuanqi.master.tools.a.n("悬浮窗权限", b.g(this.$floatingPermissionState$delegate) || f1.f(this.$context), false, new f(this.$context, this.$floatingPermissionResultLauncher), composer, 6, 4);
                        com.yuanqi.master.tools.a.n("后台运行权限", false, false, new g(this.$addAppViewModel, this.$context), composer, 390, 2);
                        com.yuanqi.master.tools.a.n("自启动权限", false, false, new h(this.$addAppViewModel, this.$context), composer, 390, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0288a(Context context, MutableState<Boolean> mutableState, AddAppViewModel addAppViewModel, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, MutableState<Boolean> mutableState2, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher2, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher3, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher4, MutableState<Boolean> mutableState5, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher5, MutableState<Boolean> mutableState6, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher6) {
                    super(1);
                    this.$context = context;
                    this.$notificationPermissionState$delegate = mutableState;
                    this.$addAppViewModel = addAppViewModel;
                    this.$notificationPermissionResultLauncher = managedActivityResultLauncher;
                    this.$allFilesAccessPermissionState$delegate = mutableState2;
                    this.$allFilesAccessPermissionResultLauncher = managedActivityResultLauncher2;
                    this.$storagePermissionResultLauncher = managedActivityResultLauncher3;
                    this.$storagePermissionState$delegate = mutableState3;
                    this.$locationPermissionState$delegate = mutableState4;
                    this.$locationPermissionResultLauncher = managedActivityResultLauncher4;
                    this.$shortcutPermissionState$delegate = mutableState5;
                    this.$shortcutPermissionResultLauncher = managedActivityResultLauncher5;
                    this.$floatingPermissionState$delegate = mutableState6;
                    this.$floatingPermissionResultLauncher = managedActivityResultLauncher6;
                }

                @Override // v3.l
                public /* bridge */ /* synthetic */ r2 invoke(LazyListScope lazyListScope) {
                    invoke2(lazyListScope);
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@p4.l LazyListScope LazyColumn) {
                    l0.p(LazyColumn, "$this$LazyColumn");
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1156818100, true, new C0289a(this.$context, this.$notificationPermissionState$delegate, this.$addAppViewModel, this.$notificationPermissionResultLauncher, this.$allFilesAccessPermissionState$delegate, this.$allFilesAccessPermissionResultLauncher, this.$storagePermissionResultLauncher, this.$storagePermissionState$delegate, this.$locationPermissionState$delegate, this.$locationPermissionResultLauncher, this.$shortcutPermissionState$delegate, this.$shortcutPermissionResultLauncher, this.$floatingPermissionState$delegate, this.$floatingPermissionResultLauncher)), 3, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(PaddingValues paddingValues, Context context, MutableState<Boolean> mutableState, AddAppViewModel addAppViewModel, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, MutableState<Boolean> mutableState2, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher2, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher3, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher4, MutableState<Boolean> mutableState5, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher5, MutableState<Boolean> mutableState6, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher6) {
                super(3);
                this.$it = paddingValues;
                this.$context = context;
                this.$notificationPermissionState$delegate = mutableState;
                this.$addAppViewModel = addAppViewModel;
                this.$notificationPermissionResultLauncher = managedActivityResultLauncher;
                this.$allFilesAccessPermissionState$delegate = mutableState2;
                this.$allFilesAccessPermissionResultLauncher = managedActivityResultLauncher2;
                this.$storagePermissionResultLauncher = managedActivityResultLauncher3;
                this.$storagePermissionState$delegate = mutableState3;
                this.$locationPermissionState$delegate = mutableState4;
                this.$locationPermissionResultLauncher = managedActivityResultLauncher4;
                this.$shortcutPermissionState$delegate = mutableState5;
                this.$shortcutPermissionResultLauncher = managedActivityResultLauncher5;
                this.$floatingPermissionState$delegate = mutableState6;
                this.$floatingPermissionResultLauncher = managedActivityResultLauncher6;
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
                    ComposerKt.traceEventStart(1446062514, i5, -1, "com.yuanqi.master.addapp.home.CheckPermissionScreen.<anonymous>.<anonymous> (CheckPermissionScreen.kt:138)");
                }
                Modifier padding = PaddingKt.padding(Modifier.Companion, this.$it);
                Context context = this.$context;
                MutableState<Boolean> mutableState = this.$notificationPermissionState$delegate;
                AddAppViewModel addAppViewModel = this.$addAppViewModel;
                ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher = this.$notificationPermissionResultLauncher;
                MutableState<Boolean> mutableState2 = this.$allFilesAccessPermissionState$delegate;
                ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher2 = this.$allFilesAccessPermissionResultLauncher;
                ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher3 = this.$storagePermissionResultLauncher;
                MutableState<Boolean> mutableState3 = this.$storagePermissionState$delegate;
                MutableState<Boolean> mutableState4 = this.$locationPermissionState$delegate;
                ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher4 = this.$locationPermissionResultLauncher;
                MutableState<Boolean> mutableState5 = this.$shortcutPermissionState$delegate;
                ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher5 = this.$shortcutPermissionResultLauncher;
                MutableState<Boolean> mutableState6 = this.$floatingPermissionState$delegate;
                ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher6 = this.$floatingPermissionResultLauncher;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                v3.a<ComposeUiNode> constructor = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
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
                Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new C0288a(context, mutableState, addAppViewModel, managedActivityResultLauncher, mutableState2, managedActivityResultLauncher2, managedActivityResultLauncher3, mutableState3, mutableState4, managedActivityResultLauncher4, mutableState5, managedActivityResultLauncher5, mutableState6, managedActivityResultLauncher6), composer, 0, 255);
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
        C0287b(Context context, MutableState<Boolean> mutableState, AddAppViewModel addAppViewModel, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, MutableState<Boolean> mutableState2, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher2, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher3, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher4, MutableState<Boolean> mutableState5, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher5, MutableState<Boolean> mutableState6, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher6) {
            super(3);
            this.$context = context;
            this.$notificationPermissionState$delegate = mutableState;
            this.$addAppViewModel = addAppViewModel;
            this.$notificationPermissionResultLauncher = managedActivityResultLauncher;
            this.$allFilesAccessPermissionState$delegate = mutableState2;
            this.$allFilesAccessPermissionResultLauncher = managedActivityResultLauncher2;
            this.$storagePermissionResultLauncher = managedActivityResultLauncher3;
            this.$storagePermissionState$delegate = mutableState3;
            this.$locationPermissionState$delegate = mutableState4;
            this.$locationPermissionResultLauncher = managedActivityResultLauncher4;
            this.$shortcutPermissionState$delegate = mutableState5;
            this.$shortcutPermissionResultLauncher = managedActivityResultLauncher5;
            this.$floatingPermissionState$delegate = mutableState6;
            this.$floatingPermissionResultLauncher = managedActivityResultLauncher6;
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
                ComposerKt.traceEventStart(1731280345, i5, -1, "com.yuanqi.master.addapp.home.CheckPermissionScreen.<anonymous> (CheckPermissionScreen.kt:137)");
            }
            com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, 1446062514, true, new a(it, this.$context, this.$notificationPermissionState$delegate, this.$addAppViewModel, this.$notificationPermissionResultLauncher, this.$allFilesAccessPermissionState$delegate, this.$allFilesAccessPermissionResultLauncher, this.$storagePermissionResultLauncher, this.$storagePermissionState$delegate, this.$locationPermissionState$delegate, this.$locationPermissionResultLauncher, this.$shortcutPermissionState$delegate, this.$shortcutPermissionResultLauncher, this.$floatingPermissionState$delegate, this.$floatingPermissionResultLauncher)), composer, 6);
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

        public final void invoke(@p4.m Composer composer, int i5) {
            b.a(this.$navController, this.$addAppViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
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
            b.o(this.$allFilesAccessPermissionState$delegate, f1.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/activity/result/ActivityResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends n0 implements v3.l<ActivityResult, r2> {
        final /* synthetic */ Context $context;
        final /* synthetic */ MutableState<Boolean> $floatingPermissionState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, MutableState<Boolean> mutableState) {
            super(1);
            this.$context = context;
            this.$floatingPermissionState$delegate = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ActivityResult activityResult) {
            invoke2(activityResult);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l ActivityResult it) {
            l0.p(it, "it");
            b.h(this.$floatingPermissionState$delegate, f1.f(this.$context));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/activity/result/ActivityResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends n0 implements v3.l<ActivityResult, r2> {
        final /* synthetic */ Context $context;
        final /* synthetic */ MutableState<Boolean> $fullScreenNotificationPermissionState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, MutableState<Boolean> mutableState) {
            super(1);
            this.$context = context;
            this.$fullScreenNotificationPermissionState$delegate = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ActivityResult activityResult) {
            invoke2(activityResult);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l ActivityResult it) {
            l0.p(it, "it");
            b.m(this.$fullScreenNotificationPermissionState$delegate, f1.g(this.$context));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends n0 implements v3.l<Boolean, r2> {
        final /* synthetic */ MutableState<Boolean> $locationPermissionState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(MutableState<Boolean> mutableState) {
            super(1);
            this.$locationPermissionState$delegate = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return r2.f19517a;
        }

        public final void invoke(boolean z4) {
            b.f(this.$locationPermissionState$delegate, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/activity/result/ActivityResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h extends n0 implements v3.l<ActivityResult, r2> {
        final /* synthetic */ Context $context;
        final /* synthetic */ MutableState<Boolean> $notificationPermissionState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, MutableState<Boolean> mutableState) {
            super(1);
            this.$context = context;
            this.$notificationPermissionState$delegate = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ActivityResult activityResult) {
            invoke2(activityResult);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l ActivityResult it) {
            l0.p(it, "it");
            b.j(this.$notificationPermissionState$delegate, f1.k(this.$context));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/activity/result/ActivityResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i extends n0 implements v3.l<ActivityResult, r2> {
        final /* synthetic */ Context $context;
        final /* synthetic */ MutableState<Boolean> $shortcutPermissionState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Context context, MutableState<Boolean> mutableState) {
            super(1);
            this.$context = context;
            this.$shortcutPermissionState$delegate = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ActivityResult activityResult) {
            invoke2(activityResult);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l ActivityResult it) {
            l0.p(it, "it");
            b.k(this.$shortcutPermissionState$delegate, f1.i(this.$context));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j extends n0 implements v3.l<Boolean, r2> {
        final /* synthetic */ MutableState<Boolean> $storagePermissionState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(MutableState<Boolean> mutableState) {
            super(1);
            this.$storagePermissionState$delegate = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return r2.f19517a;
        }

        public final void invoke(boolean z4) {
            b.d(this.$storagePermissionState$delegate, z4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0281  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@p4.l androidx.navigation.NavHostController r39, @p4.m com.yuanqi.master.addapp.AddAppViewModel r40, @p4.m androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.addapp.home.b.a(androidx.navigation.NavHostController, com.yuanqi.master.addapp.AddAppViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(MutableState<Boolean> mutableState) {
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
    public static final boolean e(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(MutableState<Boolean> mutableState, boolean z4) {
        mutableState.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(MutableState<Boolean> mutableState, boolean z4) {
        mutableState.setValue(Boolean.valueOf(z4));
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

    private static final boolean l(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(MutableState<Boolean> mutableState, boolean z4) {
        mutableState.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(MutableState<Boolean> mutableState, boolean z4) {
        mutableState.setValue(Boolean.valueOf(z4));
    }
}
