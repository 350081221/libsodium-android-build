package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "Lkotlin/r2;", "Lkotlin/u;", "scope", "focusProperties", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusPropertiesKt {
    @l
    public static final Modifier focusProperties(@l Modifier modifier, @l v3.l<? super FocusProperties, r2> lVar) {
        return modifier.then(new FocusPropertiesElement(new FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0(lVar)));
    }
}
