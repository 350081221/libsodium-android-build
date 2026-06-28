package com.yuanqi.master.mine.account;

import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.q;

@i0(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final d f14794a = new d();

    /* renamed from: b, reason: collision with root package name */
    @l
    public static q<SnackbarData, Composer, Integer, r2> f14795b = ComposableLambdaKt.composableLambdaInstance(-1041278833, false, a.INSTANCE);

    /* renamed from: c, reason: collision with root package name */
    @l
    public static q<SnackbarData, Composer, Integer, r2> f14796c = ComposableLambdaKt.composableLambdaInstance(91536690, false, b.INSTANCE);

    /* renamed from: d, reason: collision with root package name */
    @l
    public static q<SnackbarData, Composer, Integer, r2> f14797d = ComposableLambdaKt.composableLambdaInstance(439001430, false, c.INSTANCE);

    /* renamed from: e, reason: collision with root package name */
    @l
    public static q<SnackbarData, Composer, Integer, r2> f14798e = ComposableLambdaKt.composableLambdaInstance(1028085700, false, C0380d.INSTANCE);

    /* renamed from: f, reason: collision with root package name */
    @l
    public static q<SnackbarData, Composer, Integer, r2> f14799f = ComposableLambdaKt.composableLambdaInstance(-1143277180, false, e.INSTANCE);

    /* renamed from: g, reason: collision with root package name */
    @l
    public static q<SnackbarData, Composer, Integer, r2> f14800g = ComposableLambdaKt.composableLambdaInstance(1876558127, false, f.INSTANCE);

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "data", "Landroidx/compose/material3/SnackbarData;", "invoke", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends n0 implements q<SnackbarData, Composer, Integer, r2> {
        public static final a INSTANCE = new a();

        a() {
            super(3);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@l SnackbarData data, @m Composer composer, int i5) {
            int i6;
            l0.p(data, "data");
            if ((i5 & 14) == 0) {
                i6 = i5 | (composer.changed(data) ? 4 : 2);
            } else {
                i6 = i5;
            }
            if ((i6 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1041278833, i6, -1, "com.yuanqi.master.mine.account.ComposableSingletons$EditScreenKt.lambda-1.<anonymous> (EditScreen.kt:147)");
            }
            SnackbarKt.m2221SnackbarsDKtq54(data, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i6 & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "data", "Landroidx/compose/material3/SnackbarData;", "invoke", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class b extends n0 implements q<SnackbarData, Composer, Integer, r2> {
        public static final b INSTANCE = new b();

        b() {
            super(3);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@l SnackbarData data, @m Composer composer, int i5) {
            int i6;
            l0.p(data, "data");
            if ((i5 & 14) == 0) {
                i6 = i5 | (composer.changed(data) ? 4 : 2);
            } else {
                i6 = i5;
            }
            if ((i6 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(91536690, i6, -1, "com.yuanqi.master.mine.account.ComposableSingletons$EditScreenKt.lambda-2.<anonymous> (EditScreen.kt:413)");
            }
            SnackbarKt.m2221SnackbarsDKtq54(data, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i6 & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "data", "Landroidx/compose/material3/SnackbarData;", "invoke", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class c extends n0 implements q<SnackbarData, Composer, Integer, r2> {
        public static final c INSTANCE = new c();

        c() {
            super(3);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@l SnackbarData data, @m Composer composer, int i5) {
            int i6;
            l0.p(data, "data");
            if ((i5 & 14) == 0) {
                i6 = i5 | (composer.changed(data) ? 4 : 2);
            } else {
                i6 = i5;
            }
            if ((i6 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(439001430, i6, -1, "com.yuanqi.master.mine.account.ComposableSingletons$EditScreenKt.lambda-3.<anonymous> (EditScreen.kt:528)");
            }
            SnackbarKt.m2221SnackbarsDKtq54(data, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i6 & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "data", "Landroidx/compose/material3/SnackbarData;", "invoke", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.mine.account.d$d, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0380d extends n0 implements q<SnackbarData, Composer, Integer, r2> {
        public static final C0380d INSTANCE = new C0380d();

        C0380d() {
            super(3);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@l SnackbarData data, @m Composer composer, int i5) {
            int i6;
            l0.p(data, "data");
            if ((i5 & 14) == 0) {
                i6 = i5 | (composer.changed(data) ? 4 : 2);
            } else {
                i6 = i5;
            }
            if ((i6 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1028085700, i6, -1, "com.yuanqi.master.mine.account.ComposableSingletons$EditScreenKt.lambda-4.<anonymous> (EditScreen.kt:619)");
            }
            SnackbarKt.m2221SnackbarsDKtq54(data, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i6 & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "data", "Landroidx/compose/material3/SnackbarData;", "invoke", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class e extends n0 implements q<SnackbarData, Composer, Integer, r2> {
        public static final e INSTANCE = new e();

        e() {
            super(3);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@l SnackbarData data, @m Composer composer, int i5) {
            int i6;
            l0.p(data, "data");
            if ((i5 & 14) == 0) {
                i6 = i5 | (composer.changed(data) ? 4 : 2);
            } else {
                i6 = i5;
            }
            if ((i6 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1143277180, i6, -1, "com.yuanqi.master.mine.account.ComposableSingletons$EditScreenKt.lambda-5.<anonymous> (EditScreen.kt:729)");
            }
            SnackbarKt.m2221SnackbarsDKtq54(data, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i6 & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "data", "Landroidx/compose/material3/SnackbarData;", "invoke", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class f extends n0 implements q<SnackbarData, Composer, Integer, r2> {
        public static final f INSTANCE = new f();

        f() {
            super(3);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@l SnackbarData data, @m Composer composer, int i5) {
            int i6;
            l0.p(data, "data");
            if ((i5 & 14) == 0) {
                i6 = i5 | (composer.changed(data) ? 4 : 2);
            } else {
                i6 = i5;
            }
            if ((i6 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1876558127, i6, -1, "com.yuanqi.master.mine.account.ComposableSingletons$EditScreenKt.lambda-6.<anonymous> (EditScreen.kt:821)");
            }
            SnackbarKt.m2221SnackbarsDKtq54(data, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i6 & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @l
    public final q<SnackbarData, Composer, Integer, r2> a() {
        return f14795b;
    }

    @l
    public final q<SnackbarData, Composer, Integer, r2> b() {
        return f14796c;
    }

    @l
    public final q<SnackbarData, Composer, Integer, r2> c() {
        return f14797d;
    }

    @l
    public final q<SnackbarData, Composer, Integer, r2> d() {
        return f14798e;
    }

    @l
    public final q<SnackbarData, Composer, Integer, r2> e() {
        return f14799f;
    }

    @l
    public final q<SnackbarData, Composer, Integer, r2> f() {
        return f14800g;
    }
}
