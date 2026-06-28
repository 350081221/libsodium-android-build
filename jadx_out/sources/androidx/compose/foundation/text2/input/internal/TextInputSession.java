package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextInputSession;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "Lkotlin/r2;", "Lkotlin/u;", "block", "requestEdit", "Landroid/view/KeyEvent;", "keyEvent", "sendKeyEvent", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "onImeAction-KlQnJC8", "(I)V", "onImeAction", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "getText", "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "text", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface TextInputSession {
    @l
    TextFieldCharSequence getText();

    /* renamed from: onImeAction-KlQnJC8 */
    void mo1093onImeActionKlQnJC8(int i5);

    void requestEdit(@l v3.l<? super EditingBuffer, r2> lVar);

    void sendKeyEvent(@l KeyEvent keyEvent);
}
