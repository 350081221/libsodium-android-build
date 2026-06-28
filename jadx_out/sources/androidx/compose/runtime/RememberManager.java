package androidx.compose.runtime;

import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/RememberManager;", "", "Landroidx/compose/runtime/RememberObserver;", "instance", "Lkotlin/r2;", "remembering", "forgetting", "Lkotlin/Function0;", "effect", "sideEffect", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "deactivating", "releasing", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface RememberManager {
    void deactivating(@l ComposeNodeLifecycleCallback composeNodeLifecycleCallback);

    void forgetting(@l RememberObserver rememberObserver);

    void releasing(@l ComposeNodeLifecycleCallback composeNodeLifecycleCallback);

    void remembering(@l RememberObserver rememberObserver);

    void sideEffect(@l v3.a<r2> aVar);
}
