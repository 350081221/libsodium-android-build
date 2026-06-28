package androidx.compose.ui.text.input;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0013\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0004¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi24;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi21;", "", "p0", "p1", "", "deleteSurroundingTextInCodePoints", "Landroid/os/Handler;", "getHandler", "Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/r2;", "closeDelegate", "Lkotlin/Function0;", "onConnectionClosed", "<init>", "(Landroid/view/inputmethod/InputConnection;Lv3/a;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(24)
/* loaded from: classes.dex */
class NullableInputConnectionWrapperApi24 extends NullableInputConnectionWrapperApi21 {
    public NullableInputConnectionWrapperApi24(@l InputConnection inputConnection, @l v3.a<r2> aVar) {
        super(inputConnection, aVar);
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21
    protected final void closeDelegate(@l InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i5, int i6) {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.deleteSurroundingTextInCodePoints(i5, i6);
        }
        return false;
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    @m
    public final Handler getHandler() {
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            return delegate.getHandler();
        }
        return null;
    }
}
