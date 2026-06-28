package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "", "index", "", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/r2;", "Item", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "getKey", "getIndex", "other", "", "equals", TTDownloadField.TT_HASHCODE, "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/pager/PagerIntervalContent;", "intervalContent", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "Landroidx/compose/foundation/pager/PagerScopeImpl;", "pagerScopeImpl", "Landroidx/compose/foundation/pager/PagerScopeImpl;", "getItemCount", "()I", "itemCount", "<init>", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class PagerLazyLayoutItemProvider implements LazyLayoutItemProvider {
    public static final int $stable = 0;

    @l
    private final LazyLayoutIntervalContent<PagerIntervalContent> intervalContent;

    @l
    private final LazyLayoutKeyIndexMap keyIndexMap;

    @l
    private final PagerScopeImpl pagerScopeImpl = PagerScopeImpl.INSTANCE;

    @l
    private final PagerState state;

    public PagerLazyLayoutItemProvider(@l PagerState pagerState, @l LazyLayoutIntervalContent<PagerIntervalContent> lazyLayoutIntervalContent, @l LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = pagerState;
        this.intervalContent = lazyLayoutIntervalContent;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(int i5, @l Object obj, @m Composer composer, int i6) {
        Composer startRestartGroup = composer.startRestartGroup(-1201380429);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1201380429, i6, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:195)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i5, this.state.getPinnedPages$foundation_release(), ComposableLambdaKt.composableLambda(startRestartGroup, 1142237095, true, new PagerLazyLayoutItemProvider$Item$1(this, i5)), startRestartGroup, ((i6 << 3) & 112) | 3592);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PagerLazyLayoutItemProvider$Item$2(this, i5, obj, i6));
        }
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagerLazyLayoutItemProvider)) {
            return false;
        }
        return l0.g(this.intervalContent, ((PagerLazyLayoutItemProvider) obj).intervalContent);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(@l Object obj) {
        return this.keyIndexMap.getIndex(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @l
    public Object getKey(int i5) {
        Object key = this.keyIndexMap.getKey(i5);
        return key == null ? this.intervalContent.getKey(i5) : key;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
