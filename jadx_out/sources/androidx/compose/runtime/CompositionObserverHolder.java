package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionObserver;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/CompositionObserverHolder;", "", "observer", "Landroidx/compose/runtime/tooling/CompositionObserver;", "root", "", "(Landroidx/compose/runtime/tooling/CompositionObserver;Z)V", "getObserver", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "setObserver", "(Landroidx/compose/runtime/tooling/CompositionObserver;)V", "getRoot", "()Z", "setRoot", "(Z)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalComposeRuntimeApi
/* loaded from: classes.dex */
public final class CompositionObserverHolder {
    public static final int $stable = 8;

    @m
    private CompositionObserver observer;
    private boolean root;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositionObserverHolder() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public CompositionObserverHolder(@m CompositionObserver compositionObserver, boolean z4) {
        this.observer = compositionObserver;
        this.root = z4;
    }

    @m
    public final CompositionObserver getObserver() {
        return this.observer;
    }

    public final boolean getRoot() {
        return this.root;
    }

    public final void setObserver(@m CompositionObserver compositionObserver) {
        this.observer = compositionObserver;
    }

    public final void setRoot(boolean z4) {
        this.root = z4;
    }

    public /* synthetic */ CompositionObserverHolder(CompositionObserver compositionObserver, boolean z4, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : compositionObserver, (i5 & 2) != 0 ? false : z4);
    }
}
