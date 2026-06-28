package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text2.input.internal.ChangeTracker;
import androidx.compose.foundation.text2.input.internal.PartialGapBuffer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.swift.sandhook.annotation.MethodReflectParams;
import com.tendcloud.tenddata.cq;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import p4.l;
import p4.m;
import u3.h;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001]B'\b\u0000\u0012\u0006\u0010Y\u001a\u00020;\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010D\u0012\b\b\u0002\u0010?\u001a\u00020;¢\u0006\u0004\b[\u0010\\J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\"\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u001e\u0010 \u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eJ;\u0010 \u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u0003H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u001eH\u0000¢\u0006\u0004\b&\u0010'J\u0016\u0010)\u001a\u00060\u0001j\u0002`\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010)\u001a\u00060\u0001j\u0002`\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0016J\u0014\u0010)\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u000e\u0010,\u001a\u00020*2\u0006\u0010\n\u001a\u00020\u0003J\b\u0010.\u001a\u00020-H\u0016J\u0006\u0010/\u001a\u00020\u001eJ\u0006\u00100\u001a\u00020\u0007J\u000e\u00101\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003J\u000e\u00102\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003J\u000e\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003J\u000e\u00104\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003J\u0018\u00107\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0018\u00109\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b8\u00106J\u001e\u0010>\u001a\u00020;2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR*\u0010H\u001a\u00020\u00102\u0006\u0010G\u001a\u00020\u00108\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0011\u0010N\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010P\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bO\u0010MR\u0011\u0010T\u001a\u00020Q8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010U\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0017\u0010X\u001a\u00020\u00108Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bW\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "replaceStart", "replaceEnd", "newLength", "Lkotlin/r2;", "onTextWillChange", "clearChangeList", "index", "", "startExclusive", "endExclusive", "inCodepoints", "requireValidIndex", "Landroidx/compose/ui/text/TextRange;", "range", "requireValidRange-72CqOWE", "(JZ)V", "requireValidRange", "codepointsToChars-GEjPoXI", "(J)J", "codepointsToChars", "charsToCodepoints-GEjPoXI", "charsToCodepoints", "codepointIndexToCharIndex", "charIndexToCodepointIndex", "start", "end", "", "text", "replace", "textStart", "textEnd", "replace$foundation_release", "(IILjava/lang/CharSequence;II)V", "newText", "setTextIfChanged$foundation_release", "(Ljava/lang/CharSequence;)V", "setTextIfChanged", "append", "", MethodReflectParams.CHAR, "charAt", "", "toString", "asCharSequence", "revertAllChanges", "placeCursorBeforeCodepointAt", "placeCursorBeforeCharAt", "placeCursorAfterCodepointAt", "placeCursorAfterCharAt", "selectCodepointsIn-5zc-tL8", "(J)V", "selectCodepointsIn", "selectCharsIn-5zc-tL8", "selectCharsIn", "composition", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "toTextFieldCharSequence-OEnZFl4$foundation_release", "(Landroidx/compose/ui/text/TextRange;)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "toTextFieldCharSequence", "sourceValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "Landroidx/compose/foundation/text2/input/internal/PartialGapBuffer;", "buffer", "Landroidx/compose/foundation/text2/input/internal/PartialGapBuffer;", "Landroidx/compose/foundation/text2/input/internal/ChangeTracker;", "changeTracker", "Landroidx/compose/foundation/text2/input/internal/ChangeTracker;", "<set-?>", "selectionInChars", "J", "getSelectionInChars-d9O1mEE", "()J", "getLength", "()I", cq.a.LENGTH, "getCodepointLength", "codepointLength", "Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;", "getChanges", "()Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;", "changes", "hasSelection", "()Z", "getSelectionInCodepoints-d9O1mEE", "selectionInCodepoints", "initialValue", "initialChanges", "<init>", "(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/internal/ChangeTracker;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V", "ChangeList", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@r1({"SMAP\nTextFieldBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text2/input/TextFieldBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextFieldBuffer.kt\nandroidx/compose/foundation/text2/input/TextFieldBufferKt\n*L\n1#1,646:1\n1#2:647\n589#3,43:648\n*S KotlinDebug\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text2/input/TextFieldBuffer\n*L\n162#1:648,43\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldBuffer implements Appendable {
    public static final int $stable = 8;

    @l
    private final PartialGapBuffer buffer;

    @m
    private ChangeTracker changeTracker;
    private long selectionInChars;

    @l
    private final TextFieldCharSequence sourceValue;

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;", "", "changeCount", "", "getChangeCount", "()I", "getOriginalRange", "Landroidx/compose/ui/text/TextRange;", "changeIndex", "getOriginalRange--jx7JFs", "(I)J", "getRange", "getRange--jx7JFs", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ExperimentalFoundationApi
    /* loaded from: classes.dex */
    public interface ChangeList {
        int getChangeCount();

        /* renamed from: getOriginalRange--jx7JFs */
        long mo1064getOriginalRangejx7JFs(int i5);

        /* renamed from: getRange--jx7JFs */
        long mo1065getRangejx7JFs(int i5);
    }

    public TextFieldBuffer(@l TextFieldCharSequence textFieldCharSequence, @m ChangeTracker changeTracker, @l TextFieldCharSequence textFieldCharSequence2) {
        this.sourceValue = textFieldCharSequence2;
        this.buffer = new PartialGapBuffer(textFieldCharSequence);
        this.changeTracker = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        this.selectionInChars = textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE();
    }

    private final int charIndexToCodepointIndex(int i5) {
        return i5;
    }

    /* renamed from: charsToCodepoints-GEjPoXI, reason: not valid java name */
    private final long m1066charsToCodepointsGEjPoXI(long j5) {
        return TextRangeKt.TextRange(charIndexToCodepointIndex(TextRange.m5545getStartimpl(j5)), charIndexToCodepointIndex(TextRange.m5540getEndimpl(j5)));
    }

    private final void clearChangeList() {
        ChangeTracker changeTracker = this.changeTracker;
        if (changeTracker != null) {
            changeTracker.clearChanges();
        }
    }

    private final int codepointIndexToCharIndex(int i5) {
        return i5;
    }

    /* renamed from: codepointsToChars-GEjPoXI, reason: not valid java name */
    private final long m1067codepointsToCharsGEjPoXI(long j5) {
        return TextRangeKt.TextRange(codepointIndexToCharIndex(TextRange.m5545getStartimpl(j5)), codepointIndexToCharIndex(TextRange.m5540getEndimpl(j5)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r5 == r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onTextWillChange(int r4, int r5, int r6) {
        /*
            r3 = this;
            androidx.compose.foundation.text2.input.internal.ChangeTracker r0 = r3.changeTracker
            if (r0 != 0) goto Ld
            androidx.compose.foundation.text2.input.internal.ChangeTracker r0 = new androidx.compose.foundation.text2.input.internal.ChangeTracker
            r1 = 1
            r2 = 0
            r0.<init>(r2, r1, r2)
            r3.changeTracker = r0
        Ld:
            r0.trackChange(r4, r5, r6)
            int r0 = java.lang.Math.min(r4, r5)
            int r4 = java.lang.Math.max(r4, r5)
            long r1 = r3.selectionInChars
            int r5 = androidx.compose.ui.text.TextRange.m5543getMinimpl(r1)
            long r1 = r3.selectionInChars
            int r1 = androidx.compose.ui.text.TextRange.m5542getMaximpl(r1)
            if (r1 >= r0) goto L27
            return
        L27:
            if (r5 > r0) goto L30
            if (r4 > r1) goto L30
            int r4 = r4 - r0
            int r6 = r6 - r4
            if (r5 != r1) goto L3c
            goto L3b
        L30:
            if (r5 <= r0) goto L37
            if (r1 >= r4) goto L37
            int r0 = r0 + r6
            r5 = r0
            goto L46
        L37:
            if (r5 < r4) goto L3f
            int r4 = r4 - r0
            int r6 = r6 - r4
        L3b:
            int r5 = r5 + r6
        L3c:
            int r0 = r1 + r6
            goto L46
        L3f:
            if (r0 >= r5) goto L46
            int r5 = r0 + r6
            int r4 = r4 - r0
            int r6 = r6 - r4
            goto L3c
        L46:
            long r4 = androidx.compose.ui.text.TextRangeKt.TextRange(r5, r0)
            r3.selectionInChars = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.TextFieldBuffer.onTextWillChange(int, int, int):void");
    }

    public static /* synthetic */ void replace$foundation_release$default(TextFieldBuffer textFieldBuffer, int i5, int i6, CharSequence charSequence, int i7, int i8, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            i7 = 0;
        }
        int i10 = i7;
        if ((i9 & 16) != 0) {
            i8 = charSequence.length();
        }
        textFieldBuffer.replace$foundation_release(i5, i6, charSequence, i10, i8);
    }

    private final void requireValidIndex(int i5, boolean z4, boolean z5, boolean z6) {
        int i6;
        int length;
        String str;
        boolean z7 = false;
        if (z4) {
            i6 = 0;
        } else {
            i6 = -1;
        }
        if (z5) {
            length = getLength();
        } else {
            length = getLength() + 1;
        }
        if (z6) {
            i6 = charIndexToCodepointIndex(i6);
            length = charIndexToCodepointIndex(length);
        }
        if (i6 <= i5 && i5 < length) {
            z7 = true;
        }
        if (!z7) {
            if (z6) {
                str = "codepoints";
            } else {
                str = "chars";
            }
            throw new IllegalArgumentException(("Expected " + i5 + " to be in [" + i6 + ", " + length + ") " + str).toString());
        }
    }

    /* renamed from: requireValidRange-72CqOWE, reason: not valid java name */
    private final void m1068requireValidRange72CqOWE(long j5, boolean z4) {
        String str;
        long TextRange = TextRangeKt.TextRange(0, getLength());
        if (z4) {
            TextRange = m1066charsToCodepointsGEjPoXI(TextRange);
        }
        if (!TextRange.m5535contains5zctL8(TextRange, j5)) {
            if (z4) {
                str = "codepoints";
            } else {
                str = "chars";
            }
            throw new IllegalArgumentException(("Expected " + ((Object) TextRange.m5548toStringimpl(j5)) + " to be in " + ((Object) TextRange.m5548toStringimpl(TextRange)) + " (" + str + ')').toString());
        }
    }

    /* renamed from: toTextFieldCharSequence-OEnZFl4$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ TextFieldCharSequence m1069toTextFieldCharSequenceOEnZFl4$foundation_release$default(TextFieldBuffer textFieldBuffer, TextRange textRange, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            textRange = null;
        }
        return textFieldBuffer.m1074toTextFieldCharSequenceOEnZFl4$foundation_release(textRange);
    }

    @Override // java.lang.Appendable
    @l
    public Appendable append(@m CharSequence charSequence) {
        if (charSequence != null) {
            onTextWillChange(getLength(), getLength(), charSequence.length());
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), charSequence, 0, 0, 24, null);
        }
        return this;
    }

    @l
    public final CharSequence asCharSequence() {
        return this.buffer;
    }

    public final char charAt(int i5) {
        return this.buffer.charAt(i5);
    }

    @l
    public final ChangeList getChanges() {
        ChangeTracker changeTracker = this.changeTracker;
        return changeTracker != null ? changeTracker : EmptyChangeList.INSTANCE;
    }

    public final int getCodepointLength() {
        return Character.codePointCount(this.buffer, 0, getLength());
    }

    public final int getLength() {
        return this.buffer.length();
    }

    /* renamed from: getSelectionInChars-d9O1mEE, reason: not valid java name */
    public final long m1070getSelectionInCharsd9O1mEE() {
        return this.selectionInChars;
    }

    /* renamed from: getSelectionInCodepoints-d9O1mEE, reason: not valid java name */
    public final long m1071getSelectionInCodepointsd9O1mEE() {
        return m1066charsToCodepointsGEjPoXI(this.selectionInChars);
    }

    @h(name = "hasSelection")
    public final boolean hasSelection() {
        return !TextRange.m5539getCollapsedimpl(this.selectionInChars);
    }

    public final void placeCursorAfterCharAt(int i5) {
        int B;
        requireValidIndex(i5, false, true, false);
        B = u.B(i5 + 1, getLength());
        this.selectionInChars = TextRangeKt.TextRange(B);
    }

    public final void placeCursorAfterCodepointAt(int i5) {
        int B;
        requireValidIndex(i5, false, true, true);
        B = u.B(i5 + 1, getCodepointLength());
        this.selectionInChars = TextRangeKt.TextRange(codepointIndexToCharIndex(B));
    }

    public final void placeCursorBeforeCharAt(int i5) {
        requireValidIndex(i5, true, false, false);
        this.selectionInChars = TextRangeKt.TextRange(i5);
    }

    public final void placeCursorBeforeCodepointAt(int i5) {
        requireValidIndex(i5, true, false, true);
        this.selectionInChars = TextRangeKt.TextRange(codepointIndexToCharIndex(i5));
    }

    public final void replace(int i5, int i6, @l CharSequence charSequence) {
        replace$foundation_release(i5, i6, charSequence, 0, charSequence.length());
    }

    public final void replace$foundation_release(int i5, int i6, @l CharSequence charSequence, int i7, int i8) {
        boolean z4;
        boolean z5 = true;
        if (i5 <= i6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i7 > i8) {
                z5 = false;
            }
            if (z5) {
                onTextWillChange(i5, i6, i8 - i7);
                this.buffer.replace(i5, i6, charSequence, i7, i8);
                return;
            }
            throw new IllegalArgumentException(("Expected textStart=" + i7 + " <= textEnd=" + i8).toString());
        }
        throw new IllegalArgumentException(("Expected start=" + i5 + " <= end=" + i6).toString());
    }

    public final void revertAllChanges() {
        replace(0, getLength(), this.sourceValue.toString());
        this.selectionInChars = this.sourceValue.mo1076getSelectionInCharsd9O1mEE();
        clearChangeList();
    }

    /* renamed from: selectCharsIn-5zc-tL8, reason: not valid java name */
    public final void m1072selectCharsIn5zctL8(long j5) {
        m1068requireValidRange72CqOWE(j5, false);
        this.selectionInChars = j5;
    }

    /* renamed from: selectCodepointsIn-5zc-tL8, reason: not valid java name */
    public final void m1073selectCodepointsIn5zctL8(long j5) {
        m1068requireValidRange72CqOWE(j5, true);
        this.selectionInChars = m1067codepointsToCharsGEjPoXI(j5);
    }

    public final void setTextIfChanged$foundation_release(@l CharSequence charSequence) {
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z5;
        PartialGapBuffer partialGapBuffer = this.buffer;
        int length = partialGapBuffer.length();
        int length2 = charSequence.length();
        boolean z6 = false;
        if (partialGapBuffer.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (charSequence.length() > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                int i9 = 0;
                int i10 = 0;
                boolean z7 = false;
                while (true) {
                    if (!z6) {
                        if (partialGapBuffer.charAt(i9) == charSequence.charAt(i10)) {
                            i9++;
                            i10++;
                        } else {
                            z6 = true;
                        }
                    }
                    if (!z7) {
                        if (partialGapBuffer.charAt(length - 1) == charSequence.charAt(length2 - 1)) {
                            length--;
                            length2--;
                        } else {
                            z7 = true;
                        }
                    }
                    if (i9 >= length || i10 >= length2 || (z6 && z7)) {
                        break;
                    }
                }
                i5 = length;
                i6 = length2;
                i7 = i9;
                i8 = i10;
                if (i7 >= i5 || i8 < i6) {
                    replace$foundation_release(i7, i5, charSequence, i8, i6);
                }
                return;
            }
        }
        i5 = length;
        i6 = length2;
        i7 = 0;
        i8 = 0;
        if (i7 >= i5) {
        }
        replace$foundation_release(i7, i5, charSequence, i8, i6);
    }

    @l
    public String toString() {
        return this.buffer.toString();
    }

    @l
    /* renamed from: toTextFieldCharSequence-OEnZFl4$foundation_release, reason: not valid java name */
    public final TextFieldCharSequence m1074toTextFieldCharSequenceOEnZFl4$foundation_release(@m TextRange textRange) {
        return TextFieldCharSequenceKt.m1077TextFieldCharSequence3r_uNRQ(this.buffer.toString(), this.selectionInChars, textRange);
    }

    @Override // java.lang.Appendable
    @l
    public Appendable append(@m CharSequence charSequence, int i5, int i6) {
        if (charSequence != null) {
            onTextWillChange(getLength(), getLength(), i6 - i5);
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), charSequence.subSequence(i5, i6), 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    @l
    public Appendable append(char c5) {
        onTextWillChange(getLength(), getLength(), 1);
        PartialGapBuffer partialGapBuffer = this.buffer;
        PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), String.valueOf(c5), 0, 0, 24, null);
        return this;
    }

    public /* synthetic */ TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, int i5, w wVar) {
        this(textFieldCharSequence, (i5 & 2) != 0 ? null : changeTracker, (i5 & 4) != 0 ? textFieldCharSequence : textFieldCharSequence2);
    }
}
