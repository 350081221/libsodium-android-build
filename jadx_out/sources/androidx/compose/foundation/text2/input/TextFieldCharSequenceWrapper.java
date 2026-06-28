package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.text2.input.internal.ToCharArray_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.tendcloud.tenddata.cq;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.e0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010'\u001a\u00020\u001b\u0012\b\u0010(\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b)\u0010*J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0016J&\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J\u0013\u0010\u0017\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldCharSequenceWrapper;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "", "index", "", "get", "startIndex", "endIndex", "", "subSequence", "", "toString", "other", "", "contentEquals", "", "destination", "destinationOffset", "sourceStartIndex", "sourceEndIndex", "Lkotlin/r2;", "toCharArray", "", "equals", TTDownloadField.TT_HASHCODE, "text", "Ljava/lang/CharSequence;", "Landroidx/compose/ui/text/TextRange;", "selectionInChars", "J", "getSelectionInChars-d9O1mEE", "()J", "compositionInChars", "Landroidx/compose/ui/text/TextRange;", "getCompositionInChars-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "getLength", "()I", cq.a.LENGTH, "selection", "composition", "<init>", "(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldCharSequenceWrapper implements TextFieldCharSequence {

    @m
    private final TextRange compositionInChars;
    private final long selectionInChars;

    @l
    private final CharSequence text;

    private TextFieldCharSequenceWrapper(CharSequence charSequence, long j5, TextRange textRange) {
        TextRange textRange2;
        this.text = charSequence;
        this.selectionInChars = TextRangeKt.m5551coerceIn8ffj60Q(j5, 0, charSequence.length());
        if (textRange != null) {
            textRange2 = TextRange.m5533boximpl(TextRangeKt.m5551coerceIn8ffj60Q(textRange.m5549unboximpl(), 0, charSequence.length()));
        } else {
            textRange2 = null;
        }
        this.compositionInChars = textRange2;
    }

    public /* synthetic */ TextFieldCharSequenceWrapper(CharSequence charSequence, long j5, TextRange textRange, w wVar) {
        this(charSequence, j5, textRange);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i5) {
        return get(i5);
    }

    @Override // androidx.compose.foundation.text2.input.TextFieldCharSequence
    public boolean contentEquals(@l CharSequence charSequence) {
        boolean w12;
        w12 = e0.w1(this.text, charSequence);
        return w12;
    }

    @Override // androidx.compose.foundation.text2.input.TextFieldCharSequence
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldCharSequenceWrapper.class != obj.getClass()) {
            return false;
        }
        TextFieldCharSequenceWrapper textFieldCharSequenceWrapper = (TextFieldCharSequenceWrapper) obj;
        if (TextRange.m5538equalsimpl0(mo1076getSelectionInCharsd9O1mEE(), textFieldCharSequenceWrapper.mo1076getSelectionInCharsd9O1mEE()) && l0.g(mo1075getCompositionInCharsMzsxiRA(), textFieldCharSequenceWrapper.mo1075getCompositionInCharsMzsxiRA()) && contentEquals(textFieldCharSequenceWrapper.text)) {
            return true;
        }
        return false;
    }

    public char get(int i5) {
        return this.text.charAt(i5);
    }

    @Override // androidx.compose.foundation.text2.input.TextFieldCharSequence
    @m
    /* renamed from: getCompositionInChars-MzsxiRA */
    public TextRange mo1075getCompositionInCharsMzsxiRA() {
        return this.compositionInChars;
    }

    public int getLength() {
        return this.text.length();
    }

    @Override // androidx.compose.foundation.text2.input.TextFieldCharSequence
    /* renamed from: getSelectionInChars-d9O1mEE */
    public long mo1076getSelectionInCharsd9O1mEE() {
        return this.selectionInChars;
    }

    @Override // androidx.compose.foundation.text2.input.TextFieldCharSequence
    public int hashCode() {
        int i5;
        int hashCode = ((this.text.hashCode() * 31) + TextRange.m5546hashCodeimpl(mo1076getSelectionInCharsd9O1mEE())) * 31;
        TextRange mo1075getCompositionInCharsMzsxiRA = mo1075getCompositionInCharsMzsxiRA();
        if (mo1075getCompositionInCharsMzsxiRA != null) {
            i5 = TextRange.m5546hashCodeimpl(mo1075getCompositionInCharsMzsxiRA.m5549unboximpl());
        } else {
            i5 = 0;
        }
        return hashCode + i5;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    @Override // java.lang.CharSequence
    @l
    public CharSequence subSequence(int i5, int i6) {
        return this.text.subSequence(i5, i6);
    }

    public final void toCharArray(@l char[] cArr, int i5, int i6, int i7) {
        ToCharArray_androidKt.toCharArray(this.text, cArr, i5, i6, i7);
    }

    @Override // androidx.compose.foundation.text2.input.TextFieldCharSequence, java.lang.CharSequence
    @l
    public String toString() {
        return this.text.toString();
    }
}
