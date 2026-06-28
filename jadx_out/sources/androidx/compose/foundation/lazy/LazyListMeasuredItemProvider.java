package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J0\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "", "", "index", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "getAndMeasure", DatabaseFileArchive.COLUMN_KEY, "contentType", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "createItem", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "childConstraints", "J", "getChildConstraints-msEJaDk", "()J", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "constraints", "", "isVertical", "<init>", "(JZLandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class LazyListMeasuredItemProvider {
    public static final int $stable = 0;
    private final long childConstraints;

    @l
    private final LazyListItemProvider itemProvider;

    @l
    private final LazyLayoutMeasureScope measureScope;

    private LazyListMeasuredItemProvider(long j5, boolean z4, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope) {
        int i5;
        int i6;
        this.itemProvider = lazyListItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        if (z4) {
            i5 = Constraints.m6000getMaxWidthimpl(j5);
        } else {
            i5 = Integer.MAX_VALUE;
        }
        if (!z4) {
            i6 = Constraints.m5999getMaxHeightimpl(j5);
        } else {
            i6 = Integer.MAX_VALUE;
        }
        this.childConstraints = ConstraintsKt.Constraints$default(0, i5, 0, i6, 5, null);
    }

    @ExperimentalFoundationApi
    public /* synthetic */ LazyListMeasuredItemProvider(long j5, boolean z4, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, w wVar) {
        this(j5, z4, lazyListItemProvider, lazyLayoutMeasureScope);
    }

    @l
    public abstract LazyListMeasuredItem createItem(int i5, @l Object obj, @m Object obj2, @l List<? extends Placeable> list);

    @l
    public final LazyListMeasuredItem getAndMeasure(int i5) {
        return createItem(i5, this.itemProvider.getKey(i5), this.itemProvider.getContentType(i5), this.measureScope.mo717measure0kLqBqw(i5, this.childConstraints));
    }

    /* renamed from: getChildConstraints-msEJaDk, reason: not valid java name */
    public final long m666getChildConstraintsmsEJaDk() {
        return this.childConstraints;
    }

    @l
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
