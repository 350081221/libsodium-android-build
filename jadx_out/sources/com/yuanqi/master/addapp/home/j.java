package com.yuanqi.master.addapp.home;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.ArrowBackKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.navigation.NavHostController;
import com.yuanqi.master.addapp.AddAppActivity;
import com.yuanqi.master.addapp.AddAppViewModel;
import com.yuanqi.master.tools.q0;
import com.yuanqi.master.tools.x0;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v0;
import kotlin.q1;
import kotlin.r2;
import kotlin.reflect.o;
import kotlin.text.k0;
import v3.p;
import v3.q;
import v3.r;

@i0(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a+\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\u0012\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u008a\u008e\u0002²\u0006\u0012\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\t0\tX\u008a\u008e\u0002"}, d2 = {"LanguageSwitchScreen", "", "navController", "Landroidx/navigation/NavHostController;", "addAppViewModel", "Lcom/yuanqi/master/addapp/AddAppViewModel;", "(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V", "LanguageToggleButton", "text", "", "selected", "", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release", "selectedLanguage", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "localValue"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nLanguageSwitchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,176:1\n81#2,11:177\n25#3:188\n36#3:196\n456#3,8:221\n464#3,3:235\n467#3,3:239\n1116#4,6:189\n1116#4,6:197\n74#5:195\n154#6:203\n154#6:204\n154#6:205\n154#6:206\n154#6:207\n91#7,2:208\n93#7:238\n97#7:243\n79#8,11:210\n92#8:242\n3737#9,6:229\n81#10:244\n107#10,2:245\n*S KotlinDebug\n*F\n+ 1 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt\n*L\n51#1:177,11\n55#1:188\n143#1:196\n141#1:221,8\n141#1:235,3\n141#1:239,3\n55#1:189,6\n143#1:197,6\n63#1:195\n145#1:203\n146#1:204\n147#1:205\n149#1:206\n150#1:207\n141#1:208,2\n141#1:238\n141#1:243\n141#1:210,11\n141#1:242\n141#1:229,6\n55#1:244\n55#1:245,2\n*E\n"})
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f14485a = {l1.j(new v0(j.class, "localValue", "<v#1>", 1))};

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ Context $context;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nLanguageSwitchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt$LanguageSwitchScreen$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,176:1\n154#2:177\n*S KotlinDebug\n*F\n+ 1 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt$LanguageSwitchScreen$1$1\n*L\n82#1:177\n*E\n"})
        /* renamed from: com.yuanqi.master.addapp.home.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0298a extends n0 implements p<Composer, Integer, r2> {
            final /* synthetic */ Context $context;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.j$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0299a extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0299a(Context context) {
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
            C0298a(Context context) {
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
                    ComposerKt.traceEventStart(-1149382562, i5, -1, "com.yuanqi.master.addapp.home.LanguageSwitchScreen.<anonymous>.<anonymous> (LanguageSwitchScreen.kt:78)");
                }
                float f5 = 10;
                IconKt.m1925Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.Rounded.INSTANCE), "", ClickableKt.m235clickableXHw0xAI$default(PaddingKt.m557paddingqDBjuR0$default(Modifier.Companion, Dp.m6044constructorimpl(f5), 0.0f, Dp.m6044constructorimpl(f5), 0.0f, 10, null), false, null, null, new C0299a(this.$context), 7, null), 0L, composer, 48, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
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
                ComposerKt.traceEventStart(-1487121768, i5, -1, "com.yuanqi.master.addapp.home.LanguageSwitchScreen.<anonymous> (LanguageSwitchScreen.kt:69)");
            }
            AppBarKt.TopAppBar(com.yuanqi.master.addapp.home.d.f14469a.a(), null, ComposableLambdaKt.composableLambda(composer, -1149382562, true, new C0298a(this.$context)), null, null, TopAppBarDefaults.INSTANCE.m2611topAppBarColorszjMxDiM(Color.Companion.m3760getBlack0d7_KjU(), 0L, 0L, 0L, 0L, composer, ((TopAppBarDefaults.$stable | 0) << 15) | 6, 30), null, composer, 390, 90);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/layout/PaddingValues;", "invoke", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nLanguageSwitchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt$LanguageSwitchScreen$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,176:1\n25#2:177\n1116#3,6:178\n*S KotlinDebug\n*F\n+ 1 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt$LanguageSwitchScreen$2\n*L\n93#1:177\n93#1:178,6\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements q<PaddingValues, Composer, Integer, r2> {
        final /* synthetic */ Context $context;
        final /* synthetic */ x0<String> $localValue$delegate;
        final /* synthetic */ MutableState<Locale> $selectedLanguage$delegate;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nLanguageSwitchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt$LanguageSwitchScreen$2$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,176:1\n139#2,12:177\n*S KotlinDebug\n*F\n+ 1 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt$LanguageSwitchScreen$2$1\n*L\n119#1:177,12\n*E\n"})
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements v3.l<LazyListScope, r2> {
            final /* synthetic */ Context $context;
            final /* synthetic */ Map<String, Locale> $languageMap;
            final /* synthetic */ x0<String> $localValue$delegate;
            final /* synthetic */ MutableState<Locale> $selectedLanguage$delegate;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.addapp.home.j$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0300a extends n0 implements v3.a<r2> {
                final /* synthetic */ Context $context;
                final /* synthetic */ String $it;
                final /* synthetic */ Map<String, Locale> $languageMap;
                final /* synthetic */ x0<String> $localValue$delegate;
                final /* synthetic */ MutableState<Locale> $selectedLanguage$delegate;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0300a(Map<String, Locale> map, String str, Context context, MutableState<Locale> mutableState, x0<String> x0Var) {
                    super(0);
                    this.$languageMap = map;
                    this.$it = str;
                    this.$context = context;
                    this.$selectedLanguage$delegate = mutableState;
                    this.$localValue$delegate = x0Var;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    j.c(this.$selectedLanguage$delegate, this.$languageMap.get(this.$it));
                    j.e(this.$localValue$delegate, j.b(this.$selectedLanguage$delegate).getLanguage() + k0.f19767d + j.b(this.$selectedLanguage$delegate).getCountry());
                    q0 a5 = q0.f15237a.a();
                    Context context = this.$context;
                    String language = j.b(this.$selectedLanguage$delegate).getLanguage();
                    l0.o(language, "getLanguage(...)");
                    a5.d(context, language);
                    AddAppActivity.a aVar = AddAppActivity.f14427e;
                    AddAppActivity a6 = aVar.a();
                    l0.m(a6);
                    a6.setResult(-1);
                    AddAppActivity a7 = aVar.a();
                    l0.m(a7);
                    a7.finish();
                }
            }

            @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;", "androidx/compose/foundation/lazy/LazyDslKt$items$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$1\n*L\n1#1,426:1\n*E\n"})
            /* renamed from: com.yuanqi.master.addapp.home.j$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0301b extends n0 implements v3.l {
                public static final C0301b INSTANCE = new C0301b();

                public C0301b() {
                    super(1);
                }

                @Override // v3.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((String) obj);
                }

                @Override // v3.l
                @p4.m
                public final Void invoke(String str) {
                    return null;
                }
            }

            @i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke", "androidx/compose/foundation/lazy/LazyDslKt$items$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$2\n*L\n1#1,426:1\n*E\n"})
            /* loaded from: classes3.dex */
            public static final class c extends n0 implements v3.l<Integer, Object> {
                final /* synthetic */ List $items;
                final /* synthetic */ v3.l $key;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(v3.l lVar, List list) {
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

            @i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke", "androidx/compose/foundation/lazy/LazyDslKt$items$3"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$3\n*L\n1#1,426:1\n*E\n"})
            /* loaded from: classes3.dex */
            public static final class d extends n0 implements v3.l<Integer, Object> {
                final /* synthetic */ v3.l $contentType;
                final /* synthetic */ List $items;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(v3.l lVar, List list) {
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

            @i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/LazyDslKt$items$4"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @r1({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 LanguageSwitchScreen.kt\ncom/yuanqi/master/addapp/home/LanguageSwitchScreenKt$LanguageSwitchScreen$2$1\n*L\n1#1,426:1\n120#2,14:427\n*E\n"})
            /* loaded from: classes3.dex */
            public static final class e extends n0 implements r<LazyItemScope, Integer, Composer, Integer, r2> {
                final /* synthetic */ Context $context$inlined;
                final /* synthetic */ List $items;
                final /* synthetic */ Map $languageMap$inlined;
                final /* synthetic */ x0 $localValue$delegate$inlined;
                final /* synthetic */ MutableState $selectedLanguage$delegate$inlined;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(List list, Map map, MutableState mutableState, Context context, x0 x0Var) {
                    super(4);
                    this.$items = list;
                    this.$languageMap$inlined = map;
                    this.$selectedLanguage$delegate$inlined = mutableState;
                    this.$context$inlined = context;
                    this.$localValue$delegate$inlined = x0Var;
                }

                @Override // v3.r
                public /* bridge */ /* synthetic */ r2 invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return r2.f19517a;
                }

                @Composable
                public final void invoke(@p4.l LazyItemScope lazyItemScope, int i5, @p4.m Composer composer, int i6) {
                    int i7;
                    boolean g5;
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
                    int i8 = i7 & 14;
                    String str = (String) this.$items.get(i5);
                    if (l0.g(j.b(this.$selectedLanguage$delegate$inlined).getLanguage(), "zh")) {
                        String country = j.b(this.$selectedLanguage$delegate$inlined).getCountry();
                        Locale locale = (Locale) this.$languageMap$inlined.get(str);
                        g5 = l0.g(country, locale != null ? locale.getCountry() : null);
                    } else {
                        String language = j.b(this.$selectedLanguage$delegate$inlined).getLanguage();
                        Locale locale2 = (Locale) this.$languageMap$inlined.get(str);
                        g5 = l0.g(language, locale2 != null ? locale2.getLanguage() : null);
                    }
                    j.f(str, g5, new C0300a(this.$languageMap$inlined, str, this.$context$inlined, this.$selectedLanguage$delegate$inlined, this.$localValue$delegate$inlined), composer, (i8 >> 3) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Map<String, Locale> map, MutableState<Locale> mutableState, Context context, x0<String> x0Var) {
                super(1);
                this.$languageMap = map;
                this.$selectedLanguage$delegate = mutableState;
                this.$context = context;
                this.$localValue$delegate = x0Var;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(LazyListScope lazyListScope) {
                invoke2(lazyListScope);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@p4.l LazyListScope LazyColumn) {
                List S5;
                l0.p(LazyColumn, "$this$LazyColumn");
                S5 = e0.S5(this.$languageMap.keySet());
                Map<String, Locale> map = this.$languageMap;
                MutableState<Locale> mutableState = this.$selectedLanguage$delegate;
                Context context = this.$context;
                x0<String> x0Var = this.$localValue$delegate;
                LazyColumn.items(S5.size(), null, new d(C0301b.INSTANCE, S5), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new e(S5, map, mutableState, context, x0Var)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState<Locale> mutableState, Context context, x0<String> x0Var) {
            super(3);
            this.$selectedLanguage$delegate = mutableState;
            this.$context = context;
            this.$localValue$delegate = x0Var;
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
                ComposerKt.traceEventStart(1670635437, i5, -1, "com.yuanqi.master.addapp.home.LanguageSwitchScreen.<anonymous> (LanguageSwitchScreen.kt:92)");
            }
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = a1.j0(q1.a("English", Locale.ENGLISH), q1.a("繁體中文", Locale.TRADITIONAL_CHINESE), q1.a("日本語", Locale.JAPANESE), q1.a("한국 사람", Locale.KOREAN), q1.a("简体中文", Locale.SIMPLIFIED_CHINESE));
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            LazyDslKt.LazyColumn(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), it), null, null, false, Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), null, false, new a((Map) rememberedValue, this.$selectedLanguage$delegate, this.$context, this.$localValue$delegate), composer, 221184, 206);
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
            j.a(this.$navController, this.$addAppViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends n0 implements v3.a<r2> {
        final /* synthetic */ v3.a<r2> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(v3.a<r2> aVar) {
            super(0);
            this.$onClick = aVar;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onClick.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ v3.a<r2> $onClick;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, boolean z4, v3.a<r2> aVar, int i5) {
            super(2);
            this.$text = str;
            this.$selected = z4;
            this.$onClick = aVar;
            this.$$changed = i5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        public final void invoke(@p4.m Composer composer, int i5) {
            j.f(this.$text, this.$selected, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @android.annotation.SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@p4.l androidx.navigation.NavHostController r28, @p4.m com.yuanqi.master.addapp.AddAppViewModel r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.addapp.home.j.a(androidx.navigation.NavHostController, com.yuanqi.master.addapp.AddAppViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Locale b(MutableState<Locale> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState<Locale> mutableState, Locale locale) {
        mutableState.setValue(locale);
    }

    private static final String d(x0<String> x0Var) {
        return x0Var.getValue(null, f14485a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(x0<String> x0Var, String str) {
        x0Var.setValue(null, f14485a[0], str);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(@p4.l String text, boolean z4, @p4.l v3.a<r2> onClick, @p4.m Composer composer, int i5) {
        int i6;
        long O;
        Composer composer2;
        int i7;
        int i8;
        int i9;
        l0.p(text, "text");
        l0.p(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(479157556);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(text)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(z4)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changedInstance(onClick)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        int i10 = i6;
        if ((i10 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(479157556, i10, -1, "com.yuanqi.master.addapp.home.LanguageToggleButton (LanguageSwitchScreen.kt:138)");
            }
            if (z4) {
                O = com.yuanqi.master.theme.b.F2();
            } else {
                O = com.yuanqi.master.theme.b.O();
            }
            State<Color> m96animateColorAsStateeuL9pac = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(O, null, null, null, startRestartGroup, 0, 14);
            Modifier.Companion companion = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(onClick);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new d(onClick);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m554paddingVpY3zN4 = PaddingKt.m554paddingVpY3zN4(SizeKt.m588height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m235clickableXHw0xAI$default(companion, false, null, null, (v3.a) rememberedValue, 7, null), 0.0f, 1, null), Dp.m6044constructorimpl(55)), Dp.m6044constructorimpl(8), Dp.m6044constructorimpl(4));
            float f5 = 6;
            Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(BorderKt.m212borderxT4_qwU(BackgroundKt.m201backgroundbw27NRU$default(ClipKt.clip(m554paddingVpY3zN4, RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f5))), com.yuanqi.master.theme.b.O(), null, 2, null), Dp.m6044constructorimpl(1), m96animateColorAsStateeuL9pac.getValue().m3744unboximpl(), RoundedCornerShapeKt.m823RoundedCornerShape0680j_4(Dp.m6044constructorimpl(f5))), Dp.m6044constructorimpl(20), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
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
            Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            TextKt.m2452Text4IGK_g(text, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Color.Companion.m3771getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer2, (i10 & 14) | 200064, 0, 131024);
            AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, z4, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, com.yuanqi.master.addapp.home.d.f14469a.b(), composer2, 1572870 | (i10 & 112), 30);
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
            endRestartGroup.updateScope(new e(text, z4, onClick, i5));
        }
    }
}
