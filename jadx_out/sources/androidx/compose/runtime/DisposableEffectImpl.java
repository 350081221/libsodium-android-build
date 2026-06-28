package androidx.compose.runtime;

import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R%\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/DisposableEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/r2;", "onRemembered", "onForgotten", "onAbandoned", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/u;", "effect", "Lv3/l;", "onDispose", "Landroidx/compose/runtime/DisposableEffectResult;", "<init>", "(Lv3/l;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DisposableEffectImpl implements RememberObserver {

    @l
    private final v3.l<DisposableEffectScope, DisposableEffectResult> effect;

    @m
    private DisposableEffectResult onDispose;

    /* JADX WARN: Multi-variable type inference failed */
    public DisposableEffectImpl(@l v3.l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar) {
        this.effect = lVar;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        DisposableEffectResult disposableEffectResult = this.onDispose;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.onDispose = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        DisposableEffectScope disposableEffectScope;
        v3.l<DisposableEffectScope, DisposableEffectResult> lVar = this.effect;
        disposableEffectScope = EffectsKt.InternalDisposableEffectScope;
        this.onDispose = lVar.invoke(disposableEffectScope);
    }
}
