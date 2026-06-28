package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010g\u001a\u00020\u0012\u0012\u0006\u0010P\u001a\u00020O\u0012\u0006\u0010T\u001a\u00020\u0005¢\u0006\u0004\bh\u0010iJ\u0017\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0016\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\fH\u0016J\u0018\u0010 \u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\fH\u0016J\u001a\u0010!\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\fH\u0016J\u0018\u0010$\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016J\u0018\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016J\u0018\u0010&\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\fH\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(H\u0016J\u0018\u0010-\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\fH\u0016J\u0018\u0010.\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\fH\u0016J\u0012\u0010/\u001a\u0004\u0018\u00010\u001a2\u0006\u0010,\u001a\u00020\fH\u0016J\u0010\u00101\u001a\u00020\u00052\u0006\u00100\u001a\u00020\fH\u0016J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u0001022\u0006\u0010,\u001a\u00020\fH\u0016J\u0010\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u00020\fH\u0016J\u0010\u00109\u001a\u00020\u00052\u0006\u00108\u001a\u00020\fH\u0016J\u0012\u0010;\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010:H\u0016J\u0012\u0010>\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010<H\u0016J\n\u0010@\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\fH\u0016J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016J\u0010\u0010F\u001a\u00020\f2\u0006\u0010E\u001a\u00020\fH\u0016J\u001c\u0010J\u001a\u00020\u00052\b\u0010G\u001a\u0004\u0018\u00010\u000f2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016J\"\u0010N\u001a\u00020\u00052\u0006\u0010L\u001a\u00020K2\u0006\u0010,\u001a\u00020\f2\b\u0010M\u001a\u0004\u0018\u00010HH\u0016R\u0017\u0010P\u001a\u00020O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010T\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR*\u0010[\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u00128\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010YR\u0016\u0010b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010UR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00070c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010U¨\u0006j"}, d2 = {"Landroidx/compose/ui/text/input/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Lkotlin/Function0;", "Lkotlin/r2;", "block", "", "ensureActive", "Landroidx/compose/ui/text/input/EditCommand;", "editCommand", "addEditCommandWithBatch", "beginBatchEditInternal", "endBatchEditInternal", "", PluginConstants.KEY_ERROR_CODE, "sendSynthesizedKeyEvent", "", CrashHianalyticsData.MESSAGE, "logDebug", "Landroidx/compose/ui/text/input/TextFieldValue;", "state", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "updateInputState", "beginBatchEdit", "endBatchEdit", "closeConnection", "", "text", "newCursorPosition", "commitText", "start", "end", "setComposingRegion", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "sendKeyEvent", "maxChars", "flags", "getTextBeforeCursor", "getTextAfterCursor", "getSelectedText", "cursorUpdateMode", "requestCursorUpdates", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "Landroid/os/Handler;", "getHandler", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "reqModes", "getCursorCapsMode", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "Landroidx/compose/ui/text/input/InputEventCallback2;", "eventCallback", "Landroidx/compose/ui/text/input/InputEventCallback2;", "getEventCallback", "()Landroidx/compose/ui/text/input/InputEventCallback2;", "autoCorrect", "Z", "getAutoCorrect", "()Z", "batchDepth", "I", t0.b.f22420d, "mTextFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMTextFieldValue$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setMTextFieldValue$ui_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "currentExtractedTextRequestToken", "extractedTextMonitorMode", "", "editCommands", "Ljava/util/List;", "isActive", "initState", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/InputEventCallback2;Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,453:1\n81#1,5:454\n81#1,5:459\n81#1,5:464\n81#1,5:469\n81#1,5:474\n81#1,5:479\n81#1,5:484\n81#1,5:489\n81#1,5:494\n81#1,5:499\n81#1,5:504\n81#1,5:509\n81#1,5:514\n81#1,5:519\n81#1,5:524\n81#1,5:529\n81#1,5:534\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n140#1:454,5\n176#1:459,5\n181#1:464,5\n187#1:469,5\n195#1:474,5\n206#1:479,5\n212#1:484,5\n218#1:489,5\n224#1:494,5\n260#1:499,5\n344#1:504,5\n370#1:509,5\n393#1:514,5\n403#1:519,5\n415#1:524,5\n435#1:529,5\n444#1:534,5\n*E\n"})
/* loaded from: classes.dex */
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;

    @l
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;

    @l
    private TextFieldValue mTextFieldValue;

    @l
    private final List<EditCommand> editCommands = new ArrayList();
    private boolean isActive = true;

    public RecordingInputConnection(@l TextFieldValue textFieldValue, @l InputEventCallback2 inputEventCallback2, boolean z4) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z4;
        this.mTextFieldValue = textFieldValue;
    }

    private final void addEditCommandWithBatch(EditCommand editCommand) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        List<? extends EditCommand> V5;
        int i5 = this.batchDepth - 1;
        this.batchDepth = i5;
        if (i5 == 0 && (!this.editCommands.isEmpty())) {
            InputEventCallback2 inputEventCallback2 = this.eventCallback;
            V5 = e0.V5(this.editCommands);
            inputEventCallback2.onEditCommands(V5);
            this.editCommands.clear();
        }
        if (this.batchDepth > 0) {
            return true;
        }
        return false;
    }

    private final boolean ensureActive(v3.a<r2> aVar) {
        boolean z4 = this.isActive;
        if (z4) {
            aVar.invoke();
        }
        return z4;
    }

    private final void logDebug(String str) {
    }

    private final void sendSynthesizedKeyEvent(int i5) {
        sendKeyEvent(new KeyEvent(0, i5));
        sendKeyEvent(new KeyEvent(1, i5));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z4 = this.isActive;
        if (z4) {
            return beginBatchEditInternal();
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i5) {
        boolean z4 = this.isActive;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@m CompletionInfo completionInfo) {
        boolean z4 = this.isActive;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@l InputContentInfo inputContentInfo, int i5, @m Bundle bundle) {
        boolean z4 = this.isActive;
        if (z4) {
            return false;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@m CorrectionInfo correctionInfo) {
        boolean z4 = this.isActive;
        if (z4) {
            return this.autoCorrect;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@m CharSequence charSequence, int i5) {
        boolean z4 = this.isActive;
        if (z4) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(charSequence), i5));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i5, int i6) {
        boolean z4 = this.isActive;
        if (z4) {
            addEditCommandWithBatch(new DeleteSurroundingTextCommand(i5, i6));
            return true;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i5, int i6) {
        boolean z4 = this.isActive;
        if (z4) {
            addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(i5, i6));
            return true;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z4 = this.isActive;
        if (z4) {
            addEditCommandWithBatch(new FinishComposingTextCommand());
            return true;
        }
        return z4;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i5) {
        return TextUtils.getCapsMode(this.mTextFieldValue.getText(), TextRange.m5543getMinimpl(this.mTextFieldValue.m5783getSelectiond9O1mEE()), i5);
    }

    @l
    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public ExtractedText getExtractedText(@m ExtractedTextRequest extractedTextRequest, int i5) {
        boolean z4 = true;
        int i6 = 0;
        if ((i5 & 1) == 0) {
            z4 = false;
        }
        this.extractedTextMonitorMode = z4;
        if (z4) {
            if (extractedTextRequest != null) {
                i6 = extractedTextRequest.token;
            }
            this.currentExtractedTextRequestToken = i6;
        }
        return InputState_androidKt.toExtractedText(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    @m
    public Handler getHandler() {
        return null;
    }

    @l
    public final TextFieldValue getMTextFieldValue$ui_release() {
        return this.mTextFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    @m
    public CharSequence getSelectedText(int i5) {
        if (TextRange.m5539getCollapsedimpl(this.mTextFieldValue.m5783getSelectiond9O1mEE())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public CharSequence getTextAfterCursor(int i5, int i6) {
        return TextFieldValueKt.getTextAfterSelection(this.mTextFieldValue, i5).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public CharSequence getTextBeforeCursor(int i5, int i6) {
        return TextFieldValueKt.getTextBeforeSelection(this.mTextFieldValue, i5).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i5) {
        boolean z4 = this.isActive;
        if (z4) {
            z4 = false;
            switch (i5) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.mTextFieldValue.getText().length()));
                    break;
                case R.id.cut:
                    sendSynthesizedKeyEvent(277);
                    break;
                case R.id.copy:
                    sendSynthesizedKeyEvent(278);
                    break;
                case R.id.paste:
                    sendSynthesizedKeyEvent(279);
                    break;
            }
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i5) {
        int m5721getDefaulteUduSuo;
        boolean z4 = this.isActive;
        if (z4) {
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
                        Log.w(RecordingInputConnection_androidKt.TAG, "IME sends unsupported Editor Action: " + i5);
                        m5721getDefaulteUduSuo = ImeAction.Companion.m5721getDefaulteUduSuo();
                        break;
                }
            } else {
                m5721getDefaulteUduSuo = ImeAction.Companion.m5721getDefaulteUduSuo();
            }
            this.eventCallback.mo5737onImeActionKlQnJC8(m5721getDefaulteUduSuo);
            return true;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@m String str, @m Bundle bundle) {
        boolean z4 = this.isActive;
        if (z4) {
            return true;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z4) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i5) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = this.isActive;
        if (z13) {
            boolean z14 = false;
            if ((i5 & 1) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i5 & 2) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33) {
                if ((i5 & 16) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i5 & 8) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i5 & 4) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i6 >= 34 && (i5 & 32) != 0) {
                    z14 = true;
                }
                if (!z10 && !z11 && !z12 && !z14) {
                    if (i6 >= 34) {
                        z8 = true;
                        z9 = true;
                        z6 = true;
                        z7 = true;
                    } else {
                        z7 = z14;
                        z8 = true;
                        z9 = true;
                        z6 = true;
                    }
                } else {
                    z7 = z14;
                    z6 = z12;
                    z9 = z11;
                    z8 = z10;
                }
            } else {
                z6 = false;
                z7 = false;
                z8 = true;
                z9 = true;
            }
            this.eventCallback.onRequestCursorAnchorInfo(z4, z5, z8, z9, z6, z7);
            return true;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@l KeyEvent keyEvent) {
        boolean z4 = this.isActive;
        if (z4) {
            this.eventCallback.onKeyEvent(keyEvent);
            return true;
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i5, int i6) {
        boolean z4 = this.isActive;
        if (z4) {
            addEditCommandWithBatch(new SetComposingRegionCommand(i5, i6));
        }
        return z4;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@m CharSequence charSequence, int i5) {
        boolean z4 = this.isActive;
        if (z4) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(charSequence), i5));
        }
        return z4;
    }

    public final void setMTextFieldValue$ui_release(@l TextFieldValue textFieldValue) {
        this.mTextFieldValue = textFieldValue;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i5, int i6) {
        boolean z4 = this.isActive;
        if (z4) {
            addEditCommandWithBatch(new SetSelectionCommand(i5, i6));
            return true;
        }
        return z4;
    }

    public final void updateInputState(@l TextFieldValue textFieldValue, @l InputMethodManager inputMethodManager) {
        int i5;
        if (!this.isActive) {
            return;
        }
        setMTextFieldValue$ui_release(textFieldValue);
        if (this.extractedTextMonitorMode) {
            inputMethodManager.updateExtractedText(this.currentExtractedTextRequestToken, InputState_androidKt.toExtractedText(textFieldValue));
        }
        TextRange m5782getCompositionMzsxiRA = textFieldValue.m5782getCompositionMzsxiRA();
        int i6 = -1;
        if (m5782getCompositionMzsxiRA != null) {
            i5 = TextRange.m5543getMinimpl(m5782getCompositionMzsxiRA.m5549unboximpl());
        } else {
            i5 = -1;
        }
        TextRange m5782getCompositionMzsxiRA2 = textFieldValue.m5782getCompositionMzsxiRA();
        if (m5782getCompositionMzsxiRA2 != null) {
            i6 = TextRange.m5542getMaximpl(m5782getCompositionMzsxiRA2.m5549unboximpl());
        }
        inputMethodManager.updateSelection(TextRange.m5543getMinimpl(textFieldValue.m5783getSelectiond9O1mEE()), TextRange.m5542getMaximpl(textFieldValue.m5783getSelectiond9O1mEE()), i5, i6);
    }
}
