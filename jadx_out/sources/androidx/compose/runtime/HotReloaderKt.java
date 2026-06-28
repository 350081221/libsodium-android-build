package androidx.compose.runtime;

import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.u0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.p;

@i0(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u001e\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b0\u0007H\u0007\u001a\b\u0010\r\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"", d.X, "Lkotlin/r2;", "simulateHotReload", "", DatabaseFileArchive.COLUMN_KEY, "invalidateGroupsWithKey", "", "Lkotlin/u0;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "currentCompositionErrors", "clearCompositionErrors", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nHotReloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1549#2:91\n1620#2,3:92\n*S KotlinDebug\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n*L\n83#1:91\n83#1:92,3\n*E\n"})
/* loaded from: classes.dex */
public final class HotReloaderKt {
    @p
    public static final void clearCompositionErrors() {
        HotReloader.Companion.clearErrors$runtime_release();
    }

    @l
    @p
    public static final List<u0<Exception, Boolean>> currentCompositionErrors() {
        int Y;
        List<RecomposerErrorInfo> currentErrors$runtime_release = HotReloader.Companion.getCurrentErrors$runtime_release();
        Y = x.Y(currentErrors$runtime_release, 10);
        ArrayList arrayList = new ArrayList(Y);
        for (RecomposerErrorInfo recomposerErrorInfo : currentErrors$runtime_release) {
            arrayList.add(q1.a(recomposerErrorInfo.getCause(), Boolean.valueOf(recomposerErrorInfo.getRecoverable())));
        }
        return arrayList;
    }

    @p
    public static final void invalidateGroupsWithKey(int i5) {
        HotReloader.Companion.invalidateGroupsWithKey$runtime_release(i5);
    }

    @p
    public static final void simulateHotReload(@l Object obj) {
        HotReloader.Companion.simulateHotReload$runtime_release(obj);
    }
}
