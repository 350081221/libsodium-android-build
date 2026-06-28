package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.b1;
import kotlin.i0;
import kotlin.k;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusOrder;", "Lkotlin/r2;", "Lkotlin/u;", "focusOrderReceiver", "focusOrder", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusOrderModifierKt {
    @l
    @k(message = "Use focusProperties() instead", replaceWith = @b1(expression = "this.focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties"}))
    public static final Modifier focusOrder(@l Modifier modifier, @l v3.l<? super FocusOrder, r2> lVar) {
        return FocusPropertiesKt.focusProperties(modifier, new FocusOrderModifierKt$focusOrder$1(new FocusOrderToProperties(lVar)));
    }

    @l
    @k(message = "Use focusRequester() instead", replaceWith = @b1(expression = "this.focusRequester(focusRequester)", imports = {"androidx.compose.ui.focus.focusRequester"}))
    public static final Modifier focusOrder(@l Modifier modifier, @l FocusRequester focusRequester) {
        return FocusRequesterModifierKt.focusRequester(modifier, focusRequester);
    }

    @l
    @k(message = "Use focusProperties() and focusRequester() instead", replaceWith = @b1(expression = "this.focusRequester(focusRequester).focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties, androidx.compose.ui.focus.focusRequester"}))
    public static final Modifier focusOrder(@l Modifier modifier, @l FocusRequester focusRequester, @l v3.l<? super FocusOrder, r2> lVar) {
        return FocusPropertiesKt.focusProperties(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), new FocusOrderModifierKt$focusOrder$2(new FocusOrderToProperties(lVar)));
    }
}
