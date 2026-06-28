package androidx.compose.foundation.text2.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.tendcloud.tenddata.cq;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001=B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0015\u0012\u0006\u00104\u001a\u00020.¢\u0006\u0004\b:\u0010;B\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0013\u0012\u0006\u00104\u001a\u00020.¢\u0006\u0004\b:\u0010<J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002J\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0005J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0006\u0010\u0016\u001a\u00020\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010&\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R$\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R$\u0010,\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u0019\u00101\u001a\u0004\u0018\u00010.8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b/\u00100R\u0017\u00104\u001a\u00020.8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b2\u00103R$\u00105\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010#\"\u0004\b7\u0010%R\u0011\u00109\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b8\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "", "", "start", "end", "Lkotlin/r2;", "checkRange", "", "hasComposition", "index", "", "get", "", "text", "replace", "delete", "setSelection", "setComposition", "commitComposition", "", "toString", "Landroidx/compose/ui/text/AnnotatedString;", "toAnnotatedString", "Landroidx/compose/foundation/text2/input/internal/PartialGapBuffer;", "gapBuffer", "Landroidx/compose/foundation/text2/input/internal/PartialGapBuffer;", "Landroidx/compose/foundation/text2/input/internal/ChangeTracker;", "changeTracker", "Landroidx/compose/foundation/text2/input/internal/ChangeTracker;", "getChangeTracker", "()Landroidx/compose/foundation/text2/input/internal/ChangeTracker;", t0.b.f22420d, "selectionStart", "I", "getSelectionStart", "()I", "setSelectionStart", "(I)V", "selectionEnd", "getSelectionEnd", "setSelectionEnd", "<set-?>", "compositionStart", "getCompositionStart", "compositionEnd", "getCompositionEnd", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "composition", "getSelection-d9O1mEE", "()J", "selection", "cursor", "getCursor", "setCursor", "getLength", cq.a.LENGTH, "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/w;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/foundation/text2/input/internal/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* loaded from: classes.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;

    @l
    private final ChangeTracker changeTracker;
    private int compositionEnd;
    private int compositionStart;

    @l
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/EditingBuffer$Companion;", "", "()V", "NOWHERE", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EditingBuffer(AnnotatedString annotatedString, long j5) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.changeTracker = new ChangeTracker(null, 1, 0 == true ? 1 : 0);
        this.selectionStart = TextRange.m5545getStartimpl(j5);
        this.selectionEnd = TextRange.m5540getEndimpl(j5);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        checkRange(TextRange.m5545getStartimpl(j5), TextRange.m5540getEndimpl(j5));
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j5, w wVar) {
        this(annotatedString, j5);
    }

    public /* synthetic */ EditingBuffer(String str, long j5, w wVar) {
        this(str, j5);
    }

    private final void checkRange(int i5, int i6) {
        if (i5 >= 0 && i5 <= this.gapBuffer.length()) {
            if (i6 >= 0 && i6 <= this.gapBuffer.length()) {
                return;
            }
            throw new IndexOutOfBoundsException("end (" + i6 + ") offset is outside of text region " + this.gapBuffer.length());
        }
        throw new IndexOutOfBoundsException("start (" + i5 + ") offset is outside of text region " + this.gapBuffer.length());
    }

    private final void setSelectionEnd(int i5) {
        boolean z4;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.selectionEnd = i5;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i5).toString());
    }

    private final void setSelectionStart(int i5) {
        boolean z4;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.selectionStart = i5;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i5).toString());
    }

    public final void commitComposition() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete(int i5, int i6) {
        checkRange(i5, i6);
        long TextRange = TextRangeKt.TextRange(i5, i6);
        this.changeTracker.trackChange(i5, i6, 0);
        PartialGapBuffer.replace$default(this.gapBuffer, TextRange.m5543getMinimpl(TextRange), TextRange.m5542getMaximpl(TextRange), "", 0, 0, 24, null);
        long m1096updateRangeAfterDeletepWDy79M = EditingBufferKt.m1096updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), TextRange);
        setSelectionStart(TextRange.m5545getStartimpl(m1096updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m5540getEndimpl(m1096updateRangeAfterDeletepWDy79M));
        if (hasComposition()) {
            long m1096updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m1096updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), TextRange);
            if (TextRange.m5539getCollapsedimpl(m1096updateRangeAfterDeletepWDy79M2)) {
                commitComposition();
            } else {
                this.compositionStart = TextRange.m5543getMinimpl(m1096updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m5542getMaximpl(m1096updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get(int i5) {
        return this.gapBuffer.charAt(i5);
    }

    @l
    public final ChangeTracker getChangeTracker() {
        return this.changeTracker;
    }

    @m
    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m1094getCompositionMzsxiRA() {
        if (hasComposition()) {
            return TextRange.m5533boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int getCursor() {
        int i5 = this.selectionStart;
        int i6 = this.selectionEnd;
        if (i5 == i6) {
            return i6;
        }
        return -1;
    }

    public final int getLength() {
        return this.gapBuffer.length();
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1095getSelectiond9O1mEE() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final boolean hasComposition() {
        return this.compositionStart != -1;
    }

    public final void replace(int i5, int i6, @l CharSequence charSequence) {
        checkRange(i5, i6);
        int min = Math.min(i5, i6);
        int max = Math.max(i5, i6);
        int i7 = 0;
        int i8 = min;
        while (i8 < max && i7 < charSequence.length() && charSequence.charAt(i7) == this.gapBuffer.charAt(i8)) {
            i7++;
            i8++;
        }
        int length = charSequence.length();
        int i9 = max;
        while (i9 > min && length > i7 && charSequence.charAt(length - 1) == this.gapBuffer.charAt(i9 - 1)) {
            length--;
            i9--;
        }
        this.changeTracker.trackChange(i8, i9, length - i7);
        PartialGapBuffer.replace$default(this.gapBuffer, min, max, charSequence, 0, 0, 24, null);
        setSelectionStart(charSequence.length() + min);
        setSelectionEnd(min + charSequence.length());
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void setComposition(int i5, int i6) {
        if (i5 >= 0 && i5 <= this.gapBuffer.length()) {
            if (i6 >= 0 && i6 <= this.gapBuffer.length()) {
                if (i5 < i6) {
                    this.compositionStart = i5;
                    this.compositionEnd = i6;
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed or empty range: " + i5 + " > " + i6);
            }
            throw new IndexOutOfBoundsException("end (" + i6 + ") offset is outside of text region " + this.gapBuffer.length());
        }
        throw new IndexOutOfBoundsException("start (" + i5 + ") offset is outside of text region " + this.gapBuffer.length());
    }

    public final void setCursor(int i5) {
        setSelection(i5, i5);
    }

    public final void setSelection(int i5, int i6) {
        int I;
        int I2;
        I = u.I(i5, 0, getLength());
        I2 = u.I(i6, 0, getLength());
        setSelectionStart(I);
        setSelectionEnd(I2);
    }

    @l
    public final AnnotatedString toAnnotatedString() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }

    @l
    public String toString() {
        return this.gapBuffer.toString();
    }

    private EditingBuffer(String str, long j5) {
        this(new AnnotatedString(str, null, null, 6, null), j5, (w) null);
    }
}
