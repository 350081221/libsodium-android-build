package com.yuanqi.master.addapp.home;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import com.yqtech.multiapp.R;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.p;
import v3.q;

@i0(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final d f14469a = new d();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static p<Composer, Integer, r2> f14470b = ComposableLambdaKt.composableLambdaInstance(-1141383588, false, a.INSTANCE);

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    public static q<AnimatedVisibilityScope, Composer, Integer, r2> f14471c = ComposableLambdaKt.composableLambdaInstance(-1034381712, false, b.INSTANCE);

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
                ComposerKt.traceEventStart(-1141383588, i5, -1, "com.yuanqi.master.addapp.home.ComposableSingletons$LanguageSwitchScreenKt.lambda-1.<anonymous> (LanguageSwitchScreen.kt:71)");
            }
            TextKt.m2452Text4IGK_g(StringResources_androidKt.stringResource(R.string.title_change_lan, composer, 6), (Modifier) null, 0L, TextUnitKt.getSp(22), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3072, 0, 130550);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class b extends n0 implements q<AnimatedVisibilityScope, Composer, Integer, r2> {
        public static final b INSTANCE = new b();

        b() {
            super(3);
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
                ComposerKt.traceEventStart(-1034381712, i5, -1, "com.yuanqi.master.addapp.home.ComposableSingletons$LanguageSwitchScreenKt.lambda-2.<anonymous> (LanguageSwitchScreen.kt:162)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.checked, composer, 6), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @p4.l
    public final p<Composer, Integer, r2> a() {
        return f14470b;
    }

    @p4.l
    public final q<AnimatedVisibilityScope, Composer, Integer, r2> b() {
        return f14471c;
    }
}
