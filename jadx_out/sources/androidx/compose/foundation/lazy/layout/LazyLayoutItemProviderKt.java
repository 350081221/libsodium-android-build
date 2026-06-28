package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0001¨\u0006\u0006"}, d2 = {"findIndexByKey", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", DatabaseFileArchive.COLUMN_KEY, "", "lastKnownIndex", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutItemProviderKt {
    @ExperimentalFoundationApi
    public static final int findIndexByKey(@l LazyLayoutItemProvider lazyLayoutItemProvider, @m Object obj, int i5) {
        if (obj != null && lazyLayoutItemProvider.getItemCount() != 0) {
            if (i5 < lazyLayoutItemProvider.getItemCount() && l0.g(obj, lazyLayoutItemProvider.getKey(i5))) {
                return i5;
            }
            int index = lazyLayoutItemProvider.getIndex(obj);
            if (index != -1) {
                return index;
            }
        }
        return i5;
    }
}
