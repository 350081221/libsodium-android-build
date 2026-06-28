package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0007"}, d2 = {"Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function0;", "Lkotlin/r2;", "onConnectionClosed", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "NullableInputConnectionWrapper", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NullableInputConnectionWrapper_androidKt {
    @l
    public static final NullableInputConnectionWrapper NullableInputConnectionWrapper(@l InputConnection inputConnection, @l v3.a<r2> aVar) {
        if (Build.VERSION.SDK_INT >= 25) {
            return new NullableInputConnectionWrapperApi25(inputConnection, aVar);
        }
        return new NullableInputConnectionWrapperApi24(inputConnection, aVar);
    }
}
