package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ@\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&J*\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "measureScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "defaultMainAxisSpacing", "", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;I)V", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "createItem", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "index", DatabaseFileArchive.COLUMN_KEY, "contentType", "crossAxisSize", "mainAxisSpacing", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "getAndMeasure", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getAndMeasure-3p2s80s", "(IIJ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridMeasuredItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
/* loaded from: classes.dex */
public abstract class LazyGridMeasuredItemProvider {
    public static final int $stable = 0;
    private final int defaultMainAxisSpacing;

    @l
    private final LazyGridItemProvider itemProvider;

    @l
    private final LazyLayoutMeasureScope measureScope;

    @ExperimentalFoundationApi
    public LazyGridMeasuredItemProvider(@l LazyGridItemProvider lazyGridItemProvider, @l LazyLayoutMeasureScope lazyLayoutMeasureScope, int i5) {
        this.itemProvider = lazyGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.defaultMainAxisSpacing = i5;
    }

    /* renamed from: getAndMeasure-3p2s80s$default, reason: not valid java name */
    public static /* synthetic */ LazyGridMeasuredItem m694getAndMeasure3p2s80s$default(LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i5, int i6, long j5, int i7, Object obj) {
        if (obj == null) {
            if ((i7 & 2) != 0) {
                i6 = lazyGridMeasuredItemProvider.defaultMainAxisSpacing;
            }
            return lazyGridMeasuredItemProvider.m695getAndMeasure3p2s80s(i5, i6, j5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-3p2s80s");
    }

    @l
    public abstract LazyGridMeasuredItem createItem(int i5, @l Object obj, @m Object obj2, int i6, int i7, @l List<? extends Placeable> list);

    @l
    /* renamed from: getAndMeasure-3p2s80s, reason: not valid java name */
    public final LazyGridMeasuredItem m695getAndMeasure3p2s80s(int i5, int i6, long j5) {
        int m6001getMinHeightimpl;
        Object key = this.itemProvider.getKey(i5);
        Object contentType = this.itemProvider.getContentType(i5);
        List<Placeable> mo717measure0kLqBqw = this.measureScope.mo717measure0kLqBqw(i5, j5);
        if (Constraints.m5998getHasFixedWidthimpl(j5)) {
            m6001getMinHeightimpl = Constraints.m6002getMinWidthimpl(j5);
        } else if (Constraints.m5997getHasFixedHeightimpl(j5)) {
            m6001getMinHeightimpl = Constraints.m6001getMinHeightimpl(j5);
        } else {
            throw new IllegalArgumentException("does not have fixed height".toString());
        }
        return createItem(i5, key, contentType, m6001getMinHeightimpl, i6, mo717measure0kLqBqw);
    }

    @l
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
