package androidx.compose.foundation.text2.input.internal;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldCharSequenceKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bT\u0010UJ!\u0010\u0007\u001a\u00020\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0018\u0010 \u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\b\u0010!\u001a\u00020\bH\u0016J\u0010\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010'\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0016J\u0018\u0010(\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010\u00142\u0006\u0010&\u001a\u00020\u000bH\u0016J\u0010\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u000bH\u0016J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010&\u001a\u00020\u000bH\u0016J\u0010\u00101\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0016J\u0010\u00103\u001a\u00020\b2\u0006\u00102\u001a\u00020\u000bH\u0016J\u0010\u00105\u001a\u00020\b2\u0006\u00104\u001a\u00020\u000bH\u0016J\u0012\u00107\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u000106H\u0016J\u0012\u0010:\u001a\u00020\b2\b\u00109\u001a\u0004\u0018\u000108H\u0016J\n\u0010<\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010>\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u000bH\u0016J\u0010\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020\bH\u0016J\u001c\u0010D\u001a\u00020\b2\b\u0010A\u001a\u0004\u0018\u00010\u000e2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016J\"\u0010H\u001a\u00020\b2\u0006\u0010F\u001a\u00020E2\u0006\u0010&\u001a\u00020\u000b2\b\u0010G\u001a\u0004\u0018\u00010BH\u0016R\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR+\u0010O\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00050N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0015\u001a\u00020Q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006V"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/StatelessInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "Lkotlin/r2;", "Lkotlin/u;", "editCommand", "addEditCommandWithBatch", "", "beginBatchEditInternal", "endBatchEditInternal", "", PluginConstants.KEY_ERROR_CODE, "sendSynthesizedKeyEvent", "", CrashHianalyticsData.MESSAGE, "logDebug", "beginBatchEdit", "endBatchEdit", "closeConnection", "", "text", "newCursorPosition", "commitText", "start", "end", "setComposingRegion", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "sendKeyEvent", "maxChars", "flags", "getTextBeforeCursor", "getTextAfterCursor", "getSelectedText", "cursorUpdateMode", "requestCursorUpdates", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "reqModes", "getCursorCapsMode", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "Landroid/os/Handler;", "getHandler", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "Landroidx/compose/foundation/text2/input/internal/TextInputSession;", d.aC, "Landroidx/compose/foundation/text2/input/internal/TextInputSession;", "batchDepth", "I", "Landroidx/compose/runtime/collection/MutableVector;", "editCommands", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "getText", "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "<init>", "(Landroidx/compose/foundation/text2/input/internal/TextInputSession;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nStatelessInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text2/input/internal/StatelessInputConnection\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,372:1\n1208#2:373\n1187#2,2:374\n*S KotlinDebug\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text2/input/internal/StatelessInputConnection\n*L\n72#1:373\n72#1:374,2\n*E\n"})
/* loaded from: classes.dex */
public final class StatelessInputConnection implements InputConnection {
    public static final int $stable = 8;
    private int batchDepth;

    @l
    private final MutableVector<v3.l<EditingBuffer, r2>> editCommands = new MutableVector<>(new v3.l[16], 0);

    @l
    private final TextInputSession session;

    public StatelessInputConnection(@l TextInputSession textInputSession) {
        this.session = textInputSession;
    }

