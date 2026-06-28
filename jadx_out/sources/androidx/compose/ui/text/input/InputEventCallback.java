package androidx.compose.ui.text.input;

import java.util.List;
import kotlin.i0;
import kotlin.k;
import p4.l;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/InputEventCallback;", "", "", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "Lkotlin/r2;", "onEditCommands", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "onImeAction-KlQnJC8", "(I)V", "onImeAction", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@k(message = "This function is not being used by any APIs. API is now deprecated and will be removed")
/* loaded from: classes.dex */
public interface InputEventCallback {
    void onEditCommands(@l List<? extends EditCommand> list);

    /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    void m5736onImeActionKlQnJC8(int i5);
}
