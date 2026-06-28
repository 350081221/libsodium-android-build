package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0006\u001a\u00020\u00052\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/DisposableEffectScope;", "", "Lkotlin/Function0;", "Lkotlin/r2;", "onDisposeEffect", "Landroidx/compose/runtime/DisposableEffectResult;", "onDispose", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DisposableEffectScope {
    public static final int $stable = 0;

    @l
    public final DisposableEffectResult onDispose(@l final v3.a<r2> aVar) {
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.DisposableEffectScope$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                aVar.invoke();
            }
        };
    }
}
