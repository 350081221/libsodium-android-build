package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "slotIds", "Lkotlin/r2;", "getSlotsToRetain", "", "slotId", "reusableSlotId", "", "areCompatible", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "factory", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", "", "countPerType", "Ljava/util/Map;", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class LazyLayoutItemReusePolicy implements SubcomposeSlotReusePolicy {

    @l
    private final Map<Object, Integer> countPerType = new LinkedHashMap();

    @l
    private final LazyLayoutItemContentFactory factory;

    public LazyLayoutItemReusePolicy(@l LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        this.factory = lazyLayoutItemContentFactory;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(@m Object obj, @m Object obj2) {
        return l0.g(this.factory.getContentType(obj), this.factory.getContentType(obj2));
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(@l SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        int i5;
        this.countPerType.clear();
        Iterator<Object> it = slotIdsSet.iterator();
        while (it.hasNext()) {
            Object contentType = this.factory.getContentType(it.next());
            Integer num = this.countPerType.get(contentType);
            if (num != null) {
                i5 = num.intValue();
            } else {
                i5 = 0;
            }
            if (i5 == 7) {
                it.remove();
            } else {
                this.countPerType.put(contentType, Integer.valueOf(i5 + 1));
            }
        }
    }
}
