package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyGridState$Companion$Saver$1 extends n0 implements p<SaverScope, LazyGridState, List<? extends Integer>> {
    public static final LazyGridState$Companion$Saver$1 INSTANCE = new LazyGridState$Companion$Saver$1();

    LazyGridState$Companion$Saver$1() {
        super(2);
    }

    @Override // v3.p
    @l
    public final List<Integer> invoke(@l SaverScope saverScope, @l LazyGridState lazyGridState) {
        List<Integer> L;
        L = w.L(Integer.valueOf(lazyGridState.getFirstVisibleItemIndex()), Integer.valueOf(lazyGridState.getFirstVisibleItemScrollOffset()));
        return L;
    }
}
