package androidx.compose.foundation.text2.input;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B?\u00126\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J9\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JC\u0010\u0012\u001a\u00020\u000028\b\u0002\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003RG\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text2/input/InputTransformationByValue;", "Landroidx/compose/foundation/text2/input/InputTransformation;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "originalValue", "Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "valueWithChanges", "Lkotlin/r2;", "transformInput", "", "toString", "Lkotlin/Function2;", "", "Lkotlin/v0;", "name", "old", "proposed", "component1", "transformation", "copy", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Lv3/p;", "getTransformation", "()Lv3/p;", "<init>", "(Lv3/p;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class InputTransformationByValue implements InputTransformation {

    @l
    private final p<CharSequence, CharSequence, CharSequence> transformation;

    /* JADX WARN: Multi-variable type inference failed */
    public InputTransformationByValue(@l p<? super CharSequence, ? super CharSequence, ? extends CharSequence> pVar) {
        this.transformation = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputTransformationByValue copy$default(InputTransformationByValue inputTransformationByValue, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            pVar = inputTransformationByValue.transformation;
        }
        return inputTransformationByValue.copy(pVar);
    }

    @l
    public final p<CharSequence, CharSequence, CharSequence> component1() {
        return this.transformation;
    }

    @l
    public final InputTransformationByValue copy(@l p<? super CharSequence, ? super CharSequence, ? extends CharSequence> pVar) {
        return new InputTransformationByValue(pVar);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InputTransformationByValue) && l0.g(this.transformation, ((InputTransformationByValue) obj).transformation);
    }

    @l
    public final p<CharSequence, CharSequence, CharSequence> getTransformation() {
        return this.transformation;
    }

    public int hashCode() {
        return this.transformation.hashCode();
    }

    @l
    public String toString() {
        return "InputTransformation.byValue(transformation=" + this.transformation + ')';
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public void transformInput(@l TextFieldCharSequence textFieldCharSequence, @l TextFieldBuffer textFieldBuffer) {
        TextFieldCharSequence m1069toTextFieldCharSequenceOEnZFl4$foundation_release$default = TextFieldBuffer.m1069toTextFieldCharSequenceOEnZFl4$foundation_release$default(textFieldBuffer, null, 1, null);
        CharSequence invoke = this.transformation.invoke(textFieldCharSequence, m1069toTextFieldCharSequenceOEnZFl4$foundation_release$default);
        if (invoke == m1069toTextFieldCharSequenceOEnZFl4$foundation_release$default) {
            return;
        }
        if (invoke == textFieldCharSequence) {
            textFieldBuffer.revertAllChanges();
        } else {
            textFieldBuffer.setTextIfChanged$foundation_release(invoke);
        }
    }
}
