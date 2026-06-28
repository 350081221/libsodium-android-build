package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a8\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text2/input/TextFieldState;", "state", "Landroidx/compose/ui/text/input/TextFieldValue;", t0.b.f22420d, "Lkotlin/Function1;", "Lkotlin/r2;", "onValueChanged", "", "writeSelectionFromTextFieldValue", "syncTextFieldState", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class StateSyncingModifierKt {
    @l
    public static final Modifier syncTextFieldState(@l Modifier modifier, @l TextFieldState textFieldState, @l TextFieldValue textFieldValue, @l v3.l<? super TextFieldValue, r2> lVar, boolean z4) {
        return modifier.then(new StateSyncingModifier(textFieldState, textFieldValue, lVar, z4));
    }
}
