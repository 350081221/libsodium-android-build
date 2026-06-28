package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemProviderImpl;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "", "index", "", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/r2;", "Item", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "getKey", "getContentType", "getIndex", "other", "", "equals", TTDownloadField.TT_HASHCODE, "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "intervalContent", "Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "itemScope", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "getItemScope", "()Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getItemCount", "()I", "itemCount", "", "getHeaderIndexes", "()Ljava/util/List;", "headerIndexes", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListIntervalContent;Landroidx/compose/foundation/lazy/LazyItemScopeImpl;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyListItemProviderImpl implements LazyListItemProvider {

    @l
    private final LazyListIntervalContent intervalContent;

    @l
    private final LazyItemScopeImpl itemScope;

    @l
    private final LazyLayoutKeyIndexMap keyIndexMap;

    @l
    private final LazyListState state;

    public LazyListItemProviderImpl(@l LazyListState lazyListState, @l LazyListIntervalContent lazyListIntervalContent, @l LazyItemScopeImpl lazyItemScopeImpl, @l LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = lazyListState;
        this.intervalContent = lazyListIntervalContent;
        this.itemScope = lazyItemScopeImpl;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(int i5, @l Object obj, @m Composer composer, int i6) {
        Composer startRestartGroup = composer.startRestartGroup(-462424778);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-462424778, i6, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i5, this.state.getPinnedItems$foundation_release(), ComposableLambdaKt.composableLambda(startRestartGroup, -824725566, true, new LazyListItemProviderImpl$Item$1(this, i5)), startRestartGroup, ((i6 << 3) & 112) | 3592);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyListItemProviderImpl$Item$2(this, i5, obj, i6));
        }
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyListItemProviderImpl)) {
            return false;
        }
        return l0.g(this.intervalContent, ((LazyListItemProviderImpl) obj).intervalContent);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @m
    public Object getContentType(int i5) {
        return this.intervalContent.getContentType(i5);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    @l
    public List<Integer> getHeaderIndexes() {
        return this.intervalContent.getHeaderIndexes();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(@l Object obj) {
        return getKeyIndexMap().getIndex(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    @l
    public LazyItemScopeImpl getItemScope() {
        return this.itemScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @l
    public Object getKey(int i5) {
        Object key = getKeyIndexMap().getKey(i5);
        return key == null ? this.intervalContent.getKey(i5) : key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    @l
    public LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.keyIndexMap;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
