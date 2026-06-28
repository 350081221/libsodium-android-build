package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import kotlin.i0;
import kotlin.r2;

@Stable
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&R\u0014\u0010\n\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/BasicTooltipState;", "", "Landroidx/compose/foundation/MutatePriority;", "mutatePriority", "Lkotlin/r2;", "show", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dismiss", "onDispose", "", "isVisible", "()Z", "isPersistent", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface BasicTooltipState {
    static /* synthetic */ Object show$default(BasicTooltipState basicTooltipState, MutatePriority mutatePriority, kotlin.coroutines.d dVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i5 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return basicTooltipState.show(mutatePriority, dVar);
    }

    void dismiss();

    boolean isPersistent();

    boolean isVisible();

    void onDispose();

    @p4.m
    Object show(@p4.l MutatePriority mutatePriority, @p4.l kotlin.coroutines.d<? super r2> dVar);
}
