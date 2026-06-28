package androidx.compose.ui.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1 extends n0 implements l<Map.Entry<Object, SubcomposeLayoutState.PrecomposedSlotHandle>, Boolean> {
    final /* synthetic */ LayoutNodeSubcompositionsState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        super(1);
        this.this$0 = layoutNodeSubcompositionsState;
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l Map.Entry<Object, SubcomposeLayoutState.PrecomposedSlotHandle> entry) {
        MutableVector mutableVector;
        boolean z4;
        int i5;
        Object key = entry.getKey();
        SubcomposeLayoutState.PrecomposedSlotHandle value = entry.getValue();
        mutableVector = this.this$0.postLookaheadComposedSlotIds;
        int indexOf = mutableVector.indexOf(key);
        if (indexOf >= 0) {
            i5 = this.this$0.currentPostLookaheadIndex;
            if (indexOf < i5) {
                z4 = false;
                return Boolean.valueOf(z4);
            }
        }
        value.dispose();
        z4 = true;
        return Boolean.valueOf(z4);
    }
}
