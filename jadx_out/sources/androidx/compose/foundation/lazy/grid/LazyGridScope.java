package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import kotlin.i0;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.m;
import v3.l;
import v3.p;
import v3.q;
import v3.r;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001Jb\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\r\u0010\u000eJÊ\u0001\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000320\b\u0002\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014¢\u0006\u0002\b\u00062%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000321\u0010\u0015\u001a-\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n0\u0014¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0001\u0001\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Lkotlin/u;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "item", "(Ljava/lang/Object;Lv3/l;Ljava/lang/Object;Lv3/q;)V", "", "count", "Lkotlin/v0;", "name", "index", "Lkotlin/Function2;", "itemContent", "items", "(ILv3/l;Lv3/p;Lv3/l;Lv3/r;)V", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "foundation_release"}, k = 1, mv = {1, 8, 0})
@LazyGridScopeMarker
/* loaded from: classes.dex */
public interface LazyGridScope {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void item$default(LazyGridScope lazyGridScope, Object obj, l lVar, Object obj2, q qVar, int i5, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i5 & 1) != 0) {
            obj = null;
        }
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        if ((i5 & 4) != 0) {
            obj2 = null;
        }
        lazyGridScope.item(obj, lVar, obj2, qVar);
    }

    static /* synthetic */ void items$default(LazyGridScope lazyGridScope, int i5, l lVar, p pVar, l lVar2, r rVar, int i6, Object obj) {
        l lVar3;
        p pVar2;
        if (obj == null) {
            if ((i6 & 2) != 0) {
                lVar3 = null;
            } else {
                lVar3 = lVar;
            }
            if ((i6 & 4) != 0) {
                pVar2 = null;
            } else {
                pVar2 = pVar;
            }
            if ((i6 & 8) != 0) {
                lVar2 = LazyGridScope$items$1.INSTANCE;
            }
            lazyGridScope.items(i5, lVar3, pVar2, lVar2, rVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    void item(@m Object obj, @m l<? super LazyGridItemSpanScope, GridItemSpan> lVar, @m Object obj2, @p4.l q<? super LazyGridItemScope, ? super Composer, ? super Integer, r2> qVar);

    void items(int i5, @m l<? super Integer, ? extends Object> lVar, @m p<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> pVar, @p4.l l<? super Integer, ? extends Object> lVar2, @p4.l r<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, r2> rVar);
}
