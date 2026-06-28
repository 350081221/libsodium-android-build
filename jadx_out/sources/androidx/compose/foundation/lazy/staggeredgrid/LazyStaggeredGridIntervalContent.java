package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.q;
import v3.r;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B \u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\r¢\u0006\u0004\b$\u0010%JK\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J¹\u0001\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112#\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2#\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t2#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t21\u0010\u0017\u001a-\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "", DatabaseFileArchive.COLUMN_KEY, "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "item", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;Lv3/q;)V", "", "count", "Lkotlin/v0;", "name", "index", "Lkotlin/Function2;", "itemContent", "items", "(ILv3/l;Lv3/l;Lv3/l;Lv3/r;)V", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "spanProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getSpanProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "<init>", "(Lv3/l;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyStaggeredGridIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridIntervalContent.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridIntervalContent extends LazyLayoutIntervalContent<LazyStaggeredGridInterval> implements LazyStaggeredGridScope {
    public static final int $stable = 8;

    @l
    private final MutableIntervalList<LazyStaggeredGridInterval> intervals = new MutableIntervalList<>();

    @l
    private final LazyStaggeredGridSpanProvider spanProvider = new LazyStaggeredGridSpanProvider(getIntervals());

    public LazyStaggeredGridIntervalContent(@l v3.l<? super LazyStaggeredGridScope, r2> lVar) {
        lVar.invoke(this);
    }

    @l
    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void item(@m Object obj, @m Object obj2, @m StaggeredGridItemSpan staggeredGridItemSpan, @l q<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, r2> qVar) {
        LazyStaggeredGridIntervalContent$item$1$1 lazyStaggeredGridIntervalContent$item$1$1;
        LazyStaggeredGridIntervalContent$item$3$1 lazyStaggeredGridIntervalContent$item$3$1;
        if (obj != null) {
            lazyStaggeredGridIntervalContent$item$1$1 = new LazyStaggeredGridIntervalContent$item$1$1(obj);
        } else {
            lazyStaggeredGridIntervalContent$item$1$1 = null;
        }
        LazyStaggeredGridIntervalContent$item$2 lazyStaggeredGridIntervalContent$item$2 = new LazyStaggeredGridIntervalContent$item$2(obj2);
        if (staggeredGridItemSpan != null) {
            lazyStaggeredGridIntervalContent$item$3$1 = new LazyStaggeredGridIntervalContent$item$3$1(staggeredGridItemSpan);
        } else {
            lazyStaggeredGridIntervalContent$item$3$1 = null;
        }
        items(1, lazyStaggeredGridIntervalContent$item$1$1, lazyStaggeredGridIntervalContent$item$2, lazyStaggeredGridIntervalContent$item$3$1, ComposableLambdaKt.composableLambdaInstance(657818596, true, new LazyStaggeredGridIntervalContent$item$4(qVar)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void items(int i5, @m v3.l<? super Integer, ? extends Object> lVar, @l v3.l<? super Integer, ? extends Object> lVar2, @m v3.l<? super Integer, StaggeredGridItemSpan> lVar3, @l r<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, r2> rVar) {
        getIntervals().addInterval(i5, new LazyStaggeredGridInterval(lVar, lVar2, lVar3, rVar));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @l
    public IntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }
}
