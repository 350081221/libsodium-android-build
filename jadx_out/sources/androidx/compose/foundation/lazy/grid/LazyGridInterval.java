package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;
import v3.r;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0094\u0001\u0012#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f\u0012#\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002\u0012\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\f¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u001d\u0010\u001eR7\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR.\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R7\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000bR3\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\f¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridInterval;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "index", "", DatabaseFileArchive.COLUMN_KEY, "Lv3/l;", "getKey", "()Lv3/l;", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Lkotlin/u;", "span", "Lv3/p;", "getSpan", "()Lv3/p;", "type", "getType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "item", "Lv3/r;", "getItem", "()Lv3/r;", "<init>", "(Lv3/l;Lv3/p;Lv3/l;Lv3/r;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyGridInterval implements LazyLayoutIntervalContent.Interval {
    public static final int $stable = 0;

    @l
    private final r<LazyGridItemScope, Integer, Composer, Integer, r2> item;

    @m
    private final v3.l<Integer, Object> key;

    @l
    private final p<LazyGridItemSpanScope, Integer, GridItemSpan> span;

    @l
    private final v3.l<Integer, Object> type;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridInterval(@m v3.l<? super Integer, ? extends Object> lVar, @l p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> pVar, @l v3.l<? super Integer, ? extends Object> lVar2, @l r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, r2> rVar) {
        this.key = lVar;
        this.span = pVar;
        this.type = lVar2;
        this.item = rVar;
    }

    @l
    public final r<LazyGridItemScope, Integer, Composer, Integer, r2> getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    @m
    public v3.l<Integer, Object> getKey() {
        return this.key;
    }

    @l
    public final p<LazyGridItemSpanScope, Integer, GridItemSpan> getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    @l
    public v3.l<Integer, Object> getType() {
        return this.type;
    }
}
