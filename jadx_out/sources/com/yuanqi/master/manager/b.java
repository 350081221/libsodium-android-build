package com.yuanqi.master.manager;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final b f14745a = new b();

    /* renamed from: b, reason: collision with root package name */
    @l
    public static p<Composer, Integer, r2> f14746b = ComposableLambdaKt.composableLambdaInstance(60280534, false, a.INSTANCE);

    /* renamed from: c, reason: collision with root package name */
    @l
    public static p<Composer, Integer, r2> f14747c = ComposableLambdaKt.composableLambdaInstance(1163317805, false, C0360b.INSTANCE);

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
        public final void invoke(@m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(60280534, i5, -1, "com.yuanqi.master.manager.ComposableSingletons$ManagerActivityKt.lambda-1.<anonymous> (ManagerActivity.kt:59)");
            }
            d.a(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.manager.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0360b extends n0 implements p<Composer, Integer, r2> {
        public static final C0360b INSTANCE = new C0360b();

        C0360b() {
            super(2);
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
                ComposerKt.traceEventStart(1163317805, i5, -1, "com.yuanqi.master.manager.ComposableSingletons$ManagerActivityKt.lambda-2.<anonymous> (ManagerActivity.kt:58)");
            }
            com.yuanqi.master.theme.d.a(true, false, b.f14745a.a(), composer, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @l
    public final p<Composer, Integer, r2> a() {
        return f14746b;
    }

    @l
    public final p<Composer, Integer, r2> b() {
        return f14747c;
    }
}
