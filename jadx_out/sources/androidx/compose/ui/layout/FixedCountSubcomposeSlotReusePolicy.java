package androidx.compose.ui.layout;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/layout/FixedCountSubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "slotIds", "Lkotlin/r2;", "getSlotsToRetain", "", "slotId", "reusableSlotId", "", "areCompatible", "", "maxSlotsToRetainForReuse", "I", "<init>", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FixedCountSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    private final int maxSlotsToRetainForReuse;

    public FixedCountSubcomposeSlotReusePolicy(int i5) {
        this.maxSlotsToRetainForReuse = i5;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(@m Object obj, @m Object obj2) {
        return true;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(@l SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        if (slotIdsSet.size() > this.maxSlotsToRetainForReuse) {
            Iterator<Object> it = slotIdsSet.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                it.next();
                i5++;
                if (i5 > this.maxSlotsToRetainForReuse) {
                    it.remove();
                }
            }
        }
    }
}
