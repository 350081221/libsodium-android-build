package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B&\u0012\u001d\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR+\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlotCache;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "invoke-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "invoke", "Lkotlin/Function2;", "Lkotlin/u;", "calculation", "Lv3/p;", "cachedConstraints", "J", "", "cachedDensity", "F", "cachedSizes", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "<init>", "(Lv3/p;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class LazyStaggeredGridSlotCache implements LazyGridStaggeredGridSlotsProvider {
    private long cachedConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private float cachedDensity;

    @m
    private LazyStaggeredGridSlots cachedSizes;

    @l
    private final p<Density, Constraints, LazyStaggeredGridSlots> calculation;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridSlotCache(@l p<? super Density, ? super Constraints, LazyStaggeredGridSlots> pVar) {
        this.calculation = pVar;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider
    @l
    /* renamed from: invoke-0kLqBqw */
    public LazyStaggeredGridSlots mo738invoke0kLqBqw(@l Density density, long j5) {
        boolean z4;
        if (this.cachedSizes != null && Constraints.m5993equalsimpl0(this.cachedConstraints, j5)) {
            if (this.cachedDensity == density.getDensity()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                LazyStaggeredGridSlots lazyStaggeredGridSlots = this.cachedSizes;
                l0.m(lazyStaggeredGridSlots);
                return lazyStaggeredGridSlots;
            }
        }
        this.cachedConstraints = j5;
        this.cachedDensity = density.getDensity();
        LazyStaggeredGridSlots invoke = this.calculation.invoke(density, Constraints.m5988boximpl(j5));
        this.cachedSizes = invoke;
        return invoke;
    }
}
