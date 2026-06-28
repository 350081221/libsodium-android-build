package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text2.input.CodepointTransformation;
import androidx.compose.foundation.text2.input.internal.CodepointHelpers_jvmKt;
import androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator;
import androidx.compose.runtime.Stable;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, d2 = {"mask", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "Landroidx/compose/foundation/text2/input/CodepointTransformation$Companion;", "character", "", "toVisualText", "", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "codepointTransformation", "offsetMappingCalculator", "Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CodepointTransformationKt {
    @Stable
    @l
    @ExperimentalFoundationApi
    public static final CodepointTransformation mask(@l CodepointTransformation.Companion companion, char c5) {
        return new MaskCodepointTransformation(c5);
    }

    @l
    public static final CharSequence toVisualText(@l TextFieldCharSequence textFieldCharSequence, @l CodepointTransformation codepointTransformation, @l OffsetMappingCalculator offsetMappingCalculator) {
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        boolean z4 = false;
        int i6 = 0;
        while (i5 < textFieldCharSequence.length()) {
            int codePointAt = CodepointHelpers_jvmKt.codePointAt(textFieldCharSequence, i5);
            int transform = codepointTransformation.transform(i6, codePointAt);
            int charCount = CodepointHelpers_jvmKt.charCount(codePointAt);
            if (transform != codePointAt) {
                offsetMappingCalculator.recordEditOperation(sb.length(), sb.length() + charCount, CodepointHelpers_jvmKt.charCount(transform));
                z4 = true;
            }
            StringHelpers_jvmKt.appendCodePointX(sb, transform);
            i5 += charCount;
            i6++;
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        if (z4) {
            return sb2;
        }
        return textFieldCharSequence;
    }
}
