package androidx.compose.foundation.text;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "Lkotlin/r2;", "onFocusChanged", "textFieldFocusModifier", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldGestureModifiersKt {
    @l
    public static final Modifier textFieldFocusModifier(@l Modifier modifier, boolean z4, @l FocusRequester focusRequester, @m MutableInteractionSource mutableInteractionSource, @l v3.l<? super FocusState, r2> lVar) {
        return FocusableKt.focusable(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), lVar), z4, mutableInteractionSource);
    }
}
