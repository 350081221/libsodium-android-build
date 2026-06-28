package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\n\u001a\u00020\t*\u00020\bH\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "Lkotlin/r2;", "updateWithEmojiCompat", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "update", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "asExecutor", "", "bits", "flag", "", "hasFlag", "", "DEBUG_CLASS", "Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextInputServiceAndroid_androidKt {

    @l
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    @l
    public static final Executor asExecutor(@l final Choreographer choreographer) {
        return new Executor() { // from class: androidx.compose.ui.text.input.d
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.asExecutor$lambda$2(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$2(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j5) {
                runnable.run();
            }
        });
    }

    private static final boolean hasFlag(int i5, int i6) {
        return (i5 & i6) == i6;
    }

    public static final void update(@l EditorInfo editorInfo, @l ImeOptions imeOptions, @l TextFieldValue textFieldValue) {
        String privateImeOptions;
        int m5734getImeActioneUduSuo = imeOptions.m5734getImeActioneUduSuo();
        ImeAction.Companion companion = ImeAction.Companion;
        int i5 = 6;
        if (ImeAction.m5709equalsimpl0(m5734getImeActioneUduSuo, companion.m5721getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i5 = 0;
            }
        } else if (ImeAction.m5709equalsimpl0(m5734getImeActioneUduSuo, companion.m5725getNoneeUduSuo())) {
            i5 = 1;
        } else if (ImeAction.m5709equalsimpl0(m5734getImeActioneUduSuo, companion.m5723getGoeUduSuo())) {
            i5 = 2;
        } else if (ImeAction.m5709equalsimpl0(m5734getImeActioneUduSuo, companion.m5724getNexteUduSuo())) {
            i5 = 5;
        } else if (ImeAction.m5709equalsimpl0(m5734getImeActioneUduSuo, companion.m5726getPreviouseUduSuo())) {
            i5 = 7;
        } else if (ImeAction.m5709equalsimpl0(m5734getImeActioneUduSuo, companion.m5727getSearcheUduSuo())) {
            i5 = 3;
        } else if (ImeAction.m5709equalsimpl0(m5734getImeActioneUduSuo, companion.m5728getSendeUduSuo())) {
            i5 = 4;
        } else if (!ImeAction.m5709equalsimpl0(m5734getImeActioneUduSuo, companion.m5722getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i5;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int m5735getKeyboardTypePjHm6EE = imeOptions.m5735getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion2 = KeyboardType.Companion;
        if (KeyboardType.m5756equalsimpl0(m5735getKeyboardTypePjHm6EE, companion2.m5776getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m5756equalsimpl0(m5735getKeyboardTypePjHm6EE, companion2.m5769getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m5756equalsimpl0(m5735getKeyboardTypePjHm6EE, companion2.m5772getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m5756equalsimpl0(m5735getKeyboardTypePjHm6EE, companion2.m5775getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m5756equalsimpl0(m5735getKeyboardTypePjHm6EE, companion2.m5777getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m5756equalsimpl0(m5735getKeyboardTypePjHm6EE, companion2.m5771getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m5756equalsimpl0(m5735getKeyboardTypePjHm6EE, companion2.m5774getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m5756equalsimpl0(m5735getKeyboardTypePjHm6EE, companion2.m5773getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.m5756equalsimpl0(m5735getKeyboardTypePjHm6EE, companion2.m5770getDecimalPjHm6EE())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m5709equalsimpl0(imeOptions.m5734getImeActioneUduSuo(), companion.m5721getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int m5733getCapitalizationIUNYP9k = imeOptions.m5733getCapitalizationIUNYP9k();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.Companion;
            if (KeyboardCapitalization.m5741equalsimpl0(m5733getCapitalizationIUNYP9k, companion3.m5749getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m5741equalsimpl0(m5733getCapitalizationIUNYP9k, companion3.m5752getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m5741equalsimpl0(m5733getCapitalizationIUNYP9k, companion3.m5751getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m5545getStartimpl(textFieldValue.m5783getSelectiond9O1mEE());
        editorInfo.initialSelEnd = TextRange.m5540getEndimpl(textFieldValue.m5783getSelectiond9O1mEE());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (!EmojiCompat.isConfigured()) {
            return;
        }
        EmojiCompat.get().updateEditorInfo(editorInfo);
    }
}
