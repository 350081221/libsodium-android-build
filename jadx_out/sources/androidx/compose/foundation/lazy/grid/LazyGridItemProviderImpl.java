package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemProviderImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "", "index", "", "getKey", "getContentType", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/r2;", "Item", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "getIndex", "other", "", "equals", TTDownloadField.TT_HASHCODE, "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "intervalContent", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getItemCount", "()I", "itemCount", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "getSpanLayoutProvider", "()Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyGridItemProviderImpl implements LazyGridItemProvider {

    @l
    private final LazyGridIntervalContent intervalContent;

    @l
    private final LazyLayoutKeyIndexMap keyIndexMap;

    @l
    private final LazyGridState state;

    public LazyGridItemProviderImpl(@l LazyGridState lazyGridState, @l LazyGridIntervalContent lazyGridIntervalContent, @l LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = lazyGridState;
        this.intervalContent = lazyGridIntervalContent;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(int i5, @l Object obj, @m Composer composer, int i6) {
        Composer startRestartGroup = composer.startRestartGroup(1493551140);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1493551140, i6, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:74)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i5, this.state.getPinnedItems$foundation_release(), ComposableLambdaKt.composableLambda(startRestartGroup, 726189336, true, new LazyGridItemProviderImpl$Item$1(this, i5)), startRestartGroup, ((i6 << 3) & 112) | 3592);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyGridItemProviderImpl$Item$2(this, i5, obj, i6));
        }
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyGridItemProviderImpl)) {
            return false;
        }
        return l0.g(this.intervalContent, ((LazyGridItemProviderImpl) obj).intervalContent);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @m
    public Object getContentType(int i5) {
        return this.intervalContent.getContentType(i5);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(@l Object obj) {
        return getKeyIndexMap().getIndex(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @l
    public Object getKey(int i5) {
        Object key = getKeyIndexMap().getKey(i5);
        return key == null ? this.intervalContent.getKey(i5) : key;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    @l
    public LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.keyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    @l
    public LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.intervalContent.getSpanLayoutProvider$foundation_release();
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
