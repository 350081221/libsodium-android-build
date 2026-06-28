package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "enabled", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/r2;", "onTap", "tapPressTextFieldModifier", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldPressGestureFilterKt {
    @l
    public static final Modifier tapPressTextFieldModifier(@l Modifier modifier, @m MutableInteractionSource mutableInteractionSource, boolean z4, @l v3.l<? super Offset, r2> lVar) {
        return z4 ? ComposedModifierKt.composed$default(modifier, null, new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(lVar, mutableInteractionSource), 1, null) : modifier;
    }

    public static /* synthetic */ Modifier tapPressTextFieldModifier$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z4, v3.l lVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        return tapPressTextFieldModifier(modifier, mutableInteractionSource, z4, lVar);
    }
}
