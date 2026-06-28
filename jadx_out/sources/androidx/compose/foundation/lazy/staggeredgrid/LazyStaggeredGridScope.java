package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import kotlin.i0;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.m;
import v3.l;
import v3.q;
import v3.r;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JQ\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH&¢\u0006\u0004\b\f\u0010\rJ¿\u0001\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062%\b\u0002\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000621\u0010\u0014\u001a-\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\t¢\u0006\u0002\b\nH&¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0001\u0001\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", DatabaseFileArchive.COLUMN_KEY, "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "item", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;Lv3/q;)V", "", "count", "Lkotlin/v0;", "name", "index", "Lkotlin/Function2;", "itemContent", "items", "(ILv3/l;Lv3/l;Lv3/l;Lv3/r;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent;", "foundation_release"}, k = 1, mv = {1, 8, 0})
@LazyStaggeredGridScopeMarker
/* loaded from: classes.dex */
public interface LazyStaggeredGridScope {
    static /* synthetic */ void item$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, q qVar, int i5, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i5 & 1) != 0) {
            obj = null;
        }
        if ((i5 & 2) != 0) {
            obj2 = null;
        }
        if ((i5 & 4) != 0) {
            staggeredGridItemSpan = null;
        }
        lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, qVar);
    }

    static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, int i5, l lVar, l lVar2, l lVar3, r rVar, int i6, Object obj) {
        l lVar4;
        l lVar5;
        if (obj == null) {
            if ((i6 & 2) != 0) {
                lVar4 = null;
            } else {
                lVar4 = lVar;
            }
            if ((i6 & 4) != 0) {
                lVar2 = LazyStaggeredGridScope$items$1.INSTANCE;
            }
            l lVar6 = lVar2;
            if ((i6 & 8) != 0) {
                lVar5 = null;
            } else {
                lVar5 = lVar3;
            }
            lazyStaggeredGridScope.items(i5, lVar4, lVar6, lVar5, rVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    void item(@m Object obj, @m Object obj2, @m StaggeredGridItemSpan staggeredGridItemSpan, @p4.l q<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, r2> qVar);

    void items(int i5, @m l<? super Integer, ? extends Object> lVar, @p4.l l<? super Integer, ? extends Object> lVar2, @m l<? super Integer, StaggeredGridItemSpan> lVar3, @p4.l r<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, r2> rVar);
}
