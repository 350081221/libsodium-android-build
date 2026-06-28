package com.yuanqi.master.main;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

@i0(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final a f14693a = new a();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static v3.p<Composer, Integer, r2> f14694b = ComposableLambdaKt.composableLambdaInstance(-661303180, false, C0340a.INSTANCE);

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    public static v3.p<Composer, Integer, r2> f14695c = ComposableLambdaKt.composableLambdaInstance(1753210685, false, b.INSTANCE);

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.main.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0340a extends n0 implements v3.p<Composer, Integer, r2> {
        public static final C0340a INSTANCE = new C0340a();

        C0340a() {
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
                ComposerKt.traceEventStart(-661303180, i5, -1, "com.yuanqi.master.main.ComposableSingletons$MainActivityKt.lambda-1.<anonymous> (MainActivity.kt:32)");
            }
            com.yuanqi.master.addapp.g.a(com.yuanqi.master.config.c.f14529f, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class b extends n0 implements v3.p<Composer, Integer, r2> {
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
                ComposerKt.traceEventStart(1753210685, i5, -1, "com.yuanqi.master.main.ComposableSingletons$MainActivityKt.lambda-2.<anonymous> (MainActivity.kt:31)");
            }
            com.yuanqi.master.theme.d.a(false, false, a.f14693a.a(), composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @p4.l
    public final v3.p<Composer, Integer, r2> a() {
        return f14694b;
    }

    @p4.l
    public final v3.p<Composer, Integer, r2> b() {
        return f14695c;
    }
}
