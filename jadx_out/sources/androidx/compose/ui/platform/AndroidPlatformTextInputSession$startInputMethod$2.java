package androidx.compose.ui.platform;

import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/s0;", "coroutineScope", "Landroidx/compose/ui/platform/InputMethodSession;", "invoke", "(Lkotlinx/coroutines/s0;)Landroidx/compose/ui/platform/InputMethodSession;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$2 extends kotlin.jvm.internal.n0 implements v3.l<kotlinx.coroutines.s0, InputMethodSession> {
    final /* synthetic */ PlatformTextInputMethodRequest $request;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ kotlinx.coroutines.s0 $coroutineScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlinx.coroutines.s0 s0Var) {
            super(0);
            this.$coroutineScope = s0Var;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            kotlinx.coroutines.t0.f(this.$coroutineScope, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$2(PlatformTextInputMethodRequest platformTextInputMethodRequest) {
        super(1);
        this.$request = platformTextInputMethodRequest;
    }

    @Override // v3.l
    @p4.l
    public final InputMethodSession invoke(@p4.l kotlinx.coroutines.s0 s0Var) {
        return new InputMethodSession(this.$request, new AnonymousClass1(s0Var));
    }
}
