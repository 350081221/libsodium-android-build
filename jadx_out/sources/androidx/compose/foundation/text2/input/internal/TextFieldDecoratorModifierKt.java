package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0003"}, d2 = {"withDefaultsFrom", "Landroidx/compose/foundation/text/KeyboardOptions;", "defaults", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierKt {
    @l
    public static final KeyboardOptions withDefaultsFrom(@l KeyboardOptions keyboardOptions, @m KeyboardOptions keyboardOptions2) {
        int m858getCapitalizationIUNYP9k;
        boolean z4;
        int m860getKeyboardTypePjHm6EE;
        int m859getImeActioneUduSuo;
        if (keyboardOptions2 == null) {
            return keyboardOptions;
        }
        if (!KeyboardCapitalization.m5741equalsimpl0(keyboardOptions.m858getCapitalizationIUNYP9k(), KeyboardCapitalization.Companion.m5750getNoneIUNYP9k())) {
            m858getCapitalizationIUNYP9k = keyboardOptions.m858getCapitalizationIUNYP9k();
        } else {
            m858getCapitalizationIUNYP9k = keyboardOptions2.m858getCapitalizationIUNYP9k();
        }
        int i5 = m858getCapitalizationIUNYP9k;
        if (keyboardOptions.getAutoCorrect() && keyboardOptions2.getAutoCorrect()) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z5 = z4;
        if (!KeyboardType.m5756equalsimpl0(keyboardOptions.m860getKeyboardTypePjHm6EE(), KeyboardType.Companion.m5776getTextPjHm6EE())) {
            m860getKeyboardTypePjHm6EE = keyboardOptions.m860getKeyboardTypePjHm6EE();
        } else {
            m860getKeyboardTypePjHm6EE = keyboardOptions2.m860getKeyboardTypePjHm6EE();
        }
        int i6 = m860getKeyboardTypePjHm6EE;
        if (!ImeAction.m5709equalsimpl0(keyboardOptions.m859getImeActioneUduSuo(), ImeAction.Companion.m5721getDefaulteUduSuo())) {
            m859getImeActioneUduSuo = keyboardOptions.m859getImeActioneUduSuo();
        } else {
            m859getImeActioneUduSuo = keyboardOptions2.m859getImeActioneUduSuo();
        }
        return new KeyboardOptions(i5, z5, i6, m859getImeActioneUduSuo, null, 16, null);
    }
}
