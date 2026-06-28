package androidx.compose.runtime;

import com.umeng.analytics.pro.d;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.p;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/HotReloader;", "", "()V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class HotReloader {

    @l
    public static final Companion Companion = new Companion(null);

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0002J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/HotReloader$Companion;", "", d.X, "saveStateAndDispose", "token", "Lkotlin/r2;", "loadStateAndCompose", "simulateHotReload$runtime_release", "(Ljava/lang/Object;)V", "simulateHotReload", "", DatabaseFileArchive.COLUMN_KEY, "invalidateGroupsWithKey$runtime_release", "(I)V", "invalidateGroupsWithKey", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime_release", "()Ljava/util/List;", "getCurrentErrors", "clearErrors$runtime_release", "()V", "clearErrors", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        private final void loadStateAndCompose(Object obj) {
            Recomposer.Companion.loadStateAndComposeForHotReload$runtime_release(obj);
        }

        private final Object saveStateAndDispose(Object obj) {
            return Recomposer.Companion.saveStateAndDisposeForHotReload$runtime_release();
        }

        @p
        public final void clearErrors$runtime_release() {
            Recomposer.Companion.clearErrors$runtime_release();
        }

        @l
        @p
        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            return Recomposer.Companion.getCurrentErrors$runtime_release();
        }

        @p
        public final void invalidateGroupsWithKey$runtime_release(int i5) {
            Recomposer.Companion.invalidateGroupsWithKey$runtime_release(i5);
        }

        @p
        public final void simulateHotReload$runtime_release(@l Object obj) {
            loadStateAndCompose(saveStateAndDispose(obj));
        }
    }
}
