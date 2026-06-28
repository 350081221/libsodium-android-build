package com.yuanqi.master.tools;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.r2;

@kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final b f15054a = new b();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static v3.q<RowScope, Composer, Integer, r2> f15055b = ComposableLambdaKt.composableLambdaInstance(-1433721002, false, a.INSTANCE);

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    public static v3.p<Composer, Integer, r2> f15056c = ComposableLambdaKt.composableLambdaInstance(1959251414, false, C0432b.INSTANCE);

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.n0 implements v3.q<RowScope, Composer, Integer, r2> {
        public static final a INSTANCE = new a();

        a() {
            super(3);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return r2.f19517a;
        }

        @Composable
        public final void invoke(@p4.l RowScope rowScope, @p4.m Composer composer, int i5) {
            kotlin.jvm.internal.l0.p(rowScope, "$this$null");
            if ((i5 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1433721002, i5, -1, "com.yuanqi.master.tools.ComposableSingletons$BaseComposeKt.lambda-1.<anonymous> (BaseCompose.kt:117)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.tools.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0432b extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        public static final C0432b INSTANCE = new C0432b();

        C0432b() {
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
                ComposerKt.traceEventStart(1959251414, i5, -1, "com.yuanqi.master.tools.ComposableSingletons$BaseComposeKt.lambda-2.<anonymous> (BaseCompose.kt:721)");
            }
            TextKt.m2452Text4IGK_g("请输入验证码", (Modifier) null, com.yuanqi.master.theme.b.X(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 3462, 3072, 122866);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @p4.l
    public final v3.q<RowScope, Composer, Integer, r2> a() {
        return f15055b;
    }

    @p4.l
    public final v3.p<Composer, Integer, r2> b() {
        return f15056c;
    }
}
