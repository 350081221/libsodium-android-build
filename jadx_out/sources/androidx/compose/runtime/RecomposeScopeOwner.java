package androidx.compose.runtime;

import kotlin.i0;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeOwner;", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "Landroidx/compose/runtime/InvalidationResult;", "invalidate", "Lkotlin/r2;", "recomposeScopeReleased", b.f22420d, "recordReadOf", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface RecomposeScopeOwner {
    @l
    InvalidationResult invalidate(@l RecomposeScopeImpl recomposeScopeImpl, @m Object obj);

    void recomposeScopeReleased(@l RecomposeScopeImpl recomposeScopeImpl);

    void recordReadOf(@l Object obj);
}
