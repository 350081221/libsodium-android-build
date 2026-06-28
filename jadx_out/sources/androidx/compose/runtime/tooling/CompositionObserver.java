package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.RecomposeScope;
import java.util.Map;
import java.util.Set;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00060\u0004H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionObserver;", "", "Landroidx/compose/runtime/Composition;", "composition", "", "Landroidx/compose/runtime/RecomposeScope;", "", "invalidationMap", "Lkotlin/r2;", "onBeginComposition", "onEndComposition", "runtime_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalComposeRuntimeApi
/* loaded from: classes.dex */
public interface CompositionObserver {
    void onBeginComposition(@l Composition composition, @l Map<RecomposeScope, ? extends Set<? extends Object>> map);

    void onEndComposition(@l Composition composition);
}
