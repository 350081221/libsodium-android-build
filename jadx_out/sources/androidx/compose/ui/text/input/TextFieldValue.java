package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fB)\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010 J0\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextRange;", "selection", "composition", "copy-3r_uNRQ", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "copy", "", "text", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "toString", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "J", "getSelection-d9O1mEE", "()J", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "getText", "()Ljava/lang/String;", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/w;)V", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/w;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class TextFieldValue {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(TextFieldValue$Companion$Saver$1.INSTANCE, TextFieldValue$Companion$Saver$2.INSTANCE);

    @l
    private final AnnotatedString annotatedString;

    @m
    private final TextRange composition;
    private final long selection;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }
    }

    private TextFieldValue(AnnotatedString annotatedString, long j5, TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m5551coerceIn8ffj60Q(j5, 0, getText().length());
        this.composition = textRange != null ? TextRange.m5533boximpl(TextRangeKt.m5551coerceIn8ffj60Q(textRange.m5549unboximpl(), 0, getText().length())) : null;
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j5, TextRange textRange, w wVar) {
        this(annotatedString, j5, textRange);
    }

    public /* synthetic */ TextFieldValue(String str, long j5, TextRange textRange, w wVar) {
        this(str, j5, textRange);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m5778copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j5, TextRange textRange, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i5 & 2) != 0) {
            j5 = textFieldValue.selection;
        }
        if ((i5 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m5780copy3r_uNRQ(annotatedString, j5, textRange);
    }

    @l
    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m5780copy3r_uNRQ(@l AnnotatedString annotatedString, long j5, @m TextRange textRange) {
        return new TextFieldValue(annotatedString, j5, textRange, (w) null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        if (TextRange.m5538equalsimpl0(this.selection, textFieldValue.selection) && l0.g(this.composition, textFieldValue.composition) && l0.g(this.annotatedString, textFieldValue.annotatedString)) {
            return true;
        }
        return false;
    }

    @l
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @m
    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m5782getCompositionMzsxiRA() {
        return this.composition;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m5783getSelectiond9O1mEE() {
        return this.selection;
    }

    @l
    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        int i5;
        int hashCode = ((this.annotatedString.hashCode() * 31) + TextRange.m5546hashCodeimpl(this.selection)) * 31;
        TextRange textRange = this.composition;
        if (textRange != null) {
            i5 = TextRange.m5546hashCodeimpl(textRange.m5549unboximpl());
        } else {
            i5 = 0;
        }
        return hashCode + i5;
    }

    @l
    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m5548toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    @l
    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m5781copy3r_uNRQ(@l String str, long j5, @m TextRange textRange) {
        w wVar = null;
        return new TextFieldValue(new AnnotatedString(str, null, null, 6, wVar), j5, textRange, wVar);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j5, TextRange textRange, int i5, w wVar) {
        this(annotatedString, (i5 & 2) != 0 ? TextRange.Companion.m5550getZerod9O1mEE() : j5, (i5 & 4) != 0 ? null : textRange, (w) null);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m5779copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j5, TextRange textRange, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = textFieldValue.selection;
        }
        if ((i5 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m5781copy3r_uNRQ(str, j5, textRange);
    }

    public /* synthetic */ TextFieldValue(String str, long j5, TextRange textRange, int i5, w wVar) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? TextRange.Companion.m5550getZerod9O1mEE() : j5, (i5 & 4) != 0 ? null : textRange, (w) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private TextFieldValue(java.lang.String r8, long r9, androidx.compose.ui.text.TextRange r11) {
        /*
            r7 = this;
            androidx.compose.ui.text.AnnotatedString r6 = new androidx.compose.ui.text.AnnotatedString
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r7
            r1 = r6
            r2 = r9
            r4 = r11
            r0.<init>(r1, r2, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.TextFieldValue.<init>(java.lang.String, long, androidx.compose.ui.text.TextRange):void");
    }
}
