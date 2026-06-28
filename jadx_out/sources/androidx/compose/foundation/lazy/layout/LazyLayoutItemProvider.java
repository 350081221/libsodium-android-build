package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import kotlin.i0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0016R\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "", "", "index", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/r2;", "Item", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "getContentType", "getKey", "getIndex", "getItemCount", "()I", "itemCount", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyLayoutItemProvider {
    @Composable
    void Item(int i5, @l Object obj, @m Composer composer, int i6);

    @m
    default Object getContentType(int i5) {
        return null;
    }

    default int getIndex(@l Object obj) {
        return -1;
    }

    int getItemCount();

    @l
    default Object getKey(int i5) {
        return Lazy_androidKt.getDefaultLazyLayoutKey(i5);
    }
}
