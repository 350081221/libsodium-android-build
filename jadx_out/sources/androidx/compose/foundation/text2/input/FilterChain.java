package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.text.KeyboardOptions;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text2/input/FilterChain;", "Landroidx/compose/foundation/text2/input/InputTransformation;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "originalValue", "Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "valueWithChanges", "Lkotlin/r2;", "transformInput", "", "toString", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "first", "Landroidx/compose/foundation/text2/input/InputTransformation;", "second", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "<init>", "(Landroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/foundation/text2/input/InputTransformation;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FilterChain implements InputTransformation {

    @l
    private final InputTransformation first;

    @l
    private final InputTransformation second;

    public FilterChain(@l InputTransformation inputTransformation, @l InputTransformation inputTransformation2) {
        this.first = inputTransformation;
        this.second = inputTransformation2;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FilterChain.class != obj.getClass()) {
            return false;
        }
        FilterChain filterChain = (FilterChain) obj;
        if (l0.g(this.first, filterChain.first) && l0.g(this.second, filterChain.second) && l0.g(getKeyboardOptions(), filterChain.getKeyboardOptions())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    @m
    public KeyboardOptions getKeyboardOptions() {
        KeyboardOptions keyboardOptions = this.second.getKeyboardOptions();
        return keyboardOptions == null ? this.first.getKeyboardOptions() : keyboardOptions;
    }

    public int hashCode() {
        int i5;
        int hashCode = ((this.first.hashCode() * 31) + this.second.hashCode()) * 32;
        KeyboardOptions keyboardOptions = getKeyboardOptions();
        if (keyboardOptions != null) {
            i5 = keyboardOptions.hashCode();
        } else {
            i5 = 0;
        }
        return hashCode + i5;
    }

    @l
    public String toString() {
        return this.first + ".then(" + this.second + ')';
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public void transformInput(@l TextFieldCharSequence textFieldCharSequence, @l TextFieldBuffer textFieldBuffer) {
        this.first.transformInput(textFieldCharSequence, textFieldBuffer);
        this.second.transformInput(textFieldCharSequence, textFieldBuffer);
    }
}
