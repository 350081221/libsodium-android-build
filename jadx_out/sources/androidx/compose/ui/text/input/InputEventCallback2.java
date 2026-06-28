package androidx.compose.ui.text.input;

import android.view.KeyEvent;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH&J8\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH&J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H&ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/InputEventCallback2;", "", "", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "Lkotlin/r2;", "onEditCommands", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "onImeAction-KlQnJC8", "(I)V", "onImeAction", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "onKeyEvent", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "onRequestCursorAnchorInfo", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "inputConnection", "onConnectionClosed", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface InputEventCallback2 {
    void onConnectionClosed(@l RecordingInputConnection recordingInputConnection);

    void onEditCommands(@l List<? extends EditCommand> list);

    /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    void mo5737onImeActionKlQnJC8(int i5);

    void onKeyEvent(@l KeyEvent keyEvent);

    void onRequestCursorAnchorInfo(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9);
}
