package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.text.e0;
import kotlin.text.k0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/input/PasswordVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "mask", "", "(C)V", "getMask", "()C", "equals", "", "other", "", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", TTDownloadField.TT_HASHCODE, "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PasswordVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final char mask;

    public PasswordVisualTransformation() {
        this((char) 0, 1, null);
    }

    public PasswordVisualTransformation(char c5) {
        this.mask = c5;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PasswordVisualTransformation) && this.mask == ((PasswordVisualTransformation) obj).mask) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    @l
    public TransformedText filter(@l AnnotatedString annotatedString) {
        String e22;
        e22 = e0.e2(String.valueOf(this.mask), annotatedString.getText().length());
        return new TransformedText(new AnnotatedString(e22, null, null, 6, null), OffsetMapping.Companion.getIdentity());
    }

    public final char getMask() {
        return this.mask;
    }

    public int hashCode() {
        return Character.hashCode(this.mask);
    }

    public /* synthetic */ PasswordVisualTransformation(char c5, int i5, w wVar) {
        this((i5 & 1) != 0 ? k0.E : c5);
    }
}
