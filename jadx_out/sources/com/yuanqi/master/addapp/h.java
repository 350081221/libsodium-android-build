package com.yuanqi.master.addapp;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.ArrowBackKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavHostController;
import com.yuanqi.master.ViewModelFactoryKt;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"WebScreen", "", "navController", "Landroidx/navigation/NavHostController;", "addAppViewModel", "Lcom/yuanqi/master/addapp/AddAppViewModel;", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nWebViewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewScreen.kt\ncom/yuanqi/master/addapp/WebViewScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,89:1\n81#2,11:90\n74#3:101\n*S KotlinDebug\n*F\n+ 1 WebViewScreen.kt\ncom/yuanqi/master/addapp/WebViewScreenKt\n*L\n34#1:90,11\n38#1:101\n*E\n"})
/* loaded from: classes3.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ Context $context;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ String $title;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.addapp.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0271a extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ String $title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0271a(String str) {
                super(2);
                this.$title = str;
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
                    ComposerKt.traceEventStart(-58910451, i5, -1, "com.yuanqi.master.addapp.WebScreen.<anonymous>.<anonymous> (WebViewScreen.kt:46)");
                }
                TextKt.m2452Text4IGK_g(this.$title, (Modifier) null, 0L, TextUnitKt.getSp(22), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, 0, false, 0, 0, (l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3072, 0, 130550);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nWebViewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewScreen.kt\ncom/yuanqi/master/addapp/WebViewScreenKt$WebScreen$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,89:1\n154#2:90\n*S KotlinDebug\n*F\n+ 1 WebViewScreen.kt\ncom/yuanqi/master/addapp/WebViewScreenKt$WebScreen$1$2\n*L\n53#1:90\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class b extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ Context $context;
            final /* synthetic */ NavHostController $navController;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.h$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0272a extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;
                final /* synthetic */ NavHostController $navController;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0272a(NavHostController navHostController, Context context) {
                    super(0);
                    this.$navController = navHostController;
                    this.$context = context;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (this.$navController.popBackStack()) {
                        return;
                    }
                    Context context = this.$context;
                    if (context instanceof AddAppActivity) {
                        ((AddAppActivity) context).finish();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(NavHostController navHostController, Context context) {
                super(2);
                this.$navController = navHostController;
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
                    ComposerKt.traceEventStart(511361355, i5, -1, "com.yuanqi.master.addapp.WebScreen.<anonymous>.<anonymous> (WebViewScreen.kt:49)");
                }
                float f5 = 10;
                IconKt.m1925Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.Rounded.INSTANCE), "", ClickableKt.m235clickableXHw0xAI$default(PaddingKt.m557paddingqDBjuR0$default(Modifier.Companion, Dp.m6044constructorimpl(f5), 0.0f, Dp.m6044constructorimpl(f5), 0.0f, 10, null), false, null, null, new C0272a(this.$navController, this.$context), 7, null), 0L, composer, 48, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, NavHostController navHostController, Context context) {
            super(2);
            this.$title = str;
            this.$navController = navHostController;
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
                ComposerKt.traceEventStart(1191163985, i5, -1, "com.yuanqi.master.addapp.WebScreen.<anonymous> (WebViewScreen.kt:41)");
            }
            AppBarKt.TopAppBar(ComposableLambdaKt.composableLambda(composer, -58910451, true, new C0271a(this.$title)), null, ComposableLambdaKt.composableLambda(composer, 511361355, true, new b(this.$navController, this.$context)), null, null, TopAppBarDefaults.INSTANCE.m2611topAppBarColorszjMxDiM(Color.Companion.m3760getBlack0d7_KjU(), 0L, 0L, 0L, 0L, composer, ((TopAppBarDefaults.$stable | 0) << 15) | 6, 30), null, composer, 390, 90);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nWebViewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewScreen.kt\ncom/yuanqi/master/addapp/WebViewScreenKt$WebScreen$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,89:1\n36#2:90\n1116#3,6:91\n*S KotlinDebug\n*F\n+ 1 WebViewScreen.kt\ncom/yuanqi/master/addapp/WebViewScreenKt$WebScreen$2\n*L\n68#1:90\n68#1:91,6\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements q<PaddingValues, Composer, Integer, r2> {
        final /* synthetic */ String $url;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/webkit/WebView;", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements l<Context, WebView> {
            final /* synthetic */ String $url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.$url = str;
            }

            @Override // v3.l
            @p4.l
            public final WebView invoke(@p4.l Context context) {
                l0.p(context, "context");
                WebView webView = new WebView(context);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                webView.getSettings().setAllowFileAccess(true);
                webView.getSettings().setAllowFileAccessFromFileURLs(true);
                webView.getSettings().setAllowContentAccess(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setMixedContentMode(0);
                webView.getSettings().setUserAgentString("yuanqi");
                webView.getSettings().setCacheMode(-1);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl(this.$url);
                return webView;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(3);
            this.$url = str;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.l PaddingValues it, @m Composer composer, int i5) {
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
                ComposerKt.traceEventStart(-1840894070, i5, -1, "com.yuanqi.master.addapp.WebScreen.<anonymous> (WebViewScreen.kt:65)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.Companion, it), 0.0f, 1, null);
            String str = this.$url;
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(str);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(str);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((l) rememberedValue, fillMaxSize$default, null, composer, 0, 4);
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
            h.a(this.$navController, this.$addAppViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@p4.l NavHostController navController, @m AddAppViewModel addAppViewModel, @m Composer composer, int i5, int i6) {
        AddAppViewModel addAppViewModel2;
        CreationExtras creationExtras;
        l0.p(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(129837388);
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
            ComposerKt.traceEventStart(129837388, i5, -1, "com.yuanqi.master.addapp.WebScreen (WebViewScreen.kt:34)");
        }
        AddAppViewModel addAppViewModel3 = addAppViewModel2;
        ScaffoldKt.m1420Scaffold27mzLpw(null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1191163985, true, new a(addAppViewModel2.I(), navController, (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(startRestartGroup, -1840894070, true, new b(addAppViewModel2.y())), startRestartGroup, 384, 12582912, 131067);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(navController, addAppViewModel3, i5, i6));
        }
    }
}
