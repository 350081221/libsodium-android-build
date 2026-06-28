package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0081\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\b2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0081\b¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "ContextMenuArea", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/selection/SelectionManager;", "(Landroidx/compose/foundation/text/selection/SelectionManager;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ContextMenu_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ContextMenuArea(@l TextFieldSelectionManager textFieldSelectionManager, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1985516685);
        pVar.invoke(composer, Integer.valueOf((i5 >> 3) & 14));
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ContextMenuArea(@l SelectionManager selectionManager, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(605522716);
        pVar.invoke(composer, Integer.valueOf((i5 >> 3) & 14));
        composer.endReplaceableGroup();
    }
}
