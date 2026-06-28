package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0013\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi25;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi24;", "Landroid/view/inputmethod/InputContentInfo;", "p0", "", "p1", "Landroid/os/Bundle;", "p2", "", "commitContent", "Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function0;", "Lkotlin/r2;", "onConnectionClosed", "<init>", "(Landroid/view/inputmethod/InputConnection;Lv3/a;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(25)
/* loaded from: classes.dex */
class NullableInputConnectionWrapperApi25 extends NullableInputConnectionWrapperApi24 {
    public NullableInputConnectionWrapperApi25(@l InputConnection inputConnection, @l v3.a<r2> aVar) {
        super(inputConnection, aVar);
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final boolean commitContent(@l InputContentInfo inputContentInfo, int i5, @m Bundle bundle) {
        boolean commitContent;
        InputConnection delegate = getDelegate();
        if (delegate == null) {
            return false;
        }
        commitContent = delegate.commitContent(inputContentInfo, i5, bundle);
        return commitContent;
    }
}
