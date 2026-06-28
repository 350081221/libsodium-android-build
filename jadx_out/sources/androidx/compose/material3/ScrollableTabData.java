package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J,\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/ScrollableTabData;", "", "Landroidx/compose/material3/TabPosition;", "Landroidx/compose/ui/unit/Density;", "density", "", "edgeOffset", "", "tabPositions", "calculateTabOffset", "selectedTab", "Lkotlin/r2;", "onLaidOut", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "Lkotlinx/coroutines/s0;", "coroutineScope", "Lkotlinx/coroutines/s0;", "Ljava/lang/Integer;", "<init>", "(Landroidx/compose/foundation/ScrollState;Lkotlinx/coroutines/s0;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollableTabData {

    @p4.l
    private final s0 coroutineScope;

    @p4.l
    private final ScrollState scrollState;

    @p4.m
    private Integer selectedTab;

    public ScrollableTabData(@p4.l ScrollState scrollState, @p4.l s0 s0Var) {
        this.scrollState = scrollState;
        this.coroutineScope = s0Var;
    }

    private final int calculateTabOffset(TabPosition tabPosition, Density density, int i5, List<TabPosition> list) {
        Object m32;
        int u4;
        int I;
        m32 = kotlin.collections.e0.m3(list);
        int mo298roundToPx0680j_4 = density.mo298roundToPx0680j_4(((TabPosition) m32).m2347getRightD9Ej5fM()) + i5;
        int maxValue = mo298roundToPx0680j_4 - this.scrollState.getMaxValue();
        int mo298roundToPx0680j_42 = density.mo298roundToPx0680j_4(tabPosition.m2346getLeftD9Ej5fM()) - ((maxValue / 2) - (density.mo298roundToPx0680j_4(tabPosition.m2348getWidthD9Ej5fM()) / 2));
        u4 = kotlin.ranges.u.u(mo298roundToPx0680j_4 - maxValue, 0);
        I = kotlin.ranges.u.I(mo298roundToPx0680j_42, 0, u4);
        return I;
    }

    public final void onLaidOut(@p4.l Density density, int i5, @p4.l List<TabPosition> list, int i6) {
        Object T2;
        int calculateTabOffset;
        Integer num = this.selectedTab;
        if (num == null || num.intValue() != i6) {
            this.selectedTab = Integer.valueOf(i6);
            T2 = kotlin.collections.e0.T2(list, i6);
            TabPosition tabPosition = (TabPosition) T2;
            if (tabPosition != null && this.scrollState.getValue() != (calculateTabOffset = calculateTabOffset(tabPosition, density, i5, list))) {
                kotlinx.coroutines.k.f(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, calculateTabOffset, null), 3, null);
            }
        }
    }
}
