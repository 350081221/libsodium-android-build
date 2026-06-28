package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.text.input.TextInputService;
import java.util.concurrent.atomic.AtomicReference;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlinx/coroutines/s0;", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "request", "", "startInputMethod", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "coroutineScope", "Lkotlinx/coroutines/s0;", "Landroidx/compose/ui/SessionMutex;", "Landroidx/compose/ui/platform/InputMethodSession;", "methodSessionMutex", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "", "isReadyForConnection", "()Z", "<init>", "(Landroid/view/View;Landroidx/compose/ui/text/input/TextInputService;Lkotlinx/coroutines/s0;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, kotlinx.coroutines.s0 {
    public static final int $stable = 8;

    @p4.l
    private final kotlinx.coroutines.s0 coroutineScope;

    @p4.l
    private final AtomicReference<SessionMutex.Session<Object>> methodSessionMutex = SessionMutex.m3373constructorimpl();

    @p4.l
    private final TextInputService textInputService;

    @p4.l
    private final View view;

    public AndroidPlatformTextInputSession(@p4.l View view, @p4.l TextInputService textInputService, @p4.l kotlinx.coroutines.s0 s0Var) {
        this.view = view;
        this.textInputService = textInputService;
        this.coroutineScope = s0Var;
    }

    @p4.m
    public final InputConnection createInputConnection(@p4.l EditorInfo editorInfo) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m3377getCurrentSessionimpl(this.methodSessionMutex);
        if (inputMethodSession != null) {
            return inputMethodSession.createInputConnection(editorInfo);
        }
        return null;
    }

    @Override // kotlinx.coroutines.s0
    @p4.l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    @p4.l
    public View getView() {
        return this.view;
    }

    public final boolean isReadyForConnection() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m3377getCurrentSessionimpl(this.methodSessionMutex);
        return inputMethodSession != null && inputMethodSession.isActive();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startInputMethod(@p4.l androidx.compose.ui.platform.PlatformTextInputMethodRequest r6, @p4.l kotlin.coroutines.d<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.e1.n(r7)
            goto L4a
        L31:
            kotlin.e1.n(r7)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<java.lang.Object>> r7 = r5.methodSessionMutex
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2 r2 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
            r2.<init>(r6)
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 r6 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3
            r4 = 0
            r6.<init>(r5, r4)
            r0.label = r3
            java.lang.Object r6 = androidx.compose.ui.SessionMutex.m3380withSessionCancellingPreviousimpl(r7, r2, r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            kotlin.y r6 = new kotlin.y
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidPlatformTextInputSession.startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest, kotlin.coroutines.d):java.lang.Object");
    }
}
