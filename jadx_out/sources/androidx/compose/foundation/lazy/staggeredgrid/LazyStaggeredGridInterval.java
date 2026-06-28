package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.r;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u009a\u0001\u0012#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012#\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002\u0012#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002\u0012\"\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u001a\u0010\u001bR7\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR7\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR4\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000bR3\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "index", "", DatabaseFileArchive.COLUMN_KEY, "Lv3/l;", "getKey", "()Lv3/l;", "type", "getType", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "getSpan", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "item", "Lv3/r;", "getItem", "()Lv3/r;", "<init>", "(Lv3/l;Lv3/l;Lv3/l;Lv3/r;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyStaggeredGridInterval implements LazyLayoutIntervalContent.Interval {
    public static final int $stable = 0;

    @l
    private final r<LazyStaggeredGridItemScope, Integer, Composer, Integer, r2> item;

    @m
    private final v3.l<Integer, Object> key;

    @m
    private final v3.l<Integer, StaggeredGridItemSpan> span;

    @l
    private final v3.l<Integer, Object> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridInterval(@m v3.l<? super Integer, ? extends Object> lVar, @l v3.l<? super Integer, ? extends Object> lVar2, @m v3.l<? super Integer, StaggeredGridItemSpan> lVar3, @l r<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, r2> rVar) {
        this.key = lVar;
        this.type = lVar2;
        this.span = lVar3;
        this.item = rVar;
    }

    @l
    public final r<LazyStaggeredGridItemScope, Integer, Composer, Integer, r2> getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    @m
    public v3.l<Integer, Object> getKey() {
        return this.key;
    }

    @m
    public final v3.l<Integer, StaggeredGridItemSpan> getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    @l
    public v3.l<Integer, Object> getType() {
        return this.type;
    }
}
