package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.ranges.u;
import p4.l;

@i0(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001ad\u0010\u000b\u001a\u00020\f*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0000\u001a\u001c\u0010\u0017\u001a\u00020\u0013*\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a,\u0010\u001b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u001d"}, d2 = {"addCharacterBounds", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "startOffset", "", "endOffset", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "innerTextFieldBounds", "Landroidx/compose/ui/geometry/Rect;", "build", "Landroid/view/inputmethod/CursorAnchorInfo;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "matrix", "Landroid/graphics/Matrix;", "decorationBoxBounds", "includeInsertionMarker", "", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "containsInclusive", "x", "", "y", "setInsertionMarker", "selectionStart", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005d, code lost:
    
        if (containsInclusive(r22, r8.getRight(), r8.getBottom()) == false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, androidx.compose.ui.text.input.OffsetMapping r20, androidx.compose.ui.text.TextLayoutResult r21, androidx.compose.ui.geometry.Rect r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.originalToTransformed(r2)
            int r5 = r1.originalToTransformed(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            androidx.compose.ui.text.MultiParagraph r7 = r21.getMultiParagraph()
            long r8 = androidx.compose.ui.text.TextRangeKt.TextRange(r4, r5)
            r5 = 0
            r7.m5421fillBoundingBoxes8ffj60Q(r8, r6, r5)
        L22:
            if (r2 >= r0) goto L8b
            int r5 = r1.originalToTransformed(r2)
            int r7 = r5 - r4
            int r7 = r7 * 4
            androidx.compose.ui.geometry.Rect r8 = new androidx.compose.ui.geometry.Rect
            r9 = r6[r7]
            int r10 = r7 + 1
            r10 = r6[r10]
            int r11 = r7 + 2
            r11 = r6[r11]
            int r7 = r7 + 3
            r7 = r6[r7]
            r8.<init>(r9, r10, r11, r7)
            boolean r7 = r3.overlaps(r8)
            float r9 = r8.getLeft()
            float r10 = r8.getTop()
            boolean r9 = containsInclusive(r3, r9, r10)
            if (r9 == 0) goto L5f
            float r9 = r8.getRight()
            float r10 = r8.getBottom()
            boolean r9 = containsInclusive(r3, r9, r10)
            if (r9 != 0) goto L61
        L5f:
            r7 = r7 | 2
        L61:
            r9 = r21
            androidx.compose.ui.text.style.ResolvedTextDirection r5 = r9.getBidiRunDirection(r5)
            androidx.compose.ui.text.style.ResolvedTextDirection r10 = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl
            if (r5 != r10) goto L70
            r5 = r7 | 4
            r16 = r5
            goto L72
        L70:
            r16 = r7
        L72:
            float r12 = r8.getLeft()
            float r13 = r8.getTop()
            float r14 = r8.getRight()
            float r15 = r8.getBottom()
            r10 = r17
            r11 = r2
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r2 = r2 + 1
            goto L22
        L8b:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.CursorAnchorInfoBuilder_androidKt.addCharacterBounds(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, androidx.compose.ui.text.input.OffsetMapping, androidx.compose.ui.text.TextLayoutResult, androidx.compose.ui.geometry.Rect):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    @l
    public static final CursorAnchorInfo build(@l CursorAnchorInfo.Builder builder, @l TextFieldValue textFieldValue, @l OffsetMapping offsetMapping, @l TextLayoutResult textLayoutResult, @l Matrix matrix, @l Rect rect, @l Rect rect2, boolean z4, boolean z5, boolean z6, boolean z7) {
        int i5;
        int i6;
        builder.reset();
        builder.setMatrix(matrix);
        int m5543getMinimpl = TextRange.m5543getMinimpl(textFieldValue.m5783getSelectiond9O1mEE());
        builder.setSelectionRange(m5543getMinimpl, TextRange.m5542getMaximpl(textFieldValue.m5783getSelectiond9O1mEE()));
        if (z4) {
            setInsertionMarker(builder, m5543getMinimpl, offsetMapping, textLayoutResult, rect);
        }
        if (z5) {
            TextRange m5782getCompositionMzsxiRA = textFieldValue.m5782getCompositionMzsxiRA();
            if (m5782getCompositionMzsxiRA != null) {
                i5 = TextRange.m5543getMinimpl(m5782getCompositionMzsxiRA.m5549unboximpl());
            } else {
                i5 = -1;
            }
            TextRange m5782getCompositionMzsxiRA2 = textFieldValue.m5782getCompositionMzsxiRA();
            if (m5782getCompositionMzsxiRA2 != null) {
                i6 = TextRange.m5542getMaximpl(m5782getCompositionMzsxiRA2.m5549unboximpl());
            } else {
                i6 = -1;
            }
            boolean z8 = false;
            if (i5 >= 0 && i5 < i6) {
                z8 = true;
            }
            if (z8) {
                builder.setComposingText(i5, textFieldValue.getText().subSequence(i5, i6));
                addCharacterBounds(builder, i5, i6, offsetMapping, textLayoutResult, rect);
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z6) {
            CursorAnchorInfoApi33Helper.setEditorBoundsInfo(builder, rect2);
        }
        if (i7 >= 34 && z7) {
            CursorAnchorInfoApi34Helper.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    private static final boolean containsInclusive(Rect rect, float f5, float f6) {
        if (f5 <= rect.getRight() && rect.getLeft() <= f5) {
            if (f6 <= rect.getBottom() && rect.getTop() <= f6) {
                return true;
            }
        }
        return false;
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i5, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect) {
        float H;
        boolean z4;
        int i6;
        if (i5 < 0) {
            return builder;
        }
        int originalToTransformed = offsetMapping.originalToTransformed(i5);
        Rect cursorRect = textLayoutResult.getCursorRect(originalToTransformed);
        H = u.H(cursorRect.getLeft(), 0.0f, IntSize.m6214getWidthimpl(textLayoutResult.m5518getSizeYbymL2g()));
        boolean containsInclusive = containsInclusive(rect, H, cursorRect.getTop());
        boolean containsInclusive2 = containsInclusive(rect, H, cursorRect.getBottom());
        int i7 = 1;
        if (textLayoutResult.getBidiRunDirection(originalToTransformed) == ResolvedTextDirection.Rtl) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!containsInclusive && !containsInclusive2) {
            i7 = 0;
        }
        if (!containsInclusive || !containsInclusive2) {
            i7 |= 2;
        }
        if (z4) {
            i6 = i7 | 4;
        } else {
            i6 = i7;
        }
        builder.setInsertionMarkerLocation(H, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), i6);
        return builder;
    }
}
