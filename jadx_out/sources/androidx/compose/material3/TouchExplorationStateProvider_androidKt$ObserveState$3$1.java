package androidx.compose.material3;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTouchExplorationStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,108:1\n64#2,5:109\n*S KotlinDebug\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$3$1\n*L\n72#1:109,5\n*E\n"})
/* loaded from: classes.dex */
final class TouchExplorationStateProvider_androidKt$ObserveState$3$1 extends kotlin.jvm.internal.n0 implements v3.l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ v3.l<Lifecycle.Event, r2> $handleEvent;
    final /* synthetic */ v3.a<r2> $onDispose;
    final /* synthetic */ Lifecycle $this_ObserveState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TouchExplorationStateProvider_androidKt$ObserveState$3$1(Lifecycle lifecycle, v3.l<? super Lifecycle.Event, r2> lVar, v3.a<r2> aVar) {
        super(1);
        this.$this_ObserveState = lifecycle;
        this.$handleEvent = lVar;
        this.$onDispose = aVar;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        final v3.l<Lifecycle.Event, r2> lVar = this.$handleEvent;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.compose.material3.o0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                v3.l.this.invoke(event);
            }
        };
        this.$this_ObserveState.addObserver(lifecycleEventObserver);
        final v3.a<r2> aVar = this.$onDispose;
        final Lifecycle lifecycle = this.$this_ObserveState;
        return new DisposableEffectResult() { // from class: androidx.compose.material3.TouchExplorationStateProvider_androidKt$ObserveState$3$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                v3.a.this.invoke();
                lifecycle.removeObserver(lifecycleEventObserver);
            }
        };
    }
}
