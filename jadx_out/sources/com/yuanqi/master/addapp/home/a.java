package com.yuanqi.master.addapp.home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.navigation.NavHostController;
import com.yqtech.multiapp.R;
import com.yuanqi.master.addapp.AddAppActivity;
import com.yuanqi.master.addapp.AddAppViewModel;
import com.yuanqi.master.start.TextActivity;
import com.yuanqi.master.tools.f1;
import com.yuanqi.master.tools.v0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"AboutUsScreen", "", "navController", "Landroidx/navigation/NavHostController;", "addAppViewModel", "Lcom/yuanqi/master/addapp/AddAppViewModel;", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nAboutUsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutUsScreen.kt\ncom/yuanqi/master/addapp/home/AboutUsScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,251:1\n81#2,11:252\n25#3:263\n25#3:274\n1116#4,6:264\n1116#4,3:275\n1119#4,3:281\n487#5,4:270\n491#5,2:278\n495#5:284\n487#6:280\n74#7:285\n*S KotlinDebug\n*F\n+ 1 AboutUsScreen.kt\ncom/yuanqi/master/addapp/home/AboutUsScreenKt\n*L\n66#1:252,11\n70#1:263\n71#1:274\n70#1:264,6\n71#1:275,3\n71#1:281,3\n71#1:270,4\n71#1:278,2\n71#1:284\n71#1:280\n73#1:285\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.addapp.home.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0280a extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ Context $context;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.addapp.home.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0281a extends n0 implements v3.a<r2> {
            final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0281a(Context context) {
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
        C0280a(Context context) {
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
                ComposerKt.traceEventStart(1839901404, i5, -1, "com.yuanqi.master.addapp.home.AboutUsScreen.<anonymous> (AboutUsScreen.kt:76)");
            }
            com.yuanqi.master.tools.a.f(StringResources_androidKt.stringResource(R.string.about_title, composer, 6), null, new C0281a(this.$context), composer, 0, 2);
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
        @r1({"SMAP\nAboutUsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutUsScreen.kt\ncom/yuanqi/master/addapp/home/AboutUsScreenKt$AboutUsScreen$2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,251:1\n74#2,6:252\n80#2:286\n74#2,6:322\n80#2:356\n84#2:361\n74#2,6:368\n80#2:402\n84#2:408\n84#2:413\n79#3,11:258\n79#3,11:293\n79#3,11:328\n92#3:360\n92#3:365\n79#3,11:374\n92#3:407\n92#3:412\n456#4,8:269\n464#4,3:283\n456#4,8:304\n464#4,3:318\n456#4,8:339\n464#4,3:353\n467#4,3:357\n467#4,3:362\n456#4,8:385\n464#4,3:399\n467#4,3:404\n467#4,3:409\n3737#5,6:277\n3737#5,6:312\n3737#5,6:347\n3737#5,6:393\n68#6,6:287\n74#6:321\n78#6:366\n154#7:367\n154#7:403\n*S KotlinDebug\n*F\n+ 1 AboutUsScreen.kt\ncom/yuanqi/master/addapp/home/AboutUsScreenKt$AboutUsScreen$2$1\n*L\n84#1:252,6\n84#1:286\n92#1:322,6\n92#1:356\n92#1:361\n185#1:368,6\n185#1:402\n185#1:408\n84#1:413\n84#1:258,11\n85#1:293,11\n92#1:328,11\n92#1:360\n85#1:365\n185#1:374,11\n185#1:407\n84#1:412\n84#1:269,8\n84#1:283,3\n85#1:304,8\n85#1:318,3\n92#1:339,8\n92#1:353,3\n92#1:357,3\n85#1:362,3\n185#1:385,8\n185#1:399,3\n185#1:404,3\n84#1:409,3\n84#1:277,6\n85#1:312,6\n92#1:347,6\n185#1:393,6\n85#1:287,6\n85#1:321\n85#1:366\n188#1:367\n216#1:403\n*E\n"})
        /* renamed from: com.yuanqi.master.addapp.home.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0282a extends n0 implements q<BoxScope, Composer, Integer, r2> {
            final /* synthetic */ AddAppViewModel $addAppViewModel;
            final /* synthetic */ Context $context;
            final /* synthetic */ PaddingValues $it;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.a$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0283a extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0283a(Context context) {
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
                    intent.putExtra(com.alipay.sdk.m.x.d.f3030v, this.$context.getString(R.string.privacy));
                    intent.putExtra("content", com.yuanqi.master.config.d.f14560d);
                    context.startActivity(intent);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.a$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0284b extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0284b(Context context) {
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
                    intent.putExtra(com.alipay.sdk.m.x.d.f3030v, this.$context.getString(R.string.term));
                    intent.putExtra("content", com.yuanqi.master.config.d.f14559c);
                    context.startActivity(intent);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.a$b$a$c */
            /* loaded from: classes3.dex */
            public static final class c extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(Context context) {
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
                    v0.f15260a.l(this.$context);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nAboutUsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutUsScreen.kt\ncom/yuanqi/master/addapp/home/AboutUsScreenKt$AboutUsScreen$2$1$1$1$1$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,251:1\n154#2:252\n*S KotlinDebug\n*F\n+ 1 AboutUsScreen.kt\ncom/yuanqi/master/addapp/home/AboutUsScreenKt$AboutUsScreen$2$1$1$1$1$4\n*L\n126#1:252\n*E\n"})
            /* renamed from: com.yuanqi.master.addapp.home.a$b$a$d */
            /* loaded from: classes3.dex */
            public static final class d extends n0 implements p<Composer, Integer, r2> {
                final /* synthetic */ AddAppViewModel $addAppViewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(AddAppViewModel addAppViewModel) {
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
                        ComposerKt.traceEventStart(491621768, i5, -1, "com.yuanqi.master.addapp.home.AboutUsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AboutUsScreen.kt:124)");
                    }
                    if (this.$addAppViewModel.t().getValue().booleanValue()) {
                        SpacerKt.Spacer(SizeKt.m607width3ABfNKs(Modifier.Companion, Dp.m6044constructorimpl(20)), composer, 6);
                        TextKt.m1514Text4IGK_g(StringResources_androidKt.stringResource(R.string.have_new_version, composer, 6), (Modifier) null, Color.Companion.m3768getRed0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5986getEllipsisgIe3tQ8(), false, 1, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 200064, 3120, 120786);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.a$b$a$e */
            /* loaded from: classes3.dex */
            public static final class e extends n0 implements v3.a<r2> {
                final /* synthetic */ AddAppViewModel $addAppViewModel;
                final /* synthetic */ Context $context;
                final /* synthetic */ String $msg;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(AddAppViewModel addAppViewModel, String str, Context context) {
                    super(0);
                    this.$addAppViewModel = addAppViewModel;
                    this.$msg = str;
                    this.$context = context;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (!this.$addAppViewModel.t().getValue().booleanValue()) {
                        f1.r(this.$msg, 0, 2, null);
                    } else {
                        v0.f15260a.g(this.$context);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.a$b$a$f */
            /* loaded from: classes3.dex */
            public static final class f extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(Context context) {
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
                    v0.f15260a.a(this.$context);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.a$b$a$g */
            /* loaded from: classes3.dex */
            public static final class g extends n0 implements p<Composer, Integer, r2> {
                final /* synthetic */ String $wechatStr;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(String str) {
                    super(2);
                    this.$wechatStr = str;
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
                        ComposerKt.traceEventStart(-683302774, i5, -1, "com.yuanqi.master.addapp.home.AboutUsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AboutUsScreen.kt:160)");
                    }
                    long sp = TextUnitKt.getSp(14);
                    androidx.compose.material3.TextKt.m2452Text4IGK_g(this.$wechatStr, (Modifier) null, com.yuanqi.master.theme.b.L(), sp, (FontStyle) null, FontWeight.Companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 200070, 0, 131026);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.a$b$a$h */
            /* loaded from: classes3.dex */
            public static final class h extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;
                final /* synthetic */ String $copySuccess;
                final /* synthetic */ String $wechatStr;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(Context context, String str, String str2) {
                    super(0);
                    this.$context = context;
                    this.$wechatStr = str;
                    this.$copySuccess = str2;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    v0.f15260a.c(this.$context, this.$wechatStr);
                    f1.r(this.$copySuccess, 0, 2, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.a$b$a$i */
            /* loaded from: classes3.dex */
            public static final class i extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(Context context) {
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
                    v0.f15260a.k(com.yuanqi.master.config.c.f14548r, this.$context);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.a$b$a$j */
            /* loaded from: classes3.dex */
            public static final class j extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(Context context) {
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
                    this.$context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://beian.miit.gov.cn")));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0282a(PaddingValues paddingValues, Context context, AddAppViewModel addAppViewModel) {
                super(3);
                this.$it = paddingValues;
                this.$context = context;
                this.$addAppViewModel = addAppViewModel;
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
                    ComposerKt.traceEventStart(2137280138, i5, -1, "com.yuanqi.master.addapp.home.AboutUsScreen.<anonymous>.<anonymous> (AboutUsScreen.kt:83)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                PaddingValues paddingValues = this.$it;
                Context context = this.$context;
                AddAppViewModel addAppViewModel = this.$addAppViewModel;
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
                Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                Modifier padding = PaddingKt.padding(SizeKt.fillMaxSize$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), 0.0f, 1, null), paddingValues);
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(padding);
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
                Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(verticalScroll$default);
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
                Updater.m3271setimpl(m3264constructorimpl3, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                String stringResource = StringResources_androidKt.stringResource(R.string.is_last, composer, 6);
                com.yuanqi.master.tools.a.a(R.mipmap.privacy, StringResources_androidKt.stringResource(R.string.privacy, composer, 6), null, new C0283a(context), composer, 6, 4);
                com.yuanqi.master.tools.a.a(R.mipmap.term, StringResources_androidKt.stringResource(R.string.term, composer, 6), null, new C0284b(context), composer, 6, 4);
                com.yuanqi.master.tools.a.a(R.mipmap.review, StringResources_androidKt.stringResource(R.string.review, composer, 6), null, new c(context), composer, 6, 4);
                com.yuanqi.master.tools.a.a(R.mipmap.check_update, StringResources_androidKt.stringResource(R.string.check_update, composer, 6), ComposableLambdaKt.composableLambda(composer, 491621768, true, new d(addAppViewModel)), new e(addAppViewModel, stringResource, context), composer, 390, 0);
                String stringResource2 = StringResources_androidKt.stringResource(R.string.contact_us, composer, 6);
                com.yuanqi.master.addapp.home.c cVar = com.yuanqi.master.addapp.home.c.f14465a;
                com.yuanqi.master.tools.a.a(R.mipmap.qq, stringResource2, cVar.a(), new f(context), composer, 390, 0);
                com.yuanqi.master.tools.a.a(R.mipmap.weixin, StringResources_androidKt.stringResource(R.string.weixin, composer, 6), ComposableLambdaKt.composableLambda(composer, -683302774, true, new g("YuanQi23")), new h(context, "YuanQi23", StringResources_androidKt.stringResource(R.string.copy_suceess, composer, 6)), composer, 390, 0);
                com.yuanqi.master.tools.a.a(R.mipmap.web, StringResources_androidKt.stringResource(R.string.web, composer, 6), cVar.b(), new i(context), composer, 390, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6044constructorimpl(8), 1, null);
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor4 = companion3.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
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
                Updater.m3271setimpl(m3264constructorimpl4, columnMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl4.getInserting() || !l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                androidx.compose.material3.TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.app_name, composer, 6), (Modifier) null, com.yuanqi.master.theme.b.L(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 200064, 0, 131026);
                androidx.compose.material3.TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.version, composer, 6) + ':' + v0.f15260a.d(context), (Modifier) null, com.yuanqi.master.theme.b.Q(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3456, 0, 131058);
                androidx.compose.material3.TextKt.m2452Text4IGK_g("豫ICP备2024051549号-1A", PaddingKt.m557paddingqDBjuR0$default(ClickableKt.m235clickableXHw0xAI$default(companion, false, null, null, new j(context), 7, null), 0.0f, Dp.m6044constructorimpl((float) 20), 0.0f, 0.0f, 13, null), com.yuanqi.master.theme.b.Q(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3462, 0, 131056);
                androidx.compose.material3.TextKt.m2452Text4IGK_g("Copyright©2023-" + com.yuanqi.master.tools.d.f15067a.a() + " YuanqiTechnology", (Modifier) null, com.yuanqi.master.theme.b.Q(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3456, 0, 131058);
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
        /* renamed from: com.yuanqi.master.addapp.home.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0285b extends n0 implements v3.a<r2> {
            public static final C0285b INSTANCE = new C0285b();

            C0285b() {
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
                ComposerKt.traceEventStart(-1589145423, i5, -1, "com.yuanqi.master.addapp.home.AboutUsScreen.<anonymous> (AboutUsScreen.kt:82)");
            }
            com.yuanqi.master.tools.a.h(ComposableLambdaKt.composableLambda(composer, 2137280138, true, new C0282a(it, this.$context, this.$addAppViewModel)), composer, 6);
            if (this.$addAppViewModel.E().getValue().booleanValue()) {
                AndroidDialog_androidKt.Dialog(C0285b.INSTANCE, null, com.yuanqi.master.addapp.home.c.f14465a.c(), composer, 390, 2);
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
            a.a(this.$navController, this.$addAppViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0138  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@p4.l androidx.navigation.NavHostController r23, @p4.m com.yuanqi.master.addapp.AddAppViewModel r24, @p4.m androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.addapp.home.a.a(androidx.navigation.NavHostController, com.yuanqi.master.addapp.AddAppViewModel, androidx.compose.runtime.Composer, int, int):void");
    }
}
