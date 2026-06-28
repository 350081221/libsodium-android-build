package com.yuanqi.master.addapp.home;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
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
import com.yqtech.multiapp.R;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.p;

@i0(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final g f14477a = new g();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static p<Composer, Integer, r2> f14478b = ComposableLambdaKt.composableLambdaInstance(124559375, false, a.INSTANCE);

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    public static p<Composer, Integer, r2> f14479c = ComposableLambdaKt.composableLambdaInstance(609196206, false, b.INSTANCE);

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends n0 implements p<Composer, Integer, r2> {
        public static final a INSTANCE = new a();

        a() {
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
                ComposerKt.traceEventStart(124559375, i5, -1, "com.yuanqi.master.addapp.home.ComposableSingletons$SearchScreenKt.lambda-1.<anonymous> (SearchScreen.kt:209)");
            }
            TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.search_for, composer, 6), (Modifier) null, com.yuanqi.master.theme.b.S(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3456, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/ComposableSingletons$SearchScreenKt$lambda-2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,447:1\n154#2:448\n154#2:449\n*S KotlinDebug\n*F\n+ 1 SearchScreen.kt\ncom/yuanqi/master/addapp/home/ComposableSingletons$SearchScreenKt$lambda-2$1\n*L\n231#1:448\n232#1:449\n*E\n"})
    /* loaded from: classes3.dex */
    static final class b extends n0 implements p<Composer, Integer, r2> {
        public static final b INSTANCE = new b();

        b() {
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
                ComposerKt.traceEventStart(609196206, i5, -1, "com.yuanqi.master.addapp.home.ComposableSingletons$SearchScreenKt.lambda-2.<anonymous> (SearchScreen.kt:226)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.search_blue, composer, 6), (String) null, PaddingKt.m553padding3ABfNKs(SizeKt.m602size3ABfNKs(Modifier.Companion, Dp.m6044constructorimpl(30)), Dp.m6044constructorimpl(3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @p4.l
    public final p<Composer, Integer, r2> a() {
        return f14478b;
    }

    @p4.l
    public final p<Composer, Integer, r2> b() {
        return f14479c;
    }
}
