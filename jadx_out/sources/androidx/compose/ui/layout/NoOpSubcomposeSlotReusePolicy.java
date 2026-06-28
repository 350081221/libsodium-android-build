package androidx.compose.ui.layout;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/NoOpSubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "slotIds", "Lkotlin/r2;", "getSlotsToRetain", "", "slotId", "reusableSlotId", "", "areCompatible", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NoOpSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {

    @l
    public static final NoOpSubcomposeSlotReusePolicy INSTANCE = new NoOpSubcomposeSlotReusePolicy();

    private NoOpSubcomposeSlotReusePolicy() {
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(@m Object obj, @m Object obj2) {
        return false;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(@l SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        slotIdsSet.clear();
    }
}
