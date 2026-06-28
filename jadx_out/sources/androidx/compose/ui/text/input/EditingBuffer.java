package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.tendcloud.tenddata.cq;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010>\u001a\u000208¢\u0006\u0004\bD\u0010EB\u0019\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0014\u0012\u0006\u0010>\u001a\u000208¢\u0006\u0004\bD\u0010FJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0080\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0011\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010!\u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010\u001eJ\b\u0010\"\u001a\u00020\u0014H\u0016J\u000f\u0010%\u001a\u00020\u000eH\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00100\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R$\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-R$\u00106\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-R\u001c\u0010;\u001a\u0004\u0018\u0001088@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010>\u001a\u0002088@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b<\u0010=R$\u0010?\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u00068@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b@\u0010-\"\u0004\bA\u0010/R\u0014\u0010C\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "", "hasComposition$ui_text_release", "()Z", "hasComposition", "", "index", "", "get$ui_text_release", "(I)C", "get", "start", "end", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Lkotlin/r2;", "replace$ui_text_release", "(IILandroidx/compose/ui/text/AnnotatedString;)V", "replace", "", "(IILjava/lang/String;)V", "delete$ui_text_release", "(II)V", "delete", "setSelection$ui_text_release", "setSelection", "setComposition$ui_text_release", "setComposition", "cancelComposition$ui_text_release", "()V", "cancelComposition", "commitComposition$ui_text_release", "commitComposition", "toString", "toAnnotatedString$ui_text_release", "()Landroidx/compose/ui/text/AnnotatedString;", "toAnnotatedString", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "gapBuffer", "Landroidx/compose/ui/text/input/PartialGapBuffer;", t0.b.f22420d, "selectionStart", "I", "getSelectionStart$ui_text_release", "()I", "setSelectionStart", "(I)V", "selectionEnd", "getSelectionEnd$ui_text_release", "setSelectionEnd", "<set-?>", "compositionStart", "getCompositionStart$ui_text_release", "compositionEnd", "getCompositionEnd$ui_text_release", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA$ui_text_release", "()Landroidx/compose/ui/text/TextRange;", "composition", "getSelection-d9O1mEE$ui_text_release", "()J", "selection", "cursor", "getCursor$ui_text_release", "setCursor$ui_text_release", "getLength$ui_text_release", cq.a.LENGTH, "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/w;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
/* loaded from: classes.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;

    @l
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer$Companion;", "", "()V", "NOWHERE", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    private EditingBuffer(AnnotatedString annotatedString, long j5) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m5543getMinimpl(j5);
        this.selectionEnd = TextRange.m5542getMaximpl(j5);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int m5543getMinimpl = TextRange.m5543getMinimpl(j5);
        int m5542getMaximpl = TextRange.m5542getMaximpl(j5);
        if (m5543getMinimpl >= 0 && m5543getMinimpl <= annotatedString.length()) {
            if (m5542getMaximpl < 0 || m5542getMaximpl > annotatedString.length()) {
                throw new IndexOutOfBoundsException("end (" + m5542getMaximpl + ") offset is outside of text region " + annotatedString.length());
            }
            if (m5543getMinimpl <= m5542getMaximpl) {
                return;
            }
            throw new IllegalArgumentException("Do not set reversed range: " + m5543getMinimpl + " > " + m5542getMaximpl);
        }
        throw new IndexOutOfBoundsException("start (" + m5543getMinimpl + ") offset is outside of text region " + annotatedString.length());
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j5, w wVar) {
        this(annotatedString, j5);
    }

    public /* synthetic */ EditingBuffer(String str, long j5, w wVar) {
        this(str, j5);
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

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text_release(int i5, int i6) {
        long TextRange = TextRangeKt.TextRange(i5, i6);
        this.gapBuffer.replace(i5, i6, "");
        long m5705updateRangeAfterDeletepWDy79M = EditingBufferKt.m5705updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), TextRange);
        setSelectionStart(TextRange.m5543getMinimpl(m5705updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m5542getMaximpl(m5705updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text_release()) {
            long m5705updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m5705updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), TextRange);
            if (TextRange.m5539getCollapsedimpl(m5705updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
            } else {
                this.compositionStart = TextRange.m5543getMinimpl(m5705updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m5542getMaximpl(m5705updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text_release(int i5) {
        return this.gapBuffer.get(i5);
    }

    @m
    /* renamed from: getComposition-MzsxiRA$ui_text_release, reason: not valid java name */
    public final TextRange m5703getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m5533boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    public final int getCompositionEnd$ui_text_release() {
        return this.compositionEnd;
    }

    public final int getCompositionStart$ui_text_release() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text_release() {
        int i5 = this.selectionStart;
        int i6 = this.selectionEnd;
        if (i5 == i6) {
            return i6;
        }
        return -1;
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    /* renamed from: getSelection-d9O1mEE$ui_text_release, reason: not valid java name */
    public final long m5704getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getSelectionEnd$ui_text_release() {
        return this.selectionEnd;
    }

    public final int getSelectionStart$ui_text_release() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.compositionStart != -1;
    }

    public final void replace$ui_text_release(int i5, int i6, @l AnnotatedString annotatedString) {
        replace$ui_text_release(i5, i6, annotatedString.getText());
    }

    public final void setComposition$ui_text_release(int i5, int i6) {
        if (i5 >= 0 && i5 <= this.gapBuffer.getLength()) {
            if (i6 >= 0 && i6 <= this.gapBuffer.getLength()) {
                if (i5 < i6) {
                    this.compositionStart = i5;
                    this.compositionEnd = i6;
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed or empty range: " + i5 + " > " + i6);
            }
            throw new IndexOutOfBoundsException("end (" + i6 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        throw new IndexOutOfBoundsException("start (" + i5 + ") offset is outside of text region " + this.gapBuffer.getLength());
    }

    public final void setCursor$ui_text_release(int i5) {
        setSelection$ui_text_release(i5, i5);
    }

    public final void setSelection$ui_text_release(int i5, int i6) {
        if (i5 >= 0 && i5 <= this.gapBuffer.getLength()) {
            if (i6 >= 0 && i6 <= this.gapBuffer.getLength()) {
                if (i5 <= i6) {
                    setSelectionStart(i5);
                    setSelectionEnd(i6);
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed range: " + i5 + " > " + i6);
            }
            throw new IndexOutOfBoundsException("end (" + i6 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        throw new IndexOutOfBoundsException("start (" + i5 + ") offset is outside of text region " + this.gapBuffer.getLength());
    }

    @l
    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }

    @l
    public String toString() {
        return this.gapBuffer.toString();
    }

    public final void replace$ui_text_release(int i5, int i6, @l String str) {
        if (i5 >= 0 && i5 <= this.gapBuffer.getLength()) {
            if (i6 < 0 || i6 > this.gapBuffer.getLength()) {
                throw new IndexOutOfBoundsException("end (" + i6 + ") offset is outside of text region " + this.gapBuffer.getLength());
            }
            if (i5 <= i6) {
                this.gapBuffer.replace(i5, i6, str);
                setSelectionStart(str.length() + i5);
                setSelectionEnd(i5 + str.length());
                this.compositionStart = -1;
                this.compositionEnd = -1;
                return;
            }
            throw new IllegalArgumentException("Do not set reversed range: " + i5 + " > " + i6);
        }
        throw new IndexOutOfBoundsException("start (" + i5 + ") offset is outside of text region " + this.gapBuffer.getLength());
    }

    private EditingBuffer(String str, long j5) {
        this(new AnnotatedString(str, null, null, 6, null), j5, (w) null);
    }
}
