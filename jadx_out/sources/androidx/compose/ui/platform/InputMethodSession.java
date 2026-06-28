package androidx.compose.ui.platform;

import android.net.http.Headers;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper_androidKt;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/InputMethodSession;", "", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "Lkotlin/r2;", "dispose", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "request", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "Lkotlin/Function0;", "onConnectionClosed", "Lv3/a;", "lock", "Ljava/lang/Object;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", Headers.CONN_DIRECTIVE, "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "", "disposed", "Z", "isActive", "()Z", "<init>", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Lv3/a;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,157:1\n35#2:158\n35#2:159\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n*L\n129#1:158\n149#1:159\n*E\n"})
/* loaded from: classes.dex */
final class InputMethodSession {

    @p4.m
    private NullableInputConnectionWrapper connection;
    private boolean disposed;

    @p4.l
    private final Object lock = new Object();

    @p4.l
    private final v3.a<r2> onConnectionClosed;

    @p4.l
    private final PlatformTextInputMethodRequest request;

    public InputMethodSession(@p4.l PlatformTextInputMethodRequest platformTextInputMethodRequest, @p4.l v3.a<r2> aVar) {
        this.request = platformTextInputMethodRequest;
        this.onConnectionClosed = aVar;
    }

    @p4.m
    public final InputConnection createInputConnection(@p4.l EditorInfo editorInfo) {
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            NullableInputConnectionWrapper nullableInputConnectionWrapper = this.connection;
            if (nullableInputConnectionWrapper != null) {
                nullableInputConnectionWrapper.disposeDelegate();
            }
            NullableInputConnectionWrapper NullableInputConnectionWrapper = NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(this.request.createInputConnection(editorInfo), this.onConnectionClosed);
            this.connection = NullableInputConnectionWrapper;
            return NullableInputConnectionWrapper;
        }
    }

    public final void dispose() {
        synchronized (this.lock) {
            this.disposed = true;
            NullableInputConnectionWrapper nullableInputConnectionWrapper = this.connection;
            if (nullableInputConnectionWrapper != null) {
                nullableInputConnectionWrapper.disposeDelegate();
            }
            this.connection = null;
            r2 r2Var = r2.f19517a;
        }
    }

    public final boolean isActive() {
        return !this.disposed;
    }
}
