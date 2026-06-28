package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import kotlin.i0;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.r;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bg\u00121\u0010\f\u001a-\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b\u0012#\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b \u0010!RB\u0010\f\u001a-\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR4\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Landroidx/compose/foundation/pager/PagerLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/pager/PagerIntervalContent;", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "", "Lkotlin/v0;", "name", "page", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "pageContent", "Lv3/r;", "getPageContent", "()Lv3/r;", "Lkotlin/Function1;", "index", "", DatabaseFileArchive.COLUMN_KEY, "Lv3/l;", "getKey", "()Lv3/l;", "pageCount", "I", "getPageCount", "()I", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "<init>", "(Lv3/r;Lv3/l;I)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class PagerLayoutIntervalContent extends LazyLayoutIntervalContent<PagerIntervalContent> {

    @l
    private final IntervalList<PagerIntervalContent> intervals;

    @m
    private final v3.l<Integer, Object> key;

    @l
    private final r<PagerScope, Integer, Composer, Integer, r2> pageContent;
    private final int pageCount;

    /* JADX WARN: Multi-variable type inference failed */
    public PagerLayoutIntervalContent(@l r<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, r2> rVar, @m v3.l<? super Integer, ? extends Object> lVar, int i5) {
        this.pageContent = rVar;
        this.key = lVar;
        this.pageCount = i5;
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        mutableIntervalList.addInterval(i5, new PagerIntervalContent(lVar, rVar));
        this.intervals = mutableIntervalList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @l
    public IntervalList<PagerIntervalContent> getIntervals() {
        return this.intervals;
    }

    @m
    public final v3.l<Integer, Object> getKey() {
        return this.key;
    }

    @l
    public final r<PagerScope, Integer, Composer, Integer, r2> getPageContent() {
        return this.pageContent;
    }

    public final int getPageCount() {
        return this.pageCount;
    }
}
