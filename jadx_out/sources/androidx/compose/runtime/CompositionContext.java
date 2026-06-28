package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import java.util.Set;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\bR\u0010)J*\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H ¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH ¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0018\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010!\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b \u0010\fJ\u0017\u0010#\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b\"\u0010\fJ\u000f\u0010'\u001a\u00020$H\u0010¢\u0006\u0004\b%\u0010&J\u000f\u0010*\u001a\u00020\u0005H\u0010¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\u0005H\u0010¢\u0006\u0004\b+\u0010)J\u0017\u00101\u001a\u00020\u00052\u0006\u0010.\u001a\u00020-H ¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00052\u0006\u0010.\u001a\u00020-H ¢\u0006\u0004\b2\u00100J\u001f\u00108\u001a\u00020\u00052\u0006\u0010.\u001a\u00020-2\u0006\u00105\u001a\u000204H ¢\u0006\u0004\b6\u00107J\u0019\u0010;\u001a\u0004\u0018\u0001042\u0006\u0010.\u001a\u00020-H\u0010¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H ¢\u0006\u0004\b<\u0010\fR\u0014\u0010A\u001a\u00020>8 X \u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8 X \u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020B8 X \u0004¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0016\u0010K\u001a\u0004\u0018\u00010H8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020L8 X \u0004¢\u0006\u0006\u001a\u0004\bP\u0010N¨\u0006S"}, d2 = {"Landroidx/compose/runtime/CompositionContext;", "", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lv3/p;)V", "composeInitial", "invalidate$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "invalidate", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "invalidateScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidateScope", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "Landroidx/compose/runtime/Composer;", "composer", "registerComposer$runtime_release", "(Landroidx/compose/runtime/Composer;)V", "registerComposer", "unregisterComposer$runtime_release", "unregisterComposer", "registerComposition$runtime_release", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime_release", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope", "startComposing$runtime_release", "()V", "startComposing", "doneComposing$runtime_release", "doneComposing", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "data", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V", "movableContentStateReleased", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "reportRemovedComposition$runtime_release", "reportRemovedComposition", "", "getCompoundHashKey$runtime_release", "()I", "compoundHashKey", "", "getCollectingParameterInformation$runtime_release", "()Z", "collectingParameterInformation", "getCollectingSourceInformation$runtime_release", "collectingSourceInformation", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Lkotlin/coroutines/g;", "getEffectCoroutineContext", "()Lkotlin/coroutines/g;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "recomposeCoroutineContext", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class CompositionContext {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime_release(@l ControlledComposition controlledComposition, @l p<? super Composer, ? super Integer, r2> pVar);

    public abstract void deletedMovableContent$runtime_release(@l MovableContentStateReference movableContentStateReference);

    public void doneComposing$runtime_release() {
    }

    public abstract boolean getCollectingParameterInformation$runtime_release();

    public abstract boolean getCollectingSourceInformation$runtime_release();

    @l
    public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
        return CompositionContextKt.access$getEmptyPersistentCompositionLocalMap$p();
    }

    public abstract int getCompoundHashKey$runtime_release();

    @l
    public abstract g getEffectCoroutineContext();

    @m
    public CompositionObserverHolder getObserverHolder$runtime_release() {
        return null;
    }

    @l
    public abstract g getRecomposeCoroutineContext$runtime_release();

    public abstract void insertMovableContent$runtime_release(@l MovableContentStateReference movableContentStateReference);

    public abstract void invalidate$runtime_release(@l ControlledComposition controlledComposition);

    public abstract void invalidateScope$runtime_release(@l RecomposeScopeImpl recomposeScopeImpl);

    public abstract void movableContentStateReleased$runtime_release(@l MovableContentStateReference movableContentStateReference, @l MovableContentState movableContentState);

    @m
    public MovableContentState movableContentStateResolve$runtime_release(@l MovableContentStateReference movableContentStateReference) {
        return null;
    }

    public void recordInspectionTable$runtime_release(@l Set<CompositionData> set) {
    }

    public void registerComposer$runtime_release(@l Composer composer) {
    }

    public abstract void registerComposition$runtime_release(@l ControlledComposition controlledComposition);

    public abstract void reportRemovedComposition$runtime_release(@l ControlledComposition controlledComposition);

    public void startComposing$runtime_release() {
    }

    public void unregisterComposer$runtime_release(@l Composer composer) {
    }

    public abstract void unregisterComposition$runtime_release(@l ControlledComposition controlledComposition);
}
