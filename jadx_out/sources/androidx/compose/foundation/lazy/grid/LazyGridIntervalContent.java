package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;
import v3.q;
import v3.r;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 .2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001.B \u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b,\u0010-J\\\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0019\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0002\b\u000e¢\u0006\u0002\b\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011Jµ\u0001\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122#\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u001f\u0010\n\u001a\u001b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0018\u00010\u0017¢\u0006\u0002\b\t2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000621\u0010\u0018\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u000e¢\u0006\u0002\b\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006/"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/grid/LazyGridInterval;", "", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Lkotlin/u;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "item", "(Ljava/lang/Object;Lv3/l;Ljava/lang/Object;Lv3/q;)V", "", "count", "Lkotlin/v0;", "name", "index", "Lkotlin/Function2;", "itemContent", "items", "(ILv3/l;Lv3/p;Lv3/l;Lv3/r;)V", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "getSpanLayoutProvider$foundation_release", "()Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "", "hasCustomSpans", "Z", "getHasCustomSpans$foundation_release", "()Z", "setHasCustomSpans$foundation_release", "(Z)V", "<init>", "(Lv3/l;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyGridIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridIntervalContent.kt\nandroidx/compose/foundation/lazy/grid/LazyGridIntervalContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {
    private boolean hasCustomSpans;

    @l
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final p<LazyGridItemSpanScope, Integer, GridItemSpan> DefaultSpan = LazyGridIntervalContent$Companion$DefaultSpan$1.INSTANCE;

    @l
    private final LazyGridSpanLayoutProvider spanLayoutProvider = new LazyGridSpanLayoutProvider(this);

    @l
    private final MutableIntervalList<LazyGridInterval> intervals = new MutableIntervalList<>();

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent$Companion;", "", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Lkotlin/u;", "DefaultSpan", "Lv3/p;", "getDefaultSpan", "()Lv3/p;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final p<LazyGridItemSpanScope, Integer, GridItemSpan> getDefaultSpan() {
            return LazyGridIntervalContent.DefaultSpan;
        }
    }

    public LazyGridIntervalContent(@l v3.l<? super LazyGridScope, r2> lVar) {
        lVar.invoke(this);
    }

    public final boolean getHasCustomSpans$foundation_release() {
        return this.hasCustomSpans;
    }

    @l
    public final LazyGridSpanLayoutProvider getSpanLayoutProvider$foundation_release() {
        return this.spanLayoutProvider;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void item(@m Object obj, @m v3.l<? super LazyGridItemSpanScope, GridItemSpan> lVar, @m Object obj2, @l q<? super LazyGridItemScope, ? super Composer, ? super Integer, r2> qVar) {
        LazyGridIntervalContent$item$1$1 lazyGridIntervalContent$item$1$1;
        p pVar;
        ?? intervals = getIntervals();
        if (obj != null) {
            lazyGridIntervalContent$item$1$1 = new LazyGridIntervalContent$item$1$1(obj);
        } else {
            lazyGridIntervalContent$item$1$1 = null;
        }
        if (lVar != null) {
            pVar = new LazyGridIntervalContent$item$2$1(lVar);
        } else {
            pVar = DefaultSpan;
        }
        intervals.addInterval(1, new LazyGridInterval(lazyGridIntervalContent$item$1$1, pVar, new LazyGridIntervalContent$item$3(obj2), ComposableLambdaKt.composableLambdaInstance(-34608120, true, new LazyGridIntervalContent$item$4(qVar))));
        if (lVar != null) {
            this.hasCustomSpans = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.MutableIntervalList] */
    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int i5, @m v3.l<? super Integer, ? extends Object> lVar, @m p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> pVar, @l v3.l<? super Integer, ? extends Object> lVar2, @l r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, r2> rVar) {
        p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> pVar2;
        ?? intervals = getIntervals();
        if (pVar == null) {
            pVar2 = DefaultSpan;
        } else {
            pVar2 = pVar;
        }
        intervals.addInterval(i5, new LazyGridInterval(lVar, pVar2, lVar2, rVar));
        if (pVar != null) {
            this.hasCustomSpans = true;
        }
    }

    public final void setHasCustomSpans$foundation_release(boolean z4) {
        this.hasCustomSpans = z4;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @l
    public IntervalList<LazyGridInterval> getIntervals() {
        return this.intervals;
    }
}
