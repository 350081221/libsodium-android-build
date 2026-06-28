package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text2.input.TextFieldBuffer;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.intl.Locale;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text2/input/AllCapsTransformation;", "Landroidx/compose/foundation/text2/input/InputTransformation;", "Landroidx/compose/ui/text/intl/Locale;", "component1", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "originalValue", "Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "valueWithChanges", "Lkotlin/r2;", "transformInput", "", "toString", "locale", "copy", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/ui/text/intl/Locale;", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "<init>", "(Landroidx/compose/ui/text/intl/Locale;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAllCapsTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCapsTransformation.kt\nandroidx/compose/foundation/text2/input/AllCapsTransformation\n+ 2 TextFieldBuffer.kt\nandroidx/compose/foundation/text2/input/TextFieldBufferKt\n*L\n1#1,64:1\n545#2,7:65\n*S KotlinDebug\n*F\n+ 1 AllCapsTransformation.kt\nandroidx/compose/foundation/text2/input/AllCapsTransformation\n*L\n51#1:65,7\n*E\n"})
/* loaded from: classes.dex */
final class AllCapsTransformation implements InputTransformation {

    @l
    private final KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.Companion.m5749getCharactersIUNYP9k(), false, 0, 0, null, 30, null);

    @l
    private final Locale locale;

    public AllCapsTransformation(@l Locale locale) {
        this.locale = locale;
    }

    private final Locale component1() {
        return this.locale;
    }

    public static /* synthetic */ AllCapsTransformation copy$default(AllCapsTransformation allCapsTransformation, Locale locale, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            locale = allCapsTransformation.locale;
        }
        return allCapsTransformation.copy(locale);
    }

    @l
    public final AllCapsTransformation copy(@l Locale locale) {
        return new AllCapsTransformation(locale);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllCapsTransformation) && l0.g(this.locale, ((AllCapsTransformation) obj).locale);
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    @l
    public KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public int hashCode() {
        return this.locale.hashCode();
    }

    @l
    public String toString() {
        return "InputTransformation.allCaps(locale=" + this.locale + ')';
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public void transformInput(@l TextFieldCharSequence textFieldCharSequence, @l TextFieldBuffer textFieldBuffer) {
        TextFieldBuffer.ChangeList changes = textFieldBuffer.getChanges();
        for (int i5 = 0; i5 < changes.getChangeCount(); i5++) {
            long mo1065getRangejx7JFs = changes.mo1065getRangejx7JFs(i5);
            changes.mo1064getOriginalRangejx7JFs(i5);
            if (!TextRange.m5539getCollapsedimpl(mo1065getRangejx7JFs)) {
                textFieldBuffer.replace(TextRange.m5543getMinimpl(mo1065getRangejx7JFs), TextRange.m5542getMaximpl(mo1065getRangejx7JFs), StringKt.toUpperCase(TextRangeKt.m5552substringFDrldGo(textFieldBuffer.asCharSequence(), mo1065getRangejx7JFs), this.locale));
            }
        }
    }
}
