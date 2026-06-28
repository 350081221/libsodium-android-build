package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import v3.r;

@kotlin.i0(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J=\u0010\r\u001a\u00020\u0003*\u00020\u00032/\u0010\f\u001a+\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0002\b\u000bH\u0016J\u001c\u0010\u0012\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R#\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"androidx/compose/material3/TabRowKt$TabRowImpl$1$scope$1$1", "Landroidx/compose/material3/TabIndicatorScope;", "Landroidx/compose/material3/TabPositionsHolder;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "", "Landroidx/compose/material3/TabPosition;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/u;", "measure", "tabIndicatorLayout", "", "selectedTabIndex", "", "matchContentSize", "tabIndicatorOffset", "positions", "Lkotlin/r2;", "setTabPositions", "Landroidx/compose/runtime/MutableState;", "tabPositions", "Landroidx/compose/runtime/MutableState;", "getTabPositions", "()Landroidx/compose/runtime/MutableState;", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TabRowKt$TabRowImpl$1$scope$1$1 implements TabIndicatorScope, TabPositionsHolder {

    @p4.l
    private final MutableState<List<TabPosition>> tabPositions;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TabRowKt$TabRowImpl$1$scope$1$1() {
        List E;
        MutableState<List<TabPosition>> mutableStateOf$default;
        E = kotlin.collections.w.E();
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(E, null, 2, null);
        this.tabPositions = mutableStateOf$default;
    }

    @p4.l
    public final MutableState<List<TabPosition>> getTabPositions() {
        return this.tabPositions;
    }

    @Override // androidx.compose.material3.TabPositionsHolder
    public void setTabPositions(@p4.l List<TabPosition> list) {
        this.tabPositions.setValue(list);
    }

    @Override // androidx.compose.material3.TabIndicatorScope
    @p4.l
    public Modifier tabIndicatorLayout(@p4.l Modifier modifier, @p4.l r<? super MeasureScope, ? super Measurable, ? super Constraints, ? super List<TabPosition>, ? extends MeasureResult> rVar) {
        return LayoutModifierKt.layout(modifier, new TabRowKt$TabRowImpl$1$scope$1$1$tabIndicatorLayout$1(rVar, this));
    }

    @Override // androidx.compose.material3.TabIndicatorScope
    @p4.l
    public Modifier tabIndicatorOffset(@p4.l Modifier modifier, int i5, boolean z4) {
        return modifier.then(new TabIndicatorModifier(this.tabPositions, i5, z4));
    }
}
