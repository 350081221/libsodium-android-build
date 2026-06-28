package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import kotlin.i0;
import kotlin.k;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.q;
import v3.r;

@LazyScopeMarker
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001JE\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0017¢\u0006\u0004\b\n\u0010\fJ\u0098\u0001\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042%\b\u0002\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000421\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015Jq\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000421\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0017¢\u0006\u0004\b\u0014\u0010\u0016JE\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH'¢\u0006\u0004\b\u0017\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", DatabaseFileArchive.COLUMN_KEY, "contentType", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "item", "(Ljava/lang/Object;Ljava/lang/Object;Lv3/q;)V", "(Ljava/lang/Object;Lv3/q;)V", "", "count", "Lkotlin/v0;", "name", "index", "Lkotlin/Function2;", "itemContent", "items", "(ILv3/l;Lv3/l;Lv3/r;)V", "(ILv3/l;Lv3/r;)V", "stickyHeader", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface LazyListScope {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void item(@l LazyListScope lazyListScope, @m Object obj, @m Object obj2, @l q<? super LazyItemScope, ? super Composer, ? super Integer, r2> qVar) {
            LazyListScope.super.item(obj, obj2, qVar);
        }

        @Deprecated
        public static void items(@l LazyListScope lazyListScope, int i5, @m v3.l<? super Integer, ? extends Object> lVar, @l v3.l<? super Integer, ? extends Object> lVar2, @l r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, r2> rVar) {
            LazyListScope.super.items(i5, lVar, lVar2, rVar);
        }
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Object obj2, q qVar, int i5, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i5 & 1) != 0) {
            obj = null;
        }
        if ((i5 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.item(obj, obj2, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i5, v3.l lVar, v3.l lVar2, r rVar, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i6 & 2) != 0) {
            lVar = null;
        }
        if ((i6 & 4) != 0) {
            lVar2 = LazyListScope$items$1.INSTANCE;
        }
        lazyListScope.items(i5, lVar, lVar2, rVar);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, q qVar, int i5, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i5 & 1) != 0) {
            obj = null;
        }
        if ((i5 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, qVar);
    }

    default void item(@m Object obj, @m Object obj2, @l q<? super LazyItemScope, ? super Composer, ? super Integer, r2> qVar) {
        throw new IllegalStateException("The method is not implemented".toString());
    }

    default void items(int i5, @m v3.l<? super Integer, ? extends Object> lVar, @l v3.l<? super Integer, ? extends Object> lVar2, @l r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, r2> rVar) {
        throw new IllegalStateException("The method is not implemented".toString());
    }

    @ExperimentalFoundationApi
    void stickyHeader(@m Object obj, @m Object obj2, @l q<? super LazyItemScope, ? super Composer, ? super Integer, r2> qVar);

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, q qVar, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i5 & 1) != 0) {
            obj = null;
        }
        lazyListScope.item(obj, qVar);
    }

    @k(level = kotlin.m.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ default void item(Object obj, q qVar) {
        item(obj, null, qVar);
    }

    @k(level = kotlin.m.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ default void items(int i5, v3.l lVar, r rVar) {
        items(i5, lVar, LazyListScope$items$2.INSTANCE, rVar);
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i5, v3.l lVar, r rVar, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i6 & 2) != 0) {
            lVar = null;
        }
        lazyListScope.items(i5, lVar, rVar);
    }
}