    private final void addEditCommandWithBatch(v3.l<? super EditingBuffer, r2> lVar) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(lVar);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        int i5 = this.batchDepth - 1;
        this.batchDepth = i5;
        if (i5 == 0 && this.editCommands.isNotEmpty()) {
            this.session.requestEdit(new StatelessInputConnection$endBatchEditInternal$1(this));
            this.editCommands.clear();
        }
        if (this.batchDepth > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldCharSequence getText() {
        return this.session.getText();
    }

    private final void logDebug(String str) {
    }

    private final void sendSynthesizedKeyEvent(int i5) {
        sendKeyEvent(new KeyEvent(0, i5));
        sendKeyEvent(new KeyEvent(1, i5));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        logDebug("beginBatchEdit()");
        return beginBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i5) {
        logDebug("clearMetaKeyStates(" + i5 + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        logDebug("closeConnection()");
        this.editCommands.clear();
        this.batchDepth = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@m CompletionInfo completionInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("commitCompletion(");
        sb.append((Object) (completionInfo != null ? completionInfo.getText() : null));
        sb.append(')');
        logDebug(sb.toString());
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@l InputContentInfo inputContentInfo, int i5, @m Bundle bundle) {
        logDebug("commitContent(" + inputContentInfo + ", " + i5 + ", " + bundle + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@m CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@m CharSequence charSequence, int i5) {
        logDebug("commitText(\"" + ((Object) charSequence) + "\", " + i5 + ')');
        addEditCommandWithBatch(new StatelessInputConnection$commitText$1(charSequence, i5));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i5, int i6) {
        logDebug("deleteSurroundingText(" + i5 + ", " + i6 + ')');
        addEditCommandWithBatch(new StatelessInputConnection$deleteSurroundingText$1(i5, i6));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i5, int i6) {
        logDebug("deleteSurroundingTextInCodePoints(" + i5 + ", " + i6 + ')');
        addEditCommandWithBatch(new StatelessInputConnection$deleteSurroundingTextInCodePoints$1(i5, i6));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        logDebug("endBatchEdit()");
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        logDebug("finishComposingText()");
        addEditCommandWithBatch(StatelessInputConnection$finishComposingText$1.INSTANCE);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i5) {
        logDebug("getCursorCapsMode(" + i5 + ')');
        return TextUtils.getCapsMode(getText(), TextRange.m5543getMinimpl(getText().mo1076getSelectionInCharsd9O1mEE()), i5);
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public ExtractedText getExtractedText(@m ExtractedTextRequest extractedTextRequest, int i5) {
        ExtractedText extractedText;
        logDebug("getExtractedText(" + extractedTextRequest + ", " + i5 + ')');
        extractedText = StatelessInputConnection_androidKt.toExtractedText(getText());
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    @m
    public Handler getHandler() {
        logDebug("getHandler()");
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @m
    public CharSequence getSelectedText(int i5) {
        String obj;
        if (TextRange.m5539getCollapsedimpl(getText().mo1076getSelectionInCharsd9O1mEE())) {
            obj = null;
        } else {
            obj = TextFieldCharSequenceKt.getSelectedText(getText()).toString();
        }
        logDebug("getSelectedText(" + i5 + "): " + ((Object) obj));
        return obj;
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public CharSequence getTextAfterCursor(int i5, int i6) {
        String obj = TextFieldCharSequenceKt.getTextAfterSelection(getText(), i5).toString();
        logDebug("getTextAfterCursor(" + i5 + ", " + i6 + "): " + obj);
        return obj;
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public CharSequence getTextBeforeCursor(int i5, int i6) {
        String obj = TextFieldCharSequenceKt.getTextBeforeSelection(getText(), i5).toString();
        logDebug("getTextBeforeCursor(" + i5 + ", " + i6 + "): " + obj);
        return obj;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i5) {
        logDebug("performContextMenuAction(" + i5 + ')');
        switch (i5) {
            case R.id.selectAll:
                addEditCommandWithBatch(new StatelessInputConnection$performContextMenuAction$1(this));
                return false;
            case R.id.cut:
                sendSynthesizedKeyEvent(277);
                return false;
            case R.id.copy:
                sendSynthesizedKeyEvent(278);
                return false;
            case R.id.paste:
                sendSynthesizedKeyEvent(279);
                return false;
            default:
                return false;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i5) {
        int m5721getDefaulteUduSuo;
        logDebug("performEditorAction(" + i5 + ')');
        if (i5 != 0) {
            switch (i5) {
                case 2:
                    m5721getDefaulteUduSuo = ImeAction.Companion.m5723getGoeUduSuo();
                    break;
                case 3:
                    m5721getDefaulteUduSuo = ImeAction.Companion.m5727getSearcheUduSuo();
                    break;
                case 4:
                    m5721getDefaulteUduSuo = ImeAction.Companion.m5728getSendeUduSuo();
                    break;
                case 5:
                    m5721getDefaulteUduSuo = ImeAction.Companion.m5724getNexteUduSuo();
                    break;
                case 6:
                    m5721getDefaulteUduSuo = ImeAction.Companion.m5722getDoneeUduSuo();
                    break;
                case 7:
                    m5721getDefaulteUduSuo = ImeAction.Companion.m5726getPreviouseUduSuo();
                    break;
                default:
                    logDebug("IME sent an unrecognized editor action: " + i5);
                    m5721getDefaulteUduSuo = ImeAction.Companion.m5721getDefaulteUduSuo();
                    break;
            }
        } else {
            m5721getDefaulteUduSuo = ImeAction.Companion.m5721getDefaulteUduSuo();
        }
        this.session.mo1093onImeActionKlQnJC8(m5721getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@m String str, @m Bundle bundle) {
        logDebug("performPrivateCommand(" + str + ", " + bundle + ')');
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z4) {
        logDebug("reportFullscreenMode(" + z4 + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i5) {
        logDebug("requestCursorUpdates(" + i5 + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@l KeyEvent keyEvent) {
        logDebug("sendKeyEvent(" + keyEvent + ')');
        this.session.sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i5, int i6) {
        logDebug("setComposingRegion(" + i5 + ", " + i6 + ')');
        addEditCommandWithBatch(new StatelessInputConnection$setComposingRegion$1(i5, i6));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@m CharSequence charSequence, int i5) {
        logDebug("setComposingText(\"" + ((Object) charSequence) + "\", " + i5 + ')');
        addEditCommandWithBatch(new StatelessInputConnection$setComposingText$1(charSequence, i5));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i5, int i6) {
        logDebug("setSelection(" + i5 + ", " + i6 + ')');
        addEditCommandWithBatch(new StatelessInputConnection$setSelection$1(i5, i6));
        return true;
    }
}
