package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0014\u0010\u0006\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "id", "alternateText", "Lkotlin/r2;", "appendInlineContent", "INLINE_CONTENT_TAG", "Ljava/lang/String;", "REPLACEMENT_CHAR", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InlineTextContentKt {

    @l
    public static final String INLINE_CONTENT_TAG = "androidx.compose.foundation.text.inlineContent";

    @l
    private static final String REPLACEMENT_CHAR = "�";

    public static final void appendInlineContent(@l AnnotatedString.Builder builder, @l String str, @l String str2) {
        boolean z4;
        if (str2.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            builder.pushStringAnnotation(INLINE_CONTENT_TAG, str);
            builder.append(str2);
            builder.pop();
            return;
        }
        throw new IllegalArgumentException("alternateText can't be an empty string.".toString());
    }

    public static /* synthetic */ void appendInlineContent$default(AnnotatedString.Builder builder, String str, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = REPLACEMENT_CHAR;
        }
        appendInlineContent(builder, str, str2);
    }
}
