package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.q;
import v3.r;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B \u0012\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0002\b\u0011¢\u0006\u0004\b%\u0010&J\u0094\u0001\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062#\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000621\u0010\u0012\u001a-\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0016\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u0018\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0017¢\u0006\u0004\b\u0018\u0010\u0017R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/LazyListInterval;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "count", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "index", "", DatabaseFileArchive.COLUMN_KEY, "contentType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "itemContent", "items", "(ILv3/l;Lv3/l;Lv3/r;)V", "content", "item", "(Ljava/lang/Object;Ljava/lang/Object;Lv3/q;)V", "stickyHeader", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "", "_headerIndexes", "Ljava/util/List;", "", "getHeaderIndexes", "()Ljava/util/List;", "headerIndexes", "<init>", "(Lv3/l;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<LazyListInterval> implements LazyListScope {
    public static final int $stable = 8;

    @m
    private List<Integer> _headerIndexes;

    @l
    private final MutableIntervalList<LazyListInterval> intervals = new MutableIntervalList<>();

    public LazyListIntervalContent(@l v3.l<? super LazyListScope, r2> lVar) {
        lVar.invoke(this);
    }

    @l
    public final List<Integer> getHeaderIndexes() {
        List<Integer> E;
        List<Integer> list = this._headerIndexes;
        if (list != null) {
            return list;
        }
        E = w.E();
        return E;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(@m Object obj, @m Object obj2, @l q<? super LazyItemScope, ? super Composer, ? super Integer, r2> qVar) {
        LazyListIntervalContent$item$1 lazyListIntervalContent$item$1;
        ?? intervals = getIntervals();
        if (obj != null) {
            lazyListIntervalContent$item$1 = new LazyListIntervalContent$item$1(obj);
        } else {
            lazyListIntervalContent$item$1 = null;
        }
        intervals.addInterval(1, new LazyListInterval(lazyListIntervalContent$item$1, new LazyListIntervalContent$item$2(obj2), ComposableLambdaKt.composableLambdaInstance(-1010194746, true, new LazyListIntervalContent$item$3(qVar))));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int i5, @m v3.l<? super Integer, ? extends Object> lVar, @l v3.l<? super Integer, ? extends Object> lVar2, @l r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, r2> rVar) {
        getIntervals().addInterval(i5, new LazyListInterval(lVar, lVar2, rVar));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @ExperimentalFoundationApi
    public void stickyHeader(@m Object obj, @m Object obj2, @l q<? super LazyItemScope, ? super Composer, ? super Integer, r2> qVar) {
        List list = this._headerIndexes;
        if (list == null) {
            list = new ArrayList();
            this._headerIndexes = list;
        }
        list.add(Integer.valueOf(getIntervals().getSize()));
        item(obj, obj2, qVar);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @l
    public IntervalList<LazyListInterval> getIntervals() {
        return this.intervals;
    }
}
