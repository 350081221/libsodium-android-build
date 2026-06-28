package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JC\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\bH¦@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/TransformableState;", "", "Landroidx/compose/foundation/MutatePriority;", "transformPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/TransformScope;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "Lkotlin/u;", "block", "transform", "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "isTransformInProgress", "()Z", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface TransformableState {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object transform$default(TransformableState transformableState, MutatePriority mutatePriority, p pVar, d dVar, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return transformableState.transform(mutatePriority, pVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
    }

    boolean isTransformInProgress();

    @m
    Object transform(@l MutatePriority mutatePriority, @l p<? super TransformScope, ? super d<? super r2>, ? extends Object> pVar, @l d<? super r2> dVar);
}
