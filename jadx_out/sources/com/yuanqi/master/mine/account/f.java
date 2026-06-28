package com.yuanqi.master.mine.account;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yuanqi.master.mine.MineActivity;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final f f14803a = new f();

    /* renamed from: b, reason: collision with root package name */
    @l
    public static p<Composer, Integer, r2> f14804b = ComposableLambdaKt.composableLambdaInstance(-1292599852, false, a.INSTANCE);

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends n0 implements p<Composer, Integer, r2> {
        public static final a INSTANCE = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.mine.account.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0382a extends n0 implements v3.a<r2> {
            public static final C0382a INSTANCE = new C0382a();

            C0382a() {
                super(0);
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MineActivity a5 = MineActivity.f14760b.a();
                if (a5 != null) {
                    a5.finish();
                }
            }
        }

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
                ComposerKt.traceEventStart(-1292599852, i5, -1, "com.yuanqi.master.mine.account.ComposableSingletons$LoginScreenKt.lambda-1.<anonymous> (LoginScreen.kt:107)");
            }
            com.yuanqi.master.tools.a.f("登录/注册", null, C0382a.INSTANCE, composer, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @l
    public final p<Composer, Integer, r2> a() {
        return f14804b;
    }
}
