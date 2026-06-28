package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\b\u001a\u00020\u0000*\u00020\u00002'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "block", "dragAndDropSource", "(Landroidx/compose/ui/Modifier;Lv3/p;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidDragAndDropSource_androidKt {
    @l
    @ExperimentalFoundationApi
    public static final Modifier dragAndDropSource(@l Modifier modifier, @l p<? super DragAndDropSourceScope, ? super d<? super r2>, ? extends Object> pVar) {
        return modifier.then(new DragAndDropSourceWithDefaultShadowElement(pVar));
    }
}
