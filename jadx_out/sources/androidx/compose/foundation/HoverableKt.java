package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import kotlin.i0;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"hoverable", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HoverableKt {
    @p4.l
    public static final Modifier hoverable(@p4.l Modifier modifier, @p4.l MutableInteractionSource mutableInteractionSource, boolean z4) {
        return modifier.then(z4 ? new HoverableElement(mutableInteractionSource) : Modifier.Companion);
    }

    public static /* synthetic */ Modifier hoverable$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        return hoverable(modifier, mutableInteractionSource, z4);
    }
}
