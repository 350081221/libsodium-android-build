package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.l;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0000\u001a\f\u0010\u000f\u001a\u00020\u0005*\u00020\u0000H\u0000\u001a\f\u0010\u0010\u001a\u00020\u0005*\u00020\u0000H\u0000\u001a\u0014\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0005*\u00020\u0000H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "", "text", "", "newCursorPosition", "Lkotlin/r2;", "commitText", "start", "end", "setComposingRegion", "setComposingText", "lengthBeforeCursor", "lengthAfterCursor", "deleteSurroundingText", "deleteSurroundingTextInCodePoints", "finishComposingText", "backspace", "amount", "moveCursor", "deleteAll", "", "high", "low", "", "isSurrogatePair", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/foundation/text2/input/internal/EditCommandKt\n+ 2 MathUtils.kt\nandroidx/compose/foundation/text2/input/internal/MathUtilsKt\n*L\n1#1,298:1\n23#2,3:299\n32#2,4:302\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/foundation/text2/input/internal/EditCommandKt\n*L\n156#1:299,3\n161#1:302,4\n*E\n"})
/* loaded from: classes.dex */
public final class EditCommandKt {
    public static final void backspace(@l EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition()) {
            editingBuffer.delete(editingBuffer.getCompositionStart(), editingBuffer.getCompositionEnd());
            return;
        }
        if (editingBuffer.getCursor() == -1) {
            int selectionStart = editingBuffer.getSelectionStart();
            int selectionEnd = editingBuffer.getSelectionEnd();
            editingBuffer.setCursor(editingBuffer.getSelectionStart());
            editingBuffer.delete(selectionStart, selectionEnd);
            return;
        }
        if (editingBuffer.getCursor() != 0) {
            editingBuffer.delete(StringHelpers_androidKt.findPrecedingBreak(editingBuffer.toString(), editingBuffer.getCursor()), editingBuffer.getCursor());
        }
    }

    public static final void commitText(@l EditingBuffer editingBuffer, @l String str, int i5) {
        int length;
        int I;
        if (editingBuffer.hasComposition()) {
            editingBuffer.replace(editingBuffer.getCompositionStart(), editingBuffer.getCompositionEnd(), str);
        } else {
            editingBuffer.replace(editingBuffer.getSelectionStart(), editingBuffer.getSelectionEnd(), str);
        }
        int cursor = editingBuffer.getCursor();
        if (i5 > 0) {
            length = (cursor + i5) - 1;
        } else {
            length = (cursor + i5) - str.length();
        }
        I = u.I(length, 0, editingBuffer.getLength());
        editingBuffer.setCursor(I);
    }

    public static final void deleteAll(@l EditingBuffer editingBuffer) {
        editingBuffer.replace(0, editingBuffer.getLength(), "");
    }

    public static final void deleteSurroundingText(@l EditingBuffer editingBuffer, int i5, int i6) {
        boolean z4;
        if (i5 >= 0 && i6 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int selectionEnd = editingBuffer.getSelectionEnd();
            int i7 = selectionEnd + i6;
            if (((i6 ^ i7) & (selectionEnd ^ i7)) < 0) {
                i7 = editingBuffer.getLength();
            }
            editingBuffer.delete(editingBuffer.getSelectionEnd(), Math.min(i7, editingBuffer.getLength()));
            int selectionStart = editingBuffer.getSelectionStart();
            int i8 = selectionStart - i5;
            if (((i5 ^ selectionStart) & (selectionStart ^ i8)) < 0) {
                i8 = 0;
            }
            editingBuffer.delete(Math.max(0, i8), editingBuffer.getSelectionStart());
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i5 + " and " + i6 + " respectively.").toString());
    }

    public static final void deleteSurroundingTextInCodePoints(@l EditingBuffer editingBuffer, int i5, int i6) {
        boolean z4;
        if (i5 >= 0 && i6 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                i7++;
                if (editingBuffer.getSelectionStart() > i7 && isSurrogatePair(editingBuffer.get((editingBuffer.getSelectionStart() - i7) - 1), editingBuffer.get(editingBuffer.getSelectionStart() - i7))) {
                    i7++;
                }
                if (i7 == editingBuffer.getSelectionStart()) {
                    break;
                }
            }
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9++;
                if (editingBuffer.getSelectionEnd() + i9 < editingBuffer.getLength() && isSurrogatePair(editingBuffer.get((editingBuffer.getSelectionEnd() + i9) - 1), editingBuffer.get(editingBuffer.getSelectionEnd() + i9))) {
                    i9++;
                }
                if (editingBuffer.getSelectionEnd() + i9 == editingBuffer.getLength()) {
                    break;
                }
            }
            editingBuffer.delete(editingBuffer.getSelectionEnd(), editingBuffer.getSelectionEnd() + i9);
            editingBuffer.delete(editingBuffer.getSelectionStart() - i7, editingBuffer.getSelectionStart());
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i5 + " and " + i6 + " respectively.").toString());
    }

    public static final void finishComposingText(@l EditingBuffer editingBuffer) {
        editingBuffer.commitComposition();
    }

    private static final boolean isSurrogatePair(char c5, char c6) {
        return Character.isHighSurrogate(c5) && Character.isLowSurrogate(c6);
    }

    public static final void moveCursor(@l EditingBuffer editingBuffer, int i5) {
        if (editingBuffer.getCursor() == -1) {
            editingBuffer.setCursor(editingBuffer.getSelectionStart());
        }
        int selectionStart = editingBuffer.getSelectionStart();
        String editingBuffer2 = editingBuffer.toString();
        int i6 = 0;
        if (i5 > 0) {
            while (i6 < i5) {
                int findFollowingBreak = StringHelpers_androidKt.findFollowingBreak(editingBuffer2, selectionStart);
                if (findFollowingBreak == -1) {
                    break;
                }
                i6++;
                selectionStart = findFollowingBreak;
            }
        } else {
            int i7 = -i5;
            while (i6 < i7) {
                int findPrecedingBreak = StringHelpers_androidKt.findPrecedingBreak(editingBuffer2, selectionStart);
                if (findPrecedingBreak == -1) {
                    break;
                }
                i6++;
                selectionStart = findPrecedingBreak;
            }
        }
        editingBuffer.setCursor(selectionStart);
    }

    public static final void setComposingRegion(@l EditingBuffer editingBuffer, int i5, int i6) {
        int I;
        int I2;
        if (editingBuffer.hasComposition()) {
            editingBuffer.commitComposition();
        }
        I = u.I(i5, 0, editingBuffer.getLength());
        I2 = u.I(i6, 0, editingBuffer.getLength());
        if (I != I2) {
            if (I < I2) {
                editingBuffer.setComposition(I, I2);
            } else {
                editingBuffer.setComposition(I2, I);
            }
        }
    }

    public static final void setComposingText(@l EditingBuffer editingBuffer, @l String str, int i5) {
        boolean z4;
        int length;
        int I;
        boolean z5;
        if (editingBuffer.hasComposition()) {
            int compositionStart = editingBuffer.getCompositionStart();
            editingBuffer.replace(compositionStart, editingBuffer.getCompositionEnd(), str);
            if (str.length() > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                editingBuffer.setComposition(compositionStart, str.length() + compositionStart);
            }
        } else {
            int selectionStart = editingBuffer.getSelectionStart();
            editingBuffer.replace(selectionStart, editingBuffer.getSelectionEnd(), str);
            if (str.length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                editingBuffer.setComposition(selectionStart, str.length() + selectionStart);
            }
        }
        int cursor = editingBuffer.getCursor();
        if (i5 > 0) {
            length = (cursor + i5) - 1;
        } else {
            length = (cursor + i5) - str.length();
        }
        I = u.I(length, 0, editingBuffer.getLength());
        editingBuffer.setCursor(I);
    }
}
