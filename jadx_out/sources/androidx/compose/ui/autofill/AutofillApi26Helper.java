package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J%\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi26Helper;", "", "Landroid/view/ViewStructure;", "structure", "Landroid/view/autofill/AutofillId;", "parent", "", "virtualId", "Lkotlin/r2;", "setAutofillId", "getAutofillId", "type", "setAutofillType", "", "", "hints", "setAutofillHints", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "Landroid/view/autofill/AutofillValue;", b.f22420d, "", "isText", "isDate", "isList", "isToggle", "", "textValue", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(26)
/* loaded from: classes.dex */
public final class AutofillApi26Helper {
    public static final int $stable = 0;

    @l
    public static final AutofillApi26Helper INSTANCE = new AutofillApi26Helper();

    private AutofillApi26Helper() {
    }

    @DoNotInline
    @RequiresApi(26)
    @m
    public final AutofillId getAutofillId(@l ViewStructure viewStructure) {
        AutofillId autofillId;
        autofillId = viewStructure.getAutofillId();
        return autofillId;
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isDate(@l AutofillValue autofillValue) {
        boolean isDate;
        isDate = autofillValue.isDate();
        return isDate;
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isList(@l AutofillValue autofillValue) {
        boolean isList;
        isList = autofillValue.isList();
        return isList;
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isText(@l AutofillValue autofillValue) {
        boolean isText;
        isText = autofillValue.isText();
        return isText;
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isToggle(@l AutofillValue autofillValue) {
        boolean isToggle;
        isToggle = autofillValue.isToggle();
        return isToggle;
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAutofillHints(@l ViewStructure viewStructure, @l String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAutofillId(@l ViewStructure viewStructure, @l AutofillId autofillId, int i5) {
        viewStructure.setAutofillId(autofillId, i5);
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAutofillType(@l ViewStructure viewStructure, int i5) {
        viewStructure.setAutofillType(i5);
    }

    @l
    @DoNotInline
    @RequiresApi(26)
    public final CharSequence textValue(@l AutofillValue autofillValue) {
        CharSequence textValue;
        textValue = autofillValue.getTextValue();
        return textValue;
    }
}
