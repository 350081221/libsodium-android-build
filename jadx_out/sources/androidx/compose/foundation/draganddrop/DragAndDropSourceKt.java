package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aU\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "Lkotlin/u;", "drawDragDecoration", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lkotlin/coroutines/d;", "", "block", "dragAndDropSource", "(Landroidx/compose/ui/Modifier;Lv3/l;Lv3/p;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DragAndDropSourceKt {
    @l
    @ExperimentalFoundationApi
    public static final Modifier dragAndDropSource(@l Modifier modifier, @l v3.l<? super DrawScope, r2> lVar, @l p<? super DragAndDropSourceScope, ? super d<? super r2>, ? extends Object> pVar) {
        return modifier.then(new DragAndDropSourceElement(lVar, pVar));
    }
}
