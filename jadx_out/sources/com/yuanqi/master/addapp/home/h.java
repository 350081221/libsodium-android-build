package com.yuanqi.master.addapp.home;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.yqtech.multiapp.R;
import com.yuanqi.master.addapp.AddAppActivity;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.p;
import v3.q;

@i0(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final h f14480a = new h();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static q<RowScope, Composer, Integer, r2> f14481b = ComposableLambdaKt.composableLambdaInstance(-1600879402, false, a.INSTANCE);

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    public static q<RowScope, Composer, Integer, r2> f14482c = ComposableLambdaKt.composableLambdaInstance(-1112673624, false, b.INSTANCE);

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    public static q<LazyGridItemScope, Composer, Integer, r2> f14483d = ComposableLambdaKt.composableLambdaInstance(-1814425434, false, c.INSTANCE);

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    public static p<Composer, Integer, r2> f14484e = ComposableLambdaKt.composableLambdaInstance(-351566392, false, d.INSTANCE);

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends n0 implements q<RowScope, Composer, Integer, r2> {
        public static final a INSTANCE = new a();

        a() {
            super(3);
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
                ComposerKt.traceEventStart(-1600879402, i5, -1, "com.yuanqi.master.addapp.home.ComposableSingletons$SelectAppScreenKt.lambda-1.<anonymous> (SelectAppScreen.kt:194)");
            }
            TextKt.m2452Text4IGK_g("去授予", (Modifier) null, com.yuanqi.master.theme.b.N(), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3462, 0, 130546);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class b extends n0 implements q<RowScope, Composer, Integer, r2> {
        public static final b INSTANCE = new b();

        b() {
            super(3);
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
                ComposerKt.traceEventStart(-1112673624, i5, -1, "com.yuanqi.master.addapp.home.ComposableSingletons$SelectAppScreenKt.lambda-2.<anonymous> (SelectAppScreen.kt:253)");
            }
            TextKt.m2452Text4IGK_g("去授予", (Modifier) null, com.yuanqi.master.theme.b.N(), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3462, 0, 130546);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/ComposableSingletons$SelectAppScreenKt$lambda-3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,676:1\n154#2:677\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/ComposableSingletons$SelectAppScreenKt$lambda-3$1\n*L\n317#1:677\n*E\n"})
    /* loaded from: classes3.dex */
    static final class c extends n0 implements q<LazyGridItemScope, Composer, Integer, r2> {
        public static final c INSTANCE = new c();

        c() {
            super(3);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
            invoke(lazyGridItemScope, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.l LazyGridItemScope item, @p4.m Composer composer, int i5) {
            l0.p(item, "$this$item");
            if ((i5 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1814425434, i5, -1, "com.yuanqi.master.addapp.home.ComposableSingletons$SelectAppScreenKt.lambda-3.<anonymous> (SelectAppScreen.kt:316)");
            }
            SpacerKt.Spacer(SizeKt.m588height3ABfNKs(Modifier.Companion, Dp.m6044constructorimpl(100)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSelectAppScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/ComposableSingletons$SelectAppScreenKt$lambda-4$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,676:1\n154#2:677\n*S KotlinDebug\n*F\n+ 1 SelectAppScreen.kt\ncom/yuanqi/master/addapp/home/ComposableSingletons$SelectAppScreenKt$lambda-4$1\n*L\n508#1:677\n*E\n"})
    /* loaded from: classes3.dex */
    static final class d extends n0 implements p<Composer, Integer, r2> {
        public static final d INSTANCE = new d();

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements v3.a<r2> {
            public static final a INSTANCE = new a();

            a() {
                super(0);
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AddAppActivity a5 = AddAppActivity.f14427e.a();
                if (a5 != null) {
                    a5.finish();
                }
            }
        }

        d() {
            super(2);
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
                ComposerKt.traceEventStart(-351566392, i5, -1, "com.yuanqi.master.addapp.home.ComposableSingletons$SelectAppScreenKt.lambda-4.<anonymous> (SelectAppScreen.kt:504)");
            }
            float f5 = 10;
            IconKt.m1924Iconww6aTOc(PainterResources_androidKt.painterResource(R.mipmap.back, composer, 6), "", ClickableKt.m235clickableXHw0xAI$default(PaddingKt.m557paddingqDBjuR0$default(Modifier.Companion, Dp.m6044constructorimpl(f5), 0.0f, Dp.m6044constructorimpl(f5), 0.0f, 10, null), false, null, null, a.INSTANCE, 7, null), com.yuanqi.master.theme.b.L(), composer, 3128, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @p4.l
    public final q<RowScope, Composer, Integer, r2> a() {
        return f14481b;
    }

    @p4.l
    public final q<RowScope, Composer, Integer, r2> b() {
        return f14482c;
    }

    @p4.l
    public final q<LazyGridItemScope, Composer, Integer, r2> c() {
        return f14483d;
    }

    @p4.l
    public final p<Composer, Integer, r2> d() {
        return f14484e;
    }
}
